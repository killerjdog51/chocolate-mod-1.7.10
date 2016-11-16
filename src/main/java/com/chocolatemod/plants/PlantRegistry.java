package com.chocolatemod.plants;

import com.chocolatemod.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class PlantRegistry {

	public static void mainRegistry() {
		initialiseBlock();
		registerBlock();
	}

	//Blocks

	public static Block chocolateflower1;
	public static Block chocolateflower2;
	public static Block cocoaleaf;
	public static Block cocoasapling;
	public static Block CocoaLog;
	public static Block CocoaPod;
	public static Block chocolatemushroomwhite;
	public static Block chocolatemushroombrown;
	public static Block chocolatemushroomcapwhite;
	public static Block chocolatemushroomcapbrown;
	public static Block stringyCaramel;
	public static Block oldCocoaLeaf;
	public static Block oldCocoaLog;
	public static Block ChocolateGrass;
	public static Block MintGrass;

	public static void initialiseBlock() {


		chocolateflower1 = new BlockChocolateFlower(0).setHardness(0.5F).setStepSound(Block.soundTypeGrass).setBlockName("chocolateflower1").setCreativeTab(MainRegistry.tabChocolateBlocks).setBlockTextureName("killerjdog51:chocolateflower");
		chocolateflower2 = new BlockChocolateFlower(1).setHardness(0.5F).setStepSound(Block.soundTypeGrass).setBlockName("chocolateflower2").setCreativeTab(MainRegistry.tabChocolateBlocks).setBlockTextureName("killerjdog51:chocolateflower");

		cocoaleaf = (new BlockCocoaLeaf(Material.leaves, false)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundTypeGrass).setBlockName("leaves_cocoa").setBlockTextureName("killerjdog51:leaves").setCreativeTab(MainRegistry.tabChocolateBlocks);
		cocoasapling = new BlockCocoaSapling().setBlockName("sapling").setBlockTextureName("killerjdog51:sapling").setCreativeTab(MainRegistry.tabChocolateBlocks);;
		CocoaLog = new BlockCocoaLog().setBlockName("Cocoa").setBlockTextureName("killerjdog51:log").setStepSound(Block.soundTypeWood).setCreativeTab(MainRegistry.tabChocolateBlocks);
		CocoaPod = new BlockCocoaPod().setHardness(0.2F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("cocoa").setBlockTextureName("killerjdog51:cocoa_block").setCreativeTab(MainRegistry.tabChocolateBlocks);

		chocolatemushroomwhite = new BlockChocolateMushroom().setHardness(0.0F).setStepSound(Block.soundTypeGrass).setLightLevel(0.125F).setBlockName("chocolatemushroomwhite").setBlockTextureName("killerjdog51:chocolatemushroom_white").setCreativeTab(MainRegistry.tabChocolateBlocks);
		chocolatemushroombrown = new BlockChocolateMushroom().setHardness(0.0F).setStepSound(Block.soundTypeGrass).setBlockName("chocolatemushroombrown").setBlockTextureName("killerjdog51:chocolatemushroom_brown").setCreativeTab(MainRegistry.tabChocolateBlocks);
		GameRegistry.registerBlock(chocolatemushroomwhite, chocolatemushroomwhite.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocolatemushroombrown, chocolatemushroombrown.getUnlocalizedName().substring(5));

		chocolatemushroomcapwhite = new BlockHugeChocolateMushroom(Material.wood, 0).setHardness(0.2F).setStepSound(Block.soundTypeWood).setBlockName("hugechocolatemushroomwhite").setBlockTextureName("killerjdog51:chocolatemushroom_block");
		chocolatemushroomcapbrown = new BlockHugeChocolateMushroom(Material.wood, 1).setHardness(0.2F).setStepSound(Block.soundTypeWood).setBlockName("hugechocolatemushroombrown").setBlockTextureName("killerjdog51:chocolatemushroom_block");
		GameRegistry.registerBlock(chocolatemushroomcapwhite, chocolatemushroomcapwhite.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocolatemushroomcapbrown, chocolatemushroomcapbrown.getUnlocalizedName().substring(5));

		stringyCaramel = new BlockStringyCaramel().setHardness(0.2F).setStepSound(Block.soundTypeGrass).setBlockName("stringycaramel").setBlockTextureName("killerjdog51:caramelvine").setCreativeTab(MainRegistry.tabChocolateBlocks);

		oldCocoaLeaf = new BlockOldCocoaLeaf(Material.leaves, false).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundTypeGrass).setBlockName("cocoa_leaves").setBlockTextureName("killerjdog51:leaves_cocoa").setCreativeTab(MainRegistry.tabChocolateBlocks);
		oldCocoaLog = new BlockOldCocoaLog().setBlockName("oldCocoa").setBlockTextureName("killerjdog51:log").setStepSound(Block.soundTypeWood).setCreativeTab(MainRegistry.tabChocolateBlocks).setCreativeTab(MainRegistry.tabChocolateBlocks);

		ChocolateGrass = new BlockChocolateGrass().setHardness(0.0F).setStepSound(Block.soundTypeGrass).setBlockName("ChocolateGrass").setBlockTextureName("killerjdog51:chocolategrass").setCreativeTab(MainRegistry.tabChocolateBlocks);
    	MintGrass = new BlockMintGrass().setHardness(0.0F).setStepSound(Block.soundTypeGrass).setBlockName("MintGrass").setBlockTextureName("killerjdog51:mintgrass").setCreativeTab(MainRegistry.tabChocolateBlocks);
	}

	public static void registerBlock() {

		GameRegistry.registerBlock(chocolateflower1, chocolateflower1.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocolateflower2, ItemFlowerBlocks.class, chocolateflower2.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(cocoaleaf, ItemCocoaLeaf.class, cocoaleaf.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(cocoasapling, ItemCocoaSapling.class, cocoasapling.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(CocoaLog, ItemCocoaLog.class, CocoaLog.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(CocoaPod, CocoaPod.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stringyCaramel, stringyCaramel.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(oldCocoaLeaf, ItemOldCocoaLog.class, oldCocoaLeaf.getUnlocalizedName());
		GameRegistry.registerBlock(oldCocoaLog, ItemOldCocoaLog.class, oldCocoaLog.getUnlocalizedName());
		GameRegistry.registerBlock(ChocolateGrass, ChocolateGrass.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(MintGrass, MintGrass.getUnlocalizedName().substring(5));
		    
		//Ore Dictionary
		OreDictionary.registerOre("logWood", new ItemStack(CocoaLog, 1, OreDictionary.WILDCARD_VALUE));

		OreDictionary.registerOre("treeSapling", new ItemStack(cocoasapling, 1, OreDictionary.WILDCARD_VALUE));
		
		OreDictionary.registerOre("treeLeaves", oldCocoaLeaf);
		OreDictionary.registerOre("treeLeaves", new ItemStack(cocoaleaf, 1, OreDictionary.WILDCARD_VALUE));

		OreDictionary.registerOre("tallGrass", ChocolateGrass);
		OreDictionary.registerOre("tallGrass", MintGrass);
		
		//Chocolate Specific
		OreDictionary.registerOre("cocoaLog", new ItemStack(CocoaLog, 1, OreDictionary.WILDCARD_VALUE));

		OreDictionary.registerOre("cocoaSapling", new ItemStack(cocoasapling, 1, OreDictionary.WILDCARD_VALUE));
		
		OreDictionary.registerOre("cocoaLeaves", oldCocoaLeaf);
		OreDictionary.registerOre("chocolateLeaves", new ItemStack(cocoaleaf, 1, OreDictionary.WILDCARD_VALUE));

		OreDictionary.registerOre("cocoaPod", CocoaPod);
		OreDictionary.registerOre("chocolateGrass", ChocolateGrass);
		OreDictionary.registerOre("mintGrass", MintGrass);

		OreDictionary.registerOre("caramel", stringyCaramel);
		OreDictionary.registerOre("flowerChocolate", chocolateflower1);
		OreDictionary.registerOre("flowerChocolate", new ItemStack(chocolateflower2, 1, OreDictionary.WILDCARD_VALUE));

	}

}
