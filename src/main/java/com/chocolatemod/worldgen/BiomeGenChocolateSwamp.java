package com.chocolatemod.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import com.chocolatemod.block.BlockRegistry;
import com.chocolatemod.liquids.LiquidRegistry;
import com.chocolatemod.mobs.Entitychocolateglob;
import com.chocolatemod.mobs.Entitydarkchocolateglob;
import com.chocolatemod.mobs.Entitylightchocolateglob;
import com.chocolatemod.mobs.Entitywhitechocolateglob;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BiomeGenChocolateSwamp extends BiomeGenChocolateBase {
	
	private BiomeDecoratorChocolate customChocolateBiomeDecorator;
	
	@Override
	public BiomeDecorator createBiomeDecorator(){
		return getModdedBiomeDecorator(new BiomeDecoratorChocolate(this));
	}
	protected BiomeGenChocolateSwamp(int par1) {
		super(par1);

		this.theBiomeDecorator = new BiomeDecoratorChocolate(this);
		this.customChocolateBiomeDecorator = (BiomeDecoratorChocolate)theBiomeDecorator;
		this.topBlock = BlockRegistry.chocoGrass;
		this.fillerBlock = BlockRegistry.chocoDirt;
		this.theChocolateBiomeDecorator.treesPerChunk = 2;
		this.theChocolateBiomeDecorator.flowersPerChunk = 1;
		this.theChocolateBiomeDecorator.deadBushPerChunk = 1;
		this.theChocolateBiomeDecorator.mushroomsPerChunk = 8;
		this.theChocolateBiomeDecorator.reedsPerChunk = 10;
		this.theChocolateBiomeDecorator.clayPerChunk = 1;
		this.theChocolateBiomeDecorator.waterlilyPerChunk = 4;
		this.theChocolateBiomeDecorator.sandPerChunk2 = 0;
		this.theChocolateBiomeDecorator.sandPerChunk = 0;
		this.theChocolateBiomeDecorator.grassPerChunk = 5;
		this.waterColorMultiplier = 14745518;
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(Entitychocolateglob.class, 1, 1, 1));		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(Entitychocolateglob.class, 1, 1, 1));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(Entitydarkchocolateglob.class, 1, 1, 1));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(Entitylightchocolateglob.class, 1, 1, 1));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(Entitywhitechocolateglob.class, 1, 1, 1));
		this.flowers.clear();
		
		this.customChocolateBiomeDecorator.mintPerChunk = 15;
		
		 System.out.println("grass = " + BlockRegistry.chocoGrass + ", dirt = " + BlockRegistry.chocoDirt);

	}

	@Override
	public WorldGenAbstractTree func_150567_a(Random p_150567_1_) {
		return this.worldGeneratorChocolateSwamp;
	}


	

	public void genTerrainBlocks(World p_150573_1_, Random p_150573_2_, Block[] p_150573_3_, byte[] p_150573_4_, int p_150573_5_, int p_150573_6_, double p_150573_7_) {
		super.genTerrainBlocks(p_150573_1_, p_150573_2_, p_150573_3_, p_150573_4_, p_150573_5_, p_150573_6_, p_150573_7_);
		double d1 = plantNoise.func_151601_a((double) p_150573_5_ * 0.25D, (double) p_150573_6_ * 0.25D);

		if (d1 > 0.0D) {
			int k = p_150573_5_ & 15;
			int l = p_150573_6_ & 15;
			int i1 = p_150573_3_.length / 256;

			for (int j1 = 255; j1 >= 0; --j1) {
				int k1 = (l * 16 + k) * i1 + j1;

				if (p_150573_3_[k1] == null || p_150573_3_[k1].getMaterial() != Material.air) {
					if (j1 == 62 && p_150573_3_[k1] != LiquidRegistry.chocolateMilkBlock) {
						p_150573_3_[k1] = LiquidRegistry.chocolateMilkBlock;

						if (d1 < 0.12D) {
							p_150573_3_[k1 + 1] = Blocks.waterlily;
						}
					}

					break;
				}
			}
		}

		super.genBiomeTerrain(p_150573_1_, p_150573_2_, p_150573_3_, p_150573_4_, p_150573_5_, p_150573_6_, p_150573_7_);
	}

	/**
	 * Provides the basic grass color based on the biome temperature and rainfall
	 */
	@SideOnly(Side.CLIENT)
	public int getBiomeGrassColor(int p_150558_1_, int p_150558_2_, int p_150558_3_) {
		double d0 = plantNoise.func_151601_a((double) p_150558_1_ * 0.0225D, (double) p_150558_3_ * 0.0225D);
		return d0 < -0.1D ? 5011004 : 6975545;
	}

	/**
	 * Provides the basic foliage color based on the biome temperature and rainfall
	 */
	@SideOnly(Side.CLIENT)
	public int getBiomeFoliageColor(int p_150571_1_, int p_150571_2_, int p_150571_3_) {
		return 6975545;
	}
}