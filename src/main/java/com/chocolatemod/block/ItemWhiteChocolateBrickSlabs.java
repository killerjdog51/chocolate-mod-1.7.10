package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemWhiteChocolateBrickSlabs extends ItemSlab
{
	public ItemWhiteChocolateBrickSlabs(Block block) 
	{
		super(block, BlockRegistry.whitechocolatebricksingle, BlockRegistry.whitechocolatebrickdouble, block == BlockRegistry.whitechocolatebrickdouble);
		this.setUnlocalizedName("killerjdog51.block_whitechocolatebrickslab");
	}
}