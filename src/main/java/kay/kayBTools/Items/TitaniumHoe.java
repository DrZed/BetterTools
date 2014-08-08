package com.kay.kayBTools.Items;

import com.kay.kayBTools.*;
import com.kay.kayBTools.common.*;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.*;

public class TitaniumHoe extends ItemHoe
{
	public TitaniumHoe(int ItemID, EnumToolMaterial material)
	{
		super(ItemID, material);
		setCreativeTab(BetterToolsTab.tab);
		setUnlocalizedName("TitaniumHoe");
		LanguageRegistry.addName(this, "Titanium Hoe");
	}
}