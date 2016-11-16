package com.chocolatemod.worldgen;

import java.util.Random;

import com.chocolatemod.block.BlockRegistry;
import com.chocolatemod.mobs.Entitycocoacow;
import com.chocolatemod.mobs.Entitydarkcocoacow;
import com.chocolatemod.mobs.Entitylightcocoacow;
import com.chocolatemod.mobs.Entitywhitecocoacow;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenChocolateMountian extends BiomeGenChocolateBase {
	private WorldGenerator theWorldGenerator;
	    private int field_150636_aF;
	    private int field_150637_aG;
	    private int field_150638_aH;

	    private BiomeDecoratorChocolate customChocolateBiomeDecorator;
		
		@Override
		public BiomeDecorator createBiomeDecorator(){
			return getModdedBiomeDecorator(new BiomeDecoratorChocolate(this));
		}
	protected BiomeGenChocolateMountian(int par1) {
		super(par1);

		this.theBiomeDecorator = new BiomeDecoratorChocolate(this);
		this.customChocolateBiomeDecorator = (BiomeDecoratorChocolate)theBiomeDecorator;
		this.topBlock = BlockRegistry.chocoGrass;
		this.fillerBlock = BlockRegistry.chocoDirt;
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.add(new SpawnListEntry(Entitycocoacow.class, 6, 4, 6));
		this.spawnableCreatureList.add(new SpawnListEntry(Entitydarkcocoacow.class, 6, 4, 6));
		this.spawnableCreatureList.add(new SpawnListEntry(Entitylightcocoacow.class, 6, 4, 6));
		this.spawnableCreatureList.add(new SpawnListEntry(Entitywhitecocoacow.class, 6, 4, 6));

		this.customChocolateBiomeDecorator.nutsPerChunk = 15;

		 System.out.println("grass = " + BlockRegistry.chocoGrass + ", dirt = " + BlockRegistry.chocoDirt);

        this.field_150636_aF = 1;
        this.field_150637_aG = 2;
        this.field_150638_aH = 0;

	}
	 public void genTerrainBlocks(World p_150573_1_, Random p_150573_2_, Block[] p_150573_3_, byte[] p_150573_4_, int p_150573_5_, int p_150573_6_, double p_150573_7_)
	    {
		 super.genTerrainBlocks(p_150573_1_, p_150573_2_, p_150573_3_, p_150573_4_, p_150573_5_, p_150573_6_, p_150573_7_);
		 
	        this.topBlock = BlockRegistry.chocoGrass;
	        this.field_150604_aj = 0;
	        this.fillerBlock = BlockRegistry.chocoDirt;

	        if ((p_150573_7_ < -1.0D || p_150573_7_ > 2.0D) && this.field_150638_aH == this.field_150637_aG)
	        {
	            this.topBlock = BlockRegistry.chocolateOres;
	            this.fillerBlock = BlockRegistry.chocolateOres;
	        }
	        else if (p_150573_7_ > 1.0D && this.field_150638_aH != this.field_150636_aF)
	        {
	            this.topBlock = BlockRegistry.chocoStone;
	            this.fillerBlock = BlockRegistry.chocoStone;
	        }

	        super.genBiomeTerrain(p_150573_1_, p_150573_2_, p_150573_3_, p_150573_4_, p_150573_5_, p_150573_6_, p_150573_7_);
	    }

}


