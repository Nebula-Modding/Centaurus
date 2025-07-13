package org.nebulamodding.centaurus.events;

import org.nebulamodding.centaurus.registry.CTags;
import org.nebulamodding.centaurus.registry.block.CBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.neoforge.event.level.BlockEvent;

import static net.minecraft.core.component.DataComponents.POTION_CONTENTS;
import static net.neoforged.neoforge.common.NeoForge.EVENT_BUS;

public class CEvents {
    public static void gatherEvents(IEventBus bus) {
        bus.addListener(CEvents::setup);
        EVENT_BUS.addListener(CEvents::blockToolInteractions);
        EVENT_BUS.addListener(CEvents::useOn);
    }

    private static void setup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(CBlocks.MAYURA_SAPLING.getId(), CBlocks.POTTED_MAYURA_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(CBlocks.GRIMWOOD_SAPLING.getId(), CBlocks.POTTED_GRIMWOOD_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(CBlocks.VIVIAN.getId(), CBlocks.POTTED_VIVIAN);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(CBlocks.WICKUL.getId(), CBlocks.POTTED_WICKUL);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(CBlocks.ICEFLOWER.getId(), CBlocks.POTTED_ICEFLOWER);
        });
    }

    private static void blockToolInteractions(BlockEvent.BlockToolModificationEvent event) {
        ItemAbility action = event.getItemAbility();
        BlockState keepState = event.getState();
        UseOnContext context = event.getContext();

        if (!event.isSimulated()) {
            if (action == ItemAbilities.SHOVEL_FLATTEN && (context.getClickedFace() != Direction.DOWN && context.getLevel().getBlockState(context.getClickedPos().above()).isAir())) {
                if (keepState.is(CBlocks.FRIGIAN_GRASS_BLOCK.get()) || keepState.is(CBlocks.FRIGIAN_DIRT.get()) || keepState.is(CBlocks.COARSE_FRIGIAN_DIRT.get())) {
                    event.setFinalState(CBlocks.FRIGIAN_DIRT_PATH.get().defaultBlockState());
                }
            }

            if (action == ItemAbilities.AXE_STRIP) {
                if (keepState.is(CBlocks.MAYURA_LOG.get())) {
                    event.setFinalState(CBlocks.STRIPPED_MAYURA_LOG.get().withPropertiesOf(keepState));
                }

                if (keepState.is(CBlocks.MAYURA_WOOD.get())) {
                    event.setFinalState(CBlocks.STRIPPED_MAYURA_WOOD.get().withPropertiesOf(keepState));
                }

                if (keepState.is(CBlocks.GRIMWOOD_LOG.get())) {
                    event.setFinalState(CBlocks.STRIPPED_GRIMWOOD_LOG.get().withPropertiesOf(keepState));
                }

                if (keepState.is(CBlocks.GRIMWOOD_WOOD.get())) {
                    event.setFinalState(CBlocks.STRIPPED_GRIMWOOD_WOOD.get().withPropertiesOf(keepState));
                }
            }
            if (action == ItemAbilities.HOE_TILL && (context.getClickedFace() != Direction.DOWN && context.getLevel().getBlockState(context.getClickedPos().above()).isAir())) {
                if (keepState.is(CBlocks.FRIGIAN_GRASS_BLOCK.get()) || keepState.is(CBlocks.FRIGIAN_DIRT.get()) || keepState.is(CBlocks.FRIGIAN_DIRT_PATH.get())) {
                    event.setFinalState(CBlocks.FRIGIAN_FARMLAND.get().defaultBlockState());
                }

                if (keepState.is(CBlocks.COARSE_FRIGIAN_DIRT.get())) {
                    event.setFinalState(CBlocks.FRIGIAN_DIRT.get().defaultBlockState());
                }
            }
        }
    }

    public static void useOn(PlayerInteractEvent.RightClickItem event) {
        Level level = event.getLevel();
        BlockPos blockPos = event.getPos();
        Player player = event.getEntity();
        ItemStack itemStack = player.getItemInHand(event.getHand());
        PotionContents potionContents = itemStack.getOrDefault(POTION_CONTENTS, PotionContents.EMPTY);
        BlockState clickedBlock = level.getBlockState(blockPos);

        if (clickedBlock.is(CTags.BlockTags.CONVERTABLE_TO_FRIGUS_MUD) && potionContents.is(Potions.WATER)) {
                level.playSound(null, blockPos, SoundEvents.GENERIC_SPLASH, SoundSource.BLOCKS, 1.0F, 1.0F);
                player.setItemInHand(event.getHand(), ItemUtils.createFilledResult(itemStack, player, new ItemStack(Items.GLASS_BOTTLE)));
                player.awardStat(Stats.ITEM_USED.get(itemStack.getItem()));
                if (!level.isClientSide()) {
                    ServerLevel serverlevel = (ServerLevel) level;
                    for (int i = 0; i < 5; i++) {
                        serverlevel.sendParticles(
                                ParticleTypes.SPLASH,
                                (double) blockPos.getX() + level.random.nextDouble(),
                                blockPos.getY() + 1,
                                (double) blockPos.getZ() + level.random.nextDouble(),
                                1,
                                0.0,
                                0.0,
                                0.0,
                                1.0
                        );
                    }
                }
                event.setCanceled(true);
                level.playSound(null, blockPos, SoundEvents.BOTTLE_EMPTY, SoundSource.BLOCKS, 1.0F, 1.0F);
                level.gameEvent(null, GameEvent.FLUID_PLACE, blockPos);
                level.setBlockAndUpdate(blockPos, CBlocks.FRIGIAN_MUD.get().defaultBlockState());
            }
    }
}
