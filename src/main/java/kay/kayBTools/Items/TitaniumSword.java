package com.kay.kayBTools.Items;

import com.kay.kayBTools.*;
import com.kay.kayBTools.common.*;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.*;

public class TitaniumSword extends ItemSword
{
	public TitaniumSword(int ItemID, EnumToolMaterial material)
	{
		super(ItemID, material);
		setCreativeTab(BetterToolsTab.tab);
		setUnlocalizedName("TitaniumSword");
		LanguageRegistry.addName(this, "Titanium Sword");
	}
}