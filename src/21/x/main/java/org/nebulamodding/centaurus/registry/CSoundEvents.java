package org.nebulamodding.centaurus.registry;

import org.nebulamodding.centaurus.Centaurus;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(Registries.SOUND_EVENT, Centaurus.MOD_ID);

    // region Gristled Flesh Block Sounds
    public static final DeferredHolder<SoundEvent, SoundEvent>
            GRISTLED_FLESH_BREAK = register("block.gristled_flesh.break"),
            GRISTLED_FLESH_PLACE = register("block.gristled_flesh.place"),
            GRISTLED_FLESH_HIT = register("block.gristled_flesh.hit");
    // endregion

    // region Metal Block Sounds
    public static final DeferredHolder<SoundEvent, SoundEvent>
            METAL_GRATE_BREAK = register("block.metal_grate.break"),
            METAL_GRATE_STEP = register("block.metal_grate.step"),
            METAL_GRATE_PLACE = register("block.metal_grate.place"),
            METAL_GRATE_HIT = register("block.metal_grate.hit"),
            METAL_GRATE_FALL = register("block.metal_grate.fall"),

            METAL_BULB_BREAK = register("block.metal_bulb.break"),
            METAL_BULB_STEP = register("block.metal_bulb.step"),
            METAL_BULB_PLACE = register("block.metal_bulb.place"),
            METAL_BULB_HIT = register("block.metal_bulb.hit"),
            METAL_BULB_FALL = register("block.metal_bulb.fall");
    // endregion

    // region Netherite Block Sounds
    public static final DeferredHolder<SoundEvent, SoundEvent>
            NETHERITE_GRATE_BREAK = register("block.netherite_grate.break"),
            NETHERITE_GRATE_STEP = register("block.netherite_grate.step"),
            NETHERITE_GRATE_PLACE = register("block.netherite_grate.place"),
            NETHERITE_GRATE_HIT = register("block.netherite_grate.hit"),
            NETHERITE_GRATE_FALL = register("block.netherite_grate.fall"),

            NETHERITE_BULB_BREAK = register("block.netherite_bulb.break"),
            NETHERITE_BULB_STEP = register("block.netherite_bulb.step"),
            NETHERITE_BULB_HIT = register("block.netherite_bulb.hit"),
            NETHERITE_BULB_FALL = register("block.netherite_bulb.fall");
    // endregion

    // region Existing Block Sounds
    public static final DeferredHolder<SoundEvent, SoundEvent>
            MOSS_STEP = register("block.moss.step"),
            MOSS_FALL = register("block.moss.fall"),

            STONE_STEP = register("block.stone.step"),
            STONE_PLACE = register("block.stone.place"),
            STONE_HIT = register("block.stone.hit"),
            STONE_FALL = register("block.stone.fall"),

            COPPER_STEP = register("block.copper.step"),
            COPPER_PLACE = register("block.copper.place"),
            COPPER_HIT = register("block.copper.hit"),
            COPPER_FALL = register("block.copper.fall"),
            COPPER_BULB_BREAK = register("block.copper_bulb.step"),
            COPPER_BULB_PLACE = register("block.copper_bulb.place"),

            NETHERITE_STEP = register("block.netherite.step"),
            NETHERITE_PLACE = register("block.netherite.place"),
            NETHERITE_HIT = register("block.netherite.hit"),
            NETHERITE_FALL = register("block.netherite.fall");
    // endregion

    // region Helpers
    private static DeferredHolder<SoundEvent, SoundEvent> register(String sound) {
        return SOUND_EVENTS.register(sound, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Centaurus.MOD_ID, sound)));
    }
    // endregion
}