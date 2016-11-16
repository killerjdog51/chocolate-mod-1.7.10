package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemCocoaSlabs extends ItemSlab
{
	public ItemCocoaSlabs(Block block) 
	{
		super(block, BlockRegistry.CocoaSlabsingle, BlockRegistry.CocoaSlabdouble, block == BlockRegistry.CocoaSlabdouble);
		this.setUnlocalizedName("killerjdog51.block_cocoaplankslab");
	}
}