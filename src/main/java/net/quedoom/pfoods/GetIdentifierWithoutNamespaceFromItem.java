package net.quedoom.pfoods;

import net.minecraft.item.ItemConvertible;

public class GetIdentifierWithoutNamespaceFromItem {

    public GetIdentifierWithoutNamespaceFromItem() {
    }

    public static String get(ItemConvertible item) {
        return item.toString().replaceFirst(PotatoFoods.MOD_ID + ':', "".replaceFirst("minecraft:", ""));
    }

}
