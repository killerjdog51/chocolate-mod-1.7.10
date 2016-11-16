package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemExtraDarkChocolateSlabs extends ItemSlab
{
	public ItemExtraDarkChocolateSlabs(Block block) 
	{
		super(block, BlockRegistry.ExtraDarkChocolateSlabSingle, BlockRegistry.ExtraDarkChocolateSlabDouble, block == BlockRegistry.ExtraDarkChocolateSlabDouble);
	}
}