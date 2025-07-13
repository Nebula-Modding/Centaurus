package org.nebulamodding.centaurus.registry.block;

import org.nebulamodding.centaurus.registry.CSoundEvents;
import net.neoforged.neoforge.common.util.DeferredSoundType;

public class CSoundTypes {
    // region Body-Specific
    public static final DeferredSoundType
            GRISTLED_FLESH = new DeferredSoundType(
            1.0F,
            1.0F,
            CSoundEvents.GRISTLED_FLESH_BREAK,
            CSoundEvents.MOSS_STEP,
            CSoundEvents.GRISTLED_FLESH_PLACE,
            CSoundEvents.GRISTLED_FLESH_HIT,
            CSoundEvents.MOSS_FALL
    );
    // endregion

    // region Metal
    public static final DeferredSoundType
            METAL_GRATE = new DeferredSoundType(
                    1.0F,
                1.5F,
                CSoundEvents.METAL_GRATE_BREAK,
                CSoundEvents.METAL_GRATE_STEP,
                CSoundEvents.METAL_GRATE_PLACE,
                CSoundEvents.METAL_GRATE_HIT,
                CSoundEvents.METAL_GRATE_FALL
    ),
            METAL_WINDOW = new DeferredSoundType(
                1.0F,
                1.5F,
                CSoundEvents.METAL_BULB_BREAK,
                CSoundEvents.STONE_STEP,
                CSoundEvents.STONE_PLACE,
                CSoundEvents.STONE_HIT,
                CSoundEvents.STONE_FALL
    ),
        METAL_BULB = new DeferredSoundType(
                1.0F,
                1.5F,
                CSoundEvents.METAL_BULB_BREAK,
                CSoundEvents.METAL_BULB_STEP,
                CSoundEvents.METAL_BULB_PLACE,
                CSoundEvents.METAL_BULB_HIT,
                CSoundEvents.METAL_BULB_FALL
    );
    // endregion

    // region Copper
    public static final DeferredSoundType COPPER_WINDOW = new DeferredSoundType(
            1.0F,
            1.0F,
            CSoundEvents.COPPER_BULB_BREAK,
            CSoundEvents.COPPER_STEP,
            CSoundEvents.COPPER_PLACE,
            CSoundEvents.COPPER_HIT,
            CSoundEvents.COPPER_FALL
    );
    // endregion

    // region Netherite
    public static final DeferredSoundType
            NETHERITE_GRATE = new DeferredSoundType(
                1.0F,
                1.0F,
                CSoundEvents.NETHERITE_GRATE_BREAK,
                CSoundEvents.NETHERITE_GRATE_STEP,
                CSoundEvents.NETHERITE_GRATE_PLACE,
                CSoundEvents.NETHERITE_GRATE_HIT,
                CSoundEvents.NETHERITE_GRATE_FALL
    ),
            NETHERITE_WINDOW = new DeferredSoundType(
                1.0F,
                1.0F,
                CSoundEvents.NETHERITE_BULB_BREAK,
                CSoundEvents.NETHERITE_STEP,
                CSoundEvents.NETHERITE_PLACE,
                CSoundEvents.NETHERITE_HIT,
                CSoundEvents.NETHERITE_FALL
    ),
            NETHERITE_BULB = new DeferredSoundType(
                1.0F,
                1.0F,
                CSoundEvents.NETHERITE_BULB_BREAK,
                CSoundEvents.NETHERITE_BULB_STEP,
                CSoundEvents.COPPER_BULB_PLACE,
                CSoundEvents.NETHERITE_BULB_HIT,
                CSoundEvents.NETHERITE_BULB_FALL
    );
    // endregion
}