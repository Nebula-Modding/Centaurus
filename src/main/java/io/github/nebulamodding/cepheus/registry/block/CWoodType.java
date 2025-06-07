package io.github.nebulamodding.cepheus.registry.block;

import net.minecraft.world.level.block.state.properties.WoodType;

public class CWoodType {
    public static final WoodType MAYURA = WoodType.register(new WoodType("mayura", CBlockSetType.MAYURA));
    public static final WoodType GRIMWOOD = WoodType.register(new WoodType("grimwood", CBlockSetType.GRIMWOOD));
}
