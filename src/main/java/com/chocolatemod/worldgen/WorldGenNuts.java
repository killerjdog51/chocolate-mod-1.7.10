package com.chocolatemod.worldgen;

import com.chocolatemod.block.BlockRegistry;
import com.chocolatemod.crops.crops;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenNuts extends WorldGenerator {
	public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5) {
		for (int var6 = 0; var6 < 128; ++var6) {
			System.out.println("Nut Generator is Called");

			int var7 = par3 + par2Random.nextInt(8) - par2Random.nextInt(8);
			int var8 = par4 + par2Random.nextInt(4) - par2Random.nextInt(4);
			int var9 = par5 + par2Random.nextInt(8) - par2Random.nextInt(8);

			if (par1World.isAirBlock(var7, var8, var9) && par1World.getBlock(var7, var8 - 1, var9) == BlockRegistry.chocoGrass && crops.Nuts.canPlaceBlockAt(par1World, var7, var8, var9)) {
				par1World.setBlock(var7, var8, var9, crops.Nuts, par2Random.nextInt(4), 2);
			}
		}

		return true;
	}
}
