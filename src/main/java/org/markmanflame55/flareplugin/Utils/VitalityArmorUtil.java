package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.UUID;

public class VitalityArmorUtil {
    public static ItemStack giveHelmet() {
        ItemStack helmet = new ItemStack(Material.GOLDEN_HELMET);
        ItemMeta helmetMeta = helmet.getItemMeta();
        helmetMeta.setDisplayName(ChatColor.DARK_PURPLE + "Vitality Helmet");
        helmetMeta.setUnbreakable(true);

        AttributeModifier health = new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", 3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);

        helmetMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, health);

        helmet.setItemMeta(helmetMeta);
        return helmet;
    }
    public static ItemStack giveChest() {
        ItemStack chest = new ItemStack(Material.GOLDEN_CHESTPLATE);
        ItemMeta chestMeta = chest.getItemMeta();
        chestMeta.setDisplayName(ChatColor.DARK_PURPLE + "Vitality Chestplate");
        chestMeta.setUnbreakable(true);

        AttributeModifier health = new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", 8, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);

        chestMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, health);

        chest.setItemMeta(chestMeta);
        return chest;
    }
    public static ItemStack giveLegs() {
        ItemStack legs = new ItemStack(Material.GOLDEN_LEGGINGS);
        ItemMeta legsMeta = legs.getItemMeta();
        legsMeta.setDisplayName(ChatColor.DARK_PURPLE + "Vitality Leggings");
        legsMeta.setUnbreakable(true);

        AttributeModifier health = new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", 6, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);

        legsMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, health);

        legs.setItemMeta(legsMeta);
        return legs;
    }
    public static ItemStack giveBoots() {
        ItemStack boots = new ItemStack(Material.GOLDEN_BOOTS);
        ItemMeta bootsMeta = boots.getItemMeta();
        bootsMeta.setDisplayName(ChatColor.DARK_PURPLE + "Vitality Boots");
        bootsMeta.setUnbreakable(true);

        AttributeModifier health = new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", 3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);

        bootsMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, health);

        boots.setItemMeta(bootsMeta);
        return boots;
    }
    public static ItemStack giveArmor() {
        ItemStack helmet = new ItemStack(Material.GOLDEN_HELMET);
        ItemMeta helmetMeta = helmet.getItemMeta();
        helmetMeta.setDisplayName(ChatColor.DARK_PURPLE + "Vitality Armor Set");
        helmetMeta.setUnbreakable(true);

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");

        helmetMeta.setLore(itemLore);
        helmet.setItemMeta(helmetMeta);
        return helmet;
    }
}
