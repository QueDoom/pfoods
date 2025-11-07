package net.quedoom.pfoods.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;

import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.*;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.quedoom.pfoods.GetIdentifierWithoutNamespaceFromItem;
import net.quedoom.pfoods.PotatoFoods;
import net.quedoom.pfoods.datagen.util.GoldenAppleLikeRecipeJsonBuilder;
import net.quedoom.pfoods.datagen.util.SmokerRecipe;
import net.quedoom.pfoods.item.ModItems;
import net.quedoom.pfoods.item.custom.GoldenPotatoItem;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                //offer...
                //ShapedRecipeJsonBuilder
                //ShapelessRecipeJsonBuilder
                List<ItemConvertible> BAKED_POISONOUS_POTATO_SMELTABLES = List.of(Items.POISONOUS_POTATO);
                List<ItemConvertible> GOLDEN_BAKED_POISONOUS_POTATO_SMELTABLES = List.of(ModItems.GOLDEN_POISONOUS_POTATO);
                List<ItemConvertible> GOLDEN_BAKED_POTATO_SMELTABLES = List.of(ModItems.GOLDEN_POTATO);


                offerSmelting(BAKED_POISONOUS_POTATO_SMELTABLES, RecipeCategory.FOOD, ModItems.BAKED_POISONOUS_POTATO, 2f, 200, GetIdentifierWithoutNamespaceFromItem.get(ModItems.BAKED_POISONOUS_POTATO));
                SmokerRecipe.create(this, BAKED_POISONOUS_POTATO_SMELTABLES, ModItems.BAKED_POISONOUS_POTATO, .2f, "from_smoking");

                offerSmelting(GOLDEN_BAKED_POISONOUS_POTATO_SMELTABLES, RecipeCategory.FOOD, ModItems.GOLDEN_BAKED_POISONOUS_POTATO, 2f, 200, GetIdentifierWithoutNamespaceFromItem.get(ModItems.GOLDEN_BAKED_POISONOUS_POTATO));
                SmokerRecipe.create(this, GOLDEN_BAKED_POISONOUS_POTATO_SMELTABLES, ModItems.GOLDEN_BAKED_POISONOUS_POTATO, .2f, "from_smokingg");


                offerSmelting(GOLDEN_BAKED_POTATO_SMELTABLES, RecipeCategory.FOOD, ModItems.GOLDEN_BAKED_POTATO, 2f, 200, GetIdentifierWithoutNamespaceFromItem.get(ModItems.GOLDEN_BAKED_POTATO));
                SmokerRecipe.create(this, GOLDEN_BAKED_POTATO_SMELTABLES, ModItems.GOLDEN_BAKED_POTATO, .2f, "from_smokinggg");





                GoldenAppleLikeRecipeJsonBuilder.create(this, recipeExporter, RecipeCategory.FOOD, ModItems.GOLDEN_POTATO, Items.GOLD_NUGGET, Items.POTATO);
                GoldenAppleLikeRecipeJsonBuilder.create(this, recipeExporter, RecipeCategory.FOOD, ModItems.GOLDEN_BAKED_POTATO, Items.GOLD_NUGGET, Items.BAKED_POTATO);

                GoldenAppleLikeRecipeJsonBuilder.create(this, recipeExporter, RecipeCategory.FOOD, ModItems.GOLDEN_POISONOUS_POTATO, Items.GOLD_NUGGET, Items.POISONOUS_POTATO);
                GoldenAppleLikeRecipeJsonBuilder.create(this, recipeExporter, RecipeCategory.FOOD, ModItems.GOLDEN_BAKED_POISONOUS_POTATO, Items.GOLD_NUGGET, ModItems.BAKED_POISONOUS_POTATO);

                GoldenAppleLikeRecipeJsonBuilder.create(this, recipeExporter, RecipeCategory.FOOD, ModItems.SATURATED_POTATO, Items.BAKED_POTATO, Blocks.DANDELION);
                GoldenAppleLikeRecipeJsonBuilder.create(this, recipeExporter, RecipeCategory.FOOD, ModItems.GOLDEN_SATURATED_POTATO, ModItems.GOLDEN_BAKED_POTATO, Blocks.DANDELION);
                GoldenAppleLikeRecipeJsonBuilder.create(this, recipeExporter, RecipeCategory.FOOD, ModItems.GOLDEN_SATURATED_POTATO, Items.GOLD_INGOT, ModItems.SATURATED_POTATO, "golden_saturated_potato_other");

                GoldenAppleLikeRecipeJsonBuilder.create(this, recipeExporter, RecipeCategory.FOOD, ModItems.SATURATED_POISONOUS_POTATO, ModItems.BAKED_POISONOUS_POTATO, Blocks.DANDELION);
                GoldenAppleLikeRecipeJsonBuilder.create(this, recipeExporter, RecipeCategory.FOOD, ModItems.GOLDEN_SATURATED_POISONOUS_POTATO, ModItems.GOLDEN_BAKED_POISONOUS_POTATO, Blocks.DANDELION);
                GoldenAppleLikeRecipeJsonBuilder.create(this, recipeExporter, RecipeCategory.FOOD, ModItems.GOLDEN_SATURATED_POISONOUS_POTATO, Items.GOLD_INGOT, ModItems.SATURATED_POISONOUS_POTATO, "golden_saturated_poisonous_potato_other");

                createShaped(RecipeCategory.FOOD, ModItems.ENCHANTED_GOLDEN_POISONOUS_POTATO, 1)
                        .pattern("BPB")
                        .pattern("PPP")
                        .pattern("BPB")
                        .input('B', Items.ENCHANTED_BOOK)
                        .input('P', ModItems.GOLDEN_POISONOUS_POTATO)
                        .criterion(hasItem(Items.ENCHANTED_BOOK), conditionsFromItem(Items.ENCHANTED_BOOK))
                        .criterion(hasItem(ModItems.GOLDEN_POISONOUS_POTATO), conditionsFromItem(ModItems.GOLDEN_POISONOUS_POTATO))
                        .group("ench_gold_poi_pot")
                ;


                createShaped(RecipeCategory.FOOD, ModItems.ENCHANTED_GOLDEN_BAKED_POISONOUS_POTATO, 1)
                        .pattern("BPB")
                        .pattern("PPP")
                        .pattern("BPB")
                        .input('B', Items.ENCHANTED_BOOK)
                        .input('P', ModItems.GOLDEN_BAKED_POISONOUS_POTATO)
                        .criterion(hasItem(Items.ENCHANTED_BOOK), conditionsFromItem(Items.ENCHANTED_BOOK))
                        .criterion(hasItem(ModItems.GOLDEN_BAKED_POISONOUS_POTATO), conditionsFromItem(ModItems.GOLDEN_BAKED_POISONOUS_POTATO))
                        .group("ench_gold_baked_poi_pot")
                ;


            }
        };
    }




    @Override
    public String getName() {
        return "Potato Foods Recipes";
    }
}
