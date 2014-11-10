package HxCKDMS.HxCTools;

import net.minecraftforge.common.config.Configuration;

public class Config
{
    public static int VoidRepairRate = 20;

    public static int TextureSize;

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

        TextureSize = config.get("Features", "Texture Size 16, 32, 64 only", 16).getInt();

        SapphireEnable = config.get("Features", "Enable Sapphire Tools and Weapons", true).getBoolean(true);
        AventurineEnable = config.get("Features", "Enable Aventurine Tools and Weapons", true).getBoolean(true);
        RubyEnable = config.get("Features", "Enable Ruby Tools and Weapons", true).getBoolean(true);
        ObsidianEnable = config.get("Features", "Enable Obsidian Tools and Weapons", true).getBoolean(true);
        DPlatedEnable = config.get("Features", "Enable Diamond Plated Tools and Weapons", true).getBoolean(true);
        TitaniumEnable = config.get("Features", "Enable Titanium Tools and Weapons", true).getBoolean(true);
        SteelEnable = config.get("Features", "Enable Steel Tools and Weapons", true).getBoolean(true);
        BronzeEnable = config.get("Features", "Enable Bronze Tools and Weapons", true).getBoolean(true);
        VoidEnable = config.get("Features", "Enable Void Tools and Weapons [NYI] =P", true).getBoolean(true);

        //	Other
        HammerEnable = config.get("Other", "HammerEnable", true).getBoolean(true);
        
        
        if(config.hasChanged())
        {
            config.save();
        }
    }
}