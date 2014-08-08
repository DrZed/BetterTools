package com.kay.kayBTools.Items;

import com.kay.kayBTools.*;
import com.kay.kayBTools.common.*;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.*;

public class TitaniumSpade extends ItemSpade
{
	public TitaniumSpade(int ItemID, EnumToolMaterial material)
	{
		super(ItemID, material);
		setCreativeTab(BetterToolsTab.tab);
		setUnlocalizedName("TitaniumSpade");
		LanguageRegistry.addName(this, "Titanium Spade");
	}
}