package com.chocolatemod.food;

import com.chocolatemod.block.BlockRegistry;
import com.chocolatemod.item.chocolateItems;
import com.chocolatemod.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionHelper;
import net.minecraftforge.oredict.OreDictionary;

public class FoodRegistry {

	public static void mainRegistry() {
		initialiseItem();
		registerItem();
	}

	public static Item chocolatebar1;
	public static Item chocolatebar2;
	public static Item chocolatebar3;
	public static Item chocolatebar4;
	public static Item chocolateapple;
	public static Item cookiesandcreambar;
	public static Item chocolateball1;
	public static Item chocolateball2;
	public static Item chocolateball3;
	public static Item chocolateball4;
	public static Item chocolateegg;
	public static Item chocolatesoup;
	public static Item darkchocolatenutbar;
	public static Item lightchocolatenutbar;
	public static Item whitechocolatenutbar;
	public static Item strawberry;
	public static Item chocolateStrawberry;
	public static Item goldchocolatebar1;
	public static Item goldchocolatebar2;
	public static Item ToffeeApple;
	public static Item mintTea;
	public static Item toffee;
	public static Item rawMintTea;
	public static Item caramel;
	public static Item caramelApple;
	public static Item roastedNuts;

	//Cake
	public static Item ChocolateCake1;
	public static Item DarkChocolateCake1;
	public static Item LightChocolateCake1;
	public static Item WhiteChocolateCake1;
	public static Item ExtraDarkChocolateCake1;

	//Pie
	public static Item chocolatePie1;
	public static Item darkChocolatePie1;
	public static Item lightChocolatePie1;
	public static Item whiteChocolatePie1;
	public static Item ExtraDarkChocolatePie1;

	public static void initialiseItem() {
		chocolatebar1 = new chocolatebar(4, 0.2F, false).setUnlocalizedName("chocolatebar").setTextureName("killerjdog51:chocolatebar");
		chocolatebar2 = new chocolatebar2(6, 0.3F, false).setUnlocalizedName("fruitychocolatebar").setTextureName("killerjdog51:chocolatebar");
		chocolatebar3 = new chocolatebar3(8, 0.4F, false).setUnlocalizedName("mintychocolatebar").setTextureName("killerjdog51:chocolatebar");
		chocolatebar4 = new chocolatebar4(10, 0.5F, false).setUnlocalizedName("chocolatenutbar").setTextureName("killerjdog51:chocolatebar");
		chocolateapple = new chocolateapple(6, 0.2F, false).setUnlocalizedName("chocolateApple").setTextureName("killerjdog51:chocolateApple");
		cookiesandcreambar = new chocolateFood(6, 0.3F, false).setUnlocalizedName("cookiesandcreambar").setTextureName("killerjdog51:cookiesandcreambar");
		chocolateegg = new chocolateFood(4, 0.2F, false).setUnlocalizedName("chocolateegg").setTextureName("killerjdog51:chocolateegg");
		chocolatesoup = new chocolatesoup(6, 0.5F, false).setUnlocalizedName("chocolatesoup");
		chocolateStrawberry = new chocolatestrawberry(4, 0.4F, false).setUnlocalizedName("chocolateStrawberry").setTextureName("killerjdog51:chocolateStrawberry");
		chocolateball1 = new chocolateball(2, 0.3F, false).setUnlocalizedName("chocolateball").setTextureName("killerjdog51:chocolateball");
		chocolateball2 = new chocolateball2(4, 0.4F, false).setUnlocalizedName("fruitychocolateball").setTextureName("killerjdog51:chocolateball");
		chocolateball3 = new chocolateball3(6, 0.5F, false).setUnlocalizedName("mintychocolateball").setTextureName("killerjdog51:chocolateball");
		chocolateball4 = new chocolateball4(8, 0.6F, false).setUnlocalizedName("chocolatenutball").setTextureName("killerjdog51:chocolateball");
		goldchocolatebar1 = (new goldchocolatebar(8, 1.5F, false)).setUnlocalizedName("goldchocolatebar").setPotionEffect(PotionHelper.goldenCarrotEffect);
		goldchocolatebar2 = (new ItemChocolateBarGold(8, 1.5F, false)).setAlwaysEdible().setPotionEffect(Potion.regeneration.id, 5, 1, 1.0F).setUnlocalizedName("supergoldchocolatebar").setTextureName("killerjdog51:goldchocolatebar");

		//Cake
		ChocolateCake1 = (new chocolatecake(BlockRegistry.ChocolateCake)).setMaxStackSize(1).setUnlocalizedName("chocolatecake").setCreativeTab(MainRegistry.tabChocolateFood);
		DarkChocolateCake1 = (new darkchocolatecake(BlockRegistry.DarkChocolateCake)).setMaxStackSize(1).setUnlocalizedName("darkchocolatecake").setCreativeTab(MainRegistry.tabChocolateFood);
		LightChocolateCake1 = (new lightchocolatecake(BlockRegistry.LightChocolateCake)).setMaxStackSize(1).setUnlocalizedName(MainRegistry.EnableMilkChocolate ? "milkchocolatecake" : "lightchocolatecake").setCreativeTab(MainRegistry.tabChocolateFood);
		WhiteChocolateCake1 = (new whitechocolatecake(BlockRegistry.WhiteChocolateCake)).setMaxStackSize(1).setUnlocalizedName("whitechocolatecake").setCreativeTab(MainRegistry.tabChocolateFood);
		ExtraDarkChocolateCake1 = (new extradarkchocolatecake(BlockRegistry.ExtraDarkChocolateCake)).setMaxStackSize(1).setUnlocalizedName("extradarkchocolatecake").setCreativeTab(MainRegistry.tabChocolateFood);

		//Pie
		chocolatePie1 = (new chocolatePie(BlockRegistry.chocolatePie)).setMaxStackSize(1).setUnlocalizedName("chocolatepie").setCreativeTab(MainRegistry.tabChocolateFood);
		darkChocolatePie1 = (new darkChocolatePie(BlockRegistry.darkChocolatePie)).setMaxStackSize(1).setUnlocalizedName("darkchocolatepie").setCreativeTab(MainRegistry.tabChocolateFood);
		lightChocolatePie1 = (new lightChocolatePie(BlockRegistry.lightChocolatePie)).setMaxStackSize(1).setUnlocalizedName(MainRegistry.EnableMilkChocolate ? "milkchocolatepie" : "lightchocolatepie").setCreativeTab(MainRegistry.tabChocolateFood);
		whiteChocolatePie1 = (new whiteChocolatePie(BlockRegistry.whiteChocolatePie)).setMaxStackSize(1).setUnlocalizedName("whitechocolatepie").setCreativeTab(MainRegistry.tabChocolateFood);
		ExtraDarkChocolatePie1 = (new extraDarkChocolatePie(BlockRegistry.ExtraDarkChocolatePie)).setMaxStackSize(1).setUnlocalizedName("extradarkchocolatepie").setCreativeTab(MainRegistry.tabChocolateFood);

		if (MainRegistry.EnableNonChocolateFood){

		//NonChocolate Food
		toffee = new chocolateItems().setUnlocalizedName("toffee").setCreativeTab(MainRegistry.tabChocolateMisc).setTextureName("killerjdog51:toffee");
		ToffeeApple = new ToffeeApple(4, 0.2F, false).setUnlocalizedName("ToffeeApple").setCreativeTab(MainRegistry.tabChocolateFood).setTextureName("killerjdog51:toffeeApple");
		rawMintTea = new chocolateItems().setUnlocalizedName("rawMintTea").setCreativeTab(MainRegistry.tabChocolateMisc).setTextureName("killerjdog51:rawMintTea");
		mintTea = new mintTea(3, false).setUnlocalizedName("mintTea").setCreativeTab(MainRegistry.tabChocolateFood).setTextureName("killerjdog51:mintTea");
		caramel = new chocolateFood(2, 0.1F, false).setUnlocalizedName("caramel").setCreativeTab(MainRegistry.tabChocolateMisc).setTextureName("killerjdog51:caramel");
		caramelApple = new ToffeeApple(6, 0.3F, false).setUnlocalizedName("caramelApple").setCreativeTab(MainRegistry.tabChocolateFood).setTextureName("killerjdog51:caramelApple");
		roastedNuts = new chocolateFood(4, 0.5F, false).setUnlocalizedName("roastedNuts").setCreativeTab(MainRegistry.tabChocolateFood).setTextureName("killerjdog51:cookednuts");
		}

	}

	public static void registerItem() {

		GameRegistry.registerItem(FoodRegistry.chocolatebar1, chocolatebar1.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolatebar2, chocolatebar2.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolatebar3, chocolatebar3.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolatebar4, chocolatebar4.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolateapple, chocolateapple.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.cookiesandcreambar, cookiesandcreambar.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolateegg, chocolateegg.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolatesoup, chocolatesoup.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolateStrawberry, chocolateStrawberry.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolateball1, chocolateball1.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolateball2, chocolateball2.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolateball3, chocolateball3.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolateball4, chocolateball4.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.goldchocolatebar1, goldchocolatebar1.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.goldchocolatebar2, goldchocolatebar2.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.ChocolateCake1, ChocolateCake1.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.DarkChocolateCake1, DarkChocolateCake1.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.LightChocolateCake1, LightChocolateCake1.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.WhiteChocolateCake1, WhiteChocolateCake1.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolatePie1, chocolatePie1.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.darkChocolatePie1, darkChocolatePie1.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.lightChocolatePie1, lightChocolatePie1.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.whiteChocolatePie1, whiteChocolatePie1.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.ExtraDarkChocolateCake1, ExtraDarkChocolateCake1.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.ExtraDarkChocolatePie1, ExtraDarkChocolatePie1.getUnlocalizedName());

		if (MainRegistry.EnableNonChocolateFood){

		GameRegistry.registerItem(FoodRegistry.toffee, toffee.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.ToffeeApple, ToffeeApple.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.rawMintTea, rawMintTea.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.mintTea, mintTea.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.caramel, caramel.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.caramelApple, caramelApple.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.roastedNuts, roastedNuts.getUnlocalizedName());

		//Ore Dictionary
		
		OreDictionary.registerOre("foodChocolatebar", new ItemStack(chocolatebar1, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("foodChocolatestrawberry", new ItemStack(chocolateStrawberry, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("foodChocolateapple", new ItemStack(chocolateapple, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("foodChocolateball", new ItemStack(chocolateball1, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("foodCookies&Creambar", cookiesandcreambar);
		OreDictionary.registerOre("foodChocolatesoup", chocolatesoup);
		OreDictionary.registerOre("foodChocolateegg", chocolateegg);
		OreDictionary.registerOre("foodCaramel", caramel);
		OreDictionary.registerOre("foodCaramelapple", caramelApple);
		OreDictionary.registerOre("foodMinttea", mintTea);
		OreDictionary.registerOre("foodRoastednuts", roastedNuts);
		OreDictionary.registerOre("foodChocolatecake", ChocolateCake1);
		OreDictionary.registerOre("foodChocolatecake", DarkChocolateCake1);
		OreDictionary.registerOre("foodChocolatecake", LightChocolateCake1);
		OreDictionary.registerOre("foodChocolatecake", WhiteChocolateCake1);
		OreDictionary.registerOre("foodChocolatesprinklecake", ChocolateCake1);
		OreDictionary.registerOre("foodChocolatesprinklecake", DarkChocolateCake1);
		OreDictionary.registerOre("foodChocolatesprinklecake", LightChocolateCake1);
		OreDictionary.registerOre("foodChocolatesprinklecake", WhiteChocolateCake1);
		OreDictionary.registerOre("foodChocolatepie", chocolatePie1);
		OreDictionary.registerOre("foodChocolatepie", darkChocolatePie1);
		OreDictionary.registerOre("foodChocolatepie", lightChocolatePie1);
		OreDictionary.registerOre("foodChocolatepie", whiteChocolatePie1);

		//Chocolate Specific
		OreDictionary.registerOre("chocolateBar", new ItemStack(chocolatebar1, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("chocolateStrawberry", new ItemStack(chocolateStrawberry, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("chocolateApple", new ItemStack(chocolateapple, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("chocolateBall", new ItemStack(chocolateball1, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("cookies&Creambar", cookiesandcreambar);
		OreDictionary.registerOre("chocolateSoup", chocolatesoup);
		OreDictionary.registerOre("chocolateEgg", chocolateegg);
		OreDictionary.registerOre("caramel", caramel);
		OreDictionary.registerOre("caramelApple", caramelApple);
		OreDictionary.registerOre("toffee", toffee);
		OreDictionary.registerOre("toffeeApple", ToffeeApple);
		OreDictionary.registerOre("mintTea", mintTea);
		OreDictionary.registerOre("rawMintTea", rawMintTea);
		OreDictionary.registerOre("roastedNut", roastedNuts);
		OreDictionary.registerOre("goldChocolateBar", goldchocolatebar1);
		OreDictionary.registerOre("chocolateCake", ChocolateCake1);
		OreDictionary.registerOre("chocolateCake", DarkChocolateCake1);
		OreDictionary.registerOre("chocolateCake", LightChocolateCake1);
		OreDictionary.registerOre("ChocolateCake", WhiteChocolateCake1);
		OreDictionary.registerOre("ChocolatePie", chocolatePie1);
		OreDictionary.registerOre("ChocolatePie", darkChocolatePie1);
		OreDictionary.registerOre("ChocolatePie", lightChocolatePie1);
		OreDictionary.registerOre("ChocolatePie", whiteChocolatePie1);
		}

	}

}
