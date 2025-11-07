package net.quedoom.pfoods.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.quedoom.pfoods.PotatoFoods;
import net.quedoom.pfoods.item.custom.EnchantedGoldenPotatoItem;
import net.quedoom.pfoods.item.custom.GoldenPotatoItem;
import net.quedoom.pfoods.item.custom.SaturatedPotatoItem;

public class ModItems {

    public static final Item GOLDEN_POTATO = registerItem("golden_potato", new GoldenPotatoItem(new Item.Settings().food(ModFoodComponents.GOLDEN_POTATO)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PotatoFoods.MOD_ID, "golden_potato")))));
//    public static final Item GOLDEN_POTATO = registerItem2("golden_potato", 64, ModFoodComponents.GOLDEN_POTATO);
    public static final Item GOLDEN_BAKED_POTATO = registerItem("golden_baked_potato", new GoldenPotatoItem(new Item.Settings().food(ModFoodComponents.GOLDEN_BAKED_POTATO)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PotatoFoods.MOD_ID, "golden_baked_potato")))));
    public static final Item GOLDEN_POISONOUS_POTATO = registerItem("golden_poisonous_potato", new GoldenPotatoItem(new Item.Settings().food(ModFoodComponents.GOLDEN_POISONOUS_POTATO, ModFoodComponents.GOLDEN_POISONOUS_POTATO_EFFECT)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PotatoFoods.MOD_ID, "golden_poisonous_potato")))));
    public static final Item BAKED_POISONOUS_POTATO = registerItem("baked_poisonous_potato", new GoldenPotatoItem(new Item.Settings().food(ModFoodComponents.BAKED_POISONOUS_POTATO, ModFoodComponents.BAKED_POISONOUS_POTATO_EFFECT)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PotatoFoods.MOD_ID, "baked_poisonous_potato")))));
    public static final Item GOLDEN_BAKED_POISONOUS_POTATO = registerItem("golden_baked_poisonous_potato", new GoldenPotatoItem(new Item.Settings().food(ModFoodComponents.GOLDEN_BAKED_POISONOUS_POTATO, ModFoodComponents.GOLDEN_POISONOUS_POTATO_EFFECT)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PotatoFoods.MOD_ID, "golden_baked_poisonous_potato")))));
    public static final Item ENCHANTED_GOLDEN_BAKED_POISONOUS_POTATO = registerItem("enchanted_golden_baked_poisonous_potato", new EnchantedGoldenPotatoItem(new Item.Settings().food(ModFoodComponents.ENCHANTED_GOLDEN_BAKED_POISONOUS_POTATO, ModFoodComponents.ENCHANTED_GOLDEN_POISONOUS_POTATO_EFFECT)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PotatoFoods.MOD_ID, "enchanted_golden_baked_poisonous_potato")))));
    public static final Item ENCHANTED_GOLDEN_POISONOUS_POTATO = registerItem("enchanted_golden_poisonous_potato", new EnchantedGoldenPotatoItem(new Item.Settings().food(ModFoodComponents.ENCHANTED_GOLDEN_POISONOUS_POTATO, ModFoodComponents.ENCHANTED_GOLDEN_POISONOUS_POTATO_EFFECT)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PotatoFoods.MOD_ID, "enchanted_golden_poisonous_potato")))));

    public static final Item SATURATED_POTATO = registerItem("saturated_potato", new SaturatedPotatoItem(new Item.Settings().food(ModFoodComponents.SATURATED_POTATO, ModFoodComponents.SATURATED_POTATO_EFFECT).maxCount(16)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PotatoFoods.MOD_ID, "saturated_potato")))));
    public static final Item GOLDEN_SATURATED_POTATO = registerItem("golden_saturated_potato", new SaturatedPotatoItem(new Item.Settings().food(ModFoodComponents.GOLDEN_SATURATED_POTATO, ModFoodComponents.GOLDEN_SATURATED_POTATO_EFFECT).maxCount(16)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PotatoFoods.MOD_ID, "golden_saturated_potato")))));
    public static final Item SATURATED_POISONOUS_POTATO = registerItem("saturated_poisonous_potato", new SaturatedPotatoItem(new Item.Settings().food(ModFoodComponents.SATURATED_POISONOUS_POTATO, ModFoodComponents.SATURATED_POISONOUS_POTATO_EFFECT).maxCount(16)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PotatoFoods.MOD_ID, "saturated_poisonous_potato")))));
    public static final Item GOLDEN_SATURATED_POISONOUS_POTATO = registerItem("golden_saturated_poisonous_potato", new SaturatedPotatoItem(new Item.Settings().food(ModFoodComponents.GOLDEN_SATURATED_POISONOUS_POTATO, ModFoodComponents.GOLDEN_SATURATED_POISONOUS_POTATO_EFFECT).maxCount(16)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PotatoFoods.MOD_ID, "golden_saturated_poisonous_potato")))));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PotatoFoods.MOD_ID, name), item);
    }

    private static Item registerItem2(String name, int maxCount, FoodComponent foodComponent) {
        return  Registry.register(Registries.ITEM, Identifier.of(PotatoFoods.MOD_ID, name), new GoldenPotatoItem(new Item.Settings().food(foodComponent).maxCount(maxCount)
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PotatoFoods.MOD_ID, name)))));
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
