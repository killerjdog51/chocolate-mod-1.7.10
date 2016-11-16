package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemChocolateBrickSlabs extends ItemSlab
{
	public ItemChocolateBrickSlabs(Block block) 
	{
		super(block, BlockRegistry.chocolatebricksingle, BlockRegistry.chocolatebrickdouble, block == BlockRegistry.chocolatebrickdouble);
		this.setUnlocalizedName("killerjdog51.block_chocolatebrickslab");
	}
}