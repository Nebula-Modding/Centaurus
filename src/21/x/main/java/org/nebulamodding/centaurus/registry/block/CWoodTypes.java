package org.nebulamodding.centaurus.registry.block;

import net.minecraft.world.level.block.state.properties.WoodType;

public class CWoodTypes {
    public static final WoodType
            MAYURA = WoodType.register(new WoodType("mayura", CBlockSetTypes.MAYURA)),
            GRIMWOOD = WoodType.register(new WoodType("grimwood", CBlockSetTypes.GRIMWOOD));
}
