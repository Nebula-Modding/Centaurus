package io.github.nebulamodding.cepheus.registry;

import io.github.nebulamodding.cepheus.Cepheus;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(Registries.SOUND_EVENT, Cepheus.MOD_ID);

    /*
    Block Sounds
     */

    // Metal
    public static final DeferredHolder<SoundEvent, SoundEvent> METAL_GRATE_BREAK = register("block.metal_grate.break");
    public static final DeferredHolder<SoundEvent, SoundEvent> METAL_GRATE_STEP = register("block.metal_grate.step");
    public static final DeferredHolder<SoundEvent, SoundEvent> METAL_GRATE_PLACE = register("block.metal_grate.place");
    public static final DeferredHolder<SoundEvent, SoundEvent> METAL_GRATE_HIT = register("block.metal_grate.hit");
    public static final DeferredHolder<SoundEvent, SoundEvent> METAL_GRATE_FALL = register("block.metal_grate.fall");

    public static final DeferredHolder<SoundEvent, SoundEvent> METAL_BULB_BREAK = register("block.metal_bulb.break");
    public static final DeferredHolder<SoundEvent, SoundEvent> METAL_BULB_STEP = register("block.metal_bulb.step");
    public static final DeferredHolder<SoundEvent, SoundEvent> METAL_BULB_PLACE = register("block.metal_bulb.place");
    public static final DeferredHolder<SoundEvent, SoundEvent> METAL_BULB_HIT = register("block.metal_bulb.hit");
    public static final DeferredHolder<SoundEvent, SoundEvent> METAL_BULB_FALL = register("block.metal_bulb.fall");

    // Netherite
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_GRATE_BREAK = register("block.netherite_grate.break");
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_GRATE_STEP = register("block.netherite_grate.step");
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_GRATE_PLACE = register("block.netherite_grate.place");
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_GRATE_HIT = register("block.netherite_grate.hit");
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_GRATE_FALL = register("block.netherite_grate.fall");

    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_BULB_BREAK = register("block.netherite_bulb.break");
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_BULB_STEP = register("block.netherite_bulb.step");
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_BULB_HIT = register("block.netherite_bulb.hit");
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_BULB_FALL = register("block.netherite_bulb.fall");

    /*
    To Be Removed
     */

    public static final DeferredHolder<SoundEvent, SoundEvent> STONE_STEP = register("block.stone.step");
    public static final DeferredHolder<SoundEvent, SoundEvent> STONE_PLACE = register("block.stone.place");
    public static final DeferredHolder<SoundEvent, SoundEvent> STONE_HIT = register("block.stone.hit");
    public static final DeferredHolder<SoundEvent, SoundEvent> STONE_FALL = register("block.stone.fall");

    public static final DeferredHolder<SoundEvent, SoundEvent> COPPER_STEP = register("block.copper.step");
    public static final DeferredHolder<SoundEvent, SoundEvent> COPPER_PLACE = register("block.copper.place");
    public static final DeferredHolder<SoundEvent, SoundEvent> COPPER_HIT = register("block.copper.hit");
    public static final DeferredHolder<SoundEvent, SoundEvent> COPPER_FALL = register("block.copper.fall");
    public static final DeferredHolder<SoundEvent, SoundEvent> COPPER_BULB_BREAK = register("block.copper_bulb.step");
    public static final DeferredHolder<SoundEvent, SoundEvent> COPPER_BULB_PLACE = register("block.copper_bulb.place");

    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_STEP = register("block.netherite.step");
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_PLACE = register("block.netherite.place");
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_HIT = register("block.netherite.hit");
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_FALL = register("block.netherite.fall");

    /*
    Helper Method
     */

    private static DeferredHolder<SoundEvent, SoundEvent> register(String sound) {
        return SOUND_EVENTS.register(sound, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Cepheus.MOD_ID, sound)));
    }
}