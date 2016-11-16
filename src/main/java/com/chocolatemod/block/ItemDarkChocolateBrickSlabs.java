package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemDarkChocolateBrickSlabs extends ItemSlab
{
	public ItemDarkChocolateBrickSlabs(Block block) 
	{
		super(block, BlockRegistry.darkchocolatebricksingle, BlockRegistry.darkchocolatebrickdouble, block == BlockRegistry.darkchocolatebrickdouble);
		this.setUnlocalizedName("killerjdog51.block_darkchocolatebrickslab");
	}
}