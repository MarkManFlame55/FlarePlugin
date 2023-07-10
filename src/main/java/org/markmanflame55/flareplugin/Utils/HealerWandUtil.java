package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;



public class HealerWandUtil {
    public static ItemStack giveHealerWand() {
        ItemStack healingWand = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemMeta hwMeta = healingWand.getItemMeta();
        hwMeta.setDisplayName(ChatColor.GOLD + "Healer Wand");
        ArrayList<String> hwLore = new ArrayList<>();
        hwLore.add("");
        hwLore.add(ChatColor.GOLD + "Item Ability: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "HEAL UP");
        hwLore.add(ChatColor.YELLOW + "Right Click: " + ChatColor.WHITE + "Heal yourself" + ChatColor.DARK_GRAY + " (6s cooldown)");
        hwLore.add(ChatColor.YELLOW + "Hit an Entity: " + ChatColor.WHITE + "Heal what you hit" + ChatColor.DARK_GRAY + " (10s cooldown)");
        hwMeta.setUnbreakable(true);
        hwMeta.setLore(hwLore);
        healingWand.setItemMeta(hwMeta);

        return healingWand;
    }
}
