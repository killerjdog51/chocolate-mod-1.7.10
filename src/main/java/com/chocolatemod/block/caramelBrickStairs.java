package com.chocolatemod.block;

import com.chocolatemod.main.MainRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class caramelBrickStairs extends BlockStairs {

	protected caramelBrickStairs(Block par2Block, int par3) {
		super(BlockRegistry.caramelBlock, 7);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(MainRegistry.tabChocolateBlocks);
		this.setLightOpacity(0);
	}

}
