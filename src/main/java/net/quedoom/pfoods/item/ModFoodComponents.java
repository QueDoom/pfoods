package net.quedoom.pfoods.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;

public class ModFoodComponents {
    public static final FoodComponent GOLDEN_POTATO = registerFoodComponent(6, 1.2f, 1);
    public static final FoodComponent GOLDEN_BAKED_POTATO = registerFoodComponent(8, 1.0f, 1);

    public static final FoodComponent GOLDEN_POISONOUS_POTATO = registerFoodComponent(6, 1.4f, true)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0F)
            .build();
    public static final FoodComponent GOLDEN_BAKED_POISONOUS_POTATO = registerFoodComponent(8, 1.7f, true)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0F)
            .build();

    public static final FoodComponent BAKED_POISONOUS_POTATO = registerFoodComponent(5, 0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 0), 0.6F)
            .build();

    public static final FoodComponent SATURATED_POTATO = registerFoodComponent(5, 0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 7, 0), 1.0f)
            .build();
    public static final FoodComponent GOLDEN_SATURATED_POTATO = registerFoodComponent(5, 0.7f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 14, 0), 1.0f)
            .build();
    public static final FoodComponent SATURATED_POISONOUS_POTATO = registerFoodComponent(5, 0.6f, true)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 0), 0.6F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 7, 0), 1.0f)
            .build();
    public static final FoodComponent GOLDEN_SATURATED_POISONOUS_POTATO = registerFoodComponent(10, 1.7f, true)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 14, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 120, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2800, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 220, 0), 1.0f)
            .build();

    public static final FoodComponent ENCHANTED_GOLDEN_POISONOUS_POTATO = registerFoodComponent(6, 1.4f, true)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 500, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6200, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6200, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2800, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1800, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1400, 1), 0.1f)
            .build();
    public static final FoodComponent ENCHANTED_GOLDEN_BAKED_POISONOUS_POTATO = registerFoodComponent(8, 1.8f, true)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 500, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6200, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6200, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2800, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1800, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1400, 1), 0.1f)
            .build();


    private static FoodComponent.Builder registerFoodComponent(int nutrition, float saturation) {
        return new FoodComponent.Builder().nutrition(nutrition).saturationModifier(saturation);
    }

    private static FoodComponent registerFoodComponent(int nutrition, float saturation, int value) {
        return new FoodComponent.Builder().nutrition(nutrition).saturationModifier(saturation).build();
    }

    private static FoodComponent.Builder registerFoodComponent(int nutrition, float saturation, boolean alwaysEdible) {
        FoodComponent.Builder x = new FoodComponent.Builder().nutrition(nutrition).saturationModifier(saturation);
        if (alwaysEdible) {
            return x.alwaysEdible();
        }
        return x;

    }
    private static FoodComponent registerFoodComponent(int nutrition, float saturation, boolean alwaysEdible, int value) {
        FoodComponent.Builder x = new FoodComponent.Builder().nutrition(nutrition).saturationModifier(saturation);
        if (alwaysEdible) {
            return x.alwaysEdible().build();
        }
        return x.build();

    }

    private static FoodComponent.Builder registerFoodComponent(int nutrition, float saturation, Item usingConvertsTo) {
        return new FoodComponent.Builder().nutrition(nutrition).saturationModifier(saturation).usingConvertsTo(usingConvertsTo);
    }

}
