package com.kay.kayBTools.Items;

import com.kay.kayBTools.*;
import com.kay.kayBTools.common.*;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.*;

public class AventurinePickaxe extends ItemPickaxe
{
	public AventurinePickaxe(int ItemID, EnumToolMaterial material)
	{
		super(ItemID, material);
		setCreativeTab(BetterToolsTab.tab);
		setUnlocalizedName("AventurinePickaxe");
		LanguageRegistry.addName(this, "Aventurine Pickaxe");
	}
}