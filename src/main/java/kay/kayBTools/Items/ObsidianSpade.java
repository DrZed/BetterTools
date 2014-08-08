package com.kay.kayBTools.Items;

import com.kay.kayBTools.*;
import com.kay.kayBTools.common.*;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.*;

public class ObsidianSpade extends ItemSpade
{
	public ObsidianSpade(int ItemID, EnumToolMaterial material)
	{
		super(ItemID, material);
		setCreativeTab(BetterToolsTab.tab);
		setUnlocalizedName("ObsidianSpade");
		LanguageRegistry.addName(this, "Obsidian Spade");
	}
}