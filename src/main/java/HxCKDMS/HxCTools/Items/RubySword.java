package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Creative.HxCToolsTab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class RubySword extends ItemSword
{
	public RubySword(Item.ToolMaterial material)
	{
		super(material);
		setCreativeTab(HxCToolsTab.HxCToolsTab);
		setUnlocalizedName("RubySword");
	}
}