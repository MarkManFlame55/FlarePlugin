package org.markmanflame55.flareplugin.EventListeners;

import com.google.common.escape.Escaper;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.*;
import org.markmanflame55.flareplugin.Utils.DiamondDrillUtil;
import org.markmanflame55.flareplugin.Utils.IronDrillUtil;

import java.util.ArrayList;

public class DiamondDrillEvent implements Listener {

    BlockFace blockFace = null;
    @EventHandler
    public void onClick(PlayerInteractEvent e) {
        if (e.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
            blockFace = e.getBlockFace();
        }
        else {
            return;
        }
    }
    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        Player p = e.getPlayer();
        Block block = e.getBlock();
        ItemStack item = p.getInventory().getItemInMainHand();
        if (item.getItemMeta() != null) {
            if (item.getItemMeta().getLocalizedName().equalsIgnoreCase("diamond_drill")) {
                if (blockFace.equals(BlockFace.UP) || blockFace.equals(BlockFace.DOWN)) {
                    ArrayList<Block> minedArea = new ArrayList<>();
                    Block bl1 = block.getRelative(BlockFace.EAST);
                    minedArea.add(bl1);
                    Block bl2 = block.getRelative(BlockFace.WEST);
                    minedArea.add(bl2);
                    Block bl3 = block.getRelative(BlockFace.NORTH);
                    minedArea.add(bl3);
                    Block bl4 = block.getRelative(BlockFace.SOUTH);
                    minedArea.add(bl4);
                    Block bl5 = block.getRelative(BlockFace.SOUTH_WEST);
                    minedArea.add(bl5);
                    Block bl6 = block.getRelative(BlockFace.SOUTH_EAST);
                    minedArea.add(bl6);
                    Block bl7 = block.getRelative(BlockFace.NORTH_EAST);
                    minedArea.add(bl7);
                    Block bl8 = block.getRelative(BlockFace.NORTH_WEST);
                    minedArea.add(bl8);
                    Block bl9 = bl8.getRelative(BlockFace.WEST);
                    minedArea.add(bl9);
                    Block bl10 = bl8.getRelative(BlockFace.NORTH_WEST);
                    minedArea.add(bl10);
                    Block bl11 = bl8.getRelative(BlockFace.NORTH);
                    minedArea.add(bl11);
                    Block bl12 = bl3.getRelative(BlockFace.NORTH);
                    minedArea.add(bl12);
                    Block bl13 = bl7.getRelative(BlockFace.NORTH);
                    minedArea.add(bl13);
                    Block bl14 = bl7.getRelative(BlockFace.NORTH_EAST);
                    minedArea.add(bl14);
                    Block bl15 = bl7.getRelative(BlockFace.EAST);
                    minedArea.add(bl15);
                    Block bl16 = bl1.getRelative(BlockFace.EAST);
                    minedArea.add(bl16);
                    Block bl17 = bl6.getRelative(BlockFace.EAST);
                    minedArea.add(bl17);
                    Block bl18 = bl6.getRelative(BlockFace.SOUTH_EAST);
                    minedArea.add(bl18);
                    Block bl19 = bl6.getRelative(BlockFace.SOUTH);
                    minedArea.add(bl19);
                    Block bl20 = bl4.getRelative(BlockFace.SOUTH);
                    minedArea.add(bl20);
                    Block bl21 = bl5.getRelative(BlockFace.SOUTH);
                    minedArea.add(bl21);
                    Block bl22 = bl5.getRelative(BlockFace.SOUTH_WEST);
                    minedArea.add(bl22);
                    Block bl23 = bl5.getRelative(BlockFace.WEST);
                    minedArea.add(bl23);
                    Block bl24 = bl2.getRelative(BlockFace.WEST);
                    minedArea.add(bl24);

                    for (Block i : minedArea) {
                        if (i.getType() != Material.BEDROCK) {
                            i.breakNaturally();
                        }
                    }
                }
                if (blockFace.equals(BlockFace.NORTH) || (blockFace.equals(BlockFace.SOUTH))) {
                    ArrayList<Block> minedArea = new ArrayList<>();
                    Block bl1 = block.getRelative(BlockFace.EAST);
                    minedArea.add(bl1);
                    Block bl2 = block.getRelative(BlockFace.WEST);
                    minedArea.add(bl2);
                    Block bl3 = block.getRelative(BlockFace.UP);
                    minedArea.add(bl3);
                    Block bl4 = block.getRelative(BlockFace.DOWN);
                    minedArea.add(bl4);
                    Block bl5 = bl1.getRelative(BlockFace.UP);
                    minedArea.add(bl5);
                    Block bl6 = bl1.getRelative(BlockFace.DOWN);
                    minedArea.add(bl6);
                    Block bl7 = bl2.getRelative(BlockFace.UP);
                    minedArea.add(bl7);
                    Block bl8 = bl2.getRelative(BlockFace.DOWN);
                    minedArea.add(bl8);
                    Block bl9 = bl1.getRelative(BlockFace.EAST);
                    minedArea.add(bl9);
                    Block bl10 = bl5.getRelative(BlockFace.EAST);
                    minedArea.add(bl10);
                    Block bl11 = bl10.getRelative(BlockFace.UP);
                    minedArea.add(bl11);
                    Block bl12 = bl5.getRelative(BlockFace.UP);
                    minedArea.add(bl12);
                    Block bl13 = bl3.getRelative(BlockFace.UP);
                    minedArea.add(bl13);
                    Block bl14 = bl7.getRelative(BlockFace.UP);
                    minedArea.add(bl14);
                    Block bl15 = bl14.getRelative(BlockFace.WEST);
                    minedArea.add(bl15);
                    Block bl16 = bl7.getRelative(BlockFace.WEST);
                    minedArea.add(bl16);
                    Block bl17 = bl2.getRelative(BlockFace.WEST);
                    minedArea.add(bl17);
                    Block bl18 = bl8.getRelative(BlockFace.WEST);
                    minedArea.add(bl18);
                    Block bl19 = bl18.getRelative(BlockFace.DOWN);
                    minedArea.add(bl19);
                    Block bl20 = bl8.getRelative(BlockFace.DOWN);
                    minedArea.add(bl20);
                    Block bl21 = bl4.getRelative(BlockFace.DOWN);
                    minedArea.add(bl21);
                    Block bl22 = bl6.getRelative(BlockFace.DOWN);
                    minedArea.add(bl22);
                    Block bl23 = bl22.getRelative(BlockFace.EAST);
                    minedArea.add(bl23);
                    Block bl24 = bl6.getRelative(BlockFace.EAST);
                    minedArea.add(bl24);

                    for (Block i : minedArea) {
                        if (i.getType() != Material.BEDROCK) {
                            i.breakNaturally();
                        }
                    }
                }
                if (blockFace.equals(BlockFace.EAST) || (blockFace.equals(BlockFace.WEST))) {
                    ArrayList<Block> minedArea = new ArrayList<>();
                    Block bl1 = block.getRelative(BlockFace.NORTH);
                    minedArea.add(bl1);
                    Block bl2 = block.getRelative(BlockFace.SOUTH);
                    minedArea.add(bl2);
                    Block bl3 = block.getRelative(BlockFace.UP);
                    minedArea.add(bl3);
                    Block bl4 = block.getRelative(BlockFace.DOWN);
                    minedArea.add(bl4);
                    Block bl5 = bl1.getRelative(BlockFace.UP);
                    minedArea.add(bl5);
                    Block bl6 = bl1.getRelative(BlockFace.DOWN);
                    minedArea.add(bl6);
                    Block bl7 = bl2.getRelative(BlockFace.UP);
                    minedArea.add(bl7);
                    Block bl8 = bl2.getRelative(BlockFace.DOWN);
                    minedArea.add(bl8);
                    Block bl9 = bl1.getRelative(BlockFace.NORTH);
                    minedArea.add(bl9);
                    Block bl10 = bl5.getRelative(BlockFace.NORTH);
                    minedArea.add(bl10);
                    Block bl11 = bl10.getRelative(BlockFace.UP);
                    minedArea.add(bl11);
                    Block bl12 = bl5.getRelative(BlockFace.UP);
                    minedArea.add(bl12);
                    Block bl13 = bl3.getRelative(BlockFace.UP);
                    minedArea.add(bl13);
                    Block bl14 = bl7.getRelative(BlockFace.UP);
                    minedArea.add(bl14);
                    Block bl15 = bl14.getRelative(BlockFace.SOUTH);
                    minedArea.add(bl15);
                    Block bl16 = bl7.getRelative(BlockFace.SOUTH);
                    minedArea.add(bl16);
                    Block bl17 = bl2.getRelative(BlockFace.SOUTH);
                    minedArea.add(bl17);
                    Block bl18 = bl8.getRelative(BlockFace.SOUTH);
                    minedArea.add(bl18);
                    Block bl19 = bl18.getRelative(BlockFace.DOWN);
                    minedArea.add(bl19);
                    Block bl20 = bl8.getRelative(BlockFace.DOWN);
                    minedArea.add(bl20);
                    Block bl21 = bl4.getRelative(BlockFace.DOWN);
                    minedArea.add(bl21);
                    Block bl22 = bl6.getRelative(BlockFace.DOWN);
                    minedArea.add(bl22);
                    Block bl23 = bl22.getRelative(BlockFace.NORTH);
                    minedArea.add(bl23);
                    Block bl24 = bl6.getRelative(BlockFace.NORTH);
                    minedArea.add(bl24);

                    for (Block i : minedArea) {
                        if (i.getType() != Material.BEDROCK) {
                            i.breakNaturally();
                        }
                    }
                }
            }
        }
    }
    @EventHandler
    public void onTablesClick(InventoryClickEvent e){
        ItemStack item = e.getCurrentItem();
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory() instanceof AnvilInventory) {
            if (item != null) {
                if (item.getItemMeta() != null) {
                    if (item.getItemMeta().getLocalizedName().equalsIgnoreCase("diamond_drill")) {
                        p.sendMessage(ChatColor.RED + "You can not use this item here");
                        e.setCancelled(true);
                    }
                }
            }
        }
        if (e.getInventory() instanceof EnchantingInventory) {
            if (item != null) {
                if (item.getItemMeta() != null) {
                    if (item.getItemMeta().getLocalizedName().equalsIgnoreCase("diamond_drill")) {
                        p.sendMessage(ChatColor.RED + "You can not use this item here");
                        e.setCancelled(true);
                    }
                }
            }
        }
        if (e.getInventory() instanceof GrindstoneInventory) {
            if (item != null) {
                if (item.getItemMeta() != null) {
                    if (item.getItemMeta().getLocalizedName().equalsIgnoreCase("diamond_drill")) {
                        p.sendMessage(ChatColor.RED + "You can not use this item here");
                        e.setCancelled(true);
                    }
                }
            }
        }
        if (e.getInventory() instanceof SmithingInventory) {
            if (item != null) {
                if (item.getItemMeta() != null) {
                    if (item.getItemMeta().getLocalizedName().equalsIgnoreCase("diamond_drill")) {
                        p.sendMessage(ChatColor.RED + "You can not use this item here");
                        e.setCancelled(true);
                    }
                }
            }
        }
    }
}
