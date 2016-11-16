package com.chocolatemod.worldgen;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MapGenChocolateStructureIO
{
    private static final Logger logger = LogManager.getLogger();
    private static Map field_143040_a = new HashMap();
    private static Map field_143038_b = new HashMap();
    private static Map field_143039_c = new HashMap();
    private static Map field_143037_d = new HashMap();
    private static final String __OBFID = "CL_00000509";

    public static void registerStructure(Class p_143034_0_, String p_143034_1_)
    {
        field_143040_a.put(p_143034_1_, p_143034_0_);
        field_143038_b.put(p_143034_0_, p_143034_1_);
    }

    public static void func_143031_a(Class p_143031_0_, String p_143031_1_)
    {
        field_143039_c.put(p_143031_1_, p_143031_0_);
        field_143037_d.put(p_143031_0_, p_143031_1_);
    }

    public static String func_143033_a(ChocolateStructureStart chocolateStructureStart)
    {
        return (String)field_143038_b.get(chocolateStructureStart.getClass());
    }

    public static String func_143036_a(ChocolateStructureComponent chocolateStructureComponent)
    {
        return (String)field_143037_d.get(chocolateStructureComponent.getClass());
    }

    public static ChocolateStructureStart func_143035_a(NBTTagCompound p_143035_0_, World p_143035_1_)
    {
        ChocolateStructureStart structurestart = null;

        try
        {
            Class oclass = (Class)field_143040_a.get(p_143035_0_.getString("id"));

            if (oclass != null)
            {
                structurestart = (ChocolateStructureStart)oclass.newInstance();
            }
        }
        catch (Exception exception)
        {
            logger.warn("Failed Start with id " + p_143035_0_.getString("id"));
            exception.printStackTrace();
        }

        if (structurestart != null)
        {
            structurestart.func_143020_a(p_143035_1_, p_143035_0_);
        }
        else
        {
            logger.warn("Skipping Structure with id " + p_143035_0_.getString("id"));
        }

        return structurestart;
    }

    public static ChocolateStructureComponent func_143032_b(NBTTagCompound p_143032_0_, World p_143032_1_)
    {
        ChocolateStructureComponent structurecomponent = null;

        try
        {
            Class oclass = (Class)field_143039_c.get(p_143032_0_.getString("id"));

            if (oclass != null)
            {
                structurecomponent = (ChocolateStructureComponent)oclass.newInstance();
            }
        }
        catch (Exception exception)
        {
            logger.warn("Failed Piece with id " + p_143032_0_.getString("id"));
            exception.printStackTrace();
        }

        if (structurecomponent != null)
        {
            structurecomponent.func_143009_a(p_143032_1_, p_143032_0_);
        }
        else
        {
            logger.warn("Skipping Piece with id " + p_143032_0_.getString("id"));
        }

        return structurecomponent;
    }

    static
    {
        registerStructure(StructureChocolateMineshaftStart.class, "Chocolate Mineshaft");
        registerStructure(MapGenChocolateVillage.Start.class, "Chocolate Village");
        registerStructure(MapGenChocolateBridge.Start.class, "Chocolate Fortress");
      //  registerStructure(MapGenStronghold.Start.class, "Stronghold");
     //   registerStructure(MapGenScatteredFeature.Start.class, "Temple");
        StructureChocolateMineshaftPieces.registerStructurePieces();
        StructureChocolateVillagePieces.registerVillagePieces();
        StructureChocolateBridgePieces.registerNetherFortressPieces();
    //    StructureStrongholdPieces.registerStrongholdPieces();
    //    ComponentScatteredFeaturePieces.registerScatteredFeaturePieces();
        
    }
}