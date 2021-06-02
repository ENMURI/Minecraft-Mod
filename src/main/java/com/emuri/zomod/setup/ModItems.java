package com.emuri.zomod.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> depression = Registration.ITEMS.register("depression", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));

    static void register(){}
}
