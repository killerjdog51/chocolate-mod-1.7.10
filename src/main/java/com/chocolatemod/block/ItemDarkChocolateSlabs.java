package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemDarkChocolateSlabs extends ItemSlab
{
	public ItemDarkChocolateSlabs(Block block) 
	{
		super(block, BlockRegistry.darkchocolatesingle, BlockRegistry.darkchocolatedouble, block == BlockRegistry.darkchocolatedouble);
		this.setUnlocalizedName("killerjdog51.block_darkchocolateslab");
	}
}