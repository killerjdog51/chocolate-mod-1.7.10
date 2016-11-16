package com.chocolatemod.block;

import com.chocolatemod.main.MainRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class ExtraDarkChocolateSmallBrickStairs extends BlockStairs {

	protected ExtraDarkChocolateSmallBrickStairs(Block par2Block, int par3) {
		super(BlockRegistry.smallchocolatebrick, 4);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(MainRegistry.tabChocolateBlocks);
		this.setLightOpacity(0);
	}

}
