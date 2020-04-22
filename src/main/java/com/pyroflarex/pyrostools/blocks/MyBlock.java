package com.pyroflarex.pyrostools.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class MyBlock extends Block
{
    public MyBlock()
    {
        super(Properties.create(Material.IRON).harvestLevel(1).harvestTool(ToolType.PICKAXE).lightValue(14));

        setRegistryName("myblock");
    }

    /*@Override
    public boolean hasTileEntity(BlockState state)
    {
        return true;
    }*/
}
