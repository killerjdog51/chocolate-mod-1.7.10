package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemExtraDarkChocolateSandstoneSlabs extends ItemSlab
{
	public ItemExtraDarkChocolateSandstoneSlabs(Block block) 
	{
		super(block, BlockRegistry.ExtraDarkChocolateSandstoneSingle, BlockRegistry.ExtraDarkChocolateSandstoneDouble, block == BlockRegistry.ExtraDarkChocolateSandstoneDouble);
	}
}