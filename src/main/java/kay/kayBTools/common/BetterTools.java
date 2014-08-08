package com.kay.kayBTools.common;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;

import com.kay.kayBTools.*;
import com.kay.kayBTools.lib.*;
import com.kay.kayBTools.common.*;
import com.kay.kayBTools.Proxy.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod; //Remove in 1.7
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false) //remove in 1.7

public class BetterTools
{
    @Instance(Reference.MOD_ID)

    public static BetterTools instance;
    
    public static Config Config;
	
    @EventHandler
    public void load(FMLPreInitializationEvent event)
    {
    	Config = new Config(new Configuration(event.getSuggestedConfigurationFile()));
    	System.out.println("PreInitialized");
	}

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	ContentRegistry.LanguageRegistry();
    	CraftingRecipes.createRecipes();
    	System.out.println("Initialized");
	}
}