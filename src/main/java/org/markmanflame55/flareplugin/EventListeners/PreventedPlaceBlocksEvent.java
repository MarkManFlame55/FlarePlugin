package org.markmanflame55.flareplugin.EventListeners;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.markmanflame55.flareplugin.Utils.*;

public class PreventedPlaceBlocksEvent implements Listener {
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e) {
        Player p = e.getPlayer();
        Block block = e.getBlockPlaced();
        ItemStack placed = e.getItemInHand();
        ItemStack placedSec = p.getInventory().getItemInOffHand();
        if (placed.isSimilar(steelIngotUtil.giveSteelBlock())) {
            e.setCancelled(true);
        }
        if (placed.isSimilar(RefinedGoldUtil.giveRefinedGoldBlock())) {
            e.setCancelled(true);
        }
        if (placed.isSimilar(RunnerArmorUtil.giveSugarBlock())) {
            e.setCancelled(true);
        }
        if (placed.isSimilar(EmeraldArmorUtil.giveRefinedEmeraldBLock())) {
            e.setCancelled(true);
        }
        if (placed.isSimilar(LavaExplorerSetUtil.giveFilament())) {
            e.setCancelled(true);
        }
        if (placed.isSimilar(CarlosUtil.giveCarlos())) {
            e.setCancelled(true);
        }
        if (placed.isSimilar(NightGooglesUtil.giveGoggles())) {
            e.setCancelled(true);
        }
        if (placed.isSimilar(RefinedCopperUtil.giveBlock())) {
            e.setCancelled(true);
        }
        if (placed.isSimilar(GrimReaperArmorUtil.giveUndeadChains())) {
            e.setCancelled(true);
        }
    }
}