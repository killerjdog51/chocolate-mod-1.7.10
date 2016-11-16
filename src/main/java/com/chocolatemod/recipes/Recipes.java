package com.chocolatemod.recipes;

//import growthcraft.core.GrowthCraftCore;
//import growthcraft.core.common.definition.ItemDefinition;

import com.chocolatemod.armor.ArmorRegistry;
import com.chocolatemod.block.BlockRegistry;
import com.chocolatemod.crops.crops;
import com.chocolatemod.food.FoodRegistry;
import com.chocolatemod.item.ItemRegistry;
import com.chocolatemod.item.chocolateItems;
import com.chocolatemod.liquids.LiquidRegistry;
import com.chocolatemod.main.MainRegistry;
import com.chocolatemod.plants.PlantRegistry;
import com.chocolatemod.tools.Tools;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionHelper;

public class Recipes {

	public static void mainRegistry() {
		
if(MainRegistry.EnableBrewing){
			
		}else{
		   //Chocolate Balls
		GameRegistry.addRecipe(new ItemStack(LiquidRegistry.darkChocolateMilkBucket, 1), new Object[]{
			"SCS", "CMC", "SCS", 'M', new ItemStack(LiquidRegistry.chocolateMilkBucket.setContainerItem(Items.bucket)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		});
		GameRegistry.addRecipe(new ItemStack(LiquidRegistry.chocolateMilkBucket, 1), new Object[]{
			"SCS", "CMC", "SCS", 'M', new ItemStack(LiquidRegistry.darkChocolateMilkBucket.setContainerItem(Items.bucket)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.bowlmilk)
		});
		GameRegistry.addRecipe(new ItemStack(LiquidRegistry.lightChocolateMilkBucket, 1), new Object[]{
			"SCS", "CMC", "SCS", 'M', new ItemStack(LiquidRegistry.chocolateMilkBucket.setContainerItem(Items.bucket)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.bowlmilk)
		});
		GameRegistry.addRecipe(new ItemStack(LiquidRegistry.whiteChocolateMilkBucket, 1), new Object[]{
			"SCS", "CMC", "SCS", 'M', new ItemStack(LiquidRegistry.lightChocolateMilkBucket.setContainerItem(Items.bucket)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.bowlmilk)
		});
		GameRegistry.addRecipe(new ItemStack(Items.milk_bucket, 1), new Object[]{
			"SCS", "CMC", "SCS", 'M', new ItemStack(LiquidRegistry.whiteChocolateMilkBucket.setContainerItem(Items.bucket)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.bowlmilk)
		});
		GameRegistry.addRecipe(new ItemStack(LiquidRegistry.whiteChocolateMilkBucket, 1), new Object[]{
			"SCS", "CMC", "SCS", 'M', new ItemStack(Items.milk_bucket.setContainerItem(Items.bucket)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		});
		GameRegistry.addRecipe(new ItemStack(LiquidRegistry.chocolateMilkBucket, 1), new Object[]{
			"SCS", "CMC", "SCS", 'M', new ItemStack(LiquidRegistry.lightChocolateMilkBucket.setContainerItem(Items.bucket)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		});
		GameRegistry.addRecipe(new ItemStack(LiquidRegistry.lightChocolateMilkBucket, 1), new Object[]{
			"SCS", "CMC", "SCS", 'M', new ItemStack(LiquidRegistry.whiteChocolateMilkBucket.setContainerItem(Items.bucket)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.bowldarkchocolatemilk, 1), new Object[]{
			"SCS", "CMC", "SCS", 'M', new ItemStack(ItemRegistry.bowlchocolatemilk.setContainerItem(Items.bowl)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.bowlwhitechocolatemilk, 1), new Object[]{
			"SCS", "CMC", "SCS", 'M', new ItemStack(ItemRegistry.bowlmilk.setContainerItem(Items.bowl)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.bowlchocolatemilk, 1), new Object[]{
			"SCS", "CMC", "SCS", 'M', new ItemStack(ItemRegistry.bowldarkchocolatemilk.setContainerItem(Items.bowl)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.bowlmilk)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.bowllightchocolatemilk, 1), new Object[]{
			"SCS", "CMC", "SCS", 'M', new ItemStack(ItemRegistry.bowlchocolatemilk.setContainerItem(Items.bowl)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.bowlmilk)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.bowlwhitechocolatemilk, 1), new Object[]{
			"SCS", "CMC", "SCS", 'M', new ItemStack(ItemRegistry.bowllightchocolatemilk.setContainerItem(Items.bowl)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.bowlmilk)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.bowlmilk, 1), new Object[]{
			"SCS", "CMC", "SCS", 'M', new ItemStack(ItemRegistry.bowlwhitechocolatemilk.setContainerItem(Items.bowl)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.bowlmilk)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.bowlchocolatemilk, 1), new Object[]{
			"SCS", "CMC", "SCS", 'M', new ItemStack(ItemRegistry.bowllightchocolatemilk.setContainerItem(Items.bowl)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.bowllightchocolatemilk, 1), new Object[]{
			   "SCS", "CMC", "SCS", 'M', new ItemStack(ItemRegistry.bowlwhitechocolatemilk.setContainerItem(Items.bowl)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		});
		}

		//crafting
		GameRegistry.addShapelessRecipe(new ItemStack(FoodRegistry.chocolatesoup, 1), new Object []{
			   new ItemStack(PlantRegistry.chocolatemushroombrown, 1), new ItemStack(PlantRegistry.chocolatemushroomwhite, 1), new ItemStack(Items.bowl, 1)
		});
		
		if(MainRegistry.EnableMolding){
			
		}else {
		   //chocolate Bars
		   
		   GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar1, 2, 0), new Object[]{
			   "CSC", "CMC", "CSC", 'M', new ItemStack(LiquidRegistry.chocolateMilkBucket.setContainerItem(Items.bucket)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		   });
		   GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar1, 2, 1), new Object[]{
			   "CSC", "CMC", "CSC", 'M', new ItemStack(LiquidRegistry.darkChocolateMilkBucket.setContainerItem(Items.bucket)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		   });
		   GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar1, 2, 2), new Object[]{
			   "CSC", "CMC", "CSC", 'M', new ItemStack(LiquidRegistry.lightChocolateMilkBucket.setContainerItem(Items.bucket)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		   });
		   GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar1, 2, 3), new Object[]{
			   "CSC", "CMC", "CSC", 'M', new ItemStack(LiquidRegistry.whiteChocolateMilkBucket.setContainerItem(Items.bucket)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		   });
		   GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar1, 2, 0), new Object[]{
			   "CSC", "CMC", "CSC", 'M', new ItemStack(ItemRegistry.bowlchocolatemilk.setContainerItem(Items.bowl)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		   });
		   GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar1, 2, 1), new Object[]{
			   "CSC", "CMC", "CSC", 'M', new ItemStack(ItemRegistry.bowldarkchocolatemilk.setContainerItem(Items.bowl)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		   });
		   GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar1, 2, 2), new Object[]{
			   "CSC", "CMC", "CSC", 'M', new ItemStack(ItemRegistry.bowllightchocolatemilk.setContainerItem(Items.bowl)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		   });
		   GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar1, 2, 3), new Object[]{
			   "CSC", "CMC", "CSC", 'M', new ItemStack(ItemRegistry.bowlwhitechocolatemilk.setContainerItem(Items.bowl)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		   });
		}
		   GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar2, 1, 0), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar1, 0, 0), 'F', new ItemStack(ItemRegistry.fruitbits)
		   });
		   GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar2, 1, 1), new Object[]{
				  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar1, 1, 1), 'F', new ItemStack(ItemRegistry.fruitbits)
			   });
		   GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar2, 1, 2), new Object[]{
				  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar1, 2, 2), 'F', new ItemStack(ItemRegistry.fruitbits)
			   });
		   GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar2, 1, 3), new Object[]{
				  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar1, 3, 3), 'F', new ItemStack(ItemRegistry.fruitbits)
			   });
		   GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar2, 1, 4), new Object[]{
				  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar1, 0, 0), 'F', new ItemStack(crops.nuts)
			   });
		   GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar2, 1, 5), new Object[]{
				  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar1, 1, 1), 'F', new ItemStack(crops.nuts)
			   });
		   GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar2, 1, 6), new Object[]{
				  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar1, 2, 2), 'F', new ItemStack(crops.nuts)
			   });
		   GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar2, 1, 7), new Object[]{
				  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar1, 3, 3), 'F', new ItemStack(crops.nuts)
			   });
		   GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar2, 1, 8), new Object[]{
				  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar1, 0, 0), 'F', new ItemStack(ItemRegistry.mint)
			   });
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar2, 1, 9), new Object[]{
				  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar1, 1, 1), 'F', new ItemStack(ItemRegistry.mint)
			   });
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar2, 1, 10), new Object[]{
				  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar1, 2, 2), 'F', new ItemStack(ItemRegistry.mint)
			   });
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar2, 1, 11), new Object[]{
				  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar1, 3, 3), 'F', new ItemStack(ItemRegistry.mint)
			   });
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar3, 1, 0), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar2, 0, 0), 'F', new ItemStack(crops.nuts)
		 });
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar3, 1, 1), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar2, 1, 1), 'F', new ItemStack(crops.nuts)
		 });
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar3, 1, 2), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar2, 2, 2), 'F', new ItemStack(crops.nuts)
		 });
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar3, 1, 3), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar2, 3, 3), 'F', new ItemStack(crops.nuts)
		 });
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar3, 1, 0), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar2, 4, 4), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar3, 1, 1), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar2, 5, 5), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar3, 1, 2), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar2, 6, 6), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar3, 1, 3), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar2, 7, 7), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar3, 1, 4), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar2, 8, 8), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar3, 1, 5), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar2, 9, 9), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar3, 1, 6), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar2, 10, 10), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar3, 1, 7), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar2, 11, 11), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar3, 1, 8), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar2, 8, 8), 'F', new ItemStack(crops.nuts)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar3, 1, 9), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar2, 9, 9), 'F', new ItemStack(crops.nuts)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar3, 1, 10), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar2, 10, 10), 'F', new ItemStack(crops.nuts)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar3, 1, 11), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar2, 11, 11), 'F', new ItemStack(crops.nuts)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar4, 1, 0), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar3, 0, 0), 'F', new ItemStack(ItemRegistry.mint)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar4, 1, 1), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar3, 1, 1), 'F', new ItemStack(ItemRegistry.mint)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar4, 1, 2), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar3, 2, 2), 'F', new ItemStack(ItemRegistry.mint)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar4, 1, 3), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar3, 3, 3), 'F', new ItemStack(ItemRegistry.mint)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar4, 1, 0), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar3, 4, 4), 'F', new ItemStack(crops.nuts)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar4, 1, 1), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar3, 5, 5), 'F', new ItemStack(crops.nuts)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar4, 1, 2), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar3, 6, 6), 'F', new ItemStack(crops.nuts)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar4, 1, 3), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar3, 7, 7), 'F', new ItemStack(crops.nuts)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar4, 1, 0), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar3, 8, 8), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar4, 1, 1), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar3, 9, 9), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar4, 1, 2), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar3, 10, 10), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolatebar4, 1, 3), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolatebar3, 11, 11), 'F', new ItemStack(ItemRegistry.fruitbits)
		});

			//Cookies and Cream
		GameRegistry.addShapelessRecipe(new ItemStack(FoodRegistry.cookiesandcreambar, 1), new Object[]{
			new ItemStack(Items.milk_bucket), new ItemStack(Items.cookie), new ItemStack(FoodRegistry.chocolatebar1, 0)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(FoodRegistry.cookiesandcreambar, 1), new Object[]{
			new ItemStack(ItemRegistry.bowlmilk), new ItemStack(Items.cookie), new ItemStack(FoodRegistry.chocolatebar1, 0)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.cookiesandcreamblock, 1), new Object[]{
			   "BBB", "BBB", "BBB", 'B', new ItemStack(FoodRegistry.cookiesandcreambar)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(FoodRegistry.cookiesandcreambar, 9), new Object[]{
			   new ItemStack(BlockRegistry.cookiesandcreamblock)
		});

		if(MainRegistry.EnableMolding){
			
		}else{
		   //Chocolate Balls
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball1, 1, 0), new Object[]{
			   "CSC", "SMS", "CSC", 'M', new ItemStack(LiquidRegistry.chocolateMilkBucket.setContainerItem(Items.bucket)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball1, 1, 1), new Object[]{
			   "CSC", "SMS", "CSC", 'M', new ItemStack(LiquidRegistry.darkChocolateMilkBucket.setContainerItem(Items.bucket)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball1, 1, 2), new Object[]{
			   "CSC", "SMS", "CSC", 'M', new ItemStack(LiquidRegistry.lightChocolateMilkBucket.setContainerItem(Items.bucket)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball1, 1, 3), new Object[]{
			   "CSC", "SMS", "CSC", 'M', new ItemStack(LiquidRegistry.whiteChocolateMilkBucket.setContainerItem(Items.bucket)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball1, 1, 0), new Object[]{
			   "CSC", "SMS", "CSC", 'M', new ItemStack(ItemRegistry.bowlchocolatemilk.setContainerItem(Items.bowl)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball1, 1, 1), new Object[]{
			   "CSC", "SMS", "CSC", 'M', new ItemStack(ItemRegistry.bowldarkchocolatemilk.setContainerItem(Items.bowl)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball1, 1, 2), new Object[]{
			   "CSC", "SMS", "CSC", 'M', new ItemStack(ItemRegistry.bowllightchocolatemilk.setContainerItem(Items.bowl)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball1, 1, 3), new Object[]{
			   "CSC", "SMS", "CSC", 'M', new ItemStack(ItemRegistry.bowlwhitechocolatemilk.setContainerItem(Items.bowl)), 'S', new ItemStack(Items.sugar), 'C', new ItemStack(ItemRegistry.CocoaPowder)
		});
		}
		
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball2, 1, 0), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball1, 0, 0), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball2, 1, 1), new Object[]{
				  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball1, 1, 1), 'F', new ItemStack(ItemRegistry.fruitbits)
			   });
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball2, 1, 2), new Object[]{
				  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball1, 2, 2), 'F', new ItemStack(ItemRegistry.fruitbits)
			   });
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball2, 1, 3), new Object[]{
				  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball1, 3, 3), 'F', new ItemStack(ItemRegistry.fruitbits)
			   });
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball2, 1, 4), new Object[]{
				  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball1, 0, 0), 'F', new ItemStack(crops.nuts)
			   });
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball2, 1, 5), new Object[]{
				  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball1, 1, 1), 'F', new ItemStack(crops.nuts)
			   });
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball2, 1, 6), new Object[]{
				  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball1, 2, 2), 'F', new ItemStack(crops.nuts)
			   });
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball2, 1, 7), new Object[]{
				  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball1, 3, 3), 'F', new ItemStack(crops.nuts)
			   });
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball2, 1, 8), new Object[]{
				  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball1, 0, 0), 'F', new ItemStack(ItemRegistry.mint)
			   });
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball2, 1, 9), new Object[]{
				  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball1, 1, 1), 'F', new ItemStack(ItemRegistry.mint)
			   });
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball2, 1, 10), new Object[]{
				  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball1, 2, 2), 'F', new ItemStack(ItemRegistry.mint)
			   });
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball2, 1, 11), new Object[]{
				  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball1, 3, 3), 'F', new ItemStack(ItemRegistry.mint)
			   });
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball3, 1, 0), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball2, 0, 0), 'F', new ItemStack(crops.nuts)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball3, 1, 1), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball2, 1, 1), 'F', new ItemStack(crops.nuts)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball3, 1, 2), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball2, 2, 2), 'F', new ItemStack(crops.nuts)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball3, 1, 3), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball2, 3, 3), 'F', new ItemStack(crops.nuts)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball3, 1, 0), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball2, 4, 4), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball3, 1, 1), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball2, 5, 5), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball3, 1, 2), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball2, 6, 6), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball3, 1, 3), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball2, 7, 7), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball3, 1, 4), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball2, 8, 8), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball3, 1, 5), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball2, 9, 9), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball3, 1, 6), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball2, 10, 10), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball3, 1, 7), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball2, 11, 11), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball3, 1, 8), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball2, 8, 8), 'F', new ItemStack(crops.nuts)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball3, 1, 9), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball2, 9, 9), 'F', new ItemStack(crops.nuts)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball3, 1, 10), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball2, 10, 10), 'F', new ItemStack(crops.nuts)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball3, 1, 11), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball2, 11, 11), 'F', new ItemStack(crops.nuts)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball4, 1, 0), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball3, 0, 0), 'F', new ItemStack(ItemRegistry.mint)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball4, 1, 1), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball3, 1, 1), 'F', new ItemStack(ItemRegistry.mint)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball4, 1, 2), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball3, 2, 2), 'F', new ItemStack(ItemRegistry.mint)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball4, 1, 3), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball3, 3, 3), 'F', new ItemStack(ItemRegistry.mint)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball4, 1, 0), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball3, 4, 4), 'F', new ItemStack(crops.nuts)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball4, 1, 1), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball3, 5, 5), 'F', new ItemStack(crops.nuts)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball4, 1, 2), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball3, 6, 6), 'F', new ItemStack(crops.nuts)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball4, 1, 3), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball3, 7, 7), 'F', new ItemStack(crops.nuts)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball4, 1, 0), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball3, 8, 8), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball4, 1, 1), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball3, 9, 9), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball4, 1, 2), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball3, 10, 10), 'F', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateball4, 1, 3), new Object[]{
			  "F", "B", 'B', new ItemStack(FoodRegistry.chocolateball3, 11, 11), 'F', new ItemStack(ItemRegistry.fruitbits)
		});


			//Milk Bowls and Buckets
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.bowlmilk, 1), new Object[]{
			"A", "B", 'A', new ItemStack(Items.milk_bucket), 'B', new ItemStack(Items.bowl)
		});
		GameRegistry.addRecipe(new ItemStack(Items.milk_bucket, 1), new Object[]{
			"A", "B", 'A', new ItemStack(ItemRegistry.bowlmilk), 'B', new ItemStack(Items.bucket)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.bowlchocolatemilk, 1), new Object[]{
			"A", "B", 'A', new ItemStack(LiquidRegistry.chocolateMilkBucket), 'B', new ItemStack(Items.bowl)
		});
		GameRegistry.addRecipe(new ItemStack(LiquidRegistry.chocolateMilkBucket, 1), new Object[]{
			"A", "B", 'A', new ItemStack(ItemRegistry.bowlchocolatemilk), 'B', new ItemStack(Items.bucket)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.bowldarkchocolatemilk, 1), new Object[]{
			"A", "B", 'A', new ItemStack(LiquidRegistry.darkChocolateMilkBucket), 'B', new ItemStack(Items.bowl)
		});
		GameRegistry.addRecipe(new ItemStack(LiquidRegistry.darkChocolateMilkBucket, 1), new Object[]{
			"A", "B", 'A', new ItemStack(ItemRegistry.bowldarkchocolatemilk), 'B', new ItemStack(Items.bucket)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.bowllightchocolatemilk, 1), new Object[]{
			"A", "B", 'A', new ItemStack(LiquidRegistry.lightChocolateMilkBucket), 'B', new ItemStack(Items.bowl)
		});
		GameRegistry.addRecipe(new ItemStack(LiquidRegistry.lightChocolateMilkBucket, 1), new Object[]{
			"A", "B", 'A', new ItemStack(ItemRegistry.bowllightchocolatemilk), 'B', new ItemStack(Items.bucket)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.bowlwhitechocolatemilk, 1), new Object[]{
			"A", "B", 'A', new ItemStack(LiquidRegistry.whiteChocolateMilkBucket), 'B', new ItemStack(Items.bowl)
		});
		GameRegistry.addRecipe(new ItemStack(LiquidRegistry.whiteChocolateMilkBucket, 1), new Object[]{
			"A", "B", 'A', new ItemStack(ItemRegistry.bowlwhitechocolatemilk), 'B', new ItemStack(Items.bucket)
		});

			//NonChocolate Food
		if (MainRegistry.EnableNonChocolateFood){
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.ToffeeApple, 1), new Object []{
			" T ", "TAT", " S ", 'T', new ItemStack(FoodRegistry.toffee), 'A', new ItemStack(Items.apple), 'S', new ItemStack(Items.stick)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.rawMintTea, 1), new Object []{
			"M", "B", 'M', new ItemStack(ItemRegistry.mint), 'B', new ItemStack(Items.potionitem, 0, 0)
		});
		}


		   //Chocolate Apples
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateapple, 1, 0), new Object[]{
			"A", "B", 'A', new ItemStack(Items.apple), 'B', new ItemStack(LiquidRegistry.chocolateMilkBucket.setContainerItem(Items.bucket))
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateapple, 1, 1), new Object[]{
			"A", "B", 'A', new ItemStack(Items.apple), 'B', new ItemStack(LiquidRegistry.darkChocolateMilkBucket.setContainerItem(Items.bucket))
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateapple, 1, 2), new Object[]{
			"A", "B", 'A', new ItemStack(Items.apple), 'B', new ItemStack(LiquidRegistry.lightChocolateMilkBucket.setContainerItem(Items.bucket))
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateapple, 1, 3), new Object[]{
			"A", "B", 'A', new ItemStack(Items.apple), 'B', new ItemStack(LiquidRegistry.whiteChocolateMilkBucket.setContainerItem(Items.bucket))
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateapple, 1, 0), new Object[]{
			"A", "B", 'A', new ItemStack(Items.apple), 'B', new ItemStack(ItemRegistry.bowlchocolatemilk.setContainerItem(Items.bowl))
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateapple, 1, 1), new Object[]{
			"A", "B", 'A', new ItemStack(Items.apple), 'B', new ItemStack(ItemRegistry.bowldarkchocolatemilk.setContainerItem(Items.bowl))
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateapple, 1, 2), new Object[]{
			"A", "B", 'A', new ItemStack(Items.apple), 'B', new ItemStack(ItemRegistry.bowllightchocolatemilk.setContainerItem(Items.bowl))
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateapple, 1, 3), new Object[]{
			"A", "B", 'A', new ItemStack(Items.apple), 'B', new ItemStack(ItemRegistry.bowlwhitechocolatemilk.setContainerItem(Items.bowl))
		});


			//Chocolate Strawberries
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateStrawberry, 1, 0), new Object[]{
			"A", "B", 'A', new ItemStack(crops.strawberry), 'B', new ItemStack(LiquidRegistry.chocolateMilkBucket.setContainerItem(Items.bucket))
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateStrawberry, 1, 1), new Object[]{
			"A", "B", 'A', new ItemStack(crops.strawberry), 'B', new ItemStack(LiquidRegistry.darkChocolateMilkBucket.setContainerItem(Items.bucket))
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateStrawberry, 1, 2), new Object[]{
			"A", "B", 'A', new ItemStack(crops.strawberry), 'B', new ItemStack(LiquidRegistry.lightChocolateMilkBucket.setContainerItem(Items.bucket))
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateStrawberry, 1, 3), new Object[]{
			"A", "B", 'A', new ItemStack(crops.strawberry), 'B', new ItemStack(LiquidRegistry.whiteChocolateMilkBucket.setContainerItem(Items.bucket))
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateStrawberry, 1, 0), new Object[]{
			"A", "B", 'A', new ItemStack(crops.strawberry), 'B', new ItemStack(ItemRegistry.bowlchocolatemilk.setContainerItem(Items.bowl))
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateStrawberry, 1, 1), new Object[]{
			"A", "B", 'A', new ItemStack(crops.strawberry), 'B', new ItemStack(ItemRegistry.bowldarkchocolatemilk.setContainerItem(Items.bowl))
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateStrawberry, 1, 2), new Object[]{
			"A", "B", 'A', new ItemStack(crops.strawberry), 'B', new ItemStack(ItemRegistry.bowllightchocolatemilk.setContainerItem(Items.bowl))
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.chocolateStrawberry, 1, 3), new Object[]{
			"A", "B", 'A', new ItemStack(crops.strawberry), 'B', new ItemStack(ItemRegistry.bowlwhitechocolatemilk.setContainerItem(Items.bowl))
		});

			//Golden Chocolate Bars
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.goldchocolatebar1, 1), new Object[]{
			"BBB", "BCB", "BBB", 'B', new ItemStack(Items.gold_nugget), 'C', new ItemStack(FoodRegistry.chocolatebar1, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.goldchocolatebar1, 1), new Object[]{
			"BBB", "BCB", "BBB", 'B', new ItemStack(Items.gold_nugget), 'C', new ItemStack(FoodRegistry.chocolatebar1, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.goldchocolatebar1, 1), new Object[]{
			"BBB", "BCB", "BBB", 'B', new ItemStack(Items.gold_nugget), 'C', new ItemStack(FoodRegistry.chocolatebar1, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.goldchocolatebar1, 1), new Object[]{
			"BBB", "BCB", "BBB", 'B', new ItemStack(Items.gold_nugget), 'C', new ItemStack(FoodRegistry.chocolatebar1, 3, 3)
		});

		GameRegistry.addRecipe(new ItemStack(FoodRegistry.goldchocolatebar2, 1, 0), new Object[]{
			"BBB", "BCB", "BBB", 'B', new ItemStack(Items.gold_ingot), 'C', new ItemStack(FoodRegistry.chocolatebar1, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.goldchocolatebar2, 1, 0), new Object[]{
			"BBB", "BCB", "BBB", 'B', new ItemStack(Items.gold_ingot), 'C', new ItemStack(FoodRegistry.chocolatebar1, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.goldchocolatebar2, 1, 0), new Object[]{
			"BBB", "BCB", "BBB", 'B', new ItemStack(Items.gold_ingot), 'C', new ItemStack(FoodRegistry.chocolatebar1, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.goldchocolatebar2, 1, 0), new Object[]{
			"BBB", "BCB", "BBB", 'B', new ItemStack(Items.gold_ingot), 'C', new ItemStack(FoodRegistry.chocolatebar1, 3, 3)
		});

		GameRegistry.addRecipe(new ItemStack(FoodRegistry.goldchocolatebar2, 1, 1), new Object[]{
			"BBB", "BCB", "BBB", 'B', new ItemStack(Blocks.gold_block), 'C', new ItemStack(FoodRegistry.chocolatebar1, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.goldchocolatebar2, 1, 1), new Object[]{
			"BBB", "BCB", "BBB", 'B', new ItemStack(Blocks.gold_block), 'C', new ItemStack(FoodRegistry.chocolatebar1, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.goldchocolatebar2, 1, 1), new Object[]{
			"BBB", "BCB", "BBB", 'B', new ItemStack(Blocks.gold_block), 'C', new ItemStack(FoodRegistry.chocolatebar1, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.goldchocolatebar2, 1, 1), new Object[]{
			"BBB", "BCB", "BBB", 'B', new ItemStack(Blocks.gold_block), 'C', new ItemStack(FoodRegistry.chocolatebar1, 3, 3)
		});


			//Chocolate Tools
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.chocolaterod, 6), new Object[]{
			"X", "X", 'X', new ItemStack(ItemRegistry.chocolateIngots, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.chocolaterod, 8), new Object[]{
			"X", "X", 'X', new ItemStack(ItemRegistry.chocolateIngots, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.chocolaterod, 4), new Object[]{
			"X", "X", 'X', new ItemStack(ItemRegistry.chocolateIngots, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.chocolaterod, 6), new Object[]{
			"X", "X", 'X', new ItemStack(ItemRegistry.chocolateIngots, 3, 3)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.ChocolateHoe, 1), new Object[]{
			"XX", " #", " #",  'X', new ItemStack(ItemRegistry.chocolateIngots, 0, 0), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.ChocolatePickaxe, 1), new Object[]{
			"XXX", " # ", " # ",  'X', new ItemStack(ItemRegistry.chocolateIngots, 0, 0), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.ChocolateShovel, 1), new Object[]{
			"X", "#", "#",  'X', new ItemStack(ItemRegistry.chocolateIngots, 0, 0), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.ChocolateAxe, 1), new Object[]{
			"XX", "X#", " #",  'X', new ItemStack(ItemRegistry.chocolateIngots, 0, 0), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.ChocolateSword, 1), new Object[]{
			"X", "X", "#",  'X', new ItemStack(ItemRegistry.chocolateIngots, 0, 0), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.DarkChocolateHoe, 1), new Object[]{
			"XX", " #", " #",  'X', new ItemStack(ItemRegistry.chocolateIngots, 1, 1), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.DarkChocolatePickaxe, 1), new Object[]{
			"XXX", " # ", " # ",  'X', new ItemStack(ItemRegistry.chocolateIngots, 1, 1), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.DarkChocolateShovel, 1), new Object[]{
			"X", "#", "#",  'X', new ItemStack(ItemRegistry.chocolateIngots, 1, 1), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.DarkChocolateAxe, 1), new Object[]{
			"XX", "X#", " #",  'X', new ItemStack(ItemRegistry.chocolateIngots, 1, 1), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.DarkChocolateSword, 1), new Object[]{
			"X", "X", "#",  'X', new ItemStack(ItemRegistry.chocolateIngots, 1, 1), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.LightChocolateHoe, 1), new Object[]{
			"XX", " #", " #",  'X', new ItemStack(ItemRegistry.chocolateIngots, 2, 2), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.LightChocolatePickaxe, 1), new Object[]{
			"XXX", " # ", " # ",  'X', new ItemStack(ItemRegistry.chocolateIngots, 2, 2), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.LightChocolateShovel, 1), new Object[]{
			"X", "#", "#",  'X', new ItemStack(ItemRegistry.chocolateIngots, 2, 2), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.LightChocolateAxe, 1), new Object[]{
			"XX", "X#", " #",  'X', new ItemStack(ItemRegistry.chocolateIngots, 2, 2), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.LightChocolateSword, 1), new Object[]{
			"X", "X", "#",  'X', new ItemStack(ItemRegistry.chocolateIngots, 2, 2), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.WhiteChocolateHoe, 1), new Object[]{
			"XX", " #", " #",  'X', new ItemStack(ItemRegistry.chocolateIngots, 3, 3), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.WhiteChocolatePickaxe, 1), new Object[]{
			"XXX", " # ", " # ",  'X', new ItemStack(ItemRegistry.chocolateIngots, 3, 3), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.WhiteChocolateShovel, 1), new Object[]{
			"X", "#", "#",  'X', new ItemStack(ItemRegistry.chocolateIngots, 3, 3), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.WhiteChocolateAxe, 1), new Object[]{
			"XX", "X#", " #",  'X', new ItemStack(ItemRegistry.chocolateIngots, 3, 3), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.WhiteChocolateSword, 1), new Object[]{
			"X", "X", "#",  'X', new ItemStack(ItemRegistry.chocolateIngots, 3, 3), '#', new ItemStack(ItemRegistry.chocolaterod)
		});

		//Paxels
		if (MainRegistry.EnablePaxels){
		GameRegistry.addRecipe(new ItemStack(Tools.ChocolatePaxel, 1), new Object[]{
			"ASP", " # ", " # ", 'A', new ItemStack(Tools.ChocolateAxe), 'S', new ItemStack(Tools.ChocolateShovel), 'P', new ItemStack(Tools.ChocolatePickaxe), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.DarkChocolatePaxel, 1), new Object[]{
			"ASP", " # ", " # ", 'A', new ItemStack(Tools.DarkChocolateAxe), 'S', new ItemStack(Tools.DarkChocolateShovel), 'P', new ItemStack(Tools.DarkChocolatePickaxe), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.LightChocolatePaxel, 1), new Object[]{
			"ASP", " # ", " # ", 'A', new ItemStack(Tools.LightChocolateAxe), 'S', new ItemStack(Tools.LightChocolateShovel), 'P', new ItemStack(Tools.LightChocolatePickaxe), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.WhiteChocolatePaxel, 1), new Object[]{
			"ASP", " # ", " # ", 'A', new ItemStack(Tools.WhiteChocolateAxe), 'S', new ItemStack(Tools.WhiteChocolateShovel), 'P', new ItemStack(Tools.WhiteChocolatePickaxe), '#', new ItemStack(ItemRegistry.chocolaterod)
		});
		}

			//Bows
		if (MainRegistry.EnablePaxels){
		GameRegistry.addRecipe(new ItemStack(Tools.ChocolateBow, 1), new Object []{
			" CS", "C S", " CS", 'C', new ItemStack(ItemRegistry.chocolateIngots, 0, 0), 'S', new ItemStack(Items.string)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.DarkChocolateBow, 1), new Object []{
			" CS", "C S", " CS", 'C', new ItemStack(ItemRegistry.chocolateIngots, 1, 1), 'S', new ItemStack(Items.string)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.LightChocolateBow, 1), new Object []{
			" CS", "C S", " CS", 'C', new ItemStack(ItemRegistry.chocolateIngots, 2, 2), 'S', new ItemStack(Items.string)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.WhiteChocolateBow, 1), new Object []{
			" CS", "C S", " CS", 'C', new ItemStack(ItemRegistry.chocolateIngots, 3, 3), 'S', new ItemStack(Items.string)
		});
		GameRegistry.addRecipe(new ItemStack(Tools.WhiteChocolateBow, 1), new Object []{
			"C", "R", "F", 'C', new ItemStack(ItemRegistry.caramelChunk), 'R', new ItemStack(ItemRegistry.chocolaterod), 'F', new ItemStack(ItemRegistry.ChocolateFeather)
		});
		}

			//Chocolate Armor
		GameRegistry.addRecipe(new ItemStack(ArmorRegistry.ChocolateHelmet,1), new Object[]{
			"TTT","T T",'T', new ItemStack(ItemRegistry.chocolateIngots, 0, 0)
			});
			GameRegistry.addRecipe(new ItemStack(ArmorRegistry.ChocolateChestplate,1), new Object[]{
			"T T","TTT","TTT",'T', new ItemStack(ItemRegistry.chocolateIngots, 0, 0),
			});
			GameRegistry.addRecipe(new ItemStack(ArmorRegistry.ChocolateLeggings,1), new Object[]{
			"TTT","T T","T T",'T', new ItemStack(ItemRegistry.chocolateIngots, 0, 0),
			});
			GameRegistry.addRecipe(new ItemStack(ArmorRegistry.ChocolateBoots,1), new Object[]{
			"T T","T T",'T', new ItemStack(ItemRegistry.chocolateIngots, 0, 0),
			});
			GameRegistry.addRecipe(new ItemStack(ArmorRegistry.DarkChocolateHelmet,1), new Object[]{
				"TTT","T T",'T', new ItemStack(ItemRegistry.chocolateIngots, 1, 1)
				});
				GameRegistry.addRecipe(new ItemStack(ArmorRegistry.DarkChocolateChestplate,1), new Object[]{
				"T T","TTT","TTT",'T', new ItemStack(ItemRegistry.chocolateIngots, 1, 1),
				});
				GameRegistry.addRecipe(new ItemStack(ArmorRegistry.DarkChocolateLeggings,1), new Object[]{
				"TTT","T T","T T",'T', new ItemStack(ItemRegistry.chocolateIngots, 1, 1),
				});
				GameRegistry.addRecipe(new ItemStack(ArmorRegistry.DarkChocolateBoots,1), new Object[]{
				"T T","T T",'T', new ItemStack(ItemRegistry.chocolateIngots, 1, 1),
				});
				GameRegistry.addRecipe(new ItemStack(ArmorRegistry.LightChocolateHelmet,1), new Object[]{
					"TTT","T T",'T', new ItemStack(ItemRegistry.chocolateIngots, 2, 2)
					});
					GameRegistry.addRecipe(new ItemStack(ArmorRegistry.LightChocolateChestplate,1), new Object[]{
					"T T","TTT","TTT",'T', new ItemStack(ItemRegistry.chocolateIngots, 2, 2),
					});
					GameRegistry.addRecipe(new ItemStack(ArmorRegistry.LightChocolateLeggings,1), new Object[]{
					"TTT","T T","T T",'T', new ItemStack(ItemRegistry.chocolateIngots, 2, 2),
					});
					GameRegistry.addRecipe(new ItemStack(ArmorRegistry.LightChocolateBoots,1), new Object[]{
					"T T","T T",'T', new ItemStack(ItemRegistry.chocolateIngots, 2, 2),
					});
					GameRegistry.addRecipe(new ItemStack(ArmorRegistry.WhiteChocolateHelmet,1), new Object[]{
						"TTT","T T",'T', new ItemStack(ItemRegistry.chocolateIngots, 3, 3)
						});
						GameRegistry.addRecipe(new ItemStack(ArmorRegistry.WhiteChocolateChestplate,1), new Object[]{
						"T T","TTT","TTT",'T', new ItemStack(ItemRegistry.chocolateIngots, 3, 3),
						});
						GameRegistry.addRecipe(new ItemStack(ArmorRegistry.WhiteChocolateLeggings,1), new Object[]{
						"TTT","T T","T T",'T', new ItemStack(ItemRegistry.chocolateIngots, 3, 3),
						});
						GameRegistry.addRecipe(new ItemStack(ArmorRegistry.WhiteChocolateBoots,1), new Object[]{
						"T T","T T",'T', new ItemStack(ItemRegistry.chocolateIngots, 3, 3),
						});
			
		   //Chocolate Cake
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.ChocolateCake1, 1), new Object[]{
			"BBB", "SES", "WWW", 'B', new ItemStack(LiquidRegistry.chocolateMilkBucket.setContainerItem(Items.bucket)), 'S', new ItemStack(Items.sugar), 'E', new ItemStack(Items.egg), 'W', new ItemStack(Items.wheat)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.DarkChocolateCake1, 1), new Object[]{
			"BBB", "SES", "WWW", 'B', new ItemStack(LiquidRegistry.darkChocolateMilkBucket.setContainerItem(Items.bucket)), 'S', new ItemStack(Items.sugar), 'E', new ItemStack(Items.egg), 'W', new ItemStack(Items.wheat)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.LightChocolateCake1, 1), new Object[]{
			"BBB", "SES", "WWW", 'B', new ItemStack(LiquidRegistry.lightChocolateMilkBucket.setContainerItem(Items.bucket)), 'S', new ItemStack(Items.sugar), 'E', new ItemStack(Items.egg), 'W', new ItemStack(Items.wheat)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.WhiteChocolateCake1, 1), new Object[]{
			"BBB", "SES", "WWW", 'B', new ItemStack(LiquidRegistry.whiteChocolateMilkBucket.setContainerItem(Items.bucket)), 'S', new ItemStack(Items.sugar), 'E', new ItemStack(Items.egg), 'W', new ItemStack(Items.wheat)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.ChocolateCake1, 1), new Object[]{
			"BBB", "SES", "WWW", 'B', new ItemStack(ItemRegistry.bowlchocolatemilk.setContainerItem(Items.bowl)), 'S', new ItemStack(Items.sugar), 'E', new ItemStack(Items.egg), 'W', new ItemStack(Items.wheat)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.DarkChocolateCake1, 1), new Object[]{
			"BBB", "SES", "WWW", 'B', new ItemStack(ItemRegistry.bowldarkchocolatemilk.setContainerItem(Items.bowl)), 'S', new ItemStack(Items.sugar), 'E', new ItemStack(Items.egg), 'W', new ItemStack(Items.wheat)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.LightChocolateCake1, 1), new Object[]{
			"BBB", "SES", "WWW", 'B', new ItemStack(ItemRegistry.bowllightchocolatemilk.setContainerItem(Items.bowl)), 'S', new ItemStack(Items.sugar), 'E', new ItemStack(Items.egg), 'W', new ItemStack(Items.wheat)
		});
		GameRegistry.addRecipe(new ItemStack(FoodRegistry.WhiteChocolateCake1, 1), new Object[]{
			"BBB", "SES", "WWW", 'B', new ItemStack(ItemRegistry.bowlwhitechocolatemilk.setContainerItem(Items.bowl)), 'S', new ItemStack(Items.sugar), 'E', new ItemStack(Items.egg), 'W', new ItemStack(Items.wheat)
		});

			//Chocolate Pie
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.piePan, 1), new Object []{
			"I I", " I ", 'I', new ItemStack(Blocks.stone)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.pieDough, 2, 0), new Object []{
			" E ", "SWS", "WMW", 'E', new ItemStack(Items.egg), 'S', new ItemStack(Items.sugar), 'W', new ItemStack(Items.wheat), 'M', new ItemStack(Items.milk_bucket)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.pieDough, 2, 1), new Object []{
			" E ", "SWS", "WMW", 'E', new ItemStack(Items.egg), 'S', new ItemStack(Items.sugar), 'W', new ItemStack(Items.wheat), 'M', new ItemStack(LiquidRegistry.chocolateMilkBucket)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.pieDough, 2, 2), new Object []{
			" E ", "SWS", "WMW", 'E', new ItemStack(Items.egg), 'S', new ItemStack(Items.sugar), 'W', new ItemStack(Items.wheat), 'M', new ItemStack(LiquidRegistry.darkChocolateMilkBucket)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.pieDough, 2, 3), new Object []{
			" E ", "SWS", "WMW", 'E', new ItemStack(Items.egg), 'S', new ItemStack(Items.sugar), 'W', new ItemStack(Items.wheat), 'M', new ItemStack(LiquidRegistry.lightChocolateMilkBucket)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.pieDough, 2, 4), new Object []{
			" E ", "SWS", "WMW", 'E', new ItemStack(Items.egg), 'S', new ItemStack(Items.sugar), 'W', new ItemStack(Items.wheat), 'M', new ItemStack(LiquidRegistry.whiteChocolateMilkBucket)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.pieDough, 2, 0), new Object []{
			" E ", "SWS", "WMW", 'E', new ItemStack(Items.egg), 'S', new ItemStack(Items.sugar), 'W', new ItemStack(Items.wheat), 'M', new ItemStack(ItemRegistry.bowlmilk)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.pieDough, 2, 1), new Object []{
			" E ", "SWS", "WMW", 'E', new ItemStack(Items.egg), 'S', new ItemStack(Items.sugar), 'W', new ItemStack(Items.wheat), 'M', new ItemStack(ItemRegistry.bowlchocolatemilk)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.pieDough, 2, 2), new Object []{
			" E ", "SWS", "WMW", 'E', new ItemStack(Items.egg), 'S', new ItemStack(Items.sugar), 'W', new ItemStack(Items.wheat), 'M', new ItemStack(ItemRegistry.bowldarkchocolatemilk)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.pieDough, 2, 3), new Object []{
			" E ", "SWS", "WMW", 'E', new ItemStack(Items.egg), 'S', new ItemStack(Items.sugar), 'W', new ItemStack(Items.wheat), 'M', new ItemStack(ItemRegistry.bowllightchocolatemilk)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.pieDough, 2, 4), new Object []{
			" E ", "SWS", "WMW", 'E', new ItemStack(Items.egg), 'S', new ItemStack(Items.sugar), 'W', new ItemStack(Items.wheat), 'M', new ItemStack(ItemRegistry.bowlwhitechocolatemilk)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.piePotCrust, 1), new Object []{
			"C", "P", 'P', new ItemStack(ItemRegistry.piePan), 'C', new ItemStack(ItemRegistry.pieDough, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.rawChocolatePie, 1, 0), new Object []{
			"C", "M", "P", 'P', new ItemStack(ItemRegistry.piePotCrust), 'C', new ItemStack(ItemRegistry.pieDough, 1, 1), 'M', new ItemStack(LiquidRegistry.chocolateMilkBucket)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.rawChocolatePie, 1, 1), new Object []{
			"C", "M", "P", 'P', new ItemStack(ItemRegistry.piePotCrust), 'C', new ItemStack(ItemRegistry.pieDough, 2, 2), 'M', new ItemStack(LiquidRegistry.darkChocolateMilkBucket)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.rawChocolatePie, 1, 2), new Object []{
			"C", "M", "P", 'P', new ItemStack(ItemRegistry.piePotCrust), 'C', new ItemStack(ItemRegistry.pieDough, 3, 3), 'M', new ItemStack(LiquidRegistry.lightChocolateMilkBucket)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.rawChocolatePie, 1, 3), new Object []{
			"C", "M", "P", 'P', new ItemStack(ItemRegistry.piePotCrust), 'C', new ItemStack(ItemRegistry.pieDough, 4, 4), 'M', new ItemStack(LiquidRegistry.whiteChocolateMilkBucket)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.rawChocolatePie, 1, 0), new Object []{
			"C", "M", "P", 'P', new ItemStack(ItemRegistry.piePotCrust), 'C', new ItemStack(ItemRegistry.pieDough, 1, 1), 'M', new ItemStack(ItemRegistry.bowlchocolatemilk)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.rawChocolatePie, 1, 1), new Object []{
			"C", "M", "P", 'P', new ItemStack(ItemRegistry.piePotCrust), 'C', new ItemStack(ItemRegistry.pieDough, 2, 2), 'M', new ItemStack(ItemRegistry.bowldarkchocolatemilk)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.rawChocolatePie, 1, 2), new Object []{
			"C", "M", "P", 'P', new ItemStack(ItemRegistry.piePotCrust), 'C', new ItemStack(ItemRegistry.pieDough, 3, 3), 'M', new ItemStack(ItemRegistry.bowllightchocolatemilk)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.rawChocolatePie, 1, 3), new Object []{
			"C", "M", "P", 'P', new ItemStack(ItemRegistry.piePotCrust), 'C', new ItemStack(ItemRegistry.pieDough, 4, 4), 'M', new ItemStack(ItemRegistry.bowlwhitechocolatemilk)
		});
		  
		   //Chocolate Bricks
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatebrick, 4, 0), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocolateblock, 4, 4)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatebrick, 4, 1), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocolateblock, 5, 5)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatebrick, 4, 2), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocolateblock, 6, 6)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatebrick, 4, 3), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocolateblock, 7, 7)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatebrick, 1, 4), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.chocolatebricksingle)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatebrick, 1, 5), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.darkchocolatebricksingle)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatebrick, 1, 6), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.lightchocolatebricksingle)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatebrick, 1, 7), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.whitechocolatebricksingle)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.smallchocolatebrick, 4, 0), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocolatebrick, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.smallchocolatebrick, 4, 1), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocolatebrick, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.smallchocolatebrick, 4, 2), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocolatebrick, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.smallchocolatebrick, 4, 3), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocolatebrick, 3, 3)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.smallchocolatebrick, 1, 4), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.smallchocolatebricksingle)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.smallchocolatebrick, 1, 5), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.smalldarkchocolatebricksingle)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.smallchocolatebrick, 1, 6), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.smalllightchocolatebricksingle)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.smallchocolatebrick, 1, 7), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.smallwhitechocolatebricksingle)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatebrick, 4, 0), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocoStone, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatebrick, 4, 1), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocoStone, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatebrick, 4, 2), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocoStone, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatebrick, 4, 3), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocoStone, 3, 3)
		});
		
			//Chocolate Panels
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatepane, 8), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocolateblock, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.darkchocolatepane, 8), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocolateblock, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.lightchocolatepane, 8), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocolateblock, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.whitechocolatepane, 8), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocolateblock, 3, 3)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoGlassPane, 8), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocoGlass, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.darkChocoGlassPane, 8), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocoGlass, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.lightChocoGlassPane, 8), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocoGlass, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.whiteChocoGlassPane, 8), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocoGlass, 3, 3)
		});

			//Sandstone
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoSandstone, 1, 0), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocoSand, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoSandstone, 1, 1), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.whitechocoSmoothSandStoneSlabsingle)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoSandstone, 1, 2), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.whitechocoSandStoneSlabsingle)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoSandstone, 4, 3), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocoSandstone, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoSandstone, 1, 4), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocoSand, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoSandstone, 1, 5), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.darkchocoSmoothSandStoneSlabsingle)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoSandstone, 1, 6), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.darkchocoSandStoneSlabsingle)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoSandstone, 4, 7), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocoSandstone, 4, 4)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoSandstone, 1, 8), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocoSand, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoSandstone, 1, 9), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.lightchocoSmoothSandStoneSlabsingle)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoSandstone, 1, 10), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.lightchocoSandStoneSlabsingle)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoSandstone, 4, 11), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocoSandstone, 8, 8)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoSandstone, 1, 12), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocoSand, 3, 3)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoSandstone, 1, 13), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.chocoSmoothSandStoneSlabsingle)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoSandstone, 1, 14), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.chocoSandStoneSlabsingle)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoSandstone, 4, 15), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocoSandstone, 12, 12)
		});
		
			//Chocolate CobbleStone
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateblock, 4, 0), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocoCobbleStone, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateblock, 4, 1), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocoCobbleStone, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateblock, 4, 2), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocoCobbleStone, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateblock, 4, 3), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.chocoCobbleStone, 3, 3)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.chocoCobbleStone, 1, 5), new Object[]{
			new ItemStack(BlockRegistry.chocoCobbleStone, 0, 0), new ItemStack(ItemRegistry.mint)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.chocoCobbleStone, 1, 4), new Object[]{
			new ItemStack(BlockRegistry.chocoCobbleStone, 1, 1), new ItemStack(ItemRegistry.mint)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.chocoCobbleStone, 1, 6), new Object[]{
			new ItemStack(BlockRegistry.chocoCobbleStone, 2, 2), new ItemStack(ItemRegistry.mint)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.chocoCobbleStone, 1, 7), new Object[]{
			new ItemStack(BlockRegistry.chocoCobbleStone, 3, 3), new ItemStack(ItemRegistry.mint)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.chocoCobbleStone, 1, 9), new Object[]{
			new ItemStack(BlockRegistry.chocoCobbleStone, 0, 0), new ItemStack(PlantRegistry.stringyCaramel)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.chocoCobbleStone, 1, 8), new Object[]{
			new ItemStack(BlockRegistry.chocoCobbleStone, 1, 1), new ItemStack(PlantRegistry.stringyCaramel)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.chocoCobbleStone, 1, 10), new Object[]{
			new ItemStack(BlockRegistry.chocoCobbleStone, 2, 2), new ItemStack(PlantRegistry.stringyCaramel)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.chocoCobbleStone, 1, 11), new Object[]{
			new ItemStack(BlockRegistry.chocoCobbleStone, 3, 3), new ItemStack(PlantRegistry.stringyCaramel)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.chocoCobbleStone, 1, 9), new Object[]{
			new ItemStack(BlockRegistry.chocoCobbleStone, 0, 0), new ItemStack(FoodRegistry.caramel)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.chocoCobbleStone, 1, 8), new Object[]{
			new ItemStack(BlockRegistry.chocoCobbleStone, 1, 1), new ItemStack(FoodRegistry.caramel)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.chocoCobbleStone, 1, 10), new Object[]{
			new ItemStack(BlockRegistry.chocoCobbleStone, 2, 2), new ItemStack(FoodRegistry.caramel)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.chocoCobbleStone, 1, 11), new Object[]{
			new ItemStack(BlockRegistry.chocoCobbleStone, 3, 3), new ItemStack(FoodRegistry.caramel)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.chocoCobbleStone, 1, 9), new Object[]{
			new ItemStack(BlockRegistry.chocoCobbleStone, 0, 0), new ItemStack(FoodRegistry.toffee)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.chocoCobbleStone, 1, 8), new Object[]{
			new ItemStack(BlockRegistry.chocoCobbleStone, 1, 1), new ItemStack(FoodRegistry.toffee)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.chocoCobbleStone, 1, 10), new Object[]{
			new ItemStack(BlockRegistry.chocoCobbleStone, 2, 2), new ItemStack(FoodRegistry.toffee)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.chocoCobbleStone, 1, 11), new Object[]{
			new ItemStack(BlockRegistry.chocoCobbleStone, 3, 3), new ItemStack(FoodRegistry.toffee)
		});
		
		//Misc
		GameRegistry.addShapelessRecipe(new ItemStack(FoodRegistry.caramel, 1), new Object[]{
			new ItemStack(PlantRegistry.stringyCaramel)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.fruitbits, 4), new Object[]{
			new ItemStack(Items.apple)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.fruitbits, 2), new Object[]{
			new ItemStack(crops.strawberry)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.CocoaPowder, 1), new Object[]{
			new ItemStack(Items.dye, 3, 3)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.CocoaPowder, 3), new Object[]{
			new ItemStack(ItemRegistry.lightchocolatelump)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.rawchocolatelump, 7), new Object[]{
			new ItemStack(PlantRegistry.CocoaPod)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(crops.nuts, 1), new Object[]{
			new ItemStack(PlantRegistry.ChocolateGrass)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(crops.mintSeeds, 1), new Object[]{
			new ItemStack(PlantRegistry.MintGrass)
		});
		GameRegistry.addRecipe(new ItemStack(Items.apple, 1), new Object[]{
			"CC", "CC", 'C', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(crops.strawberry, 1), new Object[]{
			"C", "C", 'C', new ItemStack(ItemRegistry.fruitbits)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.ChocolateMould, 1), new Object[]{
			" C ", " C ", "SSS", 'C', new ItemStack(Blocks.cobblestone), 'S', new ItemStack(Blocks.stone)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.ChocolateBallMould, 1), new Object[]{
			"CSC", "S S", "CSC", 'C', new ItemStack(Blocks.cobblestone), 'S', new ItemStack(Blocks.stone)
		});
		
			//Chocolate Doors
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.CocoaDoorItem, 3), new Object[]{
			"BB", "BB", "BB", 'B', new ItemStack(BlockRegistry.CocoaPlanks, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.ChocolateDoorItem, 3), new Object[]{
			"BB", "BB", "BB", 'B', new ItemStack(BlockRegistry.CocoaPlanks, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.DarkChocolateDoorItem, 3), new Object[]{
			"BB", "BB", "BB", 'B', new ItemStack(BlockRegistry.CocoaPlanks, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.LightChocolateDoorItem, 3), new Object[]{
			"BB", "BB", "BB", 'B', new ItemStack(BlockRegistry.CocoaPlanks, 3, 3)
		});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.WhiteChocolateDoorItem, 3), new Object[]{
			"BB", "BB", "BB", 'B', new ItemStack(BlockRegistry.CocoaPlanks, 4, 4)
		});
		
		   //Chocolate Pillars
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatepiller, 2, 0), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.chocolateblock, 4, 4)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatepiller, 2, 1), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.chocolateblock, 5, 5)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatepiller, 2, 2), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.chocolateblock, 6, 6)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatepiller, 2, 3), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.chocolateblock, 7, 7)
		});

		   //Chocolate Chiseled
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatechiseled, 1, 0), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.chocolatesingle)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatechiseled, 1, 1), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.darkchocolatesingle)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatechiseled, 1, 2), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.lightchocolatesingle)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatechiseled, 1, 3), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.whitechocolatesingle)
		});
		
		//Caramel Blocks
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.caramelBlock, 4, 7), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.caramelBlock, 5, 5)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.caramelBlock, 4, 8), new Object[]{
			"CC", "CC", 'C', new ItemStack(BlockRegistry.caramelBlock, 7, 7)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.caramelBlock, 1, 1), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.caramelSlabsingle)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.caramelBlock, 1, 2), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.caramelBlock, 5, 5)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.caramelBlock, 1, 9), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.caramelBrickSlabsingle)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.caramelBlock, 1, 10), new Object[]{
			"C", "C", 'C', new ItemStack(BlockRegistry.caramelSmallBrickSlabsingle)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.caramelBlock, 1, 6),  new Object[]{
			new ItemStack(BlockRegistry.caramelBlock, 5, 5)
		});
		
		   //Chocolate Slabs
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatesingle, 6), new Object[]{
			"BBB", 'B', new ItemStack(BlockRegistry.chocolateblock, 4, 4)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.darkchocolatesingle, 6), new Object[]{
			"BBB", 'B', new ItemStack(BlockRegistry.chocolateblock, 5, 5)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.lightchocolatesingle, 6), new Object[]{
			"BBB", 'B', new ItemStack(BlockRegistry.chocolateblock, 6, 6)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.whitechocolatesingle, 6), new Object[]{
			"BBB", 'B', new ItemStack(BlockRegistry.chocolateblock, 7, 7)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatebricksingle, 6), new Object[]{
			"BBB", 'B', new ItemStack(BlockRegistry.chocolatebrick, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.darkchocolatebricksingle, 6), new Object[]{
			"BBB", 'B', new ItemStack(BlockRegistry.chocolatebrick, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.lightchocolatebricksingle, 6), new Object[]{
			"BBB", 'B', new ItemStack(BlockRegistry.chocolatebrick, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.whitechocolatebricksingle, 6), new Object[]{
			"BBB", 'B', new ItemStack(BlockRegistry.chocolatebrick, 3, 3)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.smallchocolatebricksingle, 6), new Object[]{
			"BBB", 'B', new ItemStack(BlockRegistry.smallchocolatebrick, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.smalldarkchocolatebricksingle, 6), new Object[]{
			"BBB", 'B', new ItemStack(BlockRegistry.smallchocolatebrick, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.smalllightchocolatebricksingle, 6), new Object[]{
			"BBB", 'B', new ItemStack(BlockRegistry.smallchocolatebrick, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.smallwhitechocolatebricksingle, 6), new Object[]{
			"BBB", 'B', new ItemStack(BlockRegistry.smallchocolatebrick, 3, 3)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.caramelSlabsingle, 6), new Object[]{
			"BBB", 'B', new ItemStack(BlockRegistry.caramelBlock, 5, 5)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.caramelBrickSlabsingle, 6), new Object[]{
			"BBB", 'B', new ItemStack(BlockRegistry.caramelBlock, 7, 7)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.caramelSmallBrickSlabsingle, 6), new Object[]{
			"BBB", 'B', new ItemStack(BlockRegistry.caramelBlock, 8, 8)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.CocoaSlabsingle, 6), new Object[]{
			"BBB",'B', new ItemStack(BlockRegistry.CocoaPlanks, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatePlankSlabsingle, 6), new Object[]{
			"BBB",'B', new ItemStack(BlockRegistry.CocoaPlanks, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.darkChocolatePlankSlabsingle, 6), new Object[]{
			"BBB",'B', new ItemStack(BlockRegistry.CocoaPlanks, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.lightChocolatePlankSlabsingle, 6), new Object[]{
			"BBB",'B', new ItemStack(BlockRegistry.CocoaPlanks, 3, 3)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.whiteChocolatePlankSlabsingle, 6), new Object[]{
			"BBB",'B', new ItemStack(BlockRegistry.CocoaPlanks, 4, 4)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoSmoothSandStoneSlabsingle, 6), new Object[]{
			"BBB",'B', new ItemStack(BlockRegistry.chocoSandstone, 15, 15)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoSandStoneSlabsingle, 6), new Object[]{
			"BBB",'B', new ItemStack(BlockRegistry.chocoSandstone, 12, 12)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.lightchocoSmoothSandStoneSlabsingle, 6), new Object[]{
			"BBB",'B', new ItemStack(BlockRegistry.chocoSandstone, 11, 11)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.lightchocoSandStoneSlabsingle, 6), new Object[]{
			"BBB",'B', new ItemStack(BlockRegistry.chocoSandstone, 8, 8)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.darkchocoSmoothSandStoneSlabsingle, 6), new Object[]{
			"BBB",'B', new ItemStack(BlockRegistry.chocoSandstone, 7, 7)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.darkchocoSandStoneSlabsingle, 6), new Object[]{
			"BBB",'B', new ItemStack(BlockRegistry.chocoSandstone, 4, 4)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.whitechocoSmoothSandStoneSlabsingle, 6), new Object[]{
			"BBB",'B', new ItemStack(BlockRegistry.chocoSandstone, 3, 3)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.whitechocoSandStoneSlabsingle, 6), new Object[]{
			"BBB",'B', new ItemStack(BlockRegistry.chocoSandstone, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoCobbleStoneSlabsingle, 6), new Object[]{
			"BBB", 'B', new ItemStack(BlockRegistry.chocoCobbleStone, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.darkchocoCobbleStoneSlabsingle, 6), new Object[]{
			"BBB", 'B', new ItemStack(BlockRegistry.chocoCobbleStone, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.lightchocoCobbleStoneSlabsingle, 6), new Object[]{
			"BBB", 'B', new ItemStack(BlockRegistry.chocoCobbleStone, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.whitechocoCobbleStoneSlabsingle, 6), new Object[]{
			"BBB", 'B', new ItemStack(BlockRegistry.chocoCobbleStone, 3, 3)
		});

			//Etched Blocks
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.chocolateblock, 1, 12), new Object[]{
			new ItemStack(BlockRegistry.chocolateblock, 4, 4)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.chocolateblock, 1, 13), new Object[]{
			new ItemStack(BlockRegistry.chocolateblock, 5, 5)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.chocolateblock, 1, 14), new Object[]{
			new ItemStack(BlockRegistry.chocolateblock, 6, 6)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.chocolateblock, 1, 15), new Object[]{
			new ItemStack(BlockRegistry.chocolateblock, 7, 7)
		});
		
			//Planks
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.CocoaPlanks, 4, 0), new Object[]{
			new ItemStack(PlantRegistry.oldCocoaLog, 0, 0)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.CocoaPlanks, 4, 1), new Object[]{
			new ItemStack(PlantRegistry.CocoaLog, 0, 0)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.CocoaPlanks, 4, 2), new Object[]{
			new ItemStack(PlantRegistry.CocoaLog, 1, 1)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.CocoaPlanks, 4, 3), new Object[]{
			new ItemStack(PlantRegistry.CocoaLog, 2, 2)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.CocoaPlanks, 4, 4), new Object[]{
			new ItemStack(PlantRegistry.CocoaLog, 3, 3)
		});
		
		   //Chocolate Stairs
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatestairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.chocolateblock, 4, 4)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.darkchocolatestairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.chocolateblock, 5, 5)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.lightchocolatestairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.chocolateblock, 6, 6)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.whitechocolatestairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.chocolateblock, 7, 7)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatebrickstairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.chocolatebrick, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.darkchocolatebrickstairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.chocolatebrick, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.lightchocolatebrickstairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.chocolatebrick, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.whitechocolatebrickstairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.chocolatebrick, 3, 3)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.smallchocolatebrickstairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.smallchocolatebrick, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.smalldarkchocolatebrickstairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.smallchocolatebrick, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.smalllightchocolatebrickstairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.smallchocolatebrick, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.smallwhitechocolatebrickstairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.smallchocolatebrick, 3, 3)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.caramelStairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.caramelBlock, 5, 5)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.caramelBrickStairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.caramelBlock, 7, 7)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.caramelSmallBrickStairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.caramelBlock, 8, 8)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.CocoaStairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.CocoaPlanks, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatePlankStairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.CocoaPlanks, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.darkChocolatePlankStairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.CocoaPlanks, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.lightChocolatePlankStairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.CocoaPlanks, 3, 3)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.whiteChocolatePlankStairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.CocoaPlanks, 4, 4)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.ChocoSmoothSandstoneStairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.chocoSandstone, 15, 15)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.ChocoSandstonestairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.chocoSandstone, 12, 12)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.lightChocoSmoothSandstoneStairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.chocoSandstone, 11, 11)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.lightChocoSandstonestairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.chocoSandstone, 8, 8)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.darkChocoSmoothSandstoneStairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.chocoSandstone, 7, 7)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.darkChocoSandstonestairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.chocoSandstone, 4, 4)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.whiteChocoSmoothSandstoneStairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.chocoSandstone, 3, 3)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.whiteChocoSandstonestairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.chocoSandstone, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoCobbleStoneStairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.chocoCobbleStone, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.darkchocoCobbleStoneStairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.chocoCobbleStone, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.lightchocoCobbleStoneStairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.chocoCobbleStone, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.whitechocoCobbleStoneStairs, 4), new Object[]{
			"B  ", "BB ", "BBB", 'B', new ItemStack(BlockRegistry.chocoCobbleStone, 3, 3)
		});

		   //Chocolate Fences
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatefence, 2), new Object[]{
			"BRB", "BRB", 'B', new ItemStack(BlockRegistry.chocolateblock, 4, 4), 'R', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.darkchocolatefence, 2), new Object[]{
			"BRB", "BRB", 'B', new ItemStack(BlockRegistry.chocolateblock, 5, 5), 'R', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.lightchocolatefence, 2), new Object[]{
			"BRB", "BRB", 'B', new ItemStack(BlockRegistry.chocolateblock, 6, 6), 'R', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.whitechocolatefence, 2), new Object[]{
			"BRB", "BRB", 'B', new ItemStack(BlockRegistry.chocolateblock, 7, 7), 'R', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatebrickfence, 2), new Object[]{
			"BRB", "BRB", 'B', new ItemStack(BlockRegistry.chocolatebrick, 0, 0), 'R', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.darkchocolatebrickfence, 2), new Object[]{
			"BRB", "BRB", 'B', new ItemStack(BlockRegistry.chocolatebrick, 1, 1), 'R', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.lightchocolatebrickfence, 2), new Object[]{
			"BRB", "BRB", 'B', new ItemStack(BlockRegistry.chocolatebrick, 2, 2), 'R', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.whitechocolatebrickfence, 2), new Object[]{
			"BRB", "BRB", 'B', new ItemStack(BlockRegistry.chocolatebrick, 3, 3), 'R', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateSmallBrickFence, 6, 0), new Object[]{
			"BRB", "BRB", 'B', new ItemStack(BlockRegistry.smallchocolatebrick, 0, 0), 'R', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.darkChocolateSmallBrickFence, 6, 1), new Object[]{
			"BRB", "BRB", 'B', new ItemStack(BlockRegistry.smallchocolatebrick, 1, 1), 'R', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.lightChocolateSmallBrickFence, 6, 2), new Object[]{
			"BRB", "BRB", 'B', new ItemStack(BlockRegistry.smallchocolatebrick, 2, 2), 'R', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.whiteChocolateSmallBrickFence, 6, 3), new Object[]{
			"BRB", "BRB", 'B', new ItemStack(BlockRegistry.smallchocolatebrick, 3, 3), 'R', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.caramelFence, 6, 0), new Object[]{
			"BRB", "BRB", 'B', new ItemStack(BlockRegistry.caramelBlock, 5, 5), 'R', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.caramelBrickFence, 6, 1), new Object[]{
			"BRB", "BRB", 'B', new ItemStack(BlockRegistry.caramelBlock, 7, 7), 'R', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.caramelSmallBrickFence, 6, 2), new Object[]{
			"BRB", "BRB", 'B', new ItemStack(BlockRegistry.caramelBlock, 8, 8), 'R', new ItemStack(ItemRegistry.chocolaterod)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.cocoaFence, 2), new Object[]{
			"BRB", "BRB", 'B', new ItemStack(BlockRegistry.CocoaPlanks, 0, 0), 'R', new ItemStack(Items.stick)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolatePlankFence, 2), new Object[]{
			"BRB", "BRB", 'B', new ItemStack(BlockRegistry.CocoaPlanks, 1, 1), 'R', new ItemStack(Items.stick)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.darkChocolatePlankFence, 2), new Object[]{
			"BRB", "BRB", 'B', new ItemStack(BlockRegistry.CocoaPlanks, 2, 2), 'R', new ItemStack(Items.stick)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.lightChocolatePlankFence, 2), new Object[]{
			"BRB", "BRB", 'B', new ItemStack(BlockRegistry.CocoaPlanks, 3, 3), 'R', new ItemStack(Items.stick)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.whiteChocolatePlankFence, 2), new Object[]{
			"BRB", "BRB", 'B', new ItemStack(BlockRegistry.CocoaPlanks, 4, 4), 'R', new ItemStack(Items.stick)
		});

			//Chocolate Walls
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateWall, 6, 0), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocolateblock, 4, 4)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateWall, 6, 1), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocolateblock, 5, 5)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateWall, 6, 2), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocolateblock, 6, 6)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateWall, 6, 3), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocolateblock, 7, 7)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateBrickWall, 6, 0), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocolatebrick, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateBrickWall, 6, 1), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocolatebrick, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateBrickWall, 6, 2), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocolatebrick, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateBrickWall, 6, 3), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocolatebrick, 3, 3)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateSmallBrickWall, 6, 0), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.smallchocolatebrick, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateSmallBrickWall, 6, 1), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.smallchocolatebrick, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateSmallBrickWall, 6, 2), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.smallchocolatebrick, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateSmallBrickWall, 6, 3), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.smallchocolatebrick, 3, 3)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.caramelWall, 6, 0), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.caramelBlock, 5, 5)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.caramelWall, 6, 1), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.caramelBlock, 7, 7)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.caramelWall, 6, 2), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.caramelBlock, 8, 8)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoCobbleStoneWall, 6, 4), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocoCobbleStone, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoCobbleStoneWall, 6, 5), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocoCobbleStone, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoCobbleStoneWall, 6, 6), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocoCobbleStone, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoCobbleStoneWall, 6, 7), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocoCobbleStone, 3, 3)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoCobbleStoneWall, 6, 8), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocoCobbleStone, 5, 5)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoCobbleStoneWall, 6, 9), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocoCobbleStone, 4, 4)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoCobbleStoneWall, 6, 10), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocoCobbleStone, 6, 6)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoCobbleStoneWall, 6, 11), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocoCobbleStone, 7, 7)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoCobbleStoneWall, 6, 12), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocoCobbleStone, 9, 9)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoCobbleStoneWall, 6, 13), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocoCobbleStone, 8, 8)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoCobbleStoneWall, 6, 14), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocoCobbleStone, 10, 10)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoCobbleStoneWall, 6, 15), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocoCobbleStone, 11, 11)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoCobbleStoneWall, 6, 0), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocoStone, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoCobbleStoneWall, 6, 1), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocoStone, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoCobbleStoneWall, 6, 2), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocoStone, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocoCobbleStoneWall, 6, 3), new Object[]{
			"BBB", "BBB", 'B', new ItemStack(BlockRegistry.chocoStone, 3, 3)
		});

		   //Chocolate Blocks
		   GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateblock, 1, 0), new Object[]{
			   "BBB", "BBB", "BBB", 'B', new ItemStack(FoodRegistry.chocolatebar1, 0, 0)
		   });
		   GameRegistry.addShapelessRecipe(new ItemStack(FoodRegistry.chocolatebar1, 9, 0), new Object[]{
			   new ItemStack(BlockRegistry.chocolateblock, 0, 0)
		   });
		   GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateblock, 1, 1), new Object[]{
			   "BBB", "BBB", "BBB", 'B', new ItemStack(FoodRegistry.chocolatebar1, 1, 1)
		   });
		   GameRegistry.addShapelessRecipe(new ItemStack(FoodRegistry.chocolatebar1, 9, 1), new Object[]{
			   new ItemStack(BlockRegistry.chocolateblock, 0, 1)
		   });
		   GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateblock, 1, 2), new Object[]{
			   "BBB", "BBB", "BBB", 'B', new ItemStack(FoodRegistry.chocolatebar1, 2, 2)
		   });
		   GameRegistry.addShapelessRecipe(new ItemStack(FoodRegistry.chocolatebar1, 9, 2), new Object[]{
			   new ItemStack(BlockRegistry.chocolateblock, 2, 2)
		   });
		   GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateblock, 1, 3), new Object[]{
			   "BBB", "BBB", "BBB", 'B', new ItemStack(FoodRegistry.chocolatebar1, 3, 3)
		   });
		   GameRegistry.addShapelessRecipe(new ItemStack(FoodRegistry.chocolatebar1, 9, 3), new Object[]{
			   new ItemStack(BlockRegistry.chocolateblock, 3, 3)
		   });
		   GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateblock, 1, 8), new Object[]{
			   "BBB", "BBB", "BBB", 'B', new ItemStack(FoodRegistry.chocolatebar2, 4, 4)
		   });
		   GameRegistry.addShapelessRecipe(new ItemStack(FoodRegistry.chocolatebar2, 9, 4), new Object[]{
			   new ItemStack(BlockRegistry.chocolateblock, 8, 8)
		   });
		   GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateblock, 1, 9), new Object[]{
			   "BBB", "BBB", "BBB", 'B', new ItemStack(FoodRegistry.chocolatebar2, 5, 5)
		   });
		   GameRegistry.addShapelessRecipe(new ItemStack(FoodRegistry.chocolatebar2, 9, 5), new Object[]{
			   new ItemStack(BlockRegistry.chocolateblock, 9, 9)
		   });
		   GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateblock, 1, 10), new Object[]{
			   "BBB", "BBB", "BBB", 'B', new ItemStack(FoodRegistry.chocolatebar2, 6, 6)
		   });
		   GameRegistry.addShapelessRecipe(new ItemStack(FoodRegistry.chocolatebar2, 9, 6), new Object[]{
			   new ItemStack(BlockRegistry.chocolateblock, 10, 10)
		   });
		   GameRegistry.addRecipe(new ItemStack(BlockRegistry.chocolateblock, 1, 11), new Object[]{
			   "BBB", "BBB", "BBB", 'B', new ItemStack(FoodRegistry.chocolatebar2, 7, 7)
		   });
		   GameRegistry.addShapelessRecipe(new ItemStack(FoodRegistry.chocolatebar2, 9, 7), new Object[]{
			   new ItemStack(BlockRegistry.chocolateblock, 11, 11)
		   });
		   GameRegistry.addRecipe(new ItemStack(BlockRegistry.fruitychocolateblock, 1, 0), new Object[]{
			   "BBB", "BBB", "BBB", 'B', new ItemStack(FoodRegistry.chocolatebar2, 0, 0)
		   });
		   GameRegistry.addShapelessRecipe(new ItemStack(FoodRegistry.chocolatebar2, 9, 0), new Object[]{
			   new ItemStack(BlockRegistry.fruitychocolateblock, 0, 0)
		   });
		   GameRegistry.addRecipe(new ItemStack(BlockRegistry.goldchocolateblock, 1), new Object[]{
			   "BBB", "BBB", "BBB", 'B', new ItemStack(FoodRegistry.goldchocolatebar1)
		   });
		   GameRegistry.addShapelessRecipe(new ItemStack(FoodRegistry.goldchocolatebar1, 9), new Object[]{
			   new ItemStack(BlockRegistry.goldchocolateblock)
		   });
		   GameRegistry.addRecipe(new ItemStack(BlockRegistry.caramelBlock, 1, 0), new Object[]{
			   "BBB", "BBB", "BBB", 'B', new ItemStack(FoodRegistry.caramel)
		   });
		   GameRegistry.addRecipe(new ItemStack(BlockRegistry.caramelBlock, 1, 5), new Object[]{
			   "BBB", "BBB", "BBB", 'B', new ItemStack(ItemRegistry.caramelChunk)
		   });
		   
		   
		   //Smelting
		   
		   ItemStack ChocolateBlock = new ItemStack(BlockRegistry.chocolateblock);
		   ItemStack DarkChocolateBlock = new ItemStack(BlockRegistry.chocolateblock);
		   ItemStack LightChocolateBlock = new ItemStack(BlockRegistry.chocolateblock);
		   ItemStack WhiteChocolateBlock = new ItemStack(BlockRegistry.chocolateblock);
		   ItemStack HardChocolateBlock = new ItemStack(BlockRegistry.chocolateblock);
		   ItemStack HardDarkChocolateBlock = new ItemStack(BlockRegistry.chocolateblock);
		   ItemStack HardLightChocolateBlock = new ItemStack(BlockRegistry.chocolateblock);
		   ItemStack HardWhiteChocolateBlock = new ItemStack(BlockRegistry.chocolateblock);

		   ChocolateBlock.setItemDamage(0);
		   DarkChocolateBlock.setItemDamage(1);
		   LightChocolateBlock.setItemDamage(2);
		   WhiteChocolateBlock.setItemDamage(3);
		   HardChocolateBlock.setItemDamage(4);
		   HardDarkChocolateBlock.setItemDamage(5);
		   HardLightChocolateBlock.setItemDamage(6);
		   HardWhiteChocolateBlock.setItemDamage(7);

		   ItemStack ChocolateOre = new ItemStack(BlockRegistry.chocolateOres);
		   ItemStack DarkChocolateOre = new ItemStack(BlockRegistry.chocolateOres);
		   ItemStack LightChocolateOre = new ItemStack(BlockRegistry.chocolateOres);
		   ItemStack WhiteChocolateOre = new ItemStack(BlockRegistry.chocolateOres);
		   ItemStack ChocolateIngot = new ItemStack(ItemRegistry.chocolateIngots);
		   ItemStack DarkChocolateIngot = new ItemStack(ItemRegistry.chocolateIngots);
		   ItemStack LightChocolateIngot = new ItemStack(ItemRegistry.chocolateIngots);
		   ItemStack WhiteChocolateIngot = new ItemStack(ItemRegistry.chocolateIngots);

		   ChocolateOre.setItemDamage(0);
		   DarkChocolateOre.setItemDamage(1);
		   LightChocolateOre.setItemDamage(2);
		   WhiteChocolateOre.setItemDamage(3);
		   ChocolateIngot.setItemDamage(0);
		   DarkChocolateIngot.setItemDamage(1);
		   LightChocolateIngot.setItemDamage(2);
		   WhiteChocolateIngot.setItemDamage(3);

		   ItemStack RawChocolatePie = new ItemStack(ItemRegistry.rawChocolatePie);
		   ItemStack RawDarkChocolatePie = new ItemStack(ItemRegistry.rawChocolatePie);
		   ItemStack RawLightChocolatePie = new ItemStack(ItemRegistry.rawChocolatePie);
		   ItemStack RawWhiteChocolatePie = new ItemStack(ItemRegistry.rawChocolatePie);

		   RawChocolatePie.setItemDamage(0);
		   RawDarkChocolatePie.setItemDamage(1);
		   RawLightChocolatePie.setItemDamage(2);
		   RawWhiteChocolatePie.setItemDamage(3);
		   
		   ItemStack CaramelBlock = new ItemStack(BlockRegistry.caramelBlock);
		   ItemStack HardCaramelBlock = new ItemStack(BlockRegistry.caramelBlock);
		   
		   CaramelBlock.setItemDamage(0);
		   HardCaramelBlock.setItemDamage(5);
		   
		   ItemStack ChocolateSand = new ItemStack(BlockRegistry.chocoSand);
		   ItemStack DarkChocolateSand = new ItemStack(BlockRegistry.chocoSand);
		   ItemStack LightChocolateSand = new ItemStack(BlockRegistry.chocoSand);
		   ItemStack WhiteChocolateSand = new ItemStack(BlockRegistry.chocoSand);
		   ItemStack ChocolateGlass = new ItemStack(BlockRegistry.chocoGlass);
		   ItemStack DarkChocolateGlass = new ItemStack(BlockRegistry.chocoGlass);
		   ItemStack LightChocolateGlass = new ItemStack(BlockRegistry.chocoGlass);
		   ItemStack WhiteChocolateGlass = new ItemStack(BlockRegistry.chocoGlass);

		   ChocolateSand.setItemDamage(0);
		   DarkChocolateSand.setItemDamage(1);
		   LightChocolateSand.setItemDamage(2);
		   WhiteChocolateSand.setItemDamage(3);
		   
		   ChocolateGlass.setItemDamage(3);
		   DarkChocolateGlass.setItemDamage(1);
		   LightChocolateGlass.setItemDamage(2);
		   WhiteChocolateGlass.setItemDamage(0);
		   
		   ItemStack ChocolateStone = new ItemStack(BlockRegistry.chocoStone);
		   ItemStack DarkChocolateStone = new ItemStack(BlockRegistry.chocoStone);
		   ItemStack LightChocolateStone = new ItemStack(BlockRegistry.chocoStone);
		   ItemStack WhiteChocolateStone = new ItemStack(BlockRegistry.chocoStone);
		   ItemStack ChocolateCobbleStone = new ItemStack(BlockRegistry.chocoCobbleStone);
		   ItemStack DarkChocolateCobbleStone = new ItemStack(BlockRegistry.chocoCobbleStone);
		   ItemStack LightChocolateCobbleStone = new ItemStack(BlockRegistry.chocoCobbleStone);
		   ItemStack WhiteChocolateCobbleStone = new ItemStack(BlockRegistry.chocoCobbleStone);

		   ChocolateStone.setItemDamage(1);
		   DarkChocolateStone.setItemDamage(0);
		   LightChocolateStone.setItemDamage(2);
		   WhiteChocolateStone.setItemDamage(3);
		   ChocolateCobbleStone.setItemDamage(0);
		   DarkChocolateCobbleStone.setItemDamage(1);
		   LightChocolateCobbleStone.setItemDamage(2);
		   WhiteChocolateCobbleStone.setItemDamage(3);

		   ItemStack ChocolateBar = new ItemStack(FoodRegistry.chocolatebar1);
		   ItemStack DarkChocolateBar = new ItemStack(FoodRegistry.chocolatebar1);
		   ItemStack LightChocolateBar = new ItemStack(FoodRegistry.chocolatebar1);
		   ItemStack WhiteChocolateBar = new ItemStack(FoodRegistry.chocolatebar1);

		   ChocolateBar.setItemDamage(0);
		   DarkChocolateBar.setItemDamage(1);
		   LightChocolateBar.setItemDamage(2);
		   WhiteChocolateBar.setItemDamage(3);

		   FurnaceRecipes.smelting().func_151396_a(ItemRegistry.rawchocolatelump, new ItemStack(ItemRegistry.lightchocolatelump), 0.35F);
		   FurnaceRecipes.smelting().func_151396_a(FoodRegistry.caramel, new ItemStack(ItemRegistry.caramelChunk), 0.35F);
		   FurnaceRecipes.smelting().func_151396_a(ItemRegistry.bowlchocolatemilk, new ItemStack(ItemRegistry.WarmChocolateBowl), 1.5F);
		   FurnaceRecipes.smelting().func_151396_a(ItemRegistry.bowldarkchocolatemilk, new ItemStack(ItemRegistry.WarmDarkChocolateBowl), 1.5F);
		   FurnaceRecipes.smelting().func_151396_a(ItemRegistry.bowllightchocolatemilk, new ItemStack(ItemRegistry.WarmLightChocolateBowl), 1.5F);
		   FurnaceRecipes.smelting().func_151396_a(ItemRegistry.bowlwhitechocolatemilk, new ItemStack(ItemRegistry.WarmWhiteChocolateBowl), 1.5F);
		   FurnaceRecipes.smelting().func_151394_a(ChocolateBlock, HardChocolateBlock, 1.0f);
		   FurnaceRecipes.smelting().func_151394_a(DarkChocolateBlock, HardDarkChocolateBlock, 1.0f);
		   FurnaceRecipes.smelting().func_151394_a(LightChocolateBlock, HardLightChocolateBlock, 1.0f);
		   FurnaceRecipes.smelting().func_151394_a(WhiteChocolateBlock, HardWhiteChocolateBlock, 1.0f);
		   FurnaceRecipes.smelting().func_151394_a(ChocolateOre, ChocolateIngot, 1.0f);
		   FurnaceRecipes.smelting().func_151394_a(DarkChocolateOre, DarkChocolateIngot, 1.0f);
		   FurnaceRecipes.smelting().func_151394_a(LightChocolateOre, LightChocolateIngot, 1.0f);
		   FurnaceRecipes.smelting().func_151394_a(WhiteChocolateOre, WhiteChocolateIngot, 1.0f);
		   FurnaceRecipes.smelting().func_151394_a(RawChocolatePie, new ItemStack(FoodRegistry.chocolatePie1), 2.0f);
		   FurnaceRecipes.smelting().func_151394_a(RawDarkChocolatePie, new ItemStack(FoodRegistry.darkChocolatePie1), 2.0f);
		   FurnaceRecipes.smelting().func_151394_a(RawLightChocolatePie, new ItemStack(FoodRegistry.lightChocolatePie1), 2.0f);
		   FurnaceRecipes.smelting().func_151394_a(RawWhiteChocolatePie, new ItemStack(FoodRegistry.whiteChocolatePie1), 2.0f);
		   FurnaceRecipes.smelting().func_151394_a(CaramelBlock, HardCaramelBlock, 1.0F);
		   FurnaceRecipes.smelting().func_151394_a(ChocolateSand, ChocolateGlass, 1.0F);
		   FurnaceRecipes.smelting().func_151394_a(DarkChocolateSand, DarkChocolateGlass, 1.0F);
		   FurnaceRecipes.smelting().func_151394_a(LightChocolateSand, LightChocolateGlass, 1.0F);
		   FurnaceRecipes.smelting().func_151394_a(WhiteChocolateSand, WhiteChocolateGlass, 1.0F);
		   FurnaceRecipes.smelting().func_151394_a(ChocolateCobbleStone, ChocolateStone, 1.0F);
		   FurnaceRecipes.smelting().func_151394_a(DarkChocolateCobbleStone, DarkChocolateStone, 1.0F);
		   FurnaceRecipes.smelting().func_151394_a(LightChocolateCobbleStone, LightChocolateStone, 1.0F);
		   FurnaceRecipes.smelting().func_151394_a(WhiteChocolateCobbleStone, WhiteChocolateStone, 1.0F);
		   FurnaceRecipes.smelting().func_151394_a(ChocolateBar, ChocolateIngot, 1.0f);
		   FurnaceRecipes.smelting().func_151394_a(DarkChocolateBar, DarkChocolateIngot, 1.0f);
		   FurnaceRecipes.smelting().func_151394_a(LightChocolateBar, LightChocolateIngot, 1.0f);
		   FurnaceRecipes.smelting().func_151394_a(WhiteChocolateBar, WhiteChocolateIngot, 1.0f);
		   
		   if (MainRegistry.EnableNonChocolateFood){
			FurnaceRecipes.smelting().func_151396_a(Items.sugar, new ItemStack(FoodRegistry.caramel), 1.0f);
			FurnaceRecipes.smelting().func_151396_a(FoodRegistry.rawMintTea, new ItemStack(FoodRegistry.mintTea), 1.0f);
			FurnaceRecipes.smelting().func_151396_a(crops.nuts, new ItemStack(FoodRegistry.roastedNuts), 1.0F);
		   }
			
			
			
			
		}
	}
