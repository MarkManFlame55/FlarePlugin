package org.markmanflame55.flareplugin.Utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.SmithingRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class ViewRecipesUtil {

    public static ItemStack bg = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
    public static ItemMeta bgName = bg.getItemMeta();
    public static  Inventory viewRecipes(Player p) {

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        Inventory recipesViewer = Bukkit.createInventory(p, 54, "Recipes List");

        for (int i = 0;i<=8;i++) {
            recipesViewer.setItem(i, bg);
        }
        ItemStack helpItem = new ItemStack(Material.GRASS_BLOCK);
        ItemMeta helpMeta = helpItem.getItemMeta();
        helpMeta.setDisplayName(ChatColor.GREEN + "Click on the items to see their recipes!");
        helpItem.setItemMeta(helpMeta);

        recipesViewer.setItem(4, helpItem);
        recipesViewer.addItem(steelIngotUtil.giveSteelIngot()); //
        recipesViewer.addItem(steelIngotUtil.giveSteelBlock()); //
        recipesViewer.addItem(IronDrillUtil.giveIronDrill()); //
        recipesViewer.addItem(DiamondDrillUtil.giveDiamondDrill()); //
        recipesViewer.addItem(NetheriteDrillUtil.giveNetheriteDrill()); //
        recipesViewer.addItem(InfinityStoneUtil.giveInfinityStone()); //
        recipesViewer.addItem(RefinedGoldUtil.giveRefinedGold()); //
        recipesViewer.addItem(RefinedGoldUtil.giveRefinedGoldBlock()); //
        recipesViewer.addItem(InfiniCarrotsUtil.giveInfiniCarrot()); //
        recipesViewer.addItem(InfiniCarrotsUtil.giveInfiniGCarrot()); //
        recipesViewer.addItem(HealerWandUtil.giveHealerWand()); //
        recipesViewer.addItem(EmeraldArmorUtil.giveRefinedEmerald()); //
        recipesViewer.addItem(EmeraldArmorUtil.giveRefinedEmeraldBLock()); //
        recipesViewer.addItem(RunnerArmorUtil.giveSugarBlock()); //
        recipesViewer.addItem(WardenArmorUtil.giveWardenHelmet()); //
        recipesViewer.addItem(WardenArmorUtil.giveWardenChestplate()); //
        recipesViewer.addItem(WardenArmorUtil.giveWardenLeggins()); //
        recipesViewer.addItem(WardenArmorUtil.giveWardenBoots()); //
        recipesViewer.addItem(VitalityArmorUtil.giveHelmet()); //
        recipesViewer.addItem(VitalityArmorUtil.giveChest()); //
        recipesViewer.addItem(VitalityArmorUtil.giveLegs()); //
        recipesViewer.addItem(VitalityArmorUtil.giveBoots()); //
        recipesViewer.addItem(RunnerArmorUtil.giveHelmet()); //
        recipesViewer.addItem(RunnerArmorUtil.giveChest()); //
        recipesViewer.addItem(RunnerArmorUtil.giveLegs()); //
        recipesViewer.addItem(RunnerArmorUtil.giveBoots()); //
        recipesViewer.addItem(GolemArmorUtil.giveHelmet()); //
        recipesViewer.addItem(GolemArmorUtil.giveChest()); //
        recipesViewer.addItem(GolemArmorUtil.giveLegs()); //
        recipesViewer.addItem(GolemArmorUtil.giveBoots()); //
        recipesViewer.addItem(EmeraldArmorUtil.giveEmeraldHelmet()); //
        recipesViewer.addItem(EmeraldArmorUtil.giveEmeraldChest()); //
        recipesViewer.addItem(EmeraldArmorUtil.giveEmeraldLegs()); //
        recipesViewer.addItem(EmeraldArmorUtil.giveEmeraldBoots()); //
        recipesViewer.addItem(LavaExplorerSetUtil.giveHelmet());
        recipesViewer.addItem(LavaExplorerSetUtil.giveChest());
        recipesViewer.addItem(LavaExplorerSetUtil.giveLegs());
        recipesViewer.addItem(LavaExplorerSetUtil.giveBoots());
        recipesViewer.addItem(WardenArmorUtil.giveFrag()); //
        recipesViewer.addItem(SculkWandUtil.giveWand()); //
        recipesViewer.addItem(CustomTotemsUtil.giveRunnerTotem()); //
        recipesViewer.addItem(CustomTotemsUtil.giveTankTotem()); //
        recipesViewer.addItem(CustomTotemsUtil.giveVitalityTotem()); //
        recipesViewer.addItem(CarlosUtil.giveCarlos()); //
        recipesViewer.addItem(CarlosUtil.giveSoul()); //

        return recipesViewer;
    }
    public static Inventory craftSteelIngot(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.FLINT));
        recipe.setItem(11, new ItemStack(Material.FLINT));
        recipe.setItem(12, new ItemStack(Material.FLINT));
        recipe.setItem(19, new ItemStack(Material.IRON_NUGGET));
        recipe.setItem(20, new ItemStack(Material.IRON_BLOCK));
        recipe.setItem(21, new ItemStack(Material.IRON_NUGGET));
        recipe.setItem(28, new ItemStack(Material.FLINT));
        recipe.setItem(29, new ItemStack(Material.FLINT));
        recipe.setItem(30, new ItemStack(Material.FLINT));
        recipe.setItem(24, steelIngotUtil.giveSteelIngot());
        return recipe;
    }
    public static Inventory craftSteelBlock(Player p) {
        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, steelIngotUtil.giveSteelIngot());
        recipe.setItem(11, steelIngotUtil.giveSteelIngot());
        recipe.setItem(12, steelIngotUtil.giveSteelIngot());
        recipe.setItem(19, steelIngotUtil.giveSteelIngot());
        recipe.setItem(20, steelIngotUtil.giveSteelIngot());
        recipe.setItem(21, steelIngotUtil.giveSteelIngot());
        recipe.setItem(28, steelIngotUtil.giveSteelIngot());
        recipe.setItem(29, steelIngotUtil.giveSteelIngot());
        recipe.setItem(30, steelIngotUtil.giveSteelIngot());
        recipe.setItem(24, steelIngotUtil.giveSteelBlock());
        return recipe;
    }
    public static Inventory craftDiamondDrill(Player p) {
        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.DIAMOND_BLOCK));
        recipe.setItem(11, steelIngotUtil.giveSteelIngot());
        recipe.setItem(12, new ItemStack(Material.DIAMOND_BLOCK));
        recipe.setItem(19, steelIngotUtil.giveSteelIngot());
        recipe.setItem(20, IronDrillUtil.giveIronDrill());
        recipe.setItem(21, steelIngotUtil.giveSteelIngot());
        recipe.setItem(28, new ItemStack(Material.DIAMOND_BLOCK));
        recipe.setItem(29, new ItemStack(Material.BLAZE_ROD));
        recipe.setItem(30, new ItemStack(Material.DIAMOND_BLOCK));
        recipe.setItem(24, DiamondDrillUtil.giveDiamondDrill());
        return recipe;
    }
    public static Inventory craftIronDrill(Player p) {
        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.IRON_BLOCK));
        recipe.setItem(11, new ItemStack(Material.FLINT));
        recipe.setItem(12, new ItemStack(Material.IRON_BLOCK));
        recipe.setItem(19, new ItemStack(Material.FLINT));
        recipe.setItem(20, new ItemStack(Material.DIAMOND_PICKAXE));
        recipe.setItem(21, new ItemStack(Material.FLINT));
        recipe.setItem(28, new ItemStack(Material.AIR));
        recipe.setItem(29, steelIngotUtil.giveSteelIngot());
        recipe.setItem(30, new ItemStack(Material.AIR));
        recipe.setItem(24, IronDrillUtil.giveIronDrill());

        return recipe;
    }
    public static Inventory craftNetherDrill(Player p) {
        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.NETHERITE_BLOCK));
        recipe.setItem(11, steelIngotUtil.giveSteelBlock());
        recipe.setItem(12, new ItemStack(Material.NETHERITE_BLOCK));
        recipe.setItem(19, steelIngotUtil.giveSteelBlock());
        recipe.setItem(20, DiamondDrillUtil.giveDiamondDrill());
        recipe.setItem(21, steelIngotUtil.giveSteelBlock());
        recipe.setItem(28, steelIngotUtil.giveSteelBlock());
        recipe.setItem(29, new ItemStack(Material.END_ROD));
        recipe.setItem(30, steelIngotUtil.giveSteelBlock());
        recipe.setItem(24, NetheriteDrillUtil.giveNetheriteDrill());
        return recipe;
    }
    public static Inventory craftInfinityStone(Player p) {
        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.EXPERIENCE_BOTTLE));
        recipe.setItem(11, new ItemStack(Material.NETHER_STAR));
        recipe.setItem(12, new ItemStack(Material.EXPERIENCE_BOTTLE));
        recipe.setItem(19, new ItemStack(Material.EXPERIENCE_BOTTLE));
        recipe.setItem(20, new ItemStack(Material.REDSTONE_BLOCK));
        recipe.setItem(21, new ItemStack(Material.EXPERIENCE_BOTTLE));
        recipe.setItem(28, new ItemStack(Material.AIR));
        recipe.setItem(29, new ItemStack(Material.END_CRYSTAL));
        recipe.setItem(30, new ItemStack(Material.AIR));
        recipe.setItem(24, InfinityStoneUtil.giveInfinityStone());
        return recipe;
    }
    public static Inventory craftRefinedGold(Player p) {
        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(19, steelIngotUtil.giveSteelIngot());
        recipe.setItem(20, new ItemStack(Material.GOLD_BLOCK));
        recipe.setItem(21, steelIngotUtil.giveSteelIngot());
        recipe.setItem(24, RefinedGoldUtil.giveRefinedGold());
        return recipe;
    }
    public static Inventory craftRefinedGoldBlock(Player p) {
        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(11, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(12, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(19, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(20, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(21, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(28, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(29, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(30, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(24, RefinedGoldUtil.giveRefinedGoldBlock());
        return recipe;
    }
    public static Inventory craftInfiniCarrot(Player p) {
        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.CARROT));
        recipe.setItem(11, new ItemStack(Material.CARROT));
        recipe.setItem(12, new ItemStack(Material.CARROT));
        recipe.setItem(19, new ItemStack(Material.CARROT));
        recipe.setItem(20, InfinityStoneUtil.giveInfinityStone());
        recipe.setItem(21, new ItemStack(Material.CARROT));
        recipe.setItem(28, new ItemStack(Material.CARROT));
        recipe.setItem(29, new ItemStack(Material.CARROT));
        recipe.setItem(30, new ItemStack(Material.CARROT));
        recipe.setItem(24, InfiniCarrotsUtil.giveInfiniCarrot());
        return recipe;
    }
    public static Inventory craftInfiniGCarrot(Player p) {

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(11, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(12, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(19, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(20, InfiniCarrotsUtil.giveInfiniCarrot());
        recipe.setItem(21, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(28, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(29, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(30, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(24, InfiniCarrotsUtil.giveInfiniGCarrot());
        return recipe;
    }
    public static Inventory craftHealerWand(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.OXEYE_DAISY));
        recipe.setItem(11, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(12, new ItemStack(Material.OXEYE_DAISY));
        recipe.setItem(19, new ItemStack(Material.AIR));
        recipe.setItem(20, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(21, new ItemStack(Material.AIR));
        recipe.setItem(28, new ItemStack(Material.GOLDEN_APPLE));
        recipe.setItem(29, new ItemStack(Material.GHAST_TEAR));
        recipe.setItem(30, new ItemStack(Material.GOLDEN_APPLE));
        recipe.setItem(24, HealerWandUtil.giveHealerWand());

        return recipe;
    }
    public static Inventory craftRefinedEmerald(Player p) {

        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.AIR));
        recipe.setItem(11, new ItemStack(Material.AIR));
        recipe.setItem(12, new ItemStack(Material.AIR));
        recipe.setItem(19, steelIngotUtil.giveSteelIngot());
        recipe.setItem(20, new ItemStack(Material.EMERALD_BLOCK));
        recipe.setItem(21, steelIngotUtil.giveSteelIngot());
        recipe.setItem(28, new ItemStack(Material.AIR));
        recipe.setItem(29, new ItemStack(Material.AIR));
        recipe.setItem(30, new ItemStack(Material.AIR));
        recipe.setItem(24, EmeraldArmorUtil.giveRefinedEmerald());
        return recipe;
    }
    public static Inventory craftRefinedEmeraldBlock (Player p) {

        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(11, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(12, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(19, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(20, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(21, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(28, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(29, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(30, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(24, EmeraldArmorUtil.giveRefinedEmeraldBLock());
        return recipe;
    }
    public static Inventory craftSugarBlock(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.SUGAR));
        recipe.setItem(11, new ItemStack(Material.SUGAR));
        recipe.setItem(12, new ItemStack(Material.SUGAR));
        recipe.setItem(19, new ItemStack(Material.SUGAR));
        recipe.setItem(20, new ItemStack(Material.SUGAR));
        recipe.setItem(21, new ItemStack(Material.SUGAR));
        recipe.setItem(28, new ItemStack(Material.SUGAR));
        recipe.setItem(29, new ItemStack(Material.SUGAR));
        recipe.setItem(30, new ItemStack(Material.SUGAR));
        recipe.setItem(24, RunnerArmorUtil.giveSugarBlock());
        return recipe;
    }
    public static Inventory craftWardenHelmet(Player p) {

        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(11, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(12, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(19, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(20, new ItemStack(Material.DIAMOND_HELMET));
        recipe.setItem(21, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(28, new ItemStack(Material.AIR));
        recipe.setItem(29, new ItemStack(Material.AIR));
        recipe.setItem(30, new ItemStack(Material.AIR));
        recipe.setItem(24, WardenArmorUtil.giveWardenHelmet());
        return recipe;
    }
    public static Inventory craftWardenChestplate(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(11, new ItemStack(Material.DIAMOND_CHESTPLATE));
        recipe.setItem(12, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(19, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(20, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(21, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(28, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(29, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(30, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(24, WardenArmorUtil.giveWardenChestplate());
        return recipe;
    }
    public static Inventory craftWardenLegs(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(11, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(12, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(19, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(20, new ItemStack(Material.DIAMOND_LEGGINGS));
        recipe.setItem(21, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(28, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(29, new ItemStack(Material.AIR));
        recipe.setItem(30, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(24, WardenArmorUtil.giveWardenLeggins());
        return recipe;
    }
    public static Inventory craftWardenBoots(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.AIR));
        recipe.setItem(11, new ItemStack(Material.AIR));
        recipe.setItem(12, new ItemStack(Material.AIR));
        recipe.setItem(19, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(20, new ItemStack(Material.AIR));
        recipe.setItem(21, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(28, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(29, new ItemStack(Material.DIAMOND_BOOTS));
        recipe.setItem(30, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(24, WardenArmorUtil.giveWardenBoots());
        return recipe;
    }
    public static Inventory craftVitalityHelmet(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(11, new ItemStack(Material.GLOWSTONE));
        recipe.setItem(12, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(19, new ItemStack(Material.GHAST_TEAR));
        recipe.setItem(20, new ItemStack(Material.AIR));
        recipe.setItem(21, new ItemStack(Material.GHAST_TEAR));
        recipe.setItem(28, new ItemStack(Material.AIR));
        recipe.setItem(29, new ItemStack(Material.AIR));
        recipe.setItem(30, new ItemStack(Material.AIR));
        recipe.setItem(24, VitalityArmorUtil.giveHelmet());
        return recipe;
    }
    public static Inventory craftVitalityChest(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.GHAST_TEAR));
        recipe.setItem(11, new ItemStack(Material.AIR));
        recipe.setItem(12, new ItemStack(Material.GHAST_TEAR));
        recipe.setItem(19, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(20, RefinedGoldUtil.giveRefinedGoldBlock());
        recipe.setItem(21, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(28, new ItemStack(Material.GLOWSTONE));
        recipe.setItem(29, new ItemStack(Material.GLOWSTONE));
        recipe.setItem(30, new ItemStack(Material.GLOWSTONE));
        recipe.setItem(24, VitalityArmorUtil.giveChest());
        return recipe;
    }
    public static Inventory craftVitalityLegs(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.GLOWSTONE));
        recipe.setItem(11, new ItemStack(Material.GLOWSTONE));
        recipe.setItem(12, new ItemStack(Material.GLOWSTONE));
        recipe.setItem(19, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(20, new ItemStack(Material.AIR));
        recipe.setItem(21, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(28, new ItemStack(Material.GHAST_TEAR));
        recipe.setItem(29, new ItemStack(Material.AIR));
        recipe.setItem(30, new ItemStack(Material.GHAST_TEAR));
        recipe.setItem(24, VitalityArmorUtil.giveLegs());
        return recipe;
    }
    public static Inventory craftVitalityBoots(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.AIR));
        recipe.setItem(11, new ItemStack(Material.AIR));
        recipe.setItem(12, new ItemStack(Material.AIR));
        recipe.setItem(19, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(20, new ItemStack(Material.AIR));
        recipe.setItem(21, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(28, new ItemStack(Material.GHAST_TEAR));
        recipe.setItem(29, new ItemStack(Material.AIR));
        recipe.setItem(30, new ItemStack(Material.GHAST_TEAR));
        recipe.setItem(24, VitalityArmorUtil.giveBoots());
        return recipe;
    }
    public static Inventory craftRunnerHelmet(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(11, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(12, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(19, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(20, new ItemStack(Material.IRON_HELMET));
        recipe.setItem(21, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(28, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(29, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(30, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(24, RunnerArmorUtil.giveHelmet());
        return recipe;
    }
    public static Inventory craftRunnerChest(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(11, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(12, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(19, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(20, new ItemStack(Material.IRON_CHESTPLATE));
        recipe.setItem(21, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(28, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(29, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(30, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(24, RunnerArmorUtil.giveChest());
        return recipe;
    }
    public static Inventory craftRunnerLegs (Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(11, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(12, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(19, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(20, new ItemStack(Material.IRON_LEGGINGS));
        recipe.setItem(21, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(28, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(29, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(30, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(24, RunnerArmorUtil.giveHelmet());
        return recipe;
    }
    public static Inventory craftRunnerBoots(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(11, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(12, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(19, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(20, new ItemStack(Material.IRON_BOOTS));
        recipe.setItem(21, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(28, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(29, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(30, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(24, RunnerArmorUtil.giveHelmet());
        return recipe;
    }
    public static Inventory craftGolemHelmet(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.IRON_BLOCK));
        recipe.setItem(11, new ItemStack(Material.IRON_BLOCK));
        recipe.setItem(12, new ItemStack(Material.IRON_BLOCK));
        recipe.setItem(19, steelIngotUtil.giveSteelBlock());
        recipe.setItem(20, new ItemStack(Material.AIR));
        recipe.setItem(21, steelIngotUtil.giveSteelBlock());
        recipe.setItem(28, new ItemStack(Material.AIR));
        recipe.setItem(29, new ItemStack(Material.AIR));
        recipe.setItem(30, new ItemStack(Material.AIR));
        recipe.setItem(24, GolemArmorUtil.giveHelmet());
        return recipe;
    }
    public static Inventory craftGolemChest(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.IRON_BLOCK));
        recipe.setItem(11, new ItemStack(Material.AIR));
        recipe.setItem(12, new ItemStack(Material.IRON_BLOCK));
        recipe.setItem(19, steelIngotUtil.giveSteelBlock());
        recipe.setItem(20, new ItemStack(Material.IRON_BLOCK));
        recipe.setItem(21, steelIngotUtil.giveSteelBlock());
        recipe.setItem(28, new ItemStack(Material.IRON_BLOCK));
        recipe.setItem(29, new ItemStack(Material.IRON_BLOCK));
        recipe.setItem(30, new ItemStack(Material.IRON_BLOCK));
        recipe.setItem(24, GolemArmorUtil.giveChest());
        return recipe;
    }
    public static Inventory craftGolemLegs(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.IRON_BLOCK));
        recipe.setItem(11, new ItemStack(Material.IRON_BLOCK));
        recipe.setItem(12, new ItemStack(Material.IRON_BLOCK));
        recipe.setItem(19, steelIngotUtil.giveSteelBlock());
        recipe.setItem(20, new ItemStack(Material.AIR));
        recipe.setItem(21, steelIngotUtil.giveSteelBlock());
        recipe.setItem(28, new ItemStack(Material.IRON_BLOCK));
        recipe.setItem(29, new ItemStack(Material.AIR));
        recipe.setItem(30, new ItemStack(Material.IRON_BLOCK));
        recipe.setItem(24, GolemArmorUtil.giveLegs());
        return recipe;
    }
    public static Inventory craftGolemBoots(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.AIR));
        recipe.setItem(11, new ItemStack(Material.AIR));
        recipe.setItem(12, new ItemStack(Material.AIR));
        recipe.setItem(19, steelIngotUtil.giveSteelBlock());
        recipe.setItem(20, new ItemStack(Material.AIR));
        recipe.setItem(21, steelIngotUtil.giveSteelBlock());
        recipe.setItem(28, new ItemStack(Material.IRON_BLOCK));
        recipe.setItem(29, new ItemStack(Material.AIR));
        recipe.setItem(30, new ItemStack(Material.IRON_BLOCK));
        recipe.setItem(24, GolemArmorUtil.giveBoots());
        return recipe;
    }
    public static Inventory craftEmeraldHelmet(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(11, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(12, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(19, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(20, new ItemStack(Material.AIR));
        recipe.setItem(21, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(28, new ItemStack(Material.AIR));
        recipe.setItem(29, new ItemStack(Material.AIR));
        recipe.setItem(30, new ItemStack(Material.AIR));
        recipe.setItem(24, EmeraldArmorUtil.giveEmeraldHelmet());
        return recipe;
    }
    public static Inventory craftEmeraldChest(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(11, new ItemStack(Material.AIR));
        recipe.setItem(12, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(19, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(20, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(21, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(28, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(29, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(30, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(24, EmeraldArmorUtil.giveEmeraldChest());
        return recipe;
    }
    public static Inventory craftEmeraldLegs(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(11, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(12, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(19, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(20, new ItemStack(Material.AIR));
        recipe.setItem(21, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(28, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(29, new ItemStack(Material.AIR));
        recipe.setItem(30, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(24, EmeraldArmorUtil.giveEmeraldLegs());
        return recipe;
    }
    public static Inventory craftEmeraldBoots(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.AIR));
        recipe.setItem(11, new ItemStack(Material.AIR));
        recipe.setItem(12, new ItemStack(Material.AIR));
        recipe.setItem(19, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(20, new ItemStack(Material.AIR));
        recipe.setItem(21, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(28, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(29, new ItemStack(Material.AIR));
        recipe.setItem(30, EmeraldArmorUtil.giveRefinedEmerald());
        recipe.setItem(24, EmeraldArmorUtil.giveEmeraldBoots());
        return recipe;
    }
    public static Inventory craftSculkFrag(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(11, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(12, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(19, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(20, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(21, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(28, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(29, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(30, new ItemStack(Material.ECHO_SHARD));
        recipe.setItem(24, WardenArmorUtil.giveSculkFragment());
        return recipe;
    }
    public static Inventory craftSculkWand(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.AIR));
        recipe.setItem(11, WardenArmorUtil.giveSculkFragment());
        recipe.setItem(12, new ItemStack(Material.AIR));
        recipe.setItem(19, new ItemStack(Material.AIR));
        recipe.setItem(20, WardenArmorUtil.giveSculkFragment());
        recipe.setItem(21, new ItemStack(Material.AIR));
        recipe.setItem(28, new ItemStack(Material.AIR));
        recipe.setItem(29, steelIngotUtil.giveSteelIngot());
        recipe.setItem(30, new ItemStack(Material.AIR));
        recipe.setItem(24, SculkWandUtil.giveWand());
        return recipe;
    }
    public static Inventory craftRunnerTotem(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(11, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(12, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(19, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(20, new ItemStack(Material.TOTEM_OF_UNDYING));
        recipe.setItem(21, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(28, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(29, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(30, RunnerArmorUtil.giveSugarBlock());
        recipe.setItem(24, CustomTotemsUtil.giveRTotem());
        return recipe;
    }
    public static Inventory craftGolemTotem(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.AIR));
        recipe.setItem(11, steelIngotUtil.giveSteelIngot());
        recipe.setItem(12, new ItemStack(Material.AIR));
        recipe.setItem(19, steelIngotUtil.giveSteelBlock());
        recipe.setItem(20, new ItemStack(Material.TOTEM_OF_UNDYING));
        recipe.setItem(21, steelIngotUtil.giveSteelBlock());
        recipe.setItem(28, new ItemStack(Material.AIR));
        recipe.setItem(29, steelIngotUtil.giveSteelIngot());
        recipe.setItem(30, new ItemStack(Material.AIR));
        recipe.setItem(24, CustomTotemsUtil.giveGTotem());
        return recipe;
    }
    public static Inventory craftVitalityTotem(Player p){
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(11, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(12, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(19, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(20, new ItemStack(Material.TOTEM_OF_UNDYING));
        recipe.setItem(21, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(28, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(29, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(30, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(24, CustomTotemsUtil.giveVTotem());
        return recipe;
    }
    public static Inventory craftCarlos(Player p){
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.BONE));
        recipe.setItem(11, new ItemStack(Material.BONE));
        recipe.setItem(12, new ItemStack(Material.BONE));
        recipe.setItem(19, new ItemStack(Material.BONE));
        recipe.setItem(20, CarlosUtil.giveSoul());
        recipe.setItem(21, new ItemStack(Material.BONE));
        recipe.setItem(28, new ItemStack(Material.BONE));
        recipe.setItem(29, new ItemStack(Material.BONE));
        recipe.setItem(30, new ItemStack(Material.BONE));
        recipe.setItem(24, CarlosUtil.giveCarlos());
        return recipe;
    }
    public static Inventory craftCarlosSoul(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.AIR));
        recipe.setItem(11, new ItemStack(Material.REDSTONE));
        recipe.setItem(12, new ItemStack(Material.AIR));
        recipe.setItem(19, new ItemStack(Material.REDSTONE));
        recipe.setItem(20, new ItemStack(Material.LILY_OF_THE_VALLEY));
        recipe.setItem(21, new ItemStack(Material.REDSTONE));
        recipe.setItem(28, new ItemStack(Material.AIR));
        recipe.setItem(29, new ItemStack(Material.REDSTONE));
        recipe.setItem(30, new ItemStack(Material.AIR));
        recipe.setItem(24, CarlosUtil.giveSoul());
        return recipe;
    }
    public static Inventory craftLavaHelmet(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.GHAST_TEAR));
        recipe.setItem(11, new ItemStack(Material.GHAST_TEAR));
        recipe.setItem(12, new ItemStack(Material.GHAST_TEAR));
        recipe.setItem(19, new ItemStack(Material.GHAST_TEAR));
        recipe.setItem(20, new ItemStack(Material.AIR));
        recipe.setItem(21, new ItemStack(Material.GHAST_TEAR));
        recipe.setItem(28, new ItemStack(Material.AIR));
        recipe.setItem(29, new ItemStack(Material.AIR));
        recipe.setItem(30, new ItemStack(Material.AIR));
        recipe.setItem(24, LavaExplorerSetUtil.giveHelmet());
        return recipe;
    }
    public static Inventory craftLavaChest(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.BLAZE_ROD));
        recipe.setItem(11, new ItemStack(Material.AIR));
        recipe.setItem(12, new ItemStack(Material.BLAZE_ROD));
        recipe.setItem(19, new ItemStack(Material.BLAZE_ROD));
        recipe.setItem(20, new ItemStack(Material.BLAZE_ROD));
        recipe.setItem(21, new ItemStack(Material.BLAZE_ROD));
        recipe.setItem(28, new ItemStack(Material.BLAZE_ROD));
        recipe.setItem(29, new ItemStack(Material.BLAZE_ROD));
        recipe.setItem(30, new ItemStack(Material.BLAZE_ROD));
        recipe.setItem(24, LavaExplorerSetUtil.giveChest());
        return recipe;
    }
    public static Inventory craftLavaLegs(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, LavaExplorerSetUtil.givePiglinBuckle());
        recipe.setItem(11, LavaExplorerSetUtil.givePiglinBuckle());
        recipe.setItem(12, LavaExplorerSetUtil.givePiglinBuckle());
        recipe.setItem(19, LavaExplorerSetUtil.givePiglinBuckle());
        recipe.setItem(20, new ItemStack(Material.AIR));
        recipe.setItem(21, LavaExplorerSetUtil.givePiglinBuckle());
        recipe.setItem(28, LavaExplorerSetUtil.givePiglinBuckle());
        recipe.setItem(29, new ItemStack(Material.AIR));
        recipe.setItem(30, LavaExplorerSetUtil.givePiglinBuckle());
        recipe.setItem(24, LavaExplorerSetUtil.giveLegs());
        return recipe;
    }
    public static Inventory craftLavaBoots(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.AIR));
        recipe.setItem(11, new ItemStack(Material.AIR));
        recipe.setItem(12, new ItemStack(Material.AIR));
        recipe.setItem(19, LavaExplorerSetUtil.giveFilament());
        recipe.setItem(20, new ItemStack(Material.AIR));
        recipe.setItem(21, LavaExplorerSetUtil.giveFilament());
        recipe.setItem(28, LavaExplorerSetUtil.giveFilament());
        recipe.setItem(29, new ItemStack(Material.AIR));
        recipe.setItem(30, LavaExplorerSetUtil.giveFilament());
        recipe.setItem(24, LavaExplorerSetUtil.giveBoots());
        return recipe;
    }
    public static Inventory craftEmeraldPickaxe(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, EmeraldArmorUtil.giveRefinedEmeraldBLock());
        recipe.setItem(11, EmeraldArmorUtil.giveRefinedEmeraldBLock());
        recipe.setItem(12, EmeraldArmorUtil.giveRefinedEmeraldBLock());
        recipe.setItem(19, new ItemStack(Material.AIR));
        recipe.setItem(20, new ItemStack(Material.STICK));
        recipe.setItem(21, new ItemStack(Material.AIR));
        recipe.setItem(28, new ItemStack(Material.AIR));
        recipe.setItem(29, new ItemStack(Material.STICK));
        recipe.setItem(30, new ItemStack(Material.AIR));
        recipe.setItem(24, EmeraldPickaxeUtil.givePickaxe());
        return recipe;
    }
    public static Inventory craftRabbitBoots(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.RABBIT_FOOT));
        recipe.setItem(11, new ItemStack(Material.RABBIT_FOOT));
        recipe.setItem(12, new ItemStack(Material.RABBIT_FOOT));
        recipe.setItem(19, new ItemStack(Material.RABBIT_FOOT));
        recipe.setItem(20, new ItemStack(Material.IRON_BOOTS));
        recipe.setItem(21, new ItemStack(Material.RABBIT_FOOT));
        recipe.setItem(28, new ItemStack(Material.RABBIT_FOOT));
        recipe.setItem(29, new ItemStack(Material.RABBIT_FOOT));
        recipe.setItem(30, new ItemStack(Material.RABBIT_FOOT));
        recipe.setItem(24, RabbitBootsUtil.giveRabbitBoots());
        return recipe;
    }
    public static Inventory craftGoldElytra(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.GOLD_BLOCK));
        recipe.setItem(11, new ItemStack(Material.ELYTRA));
        recipe.setItem(12, new ItemStack(Material.GOLD_BLOCK));
        recipe.setItem(19, new ItemStack(Material.PHANTOM_MEMBRANE));
        recipe.setItem(20, DragonWingsUtil.giveCore());
        recipe.setItem(21, new ItemStack(Material.PHANTOM_MEMBRANE));
        recipe.setItem(28, new ItemStack(Material.PHANTOM_MEMBRANE));
        recipe.setItem(29, new ItemStack(Material.GOLDEN_CHESTPLATE));
        recipe.setItem(30, new ItemStack(Material.PHANTOM_MEMBRANE));
        recipe.setItem(24, DragonWingsUtil.giveGoldElytra());
        return recipe;
    }
    public static Inventory craftIronElytra(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.IRON_BLOCK));
        recipe.setItem(11, new ItemStack(Material.ELYTRA));
        recipe.setItem(12, new ItemStack(Material.IRON_BLOCK));
        recipe.setItem(19, new ItemStack(Material.PHANTOM_MEMBRANE));
        recipe.setItem(20, DragonWingsUtil.giveCore());
        recipe.setItem(21, new ItemStack(Material.PHANTOM_MEMBRANE));
        recipe.setItem(28, new ItemStack(Material.PHANTOM_MEMBRANE));
        recipe.setItem(29, new ItemStack(Material.IRON_CHESTPLATE));
        recipe.setItem(30, new ItemStack(Material.PHANTOM_MEMBRANE));
        recipe.setItem(24, DragonWingsUtil.giveIronElytra());
        return recipe;
    }
    public static Inventory craftDiamondElytra(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.DIAMOND_BLOCK));
        recipe.setItem(11, new ItemStack(Material.ELYTRA));
        recipe.setItem(12, new ItemStack(Material.DIAMOND_BLOCK));
        recipe.setItem(19, new ItemStack(Material.PHANTOM_MEMBRANE));
        recipe.setItem(20, DragonWingsUtil.giveCore());
        recipe.setItem(21, new ItemStack(Material.PHANTOM_MEMBRANE));
        recipe.setItem(28, new ItemStack(Material.PHANTOM_MEMBRANE));
        recipe.setItem(29, new ItemStack(Material.DIAMOND_CHESTPLATE));
        recipe.setItem(30, new ItemStack(Material.PHANTOM_MEMBRANE));
        recipe.setItem(24, DragonWingsUtil.giveDiamondElytra());
        return recipe;
    }
    public static Inventory craftNetherElytra(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.NETHERITE_INGOT));
        recipe.setItem(11, new ItemStack(Material.ELYTRA));
        recipe.setItem(12, new ItemStack(Material.NETHERITE_INGOT));
        recipe.setItem(19, new ItemStack(Material.PHANTOM_MEMBRANE));
        recipe.setItem(20, DragonWingsUtil.giveCore());
        recipe.setItem(21, new ItemStack(Material.PHANTOM_MEMBRANE));
        recipe.setItem(28, new ItemStack(Material.PHANTOM_MEMBRANE));
        recipe.setItem(29, new ItemStack(Material.NETHERITE_CHESTPLATE));
        recipe.setItem(30, new ItemStack(Material.PHANTOM_MEMBRANE));
        recipe.setItem(24, DragonWingsUtil.giveNetherElytra());
        return recipe;
    }
    public static Inventory craftGhostAnnihilator(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, GhostAnihilatorUtil.giveEctoplasm());
        recipe.setItem(11, GhostAnihilatorUtil.giveEctoplasm());
        recipe.setItem(12, GhostAnihilatorUtil.giveEctoplasm());
        recipe.setItem(19, GhostAnihilatorUtil.giveEctoplasm());
        recipe.setItem(20, new ItemStack(Material.SHIELD));
        recipe.setItem(21, GhostAnihilatorUtil.giveEctoplasm());
        recipe.setItem(28, GhostAnihilatorUtil.giveEctoplasm());
        recipe.setItem(29, GhostAnihilatorUtil.giveEctoplasm());
        recipe.setItem(30, GhostAnihilatorUtil.giveEctoplasm());
        recipe.setItem(24, GhostAnihilatorUtil.giveAnnihilator());
        return recipe;
    }
    public static Inventory craftNightGoggles(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.BLUE_STAINED_GLASS_PANE));
        recipe.setItem(11, InfiniCarrotsUtil.giveInfiniGCarrot());
        recipe.setItem(12, new ItemStack(Material.BLUE_STAINED_GLASS_PANE));
        recipe.setItem(19, new ItemStack(Material.BLUE_STAINED_GLASS_PANE));
        recipe.setItem(20, new ItemStack(Material.ENDER_EYE));
        recipe.setItem(21, new ItemStack(Material.BLUE_STAINED_GLASS_PANE));
        recipe.setItem(28, new ItemStack(Material.BLUE_STAINED_GLASS_PANE));
        recipe.setItem(29, new ItemStack(Material.BLUE_STAINED_GLASS_PANE));
        recipe.setItem(30, new ItemStack(Material.BLUE_STAINED_GLASS_PANE));
        recipe.setItem(24, NightGooglesUtil.giveGoggles());
        return recipe;
    }
    public static Inventory craftBloodBlade(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }

        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, VampireSword.giveVampireFang());
        recipe.setItem(11, VampireSword.giveVampireFang());
        recipe.setItem(12, VampireSword.giveVampireFang());
        recipe.setItem(19, VampireSword.giveVampireFang());
        recipe.setItem(20, steelIngotUtil.giveSteelIngot());
        recipe.setItem(21, VampireSword.giveVampireFang());
        recipe.setItem(28, VampireSword.giveVampireFang());
        recipe.setItem(29, VampireSword.giveVampireFang());
        recipe.setItem(30, VampireSword.giveVampireFang());
        recipe.setItem(24, VampireSword.giveBloodBlade());
        return recipe;
    }
    public static Inventory crafVampireBlade(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }

        ItemStack smithing = new ItemStack(Material.SMITHING_TABLE);
        ItemMeta meta = smithing.getItemMeta();
        meta.setDisplayName(ChatColor.GREEN + "This is am smithing table recipe!");
        smithing.setItemMeta(meta);

        recipe.setItem(4,smithing);
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, bg);
        recipe.setItem(11, bg);
        recipe.setItem(12, bg);
        recipe.setItem(19, VampireSword.giveBloodBlade());
        recipe.setItem(20, new ItemStack(Material.IRON_SWORD));
        recipe.setItem(21, RefinedGoldUtil.giveRefinedGold());
        recipe.setItem(28, bg);
        recipe.setItem(29, bg);
        recipe.setItem(30, bg);
        recipe.setItem(24, VampireSword.giveVampireSword());
        return recipe;
    }
    public static Inventory craftGrimHelmet(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }

        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, GrimReaperArmorUtil.giveUndeadChains());
        recipe.setItem(11, RefinedCopperUtil.giveIngot());
        recipe.setItem(12, GrimReaperArmorUtil.giveUndeadChains());
        recipe.setItem(19, GrimReaperArmorUtil.giveUndeadChains());
        recipe.setItem(20, new ItemStack(Material.AIR));
        recipe.setItem(21, GrimReaperArmorUtil.giveUndeadChains());
        recipe.setItem(28, new ItemStack(Material.AIR));
        recipe.setItem(29, new ItemStack(Material.AIR));
        recipe.setItem(30, new ItemStack(Material.AIR));
        recipe.setItem(24, GrimReaperArmorUtil.giveGrimHelmet());
        return recipe;
    }
    public static Inventory craftGrimChestplate(Player p){
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }

        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, RefinedCopperUtil.giveIngot());
        recipe.setItem(11, new ItemStack(Material.AIR));
        recipe.setItem(12, RefinedCopperUtil.giveIngot());
        recipe.setItem(19, GrimReaperArmorUtil.giveUndeadChains());
        recipe.setItem(20, RefinedCopperUtil.giveIngot());
        recipe.setItem(21, GrimReaperArmorUtil.giveUndeadChains());
        recipe.setItem(28, GrimReaperArmorUtil.giveUndeadChains());
        recipe.setItem(29, GrimReaperArmorUtil.giveUndeadChains());
        recipe.setItem(30, GrimReaperArmorUtil.giveUndeadChains());
        recipe.setItem(24, GrimReaperArmorUtil.giveGrimChestplate());
        return recipe;
    }
    public static Inventory craftGrimLeggings(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }

        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, RefinedCopperUtil.giveIngot());
        recipe.setItem(11, GrimReaperArmorUtil.giveUndeadChains());
        recipe.setItem(12, RefinedCopperUtil.giveIngot());
        recipe.setItem(19, GrimReaperArmorUtil.giveUndeadChains());
        recipe.setItem(20, new ItemStack(Material.AIR));
        recipe.setItem(21, GrimReaperArmorUtil.giveUndeadChains());
        recipe.setItem(28, GrimReaperArmorUtil.giveUndeadChains());
        recipe.setItem(29, new ItemStack(Material.AIR));
        recipe.setItem(30, GrimReaperArmorUtil.giveUndeadChains());
        recipe.setItem(24, GrimReaperArmorUtil.giveGrimLeggings());
        return recipe;
    }
    public static Inventory craftGrimBoots(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }

        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, new ItemStack(Material.AIR));
        recipe.setItem(11, new ItemStack(Material.AIR));
        recipe.setItem(12, new ItemStack(Material.AIR));
        recipe.setItem(19, GrimReaperArmorUtil.giveUndeadChains());
        recipe.setItem(20, new ItemStack(Material.AIR));
        recipe.setItem(21, GrimReaperArmorUtil.giveUndeadChains());
        recipe.setItem(28, RefinedCopperUtil.giveIngot());
        recipe.setItem(29, new ItemStack(Material.AIR));
        recipe.setItem(30, RefinedCopperUtil.giveIngot());
        recipe.setItem(24, GrimReaperArmorUtil.giveGrimBoots());
        return recipe;
    }
    public static Inventory craftRefinedCopper(Player p) {
        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }
        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(19, steelIngotUtil.giveSteelIngot());
        recipe.setItem(20, new ItemStack(Material.COPPER_BLOCK));
        recipe.setItem(21, steelIngotUtil.giveSteelIngot());
        recipe.setItem(24, RefinedCopperUtil.giveIngot());
        return recipe;
    }
    public static Inventory craftRefinedCopperBlock(Player p) {
        Inventory recipe = Bukkit.createInventory(p, 45, "Recipes");

        bgName.setDisplayName(" ");
        bg.setItemMeta(bgName);

        for (int i = 0; i <= 8; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 13; i <= 17; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 36; i <= 44; i++) {
            recipe.setItem(i, bg);
        }
        for (int i = 31; i <= 35; i++) {
            recipe.setItem(i, bg);
        }

        recipe.setItem(9, bg);
        recipe.setItem(18, bg);
        recipe.setItem(22, bg);
        recipe.setItem(23, bg);
        recipe.setItem(25, bg);
        recipe.setItem(26, bg);
        recipe.setItem(27, bg);

        recipe.setItem(10, RefinedCopperUtil.giveIngot());
        recipe.setItem(11, RefinedCopperUtil.giveIngot());
        recipe.setItem(12, RefinedCopperUtil.giveIngot());
        recipe.setItem(19, RefinedCopperUtil.giveIngot());
        recipe.setItem(20, RefinedCopperUtil.giveIngot());
        recipe.setItem(21, RefinedCopperUtil.giveIngot());
        recipe.setItem(28, RefinedCopperUtil.giveIngot());
        recipe.setItem(29, RefinedCopperUtil.giveIngot());
        recipe.setItem(30, RefinedCopperUtil.giveIngot());
        recipe.setItem(24, RefinedCopperUtil.giveBlock());
        return recipe;
    }
}
