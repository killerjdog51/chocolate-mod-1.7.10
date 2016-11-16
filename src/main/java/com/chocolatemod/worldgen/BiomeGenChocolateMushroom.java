package com.chocolatemod.worldgen;

import com.chocolatemod.mobs.EntityAlbinoMooshroom;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenChocolateMushroom extends BiomeGenChocolateBase {
	private static final String __OBFID = "CL_00000177";


	public BiomeGenChocolateMushroom(int par1) {
		super(par1);

		this.theChocolateBiomeDecorator.treesPerChunk = -999;
		this.theChocolateBiomeDecorator.flowersPerChunk = -999;
		this.theChocolateBiomeDecorator.grassPerChunk = -999;
		this.theChocolateBiomeDecorator.mushroomsPerChunk = 5;
		this.theChocolateBiomeDecorator.bigMushroomsPerChunk = 2;
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityAlbinoMooshroom.class, 8, 4, 8));
	}
}