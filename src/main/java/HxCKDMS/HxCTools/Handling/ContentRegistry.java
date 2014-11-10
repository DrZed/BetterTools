package HxCKDMS.HxCTools.Handling;

import HxCKDMS.HxCTools.Config;
import HxCKDMS.HxCTools.Items.*;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

public class ContentRegistry {

	public static ItemSword AventurineSword;
	public static ItemAxe AventurineAxe;
	public static ItemPickaxe AventurinePickaxe;
    public static ItemSpade AventurineSpade;
    public static ItemHoe AventurineHoe;

    public static ItemSword SapphireSword;
    public static ItemAxe SapphireAxe;
    public static ItemPickaxe SapphirePickaxe;
    public static ItemSpade SapphireSpade;
    public static ItemHoe SapphireHoe;

    public static ItemSword RubySword;
    public static ItemAxe RubyAxe;
    public static ItemPickaxe RubyPickaxe;
    public static ItemSpade RubySpade;
    public static ItemHoe RubyHoe;

    public static ItemSword ObsidianSword;
    public static ItemAxe ObsidianAxe;
    public static ItemPickaxe ObsidianPickaxe;
    public static ItemSpade ObsidianSpade;
    public static ItemHoe ObsidianHoe;

    public static ItemSword DPlatedSword;
    public static ItemAxe DPlatedAxe;
    public static ItemPickaxe DPlatedPickaxe;
    public static ItemSpade DPlatedSpade;
    public static ItemHoe DPlatedHoe;

    public static ItemSword BronzeSword;
    public static ItemAxe BronzeAxe;
    public static ItemPickaxe BronzePickaxe;
    public static ItemSpade BronzeSpade;
    public static ItemHoe BronzeHoe;

    public static ItemSword SteelSword;
    public static ItemAxe SteelAxe;
    public static ItemPickaxe SteelPickaxe;
    public static ItemSpade SteelSpade;
    public static ItemHoe SteelHoe;

    public static ItemSword TitaniumSword;
    public static ItemAxe TitaniumAxe;
	public static ItemPickaxe TitaniumPickaxe;
    public static ItemSpade TitaniumSpade;
	public static ItemHoe TitaniumHoe;

    public static ItemSword VoidSword;
    public static ItemAxe VoidAxe;
    public static ItemPickaxe VoidPickaxe;
    public static ItemSpade VoidSpade;
    public static ItemHoe VoidHoe;

    public static ItemArmor VoidHelm;
    public static ItemArmor VoidChestplate;
    public static ItemArmor VoidLeggings;
    public static ItemArmor VoidBoots;

    public static boolean VoidIsReady = true;

    public static Item Hammer;
		
	public static void ContentRegistry()
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
            ItemArmor.ArmorMaterial EnumArmorMaterialVoid = EnumHelper.addArmorMaterial("Void", 500, new int[] {11, 16, 15, 13}, 30);

            VoidAxe = new VoidAxe(EnumToolMaterialVoid);
            VoidHoe = new VoidHoe(EnumToolMaterialVoid);
            VoidSword = new VoidSword(EnumToolMaterialVoid);
            VoidSpade = new VoidSpade(EnumToolMaterialVoid);
            VoidPickaxe = new VoidPickaxe(EnumToolMaterialVoid);

            VoidHelm = new VoidHelm(EnumArmorMaterialVoid, 20, 0);
            VoidChestplate = new VoidChestplate(EnumArmorMaterialVoid, 20, 1);
            VoidLeggings = new VoidLeggings(EnumArmorMaterialVoid, 20, 2);
            VoidBoots = new VoidBoots(EnumArmorMaterialVoid, 20, 3);
        }
        if(Config.HammerEnable)
        {
            Hammer = new Hammer();
        }
	}
}
