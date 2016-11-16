package com.chocolatemod.worldgen;

import java.util.Random;

import com.chocolatemod.block.BlockRegistry;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class StructureChocolateHouse extends WorldGenerator{

	@Override
	public boolean generate(World world, Random rand, int x, int y, int z) {
		Random random = new Random();
    	int Ycoord1 = 0;
        while (!world.isAirBlock(x, y+1, z) && y < 63)
        {
            y = y+1;
            
        }
        
        if (world.getBlock(x, y, z) != BlockRegistry.chocoGrass && world.getBlock(x, y, z) != BlockRegistry.chocoDirt)
        {
        	return false;
        }
        
        else
        {  
        	this.chocolateHouse(world, x, y, z);
         }
        return true;
        
	}
	public void chocolateHouse(World par1World, int x, int y, int z)
    {	
    	Random random = new Random();
    	
    	//LAYER 1 (BASE)
    	z = z-3;
    	int i = 0;
        this.pickBlock(par1World, x-2, y, z, true);
        this.pickBlock(par1World, x-1, y, z, true);
        this.pickBlock(par1World, x, y, z, true);
        this.pickBlock(par1World, x+1, y, z, true);
        this.pickBlock(par1World, x+2, y, z, true);
        
    	z = z+1;
        this.pickBlock(par1World, x-3, y, z, true);
        this.pickBlock(par1World, x-2, y, z, true);
        this.pickBlock(par1World, x-1, y, z, true);
        this.pickBlock(par1World, x, y, z, true);
        this.pickBlock(par1World, x+1, y, z, true);
        this.pickBlock(par1World, x+2, y, z, true);
        this.pickBlock(par1World, x+3, y, z, true);
        
    	z = z+1;
        this.pickBlock(par1World, x-3, y, z, true);
        this.pickBlock(par1World, x-2, y, z, true);
        this.pickBlock(par1World, x-1, y, z, true);
        this.pickBlock(par1World, x, y, z, true);
        this.pickBlock(par1World, x+1, y, z, true);
        this.pickBlock(par1World, x+2, y, z, true);
        this.pickBlock(par1World, x+3, y, z, true);
        
    	z = z+1;
        this.pickBlock(par1World, x-3, y, z, true);
        this.pickBlock(par1World, x-2, y, z, true);
        this.pickBlock(par1World, x-1, y, z, true);
        par1World.setBlock(x, y, z, Blocks.glowstone);
        this.pickBlock(par1World, x+1, y, z, true);
        this.pickBlock(par1World, x+2, y, z, true);
        this.pickBlock(par1World, x+3, y, z, true);
        
    	z = z+1;
        this.pickBlock(par1World, x-3, y, z, true);
        this.pickBlock(par1World, x-2, y, z, true);
        this.pickBlock(par1World, x-1, y, z, true);
        this.pickBlock(par1World, x, y, z, true);
        this.pickBlock(par1World, x+1, y, z, true);
        this.pickBlock(par1World, x+2, y, z, true);
        this.pickBlock(par1World, x+3, y, z, true);
        
    	z = z+1;
        this.pickBlock(par1World, x-3, y, z, true);
        this.pickBlock(par1World, x-2, y, z, true);
        this.pickBlock(par1World, x-1, y, z, true);
        this.pickBlock(par1World, x, y, z, true);
        this.pickBlock(par1World, x+1, y, z, true);
        this.pickBlock(par1World, x+2, y, z, true);
        this.pickBlock(par1World, x+3, y, z, true);
        
    	z = z+1;
        this.pickBlock(par1World, x-2, y, z, true);
        this.pickBlock(par1World, x-1, y, z, true);
        this.pickBlock(par1World, x, y, z, true);
        this.pickBlock(par1World, x+1, y, z, true);
        this.pickBlock(par1World, x+2, y, z, true);
        
    	
    }
	
	public void pickBlock(World par1World, int x, int y, int z, boolean canBeEmpty)
    {	
    	Random random = new Random();
    	if(canBeEmpty == true)
    	{
        	int i = random.nextInt(3);
        	if (i == 1)
        	{
        		par1World.setBlock(x, y, z, Blocks.cobblestone);
        	}
        	else if (i == 2)
        	{
        		
        	}
        	else
        	{
        		par1World.setBlock(x, y, z, Blocks.mossy_cobblestone);
        	}
    	}
    	else
    	{
        	int i = random.nextInt(2);
        	if (i == 1)
        	{
        		par1World.setBlock(x, y, z, Blocks.cobblestone);
        	}
        	else
        	{
        		par1World.setBlock(x, y, z, Blocks.mossy_cobblestone);
        	}
    	}

    	
    }
}
