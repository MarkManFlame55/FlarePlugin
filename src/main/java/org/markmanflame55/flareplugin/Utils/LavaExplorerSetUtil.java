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
import org.w3c.dom.Attr;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LavaExplorerSetUtil {
    public static ItemStack giveHelmet() {
        ItemStack lavaHelmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta helmetMeta = (LeatherArmorMeta) lavaHelmet.getItemMeta();
        helmetMeta.setDisplayName(ChatColor.DARK_PURPLE + "Lava Explorer Helmet");
        helmetMeta.setLocalizedName("lava_helmet");
        helmetMeta.addItemFlags(ItemFlag.HIDE_DYE);
        helmetMeta.setUnbreakable(true);
        helmetMeta.setColor(Color.fromRGB(255,37,0));

        List<String> armorLore = new ArrayList<>();
        armorLore.add("");
        armorLore.add(ChatColor.GOLD + "Full Set Bonus: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "Nether Explorer");
        armorLore.add(ChatColor.WHITE + "Wearing the full set will grant you");
        armorLore.add(ChatColor.WHITE + "permanent Fire Resistant Effect");

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);

        helmetMeta.setLore(armorLore);
        lavaHelmet.setItemMeta(helmetMeta);
        return lavaHelmet;
    }
    public static ItemStack giveChest(){
        ItemStack lavaChest = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta chestMeta = (LeatherArmorMeta) lavaChest.getItemMeta();
        chestMeta.setDisplayName(ChatColor.DARK_PURPLE + "Lava Explorer Chestplate");
        chestMeta.setLocalizedName("lava_chestplate");
        chestMeta.addItemFlags(ItemFlag.HIDE_DYE);
        chestMeta.setUnbreakable(true);
        chestMeta.setColor(Color.fromRGB(255,102,0));

        List<String> armorLore = new ArrayList<>();
        armorLore.add("");
        armorLore.add(ChatColor.GOLD + "Full Set Bonus: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "Nether Explorer");
        armorLore.add(ChatColor.WHITE + "Wearing the full set will grant you");
        armorLore.add(ChatColor.WHITE + "permanent Fire Resistant Effect");

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 8, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        chestMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);

        chestMeta.setLore(armorLore);
        lavaChest.setItemMeta(chestMeta);
        return lavaChest;
    }
    public static ItemStack giveLegs() {
        ItemStack lavaLegs = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta legsMeta = (LeatherArmorMeta) lavaLegs.getItemMeta();
        legsMeta.setDisplayName(ChatColor.DARK_PURPLE + "Lava Explorer Leggings");
        legsMeta.setLocalizedName("lava_leggings");
        legsMeta.addItemFlags(ItemFlag.HIDE_DYE);
        legsMeta.setUnbreakable(true);
        legsMeta.setColor(Color.fromRGB(249,161,0));

        List<String> armorLore = new ArrayList<>();
        armorLore.add("");
        armorLore.add(ChatColor.GOLD + "Full Set Bonus: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "Nether Explorer");
        armorLore.add(ChatColor.WHITE + "Wearing the full set will grant you");
        armorLore.add(ChatColor.WHITE + "permanent Fire Resistant Effect");

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 6, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);
        legsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);

        legsMeta.setLore(armorLore);
        lavaLegs.setItemMeta(legsMeta);
        return lavaLegs;
    }
    public static ItemStack giveBoots() {
        ItemStack lavaBoots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta bootsMeta = (LeatherArmorMeta) lavaBoots.getItemMeta();
        bootsMeta.setDisplayName(ChatColor.DARK_PURPLE + "Lava Explorer Boots");
        bootsMeta.setLocalizedName("lava_boots");
        bootsMeta.addItemFlags(ItemFlag.HIDE_DYE);
        bootsMeta.setUnbreakable(true);
        bootsMeta.setColor(Color.fromRGB(242,242,23));

        List<String> armorLore = new ArrayList<>();
        armorLore.add("");
        armorLore.add(ChatColor.GOLD + "Full Set Bonus: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "Nether Explorer");
        armorLore.add(ChatColor.WHITE + "Wearing the full set will grant you");
        armorLore.add(ChatColor.WHITE + "permanent Fire Resistant Effect");

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", 0.1, AttributeModifier.Operation.MULTIPLY_SCALAR_1, EquipmentSlot.FEET);
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);
        bootsMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, speed);

        bootsMeta.setLore(armorLore);
        lavaBoots.setItemMeta(bootsMeta);
        return lavaBoots;
    }
    public static ItemStack giveArmor() {
        ItemStack lavaHelmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta helmetMeta = (LeatherArmorMeta) lavaHelmet.getItemMeta();
        helmetMeta.setDisplayName(ChatColor.DARK_PURPLE + "Lava Explorer Armor Set");
        helmetMeta.setLocalizedName("lava_armor_give");
        helmetMeta.setColor(Color.fromRGB(255,37,0));

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");

        helmetMeta.setLore(itemLore);
        lavaHelmet.setItemMeta(helmetMeta);
        return lavaHelmet;
    }
    public static ItemStack giveFilament() {
        ItemStack filament = new ItemStack(Material.STRING);
        ItemMeta filaMeta = filament.getItemMeta();
        filaMeta.setDisplayName(ChatColor.GREEN + "Strider Filament");
        filaMeta.setLocalizedName("strider_filament");
        filaMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        filaMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        filament.setItemMeta(filaMeta);
        return filament;
    }
    public static ItemStack giveFilaMenu() {
        ItemStack filament = new ItemStack(Material.STRING);
        ItemMeta filaMeta = filament.getItemMeta();
        filaMeta.setDisplayName(ChatColor.GREEN + "Strider Filament");
        filaMeta.setLocalizedName("strider_filament");
        filaMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        filaMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        filament.setItemMeta(filaMeta);

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");
        filaMeta.setLore(itemLore);
        filament.setItemMeta(filaMeta);
        return filament;
    }
    public static ItemStack givePiglinBuckle() {
        ItemStack piglinBuckle = new ItemStack(Material.GOLD_NUGGET);
        ItemMeta buckleMeta = piglinBuckle.getItemMeta();
        buckleMeta.setDisplayName(ChatColor.GREEN + "Piglin Buckle");
        buckleMeta.setLocalizedName("piglin_buckle");
        buckleMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        buckleMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        piglinBuckle.setItemMeta(buckleMeta);
        return piglinBuckle;
    }
    public static ItemStack giveBuckleMenu() {
        ItemStack piglinBuckle = new ItemStack(Material.GOLD_NUGGET);
        ItemMeta buckleMeta = piglinBuckle.getItemMeta();
        buckleMeta.setDisplayName(ChatColor.GREEN + "Piglin Buckle");
        buckleMeta.setLocalizedName("piglin_buckle");
        buckleMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        buckleMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");
        buckleMeta.setLore(itemLore);
        piglinBuckle.setItemMeta(buckleMeta);
        return piglinBuckle;
    }
}