package org.markmanflame55.flareplugin.Utils;

import com.google.gson.JsonStreamParser;
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

import java.util.ArrayList;
import java.util.UUID;

public class RunnerArmorUtil {
    public static ItemStack giveSugarBlock() {
        ItemStack sugarBlock = new ItemStack(Material.WHITE_CONCRETE_POWDER);
        ItemMeta blockMeta = sugarBlock.getItemMeta();
        blockMeta.setDisplayName(ChatColor.WHITE + "Sugar Block");
        sugarBlock.setItemMeta(blockMeta);
        return sugarBlock;
    }
    public static ItemStack giveHelmet(){
        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta helmetMeta = (LeatherArmorMeta) helmet.getItemMeta();
        helmetMeta.setDisplayName(ChatColor.BLUE + "Runner Cap");
        helmetMeta.setColor(Color.fromRGB(255,255,255));
        helmetMeta.addItemFlags(ItemFlag.HIDE_DYE);
        helmetMeta.setUnbreakable(true);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", 0.2, AttributeModifier.Operation.MULTIPLY_SCALAR_1, EquipmentSlot.HEAD);
        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);

        helmetMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);
        helmetMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, speed);

        helmet.setItemMeta(helmetMeta);
        return helmet;
    }
    public static ItemStack giveChest() {
        ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta chestMeta = (LeatherArmorMeta) chest.getItemMeta();
        chestMeta.setDisplayName(ChatColor.BLUE + "Runner Tunic");
        chestMeta.setColor(Color.fromRGB(255,255,255));
        chestMeta.addItemFlags(ItemFlag.HIDE_DYE);
        chestMeta.setUnbreakable(true);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", 0.2, AttributeModifier.Operation.MULTIPLY_SCALAR_1, EquipmentSlot.CHEST);
        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 6, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);

        chestMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);
        chestMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, speed);

        chest.setItemMeta(chestMeta);
        return chest;
    }
    public static ItemStack giveLegs() {
        ItemStack legs = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta legsMeta = (LeatherArmorMeta) legs.getItemMeta();
        legsMeta.setDisplayName(ChatColor.BLUE + "Runner Pants");
        legsMeta.setColor(Color.fromRGB(255,255,255));
        legsMeta.addItemFlags(ItemFlag.HIDE_DYE);
        legsMeta.setUnbreakable(true);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", 0.2, AttributeModifier.Operation.MULTIPLY_SCALAR_1, EquipmentSlot.LEGS);
        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);

        legsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);
        legsMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, speed);

        legs.setItemMeta(legsMeta);
        return legs;
    }
    public static ItemStack giveBoots() {
        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta bootsMeta = (LeatherArmorMeta) boots.getItemMeta();
        bootsMeta.setDisplayName(ChatColor.BLUE + "Runner Boots");
        bootsMeta.setColor(Color.fromRGB(255,255,255));
        bootsMeta.addItemFlags(ItemFlag.HIDE_DYE);
        bootsMeta.setUnbreakable(true);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", 0.4, AttributeModifier.Operation.MULTIPLY_SCALAR_1, EquipmentSlot.FEET);
        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "generic.Armor", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);

        bootsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);
        bootsMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, speed);

        boots.setItemMeta(bootsMeta);
        return boots;
    }
    public static ItemStack giveArmor() {
        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta helmetMeta = (LeatherArmorMeta) helmet.getItemMeta();
        helmetMeta.setDisplayName(ChatColor.BLUE + "Runner Armor Set");
        helmetMeta.setColor(Color.fromRGB(255,255,255));

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");

        helmetMeta.setLore(itemLore);
        helmet.setItemMeta(helmetMeta);
        return helmet;
    }
}
