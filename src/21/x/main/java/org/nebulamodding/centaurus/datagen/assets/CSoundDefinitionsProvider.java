package org.nebulamodding.centaurus.datagen.assets;

import org.nebulamodding.centaurus.Centaurus;
import org.nebulamodding.centaurus.registry.CSoundEvents;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.SoundDefinition;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;

public class CSoundDefinitionsProvider extends SoundDefinitionsProvider {
    public CSoundDefinitionsProvider(PackOutput output, ExistingFileHelper helper) {
        super(output, Centaurus.MOD_ID, helper);
    }

    @Override
    public void registerSounds() {
        // Grate
        add(CSoundEvents.GRISTLED_FLESH_BREAK, subtitle("block.generic.break").with(
                sound("block/gristled_flesh/break1"),
                sound("block/gristled_flesh/break2"),
                sound("block/gristled_flesh/break3"),
                sound("block/gristled_flesh/break4"),
                sound("block/gristled_flesh/break5")
        ));

        add(CSoundEvents.GRISTLED_FLESH_PLACE, subtitle("block.generic.place").with(
                sound("block/gristled_flesh/break1"),
                sound("block/gristled_flesh/break2"),
                sound("block/gristled_flesh/break3"),
                sound("block/gristled_flesh/break4"),
                sound("block/gristled_flesh/break5")
        ));

        add(CSoundEvents.GRISTLED_FLESH_HIT, subtitle("block.generic.hit").with(
                sound("block/gristled_flesh/step1"),
                sound("block/gristled_flesh/step2"),
                sound("block/gristled_flesh/step3"),
                sound("block/gristled_flesh/step4"),
                sound("block/gristled_flesh/step5"),
                sound("block/gristled_flesh/step6")
        ));

        // region Metal Block Sounds
        // Grate
        add(CSoundEvents.METAL_GRATE_BREAK, subtitle("block.generic.break").with(
                sound("block/metal_grate/break1"),
                sound("block/metal_grate/break2"),
                sound("block/metal_grate/break3"),
                sound("block/metal_grate/break4")
        ));

        add(CSoundEvents.METAL_GRATE_STEP, subtitle("block.generic.footsteps").with(
                sound("block/metal_grate/step1"),
                sound("block/metal_grate/step2"),
                sound("block/metal_grate/step3"),
                sound("block/metal_grate/step4"),
                sound("block/metal_grate/step5"),
                sound("block/metal_grate/step6")
        ));

        add(CSoundEvents.METAL_GRATE_PLACE, subtitle("block.generic.place").with(
                sound("block/metal_grate/break1"),
                sound("block/metal_grate/break2"),
                sound("block/metal_grate/break3"),
                sound("block/metal_grate/break4")
        ));

        add(CSoundEvents.METAL_GRATE_HIT, subtitle("block.generic.hit").with(
                sound("block/metal_grate/step1"),
                sound("block/metal_grate/step2"),
                sound("block/metal_grate/step3"),
                sound("block/metal_grate/step4"),
                sound("block/metal_grate/step5"),
                sound("block/metal_grate/step6")
        ));

        add(CSoundEvents.METAL_GRATE_FALL, definition().with(
                sound("block/metal_grate/step1"),
                sound("block/metal_grate/step2"),
                sound("block/metal_grate/step3"),
                sound("block/metal_grate/step4"),
                sound("block/metal_grate/step5"),
                sound("block/metal_grate/step6")
        ));

        // Bulb
        add(CSoundEvents.METAL_BULB_BREAK, subtitle("block.generic.break").with(
                sound("block/metal_bulb/break1"),
                sound("block/metal_bulb/break2"),
                sound("block/metal_bulb/break3"),
                sound("block/metal_bulb/break4")
        ));

        add(CSoundEvents.METAL_BULB_STEP, subtitle("block.generic.footsteps").with(
                sound("block/metal_bulb/step1"),
                sound("block/metal_bulb/step2"),
                sound("block/metal_bulb/step3"),
                sound("block/metal_bulb/step4"),
                sound("block/metal_bulb/step5"),
                sound("block/metal_bulb/step6")
        ));

        add(CSoundEvents.METAL_BULB_PLACE, subtitle("block.generic.place").with(
                sound("block/metal_bulb/place1"),
                sound("block/metal_bulb/place2"),
                sound("block/metal_bulb/place3"),
                sound("block/metal_bulb/place4")
        ));

        add(CSoundEvents.METAL_BULB_HIT, subtitle("block.generic.hit").with(
                sound("block/metal_bulb/step1"),
                sound("block/metal_bulb/step2"),
                sound("block/metal_bulb/step3"),
                sound("block/metal_bulb/step4"),
                sound("block/metal_bulb/step5"),
                sound("block/metal_bulb/step6")
        ));

        add(CSoundEvents.METAL_BULB_FALL, definition().with(
                sound("block/metal_bulb/step1"),
                sound("block/metal_bulb/step2"),
                sound("block/metal_bulb/step3"),
                sound("block/metal_bulb/step4"),
                sound("block/metal_bulb/step5"),
                sound("block/metal_bulb/step6")
        ));
        // endregion

        // region Netherite Block Sounds
        // Bulb
        add(CSoundEvents.NETHERITE_BULB_BREAK, subtitle("block.generic.break").with(
                sound("block/netherite_bulb/break1"),
                sound("block/netherite_bulb/break2"),
                sound("block/netherite_bulb/break3"),
                sound("block/netherite_bulb/break4")
        ));

        add(CSoundEvents.NETHERITE_BULB_STEP, subtitle("block.generic.footsteps").with(
                sound("block/netherite_bulb/step1"),
                sound("block/netherite_bulb/step2"),
                sound("block/netherite_bulb/step3"),
                sound("block/netherite_bulb/step4"),
                sound("block/netherite_bulb/step5"),
                sound("block/netherite_bulb/step6")
        ));

        add(CSoundEvents.NETHERITE_BULB_HIT, subtitle("block.generic.hit").with(
                sound("block/netherite_bulb/step1"),
                sound("block/netherite_bulb/step2"),
                sound("block/netherite_bulb/step3"),
                sound("block/netherite_bulb/step4"),
                sound("block/netherite_bulb/step5"),
                sound("block/netherite_bulb/step6")
        ));

        add(CSoundEvents.NETHERITE_BULB_FALL, definition().with(
                sound("block/netherite_bulb/step1"),
                sound("block/netherite_bulb/step2"),
                sound("block/netherite_bulb/step3"),
                sound("block/netherite_bulb/step4"),
                sound("block/netherite_bulb/step5"),
                sound("block/netherite_bulb/step6")
        ));

        // Grate
        add(CSoundEvents.NETHERITE_GRATE_BREAK, subtitle("block.generic.break").with(
                sound("block/netherite_grate/break1"),
                sound("block/netherite_grate/break2"),
                sound("block/netherite_grate/break3"),
                sound("block/netherite_grate/break4")
        ));

        add(CSoundEvents.NETHERITE_GRATE_STEP, subtitle("block.generic.footsteps").with(
                sound("block/netherite_grate/step1"),
                sound("block/netherite_grate/step2"),
                sound("block/netherite_grate/step3"),
                sound("block/netherite_grate/step4"),
                sound("block/netherite_grate/step5"),
                sound("block/netherite_grate/step6")
        ));

        add(CSoundEvents.NETHERITE_GRATE_PLACE, subtitle("block.generic.place").with(
                sound("block/netherite_grate/break1"),
                sound("block/netherite_grate/break2"),
                sound("block/netherite_grate/break3"),
                sound("block/netherite_grate/break4")
        ));

        add(CSoundEvents.NETHERITE_GRATE_HIT, subtitle("block.generic.hit").with(
                sound("block/netherite_grate/step1"),
                sound("block/netherite_grate/step2"),
                sound("block/netherite_grate/step3"),
                sound("block/netherite_grate/step4"),
                sound("block/netherite_grate/step5"),
                sound("block/netherite_grate/step6")
        ));

        add(CSoundEvents.NETHERITE_GRATE_FALL, definition().with(
                sound("block/netherite_grate/step1"),
                sound("block/netherite_grate/step2"),
                sound("block/netherite_grate/step3"),
                sound("block/netherite_grate/step4"),
                sound("block/netherite_grate/step5"),
                sound("block/netherite_grate/step6")
        ));
        // endregion

        // region Existing Block Sounds
        // Moss
        add(CSoundEvents.MOSS_STEP, subtitle("block.generic.footsteps").with(
                mcSound("block/moss/step1"),
                mcSound("block/moss/step2"),
                mcSound("block/moss/step3"),
                mcSound("block/moss/step4"),
                mcSound("block/moss/step5"),
                mcSound("block/moss/step6")
        ));

        add(CSoundEvents.MOSS_FALL, definition().with(
                mcSound("block/moss/step1"),
                mcSound("block/moss/step2"),
                mcSound("block/moss/step3"),
                mcSound("block/moss/step4"),
                mcSound("block/moss/step5"),
                mcSound("block/moss/step6")
        ));

        // Stone
        add(CSoundEvents.STONE_STEP, subtitle("block.generic.footsteps").with(
                mcSound("step/stone1"),
                mcSound("step/stone2"),
                mcSound("step/stone3"),
                mcSound("step/stone4"),
                mcSound("step/stone5"),
                mcSound("step/stone6")
        ));

        add(CSoundEvents.STONE_PLACE, subtitle("block.generic.place").with(
                mcSound("dig/stone1"),
                mcSound("dig/stone2"),
                mcSound("dig/stone3"),
                mcSound("dig/stone4")
        ));

        add(CSoundEvents.STONE_HIT, subtitle("block.generic.hit").with(
                mcSound("step/stone1"),
                mcSound("step/stone2"),
                mcSound("step/stone3"),
                mcSound("step/stone4"),
                mcSound("step/stone5"),
                mcSound("step/stone6")
        ));

        add(CSoundEvents.STONE_FALL, definition().with(
                mcSound("step/stone1"),
                mcSound("step/stone2"),
                mcSound("step/stone3"),
                mcSound("step/stone4"),
                mcSound("step/stone5"),
                mcSound("step/stone6")
        ));

        // Copper
        add(CSoundEvents.COPPER_STEP, subtitle("block.generic.footsteps").with(
                mcSound("block/copper/step1"),
                mcSound("block/copper/step2"),
                mcSound("block/copper/step3"),
                mcSound("block/copper/step4"),
                mcSound("block/copper/step5"),
                mcSound("block/copper/step6")
        ));

        add(CSoundEvents.COPPER_PLACE, subtitle("block.generic.place").with(
                mcSound("block/copper/break1"),
                mcSound("block/copper/break2"),
                mcSound("block/copper/break3"),
                mcSound("block/copper/break4")
        ));

        add(CSoundEvents.COPPER_HIT, subtitle("block.generic.hit").with(
                mcSound("block/copper/step1"),
                mcSound("block/copper/step2"),
                mcSound("block/copper/step3"),
                mcSound("block/copper/step4"),
                mcSound("block/copper/step5"),
                mcSound("block/copper/step6")
        ));

        add(CSoundEvents.COPPER_FALL, definition().with(
                mcSound("block/copper/step1"),
                mcSound("block/copper/step2"),
                mcSound("block/copper/step3"),
                mcSound("block/copper/step4"),
                mcSound("block/copper/step5"),
                mcSound("block/copper/step6")
        ));

        add(CSoundEvents.COPPER_BULB_BREAK, subtitle("block.generic.break").with(
                mcSound("block/copper_bulb/break1"),
                mcSound("block/copper_bulb/break2"),
                mcSound("block/copper_bulb/break3"),
                mcSound("block/copper_bulb/break4")
        ));

        add(CSoundEvents.COPPER_BULB_PLACE, subtitle("block.generic.place").with(
                mcSound("block/copper_bulb/place1"),
                mcSound("block/copper_bulb/place2"),
                mcSound("block/copper_bulb/place3"),
                mcSound("block/copper_bulb/place4")
        ));

        add(CSoundEvents.NETHERITE_STEP, subtitle("block.generic.footsteps").with(
                mcSound("block/netherite/step1"),
                mcSound("block/netherite/step2"),
                mcSound("block/netherite/step3"),
                mcSound("block/netherite/step4"),
                mcSound("block/netherite/step5"),
                mcSound("block/netherite/step6")
        ));

        add(CSoundEvents.NETHERITE_PLACE, subtitle("block.generic.place").with(
                mcSound("block/netherite/break1"),
                mcSound("block/netherite/break2"),
                mcSound("block/netherite/break3"),
                mcSound("block/netherite/break4")
        ));

        add(CSoundEvents.NETHERITE_HIT, subtitle("block.generic.hit").with(
                mcSound("block/netherite/step1"),
                mcSound("block/netherite/step2"),
                mcSound("block/netherite/step3"),
                mcSound("block/netherite/step4"),
                mcSound("block/netherite/step5"),
                mcSound("block/netherite/step6")
        ));

        add(CSoundEvents.NETHERITE_FALL, definition().with(
                mcSound("block/netherite/step1"),
                mcSound("block/netherite/step2"),
                mcSound("block/netherite/step3"),
                mcSound("block/netherite/step4"),
                mcSound("block/netherite/step5"),
                mcSound("block/netherite/step6")
        ));
        // endregion
    }

    // region Helpers
    private SoundDefinition subtitle(String subtitle) {
        return definition().subtitle("subtitles." + subtitle);
    }

    protected static SoundDefinition.Sound sound(String location) {
        return sound(ResourceLocation.fromNamespaceAndPath(Centaurus.MOD_ID, location));
    }

    private static SoundDefinition.Sound mcSound(String location) {
        return sound(ResourceLocation.withDefaultNamespace(location));
    }
    // endregion
}
