package io.github.nebulamodding.cepheus.registry.item;

import io.github.nebulamodding.cepheus.Cepheus;
import io.github.nebulamodding.cepheus.registry.item.itemtypes.ObduriumHammerItem;
import martian.regolith.DeferredHolders;
import martian.regolith.RegolithItemUtil;
import martian.regolith.neoforge.RegolithNeoForge;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Cepheus.MOD_ID);

    /*
    Crop Items
     */

    public static final DeferredItem<Item>
            BRUMA = ITEMS.register("bruma", () -> new Item(new Item.Properties())),
            BRUMA_LOAF = ITEMS.register("bruma_loaf", () -> new Item(new Item.Properties().food(CFoods.BRUMA_LOAF)));
    public static final DeferredItem<Item>
            AZURE_ROOT = ITEMS.register("azure_root", () -> new Item(new Item.Properties().food(CFoods.AZURE_ROOT))),
            GOLDEN_AZURE_ROOT = ITEMS.register("golden_azure_root", () -> new Item(new Item.Properties().rarity(Rarity.RARE).food(CFoods.GOLDEN_AZURE_ROOT))),
            ENCHANTED_GOLDEN_AZURE_ROOT = ITEMS.register("enchanted_golden_azure_root", () -> new Item(new Item.Properties().rarity(Rarity.EPIC).food(CFoods.ENCHANTED_GOLDEN_AZURE_ROOT).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    /*
    Metal Items
     */

    public static final DeferredHolders<Item, DeferredItem<? extends Item>> LUTRUM_ITEMS = RegolithItemUtil.registerItems(
            RegolithNeoForge.wrapItems(ITEMS),
            new Item.Properties(),
            "raw_lutrum",
            "lutrum_nugget",
            "lutrum_ingot",
            "lutrum_sheet",
            "lutrum_rod");
    public static final DeferredHolders<Item, DeferredItem<? extends Item>> OBDURIUM_ITEMS = RegolithItemUtil.registerItems(
            RegolithNeoForge.wrapItems(ITEMS),
            new Item.Properties(),
            "raw_obdurium",
            "obdurium_nugget",
            "obdurium_ingot",
            "obdurium_sheet",
            "obdurium_rod");
    public static final DeferredHolders<Item, DeferredItem<? extends Item>> MALUNITE_ITEMS = RegolithItemUtil.registerItems(
            RegolithNeoForge.wrapItems(ITEMS),
            new Item.Properties(),
            "raw_malunite",
            "malunite_nugget",
            "malunite_ingot",
            "malunite_sheet",
            "malunite_rod");

    /*
    Tools
     */

    public static final DeferredItem<Item> OBDURIUM_HAMMER = ITEMS.register("obdurium_hammer", () -> new ObduriumHammerItem(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1).durability(10000).attributes(SwordItem.createAttributes(CTiers.OBDURIUM, 3.0F, -3.2F))));

    /*
    Flesh Items
     */

    public static final DeferredItem<Item>
            FLESH = ITEMS.register("flesh", () -> new Item(new Item.Properties().food(CFoods.FLESH))),
            COOKED_FLESH = ITEMS.register("cooked_flesh", () -> new Item(new Item.Properties().food(CFoods.COOKED_FLESH))),
            VEIN_STALK = ITEMS.register("vein_stalk", () -> new Item(new Item.Properties().food(CFoods.VEIN_STALK)));

    /*
    Helper Methods
     */

    private static DeferredItem<ShovelItem> registerShovelItem(String id, Tier tier, float attackDamage, float attackSpeed) {
        return ITEMS.register(id, () -> new ShovelItem(tier, new Item.Properties()
                .attributes(ShovelItem.createAttributes(tier, attackDamage, attackSpeed))
        ));
    }
    private static DeferredItem<PickaxeItem> registerPickaxeItem(String id, Tier tier, float attackDamage, float attackSpeed) {
        return ITEMS.register(id, () -> new PickaxeItem(tier, new Item.Properties()
                .attributes(PickaxeItem.createAttributes(tier, attackDamage, attackSpeed))
        ));
    }
    private static DeferredItem<AxeItem> registerAxeItem(String id, Tier tier, float attackDamage, float attackSpeed) {
        return ITEMS.register(id, () -> new AxeItem(tier, new Item.Properties()
                .attributes(AxeItem.createAttributes(tier, attackDamage, attackSpeed))
        ));
    }
    private static DeferredItem<HoeItem> registerHoeItem(String id, Tier tier, float attackDamage, float attackSpeed) {
        return ITEMS.register(id, () -> new HoeItem(tier, new Item.Properties()
                .attributes(HoeItem.createAttributes(tier, attackDamage, attackSpeed))
        ));
    }
    private static DeferredItem<SwordItem> registerSwordItem(String id, Tier tier, float attackDamage, float attackSpeed) {
        return ITEMS.register(id, () -> new SwordItem(tier, new Item.Properties()
                .attributes(SwordItem.createAttributes(tier, attackDamage, attackSpeed))
        ));
    }
}
