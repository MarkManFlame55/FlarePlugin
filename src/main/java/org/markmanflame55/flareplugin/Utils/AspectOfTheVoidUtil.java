package org.markmanflame55.flareplugin.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.markmanflame55.flareplugin.FlarePlugin;

import java.util.ArrayList;

public class AspectOfTheVoidUtil {
    public static ItemStack giveAOTV() {
        ItemStack AOTV = new ItemStack(Material.DIAMOND_SHOVEL, 1);
        ItemMeta AOTVMeta = AOTV.getItemMeta();
        AOTVMeta.setDisplayName(ChatColor.DARK_PURPLE + "Aspect of the Void");
        AOTVMeta.addItemFlags();
        ArrayList<String> AOTVLore = new ArrayList<>();
        AOTVLore.add("");
        AOTVLore.add(ChatColor.GOLD + "Item Ability: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "INSTANT TRANSMISSION");
        AOTVLore.add(ChatColor.WHITE + "Teleport " + ChatColor.GREEN + "8 " + ChatColor.WHITE + "in front from where you are");
        AOTVMeta.setLore(AOTVLore);
        AOTVMeta.setUnbreakable(true);
        AOTV.setItemMeta(AOTVMeta);
        return AOTV;
    }
}
