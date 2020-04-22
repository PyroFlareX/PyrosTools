package com.pyroflarex.pyrostools.items;

import com.pyroflarex.pyrostools.blocks.MyBlock;
import net.minecraftforge.registries.ObjectHolder;

public class ItemsList
{
    @ObjectHolder("pyrostools:generic_item")
    public static BaseItem GENERICITEM = new BaseItem("generic_item");

    @ObjectHolder("pyrostools:core_item")
    public static BaseItem COREITEM = new BaseItem("core_item");

    @ObjectHolder("pyrostools:matter_item")
    public static BaseItem MATTERITEM = new BaseItem("matter_item");

    @ObjectHolder("pyrostools:transitor_item")
    public static BaseItem TRANSISTORITEM = new BaseItem("transistor_item");

    @ObjectHolder("pyrostools:capacitor_item")
    public static BaseItem CAPACITORITEM = new BaseItem("capacitor_item");
}
