package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemExtraDarkChocolateSmoothSandstoneSlabs extends ItemSlab
{
	public ItemExtraDarkChocolateSmoothSandstoneSlabs(Block block) 
	{
		super(block, BlockRegistry.ExtraDarkChocolateSmoothSandstoneSingle, BlockRegistry.ExtraDarkChocolateSmoothSandstoneDouble, block == BlockRegistry.ExtraDarkChocolateSmoothSandstoneDouble);
	}
}