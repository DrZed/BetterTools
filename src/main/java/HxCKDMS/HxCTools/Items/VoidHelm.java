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

public class VoidHelm extends ItemArmor
{
    public UUID FollowUUID = UUID.fromString("e3ba58fd-5842-4dcf-95ab-afd11e8d72a4");
    public VoidHelm(ArmorMaterial Material, int a, int b)
    {
        super(Material, a, b);
        setTextureName(TextureHandler.VoidHelm);
        setNoRepair();
    }
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor)
    {
        player.heal(5);
        player.inventory.armorItemInSlot(2).setItemDamage(0);
        player.setAir(10);
        player.boundingBox.setBounds(0 , 0 , 0, 0 , 0 , 0);//testing purposes >:)
        IAttributeInstance pf = player.getAttributeMap().getAttributeInstance(SharedMonsterAttributes.followRange);
        AttributeModifier FollowBuff = new AttributeModifier(FollowUUID, "VoidHelmet", 0.0, 1);
        pf.removeModifier(FollowBuff);
        pf.applyModifier(FollowBuff);
    }
}
