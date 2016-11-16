package com.chocolatemod.worldgen;

import java.util.Random;

import cpw.mods.fml.common.eventhandler.Event.*;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.NoiseGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.*;
import net.minecraftforge.event.terraingen.InitMapGenEvent.EventType;
import net.minecraftforge.event.terraingen.InitNoiseGensEvent;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.SaplingGrowTreeEvent;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent.*;
import net.minecraftforge.event.terraingen.OreGenEvent.*;
import net.minecraftforge.event.terraingen.PopulateChunkEvent.*;

public abstract class ChocolateTerrainGen
{
    public static NoiseGenerator[] getModdedNoiseGenerators(World world, Random rand, NoiseGenerator[] original)
    {
        InitNoiseGensEvent event = new InitNoiseGensEvent(world, rand, original);
        MinecraftForge.TERRAIN_GEN_BUS.post(event);
        return event.newNoiseGens;
    }

    public static MapGenChocolateBase getModdedMapGen(MapGenChocolateBase original, InitChocolateMapGenEvent.EventType type)
    {
        InitChocolateMapGenEvent event = new InitChocolateMapGenEvent(type, original);
        MinecraftForge.TERRAIN_GEN_BUS.post(event);
        return event.newGen;
    }
    
    public static boolean populate(IChunkProvider chunkProvider, World world, Random rand, int chunkX, int chunkZ, boolean hasVillageGenerated, Populate.EventType type)
    {
        PopulateChunkEvent.Populate event = new PopulateChunkEvent.Populate(chunkProvider, world, rand, chunkX, chunkZ, hasVillageGenerated, type);
        MinecraftForge.TERRAIN_GEN_BUS.post(event);
        return event.getResult() != Result.DENY;
    }
    
    public static boolean decorate(World world, Random rand, int chunkX, int chunkZ, Decorate.EventType type)
    {
        Decorate event = new Decorate(world, rand, chunkX, chunkZ, type);
        MinecraftForge.TERRAIN_GEN_BUS.post(event);
        return event.getResult() != Result.DENY;
    }
    
    public static boolean generateOre(World world, Random rand, WorldGenerator generator, int worldX, int worldZ, GenerateMinable.EventType type)
    {
        GenerateMinable event = new GenerateMinable(world, rand, generator, worldX, worldZ, type);
        MinecraftForge.ORE_GEN_BUS.post(event);
        return event.getResult() != Result.DENY;
    }
    
    public static boolean saplingGrowTree(World world, Random rand, int x, int y, int z)
    {
        SaplingGrowTreeEvent event = new SaplingGrowTreeEvent(world, rand, x, y, z);
        MinecraftForge.TERRAIN_GEN_BUS.post(event);
        return event.getResult() != Result.DENY;
    }

	public static MapGenChocolateVillage getModdedMapGen(
			MapGenChocolateVillage chocolateVillageGenerator, EventType village) {
		// TODO Auto-generated method stub
		return null;
	}
}