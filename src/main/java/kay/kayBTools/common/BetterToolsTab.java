package com.kay.kayBTools.common;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BetterToolsTab extends CreativeTabs
{
    public static BetterToolsTab tab = new BetterToolsTab();
    static boolean hasInit;
    static int icon;

    public BetterToolsTab()
    {
        super("MoarStuffTab");
        LanguageRegistry.instance().addStringLocalization("itemGroup.MoarStuffTab", "DrZed's Better Tools");
    }

    public int getTabIconItemIndex ()
    {
        return ContentRegistry.SapphireSword.itemID;
    }
}
