package com.chocolatemod.brewing;

import com.chocolatemod.main.MainRegistry;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class brewing {

	public static void mainRegistry() {
		initialiseBlock();
		registerBlock();
	}

	//Brewing
	public static Block BlockMilkCauldron;
	public static int milkCauldronRenderID;
	public static Block BlockWhiteChocolateMilk;
	public static int whiteChocolatemilkCauldronRenderID;
	public static Block LightBlockChocolateMilk;
	public static int LightChocolatemilkCauldronRenderID;
	public static Block BlockChocolateMilk;
	public static int ChocolatemilkCauldronRenderID;
	public static Block BlockDarkChocolateMilk;
	public static int BlockDarkChocolateMilkRenderID;
	public static Block BlockExtraDarkChocolateMilk;
	public static int BlockExtraDarkChocolateMilkRenderID;

	//Bar Moulding
	public static Block BlockChocolateBarMould;
	public static int chocolateBarMouldRenderID;
	public static Block BlockDarkChocolateBarMould;
	public static int darkChocolateBarMouldRenderID;
	public static Block BlockLightChocolateBarMould;
	public static int lightChocolateBarMouldRenderID;
	public static Block BlockWhiteChocolateBarMould;
	public static int whiteChocolateBarMouldRenderID;
	public static Block BlockExtraDarkChocolateBarMould;
	public static int ExtraDarkChocolateBarMouldRenderID;

	//Ball Moulding
	public static Block BlockChocolateBallMould;
	public static int chocolateBallMouldRenderID;
	public static Block BlockDarkChocolateBallMould;
	public static int darkChocolateBallMouldRenderID;
	public static Block BlockLightChocolateBallMould;
	public static int lightChocolateBallMouldRenderID;
	public static Block BlockWhiteChocolateBallMould;
	public static int whiteChocolateBallMouldRenderID;
	public static Block BlockExtraDarkChocolateBallMould;
	public static int ExtraDarkChocolateBallMouldRenderID;
	
	public static void initialiseBlock() {

		if (MainRegistry.EnableBrewing){

		//Brewing
		BlockMilkCauldron = (new BlockMilkCauldron()).setHardness(2.0F).setBlockName("milkcauldron");
		BlockWhiteChocolateMilk = (new BlockWhiteChocolateMilkCauldron()).setHardness(2.0F).setBlockName("Whitechocolatemilkcauldron");
		LightBlockChocolateMilk = (new BlockLightChocolateMilkCauldron()).setHardness(2.0F).setBlockName("Lightchocolatemilkcauldron");
		BlockChocolateMilk = (new BlockChocolateMilkCauldron()).setHardness(2.0F).setBlockName("chocolatemilkcauldron");
		BlockDarkChocolateMilk = (new BlockDarkChocolateMilkCauldron()).setHardness(2.0F).setBlockName("darkchocolatemilkcauldron");
		BlockExtraDarkChocolateMilk = (new BlockExtraDarkChocolateMilkCauldron()).setHardness(2.0F).setBlockName("extradarkchocolatemilkcauldron");

		milkCauldronRenderID = RenderingRegistry.getNextAvailableRenderId();
		whiteChocolatemilkCauldronRenderID = RenderingRegistry.getNextAvailableRenderId();
		LightChocolatemilkCauldronRenderID = RenderingRegistry.getNextAvailableRenderId();
		ChocolatemilkCauldronRenderID = RenderingRegistry.getNextAvailableRenderId();
		BlockDarkChocolateMilkRenderID = RenderingRegistry.getNextAvailableRenderId();
		BlockExtraDarkChocolateMilkRenderID = RenderingRegistry.getNextAvailableRenderId();

		RenderingRegistry.registerBlockHandler(new RenderMilkCauldron());
		RenderingRegistry.registerBlockHandler(new RenderWhiteChocolateMilkCauldron());
		RenderingRegistry.registerBlockHandler(new RenderLightChocolateMilkCauldron());
		RenderingRegistry.registerBlockHandler(new RenderChocolateMilkCauldron());
		RenderingRegistry.registerBlockHandler(new RenderDarkChocolateMilkCauldron());
		RenderingRegistry.registerBlockHandler(new RenderExtraDarkChocolateMilkCauldron());

		}
		
		if (MainRegistry.EnableMolding){

		//Bar Moulding
		BlockChocolateBarMould = (new BlockChocolateBarMould()).setHardness(2.0F).setBlockName("chocolatebarmould");
		BlockDarkChocolateBarMould = (new BlockDarkChocolateBarMould()).setHardness(2.0F).setBlockName("darkchocolatebarmould");
		BlockLightChocolateBarMould = (new BlockLightChocolateBarMould()).setHardness(2.0F).setBlockName("lightchocolatebarmould");
		BlockWhiteChocolateBarMould = (new BlockWhiteChocolateBarMould()).setHardness(2.0F).setBlockName("whitechocolatebarmould");
		BlockExtraDarkChocolateBarMould = (new BlockExtraDarkChocolateBarMould()).setHardness(2.0F).setBlockName("extradarkchocolatebarmould");

		chocolateBarMouldRenderID = RenderingRegistry.getNextAvailableRenderId();
		darkChocolateBarMouldRenderID = RenderingRegistry.getNextAvailableRenderId();
		lightChocolateBarMouldRenderID = RenderingRegistry.getNextAvailableRenderId();
		whiteChocolateBarMouldRenderID = RenderingRegistry.getNextAvailableRenderId();
		ExtraDarkChocolateBarMouldRenderID = RenderingRegistry.getNextAvailableRenderId();

		RenderingRegistry.registerBlockHandler(new RenderChocolatebarMould());
		RenderingRegistry.registerBlockHandler(new RenderDarkChocolatebarMould());
		RenderingRegistry.registerBlockHandler(new RenderLightChocolatebarMould());
		RenderingRegistry.registerBlockHandler(new RenderWhiteChocolatebarMould());
		RenderingRegistry.registerBlockHandler(new RenderExtraDarkChocolatebarMould());

		//Ball Moulding
				BlockChocolateBallMould = (new BlockChocolateBallMould()).setHardness(2.0F).setBlockName("chocolateballmould");
				BlockDarkChocolateBallMould = (new BlockDarkChocolateBallMould()).setHardness(2.0F).setBlockName("darkchocolateballmould");
				BlockLightChocolateBallMould = (new BlockLightChocolateBallMould()).setHardness(2.0F).setBlockName("lightchocolateballmould");
				BlockWhiteChocolateBallMould = (new BlockWhiteChocolateBallMould()).setHardness(2.0F).setBlockName("whitechocolateballmould");
				BlockExtraDarkChocolateBallMould = (new BlockExtraDarkChocolateBallMould()).setHardness(2.0F).setBlockName("extradarkchocolateballmould");

				chocolateBallMouldRenderID = RenderingRegistry.getNextAvailableRenderId();
				darkChocolateBallMouldRenderID = RenderingRegistry.getNextAvailableRenderId();
				lightChocolateBallMouldRenderID = RenderingRegistry.getNextAvailableRenderId();
				whiteChocolateBallMouldRenderID = RenderingRegistry.getNextAvailableRenderId();
				ExtraDarkChocolateBallMouldRenderID = RenderingRegistry.getNextAvailableRenderId();

				RenderingRegistry.registerBlockHandler(new RenderChocolateballMould());
				RenderingRegistry.registerBlockHandler(new RenderDarkChocolateballMould());
				RenderingRegistry.registerBlockHandler(new RenderLightChocolateballMould());
				RenderingRegistry.registerBlockHandler(new RenderWhiteChocolateballMould());
				RenderingRegistry.registerBlockHandler(new RenderExtraDarkChocolateballMould());

		}
	}


	public static void registerBlock() {
		
		if (MainRegistry.EnableBrewing){

		GameRegistry.registerBlock(BlockMilkCauldron, BlockMilkCauldron.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(BlockWhiteChocolateMilk, BlockWhiteChocolateMilk.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(LightBlockChocolateMilk, LightBlockChocolateMilk.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(BlockChocolateMilk, BlockChocolateMilk.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(BlockDarkChocolateMilk, BlockDarkChocolateMilk.getUnlocalizedName());
		GameRegistry.registerBlock(BlockExtraDarkChocolateMilk, BlockExtraDarkChocolateMilk.getUnlocalizedName());

		}
		
		if (MainRegistry.EnableMolding){

		GameRegistry.registerBlock(BlockChocolateBarMould, BlockChocolateBarMould.getUnlocalizedName());
		GameRegistry.registerBlock(BlockDarkChocolateBarMould, BlockDarkChocolateBarMould.getUnlocalizedName());
		GameRegistry.registerBlock(BlockLightChocolateBarMould, BlockLightChocolateBarMould.getUnlocalizedName());
		GameRegistry.registerBlock(BlockWhiteChocolateBarMould, BlockWhiteChocolateBarMould.getUnlocalizedName());
		GameRegistry.registerBlock(BlockChocolateBallMould, BlockChocolateBallMould.getUnlocalizedName());
		GameRegistry.registerBlock(BlockDarkChocolateBallMould, BlockDarkChocolateBallMould.getUnlocalizedName());
		GameRegistry.registerBlock(BlockLightChocolateBallMould, BlockLightChocolateBallMould.getUnlocalizedName());
		GameRegistry.registerBlock(BlockWhiteChocolateBallMould, BlockWhiteChocolateBallMould.getUnlocalizedName());
		GameRegistry.registerBlock(BlockExtraDarkChocolateBarMould, BlockExtraDarkChocolateBarMould.getUnlocalizedName());
		GameRegistry.registerBlock(BlockExtraDarkChocolateBallMould, BlockExtraDarkChocolateBallMould.getUnlocalizedName());

		}
	}

}
