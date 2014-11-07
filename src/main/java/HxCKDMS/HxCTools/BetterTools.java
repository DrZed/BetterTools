package HxCKDMS.HxCTools;

import HxCKDMS.HxCTools.Creative.HxCToolsTab;
import HxCKDMS.HxCTools.Handling.ContentRegistry;
import HxCKDMS.HxCTools.Handling.CraftingRecipes;
import HxCKDMS.HxCTools.Handling.TextureHandler;
import HxCKDMS.HxCTools.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class BetterTools
{
    @Instance(Reference.MOD_ID)

    public static BetterTools instance;
    
    public static Config Config;

    @SubscribeEvent
    public void preinit(FMLPreInitializationEvent event)
    {
        Config = new Config(new Configuration(event.getSuggestedConfigurationFile()));
    }

    @SubscribeEvent
    public void init(FMLInitializationEvent event)
    {
        event.getModState();
    	ContentRegistry.LanguageRegistry();
    	CraftingRecipes.createRecipes();
	}

    @SubscribeEvent
    public void postinit(FMLPostInitializationEvent event)
    {
        if(HxCKDMS.HxCTools.Config.TextureSize == 16){TextureHandler.size = TextureHandler.a;}
        if(HxCKDMS.HxCTools.Config.TextureSize == 32){TextureHandler.size = TextureHandler.b;}
        if(HxCKDMS.HxCTools.Config.TextureSize >= 64){TextureHandler.size = TextureHandler.c;}
        event.getModState();
    }
}