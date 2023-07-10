package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TokensUtil {
    public static ItemStack giveSeaArtifact() {
        ItemStack seaArtifact = new ItemStack(Material.HEART_OF_THE_SEA);
        ItemMeta artifactMeta = seaArtifact.getItemMeta();
        artifactMeta.setDisplayName(ChatColor.BLUE + "Sea Artifact");
        artifactMeta.setLocalizedName("sea_artifact");
        artifactMeta.addEnchant(Enchantment.DURABILITY, 1 ,false);
        artifactMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        artifactMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        AttributeModifier invisible = new AttributeModifier(UUID.randomUUID(),"lol",0.01, AttributeModifier.Operation.MULTIPLY_SCALAR_1, EquipmentSlot.HEAD);
        artifactMeta.addAttributeModifier(Attribute.GENERIC_LUCK, invisible);

        List<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.GOLD + "Item Ability: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "One with the sea");
        itemLore.add(ChatColor.WHITE + "Grants permanent Water Breathing and prevents Mining Fatigue");
        itemLore.add(ChatColor.WHITE + "while having this on the off hand");

        artifactMeta.setLore(itemLore);
        seaArtifact.setItemMeta(artifactMeta);
        return seaArtifact;
    }
    public static ItemStack giveSeaArtifactOnMenu() {

        ItemStack seaArtifact = new ItemStack(Material.HEART_OF_THE_SEA);
        ItemMeta artifactMeta = seaArtifact.getItemMeta();
        artifactMeta.setDisplayName(ChatColor.BLUE + "Sea Artifact");
        artifactMeta.setLocalizedName("sea_artifact");
        artifactMeta.addEnchant(Enchantment.DURABILITY, 1 ,false);
        artifactMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");

        artifactMeta.setLore(itemLore);
        seaArtifact.setItemMeta(artifactMeta);
        return seaArtifact;
    }
    public static ItemStack giveFlamingEssence() {

        ItemStack flameEssence = new ItemStack(Material.BLAZE_POWDER);
        ItemMeta essenceMeta = flameEssence.getItemMeta();
        essenceMeta.setDisplayName(ChatColor. BLUE + "Flaming Essence");
        essenceMeta.setLocalizedName("flame_essence");
        essenceMeta.addEnchant(Enchantment.DURABILITY, 1 ,false);
        essenceMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        List<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.GOLD + "Item Ability: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "Brute Force");
        itemLore.add(ChatColor.WHITE + "Increase your damage by 10%");
        essenceMeta.setLore(itemLore);

        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 0.10, AttributeModifier.Operation.MULTIPLY_SCALAR_1, EquipmentSlot.OFF_HAND);
        essenceMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);

        flameEssence.setItemMeta(essenceMeta);
        return flameEssence;
    }
    public static ItemStack giveEssOnMenu() {
        ItemStack flameEssence = new ItemStack(Material.BLAZE_POWDER);
        ItemMeta essenceMeta = flameEssence.getItemMeta();
        essenceMeta.setDisplayName(ChatColor. BLUE + "Flaming Essence");
        essenceMeta.setLocalizedName("flame_essence");
        essenceMeta.addEnchant(Enchantment.DURABILITY, 1 ,false);
        essenceMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");

        essenceMeta.setLore(itemLore);
        flameEssence.setItemMeta(essenceMeta);
        return flameEssence;
    }
}
