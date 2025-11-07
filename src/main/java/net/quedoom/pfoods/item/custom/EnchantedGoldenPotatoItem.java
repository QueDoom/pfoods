package net.quedoom.pfoods.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EnchantedGoldenPotatoItem extends GoldenPotatoItem {
    public EnchantedGoldenPotatoItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
