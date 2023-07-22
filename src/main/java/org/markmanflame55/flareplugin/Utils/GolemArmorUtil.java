package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.entity.Item;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.checkerframework.checker.guieffect.qual.UI;
import org.w3c.dom.Attr;
import org.w3c.dom.html.HTMLDirectoryElement;

import java.util.ArrayList;
import java.util.UUID;

public class GolemArmorUtil {
    public static ItemStack giveHelmet() {
        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta helmMeta = (LeatherArmorMeta) helmet.getItemMeta();
        helmMeta.setDisplayName(ChatColor.BLUE + "Golem Helmet");
        helmMeta.setColor(Color.fromRGB(178,178,178));
        helmMeta.setUnbreakable(true);
        helmMeta.addItemFlags(ItemFlag.HIDE_DYE);

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        AttributeModifier tought = new AttributeModifier(UUID.randomUUID(), "generic.armorToughtness", 3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        AttributeModifier slow = new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", -0.05, AttributeModifier.Operation.MULTIPLY_SCALAR_1, EquipmentSlot.HEAD);
        AttributeModifier weak = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", -1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        AttributeModifier noKb = new AttributeModifier(UUID.randomUUID(), "generic.knockbackResitance", 0.25, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);

        helmMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);
        helmMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, tought);
        helmMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, slow);
        helmMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, weak);
        helmMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, noKb);

        helmet.setItemMeta(helmMeta);
        return helmet;
    }
    public static ItemStack giveChest() {
        ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta chestMeta = (LeatherArmorMeta) chest.getItemMeta();
        chestMeta.setDisplayName(ChatColor.BLUE + "Golem Chestplate");
        chestMeta.setColor(Color.fromRGB(178,178,178));
        chestMeta.setUnbreakable(true);
        chestMeta.addItemFlags(ItemFlag.HIDE_DYE);

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 10, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        AttributeModifier tought = new AttributeModifier(UUID.randomUUID(), "generic.armor.Toughness", 3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        AttributeModifier slow = new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", -0.05, AttributeModifier.Operation.MULTIPLY_SCALAR_1, EquipmentSlot.CHEST);
        AttributeModifier weak = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", -1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        AttributeModifier noKb = new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", 0.25, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);

        chestMeta.addAttributeModifier(Attribute.GENERIC_ARMOR,armor);
        chestMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, tought);
        chestMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, slow);
        chestMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, weak);
        chestMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, noKb);

        chest.setItemMeta(chestMeta);
        return chest;
    }
    public static ItemStack giveLegs() {
        ItemStack legs = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta legsMeta = (LeatherArmorMeta) legs.getItemMeta();
        legsMeta.setDisplayName(ChatColor.BLUE + "Golem Leggings");
        legsMeta.setColor(Color.fromRGB(178,178,178));
        legsMeta.setUnbreakable(true);
        legsMeta.addItemFlags(ItemFlag.HIDE_DYE);

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 8, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);
        AttributeModifier tought = new AttributeModifier(UUID.randomUUID(), "generic.armor.Toughness", 3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);
        AttributeModifier slow = new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", -0.05, AttributeModifier.Operation.MULTIPLY_SCALAR_1, EquipmentSlot.LEGS);
        AttributeModifier weak = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", -1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);
        AttributeModifier noKb = new AttributeModifier(UUID.randomUUID(), "generic.knockbackResitance", 0.25, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);

        legsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);
        legsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, tought);
        legsMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, slow);
        legsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, weak);
        legsMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, noKb);

        legs.setItemMeta(legsMeta);
        return legs;
    }
    public static ItemStack giveBoots() {
        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta bootsMeta = (LeatherArmorMeta) boots.getItemMeta();
        bootsMeta.setDisplayName(ChatColor.BLUE + "Golem Boots");
        bootsMeta.setColor(Color.fromRGB(178,178,178));
        bootsMeta.setUnbreakable(true);
        bootsMeta.addItemFlags(ItemFlag.HIDE_DYE);

        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        AttributeModifier tought = new AttributeModifier(UUID.randomUUID(), "generic.armor.Toughness", 3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        AttributeModifier slow = new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", -0.05, AttributeModifier.Operation.MULTIPLY_SCALAR_1, EquipmentSlot.FEET);
        AttributeModifier weak = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", -1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        AttributeModifier noKb = new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", 0.25, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);

        bootsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, tought);
        bootsMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, slow);
        bootsMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, weak);
        bootsMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, noKb);

        boots.setItemMeta(bootsMeta);
        return boots;
    }
    public static ItemStack giveArmor () {
        ItemStack giveArmor = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta meta = (LeatherArmorMeta) giveArmor.getItemMeta();
        meta.setDisplayName(ChatColor.BLUE + "Golem Armor Set");
        meta.setColor(Color.fromRGB(178,178,178));

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");

        meta.setLore(itemLore);
        giveArmor.setItemMeta(meta);
        return giveArmor;
    }
}
