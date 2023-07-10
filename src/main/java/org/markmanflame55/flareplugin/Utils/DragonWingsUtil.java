package org.markmanflame55.flareplugin.Utils;

import com.sun.source.doctree.AttributeTree;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.w3c.dom.Attr;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DragonWingsUtil {
    public static ItemStack giveCore() {
        ItemStack core = new ItemStack(Material.POPPED_CHORUS_FRUIT);
        ItemMeta itemMeta = core.getItemMeta();
        itemMeta.setDisplayName(ChatColor.DARK_PURPLE + "Wings Core");
        itemMeta.setLocalizedName("wigns_core");
        itemMeta.addEnchant(Enchantment.DURABILITY,1 , false);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        List<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.DARK_GRAY + "A powerful item that can");
        itemLore.add(ChatColor.DARK_GRAY + "be infused with strong materials and some wings");
        itemLore.add("");
        itemMeta.setLore(itemLore);

        core.setItemMeta(itemMeta);
        return core;
    }
    public static ItemStack giveCoreMenu() {
        ItemStack core = new ItemStack(Material.POPPED_CHORUS_FRUIT);
        ItemMeta itemMeta = core.getItemMeta();
        itemMeta.setDisplayName(ChatColor.DARK_PURPLE + "Wings Core");
        itemMeta.setLocalizedName("wigns_core");
        itemMeta.addEnchant(Enchantment.DURABILITY,1 , false);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");
        itemMeta.setLore(itemLore);

        core.setItemMeta(itemMeta);
        return core;
    }
    public static ItemStack giveGoldElytra() {
        ItemStack elytra = new ItemStack(Material.ELYTRA);
        ItemMeta itemMeta = elytra.getItemMeta();
        itemMeta.setDisplayName(ChatColor.GREEN + "Golden Armored Elytra");
        itemMeta.setLocalizedName("golden_armored_elytra");

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);

        elytra.setItemMeta(itemMeta);
        return elytra;
    }
    public static ItemStack giveGoldElytraMenu() {
        ItemStack elytra = new ItemStack(Material.ELYTRA);
        ItemMeta itemMeta = elytra.getItemMeta();
        itemMeta.setDisplayName(ChatColor.GREEN + "Golden Armored Elytra");
        itemMeta.setLocalizedName("golden_armored_elytra");

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");
        itemMeta.setLore(itemLore);

        elytra.setItemMeta(itemMeta);
        return elytra;
    }
    public static ItemStack giveIronElytra() {
        ItemStack elytra = new ItemStack(Material.ELYTRA);
        ItemMeta itemMeta = elytra.getItemMeta();
        itemMeta.setDisplayName(ChatColor.BLUE + "Iron Armored Elytra");
        itemMeta.setLocalizedName("iron_armored_elytra");

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 6, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);

        elytra.setItemMeta(itemMeta);
        return elytra;
    }
    public static ItemStack giveIronElytraMenu() {
        ItemStack elytra = new ItemStack(Material.ELYTRA);
        ItemMeta itemMeta = elytra.getItemMeta();
        itemMeta.setDisplayName(ChatColor.BLUE + "Iron Armored Elytra");
        itemMeta.setLocalizedName("iron_armored_elytra");

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 6, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");
        itemMeta.setLore(itemLore);

        elytra.setItemMeta(itemMeta);
        return elytra;
    }
    public static ItemStack giveDiamondElytra() {
        ItemStack elytra = new ItemStack(Material.ELYTRA);
        ItemMeta itemMeta = elytra.getItemMeta();
        itemMeta.setDisplayName(ChatColor.DARK_PURPLE + "Diamond Armored Elytra");
        itemMeta.setLocalizedName("diamond_armored_elytra");

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 8, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        AttributeModifier tought = new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, tought);

        elytra.setItemMeta(itemMeta);
        return elytra;
    }
    public static ItemStack giveDiamondElytraMenu() {
        ItemStack elytra = new ItemStack(Material.ELYTRA);
        ItemMeta itemMeta = elytra.getItemMeta();
        itemMeta.setDisplayName(ChatColor.DARK_PURPLE + "Diamond Armored Elytra");
        itemMeta.setLocalizedName("diamond_armored_elytra");

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 8, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        AttributeModifier tought = new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, tought);

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");
        itemMeta.setLore(itemLore);

        elytra.setItemMeta(itemMeta);
        return elytra;
    }
    public static ItemStack giveNetherElytra() {
        ItemStack elytra = new ItemStack(Material.ELYTRA);
        ItemMeta itemMeta = elytra.getItemMeta();
        itemMeta.setDisplayName(ChatColor.GOLD + "Netherite Armored Elytra");
        itemMeta.setLocalizedName("netherite_armored_elytra");

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 8, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        AttributeModifier tought = new AttributeModifier(UUID.randomUUID(), "generic.armorToughtness", 3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        AttributeModifier kb = new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", 0.1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, tought);
        itemMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, kb);

        elytra.setItemMeta(itemMeta);
        return elytra;
    }
    public static ItemStack giveNetherElytraMenu() {
        ItemStack elytra = new ItemStack(Material.ELYTRA);
        ItemMeta itemMeta = elytra.getItemMeta();
        itemMeta.setDisplayName(ChatColor.GOLD + "Netherite Armored Elytra");
        itemMeta.setLocalizedName("netherite_armored_elytra");

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 8, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        AttributeModifier tought = new AttributeModifier(UUID.randomUUID(), "generic.armorToughtness", 3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        AttributeModifier kb = new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", 0.1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, tought);
        itemMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, kb);

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");
        itemMeta.setLore(itemLore);

        elytra.setItemMeta(itemMeta);
        return elytra;
    }
}
