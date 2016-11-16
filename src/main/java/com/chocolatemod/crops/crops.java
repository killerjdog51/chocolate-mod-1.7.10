package com.chocolatemod.crops;

import com.chocolatemod.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.oredict.OreDictionary;

public class crops {

	public static void mainRegistry() {
		initialiseBlock();
		registerBlock();
	}

	//Crops
	public static Block Nuts;
	public static Item nuts;
	public static Block Strawberry;
	public static Item strawberry;
	public static Block Mint;
	public static Item mintSeeds;

	public static void initialiseBlock() {
		//Crops
		Nuts = (new Nuts()).setBlockName("nuts").setBlockTextureName("killerjdog51:nuts");
		nuts = new ItemSeeds(Nuts, Blocks.farmland).setUnlocalizedName("nuts").setTextureName("killerjdog51:nuts").setCreativeTab(MainRegistry.tabChocolateMisc);

		Strawberry = (new Strawberry()).setBlockName("strawberry").setBlockTextureName("killerjdog51:strawberry");
		strawberry = new ItemSeedFood(2, 0.2F, Strawberry, Blocks.farmland).setUnlocalizedName("Strawberry").setTextureName("killerjdog51:strawberry").setCreativeTab(MainRegistry.tabChocolateMisc);

		Mint = (new Mint()).setBlockName("mint").setBlockTextureName("killerjdog51:mint");
		mintSeeds = new ItemSeeds(Mint, Blocks.farmland).setUnlocalizedName("MintSeeds").setTextureName("killerjdog51:MintSeeds").setCreativeTab(MainRegistry.tabChocolateMisc);


	}

	public static void registerBlock() {
		GameRegistry.registerBlock(Nuts, Nuts.getUnlocalizedName());
		GameRegistry.registerItem(nuts, nuts.getUnlocalizedName());
		GameRegistry.registerBlock(Strawberry, Strawberry.getUnlocalizedName());
		GameRegistry.registerItem(strawberry, strawberry.getUnlocalizedName());
		GameRegistry.registerBlock(Mint, Mint.getUnlocalizedName());
		GameRegistry.registerItem(mintSeeds, mintSeeds.getUnlocalizedName());
		
		//Ore Dictionary
		
		OreDictionary.registerOre("listAllfruit", strawberry);
		OreDictionary.registerOre("cropStrawberry", strawberry);
		OreDictionary.registerOre("listAllberry", strawberry);
		OreDictionary.registerOre("listAllseed", strawberry);
		OreDictionary.registerOre("seedStrawberry", strawberry);
		
		OreDictionary.registerOre("listAllseed", nuts);
		OreDictionary.registerOre("seedPeanut", nuts);
		OreDictionary.registerOre("cropPeanut", nuts);
		OreDictionary.registerOre("listAllnut", nuts);
		
		OreDictionary.registerOre("seedTea", mintSeeds);
		OreDictionary.registerOre("listAllseed", mintSeeds);

		//Chocolate Specific
		OreDictionary.registerOre("strawberry", strawberry);
		OreDictionary.registerOre("strawberrySeed", strawberry);

		OreDictionary.registerOre("peanut", nuts);
		OreDictionary.registerOre("nut", nuts);
		OreDictionary.registerOre("peanutSeed", nuts);
		OreDictionary.registerOre("nutSeed", nuts);

		OreDictionary.registerOre("mintSeed", mintSeeds);
		OreDictionary.registerOre("teaSeed", mintSeeds);

	}

}
