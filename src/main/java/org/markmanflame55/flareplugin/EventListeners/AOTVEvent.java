package org.markmanflame55.flareplugin.EventListeners;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Chest;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.entity.Shulker;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.world.ChunkPopulateEvent;
import org.bukkit.inventory.*;
import org.bukkit.loot.LootContext;
import org.bukkit.loot.LootTable;
import org.bukkit.loot.LootTables;
import org.markmanflame55.flareplugin.Utils.AspectOfTheVoidUtil;

import java.util.Collection;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class AOTVEvent implements Listener {

    //This one works
    @EventHandler
    public void onRightClick(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        ItemStack item = e.getItem();
        if (item != null) {
            if (item.equals(AspectOfTheVoidUtil.giveAOTV())) {
                if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || (e.getAction().equals(Action.RIGHT_CLICK_BLOCK))) {
                    Block target = p.getTargetBlock((Set<Material>) null, 8);
                    Location location = target.getLocation();
                    float pitch = p.getEyeLocation().getPitch();
                    float yaw = p.getEyeLocation().getYaw();
                    location.add(0.5, 1, 0.5);
                    location.setYaw(yaw);
                    location.setPitch(pitch);
                    p.teleport(location);
                    p.playSound(location, Sound.ENTITY_ENDERMAN_TELEPORT, 0.5f, 1.0f);
                }
            }
        }
    }
    //This one not
    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        Player p = e.getPlayer();
        ItemStack item = p.getInventory().getItemInMainHand();
        if (item.equals(AspectOfTheVoidUtil.giveAOTV())) {
            e.setCancelled(true);
        }
    }
    //EVITAR QUE SE PUEDA ENCANTAR EN ETABLE O ANVIL
    //HECHO 100%
    @EventHandler
    public void onTablesClick(InventoryClickEvent e){
        ItemStack item = e.getCurrentItem();
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory() instanceof AnvilInventory) {
            if (item != null) {
                if (item.equals(AspectOfTheVoidUtil.giveAOTV())) {
                    p.sendMessage(ChatColor.RED + "You can not use this item here");
                    e.setCancelled(true);
                }
            }
        }
        if (e.getInventory() instanceof EnchantingInventory) {
            if (item != null) {
                if (item.equals(AspectOfTheVoidUtil.giveAOTV())) {
                    p.sendMessage(ChatColor.RED + "You can not use this item here");
                    e.setCancelled(true);
                }
            }
        }

        if (e.getInventory() instanceof SmithingInventory) {
            if (item != null) {
                if (item.equals(AspectOfTheVoidUtil.giveAOTV())) {
                    p.sendMessage(ChatColor.RED + "You can not use this item here");
                    e.setCancelled(true);
                }
            }
        }
    }
    @EventHandler
    public void onEntityDeath(EntityDeathEvent e) {
        if (e.getEntity() instanceof Shulker) {
            if (e.getEntity().getKiller().getInventory().getItemInMainHand().getItemMeta() != null && e.getEntity().getKiller().getInventory().getItemInMainHand().getItemMeta().hasEnchant(Enchantment.LOOT_BONUS_MOBS)) {
                Random r = new Random();
                float chance = r.nextFloat();
                if (chance <= 0.008f) {
                    e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), AspectOfTheVoidUtil.giveAOTV());
                }
            }
            else {
                Random r = new Random();
                float chance = r.nextFloat();
                if (chance <= 0.001f) {
                    e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), AspectOfTheVoidUtil.giveAOTV());
                }
            }
        }
    }
}
