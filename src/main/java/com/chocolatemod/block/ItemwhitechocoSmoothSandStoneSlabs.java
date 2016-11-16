package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemwhitechocoSmoothSandStoneSlabs extends ItemSlab
{
	public ItemwhitechocoSmoothSandStoneSlabs(Block block) 
	{
		super(block, BlockRegistry.whitechocoSmoothSandStoneSlabsingle, BlockRegistry.whitechocoSmoothSandStoneSlabdouble, block == BlockRegistry.whitechocoSmoothSandStoneSlabdouble);
		this.setUnlocalizedName("killerjdog51.block_whitechocolatesmoothsandstoneslab");
	}
}