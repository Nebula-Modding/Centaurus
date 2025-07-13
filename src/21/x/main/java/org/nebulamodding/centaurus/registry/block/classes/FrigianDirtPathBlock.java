package org.nebulamodding.centaurus.registry.block.classes;

import org.nebulamodding.centaurus.registry.block.CBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class FrigianDirtPathBlock extends DirtPathBlock {
    public FrigianDirtPathBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        return !this.defaultBlockState().canSurvive(blockPlaceContext.getLevel(), blockPlaceContext.getClickedPos())
                ? Block.pushEntitiesUp(this.defaultBlockState(), CBlocks.FRIGIAN_DIRT.get().defaultBlockState(), blockPlaceContext.getLevel(), blockPlaceContext.getClickedPos())
                : super.getStateForPlacement(blockPlaceContext);
    }

    @Override
    protected void tick(@NotNull BlockState blockState, @NotNull ServerLevel serverLevel, @NotNull BlockPos blockPos, @NotNull RandomSource randomSource) {
        FrigianFarmlandBlock.turnToFrigianDirt(null, blockState, serverLevel, blockPos);
    }
}
