package org.markmanflame55.flareplugin.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Golem;
import org.bukkit.entity.Player;
import org.bukkit.util.StringUtil;
import org.markmanflame55.flareplugin.Utils.*;
import org.yaml.snakeyaml.tokens.Token;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class flareGiveCommand implements CommandExecutor, TabCompleter {

    List<String> options = new ArrayList<>();

    public flareGiveCommand() {
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
        options.add("RABBIT_FOOT");
        options.add("GHOST_ANNIHILATOR");
        options.add("GOLD_ARMORER_ELYTRA");
        options.add("IRON_ARMORED_ELYTRA");
        options.add("DIAMOND_ARMORED_ELYTRA");
        options.add("NETHERITE_ARMORED_ELYTRA");
        options.add("NIGHT_GOGGLES");
        options.add("VAMPIRE_SWORD");
        options.add("VAMPIRE_FANG");
        options.add("BLOOD_BLADE");
        options.add("FLAMING_ESSENCE");
        options.add("SEA_ARTIFACT");
        options.add("WINGS_CORE");
        options.add("STRIDER_FILAMENT");
        options.add("PIGLIN_BUCKLE");
        options.add("GRIM_REAPER_HELMET");
        options.add("GRIM_REAPER_CHESTPLATE");
        options.add("GRIM_REAPER_LEGGINGS");
        options.add("GRIM_REAPER_BOOTS");
        options.add("UNDEAD_CHAINS");
        options.add("REFINED_COPPER");
        options.add("REFINED_COPPER_BLOCK");
    }
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player player) {
            if (player.isOp()) {
                if (strings.length == 0) {
                    player.sendMessage(ChatColor.RED + "Specify item and player to give the Flare Item: /flaregive PLAYER_NAME ITEM_NAME");
                } else {
                    if (strings.length != 2) {
                        player.sendMessage(ChatColor.RED + "Specify item and player to give the Flare Item: /flaregive PLAYER_NAME ITEM_NAME");
                    } else {
                        Player target = Bukkit.getPlayerExact(strings[0]);
                        if (target != null) {
                            if (strings[1].equalsIgnoreCase("STEEL_INGOT")) {
                                target.getInventory().addItem(steelIngotUtil.giveSteelIngot());
                            } else if (strings[1].equalsIgnoreCase("STEEL_BLOCK")) {
                                target.getInventory().addItem(steelIngotUtil.giveSteelBlock());
                            } else if (strings[1].equalsIgnoreCase("IRON_DRILL")) {
                                target.getInventory().addItem(IronDrillUtil.giveIronDrill());
                            } else if (strings[1].equalsIgnoreCase("DIAMOND_DRILL")) {
                                target.getInventory().addItem(DiamondDrillUtil.giveDiamondDrill());
                            } else if (strings[1].equalsIgnoreCase("NETHERITE_DRILL")) {
                                target.getInventory().addItem(NetheriteDrillUtil.giveNetheriteDrill());
                            } else if (strings[1].equalsIgnoreCase("REFINED_GOLD")) {
                                target.getInventory().addItem(RefinedGoldUtil.giveRefinedGold());
                            } else if (strings[1].equalsIgnoreCase("REFINED_GOLD_BLOCK")) {
                                target.getInventory().addItem(RefinedGoldUtil.giveRefinedGoldBlock());
                            } else if (strings[1].equalsIgnoreCase("INFINITY_STONE")) {
                                target.getInventory().addItem(InfinityStoneUtil.giveInfinityStone());
                            } else if (strings[1].equalsIgnoreCase("INFINI_CARROT")) {
                                target.getInventory().addItem(InfiniCarrotsUtil.giveInfiniCarrot());
                            } else if (strings[1].equalsIgnoreCase("INFINI_GOLDEN_CARROT")) {
                                target.getInventory().addItem(InfiniCarrotsUtil.giveInfiniGCarrot());
                            } else if (strings[1].equalsIgnoreCase("HEALER_WAND")) {
                                target.getInventory().addItem(HealerWandUtil.giveHealerWand());
                            } else if (strings[1].equalsIgnoreCase("REFINED_EMERALD")) {
                                target.getInventory().addItem(EmeraldArmorUtil.giveRefinedEmerald());
                            } else if (strings[1].equalsIgnoreCase("REFINED_EMERALD_BLOCK")) {
                                target.getInventory().addItem(EmeraldArmorUtil.giveRefinedEmeraldBLock());
                            } else if (strings[1].equalsIgnoreCase("SUGAR_BLOCK")) {
                                target.getInventory().addItem(RunnerArmorUtil.giveSugarBlock());
                            } else if (strings[1].equalsIgnoreCase("WARDEN_HELMET")) {
                                target.getInventory().addItem(WardenArmorUtil.giveWardenHelmet());
                            } else if (strings[1].equalsIgnoreCase("WARDEN_CHESTPLATE")) {
                                target.getInventory().addItem(WardenArmorUtil.giveWardenChestplate());
                            } else if (strings[1].equalsIgnoreCase("WARDEN_LEGGINGS")) {
                                target.getInventory().addItem(WardenArmorUtil.giveWardenLeggins());
                            } else if (strings[1].equalsIgnoreCase("WARDEN_BOOTS")) {
                                target.getInventory().addItem(WardenArmorUtil.giveWardenBoots());
                            } else if (strings[1].equalsIgnoreCase("VITALITY_HELMET")) {
                                target.getInventory().addItem(VitalityArmorUtil.giveHelmet());
                            } else if (strings[1].equalsIgnoreCase("VITALITY_CHESTPLATE")) {
                                target.getInventory().addItem(VitalityArmorUtil.giveChest());
                            } else if (strings[1].equalsIgnoreCase("VITALITY_LEGGINGS")) {
                                target.getInventory().addItem(VitalityArmorUtil.giveLegs());
                            } else if (strings[1].equalsIgnoreCase("VITALITY_BOOTS")) {
                                target.getInventory().addItem(VitalityArmorUtil.giveBoots());
                            } else if (strings[1].equalsIgnoreCase("RUNNER_HELMET")) {
                                target.getInventory().addItem(RunnerArmorUtil.giveHelmet());
                            } else if (strings[1].equalsIgnoreCase("RUNNER_CHESTPLATE")) {
                                target.getInventory().addItem(RunnerArmorUtil.giveChest());
                            } else if (strings[1].equalsIgnoreCase("RUNNER LEGGINGS")) {
                                target.getInventory().addItem(RunnerArmorUtil.giveLegs());
                            } else if (strings[1].equalsIgnoreCase("RUNNER_BOOTS")) {
                                target.getInventory().addItem(RunnerArmorUtil.giveBoots());
                            } else if (strings[1].equalsIgnoreCase("GOLEM_HELMET")) {
                                target.getInventory().addItem(GolemArmorUtil.giveHelmet());
                            } else if (strings[1].equalsIgnoreCase("GOLEM_CHESTPLATE")) {
                                target.getInventory().addItem(GolemArmorUtil.giveChest());
                            } else if (strings[1].equalsIgnoreCase("GOLEM_LEGGINGS")) {
                                target.getInventory().addItem(GolemArmorUtil.giveLegs());
                            } else if (strings[1].equalsIgnoreCase("GOLEM_BOOTS")) {
                                target.getInventory().addItem(GolemArmorUtil.giveBoots());
                            } else if (strings[1].equalsIgnoreCase("EMERALD_HELMET")) {
                                target.getInventory().addItem(EmeraldArmorUtil.giveEmeraldHelmet());
                            } else if (strings[1].equalsIgnoreCase("EMERALD_CHESTPLATE")) {
                                target.getInventory().addItem(EmeraldArmorUtil.giveEmeraldChest());
                            } else if (strings[1].equalsIgnoreCase("EMERALD_LEGGINGS")) {
                                target.getInventory().addItem(EmeraldArmorUtil.giveEmeraldLegs());
                            } else if (strings[1].equalsIgnoreCase("EMERALD_BOOTS")) {
                                target.getInventory().addItem(EmeraldArmorUtil.giveEmeraldBoots());
                            } else if (strings[1].equalsIgnoreCase("SCULK_FRAGMENT")) {
                                target.getInventory().addItem(WardenArmorUtil.giveSculkFragment());
                            } else if (strings[1].equalsIgnoreCase("SCULK_WAND")) {
                                target.getInventory().addItem(SculkWandUtil.giveWand());
                            } else if (strings[1].equalsIgnoreCase("RUNNER_TOTEM")) {
                                target.getInventory().addItem(CustomTotemsUtil.giveRunnerTotem());
                            } else if (strings[1].equalsIgnoreCase("GOLEM_TOTEM")) {
                                target.getInventory().addItem(CustomTotemsUtil.giveTankTotem());
                            } else if (strings[1].equalsIgnoreCase("VITALITY_TOTEM")) {
                                target.getInventory().addItem(CustomTotemsUtil.giveVitalityTotem());
                            } else if (strings[1].equalsIgnoreCase("CARLOS")) {
                                target.getInventory().addItem(CarlosUtil.giveCarlos());
                            } else if (strings[1].equalsIgnoreCase("CARLOS_SOUL")) {
                                target.getInventory().addItem(CarlosUtil.giveSoul());
                            } else if (strings[1].equalsIgnoreCase("LAVA_EXPLORER_HELMET")) {
                                target.getInventory().addItem(LavaExplorerSetUtil.giveHelmet());
                            } else if (strings[1].equalsIgnoreCase("LAVA_EXPLORER_CHESTPLATE")) {
                                target.getInventory().addItem(LavaExplorerSetUtil.giveChest());
                            } else if (strings[1].equalsIgnoreCase("LAVA_EXPLORER_LEGGINGS")) {
                                target.getInventory().addItem(LavaExplorerSetUtil.giveLegs());
                            } else if (strings[1].equalsIgnoreCase("LAVA_EXPLORER_BOOTS")) {
                                target.getInventory().addItem(LavaExplorerSetUtil.giveBoots());
                            } else if (strings[1].equalsIgnoreCase("EMERALD_PICKAXE")) {
                                target.getInventory().addItem(EmeraldPickaxeUtil.givePickaxe());
                            } else if (strings[1].equalsIgnoreCase("RABBIT_BOOTS")) {
                                target.getInventory().addItem(RabbitBootsUtil.giveRabbitBoots());
                            } else if (strings[1].equalsIgnoreCase("GHOST_ANNIHILATOR")) {
                                target.getInventory().addItem(GhostAnihilatorUtil.giveAnnihilator());
                            } else if (strings[1].equalsIgnoreCase("GOLD_ARMORED_ELYTRA")) {
                                target.getInventory().addItem(DragonWingsUtil.giveGoldElytra());
                            } else if (strings[1].equalsIgnoreCase("IRON_ARMORED_ELYTRA")) {
                                target.getInventory().addItem(DragonWingsUtil.giveIronElytra());
                            } else if (strings[1].equalsIgnoreCase("DIAMOND_ARMORED_ELYTRA")) {
                                target.getInventory().addItem(DragonWingsUtil.giveDiamondElytra());
                            } else if (strings[1].equalsIgnoreCase("NETHERITE_ARMORED_ELYTRA")) {
                                target.getInventory().addItem(DragonWingsUtil.giveNetherElytra());
                            } else if (strings[1].equalsIgnoreCase("NIGHT_GOGGLES")) {
                                target.getInventory().addItem(NightGooglesUtil.giveGoggles());
                            } else if (strings[1].equalsIgnoreCase("VAMPIRE_SWORD")) {
                                target.getInventory().addItem(VampireSword.giveVampireSword());
                            } else if (strings[1].equalsIgnoreCase("VAMPIRE_FANG")) {
                                target.getInventory().addItem(VampireSword.giveVampireFang());
                            } else if (strings[1].equalsIgnoreCase("BLOOD_BLADE")) {
                                target.getInventory().addItem(VampireSword.giveBloodBlade());
                            } else if (strings[1].equalsIgnoreCase("STRIDER_FILAMENT")) {
                                target.getInventory().addItem(LavaExplorerSetUtil.giveFilament());
                            } else if (strings[1].equalsIgnoreCase("PIGLIN_BUCKLE")) {
                                target.getInventory().addItem(LavaExplorerSetUtil.givePiglinBuckle());
                            } else if (strings[1].equalsIgnoreCase("SEA_ARTIFACT")) {
                                target.getInventory().addItem(TokensUtil.giveSeaArtifact());
                            } else if (strings[1].equalsIgnoreCase("FLAMING_ESSENCE")) {
                                target.getInventory().addItem(TokensUtil.giveFlamingEssence());
                            } else if (strings[1].equalsIgnoreCase("WINGS_CORE")) {
                                target.getInventory().addItem(DragonWingsUtil.giveCore());
                            } else if (strings[1].equalsIgnoreCase("GRIM_REAPER_HELMET")) {
                                target.getInventory().addItem(GrimReaperArmorUtil.giveGrimHelmet());
                            } else if (strings[1].equalsIgnoreCase("GRIM_REAPER_CHESTPLATE")) {
                                target.getInventory().addItem(GrimReaperArmorUtil.giveGrimChestplate());
                            } else if (strings[1].equalsIgnoreCase("GRIM_REAPER_LEGGINGS")) {
                                target.getInventory().addItem(GrimReaperArmorUtil.giveGrimLeggings());
                            } else if (strings[1].equalsIgnoreCase("GRIM_REAPER_BOOTS")) {
                                target.getInventory().addItem(GrimReaperArmorUtil.giveGrimBoots());
                            } else if (strings[1].equalsIgnoreCase("UNDEAD_CHAINS")) {
                                target.getInventory().addItem(GrimReaperArmorUtil.giveUndeadChains());
                            } else if (strings[1].equalsIgnoreCase("REFINED_COPPER")) {
                                target.getInventory().addItem(RefinedCopperUtil.giveIngot());
                            } else if (strings[1].equalsIgnoreCase("REFINED_COPPER_BLOCK")) {
                                target.getInventory().addItem(RefinedCopperUtil.giveBlock());
                            }
                            else {
                                player.sendMessage(ChatColor.RED + "That Flare item doesn´t exist (At least yet :P)");
                            }
                        }
                    }
                }
            } else {
                player.sendMessage(ChatColor.RED + "You dont have permissions to do that");
            }
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        if (strings.length == 2 && commandSender instanceof Player) {
            List<String> completions = new ArrayList<>();
            StringUtil.copyPartialMatches(strings[1], options, completions);
            Collections.sort(completions);
            return completions;
        }
        return null;
    }
}
