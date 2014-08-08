package com.kay.kayBTools.Items;

import com.kay.kayBTools.*;
import com.kay.kayBTools.common.*;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.*;

public class AventurineAxe extends ItemAxe
{
	public AventurineAxe(int ItemID, EnumToolMaterial material)
	{
		super(ItemID, material);
		setCreativeTab(BetterToolsTab.tab);
		setUnlocalizedName("AventurineAxe");
		LanguageRegistry.addName(this, "Aventurine Axe");
	}	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister registry) {
	itemIcon = registry.registerIcon("BetterTools:axeAventurine");
	}
}