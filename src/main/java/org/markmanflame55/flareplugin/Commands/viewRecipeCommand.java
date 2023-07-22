package org.markmanflame55.flareplugin.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.inventory.PrepareInventoryResultEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.StringUtil;
import org.markmanflame55.flareplugin.EventListeners.AOTVEvent;
import org.markmanflame55.flareplugin.EventListeners.HealerWandEvent;
import org.markmanflame55.flareplugin.Utils.*;

import javax.swing.text.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class viewRecipeCommand implements CommandExecutor, TabCompleter {

    private List<String> options = new ArrayList<>();
    public viewRecipeCommand() {

        options.add("STEEL_INGOT");
        options.add("STEEL_BLOCK");
        options.add("IRON_DRILL");
        options.add("DIAMOND_DRILL");
        options.add("NETHERITE_DRILL");
        options.add("REFINED_GOLD");
        options.add("REFINED_GOLD_BLOCK");
        options.add("INFINITY_STONE");
        options.add("INFINI_CARROT");
        options.add("INFINI_GOLDEN_CARROT");
        options.add("HEALER_WAND");
        options.add("REFINED_EMERALD");
        options.add("REFINED_EMERALD_BLOCK");
        options.add("SUGAR_BLOCK");
        options.add("WARDEN_HELMET");
        options.add("WARDEN_CHESTPLATE");
        options.add("WARDEN_LEGGINGS");
        options.add("WARDEN_BOOTS");
        options.add("VITALITY_HELMET");
        options.add("VITALITY_CHESTPLATE");
        options.add("VITALITY_LEGGINGS");
        options.add("VITALITY_BOOTS");
        options.add("RUNNER_HELMET");
        options.add("RUNNER_CHESTPLATE");
        options.add("RUNNER_LEGGINGS");
        options.add("RUNNER_BOOTS");
        options.add("GOLEM_HELMET");
        options.add("GOLEM_CHESTPLATE");
        options.add("GOLEM_LEGGINGS");
        options.add("GOLEM_BOOTS");
        options.add("EMERALD_HELMET");
        options.add("EMERALD_CHESTPLATE");
        options.add("EMERALD_LEGGINGS");
        options.add("EMERALD_BOOTS");
        options.add("SCULK_FRAGMENT");
        options.add("SCULK_WAND");
        options.add("RUNNER_TOTEM");
        options.add("GOLEM_TOTEM");
        options.add("VITALITY_TOTEM");
        options.add("CARLOS");
        options.add("CARLOS_SOUL");
        options.add("LAVA_EXPLORER_HELMET");
        options.add("LAVA_EXPLORER_CHESTPLATE");
        options.add("LAVA_EXPLORER_LEGGINGS");
        options.add("LAVA_EXPLORER_BOOTS");
        options.add("EMERALD_PICKAXE");
        options.add("RABBIT_BOOTS");
        options.add("GHOST_ANNIHILATOR");
        options.add("GOLD_ARMORER_ELYTRA");
        options.add("IRON_ARMORED_ELYTRA");
        options.add("DIAMOND_ARMORED_ELYTRA");
        options.add("NETHERITE_ARMORED_ELYTRA");
        options.add("NIGHT_GOGGLES");
        options.add("BLOOD_BLADE");
        options.add("VAMPIRE_SWORD");
        options.add("REFINED_COPPER");
        options.add("REFINED_COPPER_BLOCK");
        options.add("GRIM_REAPER_HELMET");
        options.add("GRIM_REAPER_CHESTPLATE");
        options.add("GRIM_REAPER_LEGGINGS");
        options.add("GRIM_REAPER_BOOTS");

    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player p) {
            if (strings.length == 0) {

                p.sendMessage(ChatColor.RED + "Specify the item you want to see");

            } else if (strings[0].equalsIgnoreCase("HEALER_WAND")) {

                p.openInventory(ViewRecipesUtil.craftHealerWand(p));

            } else if (strings[0].equalsIgnoreCase("STEEL_INGOT")) {

                p.openInventory(ViewRecipesUtil.craftSteelIngot(p));

            } else if (strings[0].equalsIgnoreCase("STEEL_BLOCK")) {

                p.openInventory(ViewRecipesUtil.craftSteelBlock(p));

            } else if (strings[0].equalsIgnoreCase("IRON_DRILL")) {

                p.openInventory(ViewRecipesUtil.craftIronDrill(p));

            } else if (strings[0].equalsIgnoreCase("DIAMOND_DRILL")) {

                p.openInventory(ViewRecipesUtil.craftDiamondDrill(p));

            } else if (strings[0].equalsIgnoreCase("NETHERITE_DRILL")) {

                p.openInventory(ViewRecipesUtil.craftNetherDrill(p));

            } else if (strings[0].equalsIgnoreCase("INFINITY_STONE")) {

                p.openInventory(ViewRecipesUtil.craftInfinityStone(p));

            } else if (strings[0].equalsIgnoreCase("INFINI_CARROT")) {

                p.openInventory(ViewRecipesUtil.craftInfiniCarrot(p));

            } else if (strings[0].equalsIgnoreCase("INFINI_GOLDEN_CARROT")) {

                p.openInventory(ViewRecipesUtil.craftInfiniGCarrot(p));

            } else if (strings[0].equalsIgnoreCase("REFINED_GOLD")) {

                p.openInventory(ViewRecipesUtil.craftRefinedGold(p));

            } else if (strings[0].equalsIgnoreCase("REFINED_GOLD_BLOCK")) {

                p.openInventory(ViewRecipesUtil.craftRefinedGoldBlock(p));

            } else if (strings[0].equalsIgnoreCase("REFINED_EMERALD")) {

                p.openInventory(ViewRecipesUtil.craftRefinedEmerald(p));

            }else if (strings[0].equalsIgnoreCase("REFINED_EMERALD_BLOCK")) {

                p.openInventory(ViewRecipesUtil.craftRefinedEmeraldBlock(p));

            } else if(strings[0].equalsIgnoreCase("SUGAR_BLOCK")) {

                p.openInventory(ViewRecipesUtil.craftSugarBlock(p));

            } else if(strings[0].equalsIgnoreCase("WARDEN_HELMET")) {

                p.openInventory(ViewRecipesUtil.craftWardenHelmet(p));

            } else if (strings[0].equalsIgnoreCase("WARDEN_CHESTPLATE")) {

                p.openInventory(ViewRecipesUtil.craftWardenChestplate(p));

            } else if (strings[0].equalsIgnoreCase("WARDEN_LEGGINGS")) {

                p.openInventory(ViewRecipesUtil.craftWardenLegs(p));

            } else if (strings[0].equalsIgnoreCase("WARDEN_BOOTS")) {

                p.openInventory(ViewRecipesUtil.craftWardenBoots(p));

            } else if (strings[0].equalsIgnoreCase("VITALITY_HELMET")) {

                p.openInventory(ViewRecipesUtil.craftVitalityHelmet(p));

            } else if (strings[0].equalsIgnoreCase("VITALITY_CHESTPLATE")) {

                p.openInventory(ViewRecipesUtil.craftVitalityChest(p));

            } else if (strings[0].equalsIgnoreCase("VITALITY_LEGGINGS")){

                p.openInventory(ViewRecipesUtil.craftVitalityLegs(p));

            } else if (strings[0].equalsIgnoreCase("VITALITY_BOOTS")) {

                p.openInventory(ViewRecipesUtil.craftVitalityBoots(p));

            } else if (strings[0].equalsIgnoreCase("RUNNER_HELMET")) {

                p.openInventory(ViewRecipesUtil.craftRunnerHelmet(p));

            } else if (strings[0].equalsIgnoreCase("RUNNER_CHESTPLATE")) {

                p.openInventory(ViewRecipesUtil.craftRunnerChest(p));

            } else if (strings[0].equalsIgnoreCase("RUNNER_LEGGINGS")) {

                p.openInventory(ViewRecipesUtil.craftRunnerLegs(p));

            } else if (strings[0].equalsIgnoreCase("RUNNER_BOOTS")) {

                p.openInventory(ViewRecipesUtil.craftRunnerBoots(p));

            } else if (strings[0].equalsIgnoreCase("GOLEM_HELMET")) {

                p.openInventory(ViewRecipesUtil.craftGolemHelmet(p));

            } else if (strings[0].equalsIgnoreCase("GOLEM_CHESTPLATE")) {

                p.openInventory(ViewRecipesUtil.craftGolemChest(p));

            } else if (strings[0].equalsIgnoreCase("GOLEM_LEGGINGS")) {

                p.openInventory(ViewRecipesUtil.craftGolemLegs(p));

            } else if (strings[0].equalsIgnoreCase("GOLEM_BOOTS")) {

                p.openInventory(ViewRecipesUtil.craftGolemBoots(p));

            } else if (strings[0].equalsIgnoreCase("EMERALD_HELMET")) {

                p.openInventory(ViewRecipesUtil.craftEmeraldHelmet(p));

            } else if (strings[0].equalsIgnoreCase("EMERALD_CHESTPLATE")) {

                p.openInventory(ViewRecipesUtil.craftEmeraldChest(p));

            } else if (strings[0].equalsIgnoreCase("EMERALD_LEGGINGS")) {

                p.openInventory(ViewRecipesUtil.craftEmeraldBoots(p));

            } else if (strings[0].equalsIgnoreCase("EMERALD_BOOTS")) {

                p.openInventory(ViewRecipesUtil.craftEmeraldBoots(p));

            } else if (strings[0].equalsIgnoreCase("SCULK_FRAGMENT")) {

                p.openInventory(ViewRecipesUtil.craftSculkFrag(p));

            } else if (strings[0].equalsIgnoreCase("SCULK_WAND")) {

                p.openInventory(ViewRecipesUtil.craftSculkWand(p));

            } else if (strings[0].equalsIgnoreCase("RUNNER_TOTEM")) {

                p.openInventory(ViewRecipesUtil.craftRunnerTotem(p));

            } else if (strings[0].equalsIgnoreCase("GOLEM_TOTEM")) {

                p.openInventory(ViewRecipesUtil.craftGolemTotem(p));

            } else if (strings[0].equalsIgnoreCase("VITALITY_TOTEM")) {

                p.openInventory(ViewRecipesUtil.craftVitalityTotem(p));

            } else if (strings[0].equalsIgnoreCase("CARLOS")) {

                p.openInventory(ViewRecipesUtil.craftCarlos(p));

            } else if (strings[0].equalsIgnoreCase("CARLOS_SOUL")) {

                p.openInventory(ViewRecipesUtil.craftCarlosSoul(p));

            } else if (strings[0].equalsIgnoreCase("LAVA_EXPLORER_HELMET")) {

                p.openInventory(ViewRecipesUtil.craftLavaHelmet(p));

            } else if (strings[0].equalsIgnoreCase("LAVA_EXPLORER_CHESTPLATE")) {

                p.openInventory(ViewRecipesUtil.craftLavaChest(p));

            } else if (strings[0].equalsIgnoreCase("LAVA_EXPLORER_LEGGINGS")) {

                p.openInventory(ViewRecipesUtil.craftLavaLegs(p));

            } else if (strings[0].equalsIgnoreCase("LAVA_EXPLORER_BOOTS")) {

                p.openInventory(ViewRecipesUtil.craftLavaBoots(p));

            } else if (strings[0].equalsIgnoreCase("EMERALD_PICKAXE")) {

                p.openInventory(ViewRecipesUtil.craftEmeraldPickaxe(p));

            } else if (strings[0].equalsIgnoreCase("RABBIT_BOOTS")) {

                p.openInventory(ViewRecipesUtil.craftRabbitBoots(p));

            } else if (strings[0].equalsIgnoreCase("GOLD_ARMORED_ELYTRA")) {

                p.openInventory(ViewRecipesUtil.craftGoldElytra(p));

            } else if (strings[0].equalsIgnoreCase("IRON_ARMORED_ELYTRA")) {

                p.openInventory(ViewRecipesUtil.craftIronElytra(p));

            } else if (strings[0].equalsIgnoreCase("DIAMOND_ARMORED_ELYTRA")) {

                p.openInventory(ViewRecipesUtil.craftDiamondElytra(p));

            } else if (strings[0].equalsIgnoreCase("NETHERITE_ARMORED_ELYTRA")) {

                p.openInventory(ViewRecipesUtil.craftNetherElytra(p));

            } else if (strings[0].equalsIgnoreCase("GHOST_ANNIHILATOR")) {

                p.openInventory(ViewRecipesUtil.craftGhostAnnihilator(p));

            } else if (strings[0].equalsIgnoreCase("NIGHT_GOGGLES")) {

                p.openInventory(ViewRecipesUtil.craftNightGoggles(p));

            } else if (strings[0].equalsIgnoreCase("BLOOD_BLADE")) {

                p.openInventory(ViewRecipesUtil.craftBloodBlade(p));

            } else if (strings[0].equalsIgnoreCase("VAMPIRE_SWORD")) {

                p.openInventory(ViewRecipesUtil.crafVampireBlade(p));

            } else if (strings[0].equalsIgnoreCase("REFINED_COPPER")) {

                p.openInventory(ViewRecipesUtil.craftRefinedCopper(p));

            } else if (strings[0].equalsIgnoreCase("REFINED_COPPER_BLOCK")) {

                p.openInventory(ViewRecipesUtil.craftRefinedCopperBlock(p));

            } else if (strings[0].equalsIgnoreCase("GRIM_REAPER_HELMET")) {

                p.openInventory(ViewRecipesUtil.craftGrimHelmet(p));

            } else if (strings[0].equalsIgnoreCase("GRIM_REAPER_CHESTPLATE")) {

                p.openInventory(ViewRecipesUtil.craftGrimChestplate(p));

            } else if (strings[0].equalsIgnoreCase("GRIM_REAPER_LEGGINGS")) {

                p.openInventory(ViewRecipesUtil.craftGrimLeggings(p));

            } else if (strings[0].equalsIgnoreCase("GRIM_REAPER_BOOTS")) {

                p.openInventory(ViewRecipesUtil.craftGrimBoots(p));

            }
        }
        return true;
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

