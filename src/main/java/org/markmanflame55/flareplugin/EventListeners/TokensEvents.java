package org.markmanflame55.flareplugin.EventListeners;

import org.bukkit.entity.Blaze;
import org.bukkit.entity.ElderGuardian;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.markmanflame55.flareplugin.FlarePlugin;
import org.markmanflame55.flareplugin.Utils.TokensUtil;

import java.util.Random;

public class TokensEvents implements Listener {
    @EventHandler
    public void onEntityDeath(EntityDeathEvent e) {
        if (e.getEntity() instanceof Blaze) {
            Random random = new Random();
            float chance = random.nextFloat();
            if (chance <= 0.01f) {
                e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), TokensUtil.giveFlamingEssence());
            }
        }
        if (e.getEntity() instanceof ElderGuardian) {
            Random random = new Random();
            float chance = random.nextFloat();
            if (chance <= 0.25) {
                e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), TokensUtil.giveSeaArtifact());
            }
        }
    }
    @EventHandler
    public void onArtifactEquip(InventoryCloseEvent e) {
        Player p = (Player) e.getPlayer();
        giveEffect(p);
    }
    public void giveEffect(Player p) {
        new BukkitRunnable(){
            @Override
            public void run() {
                if (p.getInventory().getItemInOffHand().getItemMeta() != null) {
                    if (p.getInventory().getItemInOffHand().getItemMeta().getLocalizedName().equals("sea_artifact")) {
                        p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 200, 0));
                        p.removePotionEffect(PotionEffectType.SLOW_DIGGING);
                    } else {
                        p.removePotionEffect(PotionEffectType.WATER_BREATHING);
                    }
                } else {
                    p.removePotionEffect(PotionEffectType.WATER_BREATHING);
                }
            }
        }.runTaskTimer(FlarePlugin.getPlugin(FlarePlugin.class), 0, 20);
    }
}
