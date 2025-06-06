package io.github.nebulamodding.cepheus.registry;

import io.github.nebulamodding.cepheus.Cepheus;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.common.util.DeferredSoundType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(Registries.SOUND_EVENT, Cepheus.MOD_ID);

    public static final DeferredHolder<SoundEvent, SoundEvent> COPPER_WINDOW_BREAK = register("block.copper_window.break");
    public static final DeferredHolder<SoundEvent, SoundEvent> COPPER_WINDOW_STEP = register("block.copper_window.step");
    public static final DeferredHolder<SoundEvent, SoundEvent> COPPER_WINDOW_PLACE = register("block.copper_window.place");
    public static final DeferredHolder<SoundEvent, SoundEvent> COPPER_WINDOW_HIT = register("block.copper_window.hit");
    public static final DeferredHolder<SoundEvent, SoundEvent> COPPER_WINDOW_FALL = register("block.copper_window.fall");
    public static final DeferredSoundType COPPER_WINDOW = new DeferredSoundType(1, 1, COPPER_WINDOW_BREAK, COPPER_WINDOW_STEP, COPPER_WINDOW_PLACE, COPPER_WINDOW_HIT, COPPER_WINDOW_FALL);

    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_WINDOW_BREAK = register("block.netherite_window.break");
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_WINDOW_STEP = register("block.netherite_window.step");
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_WINDOW_PLACE = register("block.netherite_window.place");
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_WINDOW_HIT = register("block.netherite_window.hit");
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_WINDOW_FALL = register("block.netherite_window.fall");
    public static final DeferredSoundType NETHERITE_WINDOW = new DeferredSoundType(1, 1, NETHERITE_WINDOW_BREAK, NETHERITE_WINDOW_STEP, NETHERITE_WINDOW_PLACE, NETHERITE_WINDOW_HIT, NETHERITE_WINDOW_FALL);

    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_BULB_BREAK = register("block.netherite_bulb.break");
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_BULB_STEP = register("block.netherite_bulb.step");
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_BULB_PLACE = register("block.netherite_bulb.place");
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_BULB_HIT = register("block.netherite_bulb.hit");
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHERITE_BULB_FALL = register("block.netherite_bulb.fall");
    public static final DeferredSoundType NETHERITE_BULB = new DeferredSoundType(1, 1, NETHERITE_BULB_BREAK, NETHERITE_BULB_STEP, NETHERITE_BULB_PLACE, NETHERITE_BULB_HIT, NETHERITE_BULB_FALL);

    // Actually register stuff
    private static DeferredHolder<SoundEvent, SoundEvent> register(String sound) {
        return SOUND_EVENTS.register(sound, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Cepheus.MOD_ID, sound)));
    }
}