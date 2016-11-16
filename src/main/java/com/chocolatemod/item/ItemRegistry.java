package com.chocolatemod.item;

import java.util.Random;

import com.chocolatemod.main.MainRegistry;
import com.chocolatemod.worldgen.ChocolateChestGenHooks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemEnchantedBook;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.oredict.OreDictionary;

public class ItemRegistry {

	public static void mainRegistry() {
		initialiseItem();
		registerItem();
	}

	public static Item fruitbits;
	public static Item lightchocolatelump;
	public static Item bowlmilk;
	public static Item rawchocolatelump;
	public static Item mint;
	public static Item ChocolatePortalPlacer;
	public static Item bowlchocolatemilk;
	public static Item bowldarkchocolatemilk;
	public static Item bowllightchocolatemilk;
	public static Item bowlwhitechocolatemilk;
	public static Item chocolateIngots;
	public static Item chocolaterod;
	public static Item toffee;
	public static Item rawMintTea;
	public static Item mintSeeds;
	public static Item CocoaDoorItem;
	public static Item ChocolateDoorItem;
	public static Item DarkChocolateDoorItem;
	public static Item LightChocolateDoorItem;
	public static Item WhiteChocolateDoorItem;
	public static Item ChocolateFeather;
	public static Item CocoaPowder;
	public static Item piePan;
	public static Item pieDough;
	public static Item piePotCrust;
	public static Item rawChocolatePie;
	public static Item caramelChunk;
	public static Item WarmChocolateBowl;
	public static Item WarmDarkChocolateBowl;
	public static Item WarmLightChocolateBowl;
	public static Item WarmWhiteChocolateBowl;
	public static Item BowlExtraDarkChocolateMilk;
	public static Item WarmExtraDarkChocolateBowl;
	public static Item ExtraDarkChocolateDoorItem;

	public static void initialiseItem() {

		bowlchocolatemilk = new BowlChocolateMilk(2, 0.4F, false).setUnlocalizedName("bowlchocolatemilk").setTextureName("killerjdog51:chocolatemilkbowl").setCreativeTab(MainRegistry.tabChocolateMisc);
		bowlwhitechocolatemilk = new BowlWhiteChocolateMilk(2, 0.4F, false).setUnlocalizedName("bowlwhitechocolatemilk").setCreativeTab(MainRegistry.tabChocolateMisc);
		bowldarkchocolatemilk = new BowlDarkChocolateMilk(2, 0.4F, false).setUnlocalizedName("bowldarkchocolatemilk").setCreativeTab(MainRegistry.tabChocolateMisc).setTextureName("killerjdog51:darkchocolatemilkbowl");
		bowllightchocolatemilk = new BowlLightChocolateMilk(2, 0.4F, false).setUnlocalizedName(MainRegistry.EnableMilkChocolate ? "milkchocolatemilkbowl" : "bowllightchocolatemilk").setCreativeTab(MainRegistry.tabChocolateMisc);
		fruitbits = new chocolateItems().setUnlocalizedName("fruitbits").setTextureName("killerjdog51:fruitbits").setCreativeTab(MainRegistry.tabChocolateMisc);
		lightchocolatelump = new chocolateItems().setUnlocalizedName("lightchocolatelump").setTextureName("killerjdog51:lightchocolatelump").setCreativeTab(MainRegistry.tabChocolateMisc);
		bowlmilk = new bowlMilk(2, 0.4F, false).setUnlocalizedName("bowlmilk").setContainerItem(net.minecraft.init.Items.bowl);
		rawchocolatelump = new chocolateItems().setUnlocalizedName("rawchocolatelump").setTextureName("killerjdog51:chocolatelump").setCreativeTab(MainRegistry.tabChocolateMisc);
		ChocolatePortalPlacer = new ChocolatePortalPlacer().setUnlocalizedName("ChocolatePortal");
		chocolateIngots = new ChocolateIngots().setUnlocalizedName("chocolateIngots").setTextureName("killerjdog51:chocolateingot");
		chocolaterod = new chocolateItems().setUnlocalizedName("chocolaterod").setCreativeTab(MainRegistry.tabChocolateMisc).setTextureName("killerjdog51:chocolaterod");
		mint = new chocolateItems().setUnlocalizedName("mintLeaf").setTextureName("killerjdog51:MintLeaf").setCreativeTab(MainRegistry.tabChocolateMisc);
		CocoaDoorItem = new ItemCocoaDoor(Material.wood).setUnlocalizedName("doorCocoa").setTextureName("killerjdog51:door_Cocoa").setCreativeTab(MainRegistry.tabChocolateBlocks);;
		ChocolateDoorItem = new ItemChocolateDoor(Material.rock).setUnlocalizedName("doorChocolate").setTextureName("killerjdog51:door_Chocolate").setCreativeTab(MainRegistry.tabChocolateBlocks);;
		DarkChocolateDoorItem = new ItemDarkChocolateDoor(Material.rock).setUnlocalizedName("doorDarkChocolate").setTextureName("killerjdog51:door_Dark").setCreativeTab(MainRegistry.tabChocolateBlocks);;
		LightChocolateDoorItem = new ItemLightChocolateDoor(Material.rock).setUnlocalizedName(MainRegistry.EnableMilkChocolate ? "doorMilkChocolate" : "doorLightChocolate").setTextureName("killerjdog51:door_Light").setCreativeTab(MainRegistry.tabChocolateBlocks);;
		WhiteChocolateDoorItem = new ItemWhiteChocolateDoor(Material.rock).setUnlocalizedName("doorWhiteChocolate").setTextureName("killerjdog51:door_White").setCreativeTab(MainRegistry.tabChocolateBlocks);;
		ChocolateFeather = new chocolateItems().setUnlocalizedName("chocolateFeather").setTextureName("killerjdog51:chocolatefeather").setCreativeTab(MainRegistry.tabChocolateMisc);
		CocoaPowder = new CocoaPowder().setUnlocalizedName("CocoaPowder").setTextureName("killerjdog51:cocoapowder").setCreativeTab(MainRegistry.tabChocolateMisc);
		piePan = new piePan().setUnlocalizedName("piePan").setTextureName("killerjdog51:pie_pan").setCreativeTab(MainRegistry.tabChocolateMisc);
		pieDough = new pieDough().setUnlocalizedName("chocolatePieDough").setTextureName("killerjdog51:pie_dough").setCreativeTab(MainRegistry.tabChocolateMisc);
		piePotCrust = new piePan().setUnlocalizedName("piePotCrust").setTextureName("killerjdog51:pie_pot_crust").setCreativeTab(MainRegistry.tabChocolateMisc);
		rawChocolatePie = new rawChocolatePie(4, 0.1F, true).setPotionEffect(Potion.hunger.id, 30, 0, 0.8F).setUnlocalizedName("rawChocolatePie").setTextureName("killerjdog51:pie_raw").setCreativeTab(MainRegistry.tabChocolateMisc);
		WarmChocolateBowl = new WarmBowlChocolateMilk(3, 0.5F, false).setUnlocalizedName("warmchocolatebowl").setContainerItem(net.minecraft.init.Items.bowl);
		WarmDarkChocolateBowl = new WarmBowlDarkChocolateMilk(3, 0.5F, false).setUnlocalizedName("warmdarkchocolatebowl").setContainerItem(net.minecraft.init.Items.bowl);
		WarmLightChocolateBowl = new WarmBowlLightChocolateMilk(3, 0.5F, false).setUnlocalizedName(MainRegistry.EnableMilkChocolate ? "warmmilkchocolatebowl" : "warmlightchocolatebowl").setContainerItem(net.minecraft.init.Items.bowl);
		WarmWhiteChocolateBowl = new WarmBowlWhiteChocolateMilk(3, 0.5F, false).setUnlocalizedName("warmwhitechocolatebowl").setContainerItem(net.minecraft.init.Items.bowl);
		caramelChunk = new chocolateItems().setUnlocalizedName("caramelChunk").setTextureName("killerjdog51:caramelChunk").setCreativeTab(MainRegistry.tabChocolateMisc);
		WarmExtraDarkChocolateBowl = new WarmBowlExtraDarkChocolateMilk(3, 0.5F, false).setUnlocalizedName("warmextradarkchocolatebowl").setContainerItem(net.minecraft.init.Items.bowl);
		BowlExtraDarkChocolateMilk = new BowlExtraDarkChocolateMilk(2, 0.4F, false).setUnlocalizedName("bowlextradarkchocolatemilk").setCreativeTab(MainRegistry.tabChocolateMisc).setTextureName("killerjdog51:extradarkchocolatemilkbowl");
		ExtraDarkChocolateDoorItem = new ItemExtraDarkChocolateDoor(Material.rock).setUnlocalizedName("doorExtraDarkChocolate").setTextureName("killerjdog51:door_ExtraDark").setCreativeTab(MainRegistry.tabChocolateBlocks);;

	}
	public static WeightedRandomChestContent getChestGenBase(ChocolateChestGenHooks chest, Random rnd, WeightedRandomChestContent original)
    {
        
        return original;
    }
	public static void registerItem() {

		GameRegistry.registerItem(ItemRegistry.bowlmilk, bowlmilk.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.bowlchocolatemilk, bowlchocolatemilk.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.bowlwhitechocolatemilk, bowlwhitechocolatemilk.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.bowldarkchocolatemilk, bowldarkchocolatemilk.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.bowllightchocolatemilk, bowllightchocolatemilk.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.WarmChocolateBowl, WarmChocolateBowl.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.WarmDarkChocolateBowl, WarmDarkChocolateBowl.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.WarmLightChocolateBowl, WarmLightChocolateBowl.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.WarmWhiteChocolateBowl, WarmWhiteChocolateBowl.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.fruitbits, fruitbits.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.lightchocolatelump, lightchocolatelump.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.rawchocolatelump, rawchocolatelump.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.ChocolatePortalPlacer, ChocolatePortalPlacer.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.chocolateIngots, chocolateIngots.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.chocolaterod, chocolaterod.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.mint, mint.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.CocoaDoorItem, CocoaDoorItem.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.ChocolateFeather, ChocolateFeather.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.ChocolateDoorItem, ChocolateDoorItem.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.DarkChocolateDoorItem, DarkChocolateDoorItem.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.LightChocolateDoorItem, LightChocolateDoorItem.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.WhiteChocolateDoorItem, WhiteChocolateDoorItem.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.CocoaPowder, CocoaPowder.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.piePan, piePan.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.pieDough, pieDough.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.piePotCrust, piePotCrust.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.rawChocolatePie, rawChocolatePie.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.caramelChunk, caramelChunk.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.WarmExtraDarkChocolateBowl, WarmExtraDarkChocolateBowl.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.BowlExtraDarkChocolateMilk, BowlExtraDarkChocolateMilk.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.ExtraDarkChocolateDoorItem, ExtraDarkChocolateDoorItem.getUnlocalizedName());

		//Ore Dictionary
		
		OreDictionary.registerOre("dyeBrown", CocoaPowder);
		OreDictionary.registerOre("cropTea", mint);
		OreDictionary.registerOre("cropMint", mint);
		OreDictionary.registerOre("listAllmilk", bowlmilk);
		OreDictionary.registerOre("listAllmilk", bowlchocolatemilk);
		OreDictionary.registerOre("listAllmilk", bowldarkchocolatemilk);
		OreDictionary.registerOre("listAllmilk", bowllightchocolatemilk);
		OreDictionary.registerOre("listAllmilk", bowlwhitechocolatemilk);
		OreDictionary.registerOre("foodChocolatemilk", bowlchocolatemilk);
		OreDictionary.registerOre("foodChocolatemilk", bowldarkchocolatemilk);
		OreDictionary.registerOre("foodChocolatemilk", bowllightchocolatemilk);
		OreDictionary.registerOre("foodChocolatemilk", bowlwhitechocolatemilk);
		OreDictionary.registerOre("listAllfruit", fruitbits);
		OreDictionary.registerOre("feather", ChocolateFeather);
		OreDictionary.registerOre("rodChocolate", chocolaterod);
		OreDictionary.registerOre("ingotChocolate", new ItemStack(chocolateIngots, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("foodDough", new ItemStack(pieDough, 1, OreDictionary.WILDCARD_VALUE));

		//Chocolate Specific
		
		OreDictionary.registerOre("dustCocoa", CocoaPowder);
		OreDictionary.registerOre("cocoaDust", CocoaPowder);
		OreDictionary.registerOre("mint", mint);
		OreDictionary.registerOre("mintLeaf", mint);
		OreDictionary.registerOre("milkBowl", bowlmilk);
		OreDictionary.registerOre("chocolateMilkBowl", bowlchocolatemilk);
		OreDictionary.registerOre("chocolateMilkBowl", bowldarkchocolatemilk);
		OreDictionary.registerOre("chocolateMilkBowl", bowllightchocolatemilk);
		OreDictionary.registerOre("chocolateMilkBowl", bowlwhitechocolatemilk);
		OreDictionary.registerOre("chocolateMilkBowl", WarmChocolateBowl);
		OreDictionary.registerOre("chocolateMilkBowl", WarmDarkChocolateBowl);
		OreDictionary.registerOre("chocolateMilkBowl", WarmLightChocolateBowl);
		OreDictionary.registerOre("chocolateMilkBowl", WarmWhiteChocolateBowl);
		OreDictionary.registerOre("fuitBits", fruitbits);
		OreDictionary.registerOre("cocoaBeans", rawchocolatelump);
		OreDictionary.registerOre("cocoaBeans", lightchocolatelump);
		OreDictionary.registerOre("lumpChocolate", rawchocolatelump);
		OreDictionary.registerOre("lumpChocolate", lightchocolatelump);
		OreDictionary.registerOre("caramelChunk", caramelChunk);
		OreDictionary.registerOre("caramel", caramelChunk);
		OreDictionary.registerOre("piePan", piePan);
		OreDictionary.registerOre("chocolateFeather", ChocolateFeather);
		OreDictionary.registerOre("chocolateRod", chocolaterod);
		OreDictionary.registerOre("chocolateIngot", new ItemStack(chocolateIngots, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("pieDough", new ItemStack(pieDough, 1, OreDictionary.WILDCARD_VALUE));

	}

}
