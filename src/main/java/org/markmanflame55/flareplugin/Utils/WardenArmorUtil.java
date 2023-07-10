package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.StonecutterInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.checkerframework.checker.units.qual.A;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class WardenArmorUtil {

    public static ItemStack giveWardenHelmet(){
        ItemStack wardenHelmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta helmetMeta = (LeatherArmorMeta) wardenHelmet.getItemMeta();
        helmetMeta.setUnbreakable(true);
        helmetMeta.setColor(Color.fromRGB(24,80,116));
        helmetMeta.addItemFlags(ItemFlag.HIDE_DYE);
        helmetMeta.setDisplayName(ChatColor.GOLD + "Warden Helmet");
        helmetMeta.setLocalizedName("warden_helmet");

        List<String> wardenLore = new ArrayList<>();
        wardenLore.add("");
        wardenLore.add(ChatColor.GOLD + "Full Set Bonus: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "UNDETECTABLE");
        wardenLore.add(ChatColor.WHITE + "While wearing the full Warden Set, the Sculk Sensor that");
        wardenLore.add(ChatColor.WHITE + "you activate wont alarm nearby Sculk Shriekers");
        helmetMeta.setLore(wardenLore);

        AttributeModifier prot = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        AttributeModifier tought = new AttributeModifier(UUID.randomUUID(), "generic.armorThoughness", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        AttributeModifier kb = new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", 0.1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        AttributeModifier damge = new AttributeModifier(UUID.randomUUID(), "generid.attackDamage", 1, AttributeModifier.Operation.ADD_NUMBER,EquipmentSlot.HEAD);



        helmetMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, prot);
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, tought);
        helmetMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, kb);
        helmetMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damge);

        wardenHelmet.setItemMeta(helmetMeta);
        return wardenHelmet;
    }
    public static ItemStack giveWardenChestplate() {
        ItemStack wardenChest = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta chestMeta = (LeatherArmorMeta)  wardenChest.getItemMeta();
        chestMeta.setUnbreakable(true);
        chestMeta.setColor(Color.fromRGB(17,118, 125));
        chestMeta.addItemFlags(ItemFlag.HIDE_DYE);
        chestMeta.setDisplayName(ChatColor.GOLD + "Warden Chestplate");
        chestMeta.setLocalizedName("warden_chestplate");

        List<String> wardenLore = new ArrayList<>();
        wardenLore.add("");
        wardenLore.add(ChatColor.GOLD + "Full Set Bonus: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "UNDETECTABLE");
        wardenLore.add(ChatColor.WHITE + "While wearing the full Warden Set, the Sculk Sensor that");
        wardenLore.add(ChatColor.WHITE + "you activate wont alarm nearby Sculk Shriekers");
        chestMeta.setLore(wardenLore);

        AttributeModifier prot = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 8, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        AttributeModifier tought = new AttributeModifier(UUID.randomUUID(), "generic.armorThoughness", 1,AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        AttributeModifier kb = new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", 0.1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        AttributeModifier damge = new AttributeModifier(UUID.randomUUID(), "generid.attackDamage", 1, AttributeModifier.Operation.ADD_NUMBER,EquipmentSlot.CHEST);

        chestMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, prot);
        chestMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, tought);
        chestMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, kb);
        chestMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damge);

        wardenChest.setItemMeta(chestMeta);
        return wardenChest;
    }
    public static ItemStack giveWardenLeggins() {
        ItemStack wardenLegs = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta legsMeta = (LeatherArmorMeta) wardenLegs.getItemMeta();
        legsMeta.setUnbreakable(true);
        legsMeta.setColor(Color.fromRGB(156,150,116));
        legsMeta.addItemFlags(ItemFlag.HIDE_DYE);
        legsMeta.setDisplayName(ChatColor.GOLD + "Warden Leggings");
        legsMeta.setLocalizedName("warden_leggings");

        List<String> wardenLore = new ArrayList<>();
        wardenLore.add("");
        wardenLore.add(ChatColor.GOLD + "Full Set Bonus: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "UNDETECTABLE");
        wardenLore.add(ChatColor.WHITE + "While wearing the full Warden Set, the Sculk Sensor that");
        wardenLore.add(ChatColor.WHITE + "you activate wont alarm nearby Sculk Shriekers");
        legsMeta.setLore(wardenLore);

        AttributeModifier prot = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 6, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);
        AttributeModifier tought = new AttributeModifier(UUID.randomUUID(), "generic.armorThoughness", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);
        AttributeModifier kb = new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", 0.1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);
        AttributeModifier damge = new AttributeModifier(UUID.randomUUID(), "generid.attackDamage", 1, AttributeModifier.Operation.ADD_NUMBER,EquipmentSlot.LEGS);

        legsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, prot);
        legsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, tought);
        legsMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, kb);
        legsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damge);

        wardenLegs.setItemMeta(legsMeta);
        return wardenLegs;
    }
    public static ItemStack giveWardenBoots() {
        ItemStack wardenBoots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta bootMeta = (LeatherArmorMeta) wardenBoots.getItemMeta();
        bootMeta.setUnbreakable(true);
        bootMeta.setColor(Color.fromRGB(24,80,116));
        bootMeta.addItemFlags(ItemFlag.HIDE_DYE);
        bootMeta.setDisplayName(ChatColor.GOLD + "Warden Boots");
        bootMeta.setLocalizedName("warden_boots");

        List<String> wardenLore = new ArrayList<>();
        wardenLore.add("");
        wardenLore.add(ChatColor.GOLD + "Full Set Bonus: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "UNDETECTABLE");
        wardenLore.add(ChatColor.WHITE + "While wearing the full Warden Set, the Sculk Sensor that");
        wardenLore.add(ChatColor.WHITE + "you activate wont alarm nearby Sculk Shriekers");
        bootMeta.setLore(wardenLore);

        AttributeModifier prot = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        AttributeModifier tought = new AttributeModifier(UUID.randomUUID(), "generic.armorThoughness", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        AttributeModifier kb = new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", 0.1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        AttributeModifier damge = new AttributeModifier(UUID.randomUUID(), "generid.attackDamage", 1, AttributeModifier.Operation.ADD_NUMBER,EquipmentSlot.FEET);

        bootMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, prot);
        bootMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, tought);
        bootMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, kb);
        bootMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damge);

        wardenBoots.setItemMeta(bootMeta);
        return wardenBoots;
    }
    public static ItemStack giveSculkFragment() {
        ItemStack sculkFrag = new ItemStack(Material.ECHO_SHARD);
        ItemMeta fragMeta = sculkFrag.getItemMeta();
        fragMeta.setDisplayName(ChatColor.DARK_PURPLE + "Sculk Fragment");
        fragMeta.addEnchant(Enchantment.DURABILITY, 1 ,false);
        fragMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        List<String> fragLore = new ArrayList<>();
        fragLore.add("");
        fragLore.add(ChatColor.DARK_GRAY + "You can hear far heartbeats when you");
        fragLore.add(ChatColor.DARK_GRAY + "bring it to your ear");
        fragMeta.setLore(fragLore);
        sculkFrag.setItemMeta(fragMeta);
        return sculkFrag;
    }
    public static ItemStack giveArmor() {

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");

        ItemStack item14 = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta item14Meta = (LeatherArmorMeta) item14.getItemMeta();
        item14Meta.setDisplayName(ChatColor.GOLD + "Warden Armor Set");
        item14Meta.setColor(Color.fromRGB(24,80,116));
        item14Meta.setLore(itemLore);
        item14.setItemMeta(item14Meta);

        return item14;
    }
    public static ItemStack giveFrag() {

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");

        ItemStack item15 = new ItemStack(Material.ECHO_SHARD);
        ItemMeta item15Meta = item15.getItemMeta();
        item15Meta.setDisplayName(ChatColor.DARK_PURPLE + "Sculk Fragment");
        item15Meta.addEnchant(Enchantment.DURABILITY, 1, false);
        item15Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item15Meta.setLore(itemLore);
        item15.setItemMeta(item15Meta);
        return item15;
    }
}
