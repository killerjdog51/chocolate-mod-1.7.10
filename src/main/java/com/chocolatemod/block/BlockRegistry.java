package com.chocolatemod.block;

import com.chocolatemod.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockRedstoneOre;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class BlockRegistry {

	public static void mainRegistry() {
		initialiseBlock();
		registerBlock();
	}

	//Blocks
	public static Block chocolateblock;
	public static Block fruitychocolateblock;
	public static Block mintychocolateblock;
	public static Block cookiesandcreamblock;
	public static Block ChocolateMould;
	public static Block ChocolateBallMould;
	public static Block chocolatebrick;
	public static Block smallchocolatebrick;
	public static Block chocolatepiller;
	public static Block chocolatechiseled;
	public static Block chocolatebrickstairs;
	public static Block darkchocolatebrickstairs;
	public static Block lightchocolatebrickstairs;
	public static Block whitechocolatebrickstairs;
	public static Block chocolatefence;
	public static Block darkchocolatefence;
	public static Block lightchocolatefence;
	public static Block whitechocolatefence;
	public static Block chocolatebrickfence;
	public static Block darkchocolatebrickfence;
	public static Block lightchocolatebrickfence;
	public static Block whitechocolatebrickfence;
	public static Block chocolatestairs;
	public static Block darkchocolatestairs;
	public static Block lightchocolatestairs;
	public static Block whitechocolatestairs;
	public static Block BlockChocolatePortal;
	public static Block smallchocolatebrickstairs;
	public static Block smalldarkchocolatebrickstairs;
	public static Block smalllightchocolatebrickstairs;
	public static Block smallwhitechocolatebrickstairs;
	public static Block chocolatepane;
	public static Block darkchocolatepane;
	public static Block lightchocolatepane;
	public static Block whitechocolatepane;
	public static Block chocolateOres;
	public static Block goldchocolateblock;
	public static Block CocoaPlanks;
	public static Block CocoaStairs;
	public static Block chocoGrass;
	public static Block chocoStone;
	public static Block chocoCobbleStone;
	public static Block chocoDiamond;
	public static Block chocoGold;
	public static Block chocoIron;
	public static Block chocoCoal;
	public static Block chocoRedstone;
	public static Block litChocoRedstone;
	public static Block chocoLapis;
	public static Block chocoCobbleStoneStairs;
	public static Block darkchocoCobbleStoneStairs;
	public static Block lightchocoCobbleStoneStairs;
	public static Block whitechocoCobbleStoneStairs;
	public static Block cocoaDoor;
	public static Block ChocolateDoor;
	public static Block DarkChocolateDoor;
	public static Block LightChocolateDoor;
	public static Block WhiteChocolateDoor;
	public static Block chocoDirt;
	public static Block chocoSand;
	public static Block chocoCobbleStoneWall;
	public static Block chocolateBrickWall;
	public static Block chocolateSmallBrickWall;
	public static Block chocoGlass;
	public static Block chocoGlassPane;
	public static Block darkChocoGlassPane;
	public static Block lightChocoGlassPane;
	public static Block whiteChocoGlassPane;
	public static Block chocoSandstone;
	public static Block whiteChocoSandstonestairs;
	public static Block whiteChocoSmoothSandstoneStairs;
	public static Block ChocoSandstonestairs;
	public static Block ChocoSmoothSandstoneStairs;
	public static Block darkChocoSandstonestairs;
	public static Block darkChocoSmoothSandstoneStairs;
	public static Block lightChocoSandstonestairs;
	public static Block lightChocoSmoothSandstoneStairs;
	public static Block caramelBlock;
	public static Block cocoaFence;
	public static Block chocolatePlankFence;
	public static Block darkChocolatePlankFence;
	public static Block lightChocolatePlankFence;
	public static Block whiteChocolatePlankFence;
	public static Block caramelStairs;
	public static Block caramelBrickStairs;
	public static Block caramelSmallBrickStairs;
	public static Block chocolatePlankStairs;
	public static Block darkChocolatePlankStairs;
	public static Block lightChocolatePlankStairs;
	public static Block whiteChocolatePlankStairs;
	public static Block caramelWall;
	public static Block chocolateWall;
	public static Block chocolateSmallBrickFence;
	public static Block darkChocolateSmallBrickFence;
	public static Block lightChocolateSmallBrickFence;
	public static Block whiteChocolateSmallBrickFence;
	public static Block caramelFence;
	public static Block caramelBrickFence;
	public static Block caramelSmallBrickFence;
	public static Block ExtraDarkChocolateCake;
	public static Block ExtraDarkChocolatePie;
	public static Block ExtraDarkChocolateBlock;
	public static Block ExtraDarkChocolatePiller;
	public static Block ExtraDarkChocolateSandstone;
	public static Block ExtraDarkChocolateBrickFence;
	public static Block ExtraDarkChocolateSmallBrickFence;
	public static Block ExtraDarkChocolateFence;
	public static Block ExtraDarkChocolatePlankStairs;
	public static Block ExtraDarkChocolateBrickStairs;
	public static Block ExtraDarkChocolateSmallBrickStairs;
	public static Block ExtraDarkChocolateStairs;
	public static Block ExtraDarkChocolateSandstoneStairs;
	public static Block ExtraDarkChocolateSmoothSandstoneStairs;
	public static Block ExtraDarkChocolatePlankFence;
	public static Block ExtraDarkChocolatePane;
	public static Block ExtraDarkChocolateGlassPane;
	public static Block ExtraDarkChocolateDoor;

	//Slabs
	public static BlockSlab chocolatebricksingle;
	public static BlockSlab chocolatebrickdouble;

	public static BlockSlab darkchocolatebricksingle;
	public static BlockSlab darkchocolatebrickdouble;

	public static BlockSlab lightchocolatebricksingle;
	public static BlockSlab lightchocolatebrickdouble;

	public static BlockSlab whitechocolatebricksingle;
	public static BlockSlab whitechocolatebrickdouble;

	public static BlockSlab smallchocolatebricksingle;
	public static BlockSlab smallchocolatebrickdouble;

	public static BlockSlab smalldarkchocolatebricksingle;
	public static BlockSlab smalldarkchocolatebrickdouble;

	public static BlockSlab smalllightchocolatebricksingle;
	public static BlockSlab smalllightchocolatebrickdouble;

	public static BlockSlab smallwhitechocolatebricksingle;
	public static BlockSlab smallwhitechocolatebrickdouble;

	public static BlockSlab chocolatesingle;
	public static BlockSlab chocolatedouble;

	public static BlockSlab darkchocolatesingle;
	public static BlockSlab darkchocolatedouble;

	public static BlockSlab lightchocolatesingle;
	public static BlockSlab lightchocolatedouble;

	public static BlockSlab whitechocolatesingle;
	public static BlockSlab whitechocolatedouble;

	public static BlockSlab CocoaSlabsingle;
	public static BlockSlab CocoaSlabdouble;

	public static BlockSlab chocoCobbleStoneSlabsingle;
	public static BlockSlab chocoCobbleStoneSlabdouble;

	public static BlockSlab darkchocoCobbleStoneSlabsingle;
	public static BlockSlab darkchocoCobbleStoneSlabdouble;

	public static BlockSlab lightchocoCobbleStoneSlabsingle;
	public static BlockSlab lightchocoCobbleStoneSlabdouble;

	public static BlockSlab whitechocoCobbleStoneSlabsingle;
	public static BlockSlab whitechocoCobbleStoneSlabdouble;

	public static BlockSlab whitechocoSandStoneSlabsingle;
	public static BlockSlab whitechocoSandStoneSlabdouble;

	public static BlockSlab whitechocoSmoothSandStoneSlabsingle;
	public static BlockSlab whitechocoSmoothSandStoneSlabdouble;

	public static BlockSlab chocoSandStoneSlabsingle;
	public static BlockSlab chocoSandStoneSlabdouble;

	public static BlockSlab chocoSmoothSandStoneSlabsingle;
	public static BlockSlab chocoSmoothSandStoneSlabdouble;

	public static BlockSlab darkchocoSandStoneSlabsingle;
	public static BlockSlab darkchocoSandStoneSlabdouble;

	public static BlockSlab darkchocoSmoothSandStoneSlabsingle;
	public static BlockSlab darkchocoSmoothSandStoneSlabdouble;

	public static BlockSlab lightchocoSandStoneSlabsingle;
	public static BlockSlab lightchocoSandStoneSlabdouble;

	public static BlockSlab lightchocoSmoothSandStoneSlabsingle;
	public static BlockSlab lightchocoSmoothSandStoneSlabdouble;
	
	public static BlockSlab caramelSlabdouble;
	public static BlockSlab caramelSlabsingle;
	
	public static BlockSlab caramelBrickSlabdouble;
	public static BlockSlab caramelBrickSlabsingle;
	
	public static BlockSlab caramelSmallBrickSlabdouble;
	public static BlockSlab caramelSmallBrickSlabsingle;
	
	public static BlockSlab chocolatePlankSlabdouble;
	public static BlockSlab chocolatePlankSlabsingle;
	
	public static BlockSlab darkChocolatePlankSlabdouble;
	public static BlockSlab darkChocolatePlankSlabsingle;
	
	public static BlockSlab lightChocolatePlankSlabdouble;
	public static BlockSlab lightChocolatePlankSlabsingle;
	
	public static BlockSlab whiteChocolatePlankSlabdouble;
	public static BlockSlab whiteChocolatePlankSlabsingle;
	
	public static BlockSlab ExtraDarkChocolatePlankSlabDouble;
	public static BlockSlab ExtraDarkChocolatePlankSlabSingle;
	
	public static BlockSlab ExtraDarkChocolateBrickSlabDouble;
	public static BlockSlab ExtraDarkChocolateBrickSlabSingle;
	
	public static BlockSlab ExtraDarkChocolateSmallBrickSlabDouble;
	public static BlockSlab ExtraDarkChocolateSmallBrickSlabSingle;
	
	public static BlockSlab ExtraDarkChocolateSlabDouble;
	public static BlockSlab ExtraDarkChocolateSlabSingle;
	
	public static BlockSlab ExtraDarkChocolateSandstoneDouble;
	public static BlockSlab ExtraDarkChocolateSandstoneSingle;
	
	public static BlockSlab ExtraDarkChocolateSmoothSandstoneDouble;
	public static BlockSlab ExtraDarkChocolateSmoothSandstoneSingle;

	//Cake
	public static Block ChocolateCake;
	public static Block DarkChocolateCake;
	public static Block LightChocolateCake;
	public static Block WhiteChocolateCake;

	//Pie
	public static Block chocolatePie;
	public static Block darkChocolatePie;
	public static Block lightChocolatePie;
	public static Block whiteChocolatePie;

	public static void initialiseBlock() {


		//Cake
		ChocolateCake = (new BlockChocolateCake()).setHardness(0.5F).setStepSound(Block.soundTypeCloth).setBlockName("chocolatecake").setStepSound(Block.soundTypeCloth);
		DarkChocolateCake = (new BlockDarkChocolateCake()).setHardness(0.5F).setStepSound(Block.soundTypeCloth).setBlockName("darkchocolatecake").setStepSound(Block.soundTypeCloth);
		LightChocolateCake = (new BlockLightChocolateCake()).setHardness(0.5F).setStepSound(Block.soundTypeCloth).setBlockName(MainRegistry.EnableMilkChocolate ? "milkchocolatecake" : "lightchocolatecake").setStepSound(Block.soundTypeCloth);
		WhiteChocolateCake = (new BlockWhiteChocolateCake()).setHardness(0.5F).setStepSound(Block.soundTypeCloth).setBlockName("whitechocolatecake").setStepSound(Block.soundTypeCloth);
		ExtraDarkChocolateCake = (new BlockExtraDarkChocolateCake()).setHardness(0.5F).setStepSound(Block.soundTypeCloth).setBlockName("extradarkchocolatecake").setStepSound(Block.soundTypeCloth);

		//Pie
		chocolatePie = (new BlockChocolatePie()).setHardness(0.5F).setStepSound(Block.soundTypeCloth).setBlockName("chocolatepie").setStepSound(Block.soundTypeCloth);
		darkChocolatePie = (new BlockDarkChocolatePie()).setHardness(0.5F).setStepSound(Block.soundTypeCloth).setBlockName("darkchocolatepie").setStepSound(Block.soundTypeCloth);
		lightChocolatePie = (new BlockLightChocolatePie()).setHardness(0.5F).setStepSound(Block.soundTypeCloth).setBlockName(MainRegistry.EnableMilkChocolate ? "milkchocolatepie" : "lightchocolatepie").setStepSound(Block.soundTypeCloth);
		whiteChocolatePie = (new BlockWhiteChocolatePie()).setHardness(0.5F).setStepSound(Block.soundTypeCloth).setBlockName("whitechocolatepie").setStepSound(Block.soundTypeCloth);
		ExtraDarkChocolatePie = (new BlockExtraDarkChocolatePie()).setHardness(0.5F).setStepSound(Block.soundTypeCloth).setBlockName("extradarkchocolatepie").setStepSound(Block.soundTypeCloth);

		//Blocks
		ExtraDarkChocolateBlock = new BlockExtraDarkChocolateBlock().setBlockName("extradarkchocolateblock").setHardness(3).setResistance(10).setBlockTextureName("killerjdog51:chocolateblock").setCreativeTab(MainRegistry.tabChocolateBlocks);

		chocolateblock = new BlockChocolateBlock().setBlockName("chocolateblock").setHardness(3).setResistance(10).setBlockTextureName("killerjdog51:chocolateblock").setCreativeTab(MainRegistry.tabChocolateBlocks);

		fruitychocolateblock = new BlockFruityChocolateBlock().setBlockName("fruitychocolateblock").setHardness(3).setResistance(10).setBlockTextureName("killerjdog51:fruitychocolateblock").setCreativeTab(MainRegistry.tabChocolateBlocks);

		mintychocolateblock = new BlockMintyChocolateBlock().setBlockName("mintychocolateblock").setHardness(3).setResistance(10).setBlockTextureName("killerjdog51:mintychocolateblock").setCreativeTab(MainRegistry.tabChocolateBlocks);

		cookiesandcreamblock = new chocolateBlocks().setHardness(3).setResistance(10).setBlockName("cookiesandcreamblock").setBlockTextureName("killerjdog51:cookiesandcreamblock");

		goldchocolateblock = new chocolateBlocks().setHardness(3).setResistance(10).setBlockName("goldchocolateblock").setBlockTextureName("killerjdog51:goldchocolateblock");

		ChocolateMould = (new BlockBarMould()).setHardness(2.0F).setBlockName("barmould").setCreativeTab(MainRegistry.tabChocolateBlocks);

		ChocolateBallMould = (new BlockBallMould()).setHardness(2.0F).setBlockName("ballmould").setCreativeTab(MainRegistry.tabChocolateBlocks);

		chocolatebrick = (new BlockChocolateBrick()).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setBlockName("ChocolateBrick").setBlockTextureName("killerjdog51:chocolatebrick").setCreativeTab(MainRegistry.tabChocolateBlocks);
		
		smallchocolatebrick = (new BlockSmallChocolateBrick()).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setBlockName("SmallChocolateBrick").setBlockTextureName("killerjdog51:chocolatebrick").setCreativeTab(MainRegistry.tabChocolateBlocks);

		chocolatepiller = new BlockChocolatePiller().setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("chocolatepillerblock").setBlockTextureName("killerjdog51:chocolateblock").setCreativeTab(MainRegistry.tabChocolateBlocks);

		ExtraDarkChocolatePiller = new BlockExtraDarkChocolatePiller().setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("extradarkchocolatepillerblock").setBlockTextureName("killerjdog51:chocolateblock").setCreativeTab(MainRegistry.tabChocolateBlocks);

		chocolatechiseled = new BlockChocolateChiseled().setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("chocolatechiseledblock").setBlockTextureName("killerjdog51:chocolateblock").setCreativeTab(MainRegistry.tabChocolateBlocks);

		chocolatebrickstairs = new chocolatebrickstairs(chocolatebrickstairs, 0).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("chocolatebrickstairs").setBlockTextureName("killerjdog51:chocolateblock");

		darkchocolatebrickstairs = new darkchocolatebrickstairs(darkchocolatebrickstairs, 1).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("darkchocolatebrickstairs");

		lightchocolatebrickstairs = new lightChocolateBrickStairs(lightchocolatebrickstairs, 2).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName(MainRegistry.EnableMilkChocolate ? "milkchocolatebrickstairs" : "lightchocolatebrickstairs");

		whitechocolatebrickstairs = new whiteChocolateBrickStairs(whitechocolatebrickstairs, 3).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("whitechocolatebrickstairs");

		smallchocolatebrickstairs = new smallChocolateBrickStairs(smallchocolatebrickstairs, 0).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("smallchocolatebrickstairs").setBlockTextureName("killerjdog51:chocolateblock");

		smalldarkchocolatebrickstairs = new smallDarkChocolateBrickStairs(smalldarkchocolatebrickstairs, 1).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("smalldarkchocolatebrickstairs");

		smalllightchocolatebrickstairs = new smallLightChocolateBrickStairs(smalllightchocolatebrickstairs, 2).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName(MainRegistry.EnableMilkChocolate ? "smallmilkchocolatebrickstairs" : "smalllightchocolatebrickstairs");

		smallwhitechocolatebrickstairs = new smallWhiteChocolateBrickStairs(smallwhitechocolatebrickstairs, 3).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("smallwhitechocolatebrickstairs");

		chocolatestairs = new chocolatestairs(chocolatestairs, 4).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Chocolate Stairs");

		darkchocolatestairs = new darkChocolateStairs(darkchocolatestairs, 5).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Dark Chocolate Stairs");

		lightchocolatestairs = new lightChocolateStairs(lightchocolatestairs, 6).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName(MainRegistry.EnableMilkChocolate ? "milkchocolatestairs" : "Light Chocolate Stairs");

		whitechocolatestairs = new whiteChocolateStairs(whitechocolatestairs, 7).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("White Chocolate Stairs");

		chocolatebrickfence = new BlockFence("killerjdog51:chocolatebrick", Material.rock).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setBlockName("chocolatebrickfence").setCreativeTab(MainRegistry.tabChocolateBlocks);

		darkchocolatebrickfence = new BlockFence("killerjdog51:chocolatebrick_dark", Material.rock).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setBlockName("darkchocolatebrickfence").setCreativeTab(MainRegistry.tabChocolateBlocks);

		lightchocolatebrickfence = new BlockFence("killerjdog51:chocolatebrick_light", Material.rock).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setBlockName(MainRegistry.EnableMilkChocolate ? "milkchocolatebrickfence" : "lightchocolatebrickfence").setCreativeTab(MainRegistry.tabChocolateBlocks);

		whitechocolatebrickfence = new BlockFence("killerjdog51:chocolatebrick_white", Material.rock).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setBlockName("whitechocolatebrickfence").setCreativeTab(MainRegistry.tabChocolateBlocks);

		chocolatefence = new BlockFence("killerjdog51:chocolateblock_hard", Material.rock).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setBlockName("hardchocolateblockfence").setCreativeTab(MainRegistry.tabChocolateBlocks);

		darkchocolatefence = new BlockFence("killerjdog51:chocolateblock_dark_hard", Material.rock).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setBlockName("harddarkblockofchocolatefence").setCreativeTab(MainRegistry.tabChocolateBlocks);

		lightchocolatefence = new BlockFence("killerjdog51:chocolateblock_light_hard", Material.rock).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setBlockName(MainRegistry.EnableMilkChocolate ? "hardmilkchocolatefence" : "hardlightblockofchocolatefence").setCreativeTab(MainRegistry.tabChocolateBlocks);

		whitechocolatefence = new BlockFence("killerjdog51:chocolateblock_white_hard", Material.rock).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setBlockName("hardwhiteblockofchocolatefence").setCreativeTab(MainRegistry.tabChocolateBlocks);

		CocoaPlanks = new BlockCocoaPlanks().setHardness(2.0F).setResistance(5.0F).setBlockName("Planks").setBlockTextureName("killerjdog51:planks").setStepSound(Block.soundTypeWood).setCreativeTab(MainRegistry.tabChocolateBlocks);

		CocoaStairs = new CocoaStairs(CocoaPlanks, 0).setHardness(2.0F).setStepSound(Block.soundTypeWood).setBlockName("Cocoa_Stairs").setBlockTextureName("killerjdog51:planks_cocoa").setCreativeTab(MainRegistry.tabChocolateBlocks);

		cocoaDoor = new BlockCocoaDoor(Material.wood).setHardness(3.0F).setStepSound(Block.soundTypeWood).setBlockName("doorCocoaWood").setBlockTextureName("killerjdog51:door_cocoa");
	    ChocolateDoor = new BlockCocoaDoor(Material.wood).setHardness(3.0F).setStepSound(Block.soundTypeWood).setBlockName("doorChocolate").setBlockTextureName("killerjdog51:door_chocolate");
	    DarkChocolateDoor = new BlockCocoaDoor(Material.wood).setHardness(3.0F).setStepSound(Block.soundTypeWood).setBlockName("doorDarkChocolate").setBlockTextureName("killerjdog51:door_dark");
	    LightChocolateDoor = new BlockCocoaDoor(Material.wood).setHardness(3.0F).setStepSound(Block.soundTypeWood).setBlockName(MainRegistry.EnableMilkChocolate ? "doorMilkChocolate" : "doorLightChocolate").setBlockTextureName("killerjdog51:door_light");
	    WhiteChocolateDoor = new BlockCocoaDoor(Material.wood).setHardness(3.0F).setStepSound(Block.soundTypeWood).setBlockName("doorWhiteChocolate").setBlockTextureName("killerjdog51:door_white");
	    ExtraDarkChocolateDoor = new BlockCocoaDoor(Material.wood).setHardness(3.0F).setStepSound(Block.soundTypeWood).setBlockName("doorExtraDarkChocolate").setBlockTextureName("killerjdog51:door_extradark");

		cocoaFence = new BlockFence("killerjdog51:planks_cocoa", Material.wood).setHardness(1.5F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("cocoafence").setCreativeTab(MainRegistry.tabChocolateBlocks);
		chocolatePlankFence = new BlockFence("killerjdog51:planks_chocolate", Material.wood).setHardness(1.5F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("chocolatefence").setCreativeTab(MainRegistry.tabChocolateBlocks);
		darkChocolatePlankFence = new BlockFence("killerjdog51:planks_dark", Material.wood).setHardness(1.5F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("darkchocolatefence").setCreativeTab(MainRegistry.tabChocolateBlocks);
		lightChocolatePlankFence = new BlockFence("killerjdog51:planks_light", Material.wood).setHardness(1.5F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName(MainRegistry.EnableMilkChocolate ? "milkchocolatefence" : "lightchocolatefence").setCreativeTab(MainRegistry.tabChocolateBlocks);
		whiteChocolatePlankFence = new BlockFence("killerjdog51:planks_white", Material.wood).setHardness(1.5F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("whitechocolatefence").setCreativeTab(MainRegistry.tabChocolateBlocks);

		BlockChocolatePortal = (BlockChocolatePortal) new BlockChocolatePortal().setLightLevel(0.75F).setBlockName("ChocolatePortal").setBlockTextureName("killerjdog51:ChocolatePortal");

		chocolatepane = (new BlockChocolatePane("killerjdog51:chocolateblock", "killerjdog51:chocolateblock_top", Material.rock, true)).setHardness(0.3F).setStepSound(Block.soundTypeStone).setBlockName("chocolatepanes").setBlockTextureName("killerjdog51:chocolateblock");

		darkchocolatepane = (new BlockDarkChocolatePane("killerjdog51:chocolateblock_dark", "killerjdog51:chocolateblock_dark_top", Material.rock, true)).setHardness(0.3F).setStepSound(Block.soundTypeStone).setBlockName("darkchocolatepanes").setBlockTextureName("killerjdog51:chocolateblock_dark");

		lightchocolatepane = (new BlockLightChocolatePane("killerjdog51:chocolateblock_light", "killerjdog51:chocolateblock_light_top", Material.rock, true)).setHardness(0.3F).setStepSound(Block.soundTypeStone).setBlockName(MainRegistry.EnableMilkChocolate ? "milkchocolatepanes" : "lightchocolatepanes").setBlockTextureName("killerjdog51:chocolateblock_light");

		whitechocolatepane = (new BlockWhiteChocolatePane("killerjdog51:chocolateblock_white", "killerjdog51:chocolateblock_white_top", Material.rock, true)).setHardness(0.3F).setStepSound(Block.soundTypeStone).setBlockName("whitechocolatepanes").setBlockTextureName("killerjdog51:chocolateblock_white");

		chocoGlassPane = (new BlockChocolateGlassPane("killerjdog51:chocolateglass", "killerjdog51:chocolateglass_top", Material.glass, false)).setHardness(0.3F).setStepSound(Block.soundTypeGlass).setBlockName("chocolateglasspanes").setBlockTextureName("killerjdog51:chocolateglass");

		darkChocoGlassPane = (new BlockDarkChocolateGlassPane("killerjdog51:chocolateglass_dark", "killerjdog51:chocolateglass_dark_top", Material.glass, false)).setHardness(0.3F).setStepSound(Block.soundTypeGlass).setBlockName("darkchocolateglasspanes").setBlockTextureName("killerjdog51:chocolateglass_dark");

		lightChocoGlassPane = (new BlockLightChocolateGlassPane("killerjdog51:chocolateglass_light", "killerjdog51:chocolateglass_light_top", Material.glass, false)).setHardness(0.3F).setStepSound(Block.soundTypeGlass).setBlockName(MainRegistry.EnableMilkChocolate ? "milkchocolateglasspanes" : "lightchocolateglasspanes").setBlockTextureName("killerjdog51:chocolateglass_light");

		whiteChocoGlassPane = (new BlockWhiteChocolateGlassPane("killerjdog51:chocolateglass_white", "killerjdog51:chocolateglass_white_top", Material.glass, false)).setHardness(0.3F).setStepSound(Block.soundTypeGlass).setBlockName("whitechocolateglasspanes").setBlockTextureName("killerjdog51:chocolateglass_white");

		chocolateOres = new BlockChocolateOres().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("oreChocolate").setBlockTextureName("killerjdog51:chocolateOre");

		chocoGrass = new BlockChocoGrass().setHardness(0.6F).setStepSound(Block.soundTypeGrass).setBlockName("chocograss").setBlockTextureName("killerjdog51:chocograss");
		chocoDirt = new BlockChocoDirt().setHardness(0.5F).setStepSound(Block.soundTypeGravel).setBlockName("chocodirt").setBlockTextureName("killerjdog51:chocolatedirt");
		chocoSand = new BlockChocoSand().setHardness(0.5F).setStepSound(Block.soundTypeSand).setBlockName("chocosand").setCreativeTab(MainRegistry.tabChocolateBlocks).setBlockTextureName("killerjdog51:chocolatesand");

		chocoStone = new BlockChocoStone().setCreativeTab(MainRegistry.tabChocolateBlocks).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypePiston).setBlockName("chocostone").setBlockTextureName("killerjdog51:chocostone");
		chocoCobbleStone = new BlockChocoCobbleStone().setCreativeTab(MainRegistry.tabChocolateBlocks).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypePiston).setBlockName("chococobblestone").setBlockTextureName("killerjdog51:chocostone");
		darkchocoCobbleStoneStairs = new darkchocoCobbleStoneStairs(darkchocoCobbleStoneStairs, 0).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Dark Chocolate Cobblestone Stairs");
		chocoCobbleStoneStairs = new chocoCobbleStoneStairs(chocoCobbleStoneStairs, 1).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Chocolate Cobblestone Stairs");
		lightchocoCobbleStoneStairs = new lightchocoCobbleStoneStairs(lightchocoCobbleStoneStairs, 2).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName(MainRegistry.EnableMilkChocolate ? "milkchocolatecobblestairs" : "Light Chocolate Cobblestone Stairs");
		whitechocoCobbleStoneStairs = new whitechocoCobbleStoneStairs(whitechocoCobbleStoneStairs, 3).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("White Chocolate Cobblestone Stairs");

		chocoDiamond = new BlockChocoOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("oreChocoDiamond").setBlockTextureName("killerjdog51:chocodiamond").setCreativeTab(MainRegistry.tabChocolateBlocks);
		chocoGold = new BlockChocoOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("oreChocoGold").setBlockTextureName("killerjdog51:chocogold").setCreativeTab(MainRegistry.tabChocolateBlocks);
		chocoIron = new BlockChocoOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("oreChocoIron").setBlockTextureName("killerjdog51:chocoiron").setCreativeTab(MainRegistry.tabChocolateBlocks);
		chocoLapis = new BlockChocoOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("oreChocoLapis").setBlockTextureName("killerjdog51:chocolapis").setCreativeTab(MainRegistry.tabChocolateBlocks);
		chocoCoal = new BlockChocoOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("oreChocoCoal").setBlockTextureName("killerjdog51:chococoal").setCreativeTab(MainRegistry.tabChocolateBlocks);
		chocoRedstone = new BlockRedstoneOre(false).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("oreChocoRedstone").setCreativeTab(MainRegistry.tabChocolateBlocks).setBlockTextureName("killerjdog51:chocoredstone");
		litChocoRedstone = new BlockRedstoneOre(true).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("oreLitChocoRedstone").setBlockTextureName("killerjdog51:chocoredstone");

		chocoCobbleStoneWall = new BlockChocolateWall(chocoStone).setHardness(1.5F).setResistance(10.0F).setBlockName("chocoCobbleWall").setCreativeTab(MainRegistry.tabChocolateBlocks).setBlockTextureName("killerjdog51:chocostone");
		chocolateBrickWall = new BlockChocolateBrickWall(chocolatebrick).setHardness(1.5F).setResistance(10.0F).setBlockName("chocolateBrickWall").setCreativeTab(MainRegistry.tabChocolateBlocks).setBlockTextureName("killerjdog51:chocolatebrick");
		chocolateSmallBrickWall = new BlockSmallChocolateBrickWall(smallchocolatebrick).setHardness(1.5F).setResistance(10.0F).setBlockName("chocolateSmallBrickWall").setCreativeTab(MainRegistry.tabChocolateBlocks).setBlockTextureName("killerjdog51:chocolatebrick");
		chocolateWall = new BlockHardChocolateWall(chocolateblock).setBlockName("chocolateWall").setHardness(1.5F).setResistance(10.0F).setCreativeTab(MainRegistry.tabChocolateBlocks).setBlockTextureName("killerjdog51:chocolateblock");

		chocoGlass = new BlockChocolateGlass().setStepSound(Block.soundTypeGlass).setBlockName("chocolateglass").setHardness(3).setResistance(10).setBlockTextureName("killerjdog51:chocolateglass").setCreativeTab(MainRegistry.tabChocolateBlocks);

		chocoSandstone = new BlockChocolateSandStone().setStepSound(Block.soundTypePiston).setHardness(0.8F).setBlockName("chocolatesandStone").setBlockTextureName("killerjdog51:chocolatesandstone");
		ExtraDarkChocolateSandstone = new BlockExtraDarkChocolateSandStone().setStepSound(Block.soundTypePiston).setHardness(0.8F).setBlockName("extradarkchocolatesandStone").setBlockTextureName("killerjdog51:chocolatesandstone");
		whiteChocoSandstonestairs = new whitechocoSandStoneStairs(whiteChocoSandstonestairs, 3).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("White Chocolate Sandstone Stairs");
		whiteChocoSmoothSandstoneStairs = new whitechocoSmoothSandStoneStairs(whiteChocoSmoothSandstoneStairs, 3).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("White Chocolate Smooth Sandstone Stairs");
		ChocoSandstonestairs = new chocoSandStoneStairs(ChocoSandstonestairs, 0).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Chocolate Sandstone Stairs");
		ChocoSmoothSandstoneStairs = new chocoSmoothSandStoneStairs(ChocoSmoothSandstoneStairs, 0).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Chocolate Smooth Sandstone Stairs");
		darkChocoSandstonestairs = new darkchocoSandStoneStairs(darkChocoSandstonestairs, 1).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Dark Chocolate Sandstone Stairs");
		darkChocoSmoothSandstoneStairs = new darkchocoSmoothSandStoneStairs(darkChocoSmoothSandstoneStairs, 1).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Dark Chocolate Smooth Sandstone Stairs");
		lightChocoSandstonestairs = new lightchocoSandStoneStairs(lightChocoSandstonestairs, 2).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName(MainRegistry.EnableMilkChocolate ? "milksandstonestairs" : "Light Chocolate Sandstone Stairs");
		lightChocoSmoothSandstoneStairs = new lightchocoSmoothSandStoneStairs(lightChocoSmoothSandstoneStairs, 2).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName(MainRegistry.EnableMilkChocolate ? "milksmoothsandstonestairs" : "Light Chocolate Smooth Sandstone Stairs");


		caramelBlock = new BlockCaramel().setBlockName("caramelblock").setHardness(3).setResistance(10).setBlockTextureName("killerjdog51:caramelblock").setCreativeTab(MainRegistry.tabChocolateBlocks);

		caramelStairs = new caramelStairs(caramelStairs, 5).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Caramel Stairs");
		caramelBrickStairs = new caramelBrickStairs(caramelBrickStairs, 7).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Caramel Brick Stairs");
		caramelSmallBrickStairs = new caramelSmallBrickStairs(caramelSmallBrickStairs, 8).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Caramel Small Brick Stairs");
		caramelWall = new BlockCaramelWall(caramelBlock).setHardness(1.5F).setResistance(10.0F).setBlockName("caramelWall").setCreativeTab(MainRegistry.tabChocolateBlocks).setBlockTextureName("killerjdog51:caramelblock");

		chocolatePlankStairs = new chocolatePlankStairs(chocolatePlankStairs, 1).setHardness(2.0F).setStepSound(Block.soundTypeWood).setBlockName("Chocolate Plank Stairs");

		darkChocolatePlankStairs = new darkChocolatePlankStairs(darkChocolatePlankStairs, 2).setHardness(2.0F).setStepSound(Block.soundTypeWood).setBlockName("Dark Chocolate Plank Stairs");

		lightChocolatePlankStairs = new lightChocolatePlankStairs(lightChocolatePlankStairs, 3).setHardness(2.0F).setStepSound(Block.soundTypeWood).setBlockName(MainRegistry.EnableMilkChocolate ? "milkplankstairs" : "Light Chocolate Plank Stairs");

		whiteChocolatePlankStairs = new whiteChocolatePlankStairs(whiteChocolatePlankStairs, 4).setHardness(2.0F).setStepSound(Block.soundTypeWood).setBlockName("White Chocolate Plank Stairs");

		chocolateSmallBrickFence = new BlockFence("killerjdog51:chocolatebrick_small", Material.rock).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setBlockName("chocolatesmallbrickfence").setCreativeTab(MainRegistry.tabChocolateBlocks);
		darkChocolateSmallBrickFence = new BlockFence("killerjdog51:chocolatebrick_dark_small", Material.rock).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setBlockName("darkchocolatesmallbrickfence").setCreativeTab(MainRegistry.tabChocolateBlocks);
		lightChocolateSmallBrickFence = new BlockFence("killerjdog51:chocolatebrick_light_small", Material.rock).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setBlockName(MainRegistry.EnableMilkChocolate ? "milkchocolatesmallbrickfence" : "lightchocolatesmallbrickfence").setCreativeTab(MainRegistry.tabChocolateBlocks);
		whiteChocolateSmallBrickFence = new BlockFence("killerjdog51:chocolatebrick_white_small", Material.rock).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setBlockName("whitechocolatesmallbrickfence").setCreativeTab(MainRegistry.tabChocolateBlocks);
		caramelFence = new BlockFence("killerjdog51:caramelblock_hard", Material.rock).setStepSound(Block.soundTypeStone).setHardness(1.5F).setResistance(10.0F).setBlockName("caramelfence").setCreativeTab(MainRegistry.tabChocolateBlocks);
		caramelBrickFence = new BlockFence("killerjdog51:caramelblock_brick", Material.rock).setStepSound(Block.soundTypeStone).setHardness(1.5F).setResistance(10.0F).setBlockName("caramelbrickfence").setCreativeTab(MainRegistry.tabChocolateBlocks);
		caramelSmallBrickFence = new BlockFence("killerjdog51:caramelblock_small", Material.rock).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setBlockName("caramelsmallbrickfence").setCreativeTab(MainRegistry.tabChocolateBlocks);

		ExtraDarkChocolateStairs = new ExtraDarkChocolateStairs(ExtraDarkChocolateStairs, 0).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("extradarkchocolatestairs");
		ExtraDarkChocolateBrickStairs = new ExtraDarkChocolateBrickStairs(ExtraDarkChocolateBrickStairs, 0).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("extradarkchocolatebrickstairs");
		ExtraDarkChocolateSmallBrickStairs = new ExtraDarkChocolateSmallBrickStairs(ExtraDarkChocolateSmallBrickStairs, 0).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("extradarkchocolatesmallbrickstairs");
		ExtraDarkChocolatePlankStairs = new ExtraDarkChocolatePlankStairs(ExtraDarkChocolatePlankStairs, 0).setHardness(2.0F).setStepSound(Block.soundTypeWood).setBlockName("extradarkchocolateplankstairs");
		ExtraDarkChocolateSandstoneStairs = new ExtraDarkChocolateSandstoneStairs(ExtraDarkChocolateSandstoneStairs, 0).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("extradarkchocolatesandstonestairs");
		ExtraDarkChocolateSmoothSandstoneStairs = new ExtraDarkChocolateSmoothSandstoneStairs(ExtraDarkChocolateSmoothSandstoneStairs, 0).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("extradarkchocolatesmoothsandstonestairs");

		ExtraDarkChocolateFence = new BlockFence("killerjdog51:chocolateblock_extradark_hard", Material.rock).setHardness(1.5F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("extradarkchocolatefence").setCreativeTab(MainRegistry.tabChocolateBlocks);
		ExtraDarkChocolateBrickFence = new BlockFence("killerjdog51:chocolatebrick_extradark", Material.rock).setHardness(1.5F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("extradarkchocolatebrickfence").setCreativeTab(MainRegistry.tabChocolateBlocks);
		ExtraDarkChocolateSmallBrickFence = new BlockFence("killerjdog51:chocolatebrick_extradark_small", Material.rock).setHardness(1.5F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("extradarkchocolatesmallbrickfence").setCreativeTab(MainRegistry.tabChocolateBlocks);
		ExtraDarkChocolatePlankFence = new BlockFence("killerjdog51:planks_extradark", Material.wood).setHardness(1.5F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("extradarkchocolateplankfence").setCreativeTab(MainRegistry.tabChocolateBlocks);

		ExtraDarkChocolatePane = (new BlockExtraDarkChocolatePane("killerjdog51:chocolateblock_extradark", "killerjdog51:chocolateblock_extradark_top", Material.rock, true)).setHardness(0.3F).setStepSound(Block.soundTypeStone).setBlockName("extradarkchocolatepanes").setBlockTextureName("killerjdog51:chocolateblock_extradark");
		ExtraDarkChocolateGlassPane = (new BlockExtraDarkChocolateGlassPane("killerjdog51:chocolateglass_extradark", "killerjdog51:chocolateglass_extradark_top", Material.glass, true)).setHardness(0.3F).setStepSound(Block.soundTypeGlass).setBlockName("extradarkchocolateglasspanes").setBlockTextureName("killerjdog51:chocolateglass_extradark");

		//Slabs
		chocolatebrickdouble = (new BlockChocolateBrickSlab(true));
		chocolatebricksingle = (new BlockChocolateBrickSlab(false));

		darkchocolatebrickdouble = (new BlockDarkChocolateBrickSlab(true));
		darkchocolatebricksingle = (new BlockDarkChocolateBrickSlab(false));

		lightchocolatebrickdouble = (new BlockLightChocolateBrickSlab(true));
		lightchocolatebricksingle = (new BlockLightChocolateBrickSlab(false));

		whitechocolatebrickdouble = (new BlockWhiteChocolateBrickSlab(true));
		whitechocolatebricksingle = (new BlockWhiteChocolateBrickSlab(false));

		chocolatedouble = (new BlockChocolateSlab(true));
		chocolatesingle = (new BlockChocolateSlab(false));

		darkchocolatedouble = (new BlockDarkChocolateSlab(true));
		darkchocolatesingle = (new BlockDarkChocolateSlab(false));

		lightchocolatedouble = (new BlockLightChocolateSlab(true));
		lightchocolatesingle = (new BlockLightChocolateSlab(false));

		whitechocolatedouble = (new BlockWhiteChocolateSlab(true));
		whitechocolatesingle = (new BlockWhiteChocolateSlab(false));

		smallchocolatebrickdouble =  (new BlockChocolateSmallBrickSlab(true));
		smallchocolatebricksingle =  (new BlockChocolateSmallBrickSlab(false));

		smalldarkchocolatebrickdouble =  (new BlockDarkChocolateSmallBrickSlab(true));
		smalldarkchocolatebricksingle =  (new BlockDarkChocolateSmallBrickSlab(false));

		smalllightchocolatebrickdouble =  (new BlockLightChocolateSmallBrickSlab(true));
		smalllightchocolatebricksingle =  (new BlockLightChocolateSmallBrickSlab(false));

		smallwhitechocolatebrickdouble =  (new BlockWhiteChocolateSmallBrickSlab(true));
		smallwhitechocolatebricksingle =  (new BlockWhiteChocolateSmallBrickSlab(false));

		CocoaSlabdouble =  (new BlockCocoaSlab(true));
		CocoaSlabsingle =  (new BlockCocoaSlab(false));

		darkchocoCobbleStoneSlabdouble =  (new BlockdarkchocoCobbleStoneSlab(true));
		darkchocoCobbleStoneSlabsingle =  (new BlockdarkchocoCobbleStoneSlab(false));

		chocoCobbleStoneSlabdouble =  (new BlockchocoCobbleStoneSlab(true));
		chocoCobbleStoneSlabsingle =  (new BlockchocoCobbleStoneSlab(false));

		lightchocoCobbleStoneSlabdouble =  (new BlocklightchocoCobbleStoneSlab(true));
		lightchocoCobbleStoneSlabsingle =  (new BlocklightchocoCobbleStoneSlab(false));

		whitechocoCobbleStoneSlabdouble =  (new BlockwhitechocoCobbleStoneSlab(true));
		whitechocoCobbleStoneSlabsingle =  (new BlockwhitechocoCobbleStoneSlab(false));

		whitechocoSandStoneSlabdouble =  (new BlockwhitechocoSandStoneSlab(true));
		whitechocoSandStoneSlabsingle =  (new BlockwhitechocoSandStoneSlab(false));

		whitechocoSmoothSandStoneSlabdouble =  (new BlockwhitechocoSmoothSandStoneSlab(true));
		whitechocoSmoothSandStoneSlabsingle =  (new BlockwhitechocoSmoothSandStoneSlab(false));

		chocoSandStoneSlabdouble =  (new BlockchocoSandStoneSlab(true));
		chocoSandStoneSlabsingle =  (new BlockchocoSandStoneSlab(false));

		chocoSmoothSandStoneSlabdouble =  (new BlockchocoSmoothSandStoneSlab(true));
		chocoSmoothSandStoneSlabsingle =  (new BlockchocoSmoothSandStoneSlab(false));

		darkchocoSandStoneSlabdouble =  (new BlockdarkchocoSandStoneSlab(true));
		darkchocoSandStoneSlabsingle =  (new BlockdarkchocoSandStoneSlab(false));

		darkchocoSmoothSandStoneSlabdouble =  (new BlockdarkchocoSmoothSandStoneSlab(true));
		darkchocoSmoothSandStoneSlabsingle =  (new BlockdarkchocoSmoothSandStoneSlab(false));

		lightchocoSandStoneSlabdouble =  (new BlocklightchocoSandStoneSlab(true));
		lightchocoSandStoneSlabsingle =  (new BlocklightchocoSandStoneSlab(false));

		lightchocoSmoothSandStoneSlabdouble =  (new BlocklightchocoSmoothSandStoneSlab(true));
		lightchocoSmoothSandStoneSlabsingle =  (new BlocklightchocoSmoothSandStoneSlab(false));

		caramelSlabdouble =  (new BlockCaramelSlab(true));
		caramelSlabsingle =  (new BlockCaramelSlab(false));

		caramelBrickSlabdouble =  (new BlockBrickCaramelSlab(true));
		caramelBrickSlabsingle =  (new BlockBrickCaramelSlab(false));

		caramelSmallBrickSlabdouble =  (new BlockSmallBrickCaramelSlab(true));
		caramelSmallBrickSlabsingle =  (new BlockSmallBrickCaramelSlab(false));

		chocolatePlankSlabdouble =  (new BlockChocolatePlankSlab(true));
		chocolatePlankSlabsingle =  (new BlockChocolatePlankSlab(false));

		darkChocolatePlankSlabdouble =  (new BlockDarkChocolatePlankSlab(true));
		darkChocolatePlankSlabsingle =  (new BlockDarkChocolatePlankSlab(false));

		lightChocolatePlankSlabdouble =  (new BlockLightChocolatePlankSlab(true));
		lightChocolatePlankSlabsingle =  (new BlockLightChocolatePlankSlab(false));

		whiteChocolatePlankSlabdouble =  (new BlockWhiteChocolatePlankSlab(true));
		whiteChocolatePlankSlabsingle =  (new BlockWhiteChocolatePlankSlab(false));

		ExtraDarkChocolateSlabDouble = (new BlockExtraDarkChocolateSlab(true));
		ExtraDarkChocolateSlabSingle = (new BlockExtraDarkChocolateSlab(false));

		ExtraDarkChocolateBrickSlabDouble = (new BlockExtraDarkChocolateBrickSlab(true));
		ExtraDarkChocolateBrickSlabSingle = (new BlockExtraDarkChocolateBrickSlab(false));

		ExtraDarkChocolateSmallBrickSlabDouble = (new BlockExtraDarkChocolateSmallBrickSlab(true));
		ExtraDarkChocolateSmallBrickSlabSingle = (new BlockExtraDarkChocolateSmallBrickSlab(false));

		ExtraDarkChocolateSandstoneDouble = (new BlockExtraDarkChocolateSandstoneSlab(true));
		ExtraDarkChocolateSandstoneSingle = (new BlockExtraDarkChocolateSandstoneSlab(false));

		ExtraDarkChocolateSmoothSandstoneDouble = (new BlockExtraDarkChocolateSmoothSandstoneSlab(true));
		ExtraDarkChocolateSmoothSandstoneSingle = (new BlockExtraDarkChocolateSmoothSandstoneSlab(false));

		ExtraDarkChocolatePlankSlabDouble = (new BlockExtraDarkChocolatePlankSlab(true));
		ExtraDarkChocolatePlankSlabSingle = (new BlockExtraDarkChocolatePlankSlab(false));

	}

	public static void registerBlock() {
		GameRegistry.registerBlock(chocolateblock, ItemChocolateBlocks.class, chocolateblock.getUnlocalizedName());
		GameRegistry.registerBlock(fruitychocolateblock, ItemFruityChocolateBlocks.class, fruitychocolateblock.getUnlocalizedName());
		GameRegistry.registerBlock(mintychocolateblock, ItemMintyChocolateBlocks.class, mintychocolateblock.getUnlocalizedName());
		GameRegistry.registerBlock(cookiesandcreamblock, cookiesandcreamblock.getUnlocalizedName());
		GameRegistry.registerBlock(goldchocolateblock, goldchocolateblock.getUnlocalizedName());
		GameRegistry.registerBlock(ChocolateMould, ChocolateMould.getUnlocalizedName());
		GameRegistry.registerBlock(ChocolateBallMould, ChocolateBallMould.getUnlocalizedName());
		GameRegistry.registerBlock(chocolatebrick, ItemBrickBlocks.class, chocolatebrick.getUnlocalizedName());
		GameRegistry.registerBlock(smallchocolatebrick, ItemSmallBrickBlocks.class, smallchocolatebrick.getUnlocalizedName());
		GameRegistry.registerBlock(chocolatepiller, ItemPillerBlocks.class, chocolatepiller.getUnlocalizedName());
		GameRegistry.registerBlock(chocolatechiseled, ItemChiseledBlocks.class, chocolatechiseled.getUnlocalizedName());
		GameRegistry.registerBlock(BlockChocolatePortal, BlockChocolatePortal.getUnlocalizedName());
		GameRegistry.registerBlock(chocolatepane, chocolatepane.getUnlocalizedName());
		GameRegistry.registerBlock(darkchocolatepane, darkchocolatepane.getUnlocalizedName());
		GameRegistry.registerBlock(lightchocolatepane, lightchocolatepane.getUnlocalizedName());
		GameRegistry.registerBlock(whitechocolatepane, whitechocolatepane.getUnlocalizedName());
		GameRegistry.registerBlock(chocoGrass, chocoGrass.getUnlocalizedName());
		GameRegistry.registerBlock(chocoDirt, chocoDirt.getUnlocalizedName());
		GameRegistry.registerBlock(chocoSand, ItemChocolateGlass.class, chocoSand.getUnlocalizedName());
		GameRegistry.registerBlock(chocoStone, ItemChocoStone.class, chocoStone.getUnlocalizedName());
		GameRegistry.registerBlock(chocoCobbleStone, ItemChocoCobbleStone.class, chocoCobbleStone.getUnlocalizedName());
		GameRegistry.registerBlock(chocoSandstone, ItemChocoSandstone.class, chocoSandstone.getUnlocalizedName());
		GameRegistry.registerBlock(chocoDiamond, chocoDiamond.getUnlocalizedName());
		GameRegistry.registerBlock(chocoGold, chocoGold.getUnlocalizedName());
		GameRegistry.registerBlock(chocoIron, chocoIron.getUnlocalizedName());
		GameRegistry.registerBlock(chocoLapis, chocoLapis.getUnlocalizedName());
		GameRegistry.registerBlock(chocoCoal, chocoCoal.getUnlocalizedName());
		GameRegistry.registerBlock(chocoRedstone, chocoRedstone.getUnlocalizedName());
		GameRegistry.registerBlock(litChocoRedstone, litChocoRedstone.getUnlocalizedName());
		GameRegistry.registerBlock(chocolateOres, ItemChocolateOres.class, chocolateOres.getUnlocalizedName());
		GameRegistry.registerBlock(caramelBlock, ItemCaramelBlocks.class, caramelBlock.getUnlocalizedName());
		GameRegistry.registerBlock(CocoaPlanks, ItemCocoaPlanks.class, CocoaPlanks.getUnlocalizedName());
		GameRegistry.registerBlock(chocoGlass, ItemChocolateGlass.class, chocoGlass.getUnlocalizedName());
		GameRegistry.registerBlock(chocoGlassPane, chocoGlassPane.getUnlocalizedName());
		GameRegistry.registerBlock(darkChocoGlassPane, darkChocoGlassPane.getUnlocalizedName());
		GameRegistry.registerBlock(lightChocoGlassPane, lightChocoGlassPane.getUnlocalizedName());
		GameRegistry.registerBlock(whiteChocoGlassPane, whiteChocoGlassPane.getUnlocalizedName());
		GameRegistry.registerBlock(ExtraDarkChocolateBlock, ItemExtraDarkChocolateBlocks.class, ExtraDarkChocolateBlock.getUnlocalizedName());
		GameRegistry.registerBlock(ExtraDarkChocolatePiller, ItemExtraDarkChocolatePiller.class, ExtraDarkChocolatePiller.getUnlocalizedName());
		GameRegistry.registerBlock(ExtraDarkChocolateSandstone, ItemExtraDarkChocoSandstone.class, ExtraDarkChocolateSandstone.getUnlocalizedName());
		GameRegistry.registerBlock(ExtraDarkChocolatePane, ExtraDarkChocolatePane.getUnlocalizedName());
		GameRegistry.registerBlock(ExtraDarkChocolateGlassPane, ExtraDarkChocolateGlassPane.getUnlocalizedName());

		
		GameRegistry.registerBlock(chocolatestairs, chocolatestairs.getUnlocalizedName());
		GameRegistry.registerBlock(darkchocolatestairs, darkchocolatestairs.getUnlocalizedName());
		GameRegistry.registerBlock(lightchocolatestairs, lightchocolatestairs.getUnlocalizedName());
		GameRegistry.registerBlock(whitechocolatestairs, whitechocolatestairs.getUnlocalizedName());
		GameRegistry.registerBlock(chocolatebrickstairs, chocolatebrickstairs.getUnlocalizedName());
		GameRegistry.registerBlock(darkchocolatebrickstairs, darkchocolatebrickstairs.getUnlocalizedName());
		GameRegistry.registerBlock(lightchocolatebrickstairs, lightchocolatebrickstairs.getUnlocalizedName());
		GameRegistry.registerBlock(whitechocolatebrickstairs, whitechocolatebrickstairs.getUnlocalizedName());
		GameRegistry.registerBlock(smallchocolatebrickstairs, smallchocolatebrickstairs.getUnlocalizedName());
		GameRegistry.registerBlock(smalldarkchocolatebrickstairs, smalldarkchocolatebrickstairs.getUnlocalizedName());
		GameRegistry.registerBlock(smalllightchocolatebrickstairs, smalllightchocolatebrickstairs.getUnlocalizedName());
		GameRegistry.registerBlock(smallwhitechocolatebrickstairs, smallwhitechocolatebrickstairs.getUnlocalizedName());
		GameRegistry.registerBlock(chocoCobbleStoneStairs, chocoCobbleStoneStairs.getUnlocalizedName());
		GameRegistry.registerBlock(darkchocoCobbleStoneStairs, darkchocoCobbleStoneStairs.getUnlocalizedName());
		GameRegistry.registerBlock(lightchocoCobbleStoneStairs, lightchocoCobbleStoneStairs.getUnlocalizedName());
		GameRegistry.registerBlock(whitechocoCobbleStoneStairs, whitechocoCobbleStoneStairs.getUnlocalizedName());
		GameRegistry.registerBlock(ChocoSandstonestairs, ChocoSandstonestairs.getUnlocalizedName());
		GameRegistry.registerBlock(ChocoSmoothSandstoneStairs, ChocoSmoothSandstoneStairs.getUnlocalizedName());
		GameRegistry.registerBlock(darkChocoSandstonestairs, darkChocoSandstonestairs.getUnlocalizedName());
		GameRegistry.registerBlock(darkChocoSmoothSandstoneStairs, darkChocoSmoothSandstoneStairs.getUnlocalizedName());
		GameRegistry.registerBlock(lightChocoSandstonestairs, lightChocoSandstonestairs.getUnlocalizedName());
		GameRegistry.registerBlock(lightChocoSmoothSandstoneStairs, lightChocoSmoothSandstoneStairs.getUnlocalizedName());
		GameRegistry.registerBlock(whiteChocoSandstonestairs, whiteChocoSandstonestairs.getUnlocalizedName());
		GameRegistry.registerBlock(whiteChocoSmoothSandstoneStairs, whiteChocoSmoothSandstoneStairs.getUnlocalizedName());
		GameRegistry.registerBlock(caramelStairs, caramelStairs.getUnlocalizedName());
		GameRegistry.registerBlock(caramelBrickStairs, caramelBrickStairs.getUnlocalizedName());
		GameRegistry.registerBlock(caramelSmallBrickStairs, caramelSmallBrickStairs.getUnlocalizedName());
		GameRegistry.registerBlock(CocoaStairs, CocoaStairs.getUnlocalizedName());
		GameRegistry.registerBlock(chocolatePlankStairs, chocolatePlankStairs.getUnlocalizedName());
		GameRegistry.registerBlock(darkChocolatePlankStairs, darkChocolatePlankStairs.getUnlocalizedName());
		GameRegistry.registerBlock(lightChocolatePlankStairs, lightChocolatePlankStairs.getUnlocalizedName());
		GameRegistry.registerBlock(whiteChocolatePlankStairs, whiteChocolatePlankStairs.getUnlocalizedName());
		GameRegistry.registerBlock(ExtraDarkChocolateStairs, ExtraDarkChocolateStairs.getUnlocalizedName());
		GameRegistry.registerBlock(ExtraDarkChocolateBrickStairs, ExtraDarkChocolateBrickStairs.getUnlocalizedName());
		GameRegistry.registerBlock(ExtraDarkChocolateSmallBrickStairs, ExtraDarkChocolateSmallBrickStairs.getUnlocalizedName());
		GameRegistry.registerBlock(ExtraDarkChocolatePlankStairs, ExtraDarkChocolatePlankStairs.getUnlocalizedName());
		GameRegistry.registerBlock(ExtraDarkChocolateSandstoneStairs, ExtraDarkChocolateSandstoneStairs.getUnlocalizedName());
		GameRegistry.registerBlock(ExtraDarkChocolateSmoothSandstoneStairs, ExtraDarkChocolateSmoothSandstoneStairs.getUnlocalizedName());

		
		GameRegistry.registerBlock(chocolatefence, chocolatefence.getUnlocalizedName());
		GameRegistry.registerBlock(darkchocolatefence, darkchocolatefence.getUnlocalizedName());
		GameRegistry.registerBlock(lightchocolatefence, lightchocolatefence.getUnlocalizedName());
		GameRegistry.registerBlock(whitechocolatefence, whitechocolatefence.getUnlocalizedName());
		GameRegistry.registerBlock(chocolatebrickfence, chocolatebrickfence.getUnlocalizedName());
		GameRegistry.registerBlock(darkchocolatebrickfence, darkchocolatebrickfence.getUnlocalizedName());
		GameRegistry.registerBlock(lightchocolatebrickfence, lightchocolatebrickfence.getUnlocalizedName());
		GameRegistry.registerBlock(whitechocolatebrickfence, whitechocolatebrickfence.getUnlocalizedName());
		GameRegistry.registerBlock(chocolateSmallBrickFence, chocolateSmallBrickFence.getUnlocalizedName());
		GameRegistry.registerBlock(darkChocolateSmallBrickFence, darkChocolateSmallBrickFence.getUnlocalizedName());
		GameRegistry.registerBlock(lightChocolateSmallBrickFence, lightChocolateSmallBrickFence.getUnlocalizedName());
		GameRegistry.registerBlock(whiteChocolateSmallBrickFence, whiteChocolateSmallBrickFence.getUnlocalizedName());
		GameRegistry.registerBlock(caramelFence, caramelFence.getUnlocalizedName());
		GameRegistry.registerBlock(caramelBrickFence, caramelBrickFence.getUnlocalizedName());
		GameRegistry.registerBlock(caramelSmallBrickFence, caramelSmallBrickFence.getUnlocalizedName());
		GameRegistry.registerBlock(cocoaFence, cocoaFence.getUnlocalizedName());
		GameRegistry.registerBlock(chocolatePlankFence, chocolatePlankFence.getUnlocalizedName());
		GameRegistry.registerBlock(darkChocolatePlankFence, darkChocolatePlankFence.getUnlocalizedName());
		GameRegistry.registerBlock(lightChocolatePlankFence, lightChocolatePlankFence.getUnlocalizedName());
		GameRegistry.registerBlock(whiteChocolatePlankFence, whiteChocolatePlankFence.getUnlocalizedName());
		GameRegistry.registerBlock(ExtraDarkChocolateFence, ExtraDarkChocolateFence.getUnlocalizedName());
		GameRegistry.registerBlock(ExtraDarkChocolateBrickFence, ExtraDarkChocolateBrickFence.getUnlocalizedName());
		GameRegistry.registerBlock(ExtraDarkChocolateSmallBrickFence, ExtraDarkChocolateSmallBrickFence.getUnlocalizedName());
		GameRegistry.registerBlock(ExtraDarkChocolatePlankFence, ExtraDarkChocolatePlankFence.getUnlocalizedName());

		
		GameRegistry.registerBlock(chocolatedouble, ItemChocolateSlabs.class, "chocolatedouble");
		GameRegistry.registerBlock(chocolatesingle, ItemChocolateSlabs.class, "chocolatesingle");
		GameRegistry.registerBlock(darkchocolatedouble, ItemDarkChocolateSlabs.class, "darkchocolatedouble");
		GameRegistry.registerBlock(darkchocolatesingle, ItemDarkChocolateSlabs.class, "darkchocolatesingle");
		GameRegistry.registerBlock(lightchocolatedouble, ItemLightChocolateSlabs.class, "lightchocolatedouble");
		GameRegistry.registerBlock(lightchocolatesingle, ItemLightChocolateSlabs.class, "lightchocolatesingle");
		GameRegistry.registerBlock(whitechocolatedouble, ItemWhiteChocolateSlabs.class, "whitechocolatedouble");
		GameRegistry.registerBlock(whitechocolatesingle, ItemWhiteChocolateSlabs.class, "whitechocolatesingle");
		GameRegistry.registerBlock(chocolatebrickdouble, ItemChocolateBrickSlabs.class, "chocolatebrickdouble");
		GameRegistry.registerBlock(chocolatebricksingle, ItemChocolateBrickSlabs.class, "chocolatebricksingle");
		GameRegistry.registerBlock(darkchocolatebrickdouble, ItemDarkChocolateBrickSlabs.class, "darkchocolatebrickdouble");
		GameRegistry.registerBlock(darkchocolatebricksingle, ItemDarkChocolateBrickSlabs.class, "darkchocolatebricksingle");
		GameRegistry.registerBlock(lightchocolatebrickdouble, ItemLightChocolateBrickSlabs.class, "lightchocolatebrickdouble");
		GameRegistry.registerBlock(lightchocolatebricksingle, ItemLightChocolateBrickSlabs.class, "lightchocolatebricksingle");
		GameRegistry.registerBlock(whitechocolatebrickdouble, ItemWhiteChocolateBrickSlabs.class, "whitechocolatebrickdouble");
		GameRegistry.registerBlock(whitechocolatebricksingle, ItemWhiteChocolateBrickSlabs.class, "whitechocolatebricksingle");
		GameRegistry.registerBlock(smallchocolatebrickdouble, ItemSmallChocolateBrickSlabs.class, "chocolatesmallbrickdouble");
		GameRegistry.registerBlock(smallchocolatebricksingle, ItemSmallChocolateBrickSlabs.class, "chocolatesmallbricksingle");
		GameRegistry.registerBlock(smalldarkchocolatebrickdouble, ItemSmallDarkChocolateBrickSlabs.class, "darkchocolatesmallbrickdouble");
		GameRegistry.registerBlock(smalldarkchocolatebricksingle, ItemSmallDarkChocolateBrickSlabs.class, "darkchocolatesmallbricksingle");
		GameRegistry.registerBlock(smalllightchocolatebrickdouble, ItemSmallLightChocolateBrickSlabs.class, "lightchocolatesmallbrickdouble");
		GameRegistry.registerBlock(smalllightchocolatebricksingle, ItemSmallLightChocolateBrickSlabs.class, "lightchocolatesmallbricksingle");
		GameRegistry.registerBlock(smallwhitechocolatebrickdouble, ItemSmallWhiteChocolateBrickSlabs.class, "whitechocolatesmallbrickdouble");
		GameRegistry.registerBlock(smallwhitechocolatebricksingle, ItemSmallWhiteChocolateBrickSlabs.class, "whitechocolatesmallbricksingle");
		GameRegistry.registerBlock(chocoCobbleStoneSlabdouble, ItemchocoCobbleStoneSlabs.class, "chocolatecobblestonedouble");
		GameRegistry.registerBlock(chocoCobbleStoneSlabsingle, ItemchocoCobbleStoneSlabs.class, "chocolatecobblestonesingle");
		GameRegistry.registerBlock(darkchocoCobbleStoneSlabdouble, ItemdarkchocoCobbleStoneSlabs.class, "darkchocolatecobblestonedouble");
		GameRegistry.registerBlock(darkchocoCobbleStoneSlabsingle, ItemdarkchocoCobbleStoneSlabs.class, "darkchocolatecobblestonesingle");
		GameRegistry.registerBlock(lightchocoCobbleStoneSlabdouble, ItemlightchocoCobbleStoneSlabs.class, "lightchocolatecobblestonedouble");
		GameRegistry.registerBlock(lightchocoCobbleStoneSlabsingle, ItemlightchocoCobbleStoneSlabs.class, "lightchocolatecobblestonesingle");
		GameRegistry.registerBlock(whitechocoCobbleStoneSlabdouble, ItemwhitechocoCobbleStoneSlabs.class, "whitechocolatecobblestonedouble");
		GameRegistry.registerBlock(whitechocoCobbleStoneSlabsingle, ItemwhitechocoCobbleStoneSlabs.class, "whitechocolatecobblestonesingle");
		GameRegistry.registerBlock(chocoSandStoneSlabdouble, ItemchocoSandStoneSlabs.class, "chocosandstonedouble");
		GameRegistry.registerBlock(chocoSandStoneSlabsingle, ItemchocoSandStoneSlabs.class, "chocosandstonesingle");
		GameRegistry.registerBlock(chocoSmoothSandStoneSlabdouble, ItemchocoSmoothSandStoneSlabs.class, "chocosmoothsandstonedouble");
		GameRegistry.registerBlock(chocoSmoothSandStoneSlabsingle, ItemchocoSmoothSandStoneSlabs.class, "chocosmoothsandstonesingle");
		GameRegistry.registerBlock(darkchocoSandStoneSlabdouble, ItemdarkchocoSandStoneSlabs.class, "darkchocosandstonedouble");
		GameRegistry.registerBlock(darkchocoSandStoneSlabsingle, ItemdarkchocoSandStoneSlabs.class, "darkchocosandstonesingle");
		GameRegistry.registerBlock(darkchocoSmoothSandStoneSlabdouble, ItemdarkchocoSmoothSandStoneSlabs.class, "darkchocosmoothsandstonedouble");
		GameRegistry.registerBlock(darkchocoSmoothSandStoneSlabsingle, ItemdarkchocoSmoothSandStoneSlabs.class, "darkchocosmoothsandstonesingle");
		GameRegistry.registerBlock(lightchocoSandStoneSlabdouble, ItemlightchocoSandStoneSlabs.class, "lightchocosandstonedouble");
		GameRegistry.registerBlock(lightchocoSandStoneSlabsingle, ItemlightchocoSandStoneSlabs.class, "lightchocosandstonesingle");
		GameRegistry.registerBlock(lightchocoSmoothSandStoneSlabdouble, ItemlightchocoSmoothSandStoneSlabs.class, "lightchocosmoothsandstonedouble");
		GameRegistry.registerBlock(lightchocoSmoothSandStoneSlabsingle, ItemlightchocoSmoothSandStoneSlabs.class, "lightchocosmoothsandstonesingle");
		GameRegistry.registerBlock(whitechocoSandStoneSlabdouble, ItemwhitechocoSandStoneSlabs.class, "whitechocosandstonedouble");
		GameRegistry.registerBlock(whitechocoSandStoneSlabsingle, ItemwhitechocoSandStoneSlabs.class, "whitechocosandstonesingle");
		GameRegistry.registerBlock(whitechocoSmoothSandStoneSlabdouble, ItemwhitechocoSmoothSandStoneSlabs.class, "whitechocosmoothsandstonedouble");
		GameRegistry.registerBlock(whitechocoSmoothSandStoneSlabsingle, ItemwhitechocoSmoothSandStoneSlabs.class, "whitechocosmoothsandstonesingle");
		GameRegistry.registerBlock(caramelSlabdouble, ItemCaramelSlabs.class, "carameldouble");
		GameRegistry.registerBlock(caramelSlabsingle, ItemCaramelSlabs.class, "caramelsingle");
		GameRegistry.registerBlock(caramelBrickSlabdouble, ItemCaramelBrickSlabs.class, "caramelbrickdouble");
		GameRegistry.registerBlock(caramelBrickSlabsingle, ItemCaramelBrickSlabs.class, "caramelbricksingle");
		GameRegistry.registerBlock(caramelSmallBrickSlabdouble, ItemCaramelSmallBrickSlabs.class, "caramelsmallbrickdouble");
		GameRegistry.registerBlock(caramelSmallBrickSlabsingle, ItemCaramelSmallBrickSlabs.class, "caramelsmallbricksingle");
		GameRegistry.registerBlock(CocoaSlabdouble, ItemCocoaSlabs.class, "cocoaplankdouble");
		GameRegistry.registerBlock(CocoaSlabsingle, ItemCocoaSlabs.class, "cocoaplanksingle");
		GameRegistry.registerBlock(chocolatePlankSlabdouble, ItemChocolatePlankSlabs.class, "chocolateplankdouble");
		GameRegistry.registerBlock(chocolatePlankSlabsingle, ItemChocolatePlankSlabs.class, "chocolateplanksingle");
		GameRegistry.registerBlock(darkChocolatePlankSlabdouble, ItemDarkChocolatePlankSlabs.class, "darkchocolateplankdouble");
		GameRegistry.registerBlock(darkChocolatePlankSlabsingle, ItemDarkChocolatePlankSlabs.class, "darkchocolateplanksingle");
		GameRegistry.registerBlock(lightChocolatePlankSlabdouble, ItemLightChocolatePlankSlabs.class, "lightchocolateplankdouble");
		GameRegistry.registerBlock(lightChocolatePlankSlabsingle, ItemLightChocolatePlankSlabs.class, "lightchocolateplanksingle");
		GameRegistry.registerBlock(whiteChocolatePlankSlabdouble, ItemWhiteChocolatePlankSlabs.class, "whitechocolateplankdouble");
		GameRegistry.registerBlock(whiteChocolatePlankSlabsingle, ItemWhiteChocolatePlankSlabs.class, "whitechocolateplanksingle");
		GameRegistry.registerBlock(ExtraDarkChocolateSlabDouble, ItemExtraDarkChocolateSlabs.class, "extradarkchocolateslabdouble");
		GameRegistry.registerBlock(ExtraDarkChocolateSlabSingle, ItemExtraDarkChocolateSlabs.class, "extradarkchocolateslabsingle");
		GameRegistry.registerBlock(ExtraDarkChocolateBrickSlabDouble, ItemExtraDarkChocolateBrickSlabs.class, "extradarkchocolatebrickslabdouble");
		GameRegistry.registerBlock(ExtraDarkChocolateBrickSlabSingle, ItemExtraDarkChocolateBrickSlabs.class, "extradarkchocolatebrickslabsingle");
		GameRegistry.registerBlock(ExtraDarkChocolateSmallBrickSlabDouble, ItemExtraDarkChocolateSmallBrickSlabs.class, "extradarkchocolatesmallbrickslabdouble");
		GameRegistry.registerBlock(ExtraDarkChocolateSmallBrickSlabSingle, ItemExtraDarkChocolateSmallBrickSlabs.class, "extradarkchocolatesmallbrickslabsingle");
		GameRegistry.registerBlock(ExtraDarkChocolatePlankSlabDouble, ItemExtraDarkChocolatePlankSlabs.class, "extradarkchocolateplankslabdouble");
		GameRegistry.registerBlock(ExtraDarkChocolatePlankSlabSingle, ItemExtraDarkChocolatePlankSlabs.class, "extradarkchocolateplankslabsingle");
		GameRegistry.registerBlock(ExtraDarkChocolateSandstoneDouble, ItemExtraDarkChocolateSandstoneSlabs.class, "extradarkchocolatesandstoneslabdouble");
		GameRegistry.registerBlock(ExtraDarkChocolateSandstoneSingle, ItemExtraDarkChocolateSandstoneSlabs.class, "extradarkchocolatesandstoneslabsingle");
		GameRegistry.registerBlock(ExtraDarkChocolateSmoothSandstoneDouble, ItemExtraDarkChocolateSmoothSandstoneSlabs.class, "extradarkchocolatesmoothsandstoneslabdouble");
		GameRegistry.registerBlock(ExtraDarkChocolateSmoothSandstoneSingle, ItemExtraDarkChocolateSmoothSandstoneSlabs.class, "extradarkchocolatesmoothsandstoneslabsingle");
		
		
		GameRegistry.registerBlock(ChocolateCake, ChocolateCake.getUnlocalizedName());
		GameRegistry.registerBlock(DarkChocolateCake, DarkChocolateCake.getUnlocalizedName());
		GameRegistry.registerBlock(LightChocolateCake, LightChocolateCake.getUnlocalizedName());
		GameRegistry.registerBlock(WhiteChocolateCake, WhiteChocolateCake.getUnlocalizedName());
		GameRegistry.registerBlock(chocolatePie, chocolatePie.getUnlocalizedName());
		GameRegistry.registerBlock(darkChocolatePie, darkChocolatePie.getUnlocalizedName());
		GameRegistry.registerBlock(lightChocolatePie, lightChocolatePie.getUnlocalizedName());
		GameRegistry.registerBlock(whiteChocolatePie, whiteChocolatePie.getUnlocalizedName());
		GameRegistry.registerBlock(ExtraDarkChocolateCake, ExtraDarkChocolateCake.getUnlocalizedName());
		GameRegistry.registerBlock(ExtraDarkChocolatePie, ExtraDarkChocolatePie.getUnlocalizedName());

		
		GameRegistry.registerBlock(cocoaDoor, cocoaDoor.getUnlocalizedName());
		GameRegistry.registerBlock(ChocolateDoor, ChocolateDoor.getUnlocalizedName());
		GameRegistry.registerBlock(DarkChocolateDoor, DarkChocolateDoor.getUnlocalizedName());
		GameRegistry.registerBlock(LightChocolateDoor, LightChocolateDoor.getUnlocalizedName());
		GameRegistry.registerBlock(WhiteChocolateDoor, WhiteChocolateDoor.getUnlocalizedName());
		GameRegistry.registerBlock(ExtraDarkChocolateDoor, ExtraDarkChocolateDoor.getUnlocalizedName());

		
		GameRegistry.registerBlock(chocolateWall, ItemHardChocolateWall.class, chocolateWall.getUnlocalizedName());
		GameRegistry.registerBlock(chocolateBrickWall, ItemBrickWall.class, chocolateBrickWall.getUnlocalizedName());
		GameRegistry.registerBlock(chocolateSmallBrickWall, ItemBrickWall.class, chocolateSmallBrickWall.getUnlocalizedName());
		GameRegistry.registerBlock(chocoCobbleStoneWall, ItemChocolateWall.class, chocoCobbleStoneWall.getUnlocalizedName());
		GameRegistry.registerBlock(caramelWall, ItemCaramelWall.class, caramelWall.getUnlocalizedName());
		
		
		//Ore Dictionary
		
		OreDictionary.registerOre("plankWood", new ItemStack(CocoaPlanks, 1, OreDictionary.WILDCARD_VALUE));

		OreDictionary.registerOre("woodPlank", new ItemStack(CocoaPlanks, 1, OreDictionary.WILDCARD_VALUE));
		
		OreDictionary.registerOre("slabWood", CocoaSlabsingle);
		OreDictionary.registerOre("slabWood", chocolatePlankSlabsingle);
		OreDictionary.registerOre("slabWood", darkChocolatePlankSlabsingle);
		OreDictionary.registerOre("slabWood", lightChocolatePlankSlabsingle);
		OreDictionary.registerOre("slabWood", whiteChocolatePlankSlabsingle);
		OreDictionary.registerOre("woodSlab", CocoaSlabsingle);
		OreDictionary.registerOre("woodSlab", chocolatePlankSlabsingle);
		OreDictionary.registerOre("woodSlab", darkChocolatePlankSlabsingle);
		OreDictionary.registerOre("woodSlab", lightChocolatePlankSlabsingle);
		OreDictionary.registerOre("woodSlab", whiteChocolatePlankSlabsingle);
		OreDictionary.registerOre("slabWood", CocoaSlabdouble);
		OreDictionary.registerOre("slabWood", chocolatePlankSlabdouble);
		OreDictionary.registerOre("slabWood", darkChocolatePlankSlabdouble);
		OreDictionary.registerOre("slabWood", lightChocolatePlankSlabdouble);
		OreDictionary.registerOre("slabWood", whiteChocolatePlankSlabdouble);
		OreDictionary.registerOre("woodSlab", CocoaSlabdouble);
		OreDictionary.registerOre("woodSlab", chocolatePlankSlabdouble);
		OreDictionary.registerOre("woodSlab", darkChocolatePlankSlabdouble);
		OreDictionary.registerOre("woodSlab", lightChocolatePlankSlabdouble);
		OreDictionary.registerOre("woodSlab", whiteChocolatePlankSlabdouble);
		OreDictionary.registerOre("slabWood", ExtraDarkChocolatePlankSlabSingle);
		OreDictionary.registerOre("woodSlab", ExtraDarkChocolatePlankSlabSingle);
		OreDictionary.registerOre("slabWood", ExtraDarkChocolatePlankSlabDouble);
		OreDictionary.registerOre("woodSlab", ExtraDarkChocolatePlankSlabDouble);
		
		OreDictionary.registerOre("stairWood", CocoaStairs);
		OreDictionary.registerOre("stairWood", chocolatePlankStairs);
		OreDictionary.registerOre("stairWood", darkChocolatePlankStairs);
		OreDictionary.registerOre("stairWood", lightChocolatePlankStairs);
		OreDictionary.registerOre("stairWood", whiteChocolatePlankStairs);
		OreDictionary.registerOre("woodStair", CocoaStairs);
		OreDictionary.registerOre("woodStair", chocolatePlankStairs);
		OreDictionary.registerOre("woodStair", darkChocolatePlankStairs);
		OreDictionary.registerOre("woodStair", lightChocolatePlankStairs);
		OreDictionary.registerOre("woodStair", whiteChocolatePlankStairs);
		OreDictionary.registerOre("stairWood", ExtraDarkChocolatePlankStairs);
		OreDictionary.registerOre("woodStair", ExtraDarkChocolatePlankStairs);
		
		OreDictionary.registerOre("oreGold", chocoGold);
		OreDictionary.registerOre("oreIron", chocoIron);
		OreDictionary.registerOre("oreLapis", chocoLapis);
		OreDictionary.registerOre("oreDiamond", chocoDiamond);
		OreDictionary.registerOre("oreRedstone", chocoRedstone);
		OreDictionary.registerOre("oreCoal", chocoCoal);
		
		OreDictionary.registerOre("blockGlassColorless", new ItemStack(chocoGlass, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("blockGlass", new ItemStack(chocoGlass, 1, OreDictionary.WILDCARD_VALUE));
		
		OreDictionary.registerOre("paneGlassColorless", chocoGlassPane);
		OreDictionary.registerOre("paneGlassColorless", darkChocoGlassPane);
		OreDictionary.registerOre("paneGlassColorless", lightChocoGlassPane);
		OreDictionary.registerOre("paneGlassColorless", whiteChocoGlassPane);
		OreDictionary.registerOre("paneGlass", chocoGlassPane);
		OreDictionary.registerOre("paneGlass", darkChocoGlassPane);
		OreDictionary.registerOre("paneGlass", lightChocoGlassPane);
		OreDictionary.registerOre("paneGlass", whiteChocoGlassPane);
		OreDictionary.registerOre("paneGlass", ExtraDarkChocolateGlassPane);
		OreDictionary.registerOre("paneGlassColorless", ExtraDarkChocolateGlassPane);

		OreDictionary.registerOre("stone", new ItemStack(chocoStone, 1, OreDictionary.WILDCARD_VALUE));
		
		OreDictionary.registerOre("cobblestone", new ItemStack(chocoCobbleStone, 1, OreDictionary.WILDCARD_VALUE));

		OreDictionary.registerOre("sandstone", new ItemStack(chocoSandstone, 1, OreDictionary.WILDCARD_VALUE));
		
		OreDictionary.registerOre("sand", new ItemStack(chocoSand, 1, OreDictionary.WILDCARD_VALUE));
		
		OreDictionary.registerOre("dirt", chocoDirt);
		
		OreDictionary.registerOre("grass", chocoGrass);

		//Chocolate Specific
		OreDictionary.registerOre("cocoaPlank", new ItemStack(CocoaPlanks, 0, 0));
		OreDictionary.registerOre("chocolatePlank", new ItemStack(CocoaPlanks, 1, 1));
		OreDictionary.registerOre("chocolatePlank", new ItemStack(CocoaPlanks, 2, 2));
		OreDictionary.registerOre("chocolatePlank", new ItemStack(CocoaPlanks, 3, 3));
		OreDictionary.registerOre("chocolatePlank", new ItemStack(CocoaPlanks, 4, 4));
		OreDictionary.registerOre("chocolatePlank", new ItemStack(CocoaPlanks, 5, 5));

		OreDictionary.registerOre("cocoaSlab", CocoaSlabsingle);
		OreDictionary.registerOre("chocolateSlab", chocolatePlankSlabsingle);
		OreDictionary.registerOre("darkChocolateSlab", darkChocolatePlankSlabsingle);
		OreDictionary.registerOre("lightChocolateSlab", lightChocolatePlankSlabsingle);
		OreDictionary.registerOre("whiteChocolateSlab", whiteChocolatePlankSlabsingle);
		OreDictionary.registerOre("extradarkChocolateSlab", ExtraDarkChocolatePlankSlabSingle);
		OreDictionary.registerOre("chocolatePlankSlab", chocolatePlankSlabsingle);
		OreDictionary.registerOre("darkChocolatePlankSlab", darkChocolatePlankSlabsingle);
		OreDictionary.registerOre("lightChocolatePlankSlab", lightChocolatePlankSlabsingle);
		OreDictionary.registerOre("whiteChocolatePlankSlab", whiteChocolatePlankSlabsingle);
		OreDictionary.registerOre("extradarkChocolatePlankSlab", ExtraDarkChocolatePlankSlabSingle);
		OreDictionary.registerOre("cocoaSlab", CocoaSlabdouble);
		OreDictionary.registerOre("chocolateSlab", chocolatePlankSlabdouble);
		OreDictionary.registerOre("darkChocolateSlab", darkChocolatePlankSlabdouble);
		OreDictionary.registerOre("lightChocolateSlab", lightChocolatePlankSlabdouble);
		OreDictionary.registerOre("whiteChocolateSlab", whiteChocolatePlankSlabdouble);
		OreDictionary.registerOre("extradarkChocolateSlab", ExtraDarkChocolatePlankSlabDouble);
		OreDictionary.registerOre("chocolatePlankSlab", chocolatePlankSlabdouble);
		OreDictionary.registerOre("darkChocolatePlankSlab", darkChocolatePlankSlabdouble);
		OreDictionary.registerOre("lightChocolatePlankSlab", lightChocolatePlankSlabdouble);
		OreDictionary.registerOre("whiteChocolatePlankSlab", whiteChocolatePlankSlabdouble);
		OreDictionary.registerOre("extradarkChocolatePlankSlab", ExtraDarkChocolatePlankSlabDouble);

		OreDictionary.registerOre("cocoaStair", CocoaStairs);
		OreDictionary.registerOre("chocolateStair", chocolatePlankStairs);
		OreDictionary.registerOre("darkChocolateStair", darkChocolatePlankStairs);
		OreDictionary.registerOre("lightChocolateStair", lightChocolatePlankStairs);
		OreDictionary.registerOre("whiteChocolateStair", whiteChocolatePlankStairs);
		OreDictionary.registerOre("chocolatePlankStair", chocolatePlankStairs);
		OreDictionary.registerOre("darkChocolatePlankStair", darkChocolatePlankStairs);
		OreDictionary.registerOre("lightChocolatePlankStair", lightChocolatePlankStairs);
		OreDictionary.registerOre("whiteChocolatePlankStair", whiteChocolatePlankStairs);
		OreDictionary.registerOre("extradarkChocolateStair", ExtraDarkChocolatePlankStairs);
		OreDictionary.registerOre("extradarkChocolatePlankStair", ExtraDarkChocolatePlankStairs);
		
		OreDictionary.registerOre("oreChocolateGold", chocoGold);
		OreDictionary.registerOre("oreChocolateIron", chocoIron);
		OreDictionary.registerOre("oreChocolateLapis", chocoLapis);
		OreDictionary.registerOre("oreChocolateDiamond", chocoDiamond);
		OreDictionary.registerOre("oreChocolateRedstone", chocoRedstone);
		OreDictionary.registerOre("oreChocolateCoal", chocoCoal);
		
		OreDictionary.registerOre("chocolateGlass", new ItemStack(chocoGlass, 1, OreDictionary.WILDCARD_VALUE));
		
		OreDictionary.registerOre("chocolateGlassPane", chocoGlassPane);
		OreDictionary.registerOre("chocolateGlassPane", darkChocoGlassPane);
		OreDictionary.registerOre("chocolateGlassPane", lightChocoGlassPane);
		OreDictionary.registerOre("chocolateGlassPane", whiteChocoGlassPane);
		OreDictionary.registerOre("chocolateGlassPane", ExtraDarkChocolateGlassPane);

		OreDictionary.registerOre("chocolateStone", new ItemStack(chocoStone, 1, OreDictionary.WILDCARD_VALUE));

		OreDictionary.registerOre("chocolateCobblestone", new ItemStack(chocoCobbleStone, 1, OreDictionary.WILDCARD_VALUE));
		
		OreDictionary.registerOre("chocolateSandstone", new ItemStack(chocoSandstone, 1, OreDictionary.WILDCARD_VALUE));
		
		OreDictionary.registerOre("chocolateSand", new ItemStack(chocoSand, 1, OreDictionary.WILDCARD_VALUE));
		
		OreDictionary.registerOre("chocolateDirt", chocoDirt);
		
		OreDictionary.registerOre("chocolateGrass", chocoGrass);
		
		OreDictionary.registerOre("blockChocolate", new ItemStack(chocolateblock, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("blockChocolate", new ItemStack(fruitychocolateblock, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("blockChocolate", new ItemStack(mintychocolateblock, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("blockChocolate", cookiesandcreamblock);
		OreDictionary.registerOre("blockChocolate", goldchocolateblock);
		OreDictionary.registerOre("blockChocolate", new ItemStack(ExtraDarkChocolateBlock, 1, OreDictionary.WILDCARD_VALUE));

	}

}
