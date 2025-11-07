package net.quedoom.pfoods.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.quedoom.pfoods.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.GOLDEN_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_POISONOUS_POTATO, Models.GENERATED);

        itemModelGenerator.register(ModItems.GOLDEN_BAKED_POISONOUS_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_BAKED_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAKED_POISONOUS_POTATO, Models.GENERATED);

        itemModelGenerator.register(ModItems.ENCHANTED_GOLDEN_POISONOUS_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENCHANTED_GOLDEN_BAKED_POISONOUS_POTATO, Models.GENERATED);

        itemModelGenerator.register(ModItems.SATURATED_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_SATURATED_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.SATURATED_POISONOUS_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_SATURATED_POISONOUS_POTATO, Models.GENERATED);
    }



}
