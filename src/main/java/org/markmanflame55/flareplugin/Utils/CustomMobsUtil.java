package org.markmanflame55.flareplugin.Utils;

import org.bukkit.*;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
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
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

import javax.security.auth.callback.LanguageCallback;
import java.util.Random;

public class CustomMobsUtil {
    public static Zombie summonZombieTank(Location location, Entity spawner){
        Zombie tank = spawner.getWorld().spawn(location, Zombie.class);

        tank.setCustomName("Tank Zombie");
        tank.addScoreboardTag("tank");
        tank.getEquipment().clear();
        tank.getEquipment().setHelmet(GolemArmorUtil.giveHelmet());
        tank.getEquipment().setChestplate(GolemArmorUtil.giveChest());
        tank.getEquipment().setLeggings(GolemArmorUtil.giveLegs());
        tank.getEquipment().setBoots(GolemArmorUtil.giveBoots());
        tank.getEquipment().setItemInMainHand(new ItemStack(Material.IRON_AXE));

        return tank;
    }
    public static Zombie summonZombieBerserk(Location location, Entity spawner) {
        Zombie berserk = spawner.getWorld().spawn(location, Zombie.class);

        berserk.setCustomName("Berserk Zombie");
        berserk.addScoreboardTag("berserk");
        berserk.getEquipment().clear();
        berserk.getEquipment().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
        berserk.getEquipment().setBoots(RunnerArmorUtil.giveBoots());
        berserk.getEquipment().setItemInMainHand(new ItemStack(Material.DIAMOND_SWORD));

        return berserk;
    }
    public static Zombie summonZombieMiner (Location location, Entity spawner) {
        Zombie miner = spawner.getWorld().spawn(location, Zombie.class);

        miner.setCustomName("Miner Zombie");
        miner.addScoreboardTag("miner");
        miner.getEquipment().clear();
        miner.getEquipment().setHelmet(new ItemStack(Material.GOLDEN_HELMET));
        miner.getEquipment().setItemInMainHand(new ItemStack(Material.NETHERITE_PICKAXE));
        miner.getEquipment().setItemInOffHand(new ItemStack(Material.TORCH));

        return miner;
    }
    public static Skeleton summonSkeletonSniper(Location location, Entity spawner) {
        Skeleton sniper = spawner.getWorld().spawn(location, Skeleton.class);

        ItemStack arrows = new ItemStack(Material.TIPPED_ARROW);
        PotionMeta arrowMeta = (PotionMeta) arrows.getItemMeta();
        arrowMeta.addCustomEffect(new PotionEffect(PotionEffectType.HARM, 1, 1), true);
        arrows.setItemMeta(arrowMeta);

        ItemStack bow = new ItemStack(Material.BOW);
        ItemMeta meta = bow.getItemMeta();
        meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 3, true);
        bow.setItemMeta(meta);

        sniper.setCustomName("Sniper Skeleton");
        sniper.addScoreboardTag("sniper");

        sniper.getActivePotionEffects().clear();
        sniper.getEquipment().clear();
        sniper.getEquipment().setHelmet(new ItemStack(Material.TARGET));
        sniper.getEquipment().setItemInMainHand(bow);
        sniper.getEquipment().setItemInOffHand(arrows);
        sniper.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 999999999, 9, true));

        return sniper;
    }
    public static Skeleton summonSkeletonExiled(Location location, Entity spawner) {
        Skeleton exile = spawner.getWorld().spawn(location, Skeleton.class);

        ArmorTrim trim = new ArmorTrim(TrimMaterial.QUARTZ, TrimPattern.SPIRE);

        ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta chestMeta = (LeatherArmorMeta) chestplate.getItemMeta();
        chestMeta.setColor(Color.fromRGB(255,0,0));
        chestplate.setItemMeta(chestMeta);
        ArmorMeta chestTrimmed = (ArmorMeta) chestplate.getItemMeta();
        chestTrimmed.setTrim(trim);
        chestplate.setItemMeta(chestTrimmed);

        exile.setCustomName("Exiled Skeleton");
        exile.addScoreboardTag("exiled");

        exile.getActivePotionEffects().clear();
        exile.getEquipment().clear();
        exile.getEquipment().setItemInOffHand(new ItemStack(Material.GOLDEN_SWORD));
        exile.getEquipment().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
        exile.getEquipment().setChestplate(chestplate);
        for (PotionEffect i : exile.getActivePotionEffects()) {
            exile.removePotionEffect(i.getType());
        }
        return exile;
    }
    public static Creeper summonGhost(Location location, Entity spawner) {
        Creeper ghost = spawner.getWorld().spawn(location, Creeper.class);

        ghost.setCustomName("Ghost");
        ghost.addScoreboardTag("ghost");

        AttributeInstance health = ghost.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        AttributeInstance speed = ghost.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED);
        if (health != null) {
            double maxHealth = 10.0;
            health.setBaseValue(maxHealth);
        }
        if (speed != null) {
            double v = 0.4;
            speed.setBaseValue(v);
        }
        ghost.damage(1);
        ghost.setPowered(true);
        ghost.setExplosionRadius(0);
        ghost.getEquipment().clear();
        ghost.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 999999999,1, true));

        return ghost;
    }
    public static Skeleton summonLostSoul(Location location, Entity spawner) {

        ArmorTrim trim = new ArmorTrim(TrimMaterial.DIAMOND, TrimPattern.RIB);
        ArmorTrim helm = new ArmorTrim(TrimMaterial.DIAMOND, TrimPattern.VEX);

        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta helmMeta = (LeatherArmorMeta) helmet.getItemMeta();
        helmMeta.setColor(Color.fromRGB(93,93,93));
        helmet.setItemMeta(helmMeta);
        ArmorMeta helmTrimm = (ArmorMeta) helmet.getItemMeta();
        helmTrimm.setTrim(helm);
        helmet.setItemMeta(helmTrimm);

        ItemStack chestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
        ArmorMeta chestMeta = (ArmorMeta) chestplate.getItemMeta();
        chestMeta.setTrim(trim);
        chestplate.setItemMeta(chestMeta);

        ItemStack soul = new ItemStack(Material.STONE);
        ItemMeta meta = soul.getItemMeta();
        meta.addEnchant(Enchantment.SOUL_SPEED,2, false);
        soul.setItemMeta(meta);

        Skeleton lostSoul = spawner.getWorld().spawn(location, Skeleton.class);

        lostSoul.setCustomName("Lost Soul");
        lostSoul.addScoreboardTag("lost_soul");
        lostSoul.setCollidable(false);
        lostSoul.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 2147483647, 0, false, false));
        lostSoul.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 2147483647, 0, false, false));
        lostSoul.getEquipment().clear();
        lostSoul.getEquipment().setHelmet(helmet);
        lostSoul.getEquipment().setHelmetDropChance(0f);
        lostSoul.getEquipment().setChestplate(chestplate);
        lostSoul.getEquipment().setChestplateDropChance(0f);
        lostSoul.getEquipment().setBoots(soul);
        lostSoul.getEquipment().setBootsDropChance(0f);
        lostSoul.setSilent(true);
        lostSoul.setCanPickupItems(false);

        AttributeInstance damage = lostSoul.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE);
        if (damage != null) {
            damage.setBaseValue(6.0);
        }
        AttributeInstance health = lostSoul.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        if (health != null) {
            health.setBaseValue(12.0);
        }
        lostSoul.damage(0.1);
        return lostSoul;
    }
    public static WitherSkeleton summonChorusWarrior(Location location, Entity spawner) {
        WitherSkeleton witherSkeleton = spawner.getWorld().spawn(location, WitherSkeleton.class);

        ArmorTrim trim = new ArmorTrim(TrimMaterial.AMETHYST, TrimPattern.SPIRE);

        ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta chestMeta = (LeatherArmorMeta) chestplate.getItemMeta();
        chestMeta.setColor(Color.fromRGB(0,0,0));
        chestplate.setItemMeta(chestMeta);
        ArmorMeta chestTrim = (ArmorMeta) chestplate.getItemMeta();
        chestTrim.setTrim(trim);
        chestplate.setItemMeta(chestTrim);

        ItemStack leggings = new ItemStack(Material.NETHERITE_LEGGINGS);
        ArmorMeta legsMeta = (ArmorMeta) leggings.getItemMeta();
        legsMeta.setTrim(trim);
        leggings.setItemMeta(legsMeta);

        ItemStack boots = new ItemStack(Material.NETHERITE_BOOTS);
        ArmorMeta bootsMeta = (ArmorMeta) boots.getItemMeta();
        bootsMeta.setTrim(trim);
        boots.setItemMeta(bootsMeta);

        ItemStack chorus = new ItemStack(Material.CHORUS_FRUIT);
        ItemMeta meta = chorus.getItemMeta();
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        meta.addEnchant(Enchantment.KNOCKBACK, 5, true);
        chorus.setItemMeta(meta);

        ItemStack bow = new ItemStack(Material.BOW);
        ItemMeta bowMeta= bow.getItemMeta();
        bowMeta.addEnchant(Enchantment.ARROW_DAMAGE, 2, false);
        bowMeta.addEnchant(Enchantment.ARROW_KNOCKBACK, 2, false);
        bow.setItemMeta(bowMeta);

        witherSkeleton.setCustomName("Chorus Warrior");
        witherSkeleton.addScoreboardTag("chorus_warrior");

        witherSkeleton.getEquipment().clear();
        witherSkeleton.getEquipment().setHelmet(new ItemStack(Material.CHORUS_PLANT));
        witherSkeleton.getEquipment().setHelmetDropChance(0f);
        witherSkeleton.getEquipment().setChestplate(chestplate);
        witherSkeleton.getEquipment().setChestplateDropChance(0f);
        witherSkeleton.getEquipment().setLeggings(leggings);
        witherSkeleton.getEquipment().setLeggingsDropChance(0f);
        witherSkeleton.getEquipment().setBoots(boots);
        witherSkeleton.getEquipment().setBootsDropChance(0f);
        Random random1 = new Random();
        float chance1 = random1.nextFloat();
        if (chance1 <= 0.75f) {
            witherSkeleton.getEquipment().setItemInMainHand(chorus);
            witherSkeleton.getEquipment().setItemInMainHandDropChance(0f);
        } else {
            witherSkeleton.getEquipment().setItemInMainHand(bow);
            witherSkeleton.getEquipment().setItemInMainHandDropChance(0f);
        }
        witherSkeleton.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 2147483647, 4, false, false));
        witherSkeleton.setHealth(40);
        witherSkeleton.setCanPickupItems(false);

        return witherSkeleton;
    }
    public static Ghast summonEnderGhast(Location location, Entity spawner) {
        Ghast ghast = spawner.getWorld().spawn(location, Ghast.class);

        ghast.setCustomName("Ender Ghast");
        ghast.addScoreboardTag("ender_ghast");
        ghast.setInvisible(true);
        ghast.setGlowing(true);

        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard board = manager.getMainScoreboard();

        if (board.getTeams().contains(board.getTeam("EnderGhast"))) {
            board.getTeam("EnderGhast").setColor(ChatColor.DARK_PURPLE);
            board.getTeam("EnderGhast").addEntry(ghast.getUniqueId().toString());
        } else {
            Team enderGhast = board.registerNewTeam("EnderGhast");
            enderGhast.setColor(ChatColor.DARK_PURPLE);
            enderGhast.addEntry(ghast.getUniqueId().toString());
        }
        return ghast;
    }
    public static WitherSkeleton summonVampire (Location location, Entity spawner) {
        WitherSkeleton vampire = spawner.getWorld().spawn(location, WitherSkeleton.class);

        vampire.setCustomName("Vampire");
        vampire.addScoreboardTag("vampire");

        ArmorTrim trimChest = new ArmorTrim(TrimMaterial.REDSTONE, TrimPattern.VEX);
        ArmorTrim trimLegs = new ArmorTrim(TrimMaterial.REDSTONE, TrimPattern.TIDE);

        ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta chestMeta = (LeatherArmorMeta) chestplate.getItemMeta();
        chestMeta.setColor(Color.fromRGB(0,0,0));
        chestplate.setItemMeta(chestMeta);
        ArmorMeta chestTrim = (ArmorMeta) chestplate.getItemMeta();
        chestTrim.setTrim(trimChest);
        chestplate.setItemMeta(chestTrim);


        ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta legsMeta = (LeatherArmorMeta) leggings.getItemMeta();
        legsMeta.setColor(Color.fromRGB(0,0,0));
        leggings.setItemMeta(legsMeta);
        ArmorMeta legsTrim = (ArmorMeta) leggings.getItemMeta();
        legsTrim.setTrim(trimLegs);
        leggings.setItemMeta(legsTrim);

        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta bootsMeta = (LeatherArmorMeta) boots.getItemMeta();
        bootsMeta.setColor(Color.fromRGB(176,46,38));
        boots.setItemMeta(bootsMeta);

        vampire.getEquipment().clear();
        vampire.getEquipment().setHelmet(new ItemStack(Material.SKELETON_SKULL));
        vampire.getEquipment().setHelmetDropChance(0f);
        vampire.getEquipment().setChestplate(chestplate);
        vampire.getEquipment().setChestplateDropChance(0f);
        vampire.getEquipment().setLeggings(leggings);
        vampire.getEquipment().setLeggingsDropChance(0f);
        vampire.getEquipment().setBoots(boots);
        vampire.getEquipment().setBootsDropChance(0f);
        vampire.getEquipment().setItemInMainHand(VampireSword.giveVampireSword());
        vampire.getEquipment().setItemInMainHandDropChance(0f);
        vampire.setSilent(true);

        return vampire;
    }
}
