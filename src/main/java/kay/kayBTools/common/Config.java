package com.kay.kayBTools.common;

import net.minecraftforge.common.Configuration;

public class Config
{

    private int defaultPickaxeID = 3800;
    private int defaultAxeID = 3810;
    private int defaultSwordID = 3820;
    private int defaultSpadeID = 3830;
    private int defaultHoeID = 3840;
    private int defaultExtraItemID = 3850;
    
    //Sword
    public static int SwordSapphireID;
    public static boolean SwordSapphireEnable;
    public static int SwordAventurineID;
    public static boolean SwordAventurineEnable;
    public static int SwordRubyID;
    public static boolean SwordRubyEnable;
    public static int SwordObsidianID;
    public static boolean SwordObsidianEnable;
    public static int SwordDPlatedID;
    public static boolean SwordDPlatedEnable;
    public static int SwordTitaniumID;
    public static boolean SwordTitaniumEnable;
    public static int SwordSteelID;
    public static boolean SwordSteelEnable;
    public static int SwordBronzeID;
    public static boolean SwordBronzeEnable;

    public static int AxeSapphireID;
    public static boolean AxeSapphireEnable;
    public static int AxeAventurineID;
    public static boolean AxeAventurineEnable;
    public static int AxeRubyID;
    public static boolean AxeRubyEnable;
    public static int AxeObsidianID;
    public static boolean AxeObsidianEnable;
    public static int AxeDPlatedID;
    public static boolean AxeDPlatedEnable;
    public static int AxeTitaniumID;
    public static boolean AxeTitaniumEnable;
    public static int AxeSteelID;
    public static boolean AxeSteelEnable;
    public static int AxeBronzeID;
    public static boolean AxeBronzeEnable;

    public static int PickaxeSapphireID;
    public static boolean PickaxeSapphireEnable;
    public static int PickaxeAventurineID;
    public static boolean PickaxeAventurineEnable;
    public static int PickaxeRubyID;
    public static boolean PickaxeRubyEnable;
    public static int PickaxeObsidianID;
    public static boolean PickaxeObsidianEnable;
    public static int PickaxeDPlatedID;
    public static boolean PickaxeDPlatedEnable;
    public static int PickaxeTitaniumID;
    public static boolean PickaxeTitaniumEnable;
    public static int PickaxeSteelID;
    public static boolean PickaxeSteelEnable;
    public static int PickaxeBronzeID;
    public static boolean PickaxeBronzeEnable;

    public static int SpadeSapphireID;
    public static boolean SpadeSapphireEnable;
    public static int SpadeAventurineID;
    public static boolean SpadeAventurineEnable;
    public static int SpadeRubyID;
    public static boolean SpadeRubyEnable;
    public static int SpadeObsidianID;
    public static boolean SpadeObsidianEnable;
    public static int SpadeDPlatedID;
    public static boolean SpadeDPlatedEnable;
    public static int SpadeTitaniumID;
    public static boolean SpadeTitaniumEnable;
    public static int SpadeSteelID;
    public static boolean SpadeSteelEnable;
    public static int SpadeBronzeID;
    public static boolean SpadeBronzeEnable;

    public static int HoeSapphireID;
    public static boolean HoeSapphireEnable;
    public static int HoeAventurineID;
    public static boolean HoeAventurineEnable;
    public static int HoeRubyID;
    public static boolean HoeRubyEnable;
    public static int HoeObsidianID;
    public static boolean HoeObsidianEnable;
    public static int HoeDPlatedID;
    public static boolean HoeDPlatedEnable;
    public static int HoeTitaniumID;
    public static boolean HoeTitaniumEnable;
    public static int HoeSteelID;
    public static boolean HoeSteelEnable;
    public static int HoeBronzeID;
    public static boolean HoeBronzeEnable;
    
    
    //Other
    public static int HammerID;
    public static boolean HammerEnable;
    
    public Config(Configuration config)
    {
        config.load();
        
        //   Swords
        SwordSapphireID = config.get("Sword", "SapphireID", defaultSwordID+0).getInt();
        SwordSapphireEnable = config.get("Sword", "SapphireEnable", true).getBoolean(true);
        SwordAventurineID = config.get("Sword", "AventurineID", defaultSwordID+1).getInt();
        SwordAventurineEnable = config.get("Sword", "AventurineEnable", true).getBoolean(true);
        SwordRubyID = config.get("Sword", "RubyID", defaultSwordID+2).getInt();
        SwordRubyEnable = config.get("Sword", "RubyEnable", true).getBoolean(true);
        SwordObsidianID = config.get("Sword", "ObsidianID", defaultSwordID+3).getInt();
        SwordObsidianEnable = config.get("Sword", "ObsidianEnable", true).getBoolean(true);
        SwordDPlatedID = config.get("Sword", "DPlatedID", defaultSwordID+4).getInt();
        SwordDPlatedEnable = config.get("Sword", "DPlatedEnable", true).getBoolean(true);
        SwordTitaniumID = config.get("Sword", "TitaniumID", defaultSwordID+5).getInt();
        SwordTitaniumEnable = config.get("Sword", "TitaniumEnable", true).getBoolean(true);
        SwordSteelID = config.get("Sword", "SteelID", defaultSwordID+6).getInt();
        SwordSteelEnable = config.get("Sword", "SteelEnable", true).getBoolean(true);
        SwordBronzeID = config.get("Sword", "BronzeID", defaultSwordID+7).getInt();
        SwordBronzeEnable = config.get("Sword", "BronzeEnable", true).getBoolean(true);
        
        
        //  Spades / Shovels
        SpadeSapphireID = config.get("Spade", "SapphireID", defaultSpadeID+0).getInt();
        SpadeSapphireEnable = config.get("Spade", "SapphireEnable", true).getBoolean(true);
        SpadeAventurineID = config.get("Spade", "AventurineID", defaultSpadeID+1).getInt();
        SpadeAventurineEnable = config.get("Spade", "AventurineEnable", true).getBoolean(true);
        SpadeRubyID = config.get("Spade", "RubyID", defaultSpadeID+2).getInt();
        SpadeRubyEnable = config.get("Spade", "RubyEnable", true).getBoolean(true);
        SpadeObsidianID = config.get("Spade", "ObsidianID", defaultSpadeID+3).getInt();
        SpadeObsidianEnable = config.get("Spade", "ObsidianEnable", true).getBoolean(true);
        SpadeDPlatedID = config.get("Spade", "DPlatedID", defaultSpadeID+4).getInt();
        SpadeDPlatedEnable = config.get("Spade", "DPlatedEnable", true).getBoolean(true);
        SpadeTitaniumID = config.get("Spade", "TitaniumID", defaultSpadeID+5).getInt();
        SpadeTitaniumEnable = config.get("Spade", "TitaniumEnable", true).getBoolean(true);
        SpadeSteelID = config.get("Spade", "SteelID", defaultSpadeID+6).getInt();
        SpadeSteelEnable = config.get("Spade", "SteelEnable", true).getBoolean(true);
        SpadeBronzeID = config.get("Spade", "BronzeID", defaultSpadeID+7).getInt();
        SpadeBronzeEnable = config.get("Spade", "BronzeEnable", true).getBoolean(true);
        
        //     Pickaxes
        PickaxeSapphireID = config.get("Pick", "SapphireID", defaultPickaxeID+0).getInt();
        PickaxeSapphireEnable = config.get("Pick", "SapphireEnable", true).getBoolean(true);
        PickaxeAventurineID = config.get("Pick", "AventurineID", defaultPickaxeID+1).getInt();
        PickaxeAventurineEnable = config.get("Pick", "AventurineEnable", true).getBoolean(true);
        PickaxeRubyID = config.get("Pick", "RubyID", defaultPickaxeID+2).getInt();
        PickaxeRubyEnable = config.get("Pick", "RubyEnable", true).getBoolean(true);
        PickaxeObsidianID = config.get("Pick", "ObsidianID", defaultPickaxeID+3).getInt();
        PickaxeObsidianEnable = config.get("Pick", "ObsidianEnable", true).getBoolean(true);
        PickaxeDPlatedID = config.get("Pick", "DPlatedID", defaultPickaxeID+4).getInt();
        PickaxeDPlatedEnable = config.get("Pick", "DPlatedEnable", true).getBoolean(true);
        PickaxeTitaniumID = config.get("Pickaxe", "TitaniumID", defaultPickaxeID+5).getInt();
        PickaxeTitaniumEnable = config.get("Pickaxe", "TitaniumEnable", true).getBoolean(true);
        PickaxeSteelID = config.get("Pickaxe", "SteelID", defaultPickaxeID+6).getInt();
        PickaxeSteelEnable = config.get("Pickaxe", "SteelEnable", true).getBoolean(true);
        PickaxeBronzeID = config.get("Pickaxe", "BronzeID", defaultPickaxeID+7).getInt();
        PickaxeBronzeEnable = config.get("Pickaxe", "BronzeEnable", true).getBoolean(true);
        
        //     Axes
        AxeSapphireID = config.get("Axe", "SapphireID", defaultAxeID+0).getInt();
        AxeSapphireEnable = config.get("Axe", "SapphireEnable", true).getBoolean(true);
        AxeAventurineID = config.get("Axe", "AventurineID", defaultAxeID+1).getInt();
        AxeAventurineEnable = config.get("Axe", "AventurineEnable", true).getBoolean(true);
        AxeRubyID = config.get("Axe", "RubyID", defaultAxeID+2).getInt();
        AxeRubyEnable = config.get("Axe", "RubyEnable", true).getBoolean(true);
        AxeObsidianID = config.get("Axe", "ObsidianID", defaultAxeID+3).getInt();
        AxeObsidianEnable = config.get("Axe", "ObsidianEnable", true).getBoolean(true);
        AxeDPlatedID = config.get("Axe", "DPlatedID", defaultAxeID+4).getInt();
        AxeDPlatedEnable = config.get("Axe", "DPlatedEnable", true).getBoolean(true);
        AxeTitaniumID = config.get("Axe", "TitaniumID", defaultAxeID+5).getInt();
        AxeTitaniumEnable = config.get("Axe", "TitaniumEnable", true).getBoolean(true);
        AxeSteelID = config.get("Axe", "SteelID", defaultAxeID+6).getInt();
        AxeSteelEnable = config.get("Axe", "SteelEnable", true).getBoolean(true);
        AxeBronzeID = config.get("Axe", "BronzeID", defaultAxeID+7).getInt();
        AxeBronzeEnable = config.get("Axe", "BronzeEnable", true).getBoolean(true);
        
        //       Hoes    <---- Don't laugh you immature noob
        HoeSapphireID = config.get("Hoe", "SapphireID", defaultHoeID+0).getInt();
        HoeSapphireEnable = config.get("Hoe", "SapphireEnable", true).getBoolean(true);
        HoeAventurineID = config.get("Hoe", "AventurineID", defaultHoeID+1).getInt();
        HoeAventurineEnable = config.get("Hoe", "AventurineEnable", true).getBoolean(true);
        HoeRubyID = config.get("Hoe", "RubyID", defaultHoeID+2).getInt();
        HoeRubyEnable = config.get("Hoe", "RubyEnable", true).getBoolean(true);
        HoeObsidianID = config.get("Hoe", "ObsidianID", defaultHoeID+3).getInt();
        HoeObsidianEnable = config.get("Hoe", "ObsidianEnable", true).getBoolean(true);
        HoeDPlatedID = config.get("Hoe", "DPlatedID", defaultHoeID+4).getInt();
        HoeDPlatedEnable = config.get("Hoe", "DPlatedEnable", true).getBoolean(true);
        HoeTitaniumID = config.get("Hoe", "TitaniumID", defaultHoeID+5).getInt();
        HoeTitaniumEnable = config.get("Hoe", "TitaniumEnable", true).getBoolean(true);
        HoeSteelID = config.get("Hoe", "SteelID", defaultHoeID+6).getInt();
        HoeSteelEnable = config.get("Hoe", "SteelEnable", true).getBoolean(true);
        HoeBronzeID = config.get("Hoe", "BronzeID", defaultHoeID+7).getInt();
        HoeBronzeEnable = config.get("Hoe", "BronzeEnable", true).getBoolean(true);
        
        		//	Other
        HammerID = config.get("Other", "HammerID", defaultExtraItemID+0).getInt();
        HammerEnable = config.get("Other", "HammerEnable", true).getBoolean(true);
        
        
        if(config.hasChanged())
        {
            config.save();
        }
    }
}