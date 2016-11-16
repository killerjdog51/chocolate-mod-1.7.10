package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemlightchocoSandStoneSlabs extends ItemSlab
{
	public ItemlightchocoSandStoneSlabs(Block block) 
	{
		super(block, BlockRegistry.lightchocoSandStoneSlabsingle, BlockRegistry.lightchocoSandStoneSlabdouble, block == BlockRegistry.lightchocoSandStoneSlabdouble);
		this.setUnlocalizedName("killerjdog51.block_lightchocolatesandstoneslab");
	}
}