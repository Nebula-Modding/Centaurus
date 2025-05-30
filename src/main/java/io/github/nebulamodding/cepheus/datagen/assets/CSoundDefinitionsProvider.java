package io.github.nebulamodding.cepheus.datagen.assets;

import io.github.nebulamodding.cepheus.Cepheus;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.SoundDefinition;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;

public class CSoundDefinitionsProvider extends SoundDefinitionsProvider {
    public CSoundDefinitionsProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Cepheus.MOD_ID, existingFileHelper);
    }
    @Override
    public void registerSounds() {
        // Sounds go here
    }
    private SoundDefinition addSubtitle(String subtitle) {
        return definition().subtitle("subtitles." + subtitle);
    }
}
