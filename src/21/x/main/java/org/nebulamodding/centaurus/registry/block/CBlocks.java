package org.nebulamodding.centaurus.registry.block;

import org.nebulamodding.centaurus.Centaurus;
import org.nebulamodding.centaurus.registry.block.classes.*;
import org.nebulamodding.centaurus.registry.item.CItems;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.girlkisser.cygnus.content.block.BlockLockingDoor;
import top.girlkisser.cygnus.content.block.BlockLockingTrapdoor;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

import static org.nebulamodding.centaurus.registry.block.CWoodTypes.GRIMWOOD;
import static org.nebulamodding.centaurus.registry.block.CWoodTypes.MAYURA;

public class CBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Centaurus.MOD_ID);

    /*
    Seeds
     */
    
    public static final DeferredBlock<Block>
            PLACEHOLDER_BLOCK = register("tempblocktest", () -> new Block(stoneProperties().mapColor(MapColor.PLANT)));
    //        BRUMA_SEEDS = register("bruma_seeds", () -> new CropBlock(plantProperties().mapColor(MapColor.COLOR_BLUE).randomTicks().sound(SoundType.CROP))),
    //        AZURE_ROOTS = register("azure_roots", () -> new CropBlock(plantProperties().mapColor(MapColor.COLOR_LIGHT_BLUE).randomTicks().sound(SoundType.CROP)));

    /*
    Wood Blocks
     */

    // region Mayura Blocks
    public static final DeferredBlock<Block>
            MAYURA_LOG = register("mayura_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LOG).mapColor(state -> state.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MapColor.GLOW_LICHEN : MapColor.TERRACOTTA_LIGHT_BLUE))),
            MAYURA_WOOD = register("mayura_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_WOOD).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            STRIPPED_MAYURA_LOG = register("stripped_mayura_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_LOG).mapColor(MapColor.GLOW_LICHEN))),
            STRIPPED_MAYURA_WOOD = register("stripped_mayura_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_WOOD).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_PLANKS = register("mayura_planks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_STAIRS = register("mayura_stairs", () -> new StairBlock(MAYURA_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_STAIRS).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_SLAB = register("mayura_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_SLAB).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_FENCE = register("mayura_fence", () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_FENCE).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_FENCE_GATE = register("mayura_fence_gate", () -> new FenceGateBlock(MAYURA, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_FENCE_GATE).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_DOOR = register("mayura_door", () -> new DoorBlock(CBlockSetTypes.MAYURA, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_DOOR).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_TRAPDOOR = register("mayura_trapdoor", () -> new TrapDoorBlock(CBlockSetTypes.MAYURA, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_TRAPDOOR).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_PRESSURE_PLATE = register("mayura_pressure_plate", () -> new PressurePlateBlock(CBlockSetTypes.MAYURA, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PRESSURE_PLATE).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_BUTTON = register("mayura_button", () -> new ButtonBlock(CBlockSetTypes.MAYURA, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_BUTTON))),
            MAYURA_LEAVES = register("mayura_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LEAVES).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_SAPLING = register("mayura_sapling", () -> new SaplingBlock(TreeGrower.SPRUCE, plantProperties().randomTicks().mapColor(MapColor.GLOW_LICHEN)));
    // endregion

    // region Grimwood Blocks
    public static final DeferredBlock<Block>
            GRIMWOOD_LOG = register("grimwood_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LOG).mapColor(state -> state.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MapColor.TERRACOTTA_CYAN : MapColor.TERRACOTTA_BLACK))),
            GRIMWOOD_WOOD = register("grimwood_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_WOOD).mapColor(MapColor.TERRACOTTA_BLACK))),
            STRIPPED_GRIMWOOD_LOG = register("stripped_grimwood_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_LOG).mapColor(MapColor.TERRACOTTA_CYAN))),
            STRIPPED_GRIMWOOD_WOOD = register("stripped_grimwood_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_WOOD).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_PLANKS = register("grimwood_planks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_STAIRS = register("grimwood_stairs", () -> new StairBlock(GRIMWOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_STAIRS).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_SLAB = register("grimwood_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_SLAB).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_FENCE = register("grimwood_fence", () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_FENCE).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_FENCE_GATE = register("grimwood_fence_gate", () -> new FenceGateBlock(GRIMWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_FENCE_GATE).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_DOOR = register("grimwood_door", () -> new DoorBlock(CBlockSetTypes.GRIMWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_DOOR).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_TRAPDOOR = register("grimwood_trapdoor", () -> new TrapDoorBlock(CBlockSetTypes.GRIMWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_TRAPDOOR).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_PRESSURE_PLATE = register("grimwood_pressure_plate", () -> new PressurePlateBlock(CBlockSetTypes.GRIMWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PRESSURE_PLATE).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_BUTTON = register("grimwood_button", () -> new ButtonBlock(CBlockSetTypes.GRIMWOOD, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_BUTTON))),
            GRIMWOOD_LEAVES = register("grimwood_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LEAVES).mapColor(MapColor.SNOW))),
            GRIMWOOD_SAPLING = register("grimwood_sapling", () -> new SaplingBlock(TreeGrower.SPRUCE, plantProperties().randomTicks().mapColor(MapColor.TERRACOTTA_CYAN)));
    // endregion

    /*
    Body-Specific Blocks
     */

    // region Frigus-Specific Blocks
    public static final DeferredBlock<Block>
            FRIGIAN_GRASS_BLOCK = register("frigian_grass_block", () -> new FrigianGrassBlock(grassProperties().mapColor(MapColor.GLOW_LICHEN))),
            FRIGIAN_DIRT = register("frigian_dirt", () -> new Block(dirtProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGIAN_DIRT_PATH = register("frigian_dirt_path", () -> new FrigianDirtPathBlock(pathProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            COARSE_FRIGIAN_DIRT = register("coarse_frigian_dirt", () -> new Block(dirtProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGIAN_FARMLAND = register("frigian_farmland", () -> new FrigianFarmlandBlock(farmlandProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGIAN_MUD = register("frigian_mud", () -> new MudBlock(mudProperties().mapColor(MapColor.TERRACOTTA_BLUE))),
            PACKED_FRIGIAN_MUD = register("packed_frigian_mud", () -> new Block(packedMudProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGIAN_MUD_BRICKS = register("frigian_mud_bricks", () -> new Block(mudBrickProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGIAN_MUD_BRICK_STAIRS = register("frigian_mud_brick_stairs", () -> new StairBlock(FRIGIAN_MUD_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.FRIGIAN_MUD_BRICKS.get()))),
            FRIGIAN_MUD_BRICK_SLAB = register("frigian_mud_brick_slab", () -> new SlabBlock(mudBrickProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGIAN_MUD_BRICK_WALL = register("frigian_mud_brick_wall", () -> new WallBlock(mudBrickProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGIAN_SHORT_GRASS = register("frigian_short_grass", () -> new TallGrassBlock(plantProperties().replaceable().offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().mapColor(MapColor.GLOW_LICHEN)));
    public static final DeferredBlock<Block>
            VIVIAN = register("vivian", () -> new FlowerBlock(MobEffects.INVISIBILITY, 3.5F, plantProperties().mapColor(MapColor.COLOR_LIGHT_BLUE).offsetType(BlockBehaviour.OffsetType.XZ))),
            WICKUL = register("wickul", () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3.5F, plantProperties().mapColor(MapColor.COLOR_LIGHT_BLUE).offsetType(BlockBehaviour.OffsetType.XZ))),
            ICEFLOWER = register("iceflower", () -> new FlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 5.0F, plantProperties().mapColor(MapColor.COLOR_LIGHT_BLUE).offsetType(BlockBehaviour.OffsetType.XZ)));
    // endregion

    // region Karnis-Specific Blocks
    public static final DeferredBlock<Block>
            TUMOR = register("tumor", () -> new AmethystClusterBlock(7.0F, 3.0F, BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).forceSolidOn().noOcclusion().sound(SoundType.HONEY_BLOCK).strength(0.2F, 0.2F).pushReaction(PushReaction.DESTROY).noCollission())),
            FLESH_BLOCK = register("flesh_block", () -> new MudBlock(BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).sound(SoundType.HONEY_BLOCK).strength(0.4F, 0.4F))),
            GRISTLED_FLESH = register("gristled_flesh", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_HYPHAE).sound(CSoundTypes.GRISTLED_FLESH).strength(0.4F, 0.4F))),
            GRISTLE_BLOCK = register("gristle_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_HYPHAE).sound(SoundType.MOSS).strength(0.1F, 0.1F))),
            SHORT_GRISTLES = register("short_gristles", () -> new TallGrassBlock(plantProperties().replaceable().offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().mapColor(MapColor.CRIMSON_HYPHAE).sound(SoundType.MOSS))),
            TALL_GRISTLES = register("tall_gristles", () -> new TallGrassBlock(plantProperties().replaceable().offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().mapColor(MapColor.CRIMSON_HYPHAE).sound(SoundType.MOSS))),
            BRAINROCK = register("brainrock", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK).mapColor(MapColor.RAW_IRON).sound(SoundType.HONEY_BLOCK))),
            BLOOD_VESSEL = register("blood_vessel", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_NYLIUM).sound(SoundType.HONEY_BLOCK).strength(0.4F, 0.4F)));
    // endregion

    /*
    Stone Blocks
     */

    // region Silicate Stone
    public static final DeferredBlock<Block>
            SILICATE_STONE = register("silicate_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            SILICATE_STONE_STAIRS = register("silicate_stone_stairs", () -> new StairBlock(SILICATE_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.SILICATE_STONE.get()))),
            SILICATE_STONE_SLAB = register("silicate_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.SILICATE_STONE.get()))),
            SILICATE_STONE_WALL = register("silicate_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.SILICATE_STONE.get()))),
            SILICATE_STONE_PRESSURE_PLATE = register("silicate_stone_pressure_plate", () -> new PressurePlateBlock(CBlockSetTypes.SILICATE_STONE, BlockBehaviour.Properties.ofFullCopy(CBlocks.SILICATE_STONE.get()).forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            SILICATE_STONE_BUTTON = register("silicate_stone_button", () -> new ButtonBlock(CBlockSetTypes.SILICATE_STONE, 20, BlockBehaviour.Properties.ofFullCopy(CBlocks.SILICATE_STONE.get()).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            SILICATE_COBBLESTONE = register("silicate_cobblestone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            SILICATE_COBBLESTONE_STAIRS = register("silicate_cobblestone_stairs", () -> new StairBlock(SILICATE_COBBLESTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.SILICATE_COBBLESTONE.get()))),
            SILICATE_COBBLESTONE_SLAB = register("silicate_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.SILICATE_COBBLESTONE.get()))),
            SILICATE_COBBLESTONE_WALL = register("silicate_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.SILICATE_COBBLESTONE.get()))),
            CHISELED_SILICATE_STONE = register("chiseled_silicate_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            POLISHED_SILICATE_STONE = register("polished_silicate_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            POLISHED_SILICATE_STONE_STAIRS = register("polished_silicate_stone_stairs", () -> new StairBlock(POLISHED_SILICATE_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.POLISHED_SILICATE_STONE.get()))),
            POLISHED_SILICATE_STONE_SLAB = register("polished_silicate_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.POLISHED_SILICATE_STONE.get()))),
            POLISHED_SILICATE_STONE_WALL = register("polished_silicate_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.POLISHED_SILICATE_STONE.get()))),
            SILICATE_STONE_BRICKS = register("silicate_stone_bricks", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            CRACKED_SILICATE_STONE_BRICKS = register("cracked_silicate_stone_bricks", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            SILICATE_STONE_BRICK_STAIRS = register("silicate_stone_brick_stairs", () -> new StairBlock(SILICATE_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.SILICATE_STONE_BRICKS.get()))),
            SILICATE_STONE_BRICK_SLAB = register("silicate_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.SILICATE_STONE_BRICKS.get()))),
            SILICATE_STONE_BRICK_WALL = register("silicate_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.SILICATE_STONE_BRICKS.get()))),
            SILICATE_STONE_PILLAR = register("silicate_stone_pillar", () -> new RotatedPillarBlock(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    // endregion

    // region Blueschist Blocks
    public static final DeferredBlock<Block>
            BLUESCHIST = register("blueschist", () -> new Block(stoneProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_STAIRS = register("blueschist_stairs", () -> new StairBlock(BLUESCHIST.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESCHIST.get()))),
            BLUESCHIST_SLAB = register("blueschist_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESCHIST.get()))),
            BLUESCHIST_WALL = register("blueschist_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESCHIST.get()))),
            BLUESCHIST_PRESSURE_PLATE = register("blueschist_pressure_plate", () -> new PressurePlateBlock(CBlockSetTypes.BLUESCHIST, BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESCHIST.get()).forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            BLUESCHIST_BUTTON = register("blueschist_button", () -> new ButtonBlock(CBlockSetTypes.BLUESCHIST, 20, BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESCHIST.get()).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            COBBLED_BLUESCHIST = register("cobbled_blueschist", () -> new Block(stoneProperties().mapColor(MapColor.ICE))),
            COBBLED_BLUESCHIST_STAIRS = register("cobbled_blueschist_stairs", () -> new StairBlock(COBBLED_BLUESCHIST.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.COBBLED_BLUESCHIST.get()))),
            COBBLED_BLUESCHIST_SLAB = register("cobbled_blueschist_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.COBBLED_BLUESCHIST.get()))),
            COBBLED_BLUESCHIST_WALL = register("cobbled_blueschist_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.COBBLED_BLUESCHIST.get()))),
            CHISELED_BLUESCHIST = register("chiseled_blueschist", () -> new Block(stoneProperties().mapColor(MapColor.ICE))),
            POLISHED_BLUESCHIST = register("polished_blueschist", () -> new Block(stoneProperties().mapColor(MapColor.ICE))),
            POLISHED_BLUESCHIST_STAIRS = register("polished_blueschist_stairs", () -> new StairBlock(POLISHED_BLUESCHIST.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.POLISHED_BLUESCHIST.get()))),
            POLISHED_BLUESCHIST_SLAB = register("polished_blueschist_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.POLISHED_BLUESCHIST.get()))),
            POLISHED_BLUESCHIST_WALL = register("polished_blueschist_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.POLISHED_BLUESCHIST.get()))),
            BLUESCHIST_BRICKS = register("blueschist_bricks", () -> new Block(stoneProperties().mapColor(MapColor.ICE))),
            CRACKED_BLUESCHIST_BRICKS = register("cracked_blueschist_bricks", () -> new Block(stoneProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_BRICK_STAIRS = register("blueschist_brick_stairs", () -> new StairBlock(BLUESCHIST_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESCHIST_BRICKS.get()))),
            BLUESCHIST_BRICK_SLAB = register("blueschist_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESCHIST_BRICKS.get()))),
            BLUESCHIST_BRICK_WALL = register("blueschist_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESCHIST_BRICKS.get()))),
            BLUESCHIST_PILLAR = register("blueschist_pillar", () -> new RotatedPillarBlock(stoneProperties().mapColor(MapColor.ICE)));
    // endregion

    // region Blueslate Blocks
    public static final DeferredBlock<Block>
            BLUESLATE = register("blueslate", () -> new Block(deepslateProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            BLUESLATE_STAIRS = register("blueslate_stairs", () -> new StairBlock(BLUESLATE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESLATE.get()))),
            BLUESLATE_SLAB = register("blueslate_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESLATE.get()))),
            BLUESLATE_WALL = register("blueslate_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESLATE.get()))),
            COBBLED_BLUESLATE = register("cobbled_blueslate", () -> new Block(deepslateProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            COBBLED_BLUESLATE_STAIRS = register("cobbled_blueslate_stairs", () -> new StairBlock(COBBLED_BLUESLATE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.COBBLED_BLUESLATE.get()))),
            COBBLED_BLUESLATE_SLAB = register("cobbled_blueslate_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.COBBLED_BLUESLATE.get()))),
            COBBLED_BLUESLATE_WALL = register("cobbled_blueslate_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.COBBLED_BLUESLATE.get()))),
            CHISELED_BLUESLATE = register("chiseled_blueslate", () -> new Block(deepslateProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).sound(SoundType.DEEPSLATE_BRICKS))),
            POLISHED_BLUESLATE = register("polished_blueslate", () -> new Block(deepslateProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            POLISHED_BLUESLATE_STAIRS = register("polished_blueslate_stairs", () -> new StairBlock(POLISHED_BLUESLATE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.POLISHED_BLUESLATE.get()))),
            POLISHED_BLUESLATE_SLAB = register("polished_blueslate_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.POLISHED_BLUESLATE.get()))),
            POLISHED_BLUESLATE_WALL = register("polished_blueslate_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.POLISHED_BLUESLATE.get()))),
            BLUESLATE_BRICKS = register("blueslate_bricks", () -> new Block(deepslateProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).sound(SoundType.DEEPSLATE_BRICKS))),
            CRACKED_BLUESLATE_BRICKS = register("cracked_blueslate_bricks", () -> new Block(deepslateProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).sound(SoundType.DEEPSLATE_BRICKS))),
            BLUESLATE_BRICK_STAIRS = register("blueslate_brick_stairs", () -> new StairBlock(BLUESLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESLATE_BRICKS.get()))),
            BLUESLATE_BRICK_SLAB = register("blueslate_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESLATE_BRICKS.get()))),
            BLUESLATE_BRICK_WALL = register("blueslate_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESLATE_BRICKS.get()))),
            BLUESLATE_TILES = register("blueslate_tiles", () -> new Block(deepslateProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).sound(SoundType.DEEPSLATE_TILES))),
            BLUESLATE_TILE_STAIRS = register("blueslate_tile_stairs", () -> new StairBlock(BLUESLATE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESLATE_TILES.get()))),
            BLUESLATE_TILE_SLAB = register("blueslate_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESLATE_TILES.get()))),
            BLUESLATE_TILE_WALL = register("blueslate_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESLATE_TILES.get()))),
            BLUESLATE_PILLAR = register("blueslate_pillar", () -> new RotatedPillarBlock(deepslateProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).sound(SoundType.DEEPSLATE_BRICKS)));
    // endregion

    // region Permafrost
    public static final DeferredBlock<Block>
            PERMAFROST = register("permafrost", () -> new Block(stoneProperties().mapColor(MapColor.QUARTZ))),
            PERMAFROST_STAIRS = register("permafrost_stairs", () -> new StairBlock(PERMAFROST.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.PERMAFROST.get()))),
            PERMAFROST_SLAB = register("permafrost_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.PERMAFROST.get()))),
            PERMAFROST_WALL = register("permafrost_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.PERMAFROST.get()))),
            PERMAFROST_PRESSURE_PLATE = register("permafrost_pressure_plate", () -> new PressurePlateBlock(CBlockSetTypes.PERMAFROST, BlockBehaviour.Properties.ofFullCopy(CBlocks.PERMAFROST.get()).forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            PERMAFROST_BUTTON = register("permafrost_button", () -> new ButtonBlock(CBlockSetTypes.PERMAFROST, 20, BlockBehaviour.Properties.ofFullCopy(CBlocks.PERMAFROST.get()).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            CHISELED_PERMAFROST = register("chiseled_permafrost", () -> new Block(stoneProperties().mapColor(MapColor.QUARTZ))),
            POLISHED_PERMAFROST = register("polished_permafrost", () -> new Block(stoneProperties().mapColor(MapColor.QUARTZ))),
            POLISHED_PERMAFROST_STAIRS = register("polished_permafrost_stairs", () -> new StairBlock(POLISHED_PERMAFROST.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.POLISHED_PERMAFROST.get()))),
            POLISHED_PERMAFROST_SLAB = register("polished_permafrost_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.POLISHED_PERMAFROST.get()))),
            POLISHED_PERMAFROST_WALL = register("polished_permafrost_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.POLISHED_PERMAFROST.get()))),
            PERMAFROST_BRICKS = register("permafrost_bricks", () -> new Block(stoneProperties().mapColor(MapColor.QUARTZ))),
            CRACKED_PERMAFROST_BRICKS = register("cracked_permafrost_bricks", () -> new Block(stoneProperties().mapColor(MapColor.QUARTZ))),
            PERMAFROST_BRICK_STAIRS = register("permafrost_brick_stairs", () -> new StairBlock(PERMAFROST_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.PERMAFROST_BRICKS.get()))),
            PERMAFROST_BRICK_SLAB = register("permafrost_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.PERMAFROST_BRICKS.get()))),
            PERMAFROST_BRICK_WALL = register("permafrost_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.PERMAFROST_BRICKS.get()))),
            PERMAFROST_TILES = register("permafrost_tiles", () -> new Block(stoneProperties().mapColor(MapColor.QUARTZ))),
            PERMAFROST_TILE_STAIRS = register("permafrost_tile_stairs", () -> new StairBlock(PERMAFROST_TILES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.PERMAFROST_TILES.get()))),
            PERMAFROST_TILE_SLAB = register("permafrost_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.PERMAFROST_TILES.get()))),
            PERMAFROST_TILE_WALL = register("permafrost_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.PERMAFROST_TILES.get()))),
            PERMAFROST_PILLAR = register("permafrost_pillar", () -> new RotatedPillarBlock(stoneProperties().mapColor(MapColor.QUARTZ)));
    // endregion

    // Todo: change map color
    // region Karcass Stone
    public static final DeferredBlock<Block>
            KARCASS_STONE = register("karcass_stone", () -> new Block(stoneProperties().mapColor(MapColor.ICE))),
            KARCASS_STONE_STAIRS = register("karcass_stone_stairs", () -> new StairBlock(KARCASS_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.KARCASS_STONE.get()))),
            KARCASS_STONE_SLAB = register("karcass_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.KARCASS_STONE.get()))),
            KARCASS_STONE_WALL = register("karcass_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.KARCASS_STONE.get()))),
            KARCASS_STONE_PRESSURE_PLATE = register("karcass_stone_pressure_plate", () -> new PressurePlateBlock(CBlockSetTypes.KARCASS_STONE, BlockBehaviour.Properties.ofFullCopy(CBlocks.KARCASS_STONE.get()).forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            KARCASS_STONE_BUTTON = register("karcass_stone_button", () -> new ButtonBlock(CBlockSetTypes.KARCASS_STONE, 20, BlockBehaviour.Properties.ofFullCopy(CBlocks.KARCASS_STONE.get()).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            KARCASS_COBBLESTONE = register("karcass_cobblestone", () -> new Block(stoneProperties().mapColor(MapColor.ICE))),
            KARCASS_COBBLESTONE_STAIRS = register("karcass_cobblestone_stairs", () -> new StairBlock(KARCASS_COBBLESTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.KARCASS_COBBLESTONE.get()))),
            KARCASS_COBBLESTONE_SLAB = register("karcass_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.KARCASS_COBBLESTONE.get()))),
            KARCASS_COBBLESTONE_WALL = register("karcass_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.KARCASS_COBBLESTONE.get()))),
            CHISELED_KARCASS_STONE = register("chiseled_karcass_stone", () -> new Block(stoneProperties().mapColor(MapColor.ICE))),
            POLISHED_KARCASS_STONE = register("polished_karcass_stone", () -> new Block(stoneProperties().mapColor(MapColor.ICE))),
            POLISHED_KARCASS_STONE_STAIRS = register("polished_karcass_stone_stairs", () -> new StairBlock(POLISHED_KARCASS_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.POLISHED_KARCASS_STONE.get()))),
            POLISHED_KARCASS_STONE_SLAB = register("polished_karcass_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.POLISHED_KARCASS_STONE.get()))),
            POLISHED_KARCASS_STONE_WALL = register("polished_karcass_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.POLISHED_KARCASS_STONE.get()))),
            KARCASS_STONE_BRICKS = register("karcass_stone_bricks", () -> new Block(stoneProperties().mapColor(MapColor.ICE))),
            CRACKED_KARCASS_STONE_BRICKS = register("cracked_karcass_stone_bricks", () -> new Block(stoneProperties().mapColor(MapColor.ICE))),
            KARCASS_STONE_BRICK_STAIRS = register("karcass_stone_brick_stairs", () -> new StairBlock(KARCASS_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.KARCASS_STONE_BRICKS.get()))),
            KARCASS_STONE_BRICK_SLAB = register("karcass_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.KARCASS_STONE_BRICKS.get()))),
            KARCASS_STONE_BRICK_WALL = register("karcass_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.KARCASS_STONE_BRICKS.get()))),
            KARCASS_STONE_PILLAR = register("karcass_stone_pillar", () -> new RotatedPillarBlock(stoneProperties().mapColor(MapColor.ICE)));
    // endregion

    // region Goreslate Blocks
    public static final DeferredBlock<Block>
            GORESLATE = register("goreslate", () -> new Block(deepslateProperties().mapColor(MapColor.CRIMSON_HYPHAE))),
            GORESLATE_STAIRS = register("goreslate_stairs", () -> new StairBlock(GORESLATE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.GORESLATE.get()))),
            GORESLATE_SLAB = register("goreslate_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.GORESLATE.get()))),
            GORESLATE_WALL = register("goreslate_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.GORESLATE.get()))),
            CHISELED_GORESLATE = register("chiseled_goreslate", () -> new Block(deepslateProperties().mapColor(MapColor.CRIMSON_HYPHAE).sound(SoundType.DEEPSLATE_BRICKS))),
            POLISHED_GORESLATE = register("polished_goreslate", () -> new Block(deepslateProperties().mapColor(MapColor.CRIMSON_HYPHAE))),
            POLISHED_GORESLATE_STAIRS = register("polished_goreslate_stairs", () -> new StairBlock(POLISHED_GORESLATE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.POLISHED_GORESLATE.get()))),
            POLISHED_GORESLATE_SLAB = register("polished_goreslate_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.POLISHED_GORESLATE.get()))),
            POLISHED_GORESLATE_WALL = register("polished_goreslate_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.POLISHED_GORESLATE.get()))),
            GORESLATE_BRICKS = register("goreslate_bricks", () -> new Block(deepslateProperties().mapColor(MapColor.CRIMSON_HYPHAE).sound(SoundType.DEEPSLATE_BRICKS))),
            GORESLATE_BRICK_STAIRS = register("goreslate_brick_stairs", () -> new StairBlock(GORESLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.GORESLATE_BRICKS.get()))),
            GORESLATE_BRICK_SLAB = register("goreslate_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.GORESLATE_BRICKS.get()))),
            GORESLATE_BRICK_WALL = register("goreslate_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.GORESLATE_BRICKS.get()))),
            GORESLATE_TILES = register("goreslate_tiles", () -> new Block(deepslateProperties().mapColor(MapColor.CRIMSON_HYPHAE).sound(SoundType.DEEPSLATE_TILES))),
            GORESLATE_TILE_STAIRS = register("goreslate_tile_stairs", () -> new StairBlock(GORESLATE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.GORESLATE_TILES.get()))),
            GORESLATE_TILE_SLAB = register("goreslate_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.GORESLATE_TILES.get()))),
            GORESLATE_TILE_WALL = register("goreslate_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CBlocks.GORESLATE_TILES.get()))),
            GORESLATE_PILLAR = register("goreslate_pillar", () -> new RotatedPillarBlock(deepslateProperties().mapColor(MapColor.CRIMSON_HYPHAE).sound(SoundType.DEEPSLATE_BRICKS)));
    // endregion

    /*
    Ore Blocks // Todo: add Cygnus ores, add karcass stone and goreslate ores
     */

    // region Blueschist Ore Blocks
    public static final DeferredBlock<Block>
            BLUESCHIST_COAL_ORE = register("blueschist_coal_ore", () -> new DropExperienceBlock(UniformInt.of(1, 2), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_IRON_ORE = register("blueschist_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_COPPER_ORE = register("blueschist_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_GOLD_ORE = register("blueschist_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_REDSTONE_ORE = register("blueschist_redstone_ore", () -> new RedStoneOreBlock(stoneRedstoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_EMERALD_ORE = register("blueschist_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_LAPIS_ORE = register("blueschist_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(4, 8), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_DIAMOND_ORE = register("blueschist_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_LUTRUM_ORE = register("blueschist_lutrum_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_OBDURIUM_ORE = register("blueschist_obdurium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_MALUNITE_ORE = register("blueschist_malunite_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), stoneOreProperties().mapColor(MapColor.ICE)));
    // endregion
    
    // region Blueslate Ore Blocks
    public static final DeferredBlock<Block>
            BLUESLATE_COAL_ORE = register("blueslate_coal_ore", () -> new DropExperienceBlock(UniformInt.of(1, 2), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            BLUESLATE_IRON_ORE = register("blueslate_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            BLUESLATE_COPPER_ORE = register("blueslate_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            BLUESLATE_GOLD_ORE = register("blueslate_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            BLUESLATE_REDSTONE_ORE = register("blueslate_redstone_ore", () -> new RedStoneOreBlock(deepslateRedstoneOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            BLUESLATE_EMERALD_ORE = register("blueslate_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(3, 7), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            BLUESLATE_LAPIS_ORE = register("blueslate_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(4, 8), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            BLUESLATE_DIAMOND_ORE = register("blueslate_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(3, 7), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            BLUESLATE_LUTRUM_ORE = register("blueslate_lutrum_ore", () -> new DropExperienceBlock(ConstantInt.of(0), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            BLUESLATE_OBDURIUM_ORE = register("blueslate_obdurium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            BLUESLATE_MALUNITE_ORE = register("blueslate_malunite_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    // endregion

    // region Ice Ore Blocks
    public static final DeferredBlock<Block>
            WATER_ICE_COAL_ORE = register("water_ice_coal_ore", () -> new DropExperienceBlock(UniformInt.of(1, 2), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_IRON_ORE = register("water_ice_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_COPPER_ORE = register("water_ice_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_GOLD_ORE = register("water_ice_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_REDSTONE_ORE = register("water_ice_redstone_ore", () -> new RedStoneOreBlock(stoneRedstoneOreProperties().strength(3.0F, 1.0F).requiresCorrectToolForDrops().friction(0.85F).sound(SoundType.GLASS).instrument(NoteBlockInstrument.CHIME))),
            WATER_ICE_EMERALD_ORE = register("water_ice_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(3, 7), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_LAPIS_ORE = register("water_ice_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(2, 5), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_DIAMOND_ORE = register("water_ice_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(3, 7), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_LUTRUM_ORE = register("water_ice_lutrum_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_OBDURIUM_ORE = register("water_ice_obdurium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_MALUNITE_ORE = register("water_ice_malunite_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), iceProperties().strength(3.0F, 1.0F)));
    public static final DeferredBlock<Block>
            NITROGEN_ICE_COAL_ORE = register("nitrogen_ice_coal_ore", () -> new DropExperienceBlock(UniformInt.of(1, 2), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_IRON_ORE = register("nitrogen_ice_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_COPPER_ORE = register("nitrogen_ice_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_GOLD_ORE = register("nitrogen_ice_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_REDSTONE_ORE = register("nitrogen_ice_redstone_ore", () -> new RedStoneOreBlock(stoneRedstoneOreProperties().strength(3.0F, 1.0F).requiresCorrectToolForDrops().friction(0.85F).sound(SoundType.GLASS).instrument(NoteBlockInstrument.CHIME).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_EMERALD_ORE = register("nitrogen_ice_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(3, 7), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_LAPIS_ORE = register("nitrogen_ice_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(2, 5), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_DIAMOND_ORE = register("nitrogen_ice_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(3, 7), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_LUTRUM_ORE = register("nitrogen_ice_lutrum_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_OBDURIUM_ORE = register("nitrogen_ice_obdurium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_MALUNITE_ORE = register("nitrogen_ice_malunite_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW)));
    public static final DeferredBlock<Block>
            OXYGEN_ICE_COAL_ORE = register("oxygen_ice_coal_ore", () -> new DropExperienceBlock(UniformInt.of(1, 2), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_IRON_ORE = register("oxygen_ice_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_COPPER_ORE = register("oxygen_ice_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_GOLD_ORE = register("oxygen_ice_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_REDSTONE_ORE = register("oxygen_ice_redstone_ore", () -> new RedStoneOreBlock(stoneRedstoneOreProperties().strength(3.0F, 1.0F).requiresCorrectToolForDrops().friction(0.85F).sound(SoundType.GLASS).instrument(NoteBlockInstrument.CHIME))),
            OXYGEN_ICE_EMERALD_ORE = register("oxygen_ice_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(3, 7), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_LAPIS_ORE = register("oxygen_ice_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(2, 5), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_DIAMOND_ORE = register("oxygen_ice_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(3, 7), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_LUTRUM_ORE = register("oxygen_ice_lutrum_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_OBDURIUM_ORE = register("oxygen_ice_obdurium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_MALUNITE_ORE = register("oxygen_ice_malunite_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), iceProperties().strength(3.0F, 1.0F)));
    // endregion
    
    /*
    Storage Blocks
     */

    // region Plant Storage Blocks
    public static final DeferredBlock<Block>
            BRUMA_BLOCK = register("bruma_block", () -> new HayBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HAY_BLOCK).mapColor(MapColor.COLOR_BLUE).sound(SoundType.MOSS)));
    // endregion

    // region Raw Metal Storage Blocks
    public static final DeferredBlock<Block>
            RAW_OBDURIUM_BLOCK = register("raw_obdurium_block", () -> new Block(rawBlockProperties().sound(SoundType.ANCIENT_DEBRIS).mapColor(MapColor.COLOR_PURPLE))),
            RAW_MALUNITE_BLOCK = register("raw_malunite_block", () -> new Block(rawBlockProperties().mapColor(MapColor.COLOR_GREEN))),
            RAW_LUTRUM_BLOCK = register("raw_lutrum_block", () -> new Block(rawBlockProperties().mapColor(MapColor.CLAY))),
            LUTRUM_AMALGAMATE_BLOCK = register("lutrum_amalgamate_block", () -> new Block(rawBlockProperties().sound(SoundType.ANCIENT_DEBRIS).mapColor(MapColor.COLOR_GRAY)));
    // endregion

    /*
    Metal Blocks
     */

    // region Lutrum Blocks
    public static final DeferredBlock<Block>
            LUTRUM_BLOCK = register("lutrum_block", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_SHEET_METAL = register("lutrum_sheet_metal", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, lutrumProperties().mapColor(MapColor.CLAY))),
            CHISELED_LUTRUM = register("chiseled_lutrum", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_GRATE = register("lutrum_grate", () -> new WeatheringCopperGrateBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.CLAY))),
            LUTRUM_PLATING = register("lutrum_plating", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_PLATING_STAIRS = register("lutrum_plating_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.UNAFFECTED, LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_PLATING_SLAB = register("lutrum_plating_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.UNAFFECTED, lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_PLATING_PRESSURE_PLATE = register("lutrum_plating_pressure_plate", () -> new WeatheringCopperPressurePlateBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.UNAFFECTED, 20, lutrumProperties().mapColor(MapColor.CLAY).forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            LUTRUM_PLATING_BUTTON = register("lutrum_plating_button", () -> new WeatheringCopperButtonBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.UNAFFECTED, 20, lutrumProperties().mapColor(MapColor.CLAY).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            LUTRUM_WINDOW = register("lutrum_window", () -> new WeatheringCopperTransparentBlock(WeatheringCopper.WeatherState.UNAFFECTED, lutrumProperties().mapColor(MapColor.CLAY).instrument(NoteBlockInstrument.HAT).sound(CSoundTypes.COPPER_WINDOW).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor((state, getter, pos) -> false).isSuffocating((state, getter, pos) -> false).isViewBlocking((state, getter, pos) -> false))),
            LUTRUM_PILLAR = register("lutrum_pillar", () -> new WeatheringCopperRotatedPillarBlock(WeatheringCopper.WeatherState.UNAFFECTED, lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_BARS = register("lutrum_bars", () -> new WeatheringCopperBarsBlock(WeatheringCopper.WeatherState.UNAFFECTED, lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_DOOR = register("lutrum_door", () -> new WeatheringCopperDoorBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.UNAFFECTED, lutrumProperties().noOcclusion().pushReaction(PushReaction.DESTROY).mapColor(MapColor.CLAY))),
            LUTRUM_TRAPDOOR = register("lutrum_trapdoor", () -> new WeatheringCopperTrapDoorBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_TRAPDOOR).mapColor(MapColor.CLAY))),
            LUTRUM_BULB = register("lutrum_bulb", () -> new WeatheringCopperBulbBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).mapColor(MapColor.CLAY))),
            EXPOSED_LUTRUM = register("exposed_lutrum", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_SHEET_METAL = register("exposed_lutrum_sheet_metal", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_CHISELED_LUTRUM = register("exposed_chiseled_lutrum", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_GRATE = register("exposed_lutrum_grate", () -> new WeatheringCopperGrateBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_PLATING = register("exposed_lutrum_plating", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_PLATING_STAIRS = register("exposed_lutrum_plating_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.EXPOSED, EXPOSED_LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_PLATING_SLAB = register("exposed_lutrum_plating_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.EXPOSED, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_PLATING_PRESSURE_PLATE = register("exposed_lutrum_plating_pressure_plate", () -> new WeatheringCopperPressurePlateBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.EXPOSED, 30, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            EXPOSED_LUTRUM_PLATING_BUTTON = register("exposed_lutrum_plating_button", () -> new WeatheringCopperButtonBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.EXPOSED, 30, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            EXPOSED_LUTRUM_WINDOW = register("exposed_lutrum_window", () -> new WeatheringCopperTransparentBlock(WeatheringCopper.WeatherState.EXPOSED, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(NoteBlockInstrument.HAT).sound(CSoundTypes.COPPER_WINDOW).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor((state, getter, pos) -> false).isSuffocating((state, getter, pos) -> false).isViewBlocking((state, getter, pos) -> false))),
            EXPOSED_LUTRUM_PILLAR = register("exposed_lutrum_pillar", () -> new WeatheringCopperRotatedPillarBlock(WeatheringCopper.WeatherState.EXPOSED, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_BARS = register("exposed_lutrum_bars", () -> new WeatheringCopperBarsBlock(WeatheringCopper.WeatherState.EXPOSED, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_DOOR = register("exposed_lutrum_door", () -> new WeatheringCopperDoorBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.EXPOSED, lutrumProperties().noOcclusion().pushReaction(PushReaction.DESTROY).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_TRAPDOOR = register("exposed_lutrum_trapdoor", () -> new WeatheringCopperTrapDoorBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_TRAPDOOR).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_BULB = register("exposed_lutrum_bulb", () -> new WeatheringCopperBulbBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).lightLevel(litBlockEmission(14)))),
            WEATHERED_LUTRUM = register("weathered_lutrum", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_SHEET_METAL = register("weathered_lutrum_sheet_metal", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_CHISELED_LUTRUM = register("weathered_chiseled_lutrum", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_GRATE = register("weathered_lutrum_grate", () -> new WeatheringCopperGrateBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_PLATING = register("weathered_lutrum_plating", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_PLATING_STAIRS = register("weathered_lutrum_plating_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.WEATHERED, WEATHERED_LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_PLATING_SLAB = register("weathered_lutrum_plating_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.WEATHERED, lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_PLATING_PRESSURE_PLATE = register("weathered_lutrum_plating_pressure_plate", () -> new WeatheringCopperPressurePlateBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.WEATHERED, 40, lutrumProperties().mapColor(MapColor.STONE).forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            WEATHERED_LUTRUM_PLATING_BUTTON = register("weathered_lutrum_plating_button", () -> new WeatheringCopperButtonBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.WEATHERED, 40, lutrumProperties().mapColor(MapColor.STONE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            WEATHERED_LUTRUM_WINDOW = register("weathered_lutrum_window", () -> new WeatheringCopperTransparentBlock(WeatheringCopper.WeatherState.WEATHERED, lutrumProperties().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.HAT).sound(CSoundTypes.COPPER_WINDOW).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor((state, getter, pos) -> false).isSuffocating((state, getter, pos) -> false).isViewBlocking((state, getter, pos) -> false))),
            WEATHERED_LUTRUM_PILLAR = register("weathered_lutrum_pillar", () -> new WeatheringCopperRotatedPillarBlock(WeatheringCopper.WeatherState.WEATHERED, lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_BARS = register("weathered_lutrum_bars", () -> new WeatheringCopperBarsBlock(WeatheringCopper.WeatherState.WEATHERED, lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_DOOR = register("weathered_lutrum_door", () -> new WeatheringCopperDoorBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.WEATHERED, lutrumProperties().noOcclusion().pushReaction(PushReaction.DESTROY).mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_TRAPDOOR = register("weathered_lutrum_trapdoor", () -> new WeatheringCopperTrapDoorBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_TRAPDOOR).mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_BULB = register("weathered_lutrum_bulb", () -> new WeatheringCopperBulbBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).mapColor(MapColor.STONE).lightLevel(litBlockEmission(13)))),
            OXIDIZED_LUTRUM = register("oxidized_lutrum", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_SHEET_METAL = register("oxidized_lutrum_sheet_metal", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_CHISELED_LUTRUM = register("oxidized_chiseled_lutrum", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_GRATE = register("oxidized_lutrum_grate", () -> new WeatheringCopperGrateBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_PLATING = register("oxidized_lutrum_plating", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_PLATING_STAIRS = register("oxidized_lutrum_plating_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.OXIDIZED, OXIDIZED_LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_PLATING_SLAB = register("oxidized_lutrum_plating_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.OXIDIZED, lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_PLATING_PRESSURE_PLATE = register("oxidized_lutrum_plating_pressure_plate", () -> new WeatheringCopperPressurePlateBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.OXIDIZED, 50, lutrumProperties().mapColor(MapColor.COLOR_GRAY).forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            OXIDIZED_LUTRUM_PLATING_BUTTON = register("oxidized_lutrum_plating_button", () -> new WeatheringCopperButtonBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.OXIDIZED, 50, lutrumProperties().mapColor(MapColor.COLOR_GRAY).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            OXIDIZED_LUTRUM_WINDOW = register("oxidized_lutrum_window", () -> new WeatheringCopperTransparentBlock(WeatheringCopper.WeatherState.OXIDIZED, lutrumProperties().mapColor(MapColor.COLOR_GRAY).instrument(NoteBlockInstrument.HAT).sound(CSoundTypes.COPPER_WINDOW).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor((state, getter, pos) -> false).isSuffocating((state, getter, pos) -> false).isViewBlocking((state, getter, pos) -> false))),
            OXIDIZED_LUTRUM_PILLAR = register("oxidized_lutrum_pillar", () -> new WeatheringCopperRotatedPillarBlock(WeatheringCopper.WeatherState.OXIDIZED, lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_BARS = register("oxidized_lutrum_bars", () -> new WeatheringCopperBarsBlock(WeatheringCopper.WeatherState.OXIDIZED, lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_DOOR = register("oxidized_lutrum_door", () -> new WeatheringCopperDoorBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.OXIDIZED, lutrumProperties().noOcclusion().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_TRAPDOOR = register("oxidized_lutrum_trapdoor", () -> new WeatheringCopperTrapDoorBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_TRAPDOOR).mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_BULB = register("oxidized_lutrum_bulb", () -> new WeatheringCopperBulbBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).mapColor(MapColor.COLOR_GRAY).lightLevel(litBlockEmission(12))));
    public static final DeferredBlock<Block>
            WAXED_LUTRUM_BLOCK = register("waxed_lutrum_block", () -> new Block(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_SHEET_METAL = register("waxed_lutrum_sheet_metal", () -> new Block(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_CHISELED_LUTRUM = register("waxed_chiseled_lutrum", () -> new Block(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_GRATE = register("waxed_lutrum_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_PLATING = register("waxed_lutrum_plating", () -> new Block(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_PLATING_STAIRS = register("waxed_lutrum_plating_stairs", () -> new StairBlock(LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_PLATING_SLAB = register("waxed_lutrum_plating_slab", () -> new SlabBlock(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_PLATING_PRESSURE_PLATE = register("waxed_lutrum_plating_pressure_plate", () -> new PressurePlateBlock(CBlockSetTypes.LUTRUM, lutrumProperties().mapColor(MapColor.CLAY).forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            WAXED_LUTRUM_PLATING_BUTTON = register("waxed_lutrum_plating_button", () -> new ButtonBlock(CBlockSetTypes.LUTRUM, 20, lutrumProperties().mapColor(MapColor.CLAY).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            WAXED_LUTRUM_WINDOW = register("waxed_lutrum_window", () -> new TransparentBlock(lutrumProperties().mapColor(MapColor.CLAY).instrument(NoteBlockInstrument.HAT).sound(CSoundTypes.COPPER_WINDOW).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor((state, getter, pos) -> false).isSuffocating((state, getter, pos) -> false).isViewBlocking((state, getter, pos) -> false))),
            WAXED_LUTRUM_PILLAR = register("waxed_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_BARS = register("waxed_lutrum_bars", () -> new IronBarsBlock(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_DOOR = register("waxed_lutrum_door", () -> new DoorBlock(CBlockSetTypes.LUTRUM, lutrumProperties().noOcclusion().pushReaction(PushReaction.DESTROY).mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_TRAPDOOR = register("waxed_lutrum_trapdoor", () -> new TrapDoorBlock(CBlockSetTypes.LUTRUM, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_TRAPDOOR).mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_BULB = register("waxed_lutrum_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).mapColor(MapColor.CLAY))),
            WAXED_EXPOSED_LUTRUM = register("waxed_exposed_lutrum", () -> new Block(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_SHEET_METAL = register("waxed_exposed_lutrum_sheet_metal", () -> new Block(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_CHISELED_LUTRUM = register("waxed_exposed_chiseled_lutrum", () -> new Block(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_GRATE = register("waxed_exposed_lutrum_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_PLATING = register("waxed_exposed_lutrum_plating", () -> new Block(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_PLATING_STAIRS = register("waxed_exposed_lutrum_plating_stairs", () -> new StairBlock(LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_PLATING_SLAB = register("waxed_exposed_lutrum_plating_slab", () -> new SlabBlock(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_PLATING_PRESSURE_PLATE = register("waxed_exposed_lutrum_plating_pressure_plate", () -> new ConfigurablePressurePlateBlock(CBlockSetTypes.LUTRUM, 30, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            WAXED_EXPOSED_LUTRUM_PLATING_BUTTON = register("waxed_exposed_lutrum_plating_button", () -> new ButtonBlock(CBlockSetTypes.LUTRUM, 30, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            WAXED_EXPOSED_LUTRUM_WINDOW = register("waxed_exposed_lutrum_window", () -> new TransparentBlock(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(NoteBlockInstrument.HAT).sound(CSoundTypes.COPPER_WINDOW).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor((state, getter, pos) -> false).isSuffocating((state, getter, pos) -> false).isViewBlocking((state, getter, pos) -> false))),
            WAXED_EXPOSED_LUTRUM_PILLAR = register("waxed_exposed_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_BARS = register("waxed_exposed_lutrum_bars", () -> new IronBarsBlock(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_DOOR = register("waxed_exposed_lutrum_door", () -> new DoorBlock(CBlockSetTypes.LUTRUM, lutrumProperties().noOcclusion().pushReaction(PushReaction.DESTROY).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_TRAPDOOR = register("waxed_exposed_lutrum_trapdoor", () -> new TrapDoorBlock(CBlockSetTypes.LUTRUM, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_TRAPDOOR).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_BULB = register("waxed_exposed_lutrum_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).lightLevel(litBlockEmission(14)))),
            WAXED_WEATHERED_LUTRUM = register("waxed_weathered_lutrum", () -> new Block(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_SHEET_METAL = register("waxed_weathered_lutrum_sheet_metal", () -> new Block(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_CHISELED_LUTRUM = register("waxed_weathered_chiseled_lutrum", () -> new Block(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_GRATE = register("waxed_weathered_lutrum_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_PLATING = register("waxed_weathered_lutrum_plating", () -> new Block(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_PLATING_STAIRS = register("waxed_weathered_lutrum_plating_stairs", () -> new StairBlock(LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_PLATING_SLAB = register("waxed_weathered_lutrum_plating_slab", () -> new SlabBlock(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_PLATING_PRESSURE_PLATE = register("waxed_weathered_lutrum_plating_pressure_plate", () -> new ConfigurablePressurePlateBlock(CBlockSetTypes.LUTRUM, 40, lutrumProperties().mapColor(MapColor.STONE).forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            WAXED_WEATHERED_LUTRUM_PLATING_BUTTON = register("waxed_weathered_lutrum_plating_button", () -> new ButtonBlock(CBlockSetTypes.LUTRUM, 40, lutrumProperties().mapColor(MapColor.STONE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            WAXED_WEATHERED_LUTRUM_WINDOW = register("waxed_weathered_lutrum_window", () -> new TransparentBlock(lutrumProperties().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.HAT).sound(CSoundTypes.COPPER_WINDOW).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor((state, getter, pos) -> false).isSuffocating((state, getter, pos) -> false).isViewBlocking((state, getter, pos) -> false))),
            WAXED_WEATHERED_LUTRUM_PILLAR = register("waxed_weathered_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_BARS = register("waxed_weathered_lutrum_bars", () -> new IronBarsBlock(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_DOOR = register("waxed_weathered_lutrum_door", () -> new DoorBlock(CBlockSetTypes.LUTRUM, lutrumProperties().noOcclusion().pushReaction(PushReaction.DESTROY).mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_TRAPDOOR = register("waxed_weathered_lutrum_trapdoor", () -> new TrapDoorBlock(CBlockSetTypes.LUTRUM, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_TRAPDOOR).mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_BULB = register("waxed_weathered_lutrum_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).mapColor(MapColor.STONE).lightLevel(litBlockEmission(13)))),
            WAXED_OXIDIZED_LUTRUM = register("waxed_oxidized_lutrum", () -> new Block(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_SHEET_METAL = register("waxed_oxidized_lutrum_sheet_metal", () -> new Block(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_CHISELED_LUTRUM = register("waxed_oxidized_chiseled_lutrum", () -> new Block(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_GRATE = register("waxed_oxidized_lutrum_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_PLATING = register("waxed_oxidized_lutrum_plating", () -> new Block(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_PLATING_STAIRS = register("waxed_oxidized_lutrum_plating_stairs", () -> new StairBlock(LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_PLATING_SLAB = register("waxed_oxidized_lutrum_plating_slab", () -> new SlabBlock(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_PLATING_PRESSURE_PLATE = register("waxed_oxidized_lutrum_plating_pressure_plate", () -> new ConfigurablePressurePlateBlock(CBlockSetTypes.LUTRUM, 50, lutrumProperties().mapColor(MapColor.COLOR_GRAY).forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            WAXED_OXIDIZED_LUTRUM_PLATING_BUTTON = register("waxed_oxidized_lutrum_plating_button", () -> new ButtonBlock(CBlockSetTypes.LUTRUM, 50, lutrumProperties().mapColor(MapColor.COLOR_GRAY).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            WAXED_OXIDIZED_LUTRUM_WINDOW = register("waxed_oxidized_lutrum_window", () -> new TransparentBlock(lutrumProperties().mapColor(MapColor.COLOR_GRAY).instrument(NoteBlockInstrument.HAT).sound(CSoundTypes.COPPER_WINDOW).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor((state, getter, pos) -> false).isSuffocating((state, getter, pos) -> false).isViewBlocking((state, getter, pos) -> false))),
            WAXED_OXIDIZED_LUTRUM_PILLAR = register("waxed_oxidized_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_BARS = register("waxed_oxidized_lutrum_bars", () -> new IronBarsBlock(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_DOOR = register("waxed_oxidized_lutrum_door", () -> new DoorBlock(CBlockSetTypes.LUTRUM, lutrumProperties().noOcclusion().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_TRAPDOOR = register("waxed_oxidized_lutrum_trapdoor", () -> new TrapDoorBlock(CBlockSetTypes.LUTRUM, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_TRAPDOOR).mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_BULB = register("waxed_oxidized_lutrum_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).mapColor(MapColor.COLOR_GRAY).lightLevel(litBlockEmission(12))));
    // endregion

    // region Obdurium Blocks
    public static final DeferredBlock<Block>
            OBDURIUM_BLOCK = register("obdurium_block", () -> new Block(obduriumProperties())),
            OBDURIUM_SHEET_METAL = register("obdurium_sheet_metal", () -> new Block(obduriumProperties())),
            CHISELED_OBDURIUM = register("chiseled_obdurium", () -> new Block(obduriumProperties())),
            OBDURIUM_GRATE = register("obdurium_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.COLOR_PURPLE).strength(8.0F, 6000.0F).sound(CSoundTypes.NETHERITE_GRATE))),
            OBDURIUM_PLATING = register("obdurium_plating", () -> new Block(obduriumProperties())),
            OBDURIUM_PLATING_STAIRS = register("obdurium_plating_stairs", () -> new StairBlock(OBDURIUM_PLATING.get().defaultBlockState(), obduriumProperties())),
            OBDURIUM_PLATING_SLAB = register("obdurium_plating_slab", () -> new SlabBlock(obduriumProperties())),
            OBDURIUM_PLATING_PRESSURE_PLATE = register("obdurium_plating_pressure_plate", () -> new ConfigurablePressurePlateBlock(CBlockSetTypes.OBDURIUM, 60, obduriumProperties().forceSolidOn().noCollission().strength(2.0F, 6000.0F).pushReaction(PushReaction.DESTROY))),
            OBDURIUM_PLATING_BUTTON = register("obdurium_plating_button", () -> new ButtonBlock(CBlockSetTypes.OBDURIUM, 60, obduriumProperties().noCollission().strength(2.0F, 6000.0F).pushReaction(PushReaction.DESTROY))),
            OBDURIUM_WINDOW = register("obdurium_window", () -> new TransparentBlock(obduriumProperties().instrument(NoteBlockInstrument.HAT).sound(CSoundTypes.NETHERITE_WINDOW).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor((state, getter, pos) -> false).isSuffocating((state, getter, pos) -> false).isViewBlocking((state, getter, pos) -> false))),
            OBDURIUM_PILLAR = register("obdurium_pillar", () -> new RotatedPillarBlock(obduriumProperties())),
            OBDURIUM_BARS = register("obdurium_bars", () -> new IronBarsBlock(obduriumProperties())),
            OBDURIUM_DOOR = register("obdurium_door", () -> new BlockLockingDoor(CBlockSetTypes.OBDURIUM, obduriumProperties().noOcclusion().pushReaction(PushReaction.DESTROY))),
            OBDURIUM_TRAPDOOR = register("obdurium_trapdoor", () -> new BlockLockingTrapdoor(CBlockSetTypes.OBDURIUM, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_TRAPDOOR).mapColor(MapColor.COLOR_PURPLE).strength(8.0F, 6000.0F).sound(SoundType.NETHERITE_BLOCK))),
            OBDURIUM_BULB = register("obdurium_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).mapColor(MapColor.COLOR_PURPLE).strength(8.0F, 6000.0F).sound(CSoundTypes.NETHERITE_BULB)));
    // endregion

    // region Malunite Blocks
    public static final DeferredBlock<Block>
            MALUNITE_BLOCK = register("malunite_block", () -> new Block(maluniteProperties())),
            MALUNITE_SHEET_METAL = register("malunite_sheet_metal", () -> new Block(maluniteProperties())),
            CHISELED_MALUNITE = register("chiseled_malunite", () -> new Block(maluniteProperties())),
            MALUNITE_GRATE = register("malunite_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).sound(CSoundTypes.METAL_GRATE).mapColor(MapColor.COLOR_GREEN))),
            MALUNITE_PLATING = register("malunite_plating", () -> new Block(maluniteProperties())),
            MALUNITE_PLATING_STAIRS = register("malunite_plating_stairs", () -> new StairBlock(MALUNITE_PLATING.get().defaultBlockState(), maluniteProperties())),
            MALUNITE_PLATING_SLAB = register("malunite_plating_slab", () -> new SlabBlock(maluniteProperties())),
            MALUNITE_PLATING_PRESSURE_PLATE = register("malunite_plating_pressure_plate", () -> new PressurePlateBlock(CBlockSetTypes.MALUNITE, maluniteProperties().forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            MALUNITE_PLATING_BUTTON = register("malunite_plating_button", () -> new ButtonBlock(CBlockSetTypes.MALUNITE, 20, maluniteProperties().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            MALUNITE_WINDOW = register("malunite_window", () -> new TransparentBlock(obduriumProperties().instrument(NoteBlockInstrument.HAT).sound(CSoundTypes.METAL_WINDOW).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor((state, getter, pos) -> false).isSuffocating((state, getter, pos) -> false).isViewBlocking((state, getter, pos) -> false))),
            MALUNITE_PILLAR = register("malunite_pillar", () -> new RotatedPillarBlock(maluniteProperties())),
            MALUNITE_BARS = register("malunite_bars", () -> new IronBarsBlock(maluniteProperties())),
            MALUNITE_DOOR = register("malunite_door", () -> new BlockLockingDoor(CBlockSetTypes.MALUNITE, maluniteProperties().noOcclusion().pushReaction(PushReaction.DESTROY))),
            MALUNITE_TRAPDOOR = register("malunite_trapdoor", () -> new BlockLockingTrapdoor(CBlockSetTypes.MALUNITE, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_TRAPDOOR).mapColor(MapColor.COLOR_GREEN))),
            MALUNITE_BULB = register("malunite_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).sound(CSoundTypes.METAL_BULB).mapColor(MapColor.COLOR_GREEN)));
    // endregion

    /*
    Potted Plants
     */

    // region Potted Sapling Blocks
    public static final DeferredBlock<Block>
            POTTED_MAYURA_SAPLING = BLOCKS.register("potted_mayura_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, MAYURA_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_SPRUCE_SAPLING))),
            POTTED_GRIMWOOD_SAPLING = BLOCKS.register("potted_grimwood_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GRIMWOOD_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_SPRUCE_SAPLING)));
    // endregion

    // region Potted Flower Blocks
    public static final DeferredBlock<Block>
            POTTED_VIVIAN = BLOCKS.register("potted_vivian", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, VIVIAN, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_POPPY))),
            POTTED_WICKUL = BLOCKS.register("potted_wickul", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, WICKUL, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_POPPY))),
            POTTED_ICEFLOWER = BLOCKS.register("potted_iceflower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ICEFLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_POPPY)));
    // endregion

    // region Helpers
    private static BlockBehaviour.Properties iceProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_ICE)
                .strength(1.5F, 1.5F)
                .requiresCorrectToolForDrops()
                .friction(0.85F);
    }

    private static BlockBehaviour.Properties plantProperties() {
        return BlockBehaviour.Properties.of()
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .pushReaction(PushReaction.DESTROY);
    }

    private static BlockBehaviour.Properties grassProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK);
    }

    private static BlockBehaviour.Properties dirtProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT);
    }

    private static BlockBehaviour.Properties pathProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT_PATH);
    }

    private static BlockBehaviour.Properties farmlandProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.FARMLAND);
    }

    private static BlockBehaviour.Properties mudProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.MUD);
    }

    private static BlockBehaviour.Properties stoneProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.STONE);
    }

    private static BlockBehaviour.Properties packedMudProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD);
    }

    private static BlockBehaviour.Properties mudBrickProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS);
    }

    private static BlockBehaviour.Properties deepslateProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE);
    }

    private static BlockBehaviour.Properties stoneOreProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE);
    }

    private static BlockBehaviour.Properties stoneRedstoneOreProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_ORE);
    }

    private static BlockBehaviour.Properties deepslateOreProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE);
    }

    private static BlockBehaviour.Properties deepslateRedstoneOreProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_REDSTONE_ORE);
    }

    private static BlockBehaviour.Properties crystalProperties() {
        return BlockBehaviour.Properties.of()
                .sound(SoundType.AMETHYST)
                .instrument(NoteBlockInstrument.CHIME)
                .requiresCorrectToolForDrops()
                .strength(1.5F, 1.5F);
    }

    private static BlockBehaviour.Properties compressedDustProperties() {
        return BlockBehaviour.Properties.of()
                .sound(SoundType.DEEPSLATE)
                .instrument(NoteBlockInstrument.CHIME)
                .requiresCorrectToolForDrops()
                .strength(2.0F, 2.0F);
    }

    private static BlockBehaviour.Properties dustProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.SAND);
    }

    private static BlockBehaviour.Properties rawBlockProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK);
    }

    private static BlockBehaviour.Properties obduriumProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_PURPLE)
                .requiresCorrectToolForDrops()
                .strength(8.0F, 6000.0F)
                .sound(SoundType.NETHERITE_BLOCK);
    }

    private static BlockBehaviour.Properties maluniteProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_GREEN)
                .requiresCorrectToolForDrops()
                .strength(4.0F, 6.0F)
                .sound(SoundType.METAL);
    }

    private static BlockBehaviour.Properties lutrumProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.TERRACOTTA_CYAN)
                .requiresCorrectToolForDrops()
                .strength(3.0F, 6.0F)
                .sound(SoundType.COPPER);
    }

    private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
        return block -> block.getValue(BlockStateProperties.LIT) ? lightValue : 0;
    }

    // Automatically Register Block Items
    private static <T extends Block> DeferredBlock<T> register(String id, Supplier<T> block) {
        var registeredBlock = BLOCKS.register(id, block);
        CItems.ITEMS.registerSimpleBlockItem(registeredBlock);
        return registeredBlock;
    }
    // endregion
}