package com.chocolatemod.worldgen;

import com.chocolatemod.block.BlockRegistry;
import com.chocolatemod.crops.crops;
import com.chocolatemod.liquids.LiquidRegistry;
import com.chocolatemod.main.MainRegistry;
import com.chocolatemod.mobs.*;
import com.chocolatemod.plants.BlockChocolateFlower;
import com.chocolatemod.plants.PlantRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.init.Blocks;
import net.minecraft.util.WeightedRandom;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBase.FlowerEntry;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BiomeGenChocolateBase extends BiomeGenBase {


	public static BiomeGenBase chocolateForest;
	public static BiomeGenBase chocolateMountians;
	public static BiomeGenBase chocolateMushroom;
	public static BiomeGenBase chocolatePlains;
	public static BiomeGenBase chocolateSwamp;
	public static BiomeGenBase chocolateJungle;
	public static BiomeGenBase chocolateRiver;
	public static BiomeGenBase chocolateOcean;
	public static BiomeGenBase chocolateDesert;

	
    public BiomeDecorator theChocolateBiomeDecorator;

	/**
	 * The tree generator.
	 */
	protected WorldGenCocoaTree worldGeneratorCocoaTrees;
	protected WorldGenChocolateTree worldGeneratorChocolateTrees;
	protected WorldGenDarkChocolateTree worldGeneratorDarkChocolateTrees;
	protected WorldGenLightChocolateTree worldGeneratorLightChocolateTrees;
	protected WorldGenWhiteChocolateTree worldGeneratorWhiteChocolateTrees;
	/**
	 * The big tree generator.
	 */
	protected WorldGenMegaCocoa worldGeneratorBigChocolateTree;
	/**
	 * The swamp tree generator.
	 */
	protected WorldGenChocolateSwamp worldGeneratorChocolateSwamp;

	public BiomeGenChocolateBase(int biomeID) {
		super(biomeID);

		this.worldGeneratorCocoaTrees = new WorldGenCocoaTree(false);
		this.worldGeneratorChocolateTrees = new WorldGenChocolateTree(false, false);
		this.worldGeneratorDarkChocolateTrees = new WorldGenDarkChocolateTree(false);
		this.worldGeneratorLightChocolateTrees = new WorldGenLightChocolateTree(false, false);
		this.worldGeneratorWhiteChocolateTrees = new WorldGenWhiteChocolateTree(false);
		this.worldGeneratorBigChocolateTree = new WorldGenMegaCocoa(false, 10, 20, 0, 0);
		this.worldGeneratorChocolateSwamp = new WorldGenChocolateSwamp();
		this.theChocolateBiomeDecorator = new BiomeDecoratorChocolate(this);
		this.topBlock = BlockRegistry.chocoGrass;
		this.fillerBlock = BlockRegistry.chocoDirt;
		this.field_76754_C = 5169201;
		this.rootHeight = height_Default.rootHeight;
		this.heightVariation = height_Default.variation;
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList = new ArrayList();
		this.spawnableCreatureList = new ArrayList();
		this.spawnableWaterCreatureList = new ArrayList();
		this.spawnableCaveCreatureList = new ArrayList();
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntitySheep.class, 12, 4, 4));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(Entitychocolatepig.class, 10, 4, 4));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(Entitydarkchocolatepig.class, 10, 4, 4));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(Entitylightchocolatepig.class, 10, 4, 4));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(Entitywhitechocolatepig.class, 10, 4, 4));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(Entitychocolatechicken.class, 10, 4, 4));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(Entitycocoacow.class, 8, 4, 4));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(Entitydarkcocoacow.class, 8, 4, 4));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(Entitylightcocoacow.class, 8, 4, 4));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(Entitywhitecocoacow.class, 8, 4, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntitySpider.class, 100, 4, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityZombie.class, 100, 4, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntitySkeleton.class, 100, 4, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityCreeper.class, 100, 4, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(Entitychocolateglob.class, 100, 4, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(Entitydarkchocolateglob.class, 100, 4, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(Entitylightchocolateglob.class, 100, 4, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(Entitywhitechocolateglob.class, 100, 4, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityEnderman.class, 10, 1, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityWitch.class, 5, 1, 1));
		this.spawnableWaterCreatureList.add(new BiomeGenBase.SpawnListEntry(EntitySquid.class, 10, 4, 4));
		this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityBat.class, 10, 8, 8));
		this.addDefaultChocolateFlowers();
		
	}
	static {
		chocolatePlains = new BiomeGenChocolatePlains(MainRegistry.ChocolatePlainsID).setBiomeName("Chocolate Plains").setColor(5470985);
		chocolateForest = new BiomeGenChocolateForest(MainRegistry.ChocolateForestID, 0).setBiomeName("Chocolate Forest").setColor(5470985);
		chocolateMountians = new BiomeGenChocolateMountian(MainRegistry.ChocolateMountainsID).setBiomeName("Chocolate Mountians").setColor(5470985).setHeight(height_MidHills);
		chocolateMushroom = new BiomeGenChocolateMushroom(MainRegistry.ChocolateMushroomsID).setBiomeName("Chocolate Mushrooms").setColor(5470985);
		chocolateSwamp = new BiomeGenChocolateSwamp(MainRegistry.ChocolateSwampID).setBiomeName("Chocolate Swamp").setColor(5470985).setHeight(height_PartiallySubmerged);
		chocolateJungle = new BiomeGenChocolateJungle(MainRegistry.ChocolateJungleID).setBiomeName("Chocolate Jungle").setColor(5470985);
		chocolateRiver = new BiomeGenChocolateRiver(MainRegistry.ChocolateRiverID).setBiomeName("Chocolate River").setColor(5470985).setHeight(height_ShallowWaters);
		chocolateOcean = new BiomeGenChocolateOcean(MainRegistry.ChocolateOceanID).setBiomeName("Chocolate Ocean").setColor(5470985).setHeight(height_Oceans);
		chocolateDesert = (new BiomeGenChocolateDesert(MainRegistry.ChocolateDesertID)).setColor(16421912).setBiomeName("Chocolate Desert").setDisableRain().setTemperatureRainfall(2.0F, 0.0F).setHeight(height_LowPlains);

	}
	@Override
	public BiomeDecorator createBiomeDecorator() {
		return new BiomeDecoratorChocolate(this);
		
	}
	
	@Override
	public void decorate(World world, Random random, int chunkx, int chunkz)
    {
		super.decorate(world, random, chunkx, chunkz);
		 int x = chunkx + random.nextInt(16);
	        int y = random.nextInt(128) + 4;
	        int z = chunkz + random.nextInt(16);
	        
        this.theChocolateBiomeDecorator.decorateChunk(world, random, this, chunkx, chunkz);


      
    }
	@Override
	public WorldGenAbstractTree func_150567_a(Random p_150567_1_) {
		return (WorldGenAbstractTree) (p_150567_1_.nextInt(10) == 0 ? this.worldGeneratorCocoaTrees : this.worldGeneratorChocolateTrees);
	}
@Override
	public WorldGenerator getRandomWorldGenForGrass(Random random) {
		if (random.nextInt(1) == 0)
			return new WorldGenTallGrass(PlantRegistry.ChocolateGrass, 0);
		else
			return new WorldGenTallGrass(PlantRegistry.MintGrass, 0);
	}

	public static void registerWithBiomeDictionary() {
		BiomeDictionary.registerBiomeType(chocolateForest, Type.FOREST);
		BiomeDictionary.registerBiomeType(chocolateMountians, Type.MOUNTAIN);
		BiomeDictionary.registerBiomeType(chocolateMushroom, Type.MUSHROOM);
		BiomeDictionary.registerBiomeType(chocolatePlains, Type.PLAINS);
		BiomeDictionary.registerBiomeType(chocolateSwamp, Type.SWAMP);
		BiomeDictionary.registerBiomeType(chocolateJungle, Type.JUNGLE);
		BiomeDictionary.registerBiomeType(chocolateRiver, Type.RIVER);
		BiomeDictionary.registerBiomeType(chocolateOcean, Type.OCEAN);
		BiomeDictionary.registerAllBiomes();
	}

	/**
	 * Replaces custom Stone to allow top/filler blocks to work in dimension.
	 *
	 * @param world
	 * @param random
	 * @param replacableBlock
	 * @param aByte
	 * @param par5
	 * @param par6
	 * @param par7
	 */
	@Override
	public void genTerrainBlocks(World world, Random random, Block[] replacableBlock, byte[] aByte, int par5, int par6, double par7) {
		Block block = this.topBlock;
		byte b0 = (byte) (this.field_150604_aj & 255);
		Block block1 = this.fillerBlock;
		int k = -1;
		int l = (int) (par7 / 3.0D + 3.0D + random.nextDouble() * 0.25D);
		int i1 = par5 & 15;
		int j1 = par6 & 15;
		int k1 = replacableBlock.length / 256;

		for (int l1 = 255; l1 >= 0; --l1) {
			int i2 = (j1 * 16 + i1) * k1 + l1;

			if (l1 <= 0 + random.nextInt(5)) {
				replacableBlock[i2] = Blocks.bedrock;
			} else {
				Block block2 = replacableBlock[i2];

				if (block2 != null && block2.getMaterial() != Material.air) {
					if (block2 == BlockRegistry.chocoStone) {
						if (k == -1) {
							if (l <= 0) {
								block = null;
								b0 = 0;
								block1 = BlockRegistry.chocoStone;
							} else if (l1 >= 59 && l1 <= 64) {
								block = this.topBlock;
								b0 = (byte) (this.field_150604_aj & 255);
								block1 = this.fillerBlock;
							}

							if (l1 < 63 && (block == null || block.getMaterial() == Material.air)) {
								if (this.getFloatTemperature(par5, l1, par6) < 0.15F) {
									block = Blocks.ice;
									b0 = 0;
								} else {
									block = LiquidRegistry.chocolateMilkBlock;
									b0 = 0;
								}
							}

							k = l;

							if (l1 >= 62) {
								replacableBlock[i2] = block;
								aByte[i2] = b0;
							} else if (l1 < 56 - l) {
								block = null;
								block1 = BlockRegistry.chocoStone;
								replacableBlock[i2] = Blocks.gravel;
							} else {
								replacableBlock[i2] = block1;
							}
						} else if (k > 0) {
							--k;
							replacableBlock[i2] = block1;

							if (k == 0 && block1 == BlockRegistry.chocoSand) {
								k = random.nextInt(4) + Math.max(0, l1 - 63);
								block1 = BlockRegistry.chocoSandstone;
							}
						}
					}
				} else {
					k = -1;
				}
			}
		}
	}
	
	protected List<FlowerEntry> flowers = new ArrayList<FlowerEntry>();
	
	 public static class FlowerEntry extends WeightedRandom.Item
	    {
	        public final Block block;
	        public final int metadata;
	        public FlowerEntry(Block block, int meta, int weight)
	        {
	            super(weight);
	            this.block = block;
	            this.metadata = meta;
	        }
	    }
	 
	 public void addDefaultChocolateFlowers()
	    {
	        this.flowers.add(new FlowerEntry(PlantRegistry.chocolateflower1, 0, 10));
	        this.flowers.add(new FlowerEntry(PlantRegistry.chocolateflower2, 0, 20));
	        this.flowers.add(new FlowerEntry(PlantRegistry.chocolateflower2, 1, 30));
	        this.flowers.add(new FlowerEntry(PlantRegistry.chocolateflower2, 2, 40));
	        this.flowers.add(new FlowerEntry(PlantRegistry.chocolateflower2, 3, 50));
	        this.flowers.add(new FlowerEntry(PlantRegistry.chocolateflower2, 4, 60));
	        this.flowers.add(new FlowerEntry(PlantRegistry.chocolateflower2, 5, 70));
	        this.flowers.add(new FlowerEntry(PlantRegistry.chocolateflower2, 6, 80));
	        this.flowers.add(new FlowerEntry(PlantRegistry.chocolateflower2, 7, 90));
	        this.flowers.add(new FlowerEntry(PlantRegistry.chocolateflower2, 8, 100));
	        this.flowers.add(new FlowerEntry(PlantRegistry.chocolateflower2, 9, 110));
	        this.flowers.add(new FlowerEntry(PlantRegistry.chocolateflower2, 10, 120));
	        this.flowers.add(new FlowerEntry(PlantRegistry.chocolateflower2, 11, 130));
	        this.flowers.add(new FlowerEntry(PlantRegistry.chocolateflower2, 12, 140));
	        this.flowers.add(new FlowerEntry(PlantRegistry.chocolateflower2, 13, 150));

	    }
	 
	 public void addFlower(Block block, int metadata, int weight)
	    {
	        this.flowers.add(new FlowerEntry(block, metadata, weight));
	    }

	    public void plantFlower(World world, Random rand, int x, int y, int z)
	    {
	        BiomeGenBase biome = world.getBiomeGenForCoords(x, z);
	        String flowername = biome.func_150572_a(rand, x, y, z);
	        
	        FlowerEntry flower = (FlowerEntry)WeightedRandom.getRandomItem(rand, flowers);
	        if (flower == null || flower.block == null || !flower.block.canBlockStay(world, x, y, z))
	        {
	            return;
	        }

	        world.setBlock(x, y, z, flower.block, flower.metadata, 3);
	    }
}

