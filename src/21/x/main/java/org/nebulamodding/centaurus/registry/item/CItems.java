package org.nebulamodding.centaurus.registry.item;

import org.nebulamodding.centaurus.Centaurus;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Centaurus.MOD_ID);

    // region Crop Items
    public static final DeferredItem<Item>
            BRUMA = ITEMS.register("bruma", () -> new Item(new Item.Properties())),
            BRUMA_LOAF = ITEMS.register("bruma_loaf", () -> new Item(new Item.Properties().food(CFoods.BRUMA_LOAF)));
    public static final DeferredItem<Item>
            AZURE_ROOT = ITEMS.register("azure_root", () -> new Item(new Item.Properties().food(CFoods.AZURE_ROOT))),
            GOLDEN_AZURE_ROOT = ITEMS.register("golden_azure_root", () -> new Item(new Item.Properties().rarity(Rarity.RARE).food(CFoods.GOLDEN_AZURE_ROOT))),
            ENCHANTED_GOLDEN_AZURE_ROOT = ITEMS.register("enchanted_golden_azure_root", () -> new Item(new Item.Properties().rarity(Rarity.EPIC).food(CFoods.ENCHANTED_GOLDEN_AZURE_ROOT).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));
    // endregion

    // region Karnis Items
    public static final DeferredItem<Item>
            FLESH = ITEMS.register("flesh", () -> new Item(new Item.Properties().food(CFoods.FLESH))),
            COOKED_FLESH = ITEMS.register("cooked_flesh", () -> new Item(new Item.Properties().food(CFoods.COOKED_FLESH))),
            VEIN_STALK = ITEMS.register("vein_stalk", () -> new Item(new Item.Properties().food(CFoods.VEIN_STALK)));
    // endregion

    // region Metal Items
    public static final DeferredItem<Item>
            RAW_LUTRUM = ITEMS.register("raw_lutrum", () -> new Item(new Item.Properties())),
            CRUSHED_RAW_LUTRUM = ITEMS.register("crushed_raw_lutrum", () -> new Item(new Item.Properties())),
            LUTRUM_NUGGET = ITEMS.register("lutrum_nugget", () -> new Item(new Item.Properties())),
            LUTRUM_INGOT = ITEMS.register("lutrum_ingot", () -> new Item(new Item.Properties())),
            LUTRUM_SHEET = ITEMS.register("lutrum_sheet", () -> new Item(new Item.Properties())),
            LUTRUM_ROD = ITEMS.register("lutrum_rod", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item>
            RAW_OBDURIUM = ITEMS.register("raw_obdurium", () -> new Item(new Item.Properties())),
            CRUSHED_RAW_OBDURIUM = ITEMS.register("crushed_raw_obdurium", () -> new Item(new Item.Properties())),
            OBDURIUM_NUGGET = ITEMS.register("obdurium_nugget", () -> new Item(new Item.Properties())),
            OBDURIUM_INGOT = ITEMS.register("obdurium_ingot", () -> new Item(new Item.Properties())),
            OBDURIUM_SHEET = ITEMS.register("obdurium_sheet", () -> new Item(new Item.Properties())),
            OBDURIUM_ROD = ITEMS.register("obdurium_rod", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item>
            RAW_MALUNITE = ITEMS.register("raw_malunite", () -> new Item(new Item.Properties())),
            CRUSHED_RAW_MALUNITE = ITEMS.register("crushed_raw_malunite", () -> new Item(new Item.Properties())),
            MALUNITE_NUGGET = ITEMS.register("malunite_nugget", () -> new Item(new Item.Properties())),
            MALUNITE_INGOT = ITEMS.register("malunite_ingot", () -> new Item(new Item.Properties())),
            MALUNITE_SHEET = ITEMS.register("malunite_sheet", () -> new Item(new Item.Properties())),
            MALUNITE_ROD = ITEMS.register("malunite_rod", () -> new Item(new Item.Properties()));
    // endregion

    // region Tools
    // Lutrum
    public static final DeferredItem<Item>
            LUTRUM_SWORD = registerSwordItem("lutrum_sword", CTiers.LUTRUM, 3.0F, -2.0F),
            LUTRUM_SHOVEL = registerShovelItem("lutrum_shovel", CTiers.LUTRUM, 1.5F, -2.6F),
            LUTRUM_PICKAXE = registerPickaxeItem("lutrum_pickaxe", CTiers.LUTRUM, 1.0F, -2.4F),
            LUTRUM_AXE = registerAxeItem("lutrum_axe", CTiers.LUTRUM, 6.0F, -2.7F),
            LUTRUM_HOE = registerHoeItem("lutrum_hoe", CTiers.LUTRUM, -1.0F, -0.6F);
    // Obdurium
    public static final DeferredItem<Item>
            //OBDURIUM_SWORD = registerSwordItem("obdurium_sword", CTiers.OBDURIUM, 3.0F, -2.8F),
            //OBDURIUM_SHOVEL = registerShovelItem("obdurium_shovel", CTiers.OBDURIUM, 1.5F, -3.4F),
            //OBDURIUM_PICKAXE = registerPickaxeItem("obdurium_pickaxe", CTiers.OBDURIUM, 1.0F, -3.2F),
            //OBDURIUM_AXE = registerAxeItem("obdurium_axe", CTiers.OBDURIUM, 6.0F, -3.5F),
            //OBDURIUM_HOE = registerHoeItem("obdurium_hoe", CTiers.OBDURIUM, -1.0F, -1.4F),
            OBDURIUM_HAMMER = ITEMS.register("obdurium_hammer", () -> new Item(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1).durability(9650).attributes(SwordItem.createAttributes(CTiers.OBDURIUM, 3.0F, -3.2F))));
    // Malunite
//    public static final DeferredItem <Item>
//            MALUNITE_SWORD = registerSwordItem("malunite_sword", CTiers.MALUNITE, 3.0F, -2.4F),
//            MALUNITE_SHOVEL = registerShovelItem("malunite_shovel", CTiers.MALUNITE, 1.5F, -3.0F),
//            MALUNITE_PICKAXE = registerPickaxeItem("malunite_pickaxe", CTiers.MALUNITE, 1.0F, -2.8F),
//            MALUNITE_AXE = registerAxeItem("malunite_axe", CTiers.MALUNITE, 6.0F, -3.1F),
//            MALUNITE_HOE = registerHoeItem("malunite_hoe", CTiers.MALUNITE, -1.0F, -1.0F);
    // endregion

    // region Helpers
    private static DeferredItem<Item> registerSwordItem(String id, Tier tier, float attackDamage, float attackSpeed) {
        return ITEMS.register(id, () -> new SwordItem(tier, new Item.Properties()
                .attributes(SwordItem.createAttributes(tier, attackDamage, attackSpeed))
        ));
    }

    private static DeferredItem<Item> registerShovelItem(String id, Tier tier, float attackDamage, float attackSpeed) {
        return ITEMS.register(id, () -> new ShovelItem(tier, new Item.Properties()
                .attributes(ShovelItem.createAttributes(tier, attackDamage, attackSpeed))
        ));
    }

    private static DeferredItem<Item> registerPickaxeItem(String id, Tier tier, float attackDamage, float attackSpeed) {
        return ITEMS.register(id, () -> new PickaxeItem(tier, new Item.Properties()
                .attributes(PickaxeItem.createAttributes(tier, attackDamage, attackSpeed))
        ));
    }

    private static DeferredItem<Item> registerAxeItem(String id, Tier tier, float attackDamage, float attackSpeed) {
        return ITEMS.register(id, () -> new AxeItem(tier, new Item.Properties()
                .attributes(AxeItem.createAttributes(tier, attackDamage, attackSpeed))
        ));
    }

    private static DeferredItem<Item> registerHoeItem(String id, Tier tier, float attackDamage, float attackSpeed) {
        return ITEMS.register(id, () -> new HoeItem(tier, new Item.Properties()
                .attributes(HoeItem.createAttributes(tier, attackDamage, attackSpeed))
        ));
    }
    // endregion
}