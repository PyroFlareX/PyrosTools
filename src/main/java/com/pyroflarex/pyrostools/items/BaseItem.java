package com.pyroflarex.pyrostools.items;

import com.pyroflarex.pyrostools.init.CreativeTab;
import net.minecraft.item.Item;

public class BaseItem extends Item
{
    public BaseItem(String name)
    {
        super(new Item.Properties().maxStackSize(64).group(CreativeTab.itemGroup));

        setRegistryName(name);
    }
}
