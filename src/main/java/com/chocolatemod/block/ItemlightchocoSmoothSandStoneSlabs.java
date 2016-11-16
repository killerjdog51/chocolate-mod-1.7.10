package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemlightchocoSmoothSandStoneSlabs extends ItemSlab
{
	public ItemlightchocoSmoothSandStoneSlabs(Block block) 
	{
		super(block, BlockRegistry.lightchocoSmoothSandStoneSlabsingle, BlockRegistry.lightchocoSmoothSandStoneSlabdouble, block == BlockRegistry.lightchocoSmoothSandStoneSlabdouble);
		this.setUnlocalizedName("killerjdog51.block_lightchocolatesmoothsandstoneslab");
	}
}