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

public class CustomTotemsUtil {

    public static ItemStack giveTankTotem() {
        ItemStack totem = new ItemStack(Material.TOTEM_OF_UNDYING);
        ItemMeta totemMeta = totem.getItemMeta();
        totemMeta.setDisplayName(ChatColor.GOLD + "Golem Totem");

        AttributeModifier armor= new AttributeModifier(UUID.randomUUID(), "generic.Armor", 4, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.OFF_HAND);
        AttributeModifier slow = new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", -0.05, AttributeModifier.Operation.MULTIPLY_SCALAR_1, EquipmentSlot.OFF_HAND);

        totemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);
        totemMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, slow);

        totem.setItemMeta(totemMeta);
        return totem;
    }
    public static ItemStack giveRunnerTotem() {
        ItemStack totem = new ItemStack(Material.TOTEM_OF_UNDYING);
        ItemMeta totemMeta = totem.getItemMeta();
        totemMeta.setDisplayName(ChatColor.GOLD + "Runner Totem");

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", 0.3, AttributeModifier.Operation.MULTIPLY_SCALAR_1, EquipmentSlot.OFF_HAND);
        totemMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, speed);

        totem.setItemMeta(totemMeta);
        return totem;
    }
    public static ItemStack giveVitalityTotem() {
        ItemStack totem = new ItemStack(Material.TOTEM_OF_UNDYING);
        ItemMeta totemMeta = totem.getItemMeta();
        totemMeta.setDisplayName(ChatColor.GOLD + "Vitality Totem");

        AttributeModifier health = new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", 4, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.OFF_HAND);
        totemMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, health);

        totem.setItemMeta(totemMeta);
        return totem;
    }
    public static ItemStack giveGTotem() {
        ItemStack totem = new ItemStack(Material.TOTEM_OF_UNDYING);
        ItemMeta totemMeta = totem.getItemMeta();
        totemMeta.setDisplayName(ChatColor.GOLD + "Golem Totem");
        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");
        totemMeta.setLore(itemLore);
        totem.setItemMeta(totemMeta);
        return totem;
    }
    public static ItemStack giveRTotem() {
        ItemStack totem = new ItemStack(Material.TOTEM_OF_UNDYING);
        ItemMeta totemMeta = totem.getItemMeta();
        totemMeta.setDisplayName(ChatColor.GOLD + "Runner Totem");
        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");
        totemMeta.setLore(itemLore);
        totem.setItemMeta(totemMeta);
        return totem;
    }
    public static ItemStack giveVTotem() {
        ItemStack totem = new ItemStack(Material.TOTEM_OF_UNDYING);
        ItemMeta totemMeta = totem.getItemMeta();
        totemMeta.setDisplayName(ChatColor.GOLD + "Vitality Totem");
        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");
        totemMeta.setLore(itemLore);
        totem.setItemMeta(totemMeta);
        return totem;
    }
}
