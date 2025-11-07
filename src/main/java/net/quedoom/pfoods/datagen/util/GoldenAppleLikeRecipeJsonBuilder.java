package net.quedoom.pfoods.datagen.util;

import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.quedoom.pfoods.GetIdentifierWithoutNamespaceFromItem;
import net.quedoom.pfoods.PotatoFoods;

import static net.minecraft.data.server.recipe.RecipeGenerator.hasItem;


public class GoldenAppleLikeRecipeJsonBuilder {



    public static void create(RecipeGenerator recipeGenerator, RecipeExporter recipeExporter, RecipeCategory category, ItemConvertible output, ItemConvertible outline, ItemConvertible center, int count, boolean centerCriteron) {
        if (centerCriteron) {
            recipeGenerator.createShaped(category, output, count)
                    .pattern("GGG")
                    .pattern("GAG")
                    .pattern("GGG")
                    .input('G', outline)
                    .input('A', center)
                    .criterion(hasItem(center), recipeGenerator.conditionsFromItem(center))
                    .group(GetIdentifierWithoutNamespaceFromItem.get(output))
            ;
        } else {
            recipeGenerator.createShaped(category, output, count)
                    .pattern("GGG")
                    .pattern("GAG")
                    .pattern("GGG")
                    .input('G', outline)
                    .input('A', center)
                    .criterion(hasItem(outline), recipeGenerator.conditionsFromItem(outline))
                    .group(GetIdentifierWithoutNamespaceFromItem.get(output))
            ;
        }
    }

    public static void create(RecipeGenerator recipeGenerator, RecipeExporter recipeExporter, RecipeCategory category, ItemConvertible output, ItemConvertible outline, ItemConvertible center, boolean centerCriteron) {
        if (centerCriteron) {
            recipeGenerator.createShaped(category, output, 1)
                    .pattern("GGG")
                    .pattern("GAG")
                    .pattern("GGG")
                    .input('G', outline)
                    .input('A', center)
                    .criterion(hasItem(center), recipeGenerator.conditionsFromItem(center))
                    .group(GetIdentifierWithoutNamespaceFromItem.get(output))
            ;
        } else {
            recipeGenerator.createShaped(category, output)
                    .pattern("GGG")
                    .pattern("GAG")
                    .pattern("GGG")
                    .input('G', outline)
                    .input('A', center)
                    .criterion(hasItem(outline), recipeGenerator.conditionsFromItem(outline))
                    .group(GetIdentifierWithoutNamespaceFromItem.get(output))
            ;

        }
    }

    public static void create(RecipeGenerator recipeGenerator, RecipeExporter recipeExporter, RecipeCategory category, ItemConvertible output, ItemConvertible outline, ItemConvertible center, int count) {
        recipeGenerator.createShaped(category, output, count)
                .pattern("GGG")
                .pattern("GAG")
                .pattern("GGG")
                .input('G', outline)
                .input('A', center)
                .criterion(hasItem(center), recipeGenerator.conditionsFromItem(center))
                .criterion(hasItem(outline), recipeGenerator.conditionsFromItem(outline))
                .group(GetIdentifierWithoutNamespaceFromItem.get(output))
        ;
    }

    public static void create(RecipeGenerator recipeGenerator, RecipeExporter recipeExporter, RecipeCategory category, ItemConvertible output, ItemConvertible outline, ItemConvertible center) {
        recipeGenerator.createShaped(category, output, 1)
                .pattern("GGG")
                .pattern("GAG")
                .pattern("GGG")
                .input('G', outline)
                .input('A', center)
                .criterion(hasItem(center), recipeGenerator.conditionsFromItem(center))
                .criterion(hasItem(outline), recipeGenerator.conditionsFromItem(outline))
                .group(GetIdentifierWithoutNamespaceFromItem.get(output))
                .offerTo(recipeExporter, PotatoFoods.MOD_ID + ":recipe/" + GetIdentifierWithoutNamespaceFromItem.get(output))
        ;
    }

    public static void create(RecipeGenerator recipeGenerator, RecipeExporter recipeExporter, RecipeCategory category, ItemConvertible output, ItemConvertible outline, ItemConvertible center, String customName) {
        recipeGenerator.createShaped(category, output, 1)
                .pattern("GGG")
                .pattern("GAG")
                .pattern("GGG")
                .input('G', outline)
                .input('A', center)
                .criterion(hasItem(center), recipeGenerator.conditionsFromItem(center))
                .criterion(hasItem(outline), recipeGenerator.conditionsFromItem(outline))
                .group(GetIdentifierWithoutNamespaceFromItem.get(output))
                .offerTo(recipeExporter, PotatoFoods.MOD_ID + ":recipe/" + customName)
        ;
    }


}
