package org.markmanflame55.flareplugin.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.*;
import org.bukkit.util.StringUtil;
import org.markmanflame55.flareplugin.Utils.CustomMobsUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class flarespawn implements CommandExecutor, TabCompleter {

    private final List<String> options = new ArrayList<>();
    public flarespawn() {
        options.add("zombie_miner");
        options.add("zombie_tank");
        options.add("zombie_berserk");
        options.add("skeleton_exiled");
        options.add("skeleton_sniper");
        options.add("ghost");
        options.add("lost_soul");
        options.add("chorus_warrior");
        options.add("ender_ghast");
    }
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player p) {
            if (p.hasPermission("operator")) {
                Location location = p.getLocation();
                if (strings.length == 0) {
                    p.sendMessage(ChatColor.RED + "Specify the custom Flare Mob you want to spawn");
                } else if (strings[0].equalsIgnoreCase("zombie_miner")) {

                    CustomMobsUtil.summonZombieMiner(location, p);

                } else if (strings[0].equalsIgnoreCase("zombie_berserk")) {

                    CustomMobsUtil.summonZombieBerserk(location, p);

                } else if (strings[0].equalsIgnoreCase("zombie_tank")) {

                    CustomMobsUtil.summonZombieTank(location, p);

                } else if (strings[0].equalsIgnoreCase("skeleton_exiled")) {

                   CustomMobsUtil.summonSkeletonExiled(location, p);

                } else if (strings[0].equalsIgnoreCase("skeleton_sniper")) {

                    CustomMobsUtil.summonSkeletonSniper(location, p);

                } else if (strings[0].equalsIgnoreCase("ghost")) {

                    CustomMobsUtil.summonGhost(location, p);

                } else if (strings[0].equalsIgnoreCase("lost_soul")) {

                    CustomMobsUtil.summonLostSoul(location, p);

                } else if (strings[0].equalsIgnoreCase("chorus_warrior")) {

                    CustomMobsUtil.summonChorusWarrior(location, p);

                } else if (strings[0].equalsIgnoreCase("ender_ghast")) {

                    CustomMobsUtil.summonEnderGhast(location, p);

                }
            } else {
                p.sendMessage(ChatColor.RED + "You need higher permissions to do that");
            }
        }
        return false;
    }
    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        if (strings.length == 1 && commandSender instanceof Player) {
            List<String> completions = new ArrayList<>();
            StringUtil.copyPartialMatches(strings[0], options, completions);
            Collections.sort(completions);
            return completions;
        }
        return null;
    }
}
