package com.kay.kayBTools.Items;

import com.kay.kayBTools.*;
import com.kay.kayBTools.common.*;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.*;

public class DPlatedPickaxe extends ItemPickaxe
{
	public DPlatedPickaxe(int ItemID, EnumToolMaterial material)
	{
		super(ItemID, material);
		setCreativeTab(BetterToolsTab.tab);
		setUnlocalizedName("DPlatedPickaxe");
		LanguageRegistry.addName(this, "DPlated Pickaxe");
	}
}