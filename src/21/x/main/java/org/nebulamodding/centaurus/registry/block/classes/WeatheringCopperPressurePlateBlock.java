package org.nebulamodding.centaurus.registry.block.classes;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class WeatheringCopperPressurePlateBlock extends ConfigurablePressurePlateBlock implements WeatheringCopper {
    private final WeatheringCopper.WeatherState weatherState;
    public WeatheringCopperPressurePlateBlock(BlockSetType type, WeatherState weatherState, int ticksToStayPressed, Properties properties) {
        super(type, ticksToStayPressed, properties);
        this.weatherState = weatherState;
    }

    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        this.changeOverTime(state, level, pos, random);
    }

    protected boolean isRandomlyTicking(BlockState state) {
        return WeatheringCopper.getNext(state.getBlock()).isPresent();
    }

    public WeatheringCopper.WeatherState getAge() {
        return this.weatherState;
    }
}