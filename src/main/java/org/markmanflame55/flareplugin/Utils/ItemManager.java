package org.markmanflame55.flareplugin.Utils;

import org.bukkit.*;
import org.bukkit.inventory.*;
import org.markmanflame55.flareplugin.EventListeners.NightGogglesEvent;

public class ItemManager {

    public static ItemStack steelIngot = steelIngotUtil.giveSteelIngot();
    public static ItemStack steelBlock = steelIngotUtil.giveSteelBlock();
    public static ItemStack ironDrill = IronDrillUtil.giveIronDrill();
    public static ItemStack diamondDrill = DiamondDrillUtil.giveDiamondDrill();
    public static ItemStack refinedGold = RefinedGoldUtil.giveRefinedGold();
    public static ItemStack infinityStone = InfinityStoneUtil.giveInfinityStone();
    public static ItemStack infiniCarrot = InfiniCarrotsUtil.giveInfiniCarrot();
    public static ItemStack refinedGoldBlock = RefinedGoldUtil.giveRefinedGoldBlock();
    public static ItemStack sculkFrag = WardenArmorUtil.giveSculkFragment();
    public static ItemStack refinedEmerald = EmeraldArmorUtil.giveRefinedEmerald();
    public static ItemStack refinedEmeraldBLock = EmeraldArmorUtil.giveRefinedEmeraldBLock();
    public static ItemStack sugarBlock = RunnerArmorUtil.giveSugarBlock();

    public static void init() {
        createHealerWand();
        createSteelIngot();
        createSteelBlock();
        createIronDrill();
        createDiamondDrill();
        createNetherDrill();
        createInfinityStone();
        createRefinedGold();
        createInfiniCarrot();
        createInfiniGCarrot();
        createRefinedGoldBlock();
        createGodApple();
        createSculkFrag();
        createSculkArmor();
        createEmeraldArmor();
        createGolemArmor();
        createVitalityArmor();
        createRunnerArmor();
        createSculkWand();
        createCustomTotems();
        createCarlos();
        createLavaExplorerArmor();
        createEmeraldPickaxe();
        createRabbitBoots();
        createGoldElytra();
        createIronElytra();
        createDiamondElytra();
        createNetherElytra();
        createGhostAnnihilator();
        createNightGoggles();
    }
    private static void createHealerWand() {
        ItemStack healerWand = HealerWandUtil.giveHealerWand();

        ShapedRecipe craftHW = new ShapedRecipe(NamespacedKey.minecraft("healer_wand"), healerWand);
        craftHW.shape("OBO"," B ","GIG");
        craftHW.setIngredient('O', Material.OXEYE_DAISY);
        craftHW.setIngredient('B', new RecipeChoice.ExactChoice(RefinedGoldUtil.giveRefinedGold()));
        craftHW.setIngredient('G', Material.GOLDEN_APPLE);
        craftHW.setIngredient('I', Material.GHAST_TEAR);
        Bukkit.getServer().addRecipe(craftHW);
    }

    private static void createSteelIngot() {

        ShapedRecipe craftSIng = new ShapedRecipe(NamespacedKey.minecraft("steel_ingot"), steelIngot);

        craftSIng.shape("fff","nbn","fff");
        craftSIng.setIngredient('f',Material.FLINT);
        craftSIng.setIngredient('n',Material.IRON_NUGGET);
        craftSIng.setIngredient('b',Material.IRON_BLOCK);

        Bukkit.getServer().addRecipe(craftSIng);

    }

    private static void createSteelBlock() {

        ShapedRecipe craftSBlock = new ShapedRecipe(NamespacedKey.minecraft("steel_block"), steelBlock);

        craftSBlock.shape("SSS","SSS","SSS");
        craftSBlock.setIngredient('S',new RecipeChoice.ExactChoice(steelIngot));

        Bukkit.getServer().addRecipe(craftSBlock);
    }
    private static void createIronDrill(){

        ShapedRecipe craftIDr = new ShapedRecipe(NamespacedKey.minecraft("iron_drill"), ironDrill);

        craftIDr.shape("IFI","FDF"," S ");
        craftIDr.setIngredient('I',Material.IRON_BLOCK);
        craftIDr.setIngredient('F',Material.FLINT);
        craftIDr.setIngredient('D',Material.DIAMOND_PICKAXE);
        craftIDr.setIngredient('S',new RecipeChoice.ExactChoice(steelIngot));

        Bukkit.getServer().addRecipe(craftIDr);
    }
    private static void createDiamondDrill(){

        ShapedRecipe craftDiaDrill = new ShapedRecipe(NamespacedKey.minecraft("diamond_drill"), diamondDrill);

        craftDiaDrill.shape("DSD","SPS","DBD");
        craftDiaDrill.setIngredient('D',Material.DIAMOND_BLOCK);
        craftDiaDrill.setIngredient('S', new RecipeChoice.ExactChoice(steelIngot));
        craftDiaDrill.setIngredient('P', new RecipeChoice.ExactChoice(ironDrill));
        craftDiaDrill.setIngredient('B',Material.BLAZE_ROD);

        Bukkit.getServer().addRecipe(craftDiaDrill);
    }
    private static void createNetherDrill(){
        ItemStack netherDrill = NetheriteDrillUtil.giveNetheriteDrill();

        ShapedRecipe craftNetherDrill = new ShapedRecipe(NamespacedKey.minecraft("netherite_drill"), netherDrill);

        craftNetherDrill.shape("NSN","SPS","SES");
        craftNetherDrill.setIngredient('N',Material.NETHERITE_BLOCK);
        craftNetherDrill.setIngredient('S',new RecipeChoice.ExactChoice(steelBlock));
        craftNetherDrill.setIngredient('P', new RecipeChoice.ExactChoice(diamondDrill));
        craftNetherDrill.setIngredient('E',Material.END_ROD);

        Bukkit.getServer().addRecipe(craftNetherDrill);
    }
    private static void createInfinityStone() {
        ShapedRecipe craftInfStone = new ShapedRecipe(NamespacedKey.minecraft("infinity_stone"), infinityStone);

        craftInfStone.shape("XNX","XRX"," C ");
        craftInfStone.setIngredient('X',Material.EXPERIENCE_BOTTLE);
        craftInfStone.setIngredient('N',Material.NETHER_STAR);
        craftInfStone.setIngredient('R',Material.REDSTONE_BLOCK);
        craftInfStone.setIngredient('C',Material.END_CRYSTAL);

        Bukkit.getServer().addRecipe(craftInfStone);
    }
    private static void createRefinedGold() {
        ShapedRecipe craftRefinedGold = new ShapedRecipe(NamespacedKey.minecraft("refined_gold"), refinedGold);

        craftRefinedGold.shape("   ","QGQ","   ");
        craftRefinedGold.setIngredient('Q',new RecipeChoice.ExactChoice(steelIngot));
        craftRefinedGold.setIngredient('G',Material.GOLD_BLOCK);

        Bukkit.getServer().addRecipe(craftRefinedGold);
    }
    private static void createInfiniCarrot () {
        ShapedRecipe craftInfiniCarrot = new ShapedRecipe(NamespacedKey.minecraft("infini_carrot"), infiniCarrot);

        craftInfiniCarrot.shape("CCC","CIC","CCC");
        craftInfiniCarrot.setIngredient('C', Material.CARROT);
        craftInfiniCarrot.setIngredient('I', new RecipeChoice.ExactChoice(infinityStone));

        Bukkit.getServer().addRecipe(craftInfiniCarrot);
    }
    private static void createInfiniGCarrot() {
        ItemStack infiniGCarrot = InfiniCarrotsUtil.giveInfiniGCarrot();

        ShapedRecipe craftInfiniGCarrot = new ShapedRecipe(NamespacedKey.minecraft("infini_golden_carrot"), infiniGCarrot);

        craftInfiniGCarrot.shape("GGG","GCG","GGG");
        craftInfiniGCarrot.setIngredient('C', new RecipeChoice.ExactChoice(infiniCarrot));
        craftInfiniGCarrot.setIngredient('G', new RecipeChoice.ExactChoice(refinedGold));

        Bukkit.getServer().addRecipe(craftInfiniGCarrot);
    }
    private static void createRefinedGoldBlock() {
        ShapedRecipe craftRefinedGoldBlock = new ShapedRecipe(NamespacedKey.minecraft("refined_gold_block"), refinedGoldBlock);

        craftRefinedGoldBlock.shape("GGG","GGG","GGG");
        craftRefinedGoldBlock.setIngredient('G', new RecipeChoice.ExactChoice(refinedGold));

        Bukkit.getServer().addRecipe(craftRefinedGoldBlock);
    }
    private static void createGodApple() {

        ShapedRecipe craftGodApp = new ShapedRecipe(NamespacedKey.minecraft("craft_egapple"), new ItemStack(Material.ENCHANTED_GOLDEN_APPLE));

        craftGodApp.shape("GGG","GAG","GGG");
        craftGodApp.setIngredient('G', new RecipeChoice.ExactChoice(refinedGoldBlock));
        craftGodApp.setIngredient('A', Material.GOLDEN_APPLE);

        Bukkit.getServer().addRecipe(craftGodApp);
    }
    private static void createSculkFrag() {
        ShapedRecipe craftSculkFrag = new ShapedRecipe(NamespacedKey.minecraft("sculk_fragment"), sculkFrag);

        craftSculkFrag.shape("EEE","EEE","EEE");
        craftSculkFrag.setIngredient('E', Material.ECHO_SHARD);

        Bukkit.getServer().addRecipe(craftSculkFrag);
    }
    private static void createSculkArmor() {
        ItemStack sculkHelm = WardenArmorUtil.giveWardenHelmet();

        ShapedRecipe craftSculkHelmet = new ShapedRecipe(NamespacedKey.minecraft("warden_helmet"), sculkHelm);
        craftSculkHelmet.shape("EEE","EHE","   ");
        craftSculkHelmet.setIngredient('E', Material.ECHO_SHARD);
        craftSculkHelmet.setIngredient('H', Material.DIAMOND_HELMET);

        Bukkit.getServer().addRecipe(craftSculkHelmet);

        ItemStack sculkChest = WardenArmorUtil.giveWardenChestplate();

        ShapedRecipe craftSculkChest = new ShapedRecipe(NamespacedKey.minecraft("sculk_chestplate"), sculkChest);
        craftSculkChest.shape("ECE","EEE","EEE");
        craftSculkChest.setIngredient('E',Material.ECHO_SHARD);
        craftSculkChest.setIngredient('C',Material.DIAMOND_CHESTPLATE);

        Bukkit.getServer().addRecipe(craftSculkChest);

        ItemStack sculkLegs = WardenArmorUtil.giveWardenLeggins();

        ShapedRecipe craftSculkLegs = new ShapedRecipe(NamespacedKey.minecraft("sculk_leggins"), sculkLegs);
        craftSculkLegs.shape("EEE","ELE","E E");
        craftSculkLegs.setIngredient('E',Material.ECHO_SHARD);
        craftSculkLegs.setIngredient('L',Material.DIAMOND_LEGGINGS);

        Bukkit.getServer().addRecipe(craftSculkLegs);

        ItemStack sculkBoots = WardenArmorUtil.giveWardenBoots();

        ShapedRecipe craftSculkBoots = new ShapedRecipe(NamespacedKey.minecraft("sculk_boots"), sculkBoots);
        craftSculkBoots.shape("   ","E E","EBE");
        craftSculkBoots.setIngredient('E', Material.ECHO_SHARD);
        craftSculkBoots.setIngredient('B', Material.DIAMOND_BOOTS);

        Bukkit.getServer().addRecipe(craftSculkBoots);
    }
    private static void createEmeraldArmor() {

      ShapedRecipe craftRefinedEmerald = new ShapedRecipe(NamespacedKey.minecraft("refined_emerald"), refinedEmerald);
      craftRefinedEmerald.shape("   ","SBS","   ");
      craftRefinedEmerald.setIngredient('B', Material.EMERALD_BLOCK);
      craftRefinedEmerald.setIngredient('S', new RecipeChoice.ExactChoice(steelIngot));

      ShapedRecipe craftRefinedEmeraldBlock = new ShapedRecipe(NamespacedKey.minecraft("refined_emeralb_block"), EmeraldArmorUtil.giveRefinedEmeraldBLock());
      craftRefinedEmeraldBlock.shape("EEE","EEE","EEE");
      craftRefinedEmeraldBlock.setIngredient('E', new RecipeChoice.ExactChoice(refinedEmerald));

      ShapedRecipe craftEmeraldHelm = new ShapedRecipe(NamespacedKey.minecraft("emerald_helmet"), EmeraldArmorUtil.giveEmeraldHelmet());
      craftEmeraldHelm.shape("EEE","E E","   ");
      craftEmeraldHelm.setIngredient('E', new RecipeChoice.ExactChoice(refinedEmerald));

      ShapedRecipe craftEmeraldChest = new ShapedRecipe(NamespacedKey.minecraft("emerald_chesplate"), EmeraldArmorUtil.giveEmeraldChest());
      craftEmeraldChest.shape("E E","EEE","EEE");
      craftEmeraldChest.setIngredient('E',new RecipeChoice.ExactChoice(refinedEmerald));

      ShapedRecipe craftEmeraldLegs = new ShapedRecipe(NamespacedKey.minecraft("emerald_leggins"), EmeraldArmorUtil.giveEmeraldLegs());
      craftEmeraldLegs.shape("EEE","E E","E E");
      craftEmeraldLegs.setIngredient('E', new RecipeChoice.ExactChoice(refinedEmerald));

      ShapedRecipe craftEmeraldBoots = new ShapedRecipe(NamespacedKey.minecraft("emerald_boots"), EmeraldArmorUtil.giveEmeraldBoots());
      craftEmeraldBoots.shape("   ","E E","E E");
      craftEmeraldBoots.setIngredient('E', new RecipeChoice.ExactChoice(refinedEmerald));

      Bukkit.getServer().addRecipe(craftRefinedEmerald);
      Bukkit.getServer().addRecipe(craftRefinedEmeraldBlock);
      Bukkit.getServer().addRecipe(craftEmeraldHelm);
      Bukkit.getServer().addRecipe(craftEmeraldChest);
      Bukkit.getServer().addRecipe(craftEmeraldLegs);
      Bukkit.getServer().addRecipe(craftEmeraldBoots);
    }
    private static void createGolemArmor() {

        ShapedRecipe craftGolemHelmet = new ShapedRecipe(NamespacedKey.minecraft("golem_helmet"), GolemArmorUtil.giveHelmet());
        craftGolemHelmet.shape("III","S S","   ");
        craftGolemHelmet.setIngredient('I', Material.IRON_BLOCK);
        craftGolemHelmet.setIngredient('S', new RecipeChoice.ExactChoice(steelBlock));

        ShapedRecipe craftGolemChestplate = new ShapedRecipe(NamespacedKey.minecraft("golem_chestplate"), GolemArmorUtil.giveChest());
        craftGolemChestplate.shape("I I","SIS","III");
        craftGolemChestplate.setIngredient('I', Material.IRON_BLOCK);
        craftGolemChestplate.setIngredient('S', new RecipeChoice.ExactChoice(steelBlock));

        ShapedRecipe craftGolemLeggins = new ShapedRecipe(NamespacedKey.minecraft("golem_leggings"), GolemArmorUtil.giveLegs());
        craftGolemLeggins.shape("III","S S","I I");
        craftGolemLeggins.setIngredient('I', Material.IRON_BLOCK);
        craftGolemLeggins.setIngredient('S', new RecipeChoice.ExactChoice(steelBlock));

        ShapedRecipe craftGolemBoots = new ShapedRecipe(NamespacedKey.minecraft("golem_boots"), GolemArmorUtil.giveBoots());
        craftGolemBoots.shape("   ","S S","I I");
        craftGolemBoots.setIngredient('I',Material.IRON_BLOCK);
        craftGolemBoots.setIngredient('S', new RecipeChoice.ExactChoice(steelBlock));

        Bukkit.getServer().addRecipe(craftGolemHelmet);
        Bukkit.getServer().addRecipe(craftGolemChestplate);
        Bukkit.getServer().addRecipe(craftGolemLeggins);
        Bukkit.getServer().addRecipe(craftGolemBoots);
    }
    private static void createVitalityArmor() {

        ShapedRecipe craftVitalityHelmet = new ShapedRecipe(NamespacedKey.minecraft("vitality_helmet"), VitalityArmorUtil.giveHelmet());
        craftVitalityHelmet.shape("RGR","T T","   ");
        craftVitalityHelmet.setIngredient('R', new RecipeChoice.ExactChoice(refinedGold));
        craftVitalityHelmet.setIngredient('G', Material.GLOWSTONE);
        craftVitalityHelmet.setIngredient('T', Material.GHAST_TEAR);

        ShapedRecipe craftVitalityChest = new ShapedRecipe(NamespacedKey.minecraft("vitality_chestplate"), VitalityArmorUtil.giveChest());
        craftVitalityChest.shape("T T","RBR","GGG");
        craftVitalityChest.setIngredient('T',Material.GHAST_TEAR);
        craftVitalityChest.setIngredient('R', new RecipeChoice.ExactChoice(refinedGold));
        craftVitalityChest.setIngredient('B', new RecipeChoice.ExactChoice(refinedGoldBlock));
        craftVitalityChest.setIngredient('G', Material.GLOWSTONE);

        ShapedRecipe craftVitalityLegs = new ShapedRecipe(NamespacedKey.minecraft("vitality_leggings"), VitalityArmorUtil.giveLegs());
        craftVitalityLegs.shape("GGG","R R","T T");
        craftVitalityLegs.setIngredient('G', Material.GLOWSTONE);
        craftVitalityLegs.setIngredient('R', new RecipeChoice.ExactChoice(refinedGold));
        craftVitalityLegs.setIngredient('T', Material.GHAST_TEAR);

        ShapedRecipe craftVitalityBoots = new ShapedRecipe(NamespacedKey.minecraft("vitality_boots"), VitalityArmorUtil.giveBoots());
        craftVitalityBoots.shape("   ","R R","T T");
        craftVitalityBoots.setIngredient('R', new RecipeChoice.ExactChoice(refinedGold));
        craftVitalityBoots.setIngredient('T', Material.GHAST_TEAR);

        Bukkit.getServer().addRecipe(craftVitalityHelmet);
        Bukkit.getServer().addRecipe(craftVitalityChest);
        Bukkit.getServer().addRecipe(craftVitalityLegs);
        Bukkit.getServer().addRecipe(craftVitalityBoots);
    }
    private static void createRunnerArmor() {

        ShapedRecipe craftSugarBlock = new ShapedRecipe(NamespacedKey.minecraft("sugar_block"), sugarBlock);
        craftSugarBlock.shape("SSS","SSS","SSS");
        craftSugarBlock.setIngredient('S', Material.SUGAR);

        ShapedRecipe craftRunnerHelmet = new ShapedRecipe(NamespacedKey.minecraft("runner_helmet"), RunnerArmorUtil.giveHelmet());
        craftRunnerHelmet.shape("SSS","SHS","SSS");
        craftRunnerHelmet.setIngredient('S', new RecipeChoice.ExactChoice(sugarBlock));
        craftRunnerHelmet.setIngredient('H', Material.IRON_HELMET);

        ShapedRecipe craftRunnerChest = new ShapedRecipe(NamespacedKey.minecraft("runner_chestplate"), RunnerArmorUtil.giveChest());
        craftRunnerChest.shape("SSS","SCS","SSS");
        craftRunnerChest.setIngredient('S', new RecipeChoice.ExactChoice(sugarBlock));
        craftRunnerChest.setIngredient('C', Material.IRON_CHESTPLATE);

        ShapedRecipe craftRunnerLegs = new ShapedRecipe(NamespacedKey.minecraft("runner_leggings"), RunnerArmorUtil.giveLegs());
        craftRunnerLegs.shape("SSS","SLS","SSS");
        craftRunnerLegs.setIngredient('S', new RecipeChoice.ExactChoice(sugarBlock));
        craftRunnerLegs.setIngredient('L', Material.IRON_LEGGINGS);

        ShapedRecipe craftRunnerBoots = new ShapedRecipe(NamespacedKey.minecraft("runner_boots"), RunnerArmorUtil.giveBoots());
        craftRunnerBoots.shape("SSS","SBS","SSS");
        craftRunnerBoots.setIngredient('S', new RecipeChoice.ExactChoice(sugarBlock));
        craftRunnerBoots.setIngredient('B', Material.IRON_BOOTS);

        Bukkit.getServer().addRecipe(craftSugarBlock);
        Bukkit.getServer().addRecipe(craftRunnerBoots);
        Bukkit.getServer().addRecipe(craftRunnerLegs);
        Bukkit.getServer().addRecipe(craftRunnerChest);
        Bukkit.getServer().addRecipe(craftRunnerHelmet);

    }
    private static void createSculkWand() {

        ShapedRecipe craftSculkWand = new ShapedRecipe(NamespacedKey.minecraft("sculk_wand"), SculkWandUtil.giveWand());
        craftSculkWand.shape(" F "," F "," S ");
        craftSculkWand.setIngredient('F', new RecipeChoice.ExactChoice(sculkFrag));
        craftSculkWand.setIngredient('S', new RecipeChoice.ExactChoice(steelIngot));

        Bukkit.getServer().addRecipe(craftSculkWand);
    }
    private static void createCustomTotems() {

        ShapedRecipe craftVitalityTotem = new ShapedRecipe(NamespacedKey.minecraft("vitality_totem"), CustomTotemsUtil.giveVitalityTotem());
        craftVitalityTotem.shape("GGG","GTG","GGG");
        craftVitalityTotem.setIngredient('G', new RecipeChoice.ExactChoice(refinedGold));
        craftVitalityTotem.setIngredient('T', Material.TOTEM_OF_UNDYING);

        ShapedRecipe craftGolemTotem = new ShapedRecipe(NamespacedKey.minecraft("golem_totem"), CustomTotemsUtil.giveTankTotem());
        craftGolemTotem.shape(" I ","BTB"," I ");
        craftGolemTotem.setIngredient('I', new RecipeChoice.ExactChoice(steelIngot));
        craftGolemTotem.setIngredient('B', new RecipeChoice.ExactChoice(steelBlock));
        craftGolemTotem.setIngredient('T', Material.TOTEM_OF_UNDYING);

        ShapedRecipe craftRunnerTotem = new ShapedRecipe(NamespacedKey.minecraft("runner_totem"), CustomTotemsUtil.giveRunnerTotem());
        craftRunnerTotem.shape("SSS","STS","SSS");
        craftRunnerTotem.setIngredient('S', new RecipeChoice.ExactChoice(sugarBlock));
        craftRunnerTotem.setIngredient('T', Material.TOTEM_OF_UNDYING);

        Bukkit.getServer().addRecipe(craftRunnerTotem);
        Bukkit.getServer().addRecipe(craftGolemTotem);
        Bukkit.getServer().addRecipe(craftVitalityTotem);
    }
    private static void createCarlos(){

        ItemStack carlosSoul = CarlosUtil.giveSoul();

        ShapedRecipe craftCarlosSoul = new ShapedRecipe(NamespacedKey.minecraft("carlos_soul"), carlosSoul);
        craftCarlosSoul.shape(" R ","RLR"," R ");
        craftCarlosSoul.setIngredient('R', Material.REDSTONE);
        craftCarlosSoul.setIngredient('L', Material.LILY_OF_THE_VALLEY);

        ShapedRecipe craftCarlos = new ShapedRecipe(NamespacedKey.minecraft("carlos"), CarlosUtil.giveCarlos());
        craftCarlos.shape("BBB","BSB","BBB");
        craftCarlos.setIngredient('B', Material.BONE);
        craftCarlos.setIngredient('S', new RecipeChoice.ExactChoice(carlosSoul));

        Bukkit.getServer().addRecipe(craftCarlos);
        Bukkit.getServer().addRecipe(craftCarlosSoul);
    }
    private static void createLavaExplorerArmor() {

        ItemStack piglinBuckcle = LavaExplorerSetUtil.givePiglinBuckle();
        ItemStack striderFilament = LavaExplorerSetUtil.giveFilament();

        ShapedRecipe craftLavaHelmet = new ShapedRecipe(NamespacedKey.minecraft("lava_helmet"), LavaExplorerSetUtil.giveHelmet());
        craftLavaHelmet.shape("TTT","T T","   ");
        craftLavaHelmet.setIngredient('T', Material.GHAST_TEAR);

        ShapedRecipe craftLavaChest = new ShapedRecipe(NamespacedKey.minecraft("lava_chestplate"), LavaExplorerSetUtil.giveChest());
        craftLavaChest.shape("R R","RRR","RRR");
        craftLavaChest.setIngredient('R', Material.BLAZE_ROD);

        ShapedRecipe craftLavaLegs = new ShapedRecipe(NamespacedKey.minecraft("lava_leggings"), LavaExplorerSetUtil.giveLegs());
        craftLavaLegs.shape("BBB","B B","B B");
        craftLavaLegs.setIngredient('B', new RecipeChoice.ExactChoice(piglinBuckcle));

        ShapedRecipe craftLavaBoots = new ShapedRecipe(NamespacedKey.minecraft("lava_boots"), LavaExplorerSetUtil.giveBoots());
        craftLavaBoots.shape("   ","F F","F F");
        craftLavaBoots.setIngredient('F', new RecipeChoice.ExactChoice(striderFilament));

        Bukkit.getServer().addRecipe(craftLavaBoots);
        Bukkit.getServer().addRecipe(craftLavaChest);
        Bukkit.getServer().addRecipe(craftLavaLegs);
        Bukkit.getServer().addRecipe(craftLavaHelmet);
    }
    private static void createEmeraldPickaxe() {
        ShapedRecipe craftEmeraldPickaxe = new ShapedRecipe(NamespacedKey.minecraft("emerald_pickaxe"), EmeraldPickaxeUtil.givePickaxe());
        craftEmeraldPickaxe.shape("EEE"," S "," S ");
        craftEmeraldPickaxe.setIngredient('E', new RecipeChoice.ExactChoice(refinedEmeraldBLock));
        craftEmeraldPickaxe.setIngredient('S', Material.STICK);

        Bukkit.getServer().addRecipe(craftEmeraldPickaxe);
    }
    private static void createRabbitBoots() {

        ShapedRecipe craftRabbitBoots = new ShapedRecipe(NamespacedKey.minecraft("rabbit_boots"), RabbitBootsUtil.giveRabbitBoots());
        craftRabbitBoots.shape("FFF","FBF","FFF");
        craftRabbitBoots.setIngredient('F', Material.RABBIT_FOOT);
        craftRabbitBoots.setIngredient('B', Material.IRON_BOOTS);

        Bukkit.getServer().addRecipe(craftRabbitBoots);
    }
    private static void createGoldElytra() {

        ShapedRecipe craftGoldElytra = new ShapedRecipe(NamespacedKey.minecraft("golden_armored_elytra"), DragonWingsUtil.giveGoldElytra());
        craftGoldElytra.shape("GEG","MWM","MCM");
        craftGoldElytra.setIngredient('G', Material.GOLD_BLOCK);
        craftGoldElytra.setIngredient('E', Material.ELYTRA);
        craftGoldElytra.setIngredient('M', Material.PHANTOM_MEMBRANE);
        craftGoldElytra.setIngredient('C', Material.GOLDEN_CHESTPLATE);
        craftGoldElytra.setIngredient('W', new RecipeChoice.ExactChoice(DragonWingsUtil.giveCore()));

        Bukkit.getServer().addRecipe(craftGoldElytra);
    }
    private static void createIronElytra() {

        ShapedRecipe craftIronElytra = new ShapedRecipe(NamespacedKey.minecraft("iron_armored_elytra"), DragonWingsUtil.giveIronElytra());
        craftIronElytra.shape("IEI","MWM","MCM");
        craftIronElytra.setIngredient('I', Material.IRON_BLOCK);
        craftIronElytra.setIngredient('E', Material.ELYTRA);
        craftIronElytra.setIngredient('M', Material.PHANTOM_MEMBRANE);
        craftIronElytra.setIngredient('W', new RecipeChoice.ExactChoice(DragonWingsUtil.giveCore()));
        craftIronElytra.setIngredient('C', Material.IRON_CHESTPLATE);

        Bukkit.getServer().addRecipe(craftIronElytra);
    }
    private static void createDiamondElytra() {

        ShapedRecipe craftDiamondElytra = new ShapedRecipe(NamespacedKey.minecraft("diamond_armored_elytra"), DragonWingsUtil.giveDiamondElytra());
        craftDiamondElytra.shape("DED","MWM","MCM");
        craftDiamondElytra.setIngredient('D', Material.DIAMOND_BLOCK);
        craftDiamondElytra.setIngredient('E', Material.ELYTRA);
        craftDiamondElytra.setIngredient('M', Material.PHANTOM_MEMBRANE);
        craftDiamondElytra.setIngredient('W', new RecipeChoice.ExactChoice(DragonWingsUtil.giveCore()));
        craftDiamondElytra.setIngredient('C', Material.DIAMOND_CHESTPLATE);

        Bukkit.getServer().addRecipe(craftDiamondElytra);
    }
    private static void createNetherElytra() {

        ShapedRecipe craftNetherElytra = new ShapedRecipe(NamespacedKey.minecraft("netherite_armored_elytra"), DragonWingsUtil.giveNetherElytra());
        craftNetherElytra.shape("NEN","MWM","MCM");
        craftNetherElytra.setIngredient('N', Material.NETHERITE_INGOT);
        craftNetherElytra.setIngredient('E', Material.ELYTRA);
        craftNetherElytra.setIngredient('M', Material.PHANTOM_MEMBRANE);
        craftNetherElytra.setIngredient('W', new RecipeChoice.ExactChoice(DragonWingsUtil.giveCore()));
        craftNetherElytra.setIngredient('C', Material.NETHERITE_CHESTPLATE);

        Bukkit.getServer().addRecipe(craftNetherElytra);
    }
    private static void createGhostAnnihilator() {

        ShapedRecipe craftGhostShield = new ShapedRecipe(NamespacedKey.minecraft("ghost_annihilator"), GhostAnihilatorUtil.giveAnnihilator());
        craftGhostShield.shape("EEE","ESE","EEE");
        craftGhostShield.setIngredient('E', new RecipeChoice.ExactChoice(GhostAnihilatorUtil.giveEctoplasm()));
        craftGhostShield.setIngredient('S', Material.SHIELD);

        Bukkit.getServer().addRecipe(craftGhostShield);
    }
    private static void createNightGoggles() {

        ShapedRecipe craftNightGoggles = new ShapedRecipe(NamespacedKey.minecraft("night_goggles"), NightGooglesUtil.giveGoggles());
        craftNightGoggles.shape("PCP","PEP","PPP");
        craftNightGoggles.setIngredient('P', Material.BLUE_STAINED_GLASS_PANE);
        craftNightGoggles.setIngredient('C', new RecipeChoice.ExactChoice(InfiniCarrotsUtil.giveInfiniGCarrot()));
        craftNightGoggles.setIngredient('E', Material.ENDER_EYE);

        Bukkit.getServer().addRecipe(craftNightGoggles);
    }
}