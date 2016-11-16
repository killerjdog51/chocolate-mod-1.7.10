package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemExtraDarkChocolateBrickSlabs extends ItemSlab
{
	public ItemExtraDarkChocolateBrickSlabs(Block block) 
	{
		super(block, BlockRegistry.ExtraDarkChocolateBrickSlabSingle, BlockRegistry.ExtraDarkChocolateBrickSlabDouble, block == BlockRegistry.ExtraDarkChocolateBrickSlabDouble);
	}
}