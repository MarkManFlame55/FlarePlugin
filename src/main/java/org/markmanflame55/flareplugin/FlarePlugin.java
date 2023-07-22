package org.markmanflame55.flareplugin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;
import org.markmanflame55.flareplugin.Commands.*;
import org.markmanflame55.flareplugin.EventListeners.*;
import org.markmanflame55.flareplugin.Utils.ItemManager;
import org.markmanflame55.flareplugin.Utils.SculkArmorEvent;

public final class FlarePlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("menu").setExecutor(new menuCommand());
        getCommand("credits").setExecutor(new creditsCommand());
        getCommand("viewrecipe").setExecutor(new viewRecipeCommand());
        getCommand("funny").setExecutor(new funnyCommand());
        getCommand("flarespawn").setExecutor(new flarespawn());
        getCommand("flaregive").setExecutor(new flareGiveCommand());

        getServer().getPluginManager().registerEvents(new AOTVEvent(), this);
        getServer().getPluginManager().registerEvents(new HealerWandEvent(), this);
        getServer().getPluginManager().registerEvents(new InfiniCarrotsEvent(), this);
        getServer().getPluginManager().registerEvents(new IronDrillEvent(), this);
        getServer().getPluginManager().registerEvents(new DiamondDrillEvent(), this);
        getServer().getPluginManager().registerEvents(new NetherDrillEvent(), this);
        getServer().getPluginManager().registerEvents(new MenuItemEvent(), this);
        getServer().getPluginManager().registerEvents(new PreventedPlaceBlocksEvent(), this);
        getServer().getPluginManager().registerEvents(new RecipeInventoriesClickPrevent(), this);
        getServer().getPluginManager().registerEvents(new PreventItemsAnvilGrindstoneEvent(), this);
        getServer().getPluginManager().registerEvents(new viewRecipeInventoryListener(), this);
        getServer().getPluginManager().registerEvents(new SculkArmorEvent(), this);
        getServer().getPluginManager().registerEvents(new SculkWandEvent(), this);
        getServer().getPluginManager().registerEvents(new CarlosListener(), this);
        getServer().getPluginManager().registerEvents(new LavaArmorEvent(), this);
        getServer().getPluginManager().registerEvents(new EmeraldArmorEvent(), this);
        getServer().getPluginManager().registerEvents(new EmeraldPickaxeEvent(), this);
        getServer().getPluginManager().registerEvents(new TokensEvents(), this);
        getServer().getPluginManager().registerEvents(new RabbitBootsEvent(), this);
        getServer().getPluginManager().registerEvents(new DragonDeathEvent(), this);
        getServer().getPluginManager().registerEvents(new CustomMobsSpawnEvent(), this);
        getServer().getPluginManager().registerEvents(new NightGogglesEvent(), this);
        getServer().getPluginManager().registerEvents(new VampireSwordEvent(), this);
        getServer().getPluginManager().registerEvents(new SmithingRecipesResultEvent(), this);
        getServer().getPluginManager().registerEvents(new GrimArmorEvent(), this);
        ItemManager.init();

    }

    @Override
    public void onDisable() {
        System.out.println("Good Night -.-");
    }
}
