package com.chocolatemod.worldgen;


import com.chocolatemod.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.DimensionManager;


public class WorldGenRegistry {

	public static ChocolateBiomeGenerator worldGen = new ChocolateBiomeGenerator();
	
	public static void init() {
		DimensionManager.registerProviderType(MainRegistry.DimID, WorldProviderChocolateTest.class, false);
		DimensionManager.registerDimension(MainRegistry.DimID, MainRegistry.DimID);
		GameRegistry.registerWorldGenerator(new WorldGenChocolateOres(), MainRegistry.DimID);
		GameRegistry.registerWorldGenerator(worldGen, MainRegistry.DimID); 
	}

	public static void initialise() {

	}
}