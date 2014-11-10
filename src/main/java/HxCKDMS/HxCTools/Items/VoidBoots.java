package HxCKDMS.HxCTools.Items;

import HxCKDMS.HxCTools.Handling.TextureHandler;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.UUID;

public class VoidBoots extends ItemArmor
{
    public UUID KBRUUID = UUID.fromString("0b472ea5-7f57-49d1-8015-93dbc7114ceb");
    public VoidBoots(ArmorMaterial Material, int a, int b)
    {
        super(Material, a, b);
        setTextureName(TextureHandler.VoidBoots);
        setNoRepair();
    }
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor)
    {
        player.heal(5);
        player.inventory.armorItemInSlot(2).setItemDamage(0);
        player.capabilities.allowFlying = true;
        player.stepHeight = 1;
        world.extinguishFire(player, (int)player.posX, (int)player.posY, (int)player.posZ, 0);
        IAttributeInstance pkr = player.getAttributeMap().getAttributeInstance(SharedMonsterAttributes.knockbackResistance);
        AttributeModifier KBRBuff = new AttributeModifier(KBRUUID, "VoidBoots", 100, 1);
        pkr.removeModifier(KBRBuff);
        pkr.applyModifier(KBRBuff);
    }
}
