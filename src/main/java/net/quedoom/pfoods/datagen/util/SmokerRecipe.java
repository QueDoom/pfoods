package net.quedoom.pfoods.datagen.util;

import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SmokingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.quedoom.pfoods.GetIdentifierWithoutNamespaceFromItem;
import net.quedoom.pfoods.item.ModItems;

import java.util.List;

public class SmokerRecipe {

    public static void create(RecipeGenerator recipeGenerator, List<ItemConvertible> input, ItemConvertible output, float experience, String suffix) {
        recipeGenerator.offerMultipleOptions(RecipeSerializer.SMOKING,
                SmokingRecipe::new,
                input,
                RecipeCategory.FOOD,
                output,
                experience,
                100,
                GetIdentifierWithoutNamespaceFromItem.get(output),
                suffix)
        ;
    }
}
