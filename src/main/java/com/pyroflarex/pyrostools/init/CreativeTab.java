package com.pyroflarex.pyrostools.init;

import com.pyroflarex.pyrostools.items.ItemsList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CreativeTab {

    public static final ItemGroup itemGroup = new ItemGroup("pyrostools")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ItemsList.TRANSISTORITEM);
        }
    };
}
