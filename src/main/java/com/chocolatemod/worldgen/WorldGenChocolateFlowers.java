package com.chocolatemod.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenChocolateFlowers extends WorldGenerator
{
    private Block flower;
    private int meta;

    public WorldGenChocolateFlowers(Block flower, int metadata)
    {
        this.flower = flower;
        this.meta = metadata;
    }
    
    public void SpawnFlowers(Block flower, int metadata)
    {
        this.flower = flower;
        this.meta = metadata;
    }
@Override
    public boolean generate(World world, Random rand, int i, int j, int k)
    {
        for (int var6 = 0; var6 < 128; ++var6)
        {
            int var7 = i + rand.nextInt(8) - rand.nextInt(4);
            int var8 = j + rand.nextInt(4) - rand.nextInt(4);
            int var9 = k + rand.nextInt(8) - rand.nextInt(4);

            if (world.isAirBlock(var7, var8, var9) && (!world.provider.hasNoSky || var8 < 255) && this.flower.canBlockStay(world, var7, var8, var9))
            {
                world.setBlock(var7, var8, var9, this.flower, this.meta, 2);
            }
        }

        return true;
    }
}