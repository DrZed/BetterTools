package com.kay.kayBTools.common;

import com.kay.kayBTools.*;
import com.kay.kayBTools.Items.*;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.*;
import net.minecraft.item.*;
import net.minecraftforge.oredict.OreDictionary;

public class ContentRegistry {
			
	//Tools
	public static Item AventurineSword;
	public static Item SapphireSword;
	public static Item RubySword;
	public static Item ObsidianSword;
	public static Item DPlatedSword;
	public static Item BronzeSword;
	public static Item SteelSword;
	public static Item TitaniumSword;		

	public static Item AventurineAxe;
	public static Item SapphireAxe;
	public static Item RubyAxe;
	public static Item ObsidianAxe;
	public static Item DPlatedAxe;
	public static Item BronzeAxe;
	public static Item SteelAxe;
	public static Item TitaniumAxe;		

	public static Item AventurinePickaxe;
	public static Item SapphirePickaxe;
	public static Item RubyPickaxe;
	public static Item ObsidianPickaxe;
	public static Item DPlatedPickaxe;
	public static Item BronzePickaxe;
	public static Item SteelPickaxe;
	public static Item TitaniumPickaxe;		

	public static Item AventurineSpade;
	public static Item SapphireSpade;
	public static Item RubySpade;
	public static Item ObsidianSpade;
	public static Item DPlatedSpade;
	public static Item BronzeSpade;
	public static Item SteelSpade;
	public static Item TitaniumSpade;		

	public static Item AventurineHoe;
	public static Item SapphireHoe;
	public static Item RubyHoe;
	public static Item ObsidianHoe;
	public static Item DPlatedHoe;
	public static Item BronzeHoe;
	public static Item SteelHoe;
	public static Item TitaniumHoe;	
	

	public static Item Hammer;	
		
	public static void LanguageRegistry()
	{
		
	int SwordRubyID = Config.SwordRubyID;
	int SwordObsidianID = Config.SwordObsidianID;
	int SwordAventurineID = Config.SwordAventurineID;
	int SwordSapphireID = Config.SwordSapphireID;
	int SwordDPlatedID = Config.SwordDPlatedID;
	int SwordTitaniumID = Config.SwordTitaniumID;
	int SwordBronzeID = Config.SwordBronzeID;
	int SwordSteelID = Config.SwordSteelID;
	
	int AxeRubyID = Config.AxeRubyID;
	int AxeObsidianID = Config.AxeObsidianID;
	int AxeAventurineID = Config.AxeAventurineID;
	int AxeSapphireID = Config.AxeSapphireID;
	int AxeDPlatedID = Config.AxeDPlatedID;
	int AxeTitaniumID = Config.AxeTitaniumID;
	int AxeBronzeID = Config.AxeBronzeID;
	int AxeSteelID = Config.AxeSteelID;
	
	int SpadeRubyID = Config.SpadeRubyID;
	int SpadeObsidianID = Config.SpadeObsidianID;
	int SpadeAventurineID = Config.SpadeAventurineID;
	int SpadeSapphireID = Config.SpadeSapphireID;
	int SpadeDPlatedID = Config.SpadeDPlatedID;
	int SpadeTitaniumID = Config.SpadeTitaniumID;
	int SpadeBronzeID = Config.SpadeBronzeID;
	int SpadeSteelID = Config.SpadeSteelID;
	
	int PickaxeRubyID = Config.PickaxeRubyID;
	int PickaxeObsidianID = Config.PickaxeObsidianID;
	int PickaxeAventurineID = Config.PickaxeAventurineID;
	int PickaxeSapphireID = Config.PickaxeSapphireID;
	int PickaxeDPlatedID = Config.PickaxeDPlatedID;
	int PickaxeTitaniumID = Config.PickaxeTitaniumID;
	int PickaxeBronzeID = Config.PickaxeBronzeID;
	int PickaxeSteelID = Config.PickaxeSteelID;
	
	int HoeRubyID = Config.HoeRubyID;
	int HoeObsidianID = Config.HoeObsidianID;
	int HoeAventurineID = Config.HoeAventurineID;
	int HoeSapphireID = Config.HoeSapphireID;
	int HoeDPlatedID = Config.HoeDPlatedID;
	int HoeTitaniumID = Config.HoeTitaniumID;
	int HoeBronzeID = Config.HoeBronzeID;
	int HoeSteelID = Config.HoeSteelID;
	

	int HammerID = Config.HammerID;
	

	EnumToolMaterial EnumToolMaterialSapphire = EnumHelper.addToolMaterial("Sapphire", 2, 850, 7.0F, 5, 10);
	EnumToolMaterial EnumToolMaterialAventurine = EnumHelper.addToolMaterial("Aventurine", 2, 850, 7.0F, 5, 10);
	EnumToolMaterial EnumToolMaterialRuby = EnumHelper.addToolMaterial("Ruby", 2, 850, 7.0F, 5, 10);
	EnumToolMaterial EnumToolMaterialObsidian = EnumHelper.addToolMaterial("Obsidian", 3, 500, 10.0F, 0, 8);
	EnumToolMaterial EnumToolMaterialDPlated = EnumHelper.addToolMaterial("DPlated", 3, 2400, 10.0F, 0, 10);
	EnumToolMaterial EnumToolMaterialSteel = EnumHelper.addToolMaterial("Steel", 4, 1050, 8.0F, 6, 10);
	EnumToolMaterial EnumToolMaterialBronze = EnumHelper.addToolMaterial("Bronze", 2, 900, 9.0F, 4, 8);
	EnumToolMaterial EnumToolMaterialTitanium = EnumHelper.addToolMaterial("Titanium", 5, 3600, 14.0F, 6, 8);

	SapphireSword = new SapphireSword(SwordSapphireID, EnumToolMaterialSapphire);
	ObsidianSword = new ObsidianSword(SwordObsidianID, EnumToolMaterialObsidian);
	DPlatedSword = new DPlatedSword(SwordDPlatedID, EnumToolMaterialDPlated);
	AventurineSword = new AventurineSword(SwordAventurineID, EnumToolMaterialAventurine);
	RubySword = new RubySword(SwordRubyID, EnumToolMaterialRuby);
	TitaniumSword = new TitaniumSword(SwordTitaniumID, EnumToolMaterialTitanium);
	BronzeSword = new BronzeSword(SwordBronzeID, EnumToolMaterialBronze);
	SteelSword = new SteelSword(SwordSteelID, EnumToolMaterialSteel);

	SapphirePickaxe = new SapphirePickaxe(PickaxeSapphireID, EnumToolMaterialSapphire);
	ObsidianPickaxe = new ObsidianPickaxe(PickaxeObsidianID, EnumToolMaterialObsidian);
	DPlatedPickaxe = new DPlatedPickaxe(PickaxeDPlatedID, EnumToolMaterialDPlated);
	AventurinePickaxe = new AventurinePickaxe(PickaxeAventurineID, EnumToolMaterialAventurine);
	RubyPickaxe = new RubyPickaxe(PickaxeRubyID, EnumToolMaterialRuby);
	TitaniumPickaxe = new TitaniumPickaxe(PickaxeTitaniumID, EnumToolMaterialTitanium);
	BronzePickaxe = new BronzePickaxe(PickaxeBronzeID, EnumToolMaterialBronze);
	SteelPickaxe = new SteelPickaxe(PickaxeSteelID, EnumToolMaterialSteel);

	SapphireSpade = new SapphireSpade(SpadeSapphireID, EnumToolMaterialSapphire);
	ObsidianSpade = new ObsidianSpade(SpadeObsidianID, EnumToolMaterialObsidian);
	DPlatedSpade = new DPlatedSpade(SpadeDPlatedID, EnumToolMaterialDPlated);
	AventurineSpade = new AventurineSpade(SpadeAventurineID, EnumToolMaterialAventurine);
	RubySpade = new RubySpade(SpadeRubyID, EnumToolMaterialRuby);
	TitaniumSpade = new TitaniumSpade(SpadeTitaniumID, EnumToolMaterialTitanium);
	BronzeSpade = new BronzeSpade(SpadeBronzeID, EnumToolMaterialBronze);
	SteelSpade = new SteelSpade(SpadeSteelID, EnumToolMaterialSteel);

	SapphireAxe = new SapphireAxe(AxeSapphireID, EnumToolMaterialSapphire);
	ObsidianAxe = new ObsidianAxe(AxeObsidianID, EnumToolMaterialObsidian);
	DPlatedAxe = new DPlatedAxe(AxeDPlatedID, EnumToolMaterialDPlated);
	AventurineAxe = new AventurineAxe(AxeAventurineID, EnumToolMaterialAventurine);
	RubyAxe = new RubyAxe(AxeRubyID, EnumToolMaterialRuby);
	TitaniumAxe = new TitaniumAxe(AxeTitaniumID, EnumToolMaterialTitanium);
	BronzeAxe = new BronzeAxe(AxeBronzeID, EnumToolMaterialBronze);
	SteelAxe = new SteelAxe(AxeSteelID, EnumToolMaterialSteel);

	SapphireHoe = new SapphireHoe(HoeSapphireID, EnumToolMaterialSapphire);
	ObsidianHoe = new ObsidianHoe(HoeObsidianID, EnumToolMaterialObsidian);
	DPlatedHoe = new DPlatedHoe(HoeDPlatedID, EnumToolMaterialDPlated);
	AventurineHoe = new AventurineHoe(HoeAventurineID, EnumToolMaterialAventurine);
	RubyHoe = new RubyHoe(HoeRubyID, EnumToolMaterialRuby);
	TitaniumHoe = new TitaniumHoe(HoeTitaniumID, EnumToolMaterialTitanium);
	BronzeHoe = new BronzeHoe(HoeBronzeID, EnumToolMaterialBronze);
	SteelHoe = new SteelHoe(HoeSteelID, EnumToolMaterialSteel);
	

	Hammer = new Hammer(HammerID);
	}
}
