package com.chocolatemod.worldgen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.chocolatemod.mobs.Entitychocolateninja;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class MapGenChocolateBridge extends MapGenChocolateStructure
{
    public static List BridgeSpawnBiomes = Arrays.asList(new BiomeGenBase[] {BiomeGenChocolateBase.chocolateMountians, BiomeGenChocolateBase.chocolateJungle});
	
    private List spawnList = new ArrayList();
    private static final String __OBFID = "CL_00000451";

    public MapGenChocolateBridge()
    {
        this.spawnList.add(new BiomeGenBase.SpawnListEntry(Entitychocolateninja.class, 10, 5, 5));
       
    }

    public String func_143025_a()
    {
        return "Chocolate Fortress";
    }

    public List getSpawnList()
    {
        return this.spawnList;
    }

    protected boolean canSpawnStructureAtCoords(int ChunkX, int ChunkZ)
    {
    	 int k = ChunkX;
         int l = ChunkZ;

         if (ChunkX < 0)
         {
             ChunkX -= 32 - 1;
         }

         if (ChunkZ < 0)
         {
             ChunkZ -= 32 - 1;
         }

         int i1 = ChunkX / 32;
         int j1 = ChunkZ / 32;
         Random random = this.worldObj.setRandomSeed(i1, j1, 10387312);
         i1 *= 32;
         j1 *= 32;
         i1 += random.nextInt(32 - 8);
         j1 += random.nextInt(32 - 8);

         if (k == i1 && l == j1)
         {
             boolean flag = this.worldObj.getWorldChunkManager().areBiomesViable(k * 16 + 8, l * 16 + 8, 0, BridgeSpawnBiomes);

             if (flag)
             {
                 return true;
             }
         }

         return false;
     }
    protected ChocolateStructureStart getStructureStart(int ChunkX, int ChunkZ)
    {
        return new MapGenChocolateBridge.Start(this.worldObj, this.rand, ChunkX, ChunkZ);
    }

    public static class Start extends ChocolateStructureStart
        {
            private static final String __OBFID = "CL_00000452";

            public Start() {}

            public Start(World p_i2040_1_, Random p_i2040_2_, int ChunkX, int ChunkZ)
            {
                super(ChunkX, ChunkZ);
                StructureChocolateBridgePieces.Start start = new StructureChocolateBridgePieces.Start(p_i2040_2_, (ChunkX << 4) + 2, (ChunkZ << 4) + 2);
                this.components.add(start);
                start.buildComponent(start, this.components, p_i2040_2_);
                ArrayList arraylist = start.field_74967_d;

                while (!arraylist.isEmpty())
                {
                    int k = p_i2040_2_.nextInt(arraylist.size());
                    ChocolateStructureComponent structurecomponent = (ChocolateStructureComponent)arraylist.remove(k);
                    structurecomponent.buildComponent(start, this.components, p_i2040_2_);
                    System.out.println("My Bridge structure generated at " + ChunkX + "/" + ChunkZ + " coordinates");
 }

                this.updateBoundingBox();
                this.setRandomHeight(p_i2040_1_, p_i2040_2_, 60, 80);
            }
        }
}