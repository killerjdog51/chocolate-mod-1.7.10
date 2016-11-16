package com.chocolatemod.worldgen;

import com.chocolatemod.crops.crops;
import com.chocolatemod.mobs.*;
import com.chocolatemod.plants.BlockChocolateFlower;
import com.chocolatemod.plants.PlantRegistry;

import net.minecraft.block.BlockFlower;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary;

import java.util.Random;

import static net.minecraftforge.common.BiomeDictionary.Type;

public class BiomeGenChocolatePlains extends BiomeGenChocolateBase {

	private WorldGenerator theWorldGenerator;
	private BiomeDecoratorChocolate customBiomeDecorator;

	@Override
public BiomeDecorator createBiomeDecorator(){
	return getModdedBiomeDecorator(new BiomeDecoratorChocolate(this));
}
	protected BiomeGenChocolatePlains(int par1) {
		super(par1);

		this.theBiomeDecorator = new BiomeDecoratorChocolate(this);
		this.customBiomeDecorator = (BiomeDecoratorChocolate)theBiomeDecorator;

		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.add(new SpawnListEntry(Entitycocoacow.class, 6, 4, 6));
		this.spawnableCreatureList.add(new SpawnListEntry(Entitydarkcocoacow.class, 6, 4, 6));
		this.spawnableCreatureList.add(new SpawnListEntry(Entitylightcocoacow.class, 6, 4, 6));
		this.spawnableCreatureList.add(new SpawnListEntry(Entitywhitecocoacow.class, 6, 4, 6));
		this.spawnableCreatureList.add(new SpawnListEntry(Entitychocolatechicken.class, 6, 5, 7));
		this.theChocolateBiomeDecorator.treesPerChunk = -999;
		this.theChocolateBiomeDecorator.grassPerChunk = 10;


		    new WorldGenChocolateFlowers(PlantRegistry.chocolateflower1, 0);
	        new WorldGenChocolateFlowers(PlantRegistry.chocolateflower2, 0);
	        new WorldGenChocolateFlowers(PlantRegistry.chocolateflower2, 1);
	        new WorldGenChocolateFlowers(PlantRegistry.chocolateflower2, 2);
	        new WorldGenChocolateFlowers(PlantRegistry.chocolateflower2, 3);
	        new WorldGenChocolateFlowers(PlantRegistry.chocolateflower2, 4);
	        new WorldGenChocolateFlowers(PlantRegistry.chocolateflower2, 5);
	        new WorldGenChocolateFlowers(PlantRegistry.chocolateflower2, 6);
	        new WorldGenChocolateFlowers(PlantRegistry.chocolateflower2, 7);
	        new WorldGenChocolateFlowers(PlantRegistry.chocolateflower2, 8);
	        new WorldGenChocolateFlowers(PlantRegistry.chocolateflower2, 9);
	        new WorldGenChocolateFlowers(PlantRegistry.chocolateflower2, 10);
	        new WorldGenChocolateFlowers(PlantRegistry.chocolateflower2, 11);

		}
	}



