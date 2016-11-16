package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemExtraDarkChocolatePlankSlabs extends ItemSlab
{
	public ItemExtraDarkChocolatePlankSlabs(Block block) 
	{
		super(block, BlockRegistry.ExtraDarkChocolatePlankSlabSingle, BlockRegistry.ExtraDarkChocolatePlankSlabDouble, block == BlockRegistry.ExtraDarkChocolatePlankSlabDouble);
		this.setUnlocalizedName("killerjdog51.block_extradarkchocolateplankslab");

	}
}