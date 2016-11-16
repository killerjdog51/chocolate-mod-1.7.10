package com.chocolatemod.worldgen;

import java.util.Random;

import com.chocolatemod.crops.crops;
import com.chocolatemod.plants.PlantRegistry;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import cpw.mods.fml.common.IWorldGenerator;

public class ChocolateBiomeGenerator implements IWorldGenerator {

        @Override
        public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
                BiomeGenBase b =  world.getBiomeGenForCoords(chunkX, chunkZ);
                if(BiomeDictionary.isBiomeOfType(b, Type.PLAINS)) {
                        // Then we have plains!
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
                
                if(BiomeDictionary.isBiomeOfType(b, Type.MOUNTAIN)) {
                	new WorldGenFlowers(crops.Nuts);

                }
                
                if(BiomeDictionary.isBiomeOfType(b, Type.FOREST)) {
                	new WorldGenFlowers(crops.Strawberry);

                }
                
                if(BiomeDictionary.isBiomeOfType(b, Type.SWAMP)) {
                	new WorldGenFlowers(crops.Mint);

                }
        }

}