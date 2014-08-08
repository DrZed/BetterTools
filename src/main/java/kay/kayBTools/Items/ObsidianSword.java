package com.kay.kayBTools.Items;

import com.kay.kayBTools.*;
import com.kay.kayBTools.common.*;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.*;

public class ObsidianSword extends ItemSword
{
	public ObsidianSword(int ItemID, EnumToolMaterial material)
	{
		super(ItemID, material);
		setCreativeTab(BetterToolsTab.tab);
		setUnlocalizedName("ObsidianSword");
		LanguageRegistry.addName(this, "Obsidian Sword");
	}
}