package com.chocolatemod.worldgen;

import java.util.Random;

import net.minecraft.world.World;

public class StructureChocolateMineshaftStart extends ChocolateStructureStart
{
    private static final String __OBFID = "CL_00000450";

    public StructureChocolateMineshaftStart() {}

    public StructureChocolateMineshaftStart(World world, Random rand, int ChunkX, int ChunkZ)
    {
        super(ChunkX, ChunkZ);
        StructureChocolateMineshaftPieces.Room room = new StructureChocolateMineshaftPieces.Room(3, rand, (ChunkX << 4) + 2, (ChunkZ << 4) + 2);
        this.components.add(room);
        room.buildComponent(room, this.components, rand);
        System.out.println("My Mineshaft structure generated at " + ChunkX + "/" + ChunkZ + " coordinates");
        this.updateBoundingBox();
        this.markAvailableHeight(world, rand, 10);
    }
}