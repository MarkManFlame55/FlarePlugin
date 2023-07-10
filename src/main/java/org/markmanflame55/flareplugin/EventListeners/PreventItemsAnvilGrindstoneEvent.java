package org.markmanflame55.flareplugin.EventListeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.GrindstoneInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.StonecutterInventory;
import org.markmanflame55.flareplugin.Utils.InfiniCarrotsUtil;
import org.markmanflame55.flareplugin.Utils.InfinityStoneUtil;
import org.markmanflame55.flareplugin.Utils.RefinedGoldUtil;
import org.markmanflame55.flareplugin.Utils.steelIngotUtil;

public class PreventItemsAnvilGrindstoneEvent implements Listener {
    @EventHandler
    public void onTablesClick(InventoryClickEvent e) {
        ItemStack item = e.getCurrentItem();
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory() instanceof AnvilInventory) {
            if (item != null) {
                if (item.equals(steelIngotUtil.giveSteelIngot()) || item.equals(steelIngotUtil.giveSteelBlock()) || item.equals(InfinityStoneUtil.giveInfinityStone()) || item.equals(RefinedGoldUtil.giveRefinedGold())) {
                    p.sendMessage(ChatColor.RED + "You can not use this item here");
                    e.setCancelled(true);
                }
            }
        }
        if (e.getInventory() instanceof GrindstoneInventory) {
            if (item != null) {
                if (item.equals(steelIngotUtil.giveSteelIngot()) || item.equals(steelIngotUtil.giveSteelBlock()) || item.equals(InfinityStoneUtil.giveInfinityStone()) || item.equals(RefinedGoldUtil.giveRefinedGold())) {
                    p.sendMessage(ChatColor.RED + "You can not use this item here");
                    e.setCancelled(true);
                }
            }
        }
        if (e.getInventory() instanceof StonecutterInventory) {
            if (item != null) {
                if (item.equals(steelIngotUtil.giveSteelBlock())) {
                    p.sendMessage(ChatColor.RED + "You can not use this item here");
                    e.setCancelled(true);
                }
            }
        }
    }
}
