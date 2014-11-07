package HxCKDMS.HxCTools.Handling;

import HxCKDMS.HxCTools.Config;
import HxCKDMS.HxCTools.Items.*;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ContentRegistry {
			
	//Tools
	public static Item AventurineSword;
	public static Item AventurineAxe;
	public static Item AventurinePickaxe;
    public static Item AventurineSpade;
    public static Item AventurineHoe;

    public static Item SapphireSword;
    public static Item SapphirePickaxe;
    public static Item SapphireAxe;
    public static Item SapphireSpade;
    public static Item SapphireHoe;

    public static Item RubySword;
    public static Item RubyAxe;
    public static Item RubyPickaxe;
    public static Item RubyHoe;
    public static Item RubySpade;

    public static Item ObsidianSword;
    public static Item ObsidianAxe;
    public static Item ObsidianPickaxe;
    public static Item ObsidianSpade;
    public static Item ObsidianHoe;

    public static Item DPlatedSword;
    public static Item DPlatedAxe;
    public static Item DPlatedPickaxe;
    public static Item DPlatedSpade;
    public static Item DPlatedHoe;

    public static Item BronzeSword;
    public static Item BronzeAxe;
    public static Item BronzePickaxe;
    public static Item BronzeSpade;
    public static Item BronzeHoe;

    public static Item SteelSword;
    public static Item SteelAxe;
    public static Item SteelPickaxe;
    public static Item SteelSpade;
    public static Item SteelHoe;

    public static Item TitaniumSword;
    public static Item TitaniumAxe;
	public static Item TitaniumPickaxe;
    public static Item TitaniumSpade;
	public static Item TitaniumHoe;

    public static Item VoidSword;
    public static Item VoidAxe;
    public static Item VoidPickaxe;
    public static Item VoidSpade;
    public static Item VoidHoe;
    public static boolean VoidIsReady = false;

    public static Item Hammer;
		
	public static void LanguageRegistry()
	{

    //  EnumHelper.addToolMaterial("name", harvestLevel, maxUses, efficiency, damage, enchantability)

        if (Config.SapphireEnable)
        {
            Item.ToolMaterial EnumToolMaterialSapphire = EnumHelper.addToolMaterial("Sapphire", 4, 850, 7.5F, 5, 12);

            SapphireSword = new SapphireSword(EnumToolMaterialSapphire);
            SapphirePickaxe = new SapphirePickaxe(EnumToolMaterialSapphire);
            SapphireSpade = new SapphireSpade(EnumToolMaterialSapphire);
            SapphireAxe = new SapphireAxe(EnumToolMaterialSapphire);
            SapphireHoe = new SapphireHoe(EnumToolMaterialSapphire);
        }

        if (Config.ObsidianEnable)
        {
            Item.ToolMaterial EnumToolMaterialObsidian = EnumHelper.addToolMaterial("Obsidian", 5, 3200, 6.0F, 10, 8);

            ObsidianSword = new VoidSword(EnumToolMaterialObsidian);
            ObsidianPickaxe = new VoidPickaxe(EnumToolMaterialObsidian);
            ObsidianSpade = new VoidSpade(EnumToolMaterialObsidian);
            ObsidianAxe = new VoidAxe(EnumToolMaterialObsidian);
            ObsidianHoe = new VoidHoe(EnumToolMaterialObsidian);
        }
        if (Config.DPlatedEnable)
        {
            Item.ToolMaterial EnumToolMaterialDPlated = EnumHelper.addToolMaterial("DiamondPlated", 4, 1560, 10.0F, 8, 15);

            DPlatedSword = new DPlatedSword(EnumToolMaterialDPlated);
            DPlatedSpade = new DPlatedSpade(EnumToolMaterialDPlated);
            DPlatedPickaxe = new DPlatedPickaxe(EnumToolMaterialDPlated);
            DPlatedAxe = new DPlatedAxe(EnumToolMaterialDPlated);
            DPlatedHoe = new DPlatedHoe(EnumToolMaterialDPlated);
        }
        if(Config.AventurineEnable)
        {
            Item.ToolMaterial EnumToolMaterialAventurine = EnumHelper.addToolMaterial("Aventurine", 4, 512, 6.8F, 5, 16);

            AventurineSword = new AventurineSword(EnumToolMaterialAventurine);
            AventurineAxe = new AventurineAxe(EnumToolMaterialAventurine);
            AventurinePickaxe = new AventurinePickaxe(EnumToolMaterialAventurine);
            AventurineSpade = new AventurineSpade(EnumToolMaterialAventurine);
            AventurineHoe = new AventurineHoe(EnumToolMaterialAventurine);
        }
        if (Config.BronzeEnable)
        {
            Item.ToolMaterial EnumToolMaterialBronze = EnumHelper.addToolMaterial("Bronze", 3, 1200, 5.3F, 4, 10);

            BronzeHoe = new BronzeHoe(EnumToolMaterialBronze);
            BronzeAxe = new BronzeAxe(EnumToolMaterialBronze);
            BronzePickaxe = new BronzePickaxe(EnumToolMaterialBronze);
            BronzeSpade = new BronzeSpade(EnumToolMaterialBronze);
            BronzeSword = new BronzeSword(EnumToolMaterialBronze);
        }
        if(Config.TitaniumEnable)
        {
            Item.ToolMaterial EnumToolMaterialTitanium = EnumHelper.addToolMaterial("Titanium", 5, 5120, 8.0F, 7, 8);

            TitaniumSword = new TitaniumSword(EnumToolMaterialTitanium);
            TitaniumAxe = new TitaniumAxe(EnumToolMaterialTitanium);
            TitaniumPickaxe = new TitaniumPickaxe(EnumToolMaterialTitanium);
            TitaniumSpade = new TitaniumSpade(EnumToolMaterialTitanium);
            TitaniumHoe = new TitaniumHoe(EnumToolMaterialTitanium);
        }
        if (Config.SteelEnable)
        {
            Item.ToolMaterial EnumToolMaterialSteel = EnumHelper.addToolMaterial("Steel", 3, 1600, 5.0F, 5, 6);

            SteelSpade = new SteelSpade(EnumToolMaterialSteel);
            SteelAxe = new SteelAxe(EnumToolMaterialSteel);
            SteelSword = new SteelSword(EnumToolMaterialSteel);
            SteelHoe = new SteelHoe(EnumToolMaterialSteel);
            SteelPickaxe = new SteelPickaxe(EnumToolMaterialSteel);
        }
        if (Config.RubyEnable)
        {
            Item.ToolMaterial EnumToolMaterialRuby = EnumHelper.addToolMaterial("Ruby", 4, 1250, 6.8F, 5, 12);

            RubyAxe = new RubyAxe(EnumToolMaterialRuby);
            RubyHoe = new RubyHoe(EnumToolMaterialRuby);
            RubySword = new RubySword(EnumToolMaterialRuby);
            RubySpade = new RubySpade(EnumToolMaterialRuby);
            RubyPickaxe = new RubyPickaxe(EnumToolMaterialRuby);
        }
        if (Config.VoidEnable && VoidIsReady)
        {
            Item.ToolMaterial EnumToolMaterialVoid = EnumHelper.addToolMaterial("Void", 10, 100, 14.0F, 20, 30);

            VoidAxe = new VoidAxe(EnumToolMaterialVoid);
            VoidHoe = new VoidHoe(EnumToolMaterialVoid);
            VoidSword = new VoidSword(EnumToolMaterialVoid);
            VoidSpade = new VoidSpade(EnumToolMaterialVoid);
            VoidPickaxe = new VoidPickaxe(EnumToolMaterialVoid);
        }
        if(Config.HammerEnable)
        {
            Hammer = new Hammer();
        }
	}
}
