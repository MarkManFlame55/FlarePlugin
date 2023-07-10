package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class GhostAnihilatorUtil {
    public static ItemStack giveEctoplasm() {
        ItemStack ectoplasm = new ItemStack(Material.LIGHT_GRAY_DYE);
        ItemMeta itemMeta = ectoplasm.getItemMeta();
        itemMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        itemMeta.setDisplayName(ChatColor.BLUE + "Ectoplasm");
        ectoplasm.setItemMeta(itemMeta);
        return ectoplasm;
    }
    public static ItemStack giveEctoplasmMenu() {
        ItemStack ectoplasm = new ItemStack(Material.LIGHT_GRAY_DYE);
        ItemMeta itemMeta = ectoplasm.getItemMeta();
        itemMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        itemMeta.setDisplayName(ChatColor.BLUE + "Ectoplasm");

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");
        itemMeta.setLore(itemLore);

        ectoplasm.setItemMeta(itemMeta);
        return ectoplasm;
    }
    public static ItemStack giveAnnihilator() {
        ItemStack shield = new ItemStack(Material.SHIELD);
        ItemMeta itemMeta = shield.getItemMeta();
        itemMeta.setDisplayName(ChatColor.DARK_PURPLE + "Ghost Annihilator");
        itemMeta.setLocalizedName("ghost_annihilator");
        itemMeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, false);

        List<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.GOLD + "Item Ability: " + ChatColor.YELLOW + ""  + ChatColor.BOLD + "GHOSTBUSTERS");
        itemLore.add(ChatColor.WHITE + "Block the explosion of Ghosts to");
        itemLore.add(ChatColor.WHITE + "avoid their effects");
        itemMeta.setLore(itemLore);

        shield.setItemMeta(itemMeta);
        return shield;
    }
    public static ItemStack giveAnnihilatorMenu() {

        ItemStack shield = new ItemStack(Material.SHIELD);
        ItemMeta itemMeta = shield.getItemMeta();
        itemMeta.setDisplayName(ChatColor.DARK_PURPLE + "Ghost Annihilator");
        itemMeta.setLocalizedName("ghost_annihilator");
        itemMeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, false);

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");
        itemMeta.setLore(itemLore);

        shield.setItemMeta(itemMeta);
        return shield;
    }
}
