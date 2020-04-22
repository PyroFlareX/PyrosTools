package com.pyroflarex.pyrostools.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;


public class MyItem extends Item
{
    public MyItem()
    {
        super(new Item.Properties()
            .maxStackSize(1));

        setRegistryName("telesword");
    }
    //@TODO make clicking with this item teleport the player 10 blocks in the facing direction
    /*@Override
    public ActionResultType onItemUse(ItemUseContext context)
    {
        Vec2f angle = context.getPlayer().getPitchYaw();

        Vec3d pos = context.getPlayer().getPositionVec();

        int teleportRadius = 100;
        Vec3d teleportPos;


    }*/
}
