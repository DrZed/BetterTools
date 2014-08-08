package com.kay.kayBTools.Items;

import com.kay.kayBTools.*;
import com.kay.kayBTools.common.*;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.*;

public class ObsidianHoe extends ItemHoe
{
	public ObsidianHoe(int ItemID, EnumToolMaterial material)
	{
		super(ItemID, material);
		setCreativeTab(BetterToolsTab.tab);
		setUnlocalizedName("ObsidianHoe");
		LanguageRegistry.addName(this, "Obsidian Hoe");
	}
}