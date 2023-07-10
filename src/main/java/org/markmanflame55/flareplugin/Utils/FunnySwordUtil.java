package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.UUID;

public class FunnySwordUtil {
    public static ItemStack giveFunnySword() {
        ItemStack funnySword = new ItemStack(Material.WOODEN_SWORD);
        ItemMeta swordMeta = funnySword.getItemMeta();
        swordMeta.setDisplayName(ChatColor.RED + "Funny Sword");

        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 55, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier attackSpeed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed,", 1.6, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);

        swordMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);

        funnySword.setItemMeta(swordMeta);
        return funnySword;
    }
}
