package net.quedoom.pfoods.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.quedoom.pfoods.PotatoFoods;
import net.quedoom.pfoods.item.custom.EnchantedGoldenPotatoItem;
import net.quedoom.pfoods.item.custom.GoldenPotatoItem;
import net.quedoom.pfoods.item.custom.SaturatedPotatoItem;

public class ModItems {

    public static final Item GOLDEN_POTATO = registerItem("golden_potato", new GoldenPotatoItem(new Item.Settings().food(ModFoodComponents.GOLDEN_POTATO)));
    public static final Item GOLDEN_BAKED_POTATO = registerItem("golden_baked_potato", new GoldenPotatoItem(new Item.Settings().food(ModFoodComponents.GOLDEN_BAKED_POTATO)));
    public static final Item GOLDEN_POISONOUS_POTATO = registerItem("golden_poisonous_potato", new GoldenPotatoItem(new Item.Settings().food(ModFoodComponents.GOLDEN_POISONOUS_POTATO)));
    public static final Item BAKED_POISONOUS_POTATO = registerItem("baked_poisonous_potato", new GoldenPotatoItem(new Item.Settings().food(ModFoodComponents.BAKED_POISONOUS_POTATO)));
    public static final Item GOLDEN_BAKED_POISONOUS_POTATO = registerItem("golden_baked_poisonous_potato", new GoldenPotatoItem(new Item.Settings().food(ModFoodComponents.GOLDEN_BAKED_POISONOUS_POTATO)));
    public static final Item ENCHANTED_GOLDEN_BAKED_POISONOUS_POTATO = registerItem("enchanted_golden_baked_poisonous_potato", new EnchantedGoldenPotatoItem(new Item.Settings().food(ModFoodComponents.ENCHANTED_GOLDEN_BAKED_POISONOUS_POTATO)));
    public static final Item ENCHANTED_GOLDEN_POISONOUS_POTATO = registerItem("enchanted_golden_poisonous_potato", new EnchantedGoldenPotatoItem(new Item.Settings().food(ModFoodComponents.ENCHANTED_GOLDEN_POISONOUS_POTATO)));

    public static final Item SATURATED_POTATO = registerItem("saturated_potato", new SaturatedPotatoItem(new Item.Settings().food(ModFoodComponents.SATURATED_POTATO).maxCount(16)));
    public static final Item GOLDEN_SATURATED_POTATO = registerItem("golden_saturated_potato", new SaturatedPotatoItem(new Item.Settings().food(ModFoodComponents.GOLDEN_SATURATED_POTATO).maxCount(16)));
    public static final Item SATURATED_POISONOUS_POTATO = registerItem("saturated_poisonous_potato", new SaturatedPotatoItem(new Item.Settings().food(ModFoodComponents.SATURATED_POISONOUS_POTATO).maxCount(16)));
    public static final Item GOLDEN_SATURATED_POISONOUS_POTATO = registerItem("golden_saturated_poisonous_potato", new SaturatedPotatoItem(new Item.Settings().food(ModFoodComponents.GOLDEN_SATURATED_POISONOUS_POTATO).maxCount(16)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PotatoFoods.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PotatoFoods.LOGGER.info("Registering Mod Items for " + PotatoFoods.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK). register(entries -> {
            entries.add(GOLDEN_POTATO);
            entries.add(GOLDEN_BAKED_POTATO);
            entries.add(GOLDEN_POISONOUS_POTATO);
            entries.add(BAKED_POISONOUS_POTATO);
            entries.add(GOLDEN_BAKED_POISONOUS_POTATO);
            entries.add(ENCHANTED_GOLDEN_BAKED_POISONOUS_POTATO);
            entries.add(ENCHANTED_GOLDEN_POISONOUS_POTATO);
            entries.add(SATURATED_POTATO);
            entries.add(GOLDEN_SATURATED_POTATO);
            entries.add(SATURATED_POISONOUS_POTATO);
            entries.add(GOLDEN_SATURATED_POISONOUS_POTATO);
        });
    }

}
