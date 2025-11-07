package net.quedoom.pfoods.datagen.util;

import net.minecraft.client.realms.Request;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.quedoom.pfoods.GetIdentifierWithoutNamespaceFromItem;
import net.quedoom.pfoods.PotatoFoods;

import static net.minecraft.data.server.recipe.RecipeProvider.conditionsFromItem;
import static net.minecraft.data.server.recipe.RecipeProvider.hasItem;

public class GoldenAppleLikeRecipeJsonBuilder {

    public static void create(RecipeExporter recipeExporter, RecipeCategory category, ItemConvertible output, ItemConvertible outline, ItemConvertible center, int count, boolean centerCriteron) {
        if (centerCriteron) {
            ShapedRecipeJsonBuilder.create(category, output, count)
                    .pattern("GGG")
                    .pattern("GAG")
                    .pattern("GGG")
                    .input('G', outline)
                    .input('A', center)
                    .criterion(hasItem(center), conditionsFromItem(center))
                    .group(GetIdentifierWithoutNamespaceFromItem.get(output))
            ;
        } else {
            ShapedRecipeJsonBuilder.create(category, output)
                    .pattern("GGG")
                    .pattern("GAG")
                    .pattern("GGG")
                    .input('G', outline)
                    .input('A', center)
                    .criterion(hasItem(outline), conditionsFromItem(outline))
                    .group(GetIdentifierWithoutNamespaceFromItem.get(output))
            ;
        }
    }

    public static void create(RecipeExporter recipeExporter, RecipeCategory category, ItemConvertible output, ItemConvertible outline, ItemConvertible center, boolean centerCriteron) {
        if (centerCriteron) {
            ShapedRecipeJsonBuilder.create(category, output, 1)
                    .pattern("GGG")
                    .pattern("GAG")
                    .pattern("GGG")
                    .input('G', outline)
                    .input('A', center)
                    .criterion(hasItem(center), conditionsFromItem(center))
                    .group(GetIdentifierWithoutNamespaceFromItem.get(output))
            ;
        } else {
            ShapedRecipeJsonBuilder.create(category, output)
                    .pattern("GGG")
                    .pattern("GAG")
                    .pattern("GGG")
                    .input('G', outline)
                    .input('A', center)
                    .criterion(hasItem(outline), conditionsFromItem(outline))
                    .group(GetIdentifierWithoutNamespaceFromItem.get(output))
            ;

        }
    }

    public static void create(RecipeExporter recipeExporter, RecipeCategory category, ItemConvertible output, ItemConvertible outline, ItemConvertible center, int count) {
        ShapedRecipeJsonBuilder.create(category, output, count)
                .pattern("GGG")
                .pattern("GAG")
                .pattern("GGG")
                .input('G', outline)
                .input('A', center)
                .criterion(hasItem(center), conditionsFromItem(center))
                .criterion(hasItem(outline), conditionsFromItem(outline))
                .group(GetIdentifierWithoutNamespaceFromItem.get(output))
        ;
    }

    public static void create(RecipeExporter recipeExporter, RecipeCategory category, ItemConvertible output, ItemConvertible outline, ItemConvertible center) {
        ShapedRecipeJsonBuilder.create(category, output, 1)
                .pattern("GGG")
                .pattern("GAG")
                .pattern("GGG")
                .input('G', outline)
                .input('A', center)
                .criterion(hasItem(center), conditionsFromItem(center))
                .criterion(hasItem(outline), conditionsFromItem(outline))
                .group(GetIdentifierWithoutNamespaceFromItem.get(output))
                .offerTo(recipeExporter, Identifier.of(PotatoFoods.MOD_ID, GetIdentifierWithoutNamespaceFromItem.get(output)));
        ;
    }

    public static void create(RecipeExporter recipeExporter, RecipeCategory category, ItemConvertible output, ItemConvertible outline, ItemConvertible center, String customName) {
        ShapedRecipeJsonBuilder.create(category, output, 1)
                .pattern("GGG")
                .pattern("GAG")
                .pattern("GGG")
                .input('G', outline)
                .input('A', center)
                .criterion(hasItem(center), conditionsFromItem(center))
                .criterion(hasItem(outline), conditionsFromItem(outline))
                .group(GetIdentifierWithoutNamespaceFromItem.get(output))
                .offerTo(recipeExporter, Identifier.of(PotatoFoods.MOD_ID, customName));
        ;
    }


}
