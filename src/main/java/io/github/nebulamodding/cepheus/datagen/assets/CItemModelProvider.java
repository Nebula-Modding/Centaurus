package io.github.nebulamodding.cepheus.datagen.assets;

import io.github.nebulamodding.cepheus.Cepheus;
import io.github.nebulamodding.cepheus.registry.block.CBlocks;
import io.github.nebulamodding.cepheus.registry.item.CItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.ArrayList;
import java.util.List;

public class CItemModelProvider extends ItemModelProvider {
    public CItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Cepheus.MOD_ID, existingFileHelper);
    }

    private final ModelFile GENERATED = getExistingFile(mcLoc("item/generated"));
    private final ModelFile HANDHELD = getExistingFile(mcLoc("item/handheld"));

    @Override
    protected void registerModels() {
        final List<DeferredHolder<Item, ? extends Item>> excludedItems = new ArrayList<>();
        // Items excluded from having a model automatically provided
        excludedItems.add(CItems.ENCHANTED_GOLDEN_AZURE_ROOT);
        excludedItems.add(CItems.OBDURIUM_HAMMER);
        excludedItems.add(CItems.PENCIL);
        excludedItems.add(CItems.DENSE_PENCIL);

        /*
        Manual Item Models
         */

        itemModel(CItems.ENCHANTED_GOLDEN_AZURE_ROOT, itemLoc(CItems.GOLDEN_AZURE_ROOT), GENERATED);
        itemModel(CItems.OBDURIUM_HAMMER, HANDHELD);
        itemModel(CItems.PENCIL, HANDHELD);
        itemModel(CItems.DENSE_PENCIL, HANDHELD);

        /*
        Manual Block Models
         */

        itemModel(CBlocks.MAYURA_DOOR, GENERATED);
        blockItemModel(CBlocks.MAYURA_SAPLING, CBlocks.MAYURA_SAPLING, GENERATED);

        itemModel(CBlocks.GRIMWOOD_DOOR, GENERATED);
        blockItemModel(CBlocks.GRIMWOOD_SAPLING, CBlocks.GRIMWOOD_SAPLING, GENERATED);

        blockModel(CBlocks.FRIGUS_GRASS_BLOCK);
        blockModel(CBlocks.FRIGUS_DIRT_PATH);
        blockModel(CBlocks.FRIGUS_FARMLAND);
        blockItemModel(CBlocks.FRIGUS_SHORT_GRASS, CBlocks.FRIGUS_SHORT_GRASS, GENERATED);
        blockItemModel(CBlocks.VIVIAN, CBlocks.VIVIAN, GENERATED);
        blockItemModel(CBlocks.WICKUL, CBlocks.WICKUL, GENERATED);
        blockItemModel(CBlocks.ICEFLOWER, CBlocks.ICEFLOWER, GENERATED);

        blockItemModel(CBlocks.GRAPHITE_CLUSTER, CBlocks.GRAPHITE_CLUSTER, GENERATED);

        blockItemModel(CBlocks.TUMOR, CBlocks.TUMOR, GENERATED);
        blockModel(CBlocks.GRISTLED_FLESH);
        blockItemModel(CBlocks.SHORT_GRISTLES, CBlocks.SHORT_GRISTLES, GENERATED);
        blockItemModel(CBlocks.TALL_GRISTLES, CBlocks.TALL_GRISTLES, GENERATED);

        itemModel(CBlocks.LUTRUM_DOOR, GENERATED);
        blockModel(CBlocks.LUTRUM_BULB);
        itemModel(CBlocks.EXPOSED_LUTRUM_DOOR, GENERATED);
        blockModel(CBlocks.EXPOSED_LUTRUM_BULB);
        itemModel(CBlocks.WEATHERED_LUTRUM_DOOR, GENERATED);
        blockModel(CBlocks.WEATHERED_LUTRUM_BULB);
        itemModel(CBlocks.OXIDIZED_LUTRUM_DOOR, GENERATED);
        blockModel(CBlocks.OXIDIZED_LUTRUM_BULB);

        /*
        Automated Item Models
         */

        CItems.ITEMS.getEntries()
                .stream()
                .filter(i -> !(i.get() instanceof BlockItem) && !excludedItems.contains(i))
                .forEach(entry -> basicItem(entry.get()));
    }
    public void blockModel(DeferredBlock<?> block) {
        withExistingParent(block.getId().getPath(), modLoc("block/" + block.getId().getPath()));
    }
    public void blockModel(DeferredBlock<?> block, String suffix) {
        withExistingParent(block.getId().getPath(), modLoc("block/" + block.getId().getPath() + "_" + suffix));
    }
    public void blockItemModel(DeferredBlock<?> block, DeferredBlock<?> textureBlock, ModelFile modelFile) {
        getBuilder(block.getId().getPath()).parent(modelFile).texture("layer0", "block/" + textureBlock.getId().getPath());
    }
    public ItemModelBuilder itemModel(DeferredHolder<?, ?> item, ModelFile modelFile) {
        return getBuilder(item.getId().getPath()).parent(modelFile).texture("layer0", "item/" + item.getId().getPath());
    }
    public ItemModelBuilder itemModel(DeferredHolder<?, ?> item, ResourceLocation texture, ModelFile modelFile) {
        return getBuilder(item.getId().getPath()).parent(modelFile).texture("layer0", texture);
    }
    public void itemModelWithSuffix(DeferredItem<?> item, ModelFile modelFile, String suffix) {
        getBuilder(item.getId().getPath() + "_" + suffix).parent(modelFile).texture("layer0", "item/" + item.getId().getPath() + "_" + suffix);
    }
    private void spawnEggModel(DeferredItem<Item> item) {
        withExistingParent(item.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }
    private ResourceLocation itemLoc(DeferredItem<? extends Item> item) {
        return modLoc("item/" + item.getId().getPath());
    }
    private ModelFile.ExistingModelFile getModel(DeferredItem<?> item, String suffix) {
        return new ModelFile.ExistingModelFile(modLoc("item/" + item.getId().getPath() + "_" + suffix), existingFileHelper);
    }
}