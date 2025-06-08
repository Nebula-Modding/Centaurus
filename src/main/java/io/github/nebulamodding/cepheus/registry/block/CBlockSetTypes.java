package io.github.nebulamodding.cepheus.registry.block;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;

import static net.minecraft.world.level.block.state.properties.BlockSetType.register;

public class CBlockSetTypes {

    /*
    Woods
     */

    public static final BlockSetType
            MAYURA = register(new BlockSetType("mayura")),
            GRIMWOOD = register(new BlockSetType("grimwood"));

    /*
    Stones
     */

    public static final BlockSetType
            BLUESCHIST = register(new BlockSetType("blueschist",
                true,
                true,
                false,
                BlockSetType.PressurePlateSensitivity.MOBS,
                SoundType.STONE,
                SoundEvents.IRON_DOOR_CLOSE,
                SoundEvents.IRON_DOOR_OPEN,
                SoundEvents.IRON_TRAPDOOR_CLOSE,
                SoundEvents.IRON_TRAPDOOR_OPEN,
                SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF,
                SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON,
                SoundEvents.STONE_BUTTON_CLICK_OFF,
                SoundEvents.STONE_BUTTON_CLICK_ON)
    ),
            KARCASS_STONE = register(new BlockSetType("karcass_stone",
                true,
                true,
                false,
                BlockSetType.PressurePlateSensitivity.MOBS,
                SoundType.STONE,
                SoundEvents.IRON_DOOR_CLOSE,
                SoundEvents.IRON_DOOR_OPEN,
                SoundEvents.IRON_TRAPDOOR_CLOSE,
                SoundEvents.IRON_TRAPDOOR_OPEN,
                SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF,
                SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON,
                SoundEvents.STONE_BUTTON_CLICK_OFF,
                SoundEvents.STONE_BUTTON_CLICK_ON)
    );

    /*
    Metals
     */

    public static final BlockSetType
            LUTRUM = register(new BlockSetType("lutrum",
                true,
                true,
                false,
                BlockSetType.PressurePlateSensitivity.EVERYTHING,
                SoundType.COPPER,
                SoundEvents.COPPER_DOOR_CLOSE,
                SoundEvents.COPPER_DOOR_OPEN,
                SoundEvents.COPPER_TRAPDOOR_CLOSE,
                SoundEvents.COPPER_TRAPDOOR_OPEN,
                SoundEvents.METAL_PRESSURE_PLATE_CLICK_OFF,
                SoundEvents.METAL_PRESSURE_PLATE_CLICK_ON,
                SoundEvents.STONE_BUTTON_CLICK_OFF,
                SoundEvents.STONE_BUTTON_CLICK_ON)
    ),
            OBDURIUM = register(new BlockSetType("obdurium",
                true,
                false,
                false,
                BlockSetType.PressurePlateSensitivity.EVERYTHING,
                SoundType.NETHERITE_BLOCK,
                SoundEvents.COPPER_DOOR_CLOSE,
                SoundEvents.COPPER_DOOR_OPEN,
                SoundEvents.COPPER_TRAPDOOR_CLOSE,
                SoundEvents.COPPER_TRAPDOOR_OPEN,
                SoundEvents.METAL_PRESSURE_PLATE_CLICK_OFF,
                SoundEvents.METAL_PRESSURE_PLATE_CLICK_ON,
                SoundEvents.STONE_BUTTON_CLICK_OFF,
                SoundEvents.STONE_BUTTON_CLICK_ON)
    ),
            MALUNITE = register(new BlockSetType("malunite",
                true,
                true,
                false,
                BlockSetType.PressurePlateSensitivity.EVERYTHING,
                SoundType.METAL,
                SoundEvents.IRON_DOOR_CLOSE,
                SoundEvents.IRON_DOOR_OPEN,
                SoundEvents.IRON_TRAPDOOR_CLOSE,
                SoundEvents.IRON_TRAPDOOR_OPEN,
                SoundEvents.METAL_PRESSURE_PLATE_CLICK_OFF,
                SoundEvents.METAL_PRESSURE_PLATE_CLICK_ON,
                SoundEvents.STONE_BUTTON_CLICK_OFF,
                SoundEvents.STONE_BUTTON_CLICK_ON)
    );
}
