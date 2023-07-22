package org.markmanflame55.flareplugin.EventListeners;


import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.markmanflame55.flareplugin.Utils.*;
import org.yaml.snakeyaml.tokens.Token;

import java.nio.file.WatchEvent;
import java.util.ArrayList;
import java.util.Objects;

public class MenuItemEvent implements Listener {
    @EventHandler
    public void onMenuItemClick(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        ItemStack item = e.getItem();
        if (item != null) {
            if (item.isSimilar(MenuUtil.giveMenuItem())) {
                if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK) || e.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                    if (p.hasPermission("operator")) {
                        Inventory customItems = Bukkit.createInventory(p, 54, ChatColor.DARK_RED + "Custom Items");

                        ArrayList<String> itemLore = new ArrayList<>();
                        itemLore.add("");
                        itemLore.add(ChatColor.WHITE + ">> Click to get it <<");

                        ItemStack item1 = new ItemStack(Material.DIAMOND_SHOVEL);
                        ItemMeta item1Meta = item1.getItemMeta();
                        item1Meta.setDisplayName(ChatColor.DARK_PURPLE + "Aspect of the Void");
                        item1Meta.setLore(itemLore);
                        item1.setItemMeta(item1Meta);

                        ItemStack item2 = new ItemStack(Material.GOLDEN_SWORD);
                        ItemMeta item2Meta = item2.getItemMeta();
                        item2Meta.setDisplayName(ChatColor.GOLD + "Healer Wand");
                        item2Meta.setLore(itemLore);
                        item2.setItemMeta(item2Meta);

                        ItemStack item4 = new ItemStack(Material.CARROT);
                        ItemMeta item4Meta = item4.getItemMeta();
                        item4Meta.setDisplayName(ChatColor.GREEN + "Infini-Carrot");
                        item4Meta.addEnchant(Enchantment.DURABILITY, 1, false);
                        item4Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        item4Meta.setLore(itemLore);
                        item4.setItemMeta(item4Meta);

                        ItemStack item5 = new ItemStack(Material.GOLDEN_CARROT);
                        ItemMeta item5Meta = item5.getItemMeta();
                        item5Meta.setDisplayName(ChatColor.DARK_PURPLE + "Infini-Golden Carrot");
                        item5Meta.addEnchant(Enchantment.DURABILITY, 1, false);
                        item5Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        item5Meta.setLore(itemLore);
                        item5.setItemMeta(item5Meta);

                        ItemStack item7 = new ItemStack(Material.DIAMOND_PICKAXE);
                        ItemMeta item7Meta = item7.getItemMeta();
                        item7Meta.setDisplayName(ChatColor.DARK_PURPLE + "Diamond Drill");
                        item7Meta.addEnchant(Enchantment.DIG_SPEED, 1, false);
                        item7Meta.setLore(itemLore);
                        item7.setItemMeta(item7Meta);

                        ItemStack item8 = new ItemStack(Material.NETHERITE_PICKAXE);
                        ItemMeta item8Meta = item8.getItemMeta();
                        item8Meta.setDisplayName(ChatColor.GOLD + "Netherite Drill");
                        item8Meta.addEnchant(Enchantment.DIG_SPEED, 1, false);
                        item8Meta.setLore(itemLore);
                        item8.setItemMeta(item8Meta);

                        ItemStack item9 = new ItemStack(Material.IRON_INGOT);
                        ItemMeta item9Meta = item9.getItemMeta();
                        item9Meta.setDisplayName(ChatColor.GREEN + "Steel Ingot");
                        item9Meta.addEnchant(Enchantment.DIG_SPEED, 1, false);
                        item9Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        item9Meta.setLore(itemLore);
                        item9.setItemMeta(item9Meta);

                        ItemStack item10 = new ItemStack(Material.SMOOTH_STONE);
                        ItemMeta item10Meta = item10.getItemMeta();
                        item10Meta.setDisplayName(ChatColor.BLUE + "Steel Block");
                        item10Meta.addEnchant(Enchantment.DIG_SPEED, 1, false);
                        item10Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        item10Meta.setLore(itemLore);
                        item10.setItemMeta(item10Meta);

                        ItemStack item11 = new ItemStack(Material.MAGENTA_DYE);
                        ItemMeta item11Meta = item11.getItemMeta();
                        item11Meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Infinity Stone");
                        item11Meta.addEnchant(Enchantment.DIG_SPEED, 1, false);
                        item11Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        item11Meta.setLore(itemLore);
                        item11.setItemMeta(item11Meta);

                        ItemStack item12 = new ItemStack(Material.GOLD_INGOT);
                        ItemMeta item12Meta = item12.getItemMeta();
                        item12Meta.setDisplayName(ChatColor.BLUE + "Refined Gold");
                        item12Meta.addEnchant(Enchantment.DURABILITY, 1, false);
                        item12Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        item12Meta.setLore(itemLore);
                        item12.setItemMeta(item12Meta);

                        ItemStack item13 = new ItemStack(Material.YELLOW_GLAZED_TERRACOTTA);
                        ItemMeta item13Meta = item13.getItemMeta();
                        item13Meta.setDisplayName(ChatColor.DARK_PURPLE + "Refined Gold Block");
                        item13Meta.addEnchant(Enchantment.DURABILITY, 1, false);
                        item13Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        item13Meta.setLore(itemLore);
                        item13.setItemMeta(item13Meta);

                        ItemStack item14 = new ItemStack(Material.LEATHER_HELMET);
                        LeatherArmorMeta item14Meta = (LeatherArmorMeta) item14.getItemMeta();
                        item14Meta.setDisplayName(ChatColor.GOLD + "Warden Armor Set");
                        item14Meta.setColor(Color.fromRGB(24,80,116));
                        item14Meta.setLore(itemLore);
                        item14.setItemMeta(item14Meta);


                        ItemStack item16 = new ItemStack(Material.EMERALD);
                        ItemMeta item16Meta = item16.getItemMeta();
                        item16Meta.setDisplayName(ChatColor.GREEN + "Refined Emerald");
                        item16Meta.addEnchant(Enchantment.DURABILITY, 1, false);
                        item16Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        item16Meta.setLore(itemLore);
                        item16.setItemMeta(item16Meta);

                        ItemStack item17 = new ItemStack(Material.WHITE_CONCRETE_POWDER);
                        ItemMeta item17Meta = item17.getItemMeta();
                        item17Meta.setDisplayName(ChatColor.WHITE + "Sugar Block");
                        item17Meta.setLore(itemLore);
                        item17.setItemMeta(item17Meta);

                        ItemStack item18 = new ItemStack(Material.GREEN_GLAZED_TERRACOTTA);
                        ItemMeta item18Meta = item18.getItemMeta();
                        item18Meta.setDisplayName(ChatColor.BLUE + "Refined Emerald Block");
                        item18Meta.addEnchant(Enchantment.DURABILITY, 1 , false);
                        item18Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        item18Meta.setLore(itemLore);
                        item18.setItemMeta(item18Meta);


                        customItems.addItem(item1);
                        customItems.addItem(item2);
                        customItems.addItem(item4);
                        customItems.addItem(item5);
                        customItems.addItem(IronDrillUtil.giveOnMenu());
                        customItems.addItem(item7);
                        customItems.addItem(item8);
                        customItems.addItem(item9);
                        customItems.addItem(item10);
                        customItems.addItem(item11);
                        customItems.addItem(item12);
                        customItems.addItem(item13);
                        customItems.addItem(item14);
                        customItems.addItem(WardenArmorUtil.giveFrag());
                        customItems.addItem(item16);
                        customItems.addItem(EmeraldArmorUtil.giveArmor());
                        customItems.addItem(GolemArmorUtil.giveArmor());
                        customItems.addItem(VitalityArmorUtil.giveArmor());
                        customItems.addItem(item17);
                        customItems.addItem(RunnerArmorUtil.giveArmor());
                        customItems.addItem(item18);
                        customItems.addItem(EmeraldPickaxeUtil.giveOnMenu());
                        customItems.addItem(SculkWandUtil.giveOnMenu());
                        customItems.addItem(CustomTotemsUtil.giveGTotem());
                        customItems.addItem(CustomTotemsUtil.giveRTotem());
                        customItems.addItem(CustomTotemsUtil.giveVTotem());
                        customItems.addItem(CarlosUtil.giveItem());
                        customItems.addItem(CarlosUtil.giveSoulItem());
                        customItems.addItem(LavaExplorerSetUtil.giveArmor());
                        customItems.addItem(LavaExplorerSetUtil.giveFilaMenu());
                        customItems.addItem(LavaExplorerSetUtil.giveBuckleMenu());
                        customItems.addItem(TokensUtil.giveSeaArtifactOnMenu());
                        customItems.addItem(TokensUtil.giveEssOnMenu());
                        customItems.addItem(RabbitBootsUtil.giveOnMenu());
                        customItems.addItem(DragonWingsUtil.giveCoreMenu());
                        customItems.addItem(DragonWingsUtil.giveGoldElytraMenu());
                        customItems.addItem(DragonWingsUtil.giveIronElytraMenu());
                        customItems.addItem(DragonWingsUtil.giveDiamondElytraMenu());
                        customItems.addItem(DragonWingsUtil.giveNetherElytraMenu());
                        customItems.addItem(GhostAnihilatorUtil.giveEctoplasmMenu());
                        customItems.addItem(GhostAnihilatorUtil.giveAnnihilatorMenu());
                        customItems.addItem(NightGooglesUtil.giveGogglesMenu());
                        customItems.addItem(VampireSword.giveMenu());
                        customItems.addItem(VampireSword.giveFangMenu());
                        customItems.addItem(VampireSword.giveBladeMenu());
                        customItems.addItem(GrimReaperArmorUtil.giveGrimArmor());
                        customItems.addItem(GrimReaperArmorUtil.giveChainsMenu());
                        customItems.addItem(RefinedCopperUtil.giveIngotMenu());
                        customItems.addItem(RefinedCopperUtil.giveBlockMenu());
                        p.openInventory(customItems);

                        p.playSound(p, Sound.BLOCK_ENDER_CHEST_OPEN, 1.0f, 1.5f);
                    } else {
                        p.sendMessage(ChatColor.RED + "You need higher permissions to use this item");
                    }
                }
                e.setCancelled(true);
            }
        }
    }
    @EventHandler
    public void onGUIClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        ItemStack item = e.getCurrentItem();
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.DARK_RED + "Custom Items")) {
            if (item != null) {
                if (e.getCurrentItem().getType().equals(Material.DIAMOND_SHOVEL)) {
                    ItemStack aotv = AspectOfTheVoidUtil.giveAOTV();
                    p.getInventory().addItem(aotv);
                }
                if (e.getCurrentItem().getType().equals(Material.GOLDEN_SWORD)) {
                    ItemStack healWand = HealerWandUtil.giveHealerWand();
                    p.getInventory().addItem(healWand);
                }
                if (e.getCurrentItem().getType().equals(Material.CARROT)) {
                    ItemStack carrot = InfiniCarrotsUtil.giveInfiniCarrot();
                    p.getInventory().addItem(carrot);
                }
                if (e.getCurrentItem().getType().equals(Material.GOLDEN_CARROT)) {
                    ItemStack carrot = InfiniCarrotsUtil.giveInfiniGCarrot();
                    p.getInventory().addItem(carrot);
                }
                if (e.getCurrentItem().equals(IronDrillUtil.giveOnMenu())) {
                    ItemStack ironDrill = IronDrillUtil.giveIronDrill();
                    p.getInventory().addItem(ironDrill);
                }
                if (e.getCurrentItem().getType().equals(Material.DIAMOND_PICKAXE)) {
                    ItemStack diamondDrill = DiamondDrillUtil.giveDiamondDrill();
                    p.getInventory().addItem(diamondDrill);
                }
                if (e.getCurrentItem().getType().equals(Material.NETHERITE_PICKAXE)) {
                    ItemStack netherDrill = NetheriteDrillUtil.giveNetheriteDrill();
                    p.getInventory().addItem(netherDrill);
                }
                if (e.getCurrentItem().getType().equals(Material.IRON_INGOT)) {
                    ItemStack steelIngot = steelIngotUtil.giveSteelIngot();
                    p.getInventory().addItem(steelIngot);
                }
                if (e.getCurrentItem().getType().equals(Material.SMOOTH_STONE)) {
                    ItemStack steelBlock = steelIngotUtil.giveSteelBlock();
                    p.getInventory().addItem(steelBlock);
                }
                if (e.getCurrentItem().getType().equals(Material.MAGENTA_DYE)) {
                    ItemStack infinityStone = InfinityStoneUtil.giveInfinityStone();
                    p.getInventory().addItem(infinityStone);
                }
                if (e.getCurrentItem().getType().equals(Material.GOLD_INGOT)) {
                    ItemStack refinedGold = RefinedGoldUtil.giveRefinedGold();
                    p.getInventory().addItem(refinedGold);
                }
                if (e.getCurrentItem().getType().equals(Material.YELLOW_GLAZED_TERRACOTTA)) {
                    ItemStack refinedGoldBlock = RefinedGoldUtil.giveRefinedGoldBlock();
                    p.getInventory().addItem(refinedGoldBlock);
                }
                if (e.getCurrentItem().equals(WardenArmorUtil.giveArmor())) {
                    ItemStack helmet = WardenArmorUtil.giveWardenHelmet();
                    ItemStack chest = WardenArmorUtil.giveWardenChestplate();
                    ItemStack legs = WardenArmorUtil.giveWardenLeggins();
                    ItemStack boot = WardenArmorUtil.giveWardenBoots();
                    p.getInventory().addItem(helmet);
                    p.getInventory().addItem(chest);
                    p.getInventory().addItem(legs);
                    p.getInventory().addItem(boot);
                }
                if (e.getCurrentItem().equals(WardenArmorUtil.giveFrag())) {
                    ItemStack sculkFrag = WardenArmorUtil.giveSculkFragment();
                    p.getInventory().addItem(sculkFrag);
                }
                if (e.getCurrentItem().getType().equals(Material.EMERALD)) {
                    ItemStack refinedEmerald = EmeraldArmorUtil.giveRefinedEmerald();
                    p.getInventory().addItem(refinedEmerald);
                }
                if (e.getCurrentItem().equals(EmeraldArmorUtil.giveArmor())) {
                    ItemStack helmet = EmeraldArmorUtil.giveEmeraldHelmet();
                    ItemStack chest = EmeraldArmorUtil.giveEmeraldChest();
                    ItemStack legs = EmeraldArmorUtil.giveEmeraldLegs();
                    ItemStack boots = EmeraldArmorUtil.giveEmeraldBoots();
                    p.getInventory().addItem(helmet,chest,legs,boots);
                }
                if (e.getCurrentItem().equals(GolemArmorUtil.giveArmor())) {
                    ItemStack helmet = GolemArmorUtil.giveHelmet();
                    ItemStack chest = GolemArmorUtil.giveChest();
                    ItemStack legs = GolemArmorUtil.giveLegs();
                    ItemStack boots = GolemArmorUtil.giveBoots();
                    p.getInventory().addItem(helmet,chest,legs,boots);
                }
                if (e.getCurrentItem().equals(VitalityArmorUtil.giveArmor())) {
                    ItemStack helmet = VitalityArmorUtil.giveHelmet();
                    ItemStack chest = VitalityArmorUtil.giveChest();
                    ItemStack legs = VitalityArmorUtil.giveLegs();
                    ItemStack boots = VitalityArmorUtil.giveBoots();
                    p.getInventory().addItem(helmet,chest,legs,boots);
                }
                if (e.getCurrentItem().getType().equals(Material.WHITE_CONCRETE_POWDER)){
                    ItemStack sugarBlock = RunnerArmorUtil.giveSugarBlock();
                    p.getInventory().addItem(sugarBlock);
                }
                if (e.getCurrentItem().equals(RunnerArmorUtil.giveArmor())) {
                    ItemStack helmet = RunnerArmorUtil.giveHelmet();
                    ItemStack chest = RunnerArmorUtil.giveChest();
                    ItemStack legs = RunnerArmorUtil.giveLegs();
                    ItemStack boots = RunnerArmorUtil.giveBoots();
                    p.getInventory().addItem(helmet,chest,legs,boots);
                }
                if (e.getCurrentItem().getType().equals(Material.GREEN_GLAZED_TERRACOTTA)){
                    ItemStack refinedEmeraldBlock = EmeraldArmorUtil.giveRefinedEmeraldBLock();
                    p.getInventory().addItem(refinedEmeraldBlock);
                }
                if (e.getCurrentItem().equals(EmeraldPickaxeUtil.giveOnMenu())) {
                    ItemStack pick = EmeraldPickaxeUtil.givePickaxe();
                    p.getInventory().addItem(pick);
                }
                if (e.getCurrentItem().equals(SculkWandUtil.giveOnMenu())) {
                    ItemStack wand = SculkWandUtil.giveWand();
                    p.getInventory().addItem(wand);
                }
                if (e.getCurrentItem().equals(CustomTotemsUtil.giveGTotem())) {
                    ItemStack totem = CustomTotemsUtil.giveTankTotem();
                    p.getInventory().addItem(totem);
                }
                if (e.getCurrentItem().equals(CustomTotemsUtil.giveRTotem())) {
                    ItemStack totem = CustomTotemsUtil.giveRunnerTotem();
                    p.getInventory().addItem(totem);
                }
                if (e.getCurrentItem().equals(CustomTotemsUtil.giveVTotem())) {
                    ItemStack totem = CustomTotemsUtil.giveVitalityTotem();
                    p.getInventory().addItem(totem);
                }
                if (e.getCurrentItem().equals(CarlosUtil.giveItem())) {
                    ItemStack carlos = CarlosUtil.giveCarlos();
                    p.getInventory().addItem(carlos);
                }
                if (e.getCurrentItem().equals(CarlosUtil.giveSoulItem())) {
                    ItemStack soul = CarlosUtil.giveSoul();
                    p.getInventory().addItem(soul);
                }
                if (e.getCurrentItem().equals(LavaExplorerSetUtil.giveArmor())) {
                    ItemStack helmet = LavaExplorerSetUtil.giveHelmet();
                    ItemStack chest = LavaExplorerSetUtil.giveChest();
                    ItemStack legs = LavaExplorerSetUtil.giveLegs();
                    ItemStack boots = LavaExplorerSetUtil.giveBoots();
                    p.getInventory().addItem(helmet, chest, legs, boots);
                }
                if (e.getCurrentItem().equals(LavaExplorerSetUtil.giveFilaMenu())) {
                    ItemStack filament = LavaExplorerSetUtil.giveFilament();
                    p.getInventory().addItem(filament);
                }
                if (e.getCurrentItem().equals(LavaExplorerSetUtil.giveBuckleMenu())) {
                    ItemStack buckle = LavaExplorerSetUtil.givePiglinBuckle();
                    p.getInventory().addItem(buckle);
                }
                if (e.getCurrentItem().equals(TokensUtil.giveSeaArtifactOnMenu())) {
                    ItemStack artifact = TokensUtil.giveSeaArtifact();
                    p.getInventory().addItem(artifact);
                }
                if (e.getCurrentItem().equals(TokensUtil.giveEssOnMenu())) {
                    ItemStack essence = TokensUtil.giveFlamingEssence();
                    p.getInventory().addItem(essence);
                }
                if (e.getCurrentItem().equals(RabbitBootsUtil.giveOnMenu())) {
                    ItemStack boots = RabbitBootsUtil.giveRabbitBoots();
                    p.getInventory().addItem(boots);
                }
                if (e.getCurrentItem().equals(DragonWingsUtil.giveCoreMenu())) {
                    ItemStack core = DragonWingsUtil.giveCore();
                    p.getInventory().addItem(core);
                }
                if (e.getCurrentItem().getItemMeta().getLocalizedName().equalsIgnoreCase("golden_armored_elytra")) {
                    p.getInventory().addItem(DragonWingsUtil.giveGoldElytra());
                }
                if (e.getCurrentItem().getItemMeta().getLocalizedName().equalsIgnoreCase("iron_armored_elytra")) {
                    p.getInventory().addItem(DragonWingsUtil.giveIronElytra());
                }
                if (e.getCurrentItem().getItemMeta().getLocalizedName().equalsIgnoreCase("diamond_armored_elytra")) {
                    p.getInventory().addItem(DragonWingsUtil.giveDiamondElytra());
                }
                if (e.getCurrentItem().getItemMeta().getLocalizedName().equalsIgnoreCase("netherite_armored_elytra")) {
                    p.getInventory().addItem(DragonWingsUtil.giveNetherElytra());
                }
                if (e.getCurrentItem().equals(GhostAnihilatorUtil.giveEctoplasmMenu())) {
                    p.getInventory().addItem(GhostAnihilatorUtil.giveEctoplasm());
                }
                if (e.getCurrentItem().equals(GhostAnihilatorUtil.giveAnnihilatorMenu())) {
                    p.getInventory().addItem(GhostAnihilatorUtil.giveAnnihilator());
                }
                if (e.getCurrentItem().equals(NightGooglesUtil.giveGogglesMenu())) {
                    p.getInventory().addItem(NightGooglesUtil.giveGoggles());
                }
                if (e.getCurrentItem().equals(VampireSword.giveMenu())) {
                    p.getInventory().addItem(VampireSword.giveVampireSword());
                }
                if (e.getCurrentItem().equals(VampireSword.giveFangMenu())) {
                    p.getInventory().addItem(VampireSword.giveVampireFang());
                }
                if (e.getCurrentItem().equals(VampireSword.giveBladeMenu())) {
                    p.getInventory().addItem(VampireSword.giveBloodBlade());
                }
                if (e.getCurrentItem().equals(GrimReaperArmorUtil.giveGrimArmor())) {
                    p.getInventory().addItem(GrimReaperArmorUtil.giveGrimHelmet());
                    p.getInventory().addItem(GrimReaperArmorUtil.giveGrimChestplate());
                    p.getInventory().addItem(GrimReaperArmorUtil.giveGrimLeggings());
                    p.getInventory().addItem(GrimReaperArmorUtil.giveGrimBoots());
                }
                if (e.getCurrentItem().equals(GrimReaperArmorUtil.giveChainsMenu())) {
                    p.getInventory().addItem(GrimReaperArmorUtil.giveUndeadChains());
                }
                if (e.getCurrentItem().equals(RefinedCopperUtil.giveIngotMenu())) {
                    p.getInventory().addItem(RefinedCopperUtil.giveIngot());
                }
                if (e.getCurrentItem().equals(RefinedCopperUtil.giveBlockMenu())) {
                    p.getInventory().addItem(RefinedCopperUtil.giveBlock());
                }
            }
            e.setCancelled(true);
        }
    }
}
