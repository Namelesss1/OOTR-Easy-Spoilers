/**
 * This class provides aliases of many things including keys in the spoiler log,
 * names of areas in the map, etc.
 *
 * These aliases are not strictly necessary, but they are here to help for user convenience
 * so that they can have more options than type something long such as
 * "enable_distribution_file" or "Death Mountain Crater" and instead type an alias like "edf"
 * or "crater" when they are quickly wanting to look something up from the spoiler log.
 * It also avoids having to memorize the exact wording that the spoiler log uses
 * for each of its keys in the JSON which is useful for the user.
 */
public class Aliases {

    public static enum AliasType {
        KEYS,
        SETTINGS,
        ITEMS,
        MULTI_EXIT,
        SINGLE_EXIT
    }


    /**
     * Get an array representing each main key in the spoiler JSON mapped to possible
     * aliases.
     * @return Array of all aliases of a key
     */
    public static String[][] keyAliases() {
        String[][] aliases = {
        SEED,
        VERSION,
        FILE_HASH,
        SETTINGS_STRING,
        ENABLE_DISTRIBUTION_FILE,
        SETTINGS,
        RANDOMIZED_SETTINGS,
        STARTING_ITEMS,
        ITEM_POOL,
        DUNGEONS,
        TRIALS,
        SONGS,
        ENTRANCES,
        LOCATIONS,
        WOTH_LOCATIONS,
        GOAL_LOCATIONS,
        BARREN_REGIONS,
        GOSSIP_STONES,
        PLAYTHROUGH
        };

        return aliases;
    }


    /**
     * Get an array representing each setting key in the spoiler JSON mapped to possible
     * aliases.
     * @return array of all aliases of randomizer settings key names
     */
    public static String[][] settingsAliases() {
        String[][] aliases = {
        WORLD_COUNT,
        CREATE_SPOILER,
        RANDOMIZE_SETTINGS,
        OPEN_FOREST,
        OPEN_KAKARIKO,
        OPEN_DOOR_OF_TIME,
        ZORA_FOUNTAIN,
        GERUDO_FORTRESS,
        BRIDGE,
        BRIDGE_TOKENS,
        TRIFORCE_HUNT,
        LOGIC_RULES,
        REACHABLE_LOCATIONS,
        BOMBCHUS_IN_LOGIC,
        ONE_ITEM_PER_DUNGEON,
        TRIALS_RANDOM,
        SKIP_CHILD_ZELDA,
        NO_ESCAPE_SEQUENCE,
        NO_GUARD_STEALTH,
        NO_EPONA_RACE,
        SKIP_SOME_MINIGAME_PHASES,
        USEFUL_CUTSCENES,
        COMPLETE_MASK_QUEST,
        FAST_CHESTS,
        LOGIC_NO_NIGHT_TOKENS_WITHOUT_SUN_SONG,
        FREE_SCARECROW,
        FAST_BUNNY_HOOD,
        START_WITH_RUPEES,
        START_WITH_CONSUMABLES,
        STARTING_HEARTS,
        CHICKEN_COUNT_RANDOM,
        BIG_POE_COUNT_RANDOM,
        BIG_POE_COUNT,
        SHUFFLE_KOKIRI_SWORD,
        SHUFFLE_OCARINAS,
        SHUFFLE_GERUDO_CARD,
        SHUFFLE_SONG_ITEMS,
        SHUFFLE_COWS,
        SHUFFLE_BEANS,
        SHUFFLE_MEDIGORON_CARPET_SALESMAN,
        SHUFFLE_INTERIOR_ENTRANCES,
        SHUFFLE_GROTO_ENTRANCES,
        SHUFFLE_DUNGEON_ENTRANCES,
        SHUFFLE_OVERWORLD_ENTRANCES,
        OWL_DROPS,
        WARP_SONGS,
        SPAWN_POSITIONS,
        SHUFFLE_SCRUBS,
        SHOPSANITY,
        TOKENSANITY,
        SHUFFLE_MAPCOMPASS,
        SHUFFLE_SMALLKEYS,
        SHUFFLE_BOSSKEYS,
        SHUFFLE_GANON_BOSSKEY,
        LACS_CONDITION,
        ENHANCE_MAP_COMPASS,
        MQ_DUNGEONS_RANDOM,
        MQ_DUNGEONS,
        DISABLED_LOCATIONS,
        ALLOWED_TRICKS,
        LOGIC_EARLIEST_ADULT_TRADE,
        LOGIC_LATEST_ADULT_TRADE,
        STARTING_EQUIPMENT,
        STARTING_ITEMS_SETTING,
        STARTING_SONGS,
        OCARINA_SONGS,
        CORRECT_CHEST_SIZES,
        CLEARER_HINTS,
        NO_COLLECTIBLE_HEARTS,
        HINTS,
        HINT_DIST,
        ITEM_HINTS,
        HINT_DIST_USER,
        TEXT_SHUFFLE,
        MISC_HINTS,
        ICE_TRAP_APPEARANCE,
        JUNK_ICE_TRAPS,
        ITEM_POOL_VALUE,
        DAMAGE_MULTIPLIER,
        STARTING_TOD,
        STARTING_AGE,
        CHICKEN_COUNT,
        TRIALS_SETTING,
        };

        return aliases;
    }



    /**
     * Get an array of string arrays, each string array representing aliases
     * and forms of an item in the game.
     *
     * @return Array of String arrays, each string array representing aliases for each item.
     */
    public static String[][] itemAliases() {
        String[][] items = {
                ARROWS,
                BIGGORON_SWORD,
                BOLERO_OF_FIRE,
                BOMB_BAG,
                BOMBCHUS,
                BOMBS,
                BOOMERANG,
                BOTTLE,
                BOW,
                BROKEN_SWORD,
                BLUE_FIRE,
                BOTTLE_BUG,
                DEKU_NUT,
                DEKU_NUT_CAPACITY,
                DEKU_SEEDS,
                DEKU_SHIELD,
                DEKU_STICKS,
                DEKU_STICKS_CAPACITY,
                FAIRY_SPIRIT,
                FISH,
                GORON_TUNIC,
                GREEN_POTION,
                HEART,
                HYLIAN_SHIELD,
                POE,
                RED_POTION,
                ZORA_TUNIC,
                DINS_FIRE,
                DOUBLE_DEFENSE,
                EPONAS_SONG,
                FARORES_WIND,
                FIRE_ARROWS,
                GIANTS_KNIFE,
                GOLD_SKULLTULA_TOKEN,
                HEART_CONTAINER,
                HOVER_BOOTS,
                ICE_ARROWS,
                ICE_TRAP,
                IRON_BOOTS,
                KOKIRI_SWORD,
                LENS_OF_TRUTH,
                LIGHT_ARROWS,
                MAGIC_METER,
                MEGATON_HAMMER,
                MINUET_OF_FOREST,
                MIRROR_SHIELD,
                NAYRUS_LOVE,
                NOCTURNE_OF_SHADOW,
                OCARINA,
                PIECE_OF_HEART,
                PRELUDE_OF_LIGHT,
                HOOKSHOT,
                SCALES,
                PROGRESSIVE_STRENGTH_UPGRADE,
                PROGRESSIVE_WALLET,
                REQUIEM_OF_SPIRIT,
                RUPEE,
                SARIAS_SONG,
                SERENADE_OF_WATER,
                SLINGSHOT,
                SONG_OF_STORMS,
                SONG_OF_TIME,
                STONE_OF_AGONY,
                SUNS_SONG,
                ZELDAS_LULLABY
        };
        return items;
    }


    /**
     * Returns an array of aliases for each map with multiple exits
     * Element [n][0] (first element of an inner array) is the JSON key for the spoiler log
     * @return Arrays of multi exit map aliases
     */
    public static String[][] getMultiExitMapAliases() {
        String[][] aliases = {
                BARINADE_BOSS_ROOM,
                TWINROVA_BOSS_ROOM,
                PHANTOM_GANON_BOSS_ROOM,
                QUEEN_GOHMA_BOSS_ROOM,
                DODONGOS_CAVERN,
                BONGO_BONGO_BOSS_ROOM,
                KING_DODONGO_BOSS_ROOM,
                VOLVAGIA_BOSS_ROOM,
                MORPHA_BOSS_ROOM,
                KOKIRI_FOREST,
                LOST_WOODS,
                LOST_WOODS_BEYOND_MIDO,
                DMC_UPPER_LOCAL,
                DMC_CENTRAL_LOCAL,
                DMC_LOWER_LOCAL,
                GRAVEYARD_WARP_PAD_REGION,
                GRAVEYARD,
                GV_FORTRESS_SIDE,
                GERUDO_VALLEY,
                DEATH_MOUNTAIN_SUMMIT,
                DEATH_MOUNTAIN,
                LOST_WOODS_BRIDGE,
                LOST_WOODS_UNDERWATER_ENTRANCE,
                TOT_ENTRANCE,
                MARKET,
                ZORA_RIVER,
                HYRULE_FIELD,
                WASTELAND_NEAR_COLOSSUS,
                WASTELAND_NEAR_FORTRESS,
                ZORAS_DOMAIN,
                ZD_BEHIND_KING_ZORA,
                MARKET_ENTRANCE,
                GC_WOODS_WARP,
                GC_DARUNIAS_CHAMBER,
                GORON_CITY,
                ZR_FRONT,
                ZR_BEHIND_WATERFALL,
                LAKE_HYLIA,
                ZORAS_FOUNTAIN,
                DESERT_COLOSSUS,
                GF_OUTSIDE_GATE,
                GERUDO_FORTRESS_PLACE,
                SFM_ENTRYWAY,
                LW_BRIDGE_FROM_FOREST,
                LON_LON_RANCH,
                KAK_BEHIND_GATE,
                KAKARIKO_VILLAGE,
                CASTLE_GROUNDS,
                GERUDO_TRAINING_GROUND_LOBBY
        };
        return aliases;
    }


    /**
     * Returns an array of aliases for each map with a single exit
     * Element [n][0] (first element of an inner array) is the JSON key for the spoiler log
     * @return Arrays of single exit map aliases
     */
    public static String[][] getSingleExitMapAliases() {
        String[][] aliases = {
                COLOSSUS_GREAT_FAIRY_FOUNTAIN,
                KAKARIKO_SHOOTING_GALLERY,
                KF_LINKS_HOUSE,
                MARKET_POTION_SHOP,
                MARKET_MASK_SHOP,
                KAK_IMPAS_HOUSE_BACK,
                KAK_IMPAS_HOUSE,
                MARKET_SHOOTING_GALLERY,
                GRAVEYARD_DAMPES_HOUSE,
                OGC_GREAT_FAIRY_FOUNTAIN,
                KF_SARIAS_HOUSE,
                KAK_POTION_SHOP,
                MARKET_MAN_IN_GREEN_HOUSE,
                DMT_GREAT_FAIRY_FOUNTAIN,
                KF_MIDOS_HOUSE,
                KF_HOUSE_OF_TWINS,
                MARKET_TREASURE_CHEST_GAME,
                GC_SHOP,
                KAK_BAZAAR,
                KAK_WINDMILL,
                DMC_GREAT_FAIRY_FOUNTAIN,
                KAK_CARPENTER_BOSS_HOUSE,
                KAK_ODD_MEDICINE_BUILDING,
                ZF_GREAT_FAIRY_FOUNTAIN,
                TEMPLE_OF_TIME,
                KF_KOKIRI_SHOP,
                HC_GREAT_FAIRY_FOUNTAIN,
                MARKET_GAURD_HOUSE,
                MARKET_BOMBCHU_BOWLING,
                MARKET_BAZAAR,
                MARKET_BOMBCHU_SHOP,
                KAK_HOUSE_OF_SKULLTULA,
                LLR_STABLES,
                ZD_SHOP,
                LLR_TALONS_HOUSE,
                LLR_TOWER,
                LH_FISHING_HOLE,
                KF_KNOW_IT_ALL_HOUSE,
                LH_LAB,
                GV_CARPENTER_TENT,
                ZD_STORMS_GROTTO,
                GRAVEYARD_DAMPES_HOUSE,
                KAK_REDEAD_GROTTO,
                GRAVEYARD_DAMPES_GRAVE,
                HF_NEAR_MARKET_GROTTO,
                SFM_WOLFOS_GROTTO,
                ZR_FAIRY_GROTTO,
                HF_COW_GROTTO,
                HF_INSIDE_FENCE_GROTTO,
                KAK_OPEN_GROTTO,
                LW_NEAR_SHORTCUTS_GROTTO,
                HF_OPEN_GROTTO,
                HF_TEKTITE_GROTTO,
                HC_STORMS_GROTTO,
                ZR_OPEN_GROTTO,
                LH_GROTTO,
                GRAVEYARD_ROYAL_FAMILYS_TOMB,
                SFM_STORMS_GROTTO,
                DMC_UPPER_GROTTO,
                SFM_FAIRY_GROTTO,
                GRAVEYARD_HEART_PIECE_GRAVE,
                GV_STORMS_GROTTO,
                LLR_GROTTO,
                DMC_HAMMER_GROTTO,
                GV_OCTOROK_GROTTO,
                ZR_STORMS_GROTTO,
                KF_STORMS_GROTTO,
                HF_SOUTHEAST_GROTTO,
                DEKU_THEATER,
                HF_FAIRY_GROTTO,
                GF_STORMS_GROTTO,
                DMT_STORMS_GROTTO,
                LW_SCRUBS_GROTTO,
                HF_NEAR_KAK_GROTTO,
                GC_GROTTO,
                DMT_COW_GROTTO,
                COLOSSUS_GROTTO,
                GRAVEYARD_SHIELD_GRAVE
        };
        return aliases;
    }




    /* Main keys in spoiler log */
    public static final String[] SEED = {"seed", "s"},
    VERSION = {"version", "vers", "v"},
    FILE_HASH = {"file_hash", "file hash", "fh", "hash"},
    SETTINGS_STRING = {"settings_string", "ss", "settings string"},
    ENABLE_DISTRIBUTION_FILE = {"enable_distribution_file","edf", "enable distribution file", "distribution file",
                    "distr file", "distribution_file", "df"},
    SETTINGS = {"settings", "setting"},
    RANDOMIZED_SETTINGS = {"randomized_settings", "rs", "random_settings", "randomized settings", "randomized setting"},
    STARTING_ITEMS = {"starting_items", "start_items", "start items", "starting items"},
    ITEM_POOL = {"item_pool", "item pool", "items", "available items", "pool", "ip"},
    DUNGEONS = {"dungeons, temples"},
    TRIALS = {"trials", "ganons trials", "ganon's trials", "ganon"},
    SONGS = {"songs", "music"},
    ENTRANCES = {"entrances"},
    LOCATIONS = {"locations", "item placement"},
    WOTH_LOCATIONS = {"woth_locations", "woth locations", "hero", "way of the hero", "way of the hero locations"},
    GOAL_LOCATIONS = {"goal_locations", "goals", "goal locations"},
    BARREN_REGIONS = {"barren_regions", "barren", "foolish", "foolish_choice", "foolish choice"},
    GOSSIP_STONES = {"gossip_stones", "gossip stones", "stones", "eye of truth", "eye stones"},
    PLAYTHROUGH = {"playthrough", "playthru", "path"};




    /* Settings keys */
    public static final String[] WORLD_COUNT = {"world_count", "world count"},
    CREATE_SPOILER = {"create_spoiler", "create spoiler", "make spoiler", "enable spoiler"},
    RANDOMIZE_SETTINGS = {"randomize_settings", "randomize settings", "shuffle settings"},
    OPEN_FOREST = {"open_forest", "open forest"},
    OPEN_KAKARIKO = {"open_kakariko", "open kakariko"},
    OPEN_DOOR_OF_TIME = {"open_door_of_time", "open door of time", "open time", "door of time"},
    ZORA_FOUNTAIN = {"zora_fountain", "zora fountain"},
    GERUDO_FORTRESS = {"gerudo_fortress", "gerudo_fortress"},
    BRIDGE = {"bridge"},
    BRIDGE_TOKENS = {"bridge_tokens", "bridge tokens"},
    TRIFORCE_HUNT = {"triforce_hunt", "triforce hunt", "triforce", "hunt"},
    LOGIC_RULES = {"logic_rules", "logic", "logic rules"},
    REACHABLE_LOCATIONS = {"reachable_locations", "reachable locations", "reachable"},
    BOMBCHUS_IN_LOGIC = {"bombchus_in_logic", "bombchus in logic"},
    ONE_ITEM_PER_DUNGEON = {"one_item_per_dungeon", "one item per dungeon", "1 item per dungeon", "1/dungeon"},
    TRIALS_RANDOM = {"trials_random", "random trials", "trials random"},
    SKIP_CHILD_ZELDA = {"skip_child_zelda", "skip child zelda", "skip zelda"},
    NO_ESCAPE_SEQUENCE = {"no_escape_sequence", "no escape sequence", "skip tower", "skip escape"},
    NO_GUARD_STEALTH = {"no_guard_stealth", "no guard stealth", "skip guards", "skip courtyard"},
    NO_EPONA_RACE = {"no_epona_race", "no epona race", "skip race", "skip horse race"},
    SKIP_SOME_MINIGAME_PHASES = {"skip_some_minigame_phases", "skip some minigame phases", "skip minigame"},
    USEFUL_CUTSCENES = {"useful_cutscenes", "useful cutscenes", "glitch cutscenes"},
    COMPLETE_MASK_QUEST = {"complete_mask_quest", "complete mask quest", "mask quest", "no mask quest", "skip mask quest"},
    FAST_CHESTS = {"fast_chests", "fast chests"},
    LOGIC_NO_NIGHT_TOKENS_WITHOUT_SUN_SONG = {"logic_no_night_tokens_without_suns_song", "no night tokens without suns song"},
    FREE_SCARECROW = {"free_scarecrow", "free scarecrow", "auto scarecrow", "scarecrow"},
    FAST_BUNNY_HOOD = {"fast_bunny_hood", "fast bunny hood", "bunny hood"},
    START_WITH_RUPEES = {"start_with_rupees", "start with rupees", "rupees start"},
    START_WITH_CONSUMABLES = {"start_with_consumables", "start with consumables", "consumables"},
    STARTING_HEARTS = {"starting_hearts", "starting hearts", "lives"},
    CHICKEN_COUNT_RANDOM = {"chicken_count_random", "chicken count random", "chicken count", "random chicken count"},
    BIG_POE_COUNT_RANDOM = {"big_poe_count_random", "big poe count random", "random big poe count"},
    BIG_POE_COUNT = {"big_poe_count", "big poe count", "poe count"},
    SHUFFLE_KOKIRI_SWORD = {"shuffle_kokiri_sword", "shuffle kokiri sword", "kokiri sword"},
    SHUFFLE_OCARINAS = {"shuffle_ocarinas", "shuffle ocarinas", "ocarina shuffle", "ocarinas"},
    SHUFFLE_GERUDO_CARD = {"shuffle_gerudo_card", "shuffle gerudo card", "gerudo card"},
    SHUFFLE_SONG_ITEMS = {"shuffle_song_items", "shuffle songs", "shuffle song items"},
    SHUFFLE_COWS = {"shuffle_cows", "shuffle cows", "cows"},
    SHUFFLE_BEANS = {"shuffle_beans", "shuffle beans", "beans"},
    SHUFFLE_MEDIGORON_CARPET_SALESMAN = {"shuffle_medigoron_carpet_salesman", "medigoron", "carpet salesman"},
    SHUFFLE_INTERIOR_ENTRANCES = {"shuffle_interior_entrances", "interior entrances", "interior"},
    SHUFFLE_GROTO_ENTRANCES = {"shuffle_groto_entrances", "shuffle grotos", "grotos"},
    SHUFFLE_DUNGEON_ENTRANCES = {"shuffle_dungeon_entrances", "dungeon entrances", "dungeons"},
    SHUFFLE_OVERWORLD_ENTRANCES = {"shuffle_overworld_entrances", "overworld entrances", "overworld"},
    OWL_DROPS = {"owl_drops", "owl drops", "owl"},
    WARP_SONGS = {"warp_songs", "warp songs", "songs", "music"},
    SPAWN_POSITIONS = {"spawn_positions", "spawn positions", "spawns"},
    SHUFFLE_SCRUBS = {"shuffle_scrubs", "shuffle scrubs", "scrubs"},
    SHOPSANITY = {"shopsanity", "shuffle shops", "shop items", "shops"},
    TOKENSANITY = {"tokensanity", "shuffle tokens", "tokens"},
    SHUFFLE_MAPCOMPASS = {"shuffle_mapcompass", "maps", "compass", "compasses"},
    SHUFFLE_SMALLKEYS = {"shuffle_smallkeys", "small keys", "shuffle small keys"},
    SHUFFLE_BOSSKEYS = {"shuffle_bosskeys", "shuffle boss keys", "boss keys"},
    SHUFFLE_GANON_BOSSKEY = {"shuffle_ganon_bosskey", "shuffle ganon boss key ", "ganon's boss key", "ganons boss key"},
    LACS_CONDITION = {"lacs_condition", "lacs", "light arrow cutscene"},
    ENHANCE_MAP_COMPASS = {"enhance_map_compass", "enhance maps", "enhance compass", "map info", "compass info"},
    MQ_DUNGEONS_RANDOM = {"mq_dungeons_random", "random master quest dungeons", "random mq dungeons", "random mq"},
    MQ_DUNGEONS = {"mq_dungeons", "mq", "mq dungeons", "master quest", "master quest dungeons"},
    DISABLED_LOCATIONS = {"disabled_locations", "disabled locations", "disabled places", "disabled"},
    ALLOWED_TRICKS = {"allowed_tricks", "allowed tricks", "tricks", "enabled tricks"},
    LOGIC_EARLIEST_ADULT_TRADE = {"logic_earliest_adult_trade", "earliest trade"},
    LOGIC_LATEST_ADULT_TRADE = {"logic_latest_adult_trade", "latest trade"},
    STARTING_EQUIPMENT = {"starting_equipment", "starting equipment", "start equipment","equipment"},
    STARTING_ITEMS_SETTING = {"starting_items", "starting items", "start items"},
    STARTING_SONGS = {"starting_songs", "starting songs", "start songs"},
    OCARINA_SONGS = {"ocarina_songs", "ocarina songs"},
    CORRECT_CHEST_SIZES = {"correct_chest_sizes", "correct chest sizes", "chest sizes", "chests", "chest size"},
    CLEARER_HINTS = {"clearer_hints", "clearer hints", "better hints"},
    NO_COLLECTIBLE_HEARTS = {"no_collectible_hearts", "no hearts", "hero mode"},
    HINTS = {"hints"},
    HINT_DIST = {"hint_dist", "hint", "hint distribution"},
    ITEM_HINTS = {"item_hints", "item hints"},
    HINT_DIST_USER = {"hint_dist_user", "hint dist user", "user hints"},
    TEXT_SHUFFLE = {"text_shuffle", "text shuffle", "shuffle text", "text", "textsanity"},
    MISC_HINTS = {"misc_hints", "miscellaneous hints", "misc hints"},
    ICE_TRAP_APPEARANCE = {"ice_trap_appearance", "ice trap appearance", "ice trap frequency", "ice traps"},
    JUNK_ICE_TRAPS = {"junk_ice_traps", "junk ice traps", "junk"},
    ITEM_POOL_VALUE = {"item_pool_value", "item pool value", "item pool"},
    DAMAGE_MULTIPLIER = {"damage_multiplier", "damage multiplier", "damage"},
    STARTING_TOD = {"starting_tod", "starting tod", "starting time of day", "tod", "time of day"},
    STARTING_AGE = {"starting_age", "starting age", "start age", "age"},
    CHICKEN_COUNT = {"chicken_count", "chicken count", "chickens"},
    TRIALS_SETTING = {"trials"};




    /* Items */
    public static String[] ARROWS = {"arrows", "arrow", "Arrows (10)", "Arrows (30)", "Arrows (5)", "Buy Arrows (10)",
            "Buy Arrows (30),", "Buy Arrows (50)"},
    BIGGORON_SWORD = {"Biggoron Sword", "Bigoron sword"},
    BOLERO_OF_FIRE = {"Bolero Of Fire", "bof", "music", "songs", "song", "fire song"},
    BOMB_BAG = {"Bomb Bag", "bombbag"},
    BOMBCHUS = {"Bombchus", "Buy Bombchu (10)", "Buy Bombchu (20)", "Buy Bombchu (5)"},
    BOMBS = {"Bombs", "Bombs (10)", "Bombs (20)", "Bombs (5)", "Buy Bombs (10)", "Buy Bombs (20)", "Buy Bombs (30)",
            "Buy Bombs (5) [25]", "Buy Bombs (5) [35]"},
    BOOMERANG = {"Boomerang"},
    BOTTLE = {"Bottle", "Bottle with Big Poe", "Bottle with Fish", "Bottle with Green Potion", "Bottle with Red Potion"},
    BOW = {"Bow", "fairy bow"},
    BROKEN_SWORD = {"Broken Sword"},
    BLUE_FIRE = {"Blue Fire", "Buy Blue Fire"},
    BOTTLE_BUG = {"Buy Bottle Bug"},
    DEKU_NUT = {"Deku Nuts", "deku nuts", "Buy Deku Nut (10)", "Buy Deku Nut (5)", "Deku Nuts (10)", "Deku Nuts (5)",
            "Deku Nut Capacity"},
    DEKU_NUT_CAPACITY = {"Deku Nut Capacity", "Deku Nut Upgrade"},
    DEKU_SEEDS = {"Deku Seeds", "Deku Seeds (30)", "Buy Deku Seeds (30)"},
    DEKU_SHIELD = {"Deku Shield", "Buy Deku Shield"},
    DEKU_STICKS = {"Deku Sticks", "Deku Stick", "Buy Deku Stick (1)", "Deku Stick (1)", "Deku Stick Capacity"},
    DEKU_STICKS_CAPACITY = {"Deku Stick Capacity", "Deku Stick Upgrade"},
    FAIRY_SPIRIT = {"Fairy", "Fairy Spirit", "Buy Fairy's Spirit"},
    FISH = {"Fish", "Buy Fish"},
    GORON_TUNIC = {"Goron Tunic", "goron shirt", "goron", "red tunic", "red shirt"},
    GREEN_POTION = {"Green Potion", "magic potion", "Buy Green Potion"},
    HEART = {"Heart", "life", "Buy Heart", "Recovery Heart"},
    HYLIAN_SHIELD = {"Hylian Shield", "hyrule shield", "Buy Hylian Shield"},
    POE = {"Poe", "Buy Poe"},
    RED_POTION = {"Red Potion", "Buy Red Potion [30]", "Buy Red Potion [40]", "Buy Red Potion [50]"},
    ZORA_TUNIC = {"Zora Tunic", "Buy Zora Tunic", "blue tunic", "blue shirt", "fish tunic", "water tunic"},
    DINS_FIRE = {"Dins Fire", "Din's Fire"},
    DOUBLE_DEFENSE = {"Double Defense", "half damage", "defense upgrade", "life upgrade", "defence upgrade"},
    EPONAS_SONG = {"Eponas Song", "Epona's Song", "song", "songs", "music"},
    FARORES_WIND = {"Farores Wind", "Farore's Wind"},
    FIRE_ARROWS = {"Fire Arrows", "Fire Arrow", "Flaming Arrows", "red arrows"},
    GIANTS_KNIFE = {"Giants Knife", "Giant's Knife"},
    GOLD_SKULLTULA_TOKEN = {"Gold Skulltula Token", "Gold Skulltula Tokens", "token", "tokens"},
    HEART_CONTAINER = {"Heart Container", "full heart"},
    HOVER_BOOTS = {"Hover Boots", "slippers"},
    ICE_ARROWS = {"Ice Arrows", "Frozen Arrows", "blue arrows", "ice arrow"},
    ICE_TRAP = {"Ice Trap", "Ice traps", "traps"},
    IRON_BOOTS = {"Iron Boots", "Sinking Boots"},
    KOKIRI_SWORD = {"Kokiri Sword", "kokiri"},
    LENS_OF_TRUTH = {"Lens of Truth", "Eye of Truth"},
    LIGHT_ARROWS = {"Light Arrows", "Light Arrow", "Yellow Arrows", "yellow arrow"},
    MAGIC_METER = {"Magic Meter", "Magic Meter upgrade", "magic upgrade"},
    MEGATON_HAMMER = {"Megaton Hammer", "hammer"},
    MINUET_OF_FOREST = {"Minuet of Forest", "mof", "green song", "songs", "song", "music", "forest song"},
    MIRROR_SHIELD = {"Mirror Shield", "Gerudo Shield", "Reflective Shield"},
    NAYRUS_LOVE = {"Nayrus Love", "Nayru's Love"},
    NOCTURNE_OF_SHADOW = {"Nocturne of Shadow", "nos", "Graveyard song", "songs", "song", "music"},
    OCARINA = {"Ocarina", "Ocarina of Time", "Fairy Ocarina"},
    PIECE_OF_HEART = {"Piece of Heart", "Heart Piece", "Piece of Heart (Treasure Chest Game)"},
    PRELUDE_OF_LIGHT = {"Prelude of Light", "pol", "temple of time song", "songs", "song", "music"},
    HOOKSHOT = {"Progressive Hookshot","Hookshot", "longshot", "hookshot upgrade"},
    SCALES = {"Progressive Scale", "Scales", "Silver Scale", "Golden Scale", "scale"},
    PROGRESSIVE_STRENGTH_UPGRADE = {"Progressive Strength Upgrade", "gauntlets", "silver gauntlets", "golden gauntlets"},
    PROGRESSIVE_WALLET = {"Progressive Wallet", "wallet", "wallets", "Adults Wallet", "Giants Wallet", "Tycoons Wallet"},
    REQUIEM_OF_SPIRIT = {"Requiem of Spirit", "ros", "desert song", "songs", "song", "music"},
    RUPEE = {"Rupee", "rupees", "money", "green rupee", "blue rupee", "red rupee", "purple rupee", "yellow rupee",
            "giant rupee", "Rupee (1)", "Rupees (20)", "Rupees (200)", "Rupees (5)", "Rupees (50)"},
    SARIAS_SONG = {"Sarias Song", "Saria's Song", "saria song", "songs", "song", "music"},
    SERENADE_OF_WATER = {"Serenade of Water", "sow", "water song", "lake hylia song", "songs", "song", "music"},
    SLINGSHOT = {"Slingshot"},
    SONG_OF_STORMS = {"Song of Storms", "sos", "storm song", "rain song", "songs", "music", "song"},
    SONG_OF_TIME = {"Song of Time", "sot", "time song", "songs", "song", "music"},
    STONE_OF_AGONY = {"Stone of Agony", "Agony Stone", "stone"},
    SUNS_SONG = {"Suns Song", "Sun's Song", "sun song", "day song", "night song", "songs", "song", "music"},
    ZELDAS_LULLABY = {"Zeldas Lullaby", "Zelda's Lullaby", "Zelda song", "songs", "song", "music"};



    /* Places (To -> From leads to {place from: place}) with multiple exits */
    public static String[] BARINADE_BOSS_ROOM = {"Barinade Boss Room", "Barinade", "Jabu Jabu's Belly Boss Room",
            "Jabu Jabu's Belly Boss", "jabu jabu belly boss", "jabu jabu boss", "fish boss", "boomerang boss"},
    TWINROVA_BOSS_ROOM = {"Twinrova Boss Room", "Twinrova", "spirit temple boss room", "spirit temple boss",
            "spirit temple boss room", "mirror shield boss"},
    PHANTOM_GANON_BOSS_ROOM = {"Phantom Ganon Boss Room", "phantom ganon", "forest temple boss", "forest temple boss room",
            "bow boss room", "fairy bow boss room"},
    QUEEN_GOHMA_BOSS_ROOM = {"Queen Gohma Boss Room", "Queen gohma", "deku tree boss", "deku tree boss room",
            "slingshot boss"},
    DODONGOS_CAVERN = {"Dodongos Cavern Beginning", "Dodongo's Cavern", "dodongo's cavern"},
    BONGO_BONGO_BOSS_ROOM = {"Bongo Bongo Boss Room", "Bongo bongo", "bongo", "Shadow Temple Boss", "shadow temple boss room"},
    KING_DODONGO_BOSS_ROOM = {"King Dodongo Boss Room", "King Dodongo", "dodongo's cavern boss", "dodongos cavern boss",
            "dodongo cavern boss"},
    VOLVAGIA_BOSS_ROOM = {"Volvagia Boss Room", "Volvagia", "dragon boss", "dragon", "fire temple boss", "fire temple boss room",
            "fire boss", "hammer boss"},
    MORPHA_BOSS_ROOM = {"Morpha Boss Room", "Morpha", "Water Temple Boss Room", "water temple boss", "hookshot boss",
            "longshot boss", "water boss"},
    KOKIRI_FOREST = {"Kokiri Forest", "Forest Town", "Forest village", "start town", "kf", "fairy forest", "kokiri"},
    LOST_WOODS_BEYOND_MIDO = {"LW Beyond Mido", "Lost woods beyond mido", "deep lost woods", "lw past mido"},
    LOST_WOODS = {"Lost Woods", "lw"},
    DMC_UPPER_LOCAL = {"DMC Upper Local", "dmc upper", "crater upper", "volcano upper",
            "dmc", "crater", "volcano", "Death Mountain Crater"},
    DMC_CENTRAL_LOCAL = {"DMC Central Local", "dmc central", "crater central", "volcano central", "volcano warp pad",
            "crater warp pad", "death mountain crater warp pade", "dmc", "crater", "volcano", "death mountain crater"},
    DMC_LOWER_LOCAL = {"DMC Lower Local", "dmc lower", "crater lower", "volcano lower",
            "dmc", "crater", "volcano", "death mountain crater"},
    GRAVEYARD_WARP_PAD_REGION = {"Graveyard Warp Pad Region", "Graveyard Warp Pad", "GV Warp pad", "graveyard shadow temple",
            "shadow temple entrance", "top of graveyard", "Graveyard", "GV"},
    GRAVEYARD = {"Graveyard", "gy", "kakariko village graveyard", "cemetery"},
    GV_FORTRESS_SIDE = {"Gerudo Valley Fortress Side", "Gerudo valley across the bridge", "gerudo valley tent side",
            "gv fortress side", "gerudo valley", "valley", "gv"},
    GERUDO_VALLEY = {"Gerudo Valley", "valley", "gv"},
    DEATH_MOUNTAIN_SUMMIT = {"Death Mountain Summit", "dms", "death mountain top", "top of death mountain",
            "Death Mountain", "dm", "mountain"},
    DEATH_MOUNTAIN = {"Death Mountain", "dm", "mountain", "lower death mountain"},
    LOST_WOODS_BRIDGE = {"LW Brigde", "Lost Woods Bridge"},
    LOST_WOODS_UNDERWATER_ENTRANCE = {"LW Underwater Entrance", "Lost woods underwater entrance", "lw", "lost woods"},
    TOT_ENTRANCE = {"ToT Entrance", "Temple of Time Entrance", "Outer temple of time", "outside temple of time",
            "outside tot"},
    MARKET = {"Market", "castle town market", "castle market", "city"},
    ZORA_RIVER = {"Zora River", "zoras river", "zora's river", "river"},
    HYRULE_FIELD = {"Hyrule Field", "hf"},
    WASTELAND_NEAR_FORTRESS = {"Wasteland Near Fortress", "Wasteland Fortress Side", "wasteland", "haunted wasteland"},
    WASTELAND_NEAR_COLOSSUS = {"Wasteland Near Colosssus", "Wasteland Colossus Side", "wasteland", "haunted wasteland"},
    ZORAS_DOMAIN = {"Zoras Domain", "Zora Domain", "Zora's domain"},
    ZD_BEHIND_KING_ZORA = {"ZD Behind King Zora", "Zoras Domain Behind King Zora", "Zoras Domain", "Zora Domain", "Zora's Domain"},
    MARKET_ENTRANCE = {"Market Entrance", "Market bridge", "before market"},
    GC_WOODS_WARP = {"GC Woods Warp", "Goron City Woods Warp", "Goron city woods entrance", "Goron city lost woods entrance",
            "Goron City", "GC"},
    GC_DARUNIAS_CHAMBER = {"GC Darunias Chamber", "Darunias Chamber", "darunia's chamber", "darunia's room", "darunias room",
            "Goron City", "GC"},
    GORON_CITY = {"Goron City", "gc"},
    ZR_FRONT = {"ZR Front", "Zoras River Front", "Zora's River Front", "Zora River Front", "Zoras River", "Zora's River",
            "Zora River"},
    ZR_BEHIND_WATERFALL = {"ZR Behind Waterfall", "Zoras River Behind Waterfall", "Zoras River waterfall",
            "Zoras River", "Zora River", "Zora's River"},
    LAKE_HYLIA = {"Lake Hylia", "lake", "hylia lake", "ocean"},
    ZORAS_FOUNTAIN = {"Zoras Fountain", "Zora's Fountain", "zora fountain", "jabu jabu area", "whale area", "fountain"},
    DESERT_COLOSSUS = {"Desert Colossus", "desert"},
    GF_OUTSIDE_GATE = {"GF Outside Gate", "Gerudo Fortress Outside Gate", "gerudo fortress gate", "gf gate",
            "gerudo fortress", "gf"},
    GERUDO_FORTRESS_PLACE = {"Gerudo Fortress", "gf"},
    SFM_ENTRYWAY = {"SFM Entryway", "Sacred Forest Meadow", "sfm"},
    LW_BRIDGE_FROM_FOREST = {"LW Bridge From Forest", "LW Bridge", "Lost Woods Bridge"},
    LON_LON_RANCH = {"Lon Lon Ranch", "llr", "ranch", "farm"},
    KAK_BEHIND_GATE = {"Kak Behind Gate", "Kakariko Behind Gate", "kakariko gate", "kakariko village", "kakariko",
            "mountain village"},
    KAKARIKO_VILLAGE = {"Kakariko Village", "kakariko", "mountain village"},
    CASTLE_GROUNDS = {"Castle Grounds"},
    GERUDO_TRAINING_GROUND_LOBBY = {"Gerudo Training Ground Lobby", "Gerudo's Training Grounds", "Gerudo training grounds",
            "gerudo dungeon", "gerudos training grounds"};




    /* Places, single exit */
    public static String[] COLOSSUS_GREAT_FAIRY_FOUNTAIN = {"Colossus Great Fairy Fountain", "Desert colossus great fairy fountain",
            "desert fairy fountain"},
    KAKARIKO_SHOOTING_GALLERY = {"Kakariko Shooting Gallery", "kakariko bow game", "kakariko shooting game"},
    KF_LINKS_HOUSE = {"KF Links House", "Link's House", "Link House", "Links House", "starting house"},
    MARKET_POTION_SHOP = {"Market Potion Shop"},
    MARKET_MASK_SHOP = {"Market Mask Shop", "mask shop", "happy mask shop"},
    KAK_IMPAS_HOUSE_BACK = {"Kak Impas House Back", "Kakariko Impa's House back", "impa's house back", "cow cage", "house cow"},
    KAK_IMPAS_HOUSE = {"Kak Impas House", "Kakariko impas house", "impas house"},
    MARKET_SHOOTING_GALLERY = {"Market Shooting Gallery", "Market Bow Game", "Market Shooting game"},
    GRAVEYARD_DAMPES_HOUSE = {"Graveyard Dampes House", "dampes house", "dampe's house", "dampe house"},
    OGC_GREAT_FAIRY_FOUNTAIN = {"OGC Great Fairy Fountain", "ganon Great Fairy Fountain", "ganon fairy"},
    KF_SARIAS_HOUSE = {"KF Sarias House", "Sarias house", "Saria's house", "Saria house"},
    KAK_POTION_SHOP = {"Kak Potion Shop Front", "Kak Potion Shop Back", "Kakariko potion shop"},
    MARKET_MAN_IN_GREEN_HOUSE = {"Market Man in Green House"},
    DMT_GREAT_FAIRY_FOUNTAIN = {"DMT Great Fairy Fountain", "death mountain great fairy fountain", "death mountain fairy"},
    KF_MIDOS_HOUSE = {"KF Midos House", "Midos House", "Mido's House", "mido house"},
    MARKET_TREASURE_CHEST_GAME = {"Market Treasure Chest Game", "Treasure chest game", "chest game"},
    KF_HOUSE_OF_TWINS = {"KF House of Twins", "house of twins"},
    GC_SHOP = {"GC Shop", "Goron City Shop", "goron shop"},
    KAK_BAZAAR = {"Kak Bazaar", "Kakariko Bazaar"},
    KAK_WINDMILL = {"Kak Windmill", "Kakariko windmill", "song of storms room", "windmill"},
    DMC_GREAT_FAIRY_FOUNTAIN = {"DMC Great Fairy Fountain", "Crater great fairy fountain", "crater fairy"},
    KAK_CARPENTER_BOSS_HOUSE = {"Kakariko Carpenter Boss House", "Carpenter Boss House"},
    KAK_ODD_MEDICINE_BUILDING = {"Kak Odd Medicine Building", "Odd medicine", "medicine"},
    ZF_GREAT_FAIRY_FOUNTAIN = {"ZF Great Fairy Fountain", "Zora fairy", "fountain fairy", "Zoras fountain great fairy"},
    TEMPLE_OF_TIME = {"Temple of Time", "tot"},
    KF_KOKIRI_SHOP = {"KF Kokiri Shop", "kokiri shop", "forest shop"},
    HC_GREAT_FAIRY_FOUNTAIN = {"HC Great Fairy Fountain", "Castle fairy", "hyrule castle fairy"},
    MARKET_GAURD_HOUSE = {"Market Gaurd House", "Gaurd house", "pot house", "poe house"},
    MARKET_BOMBCHU_BOWLING = {"Market Bombchu Bowling", "bombchu bowling", "bombchu game"},
    KAK_HOUSE_OF_SKULLTULA = {"Kak House of Skulltula", "house of skulltula", "skulltula house", "token house"},
    LLR_STABLES = {"LLR Stables", "Lon Lon Ranch Stable", "Lon Lon Ranch Stables", "stable", "stables"},
    MARKET_BAZAAR = {"Market Bazaar"},
    ZD_SHOP = {"ZD Shop", "Zoras Domain Shop", "Zora shop", "Domain shop", "zora's domain shop"},
    LLR_TALONS_HOUSE = {"LLR Talons House", "talons house", "malons house", "talon's house", "malon's house"},
    MARKET_BOMBCHU_SHOP = {"Market Bombchu Shop", "bombchu shop", "night shop", "back alley shop"},
    LLR_TOWER = {"LLR Tower", "Lon Lon Ranch Tower", "cow tower", "puzzle cow room"},
    LH_FISHING_HOLE = {"LH Fishing Hole", "Lake Hylia Fishing Hole", "Fishing", "fishing hole"},
    KF_KNOW_IT_ALL_HOUSE = {"KF Know It All House", "Know It All House"},
    LH_LAB = {"LH Lab", "Lake Hylia lab", "lake hylia laboratory", "lab", "laboratory", "diving house"},
    GV_CARPENTER_TENT = {"GV Carpenter Tent", "Gerudo Valley Tent", "GV Tent", "tent"},
    ZD_STORMS_GROTTO = {"ZD Storms Grotto", "Zoras domain hole", "zora's domain hole", "zd hole", "zoras domain grotto",
            "zora's domain grotto"},
    GRAVEYARD_DAMPES_GRAVE = {"Graveyard Dampes Grave", "Dampe's grave", "dampes grave", "hookshot grave", "dampe race"},
    KAK_REDEAD_GROTTO = {"Kak Redead Grotto", "Kakariko redead grotto"},
    HF_NEAR_MARKET_GROTTO = {"HF Near Market Grotto", "Near Market Grotto", "market hole", "near market hole", "market grotto"},
    SFM_WOLFOS_GROTTO = {"SFM Wolfos Grotto", "Wolfos Grotto", "Wolfos Hole", "sacred forest meadow gate hole"},
    ZR_FAIRY_GROTTO = {"ZR Fairy Groto", "Zoras River Fairy hole", "zora's river fairy hole", "zora river fairy hole",
    "zora's river fairy grotto", "zoras river fairy grotto", "zora river fairy grotto"},
    HF_COW_GROTTO = {"HF Cow Grotto", "Hyrule field cow grotto"},
    HF_INSIDE_FENCE_GROTTO = {"HF Inside Fence Grotto", "Hyrule Field Inside Fence Grotto", "Hyrule Field Inside Fence Hole"},
    KAK_OPEN_GROTTO = {"Kak Open Grotto", "Kakariko Open Grotto", "kakariko open hole"},
    LW_NEAR_SHORTCUTS_GROTTO = {"LW Near Shortcuts Grotto"},
    HF_OPEN_GROTTO = {"HF Open Grotto", "Hyrule Field Open Grotto", "Hyrule Field Open Hole", "HF open hole"},
    HF_TEKTITE_GROTTO = {"HF Tektite Grotto"},
    HC_STORMS_GROTTO = {"HC Storms Grotto", "castle hole", "courtyard hole", "castle grotto"},
    ZR_OPEN_GROTTO = {"ZR Open Grotto", "ZR open hole", "zoras river open hole", "zoras river open grotto"},
    LH_GROTTO = {"LH Grotto", "Lake Hylia Grotto", "Lake Hylia hole", "owl hole", "owl grotto"},
    GRAVEYARD_ROYAL_FAMILYS_TOMB = {"Graveyard Royal Familys Tomb", "Royal family's tomb", "tomb", "royal tomb", "sun song grave"},
    SFM_STORMS_GROTTO = {"SFM Storms Grotto", "SFM Storms hole"},
    DMC_UPPER_GROTTO = {"DMC Upper Grotto", "DMC Upper Hole"},
    SFM_FAIRY_GROTTO = {"SFM Fairy Grotto", "SFM Fairy Hole"},
    GRAVEYARD_HEART_PIECE_GRAVE = {"Graveyard Heart Piece Grave"},
    GV_STORMS_GROTTO = {"GV Storms Grotto", "Gerudo Valley Storms grotto", "gv tent grotto", "tent hole", "tent grotto"},
    LLR_GROTTO = {"LLR grotto", "LLR hole", "Lon Lon Ranch Grotto", "Lon Lon Ranch Hole"},
    DMC_HAMMER_GROTTO = {"DMC Hammer Grotto", "DMC Hammer Hole"},
    GV_OCTOROK_GROTTO = {"GV Octorok Grotto", "GV Octorok Hole", "Octorok hole", "Octorok grotto"},
    ZR_STORMS_GROTTO = {"ZR Storms Grotto", "Zoras River chicken hole", "Zoras river storms grotto"},
    KF_STORMS_GROTTO = {"KR Storms Grotto", "Kokiri Grotto", "Kokiri Hole", "Kokiri Forest hole", "kokiri forest grotto"},
    HF_SOUTHEAST_GROTTO = {"HF Southeast Grotto", "Hyrule Field Southeast Grotto", "Hyrule Field Southeast hole", "HF southeast hole"},
    DEKU_THEATER = {"Deku Theater", "Forest Stage"},
    HF_FAIRY_GROTTO = {"HF Fairy Grotto", "HF Fairy Hole", "Hyrule Field Fairy Hole", "Hyrule Field Fairy Grotto"},
    GF_STORMS_GROTTO = {"GF Storms Grotto", "Gerudo Fortress hole", "Gerudo Fortress Grotto", "gf grotto", "gf hole"},
    DMT_STORMS_GROTTO = {"DMT Storms Grotto", "DMT Storms hole"},
    LW_SCRUBS_GROTTO = {"LW Scrubs Grotto", "Lost woods scrub grotto", "Lost woods scrub hole", "lw scrubs hole"},
    HF_NEAR_KAK_GROTTO = {"HF Near Kak Grotto", "Near Kakariko Hole", "Near Kakariko Grotto"},
    GC_GROTTO = {"GC Grotto", "Goron City Grotto", "GC hole", "gc grotto"},
    DMT_COW_GROTTO = {"DMT Cow Grotto", "DMT Cow Hole", "Ralphie's hole", "ralphie's hideout", "ralphie hole"},
    COLOSSUS_GROTTO = {"Colossus Grotto", "Colossus hole"},
    GRAVEYARD_SHIELD_GRAVE = {"Graveyard Shield Grave", "Shield Grave", "redead grave"};


    /**
     * Returns a list or map of aliases
      * @param alias which alias type to retrieve
     * @return A list or map of aliases
     */
    public static String[][] getAliases(AliasType alias) {

        switch (alias) {
            case KEYS:
                return keyAliases();
            case ITEMS:
                return itemAliases();
            case SETTINGS:
                return settingsAliases();
            case MULTI_EXIT:
                return getMultiExitMapAliases();
            case SINGLE_EXIT:
                return getSingleExitMapAliases();
        }

        return null;
    }
}
