package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemChocolateSlabs extends ItemSlab
{
	public ItemChocolateSlabs(Block block) 
	{
		super(block, BlockRegistry.chocolatesingle, BlockRegistry.chocolatedouble, block == BlockRegistry.chocolatedouble);
		this.setUnlocalizedName("killerjdog51.block_chocolateslab");
	}
}