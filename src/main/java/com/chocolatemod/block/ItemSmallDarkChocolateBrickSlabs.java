package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemSmallDarkChocolateBrickSlabs extends ItemSlab
{
	public ItemSmallDarkChocolateBrickSlabs(Block block) 
	{
		super(block, BlockRegistry.smalldarkchocolatebricksingle, BlockRegistry.smalldarkchocolatebrickdouble, block == BlockRegistry.smalldarkchocolatebrickdouble);
		this.setUnlocalizedName("killerjdog51.block_darkchocolatesmallbrickslab");
	}
}