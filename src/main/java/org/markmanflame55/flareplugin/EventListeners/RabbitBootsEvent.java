package org.markmanflame55.flareplugin.EventListeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.markmanflame55.flareplugin.FlarePlugin;

public class RabbitBootsEvent implements Listener {
    public void giveEffect(Player p) {
        new BukkitRunnable(){
            @Override
            public void run() {
                ItemStack boots = p.getInventory().getBoots();
                if (boots != null) {
                    if (boots.getItemMeta() != null) {
                        if (boots.getItemMeta().getLocalizedName().equals("rabbit_boots")) {
                            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 200, 2));
                        }
                    } else {
                        p.removePotionEffect(PotionEffectType.JUMP);
                    }
                } else {
                    p.removePotionEffect(PotionEffectType.JUMP);
                }
            }
        }.runTaskTimer(FlarePlugin.getPlugin(FlarePlugin.class), 0, 20);
    }
    @EventHandler
    public void onInventoryClose (InventoryCloseEvent e) {
        Player p = (Player) e.getPlayer();
        giveEffect(p);
    }
}
