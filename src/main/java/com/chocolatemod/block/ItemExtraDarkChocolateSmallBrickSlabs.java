package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemExtraDarkChocolateSmallBrickSlabs extends ItemSlab
{
	public ItemExtraDarkChocolateSmallBrickSlabs(Block block) 
	{
		super(block, BlockRegistry.ExtraDarkChocolateSmallBrickSlabSingle, BlockRegistry.ExtraDarkChocolateSmallBrickSlabDouble, block == BlockRegistry.ExtraDarkChocolateSmallBrickSlabDouble);
	}
}