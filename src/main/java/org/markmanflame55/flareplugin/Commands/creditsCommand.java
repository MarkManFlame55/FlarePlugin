package org.markmanflame55.flareplugin.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class creditsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player p) {
            List<String> credits = new ArrayList<>();
            credits.add(ChatColor.GOLD + "=========================================================================================================");
            credits.add("");
            credits.add(ChatColor.WHITE + "Plugin Developer: " + ChatColor.AQUA + "MarkManFlame_55");
            credits.add("");
            credits.add(ChatColor.RED + "" + ChatColor.BOLD + "YT: " + ChatColor.WHITE + "https://youtube.com/@markmanflame_5542");
            credits.add(ChatColor.AQUA + "" +ChatColor.BOLD + "Twitter: " + ChatColor.WHITE + "https://twitter.com/MarkManFlame_55");
            credits.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Twitch: " + ChatColor.WHITE + "https://www.twitch.tv/markmanflame_55");
            credits.add("");
            credits.add("");
            credits.add(ChatColor.WHITE + "Check for new updates on: " + ChatColor.YELLOW + "https://www.spigotmc.org/resources/flareplugin.111131/");
            credits.add("");
            credits.add(ChatColor.GREEN + "Inspirations and Credits:");
            credits.add("");
            credits.add(ChatColor.YELLOW + "Item Rarities & Aspect of the Void Item: " + ChatColor.WHITE + "Hypixel Skyblock Minigame from Hypixel Server");
            credits.add(ChatColor.YELLOW + "Infini-Carrot & Infini-Golden Carrot Items: " + ChatColor.WHITE + "Zanahoria Heroica from Final Paradox CTM from DarthVidMc and luisb1202");
            credits.add(ChatColor.YELLOW + "Drill Items: " + ChatColor.WHITE + "Literally every mod and plugin that alredy has them");
            credits.add("");
            credits.add(ChatColor.GOLD + "=========================================================================================================");

            for (String i : credits) {
                p.sendMessage(i);
            }
        }
        return true;
    }
}
