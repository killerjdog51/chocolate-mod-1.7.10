package com.chocolatemod.worldgen;

import com.chocolatemod.main.MainRegistry;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.DimensionManager;

public class WorldProviderChocolateTest extends WorldProvider {
	public void registerWorldChunkManager() {
/** tells Minecraft to use our new WorldChunkManager **/
		this.worldChunkMgr = new WorldChunkMangerChocolateTest(worldObj.getSeed(), terrainType);
		this.hasNoSky = false;
	}

	@Override
/** Dimension Name **/
	public String getDimensionName() {
		return "Chocolate";
	}

	/**
	 * Get Provider for dimension
	 **/
	public static WorldProvider getProviderForDimension(int id) {
		return DimensionManager.createProviderFor(MainRegistry.DimID);
	}

	/**
	 * Welcome message
	 **/
	public String getWelcomeMessage() {
		return "Entering the Chocolate Dimension";
	}

	/**
	 * What chunk provider to use
	 **/
	public IChunkProvider createChunkGenerator() {
		return new ChunkProviderChocolateTest(worldObj, worldObj.getSeed(), true);
	}

	/**
	 * Can player re-spawn here
	 **/
	public boolean canRespawnHere() {
		return false;
	}

	/**
	 * Set user message
	 **/
// not sure if this works any more ?
	protected synchronized String setUserMessage(String par1Str) {
		return "Building Chocolate Dimension";
	}

	/**
	 * Determines the dimension the player will be respawned in
	 **/
	public int getRespawnDimension(EntityPlayerMP player) {
		return 0;
	}

	/**
	 * Dimension Movement speed
	 **/
	public double getMovementFactor() {
		return 10.0;
	}
}
