package com.chocolatemod.worldgen;

import com.chocolatemod.block.BlockRegistry;
import com.chocolatemod.liquids.LiquidRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenChocolateDesertWell extends WorldGenerator {
	private static final String __OBFID = "CL_00000407";

	public boolean generate(World p_76484_1_, Random p_76484_2_, int p_76484_3_, int p_76484_4_, int p_76484_5_) {
		while (p_76484_1_.isAirBlock(p_76484_3_, p_76484_4_, p_76484_5_) && p_76484_4_ > 2) {
			--p_76484_4_;
		}

		if (p_76484_1_.getBlock(p_76484_3_, p_76484_4_, p_76484_5_) != BlockRegistry.chocoSand) {
			return false;
		} else {
			int l;
			int i1;

			for (l = -2; l <= 2; ++l) {
				for (i1 = -2; i1 <= 2; ++i1) {
					if (p_76484_1_.isAirBlock(p_76484_3_ + l, p_76484_4_ - 1, p_76484_5_ + i1) && p_76484_1_.isAirBlock(p_76484_3_ + l, p_76484_4_ - 2, p_76484_5_ + i1)) {
						return false;
					}
				}
			}

			for (l = -1; l <= 0; ++l) {
				for (i1 = -2; i1 <= 2; ++i1) {
					for (int j1 = -2; j1 <= 2; ++j1) {
						p_76484_1_.setBlock(p_76484_3_ + i1, p_76484_4_ + l, p_76484_5_ + j1, BlockRegistry.chocoSandstone, 0, 2);
					}
				}
			}

			p_76484_1_.setBlock(p_76484_3_, p_76484_4_, p_76484_5_, LiquidRegistry.chocolateMilkBlock, 0, 2);
			p_76484_1_.setBlock(p_76484_3_ - 1, p_76484_4_, p_76484_5_, LiquidRegistry.chocolateMilkBlock, 0, 2);
			p_76484_1_.setBlock(p_76484_3_ + 1, p_76484_4_, p_76484_5_, LiquidRegistry.chocolateMilkBlock, 0, 2);
			p_76484_1_.setBlock(p_76484_3_, p_76484_4_, p_76484_5_ - 1, LiquidRegistry.chocolateMilkBlock, 0, 2);
			p_76484_1_.setBlock(p_76484_3_, p_76484_4_, p_76484_5_ + 1, LiquidRegistry.chocolateMilkBlock, 0, 2);

			for (l = -2; l <= 2; ++l) {
				for (i1 = -2; i1 <= 2; ++i1) {
					if (l == -2 || l == 2 || i1 == -2 || i1 == 2) {
						p_76484_1_.setBlock(p_76484_3_ + l, p_76484_4_ + 1, p_76484_5_ + i1, BlockRegistry.chocoSandstone, 0, 2);
					}
				}
			}

			p_76484_1_.setBlock(p_76484_3_ + 2, p_76484_4_ + 1, p_76484_5_, BlockRegistry.whitechocoSandStoneSlabsingle, 0, 2);
			p_76484_1_.setBlock(p_76484_3_ - 2, p_76484_4_ + 1, p_76484_5_, BlockRegistry.whitechocoSandStoneSlabsingle, 0, 2);
			p_76484_1_.setBlock(p_76484_3_, p_76484_4_ + 1, p_76484_5_ + 2, BlockRegistry.whitechocoSandStoneSlabsingle, 0, 2);
			p_76484_1_.setBlock(p_76484_3_, p_76484_4_ + 1, p_76484_5_ - 2, BlockRegistry.whitechocoSandStoneSlabsingle, 0, 2);

			for (l = -1; l <= 1; ++l) {
				for (i1 = -1; i1 <= 1; ++i1) {
					if (l == 0 && i1 == 0) {
						p_76484_1_.setBlock(p_76484_3_ + l, p_76484_4_ + 4, p_76484_5_ + i1, BlockRegistry.chocoSandstone, 0, 2);
					} else {
						p_76484_1_.setBlock(p_76484_3_ + l, p_76484_4_ + 4, p_76484_5_ + i1, BlockRegistry.whitechocoSandStoneSlabsingle, 0, 2);
					}
				}
			}

			for (l = 1; l <= 3; ++l) {
				p_76484_1_.setBlock(p_76484_3_ - 1, p_76484_4_ + l, p_76484_5_ - 1, BlockRegistry.chocoSandstone, 0, 2);
				p_76484_1_.setBlock(p_76484_3_ - 1, p_76484_4_ + l, p_76484_5_ + 1, BlockRegistry.chocoSandstone, 0, 2);
				p_76484_1_.setBlock(p_76484_3_ + 1, p_76484_4_ + l, p_76484_5_ - 1, BlockRegistry.chocoSandstone, 0, 2);
				p_76484_1_.setBlock(p_76484_3_ + 1, p_76484_4_ + l, p_76484_5_ + 1, BlockRegistry.chocoSandstone, 0, 2);
			}

			return true;
		}
	}
}