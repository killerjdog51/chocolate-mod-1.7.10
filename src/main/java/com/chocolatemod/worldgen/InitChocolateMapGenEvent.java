package com.chocolatemod.worldgen;

import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.world.gen.MapGenBase;

public class InitChocolateMapGenEvent extends Event
{
    /** Use CUSTOM to filter custom event types
     */
    public static enum EventType { CAVE, MINESHAFT, NETHER_BRIDGE, NETHER_CAVE, RAVINE, SCATTERED_FEATURE, STRONGHOLD, CHOCOLATEVILLAGE, CUSTOM }
    
    public final EventType type;
    public final MapGenChocolateBase originalGen;
    public MapGenChocolateBase newGen;
    
    InitChocolateMapGenEvent(EventType type, MapGenChocolateBase original)
    {
        this.type = type;
        this.originalGen = original;
        this.newGen = original;
    }
}