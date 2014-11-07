package HxCKDMS.HxCTools;

import net.minecraftforge.common.config.Configuration;

public class Config
{
    public static int VoidRepairRate = 20;

    public static boolean SapphireEnable;
    public static boolean AventurineEnable;
    public static boolean RubyEnable;
    public static boolean ObsidianEnable;
    public static boolean DPlatedEnable;
    public static boolean TitaniumEnable;
    public static boolean SteelEnable;
    public static boolean BronzeEnable;
    public static boolean VoidEnable;

    //Other
    public static boolean HammerEnable;
    
    public Config(Configuration config)
    {
        config.load();

        SapphireEnable = config.get("Features", "Enable Sapphire Tools and Weapons", true).getBoolean();
        AventurineEnable = config.get("Features", "Enable Aventurine Tools and Weapons", true).getBoolean();
        RubyEnable = config.get("Features", "Enable Ruby Tools and Weapons", true).getBoolean();
        ObsidianEnable = config.get("Features", "Enable Obsidian Tools and Weapons", true).getBoolean();
        DPlatedEnable = config.get("Features", "Enable Diamond Plated Tools and Weapons", true).getBoolean();
        TitaniumEnable = config.get("Features", "Enable Titanium Tools and Weapons", true).getBoolean();
        SteelEnable = config.get("Features", "Enable Steel Tools and Weapons", true).getBoolean();
        BronzeEnable = config.get("Features", "Enable Bronze Tools and Weapons", true).getBoolean();
        VoidEnable = config.get("Features", "Enable Void Tools and Weapons [NYI] =P", false).getBoolean();

        //	Other
        HammerEnable = config.get("Other", "HammerEnable", true).getBoolean();
        
        
        if(config.hasChanged())
        {
            config.save();
        }
    }
}