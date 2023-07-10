package org.markmanflame55.flareplugin.EventListeners;

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
import org.markmanflame55.flareplugin.Utils.NetheriteDrillUtil;
import java.util.ArrayList;

public class NetherDrillEvent implements Listener {

    BlockFace blockFace = null;
    @EventHandler
    public void onLeftClick(PlayerInteractEvent e){
        Player p = e.getPlayer();
        if(e.getAction().equals(Action.LEFT_CLICK_BLOCK)){
            blockFace = e.getBlockFace();
        }
    }
    @EventHandler
    public void onBlockBreak (BlockBreakEvent e){
        Player p = e.getPlayer();
        Block block = e.getBlock();
        ItemStack item = p.getInventory().getItemInMainHand();
        if (item.getItemMeta() != null) {
            if (item.getItemMeta().getLocalizedName().equalsIgnoreCase("netherite_drill")) {
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
                    Block bl25 = bl10.getRelative(BlockFace.NORTH_WEST);
                    minedArea.add(bl25);
                    Block bl26 = bl10.getRelative(BlockFace.NORTH);
                    minedArea.add(bl26);
                    Block bl27 = bl11.getRelative(BlockFace.NORTH);
                    minedArea.add(bl27);
                    Block bl28 = bl12.getRelative(BlockFace.NORTH);
                    minedArea.add(bl28);
                    Block bl29 = bl13.getRelative(BlockFace.NORTH);
                    minedArea.add(bl29);
                    Block bl30 = bl14.getRelative(BlockFace.NORTH);
                    minedArea.add(bl30);
                    Block bl31 = bl14.getRelative(BlockFace.NORTH_EAST);
                    minedArea.add(bl31);
                    Block bl32 = bl14.getRelative(BlockFace.EAST);
                    minedArea.add(bl32);
                    Block bl33 = bl15.getRelative(BlockFace.EAST);
                    minedArea.add(bl33);
                    Block bl34 = bl16.getRelative(BlockFace.EAST);
                    minedArea.add(bl34);
                    Block bl35 = bl17.getRelative(BlockFace.EAST);
                    minedArea.add(bl35);
                    Block bl36 = bl18.getRelative(BlockFace.EAST);
                    minedArea.add(bl36);
                    Block bl37 = bl18.getRelative(BlockFace.SOUTH_EAST);
                    minedArea.add(bl37);
                    Block bl38 = bl18.getRelative(BlockFace.SOUTH);
                    minedArea.add(bl38);
                    Block bl39 = bl19.getRelative(BlockFace.SOUTH);
                    minedArea.add(bl39);
                    Block bl40 = bl20.getRelative(BlockFace.SOUTH);
                    minedArea.add(bl40);
                    Block bl41 = bl21.getRelative(BlockFace.SOUTH);
                    minedArea.add(bl41);
                    Block bl42 = bl22.getRelative(BlockFace.SOUTH);
                    minedArea.add(bl42);
                    Block bl43 = bl22.getRelative(BlockFace.SOUTH_WEST);
                    minedArea.add(bl43);
                    Block bl44 = bl22.getRelative(BlockFace.WEST);
                    minedArea.add(bl44);
                    Block bl45 = bl23.getRelative(BlockFace.WEST);
                    minedArea.add(bl45);
                    Block bl46 = bl24.getRelative(BlockFace.WEST);
                    minedArea.add(bl46);
                    Block bl47 = bl9.getRelative(BlockFace.WEST);
                    minedArea.add(bl47);
                    Block bl48 = bl10.getRelative(BlockFace.WEST);
                    minedArea.add(bl48);
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
                    Block bl25 = bl11.getRelative(BlockFace.EAST);
                    minedArea.add(bl25);
                    Block bl26 = bl10.getRelative(BlockFace.EAST);
                    minedArea.add(bl26);
                    Block bl27 = bl9.getRelative(BlockFace.EAST);
                    minedArea.add(bl27);
                    Block bl28 = bl24.getRelative(BlockFace.EAST);
                    minedArea.add(bl28);
                    Block bl29 = bl23.getRelative(BlockFace.EAST);
                    minedArea.add(bl29);
                    Block bl30 = bl29.getRelative(BlockFace.DOWN);
                    minedArea.add(bl30);
                    Block bl31 = bl23.getRelative(BlockFace.DOWN);
                    minedArea.add(bl31);
                    Block bl32 = bl22.getRelative(BlockFace.DOWN);
                    minedArea.add(bl32);
                    Block bl33 = bl21.getRelative(BlockFace.DOWN);
                    minedArea.add(bl33);
                    Block bl34 = bl20.getRelative(BlockFace.DOWN);
                    minedArea.add(bl34);
                    Block bl35 = bl19.getRelative(BlockFace.DOWN);
                    minedArea.add(bl35);
                    Block bl36 = bl35.getRelative(BlockFace.WEST);
                    minedArea.add(bl36);
                    Block bl37 = bl19.getRelative(BlockFace.WEST);
                    minedArea.add(bl37);
                    Block bl38 = bl18.getRelative(BlockFace.WEST);
                    minedArea.add(bl38);
                    Block bl39 = bl17.getRelative(BlockFace.WEST);
                    minedArea.add(bl39);
                    Block bl40 = bl16.getRelative(BlockFace.WEST);
                    minedArea.add(bl40);
                    Block bl41 = bl15.getRelative(BlockFace.WEST);
                    minedArea.add(bl41);
                    Block bl42 = bl41.getRelative(BlockFace.UP);
                    minedArea.add(bl42);
                    Block bl43 = bl15.getRelative(BlockFace.UP);
                    minedArea.add(bl43);
                    Block bl44 = bl14.getRelative(BlockFace.UP);
                    minedArea.add(bl44);
                    Block bl45 = bl13.getRelative(BlockFace.UP);
                    minedArea.add(bl45);
                    Block bl46 = bl12.getRelative(BlockFace.UP);
                    minedArea.add(bl46);
                    Block bl47 = bl11.getRelative(BlockFace.UP);
                    minedArea.add(bl47);
                    Block bl48 = bl47.getRelative(BlockFace.EAST);
                    minedArea.add(bl48);

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
                    Block bl25 = bl11.getRelative(BlockFace.NORTH);
                    minedArea.add(bl25);
                    Block bl26 = bl10.getRelative(BlockFace.NORTH);
                    minedArea.add(bl26);
                    Block bl27 = bl9.getRelative(BlockFace.NORTH);
                    minedArea.add(bl27);
                    Block bl28 = bl24.getRelative(BlockFace.NORTH);
                    minedArea.add(bl28);
                    Block bl29 = bl23.getRelative(BlockFace.NORTH);
                    minedArea.add(bl29);
                    Block bl30 = bl29.getRelative(BlockFace.DOWN);
                    minedArea.add(bl30);
                    Block bl31 = bl23.getRelative(BlockFace.DOWN);
                    minedArea.add(bl31);
                    Block bl32 = bl22.getRelative(BlockFace.DOWN);
                    minedArea.add(bl32);
                    Block bl33 = bl21.getRelative(BlockFace.DOWN);
                    minedArea.add(bl33);
                    Block bl34 = bl20.getRelative(BlockFace.DOWN);
                    minedArea.add(bl34);
                    Block bl35 = bl19.getRelative(BlockFace.DOWN);
                    minedArea.add(bl35);
                    Block bl36 = bl35.getRelative(BlockFace.SOUTH);
                    minedArea.add(bl36);
                    Block bl37 = bl19.getRelative(BlockFace.SOUTH);
                    minedArea.add(bl37);
                    Block bl38 = bl18.getRelative(BlockFace.SOUTH);
                    minedArea.add(bl38);
                    Block bl39 = bl17.getRelative(BlockFace.SOUTH);
                    minedArea.add(bl39);
                    Block bl40 = bl16.getRelative(BlockFace.SOUTH);
                    minedArea.add(bl40);
                    Block bl41 = bl15.getRelative(BlockFace.SOUTH);
                    minedArea.add(bl41);
                    Block bl42 = bl41.getRelative(BlockFace.UP);
                    minedArea.add(bl42);
                    Block bl43 = bl15.getRelative(BlockFace.UP);
                    minedArea.add(bl43);
                    Block bl44 = bl14.getRelative(BlockFace.UP);
                    minedArea.add(bl44);
                    Block bl45 = bl13.getRelative(BlockFace.UP);
                    minedArea.add(bl45);
                    Block bl46 = bl12.getRelative(BlockFace.UP);
                    minedArea.add(bl46);
                    Block bl47 = bl11.getRelative(BlockFace.UP);
                    minedArea.add(bl47);
                    Block bl48 = bl47.getRelative(BlockFace.NORTH);
                    minedArea.add(bl48);

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
    public void onTablesClick(InventoryClickEvent e) {
        ItemStack item = e.getCurrentItem();
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory() instanceof AnvilInventory) {
            if (item != null) {
                if (item.getItemMeta() != null) {
                    if (item.getItemMeta().getLocalizedName().equalsIgnoreCase("netherite_drill")) {
                        p.sendMessage(ChatColor.RED + "You can not use this item here");
                        e.setCancelled(true);
                    }
                }
            }
        }
        if (e.getInventory() instanceof EnchantingInventory) {
            if (item != null) {
                if (item.getItemMeta() != null) {
                    if (item.getItemMeta().getLocalizedName().equalsIgnoreCase("netherite_drill")) {
                        p.sendMessage(ChatColor.RED + "You can not use this item here");
                        e.setCancelled(true);
                    }
                }
            }
        }
        if (e.getInventory() instanceof GrindstoneInventory) {
            if (item != null) {
                if (item.getItemMeta() != null) {
                    if (item.getItemMeta().getLocalizedName().equalsIgnoreCase("netherite_drill")) {
                        p.sendMessage(ChatColor.RED + "You can not use this item here");
                        e.setCancelled(true);
                    }
                }
            }
        }
    }
}
