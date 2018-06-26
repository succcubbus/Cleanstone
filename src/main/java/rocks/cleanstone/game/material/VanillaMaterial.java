package rocks.cleanstone.game.material;

import javax.annotation.Nullable;
import java.util.Arrays;

public enum VanillaMaterial implements Material {
    AIR(0, "minecraft:air"),
    STONE(1, "minecraft:stone"),
    GRASS(2, "minecraft:grass"),
    DIRT(3, "minecraft:dirt"),
    COBBLESTONE(4, "minecraft:cobblestone"),
    OAK_WOOD_PLANK(5, "minecraft:planks"),
    OAK_SAPLING(6, "minecraft:sapling"),
    BEDROCK(7, "minecraft:bedrock"),
    FLOWING_WATER(8, "minecraft:flowing_water"),
    STILL_WATER(9, "minecraft:water"),
    FLOWING_LAVA(10, "minecraft:flowing_lava"),
    STILL_LAVA(11, "minecraft:lava"),
    SAND(12, "minecraft:sand"),
    GRAVEL(13, "minecraft:gravel"),
    GOLD_ORE(14, "minecraft:gold_ore"),
    IRON_ORE(15, "minecraft:iron_ore"),
    COAL_ORE(16, "minecraft:coal_ore"),
    OAK_WOOD(17, "minecraft:log"),
    OAK_LEAVES(18, "minecraft:leaves"),
    SPONGE(19, "minecraft:sponge"),
    GLASS(20, "minecraft:glass"),
    LAPIS_LAZULI_ORE(21, "minecraft:lapis_ore"),
    LAPIS_LAZULI_BLOCK(22, "minecraft:lapis_block"),
    DISPENSER(23, "minecraft:dispenser"),
    SANDSTONE(24, "minecraft:sandstone"),
    NOTE_BLOCK(25, "minecraft:noteblock"),
    BED(26, "minecraft:bed"),
    POWERED_RAIL(27, "minecraft:golden_rail"),
    DETECTOR_RAIL(28, "minecraft:detector_rail"),
    STICKY_PISTON(29, "minecraft:sticky_piston"),
    COBWEB(30, "minecraft:web"),
    DEAD_SHRUB(31, "minecraft:tallgrass"),
    DEAD_BUSH(32, "minecraft:deadbush"),
    PISTON(33, "minecraft:piston"),
    PISTON_HEAD(34, "minecraft:piston_head"),
    WHITE_WOOL(35, "minecraft:wool"),
    DANDELION(37, "minecraft:yellow_flower"),
    POPPY(38, "minecraft:red_flower"),
    BROWN_MUSHROOM(39, "minecraft:brown_mushroom"),
    RED_MUSHROOM(40, "minecraft:red_mushroom"),
    GOLD_BLOCK(41, "minecraft:gold_block"),
    IRON_BLOCK(42, "minecraft:iron_block"),
    DOUBLE_STONE_SLAB(43, "minecraft:double_stone_slab"),
    STONE_SLAB(44, "minecraft:stone_slab"),
    BRICKS(45, "minecraft:brick_block"),
    TNT(46, "minecraft:tnt"),
    BOOKSHELF(47, "minecraft:bookshelf"),
    MOSS_STONE(48, "minecraft:mossy_cobblestone"),
    OBSIDIAN(49, "minecraft:obsidian"),
    TORCH(50, "minecraft:torch"),
    FIRE(51, "minecraft:fire"),
    MONSTER_SPAWNER(52, "minecraft:mob_spawner"),
    OAK_WOOD_STAIRS(53, "minecraft:oak_stairs"),
    CHEST(54, "minecraft:chest"),
    REDSTONE_WIRE(55, "minecraft:redstone_wire"),
    DIAMOND_ORE(56, "minecraft:diamond_ore"),
    DIAMOND_BLOCK(57, "minecraft:diamond_block"),
    CRAFTING_TABLE(58, "minecraft:crafting_table"),
    WHEAT_CROPS(59, "minecraft:wheat"),
    FARMLAND(60, "minecraft:farmland"),
    FURNACE(61, "minecraft:furnace"),
    BURNING_FURNACE(62, "minecraft:lit_furnace"),
    STANDING_SIGN_BLOCK(63, "minecraft:standing_sign"),
    OAK_DOOR_BLOCK(64, "minecraft:wooden_door"),
    LADDER(65, "minecraft:ladder"),
    RAIL(66, "minecraft:rail"),
    COBBLESTONE_STAIRS(67, "minecraft:stone_stairs"),
    WALL_MOUNTED_SIGN_BLOCK(68, "minecraft:wall_sign"),
    LEVER(69, "minecraft:lever"),
    STONE_PRESSURE_PLATE(70, "minecraft:stone_pressure_plate"),
    IRON_DOOR_BLOCK(71, "minecraft:iron_door"),
    WOODEN_PRESSURE_PLATE(72, "minecraft:wooden_pressure_plate"),
    REDSTONE_ORE(73, "minecraft:redstone_ore"),
    GLOWING_REDSTONE_ORE(74, "minecraft:lit_redstone_ore"),
    REDSTONE_TORCH_OFF(75, "minecraft:unlit_redstone_torch"),
    REDSTONE_TORCH_ON(76, "minecraft:redstone_torch"),
    STONE_BUTTON(77, "minecraft:stone_button"),
    SNOW(78, "minecraft:snow_layer"),
    ICE(79, "minecraft:ice"),
    SNOW_BLOCK(80, "minecraft:snow"),
    CACTUS(81, "minecraft:cactus"),
    CLAY(82, "minecraft:clay"),
    SUGAR_CANES(83, "minecraft:reeds"),
    JUKEBOX(84, "minecraft:jukebox"),
    OAK_FENCE(85, "minecraft:fence"),
    PUMPKIN(86, "minecraft:pumpkin"),
    NETHERRACK(87, "minecraft:netherrack"),
    SOUL_SAND(88, "minecraft:soul_sand"),
    GLOWSTONE(89, "minecraft:glowstone"),
    NETHER_PORTAL(90, "minecraft:portal"),
    JACK_O_LANTERN(91, "minecraft:lit_pumpkin"),
    CAKE_BLOCK(92, "minecraft:cake"),
    REDSTONE_REPEATER_BLOCK_OFF(93, "minecraft:unpowered_repeater"),
    REDSTONE_REPEATER_BLOCK_ON(94, "minecraft:powered_repeater"),
    WHITE_STAINED_GLASS(95, "minecraft:stained_glass"),
    WOODEN_TRAPDOOR(96, "minecraft:trapdoor"),
    STONE_MONSTER_EGG(97, "minecraft:monster_egg"),
    STONE_BRICKS(98, "minecraft:stonebrick"),
    BROWN_MUSHROOM_BLOCK(99, "minecraft:brown_mushroom_block"),
    RED_MUSHROOM_BLOCK(100, "minecraft:red_mushroom_block"),
    IRON_BARS(101, "minecraft:iron_bars"),
    GLASS_PANE(102, "minecraft:glass_pane"),
    MELON_BLOCK(103, "minecraft:melon_block"),
    PUMPKIN_STEM(104, "minecraft:pumpkin_stem"),
    MELON_STEM(105, "minecraft:melon_stem"),
    VINES(106, "minecraft:vine"),
    OAK_FENCE_GATE(107, "minecraft:fence_gate"),
    BRICK_STAIRS(108, "minecraft:brick_stairs"),
    STONE_BRICK_STAIRS(109, "minecraft:stone_brick_stairs"),
    MYCELIUM(110, "minecraft:mycelium"),
    LILY_PAD(111, "minecraft:waterlily"),
    NETHER_BRICK(112, "minecraft:nether_brick"),
    NETHER_BRICK_FENCE(113, "minecraft:nether_brick_fence"),
    NETHER_BRICK_STAIRS(114, "minecraft:nether_brick_stairs"),
    NETHER_WART(115, "minecraft:nether_wart"),
    ENCHANTMENT_TABLE(116, "minecraft:enchanting_table"),
    BREWING_STAND(117, "minecraft:brewing_stand"),
    CAULDRON(118, "minecraft:cauldron"),
    END_PORTAL(119, "minecraft:end_portal"),
    END_PORTAL_FRAME(120, "minecraft:end_portal_frame"),
    END_STONE(121, "minecraft:end_stone"),
    DRAGON_EGG(122, "minecraft:dragon_egg"),
    REDSTONE_LAMP_INACTIVE(123, "minecraft:redstone_lamp"),
    REDSTONE_LAMP_ACTIVE(124, "minecraft:lit_redstone_lamp"),
    DOUBLE_OAK_WOOD_SLAB(125, "minecraft:double_wooden_slab"),
    OAK_WOOD_SLAB(126, "minecraft:wooden_slab"),
    COCOA(127, "minecraft:cocoa"),
    SANDSTONE_STAIRS(128, "minecraft:sandstone_stairs"),
    EMERALD_ORE(129, "minecraft:emerald_ore"),
    ENDER_CHEST(130, "minecraft:ender_chest"),
    TRIPWIRE_HOOK(131, "minecraft:tripwire_hook"),
    TRIPWIRE(132, "minecraft:tripwire_hook"),
    EMERALD_BLOCK(133, "minecraft:emerald_block"),
    SPRUCE_WOOD_STAIRS(134, "minecraft:spruce_stairs"),
    BIRCH_WOOD_STAIRS(135, "minecraft:birch_stairs"),
    JUNGLE_WOOD_STAIRS(136, "minecraft:jungle_stairs"),
    COMMAND_BLOCK(137, "minecraft:command_block"),
    BEACON(138, "minecraft:beacon"),
    COBBLESTONE_WALL(139, "minecraft:cobblestone_wall"),
    FLOWER_POT(140, "minecraft:flower_pot"),
    CARROTS(141, "minecraft:carrots"),
    POTATOES(142, "minecraft:potatoes"),
    WOODEN_BUTTON(143, "minecraft:wooden_button"),
    MOB_HEAD(144, "minecraft:skull"),
    ANVIL(145, "minecraft:anvil"),
    TRAPPED_CHEST(146, "minecraft:trapped_chest"),
    WEIGHTED_PRESSURE_PLATELIGHT(147, "minecraft:light_weighted_pressure_plate"),
    WEIGHTED_PRESSURE_PLATE_HEAVY(148, "minecraft:heavy_weighted_pressure_plate"),
    REDSTONE_COMPARATOR_INACTIVE(149, "minecraft:unpowered_comparator"),
    REDSTONE_COMPARATOR_ACTIVE(150, "minecraft:powered_comparator"),
    DAYLIGHT_SENSOR(151, "minecraft:daylight_detector"),
    REDSTONE_BLOCK(152, "minecraft:redstone_block"),
    NETHER_QUARTZ_ORE(153, "minecraft:quartz_ore"),
    HOPPER(154, "minecraft:hopper"),
    QUARTZ_BLOCK(155, "minecraft:quartz_block"),
    QUARTZ_STAIRS(156, "minecraft:quartz_stairs"),
    ACTIVATOR_RAIL(157, "minecraft:activator_rail"),
    DROPPER(158, "minecraft:dropper"),
    WHITE_HARDENED_CLAY(159, "minecraft:stained_hardened_clay"),
    WHITE_STAINED_GLASS_PANE(160, "minecraft:stained_glass_pane"),
    ACACIA_LEAVES(161, "minecraft:leaves2"),
    ACACIA_WOOD(162, "minecraft:log2"),
    ACACIA_WOOD_STAIRS(163, "minecraft:acacia_stairs"),
    DARK_OAK_WOOD_STAIRS(164, "minecraft:dark_oak_stairs"),
    SLIME_BLOCK(165, "minecraft:slime"),
    BARRIER(166, "minecraft:barrier"),
    IRON_TRAPDOOR(167, "minecraft:iron_trapdoor"),
    PRISMARINE(168, "minecraft:prismarine"),
    SEA_LANTERN(169, "minecraft:sea_lantern"),
    HAY_BALE(170, "minecraft:hay_block"),
    WHITE_CARPET(171, "minecraft:carpet"),
    HARDENED_CLAY(172, "minecraft:hardened_clay"),
    BLOCK_OF_COAL(173, "minecraft:coal_block"),
    PACKED_ICE(174, "minecraft:packed_ice"),
    SUNFLOWER(175, "minecraft:double_plant"),
    FREE_STANDING_BANNER(176, "minecraft:standing_banner"),
    WALL_MOUNTED_BANNER(177, "minecraft:wall_banner"),
    INVERTED_DAYLIGHT_SENSOR(178, "minecraft:daylight_detector_inverted"),
    RED_SANDSTONE(179, "minecraft:red_sandstone"),
    RED_SANDSTONE_STAIRS(180, "minecraft:red_sandstone_stairs"),
    DOUBLE_RED_SANDSTONE_SLAB(181, "minecraft:double_stone_slab2"),
    RED_SANDSTONE_SLAB(182, "minecraft:stone_slab2"),
    SPRUCE_FENCE_GATE(183, "minecraft:spruce_fence_gate"),
    BIRCH_FENCE_GATE(184, "minecraft:birch_fence_gate"),
    JUNGLE_FENCE_GATE(185, "minecraft:jungle_fence_gate"),
    DARK_OAK_FENCE_GATE(186, "minecraft:dark_oak_fence_gate"),
    ACACIA_FENCE_GATE(187, "minecraft:acacia_fence_gate"),
    SPRUCE_FENCE(188, "minecraft:spruce_fence"),
    BIRCH_FENCE(189, "minecraft:birch_fence"),
    JUNGLE_FENCE(190, "minecraft:jungle_fence"),
    DARK_OAK_FENCE(191, "minecraft:dark_oak_fence"),
    ACACIA_FENCE(192, "minecraft:acacia_fence"),
    SPRUCE_DOOR_BLOCK(193, "minecraft:spruce_door"),
    BIRCH_DOOR_BLOCK(194, "minecraft:birch_door"),
    JUNGLE_DOOR_BLOCK(195, "minecraft:jungle_door"),
    ACACIA_DOOR_BLOCK(196, "minecraft:acacia_door"),
    DARK_OAK_DOOR_BLOCK(197, "minecraft:dark_oak_door"),
    END_ROD(198, "minecraft:end_rod"),
    CHORUS_PLANT(199, "minecraft:chorus_plant"),
    CHORUS_FLOWER(200, "minecraft:chorus_flower"),
    PURPUR_BLOCK(201, "minecraft:purpur_block"),
    PURPUR_PILLAR(202, "minecraft:purpur_pillar"),
    PURPUR_STAIRS(203, "minecraft:purpur_stairs"),
    PURPUR_DOUBLE_SLAB(204, "minecraft:purpur_double_slab"),
    PURPUR_SLAB(205, "minecraft:purpur_slab"),
    END_STONE_BRICKS(206, "minecraft:end_bricks"),
    BEETROOT_BLOCK(207, "minecraft:beetroots"),
    GRASS_PATH(208, "minecraft:grass_path"),
    END_GATEWAY(209, "minecraft:end_gateway"),
    REPEATING_COMMAND_BLOCK(210, "minecraft:repeating_command_block"),
    CHAIN_COMMAND_BLOCK(211, "minecraft:chain_command_block"),
    FROSTED_ICE(212, "minecraft:frosted_ice"),
    MAGMA_BLOCK(213, "minecraft:magma"),
    NETHER_WART_BLOCK(214, "minecraft:nether_wart_block"),
    RED_NETHER_BRICK(215, "minecraft:red_nether_brick"),
    BONE_BLOCK(216, "minecraft:bone_block"),
    STRUCTURE_VOID(217, "minecraft:structure_void"),
    OBSERVER(218, "minecraft:observer"),
    WHITE_SHULKER_BOX(219, "minecraft:white_shulker_box"),
    ORANGE_SHULKER_BOX(220, "minecraft:orange_shulker_box"),
    MAGENTA_SHULKER_BOX(221, "minecraft:magenta_shulker_box"),
    LIGHT_BLUE_SHULKER_BOX(222, "minecraft:light_blue_shulker_box"),
    YELLOW_SHULKER_BOX(223, "minecraft:yellow_shulker_box"),
    LIME_SHULKER_BOX(224, "minecraft:lime_shulker_box"),
    PINK_SHULKER_BOX(225, "minecraft:pink_shulker_box"),
    GRAY_SHULKER_BOX(226, "minecraft:gray_shulker_box"),
    LIGHT_GRAY_SHULKER_BOX(227, "minecraft:silver_shulker_box"),
    CYAN_SHULKER_BOX(228, "minecraft:cyan_shulker_box"),
    PURPLE_SHULKER_BOX(229, "minecraft:purple_shulker_box"),
    BLUE_SHULKER_BOX(230, "minecraft:blue_shulker_box"),
    BROWN_SHULKER_BOX(231, "minecraft:brown_shulker_box"),
    GREEN_SHULKER_BOX(232, "minecraft:green_shulker_box"),
    RED_SHULKER_BOX(233, "minecraft:red_shulker_box"),
    BLACK_SHULKER_BOX(234, "minecraft:black_shulker_box"),
    WHITE_GLAZED_TERRACOTTA(235, "minecraft:white_glazed_terracotta"),
    ORANGE_GLAZED_TERRACOTTA(236, "minecraft:orange_glazed_terracotta"),
    MAGENTA_GLAZED_TERRACOTTA(237, "minecraft:magenta_glazed_terracotta"),
    LIGHT_BLUE_GLAZED_TERRACOTTA(238, "minecraft:light_blue_glazed_terracotta"),
    YELLOW_GLAZED_TERRACOTTA(239, "minecraft:yellow_glazed_terracotta"),
    LIME_GLAZED_TERRACOTTA(240, "minecraft:lime_glazed_terracotta"),
    PINK_GLAZED_TERRACOTTA(241, "minecraft:pink_glazed_terracotta"),
    GRAY_GLAZED_TERRACOTTA(242, "minecraft:gray_glazed_terracotta"),
    LIGHT_GRAY_GLAZED_TERRACOTTA(243, "minecraft:light_gray_glazed_terracotta"),
    CYAN_GLAZED_TERRACOTTA(244, "minecraft:cyan_glazed_terracotta"),
    PURPLE_GLAZED_TERRACOTTA(245, "minecraft:purple_glazed_terracotta"),
    BLUE_GLAZED_TERRACOTTA(246, "minecraft:blue_glazed_terracotta"),
    BROWN_GLAZED_TERRACOTTA(247, "minecraft:brown_glazed_terracotta"),
    GREEN_GLAZED_TERRACOTTA(248, "minecraft:green_glazed_terracotta"),
    RED_GLAZED_TERRACOTTA(249, "minecraft:red_glazed_terracotta"),
    BLACK_GLAZED_TERRACOTTA(250, "minecraft:black_glazed_terracotta"),
    WHITE_CONCRETE(251, "minecraft:concrete"),
    WHITE_CONCRETE_POWDER(252, "minecraft:concrete_powder"),
    STRUCTURE_BLOCK(255, "minecraft:structure_block"),
    IRON_SHOVEL(256, "minecraft:iron_shovel"),
    IRON_PICKAXE(257, "minecraft:iron_pickaxe"),
    IRON_AXE(258, "minecraft:iron_axe"),
    FLINT_AND_STEEL(259, "minecraft:flint_and_steel"),
    APPLE(260, "minecraft:apple"),
    BOW(261, "minecraft:bow"),
    ARROW(262, "minecraft:arrow"),
    COAL(263, "minecraft:coal"),
    DIAMOND(264, "minecraft:diamond"),
    IRON_INGOT(265, "minecraft:iron_ingot"),
    GOLD_INGOT(266, "minecraft:gold_ingot"),
    IRON_SWORD(267, "minecraft:iron_sword"),
    WOODEN_SWORD(268, "minecraft:wooden_sword"),
    WOODEN_SHOVEL(269, "minecraft:wooden_shovel"),
    WOODEN_PICKAXE(270, "minecraft:wooden_pickaxe"),
    WOODEN_AXE(271, "minecraft:wooden_axe"),
    STONE_SWORD(272, "minecraft:stone_sword"),
    STONE_SHOVEL(273, "minecraft:stone_shovel"),
    STONE_PICKAXE(274, "minecraft:stone_pickaxe"),
    STONE_AXE(275, "minecraft:stone_axe"),
    DIAMOND_SWORD(276, "minecraft:diamond_sword"),
    DIAMOND_SHOVEL(277, "minecraft:diamond_shovel"),
    DIAMOND_PICKAXE(278, "minecraft:diamond_pickaxe"),
    DIAMOND_AXE(279, "minecraft:diamond_axe"),
    STICK(280, "minecraft:stick"),
    BOWL(281, "minecraft:bowl"),
    MUSHROOM_STEW(282, "minecraft:mushroom_stew"),
    GOLDEN_SWORD(283, "minecraft:golden_sword"),
    GOLDEN_SHOVEL(284, "minecraft:golden_shovel"),
    GOLDEN_PICKAXE(285, "minecraft:golden_pickaxe"),
    GOLDEN_AXE(286, "minecraft:golden_axe"),
    STRING(287, "minecraft:string"),
    FEATHER(288, "minecraft:feather"),
    GUNPOWDER(289, "minecraft:gunpowder"),
    WOODEN_HOE(290, "minecraft:wooden_hoe"),
    STONE_HOE(291, "minecraft:stone_hoe"),
    IRON_HOE(292, "minecraft:iron_hoe"),
    DIAMOND_HOE(293, "minecraft:diamond_hoe"),
    GOLDEN_HOE(294, "minecraft:golden_hoe"),
    WHEAT_SEEDS(295, "minecraft:wheat_seeds"),
    WHEAT(296, "minecraft:wheat"),
    BREAD(297, "minecraft:bread"),
    LEATHER_HELMET(298, "minecraft:leather_helmet"),
    LEATHER_TUNIC(299, "minecraft:leather_chestplate"),
    LEATHER_PANTS(300, "minecraft:leather_leggings"),
    LEATHER_BOOTS(301, "minecraft:leather_boots"),
    CHAINMAIL_HELMET(302, "minecraft:chainmail_helmet"),
    CHAINMAIL_CHESTPLATE(303, "minecraft:chainmail_chestplate"),
    CHAINMAIL_LEGGINGS(304, "minecraft:chainmail_leggings"),
    CHAINMAIL_BOOTS(305, "minecraft:chainmail_boots"),
    IRON_HELMET(306, "minecraft:iron_helmet"),
    IRON_CHESTPLATE(307, "minecraft:iron_chestplate"),
    IRON_LEGGINGS(308, "minecraft:iron_leggings"),
    IRON_BOOTS(309, "minecraft:iron_boots"),
    DIAMOND_HELMET(310, "minecraft:diamond_helmet"),
    DIAMOND_CHESTPLATE(311, "minecraft:diamond_chestplate"),
    DIAMOND_LEGGINGS(312, "minecraft:diamond_leggings"),
    DIAMOND_BOOTS(313, "minecraft:diamond_boots"),
    GOLDEN_HELMET(314, "minecraft:golden_helmet"),
    GOLDEN_CHESTPLATE(315, "minecraft:golden_chestplate"),
    GOLDEN_LEGGINGS(316, "minecraft:golden_leggings"),
    GOLDEN_BOOTS(317, "minecraft:golden_boots"),
    FLINT(318, "minecraft:flint"),
    RAW_PORKCHOP(319, "minecraft:porkchop"),
    COOKED_PORKCHOP(320, "minecraft:cooked_porkchop"),
    PAINTING(321, "minecraft:painting"),
    GOLDEN_APPLE(322, "minecraft:golden_apple"),
    SIGN(323, "minecraft:sign"),
    OAK_DOOR(324, "minecraft:wooden_door"),
    BUCKET(325, "minecraft:bucket"),
    WATER_BUCKET(326, "minecraft:water_bucket"),
    LAVA_BUCKET(327, "minecraft:lava_bucket"),
    MINECART(328, "minecraft:minecart"),
    SADDLE(329, "minecraft:saddle"),
    IRON_DOOR(330, "minecraft:iron_door"),
    REDSTONE(331, "minecraft:redstone"),
    SNOWBALL(332, "minecraft:snowball"),
    OAK_BOAT(333, "minecraft:boat"),
    LEATHER(334, "minecraft:leather"),
    MILK_BUCKET(335, "minecraft:milk_bucket"),
    BRICK(336, "minecraft:brick"),
    CLAY_BALL(337, "minecraft:clay_ball"),
    SUGAR_CANE(338, "minecraft:reeds"),
    PAPER(339, "minecraft:paper"),
    BOOK(340, "minecraft:book"),
    SLIMEBALL(341, "minecraft:slime_ball"),
    MINECART_WITH_CHEST(342, "minecraft:chest_minecart"),
    MINECART_WITH_FURNACE(343, "minecraft:furnace_minecart"),
    EGG(344, "minecraft:egg"),
    COMPASS(345, "minecraft:compass"),
    FISHING_ROD(346, "minecraft:fishing_rod"),
    CLOCK(347, "minecraft:clock"),
    GLOWSTONE_DUST(348, "minecraft:glowstone_dust"),
    RAW_FISH(349, "minecraft:fish"),
    COOKED_FISH(350, "minecraft:cooked_fish"),
    INK_SACK(351, "minecraft:dye"),
    BONE(352, "minecraft:bone"),
    SUGAR(353, "minecraft:sugar"),
    CAKE(354, "minecraft:cake"),
    BED_ITEM(355, "minecraft:bed"),
    REDSTONE_REPEATER(356, "minecraft:repeater"),
    COOKIE(357, "minecraft:cookie"),
    MAP(358, "minecraft:filled_map"),
    SHEARS(359, "minecraft:shears"),
    MELON(360, "minecraft:melon"),
    PUMPKIN_SEEDS(361, "minecraft:pumpkin_seeds"),
    MELON_SEEDS(362, "minecraft:melon_seeds"),
    RAW_BEEF(363, "minecraft:beef"),
    STEAK(364, "minecraft:cooked_beef"),
    RAW_CHICKEN(365, "minecraft:chicken"),
    COOKED_CHICKEN(366, "minecraft:cooked_chicken"),
    ROTTEN_FLESH(367, "minecraft:rotten_flesh"),
    ENDER_PEARL(368, "minecraft:ender_pearl"),
    BLAZE_ROD(369, "minecraft:blaze_rod"),
    GHAST_TEAR(370, "minecraft:ghast_tear"),
    GOLD_NUGGET(371, "minecraft:gold_nugget"),
    NETHER_WART_ITEM(372, "minecraft:nether_wart"),
    POTION(373, "minecraft:potion"),
    GLASS_BOTTLE(374, "minecraft:glass_bottle"),
    SPIDER_EYE(375, "minecraft:spider_eye"),
    FERMENTED_SPIDER_EYE(376, "minecraft:fermented_spider_eye"),
    BLAZE_POWDER(377, "minecraft:blaze_powder"),
    MAGMA_CREAM(378, "minecraft:magma_cream"),
    BREWING_STAND_ITEM(379, "minecraft:brewing_stand"),
    CAULDRON_ITEM(380, "minecraft:cauldron"),
    EYE_OF_ENDER(381, "minecraft:ender_eye"),
    GLISTERING_MELON(382, "minecraft:speckled_melon"),
    BOTTLE_O__ENCHANTING(384, "minecraft:experience_bottle"),
    FIRE_CHARGE(385, "minecraft:fire_charge"),
    BOOK_AND_QUILL(386, "minecraft:writable_book"),
    WRITTEN_BOOK(387, "minecraft:written_book"),
    EMERALD(388, "minecraft:emerald"),
    ITEM_FRAME(389, "minecraft:item_frame"),
    FLOWER_POT_ITEM(390, "minecraft:flower_pot"),
    CARROT(391, "minecraft:carrot"),
    POTATO(392, "minecraft:potato"),
    BAKED_POTATO(393, "minecraft:baked_potato"),
    POISONOUS_POTATO(394, "minecraft:poisonous_potato"),
    EMPTY_MAP(395, "minecraft:map"),
    GOLDEN_CARROT(396, "minecraft:golden_carrot"),
    MOB_HEAD_SKELETON(397, "minecraft:skull"),
    CARROT_ON_A_STICK(398, "minecraft:carrot_on_a_stick"),
    NETHER_STAR(399, "minecraft:nether_star"),
    PUMPKIN_PIE(400, "minecraft:pumpkin_pie"),
    FIREWORK_ROCKET(401, "minecraft:fireworks"),
    FIREWORK_STAR(402, "minecraft:firework_charge"),
    ENCHANTED_BOOK(403, "minecraft:enchanted_book"),
    REDSTONE_COMPARATOR(404, "minecraft:comparator"),
    NETHER_BRICK_ITEM(405, "minecraft:netherbrick"),
    NETHER_QUARTZ(406, "minecraft:quartz"),
    MINECART_WITH_TNT(407, "minecraft:tnt_minecart"),
    MINECART_WITH_HOPPER(408, "minecraft:hopper_minecart"),
    PRISMARINE_SHARD(409, "minecraft:prismarine_shard"),
    PRISMARINE_CRYSTALS(410, "minecraft:prismarine_crystals"),
    RAW_RABBIT(411, "minecraft:rabbit"),
    COOKED_RABBIT(412, "minecraft:cooked_rabbit"),
    RABBIT_STEW(413, "minecraft:rabbit_stew"),
    RABBIT_S_FOOT(414, "minecraft:rabbit_foot"),
    RABBIT_HIDE(415, "minecraft:rabbit_hide"),
    ARMOR_STAND(416, "minecraft:armor_stand"),
    IRON_HORSE_ARMOR(417, "minecraft:iron_horse_armor"),
    GOLDEN_HORSE_ARMOR(418, "minecraft:golden_horse_armor"),
    DIAMOND_HORSE_ARMOR(419, "minecraft:diamond_horse_armor"),
    LEAD(420, "minecraft:lead"),
    NAME_TAG(421, "minecraft:name_tag"),
    MINECART_WITH_COMMAND_BLOCK(422, "minecraft:command_block_minecart"),
    RAW_MUTTON(423, "minecraft:mutton"),
    COOKED_MUTTON(424, "minecraft:cooked_mutton"),
    BANNER(425, "minecraft:banner"),
    END_CRYSTAL(426, "minecraft:end_crystal"),
    SPRUCE_DOOR(427, "minecraft:spruce_door"),
    BIRCH_DOOR(428, "minecraft:birch_door"),
    JUNGLE_DOOR(429, "minecraft:jungle_door"),
    ACACIA_DOOR(430, "minecraft:acacia_door"),
    DARK_OAK_DOOR(431, "minecraft:dark_oak_door"),
    CHORUS_FRUIT(432, "minecraft:chorus_fruit"),
    POPPED_CHORUS_FRUIT(433, "minecraft:popped_chorus_fruit"),
    BEETROOT(434, "minecraft:beetroot"),
    BEETROOT_SEEDS(435, "minecraft:beetroot_seeds"),
    BEETROOT_SOUP(436, "minecraft:beetroot_soup"),
    DRAGON_S_BREATH(437, "minecraft:dragon_breath"),
    SPLASH_POTION(438, "minecraft:splash_potion"),
    SPECTRAL_ARROW(439, "minecraft:spectral_arrow"),
    TIPPED_ARROW(440, "minecraft:tipped_arrow"),
    LINGERING_POTION(441, "minecraft:lingering_potion"),
    SHIELD(442, "minecraft:shield"),
    ELYTRA(443, "minecraft:elytra"),
    SPRUCE_BOAT(444, "minecraft:spruce_boat"),
    BIRCH_BOAT(445, "minecraft:birch_boat"),
    JUNGLE_BOAT(446, "minecraft:jungle_boat"),
    ACACIA_BOAT(447, "minecraft:acacia_boat"),
    DARK_OAK_BOAT(448, "minecraft:dark_oak_boat"),
    TOTEM_OF_UNDYING(449, "minecraft:totem_of_undying"),
    SHULKER_SHELL(450, "minecraft:shulker_shell"),
    IRON_NUGGET(452, "minecraft:iron_nugget"),
    KNOWLEDGE_BOOK(453, "minecraft:knowledge_book"),
    THIRTEEN_DISC(2256, "minecraft:record_13"),
    CAT_DISC(2257, "minecraft:record_cat"),
    BLOCKS_DISC(2258, "minecraft:record_blocks"),
    CHIRP_DISC(2259, "minecraft:record_chirp"),
    FAR_DISC(2260, "minecraft:record_far"),
    MALL_DISC(2261, "minecraft:record_mall"),
    MELLOHI_DISC(2262, "minecraft:record_mellohi"),
    STAL_DISC(2263, "minecraft:record_stal"),
    STRAD_DISC(2264, "minecraft:record_strad"),
    WARD_DISC(2265, "minecraft:record_ward"),
    ELEVEN_DISC(2266, "minecraft:record_11"),
    WAIT_DISC(2267, "minecraft:record_wait");

    private final int id;
    private final String minecraftID;

    VanillaMaterial(int id, String minecraftID) {
        this.id = id;
        this.minecraftID = minecraftID;
    }

    @Nullable
    public static VanillaMaterial byID(int id) {
        return Arrays.stream(values()).filter(material -> material.getID() == id).findAny().orElse(null);
    }

    public int getID() {
        return id;
    }

    public String getMinecraftID() {
        return minecraftID;
    }
}