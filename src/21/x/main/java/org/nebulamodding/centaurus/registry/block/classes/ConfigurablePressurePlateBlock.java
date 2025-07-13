package org.nebulamodding.centaurus.registry.block.classes;

import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class ConfigurablePressurePlateBlock extends PressurePlateBlock {
    private final int ticksToStayPressed;

    public ConfigurablePressurePlateBlock(BlockSetType type, int ticksToStayPressed, Properties properties) {
        super(type, properties);
        this.ticksToStayPressed = ticksToStayPressed;
    }

    protected int getPressedTime() {
        return ticksToStayPressed;
    }
}