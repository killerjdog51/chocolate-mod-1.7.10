package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemwhitechocoSandStoneSlabs extends ItemSlab
{
	public ItemwhitechocoSandStoneSlabs(Block block) 
	{
		super(block, BlockRegistry.whitechocoSandStoneSlabsingle, BlockRegistry.whitechocoSandStoneSlabdouble, block == BlockRegistry.whitechocoSandStoneSlabdouble);
		this.setUnlocalizedName("killerjdog51.block_whitechocolatesandstoneslab");
	}
}