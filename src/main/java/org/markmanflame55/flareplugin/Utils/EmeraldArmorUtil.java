package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.markmanflame55.flareplugin.EventListeners.PreventItemsAnvilGrindstoneEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

public class EmeraldArmorUtil {


    public static ItemStack giveRefinedEmerald() {
        ItemStack refinedEmerald = new ItemStack(Material.EMERALD);
        ItemMeta emeraldMeta = refinedEmerald.getItemMeta();
        emeraldMeta.setDisplayName(ChatColor.GREEN + "Refined Emerald");
        emeraldMeta.addEnchant(Enchantment.DURABILITY, 1 ,false);
        emeraldMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        refinedEmerald.setItemMeta(emeraldMeta);
        return refinedEmerald;
    }
    public static ItemStack giveRefinedEmeraldBLock () {
        ItemStack refinedEmeraldBlock = new ItemStack(Material.GREEN_GLAZED_TERRACOTTA);
        ItemMeta blockMeta = refinedEmeraldBlock.getItemMeta();
        blockMeta.setDisplayName(ChatColor.BLUE + "Refined Emerald Block");
        blockMeta.addEnchant(Enchantment.DURABILITY,1 , false);
        blockMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        refinedEmeraldBlock.setItemMeta(blockMeta);
        return refinedEmeraldBlock;
    }
    public static ItemStack giveEmeraldHelmet () {
        ItemStack emeraldHelm = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta helmMeta = (LeatherArmorMeta) emeraldHelm.getItemMeta();
        helmMeta.setDisplayName(ChatColor.BLUE + "Emerald Helmet");
        helmMeta.setLocalizedName("emerald_helmet");
        helmMeta.setUnbreakable(true);
        helmMeta.setColor(Color.fromRGB(41,220,41));
        helmMeta.addItemFlags(ItemFlag.HIDE_DYE);

        List<String> armorLore = new ArrayList<>();
        armorLore.add("");
        armorLore.add(ChatColor.GOLD + "Full Set Bonus: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "LUCKY DAY!");
        armorLore.add(ChatColor.WHITE + "Wearing full Emerald Set grants a 25% chance");
        armorLore.add(ChatColor.WHITE + "to get an extra drop from mining ores");
        helmMeta.setLore(armorLore);

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.armor", 2,AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        AttributeModifier luck = new AttributeModifier(UUID.randomUUID(), "generic.luck", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);

        helmMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);
        helmMeta.addAttributeModifier(Attribute.GENERIC_LUCK, luck);

        emeraldHelm.setItemMeta(helmMeta);
        return emeraldHelm;
    }
    public static ItemStack giveEmeraldChest () {
        ItemStack emeraldChest = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta chestMeta = (LeatherArmorMeta) emeraldChest.getItemMeta();
        chestMeta.setDisplayName(ChatColor.BLUE + "Emerald Chestplate");
        chestMeta.setLocalizedName("emerald_chestplate");
        chestMeta.setUnbreakable(true);
        chestMeta.setColor(Color.fromRGB(41,220,41));
        chestMeta.addItemFlags(ItemFlag.HIDE_DYE);

        List<String> armorLore = new ArrayList<>();
        armorLore.add("");
        armorLore.add(ChatColor.GOLD + "Full Set Bonus: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "LUCKY DAY!");
        armorLore.add(ChatColor.WHITE + "Wearing full Emerald Set grants a 25% chance");
        armorLore.add(ChatColor.WHITE + "to get an extra drop from mining ores");
        chestMeta.setLore(armorLore);

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.armor", 6,AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        AttributeModifier luck = new AttributeModifier(UUID.randomUUID(), "generic.luck", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);

        chestMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);
        chestMeta.addAttributeModifier(Attribute.GENERIC_LUCK, luck);

        emeraldChest.setItemMeta(chestMeta);

        return emeraldChest;
    }
    public static ItemStack giveEmeraldLegs () {
        ItemStack emeraldLegs = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta legsMeta = (LeatherArmorMeta) emeraldLegs.getItemMeta();
        legsMeta.setDisplayName(ChatColor.BLUE + "Emerald Leggings");
        legsMeta.setLocalizedName("emerald_leggings");
        legsMeta.setUnbreakable(true);
        legsMeta.setColor(Color.fromRGB(41,220,41));
        legsMeta.addItemFlags(ItemFlag.HIDE_DYE);

        List<String> armorLore = new ArrayList<>();
        armorLore.add("");
        armorLore.add(ChatColor.GOLD + "Full Set Bonus: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "LUCKY DAY!");
        armorLore.add(ChatColor.WHITE + "Wearing full Emerald Set grants a 25% chance");
        armorLore.add(ChatColor.WHITE + "to get an extra drop from mining ores");
        legsMeta.setLore(armorLore);

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.armor", 5,AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);
        AttributeModifier luck = new AttributeModifier(UUID.randomUUID(), "generic.luck", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);

        legsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);
        legsMeta.addAttributeModifier(Attribute.GENERIC_LUCK, luck);

        emeraldLegs.setItemMeta(legsMeta);

        return emeraldLegs;
    }
    public static ItemStack giveEmeraldBoots () {
        ItemStack emeraldBoots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta bootsMeta = (LeatherArmorMeta) emeraldBoots.getItemMeta();
        bootsMeta.setDisplayName(ChatColor.BLUE + "Emerald Boots");
        bootsMeta.setLocalizedName("emerald_boots");
        bootsMeta.setUnbreakable(true);
        bootsMeta.setColor(Color.fromRGB(41,220,41));
        bootsMeta.addItemFlags(ItemFlag.HIDE_DYE);

        List<String> armorLore = new ArrayList<>();
        armorLore.add("");
        armorLore.add(ChatColor.GOLD + "Full Set Bonus: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "LUCKY DAY!");
        armorLore.add(ChatColor.WHITE + "Wearing full Emerald Set grants a 25% chance");
        armorLore.add(ChatColor.WHITE + "to get an extra drop from mining ores");
        bootsMeta.setLore(armorLore);

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.armor", 2,AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        AttributeModifier luck = new AttributeModifier(UUID.randomUUID(), "generic.luck", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);

        bootsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);
        bootsMeta.addAttributeModifier(Attribute.GENERIC_LUCK, luck);

        emeraldBoots.setItemMeta(bootsMeta);

        return emeraldBoots;
    }
    public static ItemStack giveArmor() {
        ItemStack giveArmor = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta meta = (LeatherArmorMeta) giveArmor.getItemMeta();
        meta.setDisplayName(ChatColor.BLUE + "Emerald Armor Set");
        meta.setColor(Color.fromRGB(41,220,41));

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");

        meta.setLore(itemLore);
        giveArmor.setItemMeta(meta);
        return giveArmor;
    }
}
