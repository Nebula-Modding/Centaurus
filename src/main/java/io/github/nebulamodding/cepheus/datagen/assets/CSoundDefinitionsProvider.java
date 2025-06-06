package io.github.nebulamodding.cepheus.datagen.assets;

import io.github.nebulamodding.cepheus.Cepheus;
import io.github.nebulamodding.cepheus.registry.CSounds;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.SoundDefinition;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;

public class CSoundDefinitionsProvider extends SoundDefinitionsProvider {
    public CSoundDefinitionsProvider(PackOutput output, ExistingFileHelper helper) {
        super(output, Cepheus.MOD_ID, helper);
    }
    @Override
    public void registerSounds() {
        add(CSounds.COPPER_WINDOW_BREAK, subtitle("block.generic.break").with(mcSound("block/copper_bulb/break1"), mcSound("block/copper_bulb/break2"), mcSound("block/copper_bulb/break3"), mcSound("block/copper_bulb/break4")));
        add(CSounds.COPPER_WINDOW_FALL, definition().with(mcSound("block/copper_bulb/step1"), mcSound("block/copper_bulb/step2"), mcSound("block/copper_bulb/step3"), mcSound("block/copper_bulb/step4"), mcSound("block/copper_bulb/step5"), mcSound("block/copper_bulb/step6")));
        add(CSounds.COPPER_WINDOW_HIT, subtitle("block.generic.hit").with(mcSound("block/copper/step1"), mcSound("block/copper/step2"), mcSound("block/copper/step3"), mcSound("block/copper/step4"), mcSound("block/copper/step5"), mcSound("block/copper/step6")));
        add(CSounds.COPPER_WINDOW_PLACE, subtitle("block.generic.place").with(mcSound("block/copper/break1"), mcSound("block/copper/break2"), mcSound("block/copper/break3"), mcSound("block/copper/break4")));
        add(CSounds.COPPER_WINDOW_STEP, subtitle("block.generic.footsteps").with(mcSound("block/copper/step1"), mcSound("block/copper/step2"), mcSound("block/copper/step3"), mcSound("block/copper/step4"), mcSound("block/copper/step5"), mcSound("block/copper/step6")));

        add(CSounds.NETHERITE_WINDOW_BREAK, subtitle("block.generic.break").with(sound("block/netherite_bulb/break1"), sound("block/netherite_bulb/break2"), sound("block/netherite_bulb/break3"), sound("block/netherite_bulb/break4")));
        add(CSounds.NETHERITE_WINDOW_FALL, definition().with(sound("block/netherite_bulb/step1"), sound("block/netherite_bulb/step2"), sound("block/netherite_bulb/step3"), sound("block/netherite_bulb/step4"), sound("block/netherite_bulb/step5"), sound("block/netherite_bulb/step6")));
        add(CSounds.NETHERITE_WINDOW_HIT, subtitle("block.generic.hit").with(mcSound("block/netherite/step1"), mcSound("block/netherite/step2"), mcSound("block/netherite/step3"), mcSound("block/netherite/step4"), mcSound("block/netherite/step5"), mcSound("block/netherite/step6")));
        add(CSounds.NETHERITE_WINDOW_PLACE, subtitle("block.generic.place").with(mcSound("block/netherite/break1"), mcSound("block/netherite/break2"), mcSound("block/netherite/break3"), mcSound("block/netherite/break4")));
        add(CSounds.NETHERITE_WINDOW_STEP, subtitle("block.generic.footsteps").with(mcSound("block/netherite/step1"), mcSound("block/netherite/step2"), mcSound("block/netherite/step3"), mcSound("block/netherite/step4"), mcSound("block/netherite/step5"), mcSound("block/netherite/step6")));

        add(CSounds.NETHERITE_BULB_BREAK, subtitle("block.generic.break").with(sound("block/netherite_bulb/break1"), sound("block/netherite_bulb/break2"), sound("block/netherite_bulb/break3"), sound("block/netherite_bulb/break4")));
        add(CSounds.NETHERITE_BULB_FALL, definition().with(sound("block/netherite_bulb/step1"), sound("block/netherite_bulb/step2"), sound("block/netherite_bulb/step3"), sound("block/netherite_bulb/step4"), sound("block/netherite_bulb/step5"), sound("block/netherite_bulb/step6")));
        add(CSounds.NETHERITE_BULB_HIT, subtitle("block.generic.hit").with(sound("block/netherite_bulb/step1"), sound("block/netherite_bulb/step2"), sound("block/netherite_bulb/step3"), sound("block/netherite_bulb/step4"), sound("block/netherite_bulb/step5"), sound("block/netherite_bulb/step6")));
        add(CSounds.NETHERITE_BULB_PLACE, subtitle("block.generic.place").with(mcSound("block/copper_bulb/place1"), mcSound("block/copper_bulb/place2"), mcSound("block/copper_bulb/place3"), mcSound("block/copper_bulb/place4")));
        add(CSounds.NETHERITE_BULB_STEP, subtitle("block.generic.footsteps").with(sound("block/netherite_bulb/step1"), sound("block/netherite_bulb/step2"), sound("block/netherite_bulb/step3"), sound("block/netherite_bulb/step4"), sound("block/netherite_bulb/step5"), sound("block/netherite_bulb/step6")));

        add(CSounds.NETHERITE_GRATE_BREAK, subtitle("block.generic.break").with(sound("block/netherite_grate/break1"), sound("block/netherite_grate/break2"), sound("block/netherite_grate/break3"), sound("block/netherite_grate/break4")));
        add(CSounds.NETHERITE_GRATE_FALL, definition().with(sound("block/netherite_grate/step1"), sound("block/netherite_grate/step2"), sound("block/netherite_grate/step3"), sound("block/netherite_grate/step4"), sound("block/netherite_grate/step5"), sound("block/netherite_grate/step6")));
        add(CSounds.NETHERITE_GRATE_HIT, subtitle("block.generic.hit").with(sound("block/netherite_grate/step1"), sound("block/netherite_grate/step2"), sound("block/netherite_grate/step3"), sound("block/netherite_grate/step4"), sound("block/netherite_grate/step5"), sound("block/netherite_grate/step6")));
        add(CSounds.NETHERITE_GRATE_PLACE, subtitle("block.generic.place").with(sound("block/netherite_grate/break1"), sound("block/netherite_grate/break2"), sound("block/netherite_grate/break3"), sound("block/netherite_grate/break4")));
        add(CSounds.NETHERITE_GRATE_STEP, subtitle("block.generic.footsteps").with(sound("block/netherite_grate/step1"), sound("block/netherite_grate/step2"), sound("block/netherite_grate/step3"), sound("block/netherite_grate/step4"), sound("block/netherite_grate/step5"), sound("block/netherite_grate/step6")));
    }
    private SoundDefinition subtitle(String subtitle) {
        return definition().subtitle("subtitles." + subtitle);
    }
    protected static SoundDefinition.Sound sound(String location) {
        return sound(ResourceLocation.fromNamespaceAndPath(Cepheus.MOD_ID, location));
    }
    private static SoundDefinition.Sound mcSound(String location) {
        return sound(ResourceLocation.withDefaultNamespace(location));
    }
}
