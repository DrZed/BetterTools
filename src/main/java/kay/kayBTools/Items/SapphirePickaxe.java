package com.kay.kayBTools.Items;

import com.kay.kayBTools.*;
import com.kay.kayBTools.common.*;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.*;

public class SapphirePickaxe extends ItemPickaxe
{
	public SapphirePickaxe(int ItemID, EnumToolMaterial material)
	{
		super(ItemID, material);
		setCreativeTab(BetterToolsTab.tab);
		setUnlocalizedName("SapphirePickaxe");
		LanguageRegistry.addName(this, "Sapphire Pickaxe");
	}
}