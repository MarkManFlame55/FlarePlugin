package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class VampireSword {
    public static ItemStack giveVampireSword () {
        ItemStack sword = new ItemStack(Material.IRON_SWORD);
        ItemMeta itemMeta = sword.getItemMeta();
        itemMeta.setDisplayName(ChatColor.GREEN + "Vampire Sword");
        itemMeta.setLocalizedName("vampire_sword");

        List<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.GOLD + "Item Ability: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "BLOODY HITS");
        itemLore.add(ChatColor.WHITE + "Heal for" + ChatColor.RED + " 0.5❤ " + ChatColor.WHITE + "per hit with this sword");
        itemLore.add(ChatColor.DARK_GRAY + "+50% Damage against Vampires and Spiders");

        itemMeta.setLore(itemLore);
        sword.setItemMeta(itemMeta);

        return sword;
    }
    public static ItemStack giveMenu() {
        ItemStack sword = new ItemStack(Material.IRON_SWORD);
        ItemMeta itemMeta = sword.getItemMeta();
        itemMeta.setDisplayName(ChatColor.GREEN + "Vampire Sword");
        itemMeta.setLocalizedName("vampire_sword");

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");

        itemMeta.setLore(itemLore);
        sword.setItemMeta(itemMeta);

        return sword;
    }
    public static ItemStack giveVampireFang() {
        ItemStack fang = new ItemStack(Material.GHAST_TEAR);
        ItemMeta itemMeta = fang.getItemMeta();
        itemMeta.setLocalizedName("vampire_fang");
        itemMeta.setDisplayName(ChatColor.GREEN + "Vampire Fang");
        itemMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        fang.setItemMeta(itemMeta);
        return fang;
    }
    public static ItemStack giveFangMenu() {
        ItemStack fang = new ItemStack(Material.GHAST_TEAR);
        ItemMeta itemMeta = fang.getItemMeta();
        itemMeta.setLocalizedName("vampire_fang");
        itemMeta.setDisplayName(ChatColor.GREEN + "Vampire Fang");
        itemMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");

        itemMeta.setLore(itemLore);
        fang.setItemMeta(itemMeta);
        return fang;
    }
    public static ItemStack giveBloodBlade() {
        ItemStack blade = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta itemMeta = blade.getItemMeta();
        itemMeta.setLocalizedName("blood_blade");
        itemMeta.setDisplayName(ChatColor.GREEN + "Blood Blade");
        blade.setItemMeta(itemMeta);
        return blade;
    }
    public static ItemStack giveBladeMenu() {
        ItemStack blade = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta itemMeta = blade.getItemMeta();
        itemMeta.setLocalizedName("blood_blade");
        itemMeta.setDisplayName(ChatColor.GREEN + "Blood Blade");

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add("");
        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");

        itemMeta.setLore(itemLore);
        blade.setItemMeta(itemMeta);

        return blade;
    }
}
