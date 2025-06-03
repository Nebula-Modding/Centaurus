package io.github.nebulamodding.cepheus.events;

import io.github.nebulamodding.cepheus.Cepheus;
import io.github.nebulamodding.cepheus.registry.block.CBlocks;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;
import net.neoforged.neoforge.event.level.BlockEvent;

import static net.neoforged.neoforge.common.NeoForge.EVENT_BUS;

public class CEvents {
    public static void gatherEvents(IEventBus bus) {
        bus.addListener(CEvents::setup);
        EVENT_BUS.addListener(CEvents::blockToolInteractions);
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
        BlockState state = event.getState();
        UseOnContext context = event.getContext();
        if (!event.isSimulated()) {
            if (action == ItemAbilities.SHOVEL_FLATTEN && (context.getClickedFace() != Direction.DOWN && context.getLevel().getBlockState(context.getClickedPos().above()).isAir())) {
                if (state.is(CBlocks.FRIGUS_GRASS_BLOCK.get()) || state.is(CBlocks.FRIGUS_DIRT.get()) || state.is(CBlocks.COARSE_FRIGUS_DIRT.get())) {
                    event.setFinalState(CBlocks.FRIGUS_DIRT_PATH.get().defaultBlockState());
                }
            }
            if (action == ItemAbilities.AXE_STRIP) {
                if (state.is(CBlocks.MAYURA_LOG.get())) {
                    event.setFinalState(CBlocks.STRIPPED_MAYURA_LOG.get().withPropertiesOf(state));
                }
                if (state.is(CBlocks.MAYURA_WOOD.get())) {
                    event.setFinalState(CBlocks.STRIPPED_MAYURA_WOOD.get().withPropertiesOf(state));
                }
                if (state.is(CBlocks.GRIMWOOD_LOG.get())) {
                    event.setFinalState(CBlocks.STRIPPED_GRIMWOOD_LOG.get().withPropertiesOf(state));
                }
                if (state.is(CBlocks.GRIMWOOD_WOOD.get())) {
                    event.setFinalState(CBlocks.STRIPPED_GRIMWOOD_WOOD.get().withPropertiesOf(state));
                }
            }
            if (action == ItemAbilities.HOE_TILL && (context.getClickedFace() != Direction.DOWN && context.getLevel().getBlockState(context.getClickedPos().above()).isAir())) {
                if (state.is(CBlocks.FRIGUS_GRASS_BLOCK.get()) || state.is(CBlocks.FRIGUS_DIRT.get()) || state.is(CBlocks.FRIGUS_DIRT_PATH.get())) {
                    event.setFinalState(CBlocks.FRIGUS_FARMLAND.get().defaultBlockState());
                }
                if (state.is(CBlocks.COARSE_FRIGUS_DIRT.get())) {
                    event.setFinalState(CBlocks.FRIGUS_DIRT.get().defaultBlockState());
                }
            }
        }
    }
}
