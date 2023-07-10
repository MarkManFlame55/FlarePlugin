package org.markmanflame55.flareplugin.EventListeners;

import org.bukkit.*;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.block.Biome;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.*;
import org.bukkit.event.world.GenericGameEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ArmorMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.inventory.meta.trim.ArmorTrim;
import org.bukkit.inventory.meta.trim.TrimMaterial;
import org.bukkit.inventory.meta.trim.TrimPattern;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;
import org.markmanflame55.flareplugin.FlarePlugin;
import org.markmanflame55.flareplugin.Utils.*;
import java.util.*;

public class CustomMobsSpawnEvent implements Listener {

    //ZOMBIES============================================================================

    @EventHandler
    public void onZombieSpawn(EntitySpawnEvent e) {
        if (e.getEntity() instanceof Zombie && !(e.getEntity() instanceof PigZombie) && !(e.getEntity() instanceof Drowned)) {
            Random random = new Random();
            float chance = random.nextFloat();
            if (chance <= 0.25f) {
                Random random1 = new Random();
                float chance1 = random1.nextFloat();
                if (chance1 <= 0.33f) {
                    e.setCancelled(true);
                    CustomMobsUtil.summonZombieTank(e.getLocation(), e.getEntity());
                } else if (chance1 <= 0.66f) {
                    e.setCancelled(true);
                    CustomMobsUtil.summonZombieBerserk(e.getLocation(), e.getEntity());
                } else {
                    e.setCancelled(true);
                    CustomMobsUtil.summonZombieMiner(e.getLocation(), e.getEntity());
                }
            }
        }
    }
    @EventHandler
    public void onZombieDeath(EntityDeathEvent e) {
        if (e.getEntity() instanceof Zombie) {
            if (e.getEntity().getKiller() != null) {
                e.getEntity().getKiller().setGlowing(false);
                if (e.getEntity().getCustomName() != null) {
                    if (e.getEntity().getScoreboardTags().contains("tank")) {
                        e.getDrops().clear();
                        e.getDrops().add(steelIngotUtil.giveSteelIngot());
                        Random random = new Random();
                        float chance = random.nextFloat();
                        if (chance <= 0.05f) {
                            e.getDrops().add(steelIngotUtil.giveSteelBlock());
                        }
                    }
                    if (e.getEntity().getScoreboardTags().contains("berserk")) {
                        e.getDrops().clear();
                        Random random = new Random();
                        float chance = random.nextFloat();
                        if (chance <= 0.1f) {
                            e.getDrops().add(TokensUtil.giveFlamingEssence());
                        }
                    }
                    if (e.getEntity().getScoreboardTags().contains("miner")) {
                        e.getDrops().clear();
                        e.getDrops().add(new ItemStack(Material.TORCH, 8));
                        Random random = new Random();
                        float chance = random.nextFloat();
                        if (chance <= 0.5f) {
                            e.getDrops().add(new ItemStack(Material.IRON_INGOT, 10));
                        } else if (chance <= 0.8f) {
                            e.getDrops().add(new ItemStack(Material.GOLD_INGOT, 5));
                        } else if (chance <= 0.9f) {
                            e.getDrops().add(new ItemStack(Material.REDSTONE, 32));
                        } else if (chance <= 0.95) {
                            e.getDrops().add(new ItemStack(Material.DIAMOND, 2));
                        }
                    }
                }
            } else {
                e.getDrops().clear();
            }
        }
    }
    //Skeletons============================================================================
    @EventHandler
    public void onSkeletonSpawn(EntitySpawnEvent e) {
        Location location = e.getLocation();
        if (e.getEntity() instanceof Skeleton) {
            if (!e.getEntity().getWorld().getBiome(e.getLocation()).equals(Biome.SOUL_SAND_VALLEY)) {
                Random random = new Random();
                float chance = random.nextFloat();
                if (chance <= 0.25f) {
                    Random random1 = new Random();
                    float chance1 = random1.nextFloat();
                    if (chance1 <= 0.5f) {
                        e.setCancelled(true);
                        CustomMobsUtil.summonSkeletonSniper(e.getLocation(), e.getEntity());
                    } else {
                        e.setCancelled(true);
                        CustomMobsUtil.summonSkeletonExiled(e.getLocation(), e.getEntity());
                    }
                }
            } else {

                Random random = new Random();
                float chance = random.nextFloat();

                if (chance <= 0.5f) {
                    e.setCancelled(true);
                    CustomMobsUtil.summonLostSoul(e.getLocation(), e.getEntity());
                }
            }
        }
    }
    @EventHandler
    public void onSkeletonDamage(EntityDamageByEntityEvent e) {
        if (e.getEntity() instanceof Skeleton) {
            if (e.getEntity().getScoreboardTags().contains("lost_soul")) {
                Location location = e.getEntity().getLocation();
                e.getEntity().getWorld().playSound(location, Sound.PARTICLE_SOUL_ESCAPE, 5.0f, 1.0f);
            }
        }
    }
    @EventHandler
    public void onSkeletonDeath (EntityDeathEvent e) {
        if (e.getEntity() instanceof Skeleton) {
            if (e.getEntity().getScoreboardTags().contains("lost_soul")) {
                e.getDrops().clear();
                Random r = new Random();
                int low = 8;
                int high = 12;
                int result = r.nextInt(high - low) + low;
                e.getDrops().add(new ItemStack(Material.SOUL_SAND, result));
            }
            if (e.getEntity().getScoreboardTags().contains("exiled")) {
                e.getDrops().remove(0);
            }
        }
    }
    //CREEPERS============================================================================================================
    @EventHandler
    public void onCreeperSpawn(EntitySpawnEvent e) {
        if (e.getEntity() instanceof Creeper) {
            Random random = new Random();
            float chance = random.nextFloat();
            if (chance <= 0.25f) {
                e.setCancelled(true);
                CustomMobsUtil.summonGhost(e.getLocation(), e.getEntity());
            }
        }
    }
    @EventHandler
    public void onCreeperExplode(EntityExplodeEvent e) {
        if (e.getEntity() instanceof Creeper) {
            if (e.getEntity().getScoreboardTags().contains("ghost")) {
                ((Creeper) e.getEntity()).removePotionEffect(PotionEffectType.INVISIBILITY);
                for (Entity i : e.getEntity().getNearbyEntities(4,1,4)) {
                    if (i instanceof Player p) {
                        if (p.isBlocking()) {
                            if (p.getItemInUse().getItemMeta() != null) {
                                if (p.getItemInUse().getItemMeta().getLocalizedName().equalsIgnoreCase("ghost_annihilator")) {
                                    return;
                                } else {
                                    p.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 30 * 20, 0));
                                    p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 30 * 20, 0));
                                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 30 * 20, 0));
                                    p.playSound(p.getLocation(), Sound.AMBIENT_WARPED_FOREST_MOOD, 2f, 1.2f);
                                }
                            }
                        } else {
                            p.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 30 * 20, 0));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 30 * 20, 0));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 30 * 20, 0));
                            p.playSound(p.getLocation(), Sound.AMBIENT_WARPED_FOREST_MOOD, 2f, 1.2f);
                        }
                    }
                }
            }
        }
    }
    @EventHandler
    public void onCreeperDeath(EntityDeathEvent e) {
        if (e.getEntity() instanceof Creeper) {
            if (e.getEntity().getScoreboardTags().contains("ghost")) {
                e.getDrops().clear();
                Random random = new Random();
                float chance = random.nextFloat();
                if (chance <= 0.5f) {
                    e.getDrops().add(GhostAnihilatorUtil.giveEctoplasm());
                }
            }
        }
    }
    // WITHERSKELETONS============================================================================================================================
    @EventHandler
    public void onEndermanSpawn(EntitySpawnEvent e) {
        if (e.getEntity() instanceof Enderman) {
            Biome biome = e.getEntity().getWorld().getBiome(e.getLocation());
            if (biome.equals(Biome.END_BARRENS) || biome.equals(Biome.END_MIDLANDS) || biome.equals(Biome.END_HIGHLANDS)) {
                Random random = new Random();
                float chance = random.nextFloat();
                if (chance <= 0.25f) {
                    e.setCancelled(true);
                    CustomMobsUtil.summonChorusWarrior(e.getLocation(), e.getEntity());
                }
            }
            if (biome.equals(Biome.SMALL_END_ISLANDS)) {
                Random random = new Random();
                float chance = random.nextFloat();
                if (chance <= 0.1f) {
                    e.setCancelled(true);
                    CustomMobsUtil.summonEnderGhast(e.getLocation(), e.getEntity());
                }
            }
        }
    }
    @EventHandler
    public void onWitherSkeletonDeath(EntityDeathEvent e) {
        if (e.getEntity() instanceof WitherSkeleton && e.getEntity().getScoreboardTags().contains("chorus_warrior")) {
            e.getDrops().clear();
            Random random = new Random();
            float chance = random.nextFloat();
            if (chance <= 0.3f) {
                Random r = new Random();
                int low = 1;
                int high = 3;
                int result = r.nextInt(high - low) + low;
                e.getDrops().add(new ItemStack(Material.ENDER_PEARL, result));
            }
        }
    }
    @EventHandler
    public void onGhastShoot(ProjectileLaunchEvent e){
        if (e.getEntity() instanceof Fireball) {
            if (e.getEntity().getShooter() instanceof Ghast && ((Ghast) e.getEntity().getShooter()).getScoreboardTags().contains("ender_ghast")) {
                ((Fireball) e.getEntity()).setYield(2f);
            }
        }
    }
    @EventHandler
    public void onWitherTrigger (EntityTargetLivingEntityEvent e) {
        if (e.getEntity() instanceof WitherSkeleton) {
            if (e.getEntity().getScoreboardTags().contains("chorus_warrior")) {
                ((WitherSkeleton) e.getEntity()).getEquipment().setHelmet(new ItemStack(Material.CHORUS_FLOWER));
                changeHelmetIfNearby(e.getEntity());
            }
        }
    }
    public void changeHelmetIfNearby(Entity entity) {
        new BukkitRunnable() {
            @Override
            public void run() {
                if (entity instanceof WitherSkeleton) {
                    if (((WitherSkeleton) entity).getTarget() != null) {
                            ((WitherSkeleton) entity).getEquipment().setHelmet(new ItemStack(Material.CHORUS_FLOWER));
                            ((WitherSkeleton) entity).getEquipment().setHelmetDropChance(0f);
                    } else {
                        ((WitherSkeleton) entity).getEquipment().setHelmet(new ItemStack(Material.CHORUS_PLANT));
                    }
                }
            }
        }.runTaskTimer(FlarePlugin.getPlugin(FlarePlugin.class), 0,20*20);
    }
}

