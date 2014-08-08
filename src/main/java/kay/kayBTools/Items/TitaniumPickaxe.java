package com.kay.kayBTools.Items;

import com.kay.kayBTools.*;
import com.kay.kayBTools.common.*;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.*;

public class TitaniumPickaxe extends ItemPickaxe
{
	public TitaniumPickaxe(int ItemID, EnumToolMaterial material)
	{
		super(ItemID, material);
		setCreativeTab(BetterToolsTab.tab);
		setUnlocalizedName("TitaniumPickaxe");
		LanguageRegistry.addName(this, "Titanium Pickaxe");
	}
}