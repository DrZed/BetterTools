package com.kay.kayBTools.Items;

import com.kay.kayBTools.*;
import com.kay.kayBTools.common.*;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.*;

public class SteelHoe extends ItemHoe
{
	public SteelHoe(int ItemID, EnumToolMaterial material)
	{
		super(ItemID, material);
		setCreativeTab(BetterToolsTab.tab);
		setUnlocalizedName("SteelHoe");
		LanguageRegistry.addName(this, "Steel Hoe");
	}
}