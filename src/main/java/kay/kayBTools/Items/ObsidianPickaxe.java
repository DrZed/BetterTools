package com.kay.kayBTools.Items;

import com.kay.kayBTools.*;
import com.kay.kayBTools.common.*;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.*;

public class ObsidianPickaxe extends ItemPickaxe
{
	public ObsidianPickaxe(int ItemID, EnumToolMaterial material)
	{
		super(ItemID, material);
		setCreativeTab(BetterToolsTab.tab);
		setUnlocalizedName("ObsidianPickaxe");
		LanguageRegistry.addName(this, "Obsidian Pickaxe");
	}
}