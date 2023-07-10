package org.markmanflame55.flareplugin.EventListeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.markmanflame55.flareplugin.Utils.*;


public class viewRecipeInventoryListener implements Listener {

    @EventHandler
    public void OnInventoryClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();

        ItemStack bg = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta bgName = bg.getItemMeta();
        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        if (e.getView().getTitle().equalsIgnoreCase("Recipes List")) {

            ItemStack item = e.getCurrentItem();
            if (item != null) {

                if (e.getCurrentItem().equals(steelIngotUtil.giveSteelIngot())) {

                    p.openInventory(ViewRecipesUtil.craftSteelIngot(p));

                } else if (e.getCurrentItem().equals(steelIngotUtil.giveSteelBlock())) {

                    p.openInventory(ViewRecipesUtil.craftSteelBlock(p));

                } else if (e.getCurrentItem().equals(IronDrillUtil.giveIronDrill())) {

                    p.openInventory(ViewRecipesUtil.craftIronDrill(p));

                } else if (e.getCurrentItem().equals(DiamondDrillUtil.giveDiamondDrill())) {

                    p.openInventory(ViewRecipesUtil.craftDiamondDrill(p));

                } else if (e.getCurrentItem().equals(NetheriteDrillUtil.giveNetheriteDrill())) {

                    p.openInventory(ViewRecipesUtil.craftNetherDrill(p));

                } else if (e.getCurrentItem().equals(InfinityStoneUtil.giveInfinityStone())) {

                    p.openInventory(ViewRecipesUtil.craftInfinityStone(p));

                } else if (e.getCurrentItem().equals(RefinedGoldUtil.giveRefinedGold())) {

                    p.openInventory(ViewRecipesUtil.craftRefinedGold(p));

                } else if (e.getCurrentItem().equals(RefinedGoldUtil.giveRefinedGoldBlock())) {

                    p.openInventory(ViewRecipesUtil.craftRefinedGoldBlock(p));

                } else if (e.getCurrentItem().equals(InfiniCarrotsUtil.giveInfiniCarrot())) {

                    p.openInventory(ViewRecipesUtil.craftInfiniCarrot(p));

                } else if (e.getCurrentItem().equals(InfiniCarrotsUtil.giveInfiniGCarrot())) {

                    p.openInventory(ViewRecipesUtil.craftInfiniGCarrot(p));

                } else if (e.getCurrentItem().equals(HealerWandUtil.giveHealerWand())) {

                    p.openInventory(ViewRecipesUtil.craftHealerWand(p));

                } else if (e.getCurrentItem().equals(EmeraldArmorUtil.giveRefinedEmerald())) {

                    p.openInventory(ViewRecipesUtil.craftRefinedEmerald(p));

                } else if (e.getCurrentItem().equals(EmeraldArmorUtil.giveRefinedEmeraldBLock())) {

                    p.openInventory(ViewRecipesUtil.craftRefinedEmeraldBlock(p));

                } else if (e.getCurrentItem().equals(RunnerArmorUtil.giveSugarBlock())) {

                    p.openInventory(ViewRecipesUtil.craftSugarBlock(p));

                } else if (item.equals(WardenArmorUtil.giveWardenHelmet())) {

                    p.openInventory(ViewRecipesUtil.craftWardenHelmet(p));

                } else if (e.getCurrentItem().equals(WardenArmorUtil.giveWardenChestplate())) {

                    p.openInventory(ViewRecipesUtil.craftWardenChestplate(p));

                } else if (e.getCurrentItem().equals(WardenArmorUtil.giveWardenLeggins())) {

                    p.openInventory(ViewRecipesUtil.craftWardenLegs(p));

                } else if (e.getCurrentItem().equals(WardenArmorUtil.giveWardenBoots())) {

                    p.openInventory(ViewRecipesUtil.craftWardenBoots(p));

                } else if (e.getCurrentItem().equals(VitalityArmorUtil.giveHelmet())) {

                    p.openInventory(ViewRecipesUtil.craftVitalityHelmet(p));

                } else if (e.getCurrentItem().equals(VitalityArmorUtil.giveChest())) {

                    p.openInventory(ViewRecipesUtil.craftVitalityChest(p));

                } else if (e.getCurrentItem().equals(VitalityArmorUtil.giveLegs())) {

                    p.openInventory(ViewRecipesUtil.craftVitalityLegs(p));

                } else if (e.getCurrentItem().equals(VitalityArmorUtil.giveBoots())) {

                    p.openInventory(ViewRecipesUtil.craftVitalityBoots(p));

                } else if (e.getCurrentItem().equals(RunnerArmorUtil.giveHelmet())) {

                    p.openInventory(ViewRecipesUtil.craftRunnerHelmet(p));

                } else if (e.getCurrentItem().equals(RunnerArmorUtil.giveChest())) {

                    p.openInventory(ViewRecipesUtil.craftRunnerChest(p));

                } else if (e.getCurrentItem().equals(RunnerArmorUtil.giveLegs())){

                    p.openInventory(ViewRecipesUtil.craftRunnerLegs(p));

                } else if (e.getCurrentItem().equals(RunnerArmorUtil.giveBoots())) {

                    p.openInventory(ViewRecipesUtil.craftRunnerBoots(p));

                } else if (e.getCurrentItem().equals(GolemArmorUtil.giveHelmet())) {

                    p.openInventory(ViewRecipesUtil.craftGolemHelmet(p));

                } else if (e.getCurrentItem().equals(GolemArmorUtil.giveChest())) {

                    p.openInventory(ViewRecipesUtil.craftGolemChest(p));

                } else if (e.getCurrentItem().equals(GolemArmorUtil.giveLegs())) {

                    p.openInventory(ViewRecipesUtil.craftGolemLegs(p));

                } else if (e.getCurrentItem().equals(GolemArmorUtil.giveBoots())) {

                    p.openInventory(ViewRecipesUtil.craftGolemBoots(p));

                } else if (e.getCurrentItem().equals(EmeraldArmorUtil.giveEmeraldHelmet())) {

                    p.openInventory(ViewRecipesUtil.craftEmeraldHelmet(p));

                } else if (e.getCurrentItem().equals(EmeraldArmorUtil.giveEmeraldChest())) {

                    p.openInventory(ViewRecipesUtil.craftEmeraldChest(p));

                } else if (e.getCurrentItem().equals(EmeraldArmorUtil.giveEmeraldLegs())) {

                    p.openInventory(ViewRecipesUtil.craftEmeraldLegs(p));

                } else if (e.getCurrentItem().equals(EmeraldArmorUtil.giveEmeraldBoots())) {

                    p.openInventory(ViewRecipesUtil.craftEmeraldBoots(p));

                } else if (e.getCurrentItem().equals(WardenArmorUtil.giveFrag())) {

                    p.openInventory(ViewRecipesUtil.craftSculkFrag(p));

                } else if (e.getCurrentItem().equals(SculkWandUtil.giveWand())) {

                    p.openInventory(ViewRecipesUtil.craftSculkWand(p));

                } else if (e.getCurrentItem().equals(CustomTotemsUtil.giveRunnerTotem())) {

                    p.openInventory(ViewRecipesUtil.craftRunnerTotem(p));

                } else if (e.getCurrentItem().equals(CustomTotemsUtil.giveTankTotem())) {

                    p.openInventory(ViewRecipesUtil.craftGolemTotem(p));

                } else if (e.getCurrentItem().equals(CustomTotemsUtil.giveVitalityTotem())) {

                    p.openInventory(ViewRecipesUtil.craftVitalityTotem(p));

                } else if (e.getCurrentItem().equals(CarlosUtil.giveCarlos())) {

                    p.openInventory(ViewRecipesUtil.craftCarlos(p));

                } else if (e.getCurrentItem().equals(CarlosUtil.giveSoul())) {

                    p.openInventory(ViewRecipesUtil.craftCarlosSoul(p));

                } else if (e.getCurrentItem().equals(LavaExplorerSetUtil.giveHelmet())) {

                    p.openInventory(ViewRecipesUtil.craftLavaHelmet(p));

                } else if (e.getCurrentItem().equals(LavaExplorerSetUtil.giveChest())) {

                    p.openInventory(ViewRecipesUtil.craftLavaChest(p));

                } else if (e.getCurrentItem().equals(LavaExplorerSetUtil.giveLegs())) {

                    p.openInventory(ViewRecipesUtil.craftLavaLegs(p));

                } else if (e.getCurrentItem().equals(LavaExplorerSetUtil.giveBoots())) {

                    p.openInventory(ViewRecipesUtil.craftLavaBoots(p));

                }
            }
            e.setCancelled(true);
        }
    }
}
