package org.markmanflame55.flareplugin.EventListeners;

import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;
import org.markmanflame55.flareplugin.FlarePlugin;
import org.markmanflame55.flareplugin.Utils.SculkArmorEvent;
import org.markmanflame55.flareplugin.Utils.SculkWandUtil;
import org.markmanflame55.flareplugin.Utils.WardenArmorUtil;

import javax.print.attribute.standard.RequestingUserName;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;

public class SculkWandEvent implements Listener {
    private final HashMap<UUID, Long> cooldown;
    public SculkWandEvent() {this.cooldown = new HashMap<>();}
    //.
    @EventHandler
    public void onRightClick(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        ItemStack item = e.getItem();
        if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (item != null) {
                if (item.getItemMeta().getLocalizedName().equalsIgnoreCase("sculk_wand")) {
                    if (!this.cooldown.containsKey(p.getUniqueId())) {
                        this.cooldown.put(p.getUniqueId(), System.currentTimeMillis());
                        particleBeam(p);
                        p.playSound(p, Sound.ENTITY_WARDEN_SONIC_BOOM, 1.0f, 0.9f);
                        p.sendMessage(ChatColor.GREEN + "You casted Sonic Boom");
                    } else {
                        long timeElapsed = System.currentTimeMillis() - cooldown.get(p.getUniqueId());
                        if (timeElapsed >=10000) {
                            this.cooldown.put(p.getUniqueId(), System.currentTimeMillis());
                            particleBeam(p);
                            p.playSound(p, Sound.ENTITY_WARDEN_SONIC_BOOM, 1.0f, 0.9f);
                            p.sendMessage(ChatColor.GREEN + "You casted Sonic Boom");
                        } else {
                            p.sendMessage(ChatColor.RED + "Sculk Wand is on cooldown");
                        }
                    }
                }
            }
        }
    }
    public static void particleBeam(Player p) {
        Location startLoc = p.getEyeLocation();
        Location particleLoc = startLoc.clone();
        World world = startLoc.getWorld();
        Vector dir = startLoc.getDirection();

        Vector vecOffset = dir.clone().multiply(1);

        new BukkitRunnable() {
            int maxBeamLenght = 60;
            int beamLenght = 0;

            @Override
            public void run() {

                for (Entity entity : world.getNearbyEntities(particleLoc, 5, 5, 5)) {
                    // We only care about living entities. Any others will be ignored.
                    if (entity instanceof LivingEntity) {
                        // Ignore player that initiated the shot
                        if (entity == p) {
                            continue;
                        }

                        /* Define the bounding box of the particle.
                        We will use 0.25 here, since the particle is moving 0.5 blocks each time.
                        That means the particle won't miss very small entities like chickens or bats,
                          as the particle bounding box covers 1/2 of the movement distance.
                         */
                        Vector particleMinVector = new Vector(
                                particleLoc.getX() - 0.75,
                                particleLoc.getY() - 0.75,
                                particleLoc.getZ() - 0.75);
                        Vector particleMaxVector = new Vector(
                                particleLoc.getX() + 0.75,
                                particleLoc.getY() + 0.75,
                                particleLoc.getZ() + 0.75);

                        // Now use a spigot API call to determine if the particle is inside the entity's hitbox
                        if(entity.getBoundingBox().overlaps(particleMinVector,particleMaxVector)){
                            // We have a hit!
                            // Display a flash at the location of the particle
                            //world.spawnParticle(Particle.FLASH, particleLoc, 0);
                            // Play an explosion sound at the particle location
                            //world.playSound(particleLoc,Sound.ENTITY_GENERIC_EXPLODE,2,1);
                            // Damage the target, using the shooter as the damager
                            ((Damageable) entity).damage(15,p);
                            p.playSound(p, Sound.ENTITY_WARDEN_ATTACK_IMPACT, 1.0f, 1.0f);
                            // Cancel the particle beam
                            this.cancel();
                            // We must return here, otherwise the code below will display one more particle.
                            return;
                        }
                    }
                }
                beamLenght++;
                if (beamLenght >= maxBeamLenght) {
                    world.spawnParticle(Particle.SONIC_BOOM, particleLoc, 0);
                    this.cancel();
                    return;
                }
                particleLoc.add(vecOffset);
                world.spawnParticle(Particle.SONIC_BOOM, particleLoc, 0);
            }
        }.runTaskTimer(FlarePlugin.getPlugin(FlarePlugin.class), 0, 1);

    }
    @EventHandler
    public void onWardenDeath(EntityDeathEvent e) {
        if (e.getEntity() instanceof Warden) {
            Random random = new Random();
            float chance = random.nextFloat();
            if (chance <= 0.75f) {
                e.getDrops().add(WardenArmorUtil.giveSculkFragment());
            }
        }
    }
}
