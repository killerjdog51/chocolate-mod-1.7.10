package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemLightChocolateSlabs extends ItemSlab
{
	public ItemLightChocolateSlabs(Block block) 
	{
		super(block, BlockRegistry.lightchocolatesingle, BlockRegistry.lightchocolatedouble, block == BlockRegistry.lightchocolatedouble);
		this.setUnlocalizedName("killerjdog51.block_lightchocolateslab");
	}
}