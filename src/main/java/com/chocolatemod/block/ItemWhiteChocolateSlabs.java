package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemWhiteChocolateSlabs extends ItemSlab
{
	public ItemWhiteChocolateSlabs(Block block) 
	{
		super(block, BlockRegistry.whitechocolatesingle, BlockRegistry.whitechocolatedouble, block == BlockRegistry.whitechocolatedouble);
		this.setUnlocalizedName("killerjdog51.block_whitechocolateslab");
	}
}