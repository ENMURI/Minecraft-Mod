package com.emuri.zomod.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final RegistryObject<Block> BLOCK_OF_DEPRESSION = register("block_of_depression", () ->
            new Block(AbstractBlock.Properties.of(Material.CACTUS).strength(1).harvestLevel(0).sound(SoundType.ANVIL)));


    // Create a block without item
    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block){
        return Registration.BLOCKS.register(name, block);
    }

    // Create a block wit item
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
       RegistryObject<T> ret = registerNoItem(name, block);
       Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
       return ret;
    }

    static void register(){}
}
