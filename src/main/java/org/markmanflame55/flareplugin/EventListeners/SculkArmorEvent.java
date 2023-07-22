package org.markmanflame55.flareplugin.Utils;

import org.bukkit.GameEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.GenericGameEvent;
import org.bukkit.inventory.ItemStack;

public class SculkArmorEvent implements Listener {
    @EventHandler
    public void onSculkTrigger(GenericGameEvent e) {
        if (e.getEvent().equals(GameEvent.SCULK_SENSOR_TENDRILS_CLICKING)) {
            if (e.getEntity() instanceof Player p) {
                ItemStack Helmet = p.getInventory().getHelmet();
                ItemStack Chest = p.getInventory().getChestplate();
                ItemStack Legs = p.getInventory().getLeggings();
                ItemStack Boots = p.getInventory().getBoots();
                if (Helmet != null) {
                    if (Helmet.getItemMeta().getLocalizedName().equalsIgnoreCase("warden_helmet")) {
                        if (Chest != null) {
                            if (Chest.getItemMeta().getLocalizedName().equalsIgnoreCase("warden_chestplate")) {
                                if (Legs != null) {
                                    if (Legs.getItemMeta().getLocalizedName().equalsIgnoreCase("warden_leggings")) {
                                        if (Boots != null) {
                                            if (Boots.getItemMeta().getLocalizedName().equalsIgnoreCase("warden_boots")) {
                                                e.setCancelled(true);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
