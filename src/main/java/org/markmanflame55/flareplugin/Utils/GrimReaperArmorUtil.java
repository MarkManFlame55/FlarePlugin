package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.block.Chest;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ArmorMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.trim.ArmorTrim;
import org.bukkit.inventory.meta.trim.TrimMaterial;
import org.bukkit.inventory.meta.trim.TrimPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GrimReaperArmorUtil {

    public static ItemStack giveGrimHelmet() {

        ArmorTrim trim = new ArmorTrim(TrimMaterial.COPPER, TrimPattern.SENTRY);

        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta helmetMeta = (LeatherArmorMeta) helmet.getItemMeta();
        helmetMeta.setColor(Color.fromRGB(111,111,111));
        helmetMeta.setDisplayName(ChatColor.BLUE + "Grim Reaper Helmet");
        helmetMeta.setLocalizedName("grim_helmet");
        helmetMeta.addItemFlags(ItemFlag.HIDE_DYE);

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);

        helmetMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);

        List<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.GOLD + "Full Set Bonus: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "Death to Undeads");
        itemLore.add(ChatColor.WHITE + "Wearing full Grim Reaper set grants " + ChatColor.GREEN + "+50% Damage");
        itemLore.add(ChatColor.WHITE + "against all undead mobs");

        helmetMeta.setLore(itemLore);
        helmet.setItemMeta(helmetMeta);
        ArmorMeta helmetTrim = (ArmorMeta) helmet.getItemMeta();
        helmetTrim.setTrim(trim);
        helmetTrim.addItemFlags(ItemFlag.HIDE_ARMOR_TRIM);
        helmet.setItemMeta(helmetTrim);

        return helmet;
    }
    public static ItemStack giveGrimChestplate() {

        ArmorTrim trim = new ArmorTrim(TrimMaterial.COPPER, TrimPattern.WILD);

        ItemStack chestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
        ArmorMeta chestMeta = (ArmorMeta) chestplate.getItemMeta();
        chestMeta.setDisplayName(ChatColor.BLUE + "Grim Reaper Chestplate");
        chestMeta.setLocalizedName("grim_chestplate");
        chestMeta.setTrim(trim);
        chestMeta.addItemFlags(ItemFlag.HIDE_ARMOR_TRIM);

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 7, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        chestMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);

        List<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.GOLD + "Full Set Bonus: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "Death to Undeads");
        itemLore.add(ChatColor.WHITE + "Wearing full Grim Reaper set grants " + ChatColor.GREEN + "+50% Damage");
        itemLore.add(ChatColor.WHITE + "against all undead mobs");
        chestMeta.setLore(itemLore);

        chestplate.setItemMeta(chestMeta);
        return chestplate;
    }
    public static ItemStack giveGrimLeggings() {
        ArmorTrim trim = new ArmorTrim(TrimMaterial.COPPER, TrimPattern.TIDE);

        ItemStack leggings = new ItemStack(Material.CHAINMAIL_LEGGINGS);
        ArmorMeta legsMeta = (ArmorMeta) leggings.getItemMeta();
        legsMeta.setDisplayName(ChatColor.BLUE + "Grim Reaper Leggings");
        legsMeta.setLocalizedName("grim_leggings");
        legsMeta.setTrim(trim);
        legsMeta.addItemFlags(ItemFlag.HIDE_ARMOR_TRIM);

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 6, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);
        legsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);

        List<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.GOLD + "Full Set Bonus: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "Death to Undeads");
        itemLore.add(ChatColor.WHITE + "Wearing full Grim Reaper set grants " + ChatColor.GREEN + "+50% Damage");
        itemLore.add(ChatColor.WHITE + "against all undead mobs");
        legsMeta.setLore(itemLore);

        leggings.setItemMeta(legsMeta);
        return leggings;
    }
    public static ItemStack giveGrimBoots() {

        ArmorTrim trim = new ArmorTrim(TrimMaterial.COPPER, TrimPattern.SNOUT);

        ItemStack boots = new ItemStack(Material.CHAINMAIL_BOOTS);
        ArmorMeta bootMeta = (ArmorMeta) boots.getItemMeta();
        bootMeta.setDisplayName(ChatColor.BLUE + "Grim Reaper Boots");
        bootMeta.setLocalizedName("grim_boots");
        bootMeta.setTrim(trim);
        bootMeta.addItemFlags(ItemFlag.HIDE_ARMOR_TRIM);

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        bootMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);

        List<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.GOLD + "Full Set Bonus: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "Death to Undeads");
        itemLore.add(ChatColor.WHITE + "Wearing full Grim Reaper set grants " + ChatColor.GREEN + "+50% Damage");
        itemLore.add(ChatColor.WHITE + "against all undead mobs");
        bootMeta.setLore(itemLore);


        boots.setItemMeta(bootMeta);
        return boots;
    }
    public static ItemStack giveGrimArmor() {
        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta helmetMeta = (LeatherArmorMeta) helmet.getItemMeta();
        helmetMeta.setColor(Color.fromRGB(111,111,111));
        helmetMeta.setDisplayName(ChatColor.BLUE + "Grim Reaper Armor");

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");

        helmetMeta.setLore(itemLore);
        helmet.setItemMeta(helmetMeta);
        return helmet;
    }
    public static ItemStack giveUndeadChains() {
        ItemStack chains = new ItemStack(Material.CHAIN);
        ItemMeta itemMeta = chains.getItemMeta();
        itemMeta.setDisplayName(ChatColor.GREEN + "Undead Chains");
        itemMeta.setLocalizedName("undead_chains");
        chains.setItemMeta(itemMeta);
        return chains;
    }
    public static ItemStack giveChainsMenu() {
        ItemStack chains = new ItemStack(Material.CHAIN);
        ItemMeta itemMeta = chains.getItemMeta();
        itemMeta.setDisplayName(ChatColor.GREEN + "Undead Chains");

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");
        itemMeta.setLore(itemLore);

        chains.setItemMeta(itemMeta);
        return chains;
    }
}
