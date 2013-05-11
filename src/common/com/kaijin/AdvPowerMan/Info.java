/*******************************************************************************
 * Copyright (c) 2012 Yancarlo Ramsey and CJ Bowman
 * Licensed as open source with restrictions. Please see attached LICENSE.txt.
 ******************************************************************************/
package com.kaijin.AdvPowerMan;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Info
{
	// Mod Info
	public static final String VERSION = "@VERSION@";
	//public static final String BUILD_NUMBER = "@BUILD_NUMBER@";
	public static final String DEPENDENCIES = "required-after:IC2@[1.115,);required-after:Forge@[7.7.1.666,)";
	public static final String CLIENT_PROXY = "com.kaijin.AdvPowerMan.ClientProxy";
	public static final String SERVER_PROXY = "com.kaijin.AdvPowerMan.CommonProxy";
	public static final String PACKET_CHANNEL = "kaijinAdvPwrMan"; // CHANNEL MAX 16 CHARS
	public static final String TITLE_PACKED = "AdvancedPowerManagement";
	public static final String TITLE = "Advanced Power Management";
	public static final String TITLE_LOG = "[" + TITLE_PACKED + "] ";

	// Textures
	public static final String TEX_BASE = "/com/kaijin/AdvPowerMan/textures/";
	public static final String GUI_TEX_CHARGING_BENCH  = TEX_BASE + "GUIChargingBench.png";
	public static final String GUI_TEX_BATTERY_STATION = TEX_BASE + "GUIBatteryStation.png";
	public static final String GUI_TEX_STORAGE_MONITOR = TEX_BASE + "GUIStorageMonitor.png";
	public static final String GUI_TEX_EMITTER         = TEX_BASE + "GUIAdvEmitter.png";
	public static final String GUI_TEX_ADJ_TRANSFORMER = TEX_BASE + "GUIAdjustableTransformer.png";

	public static final String[] KEY_BLOCK_NAMES = new String[] {"blockChargingBench1", "blockChargingBench2", "blockChargingBench3",
		"blockEmitterBlock1", "blockEmitterBlock2", "blockEmitterBlock3", "blockAdjustableTransformer", "blockEmitterAdjustable",
		"blockBatteryStation1", "blockBatteryStation2", "blockBatteryStation3", "blockStorageMonitor"};
	public static final String KEY_NAME_SUFFIX = ".name";

	// Blocks
	public static final String CHARGER_NAME = "Charging Bench";
	public static final String DISCHARGER_NAME = "Battery Station";
	public static final String MONITOR_NAME = "Storage Monitor";
	public static final String EMITTER_NAME = "Emitter";
	public static final String ADV_EMITTER_NAME = "Adjustable Emitter";
	public static final String ADJ_TRANSFORMER_NAME = "Adjustable Transformer";

	// Items
	public static final String TOOLKIT_NAME = CHARGER_NAME + " Toolkit";
	public static final String COMPONENTS_NAME = CHARGER_NAME + " Components";

	public static final String LINK_CARD_NAME = "Energy Link Card";
	public static final String LINK_CREATOR_NAME = "Energy Link Card (Blank)";

	// GUI IDs
	public static final int GUI_ID_CHARGING_BENCH = 1;
	public static final int GUI_ID_BATTERY_STATION = 2;
	public static final int GUI_ID_STORAGE_MONITOR = 3;
	public static final int GUI_ID_ADJUSTABLE_EMITTER = 4;
	public static final int GUI_ID_ADJUSTABLE_TRANSFORMER = 5;

	// Other constants for use in multiple classes
	public static final int LAST_META_VALUE = 11;

	public static final int CB_META = 0; // through 2
	// 3-5 are unused
	public static final int AT_META = 6;
	public static final int AE_META = 7;
	public static final int BS_META = 8; // through 10
	public static final int SM_META = 11;

	public static final int CB_SLOT_INPUT = 0;
	public static final int CB_SLOT_OUTPUT = 1;
	public static final int CB_SLOT_POWER_SOURCE = 2;
	public static final int CB_SLOT_CHARGING = 3;
	public static final int CB_SLOT_UPGRADE = 15;

	public static final int BS_SLOT_INPUT = 0;
	public static final int BS_SLOT_OUTPUT = 1;
	public static final int BS_SLOT_POWER_START = 2;

	public static final int SM_SLOT_UNIVERSAL = 0;

	public static final int CB_INVENTORY_SIZE = 19;
	public static final int BS_INVENTORY_SIZE = 14;
	public static final int SM_INVENTORY_SIZE = 1;

	public static final int AE_MIN_PACKET = 4;
	public static final int AE_MAX_PACKET = 2048;
	public static final int AE_MIN_OUTPUT = 1;
	public static final int AE_MAX_OUTPUT = 32768;
	public static final int AE_PACKETS_TICK = 64;

	// GUI strings
	public static final String KEY_TITLE = "AdvPwrMan.title";
	public static final String KEY_EU = "AdvPwrMan.misc.EU";
	public static final String KEY_IN = "AdvPwrMan.misc.in";
	public static final String KEY_OUT = "AdvPwrMan.misc.out";
	public static final String KEY_CHARGER_MAX = "AdvPwrMan.charger.maxEU";
	public static final String KEY_CHARGER_REQ = "AdvPwrMan.charger.requiredEU";
	public static final String KEY_CHARGER_PWR = "AdvPwrMan.charger.redstonePower";
	public static final String KEY_CHARGER_ETC = "AdvPwrMan.charger.estimatedTime";
	public static final String KEY_CHARGER_AVG = "AdvPwrMan.charger.averageInput";
	public static final String KEY_EMITTER_PACKET = "AdvPwrMan.emitter.packet";
	public static final String KEY_EMITTER_OUTPUT = "AdvPwrMan.emitter.output";
	public static final String KEY_TRANSFORMER_OUTPUT = "AdvPwrMan.transformer.limit";
	public static final String KEY_MONITOR_INVALID = "AdvPwrMan.monitor.invalid";
	public static final String KEY_MONITOR_UPPER = "AdvPwrMan.monitor.upper";
	public static final String KEY_MONITOR_LOWER = "AdvPwrMan.monitor.lower";
	public static final String KEY_DISCHARGER_MODE_LINE1 = "AdvPwrMan.station.modeline1";
	public static final String KEY_DISCHARGER_MODE_LINE2 = "AdvPwrMan.station.modeline2";
	public static final String KEY_STATS_AVERAGE_EU = "AdvPwrMan.station.average";
	public static final String KEY_STATS_TIME_REMAINING = "AdvPwrMan.station.remaining";
	public static final String KEY_STATS_DISPLAY_DAYS = "AdvPwrMan.station.led.days";
	public static final String KEY_STATS_DISPLAY_UNKNOWN = "AdvPwrMan.station.led.unknown";
	public static final String KEY_STATS_AVERAGE_INPUT = "AdvPwrMan.station.packetIn";
	public static final String KEY_EU_BUFFERED = "AdvPwrMan.station.EUbuffered";

	public static final String AE_PACKET_RANGE = "[" + AE_MIN_PACKET + " - " + AE_MAX_PACKET + "]";
	public static final String AE_OUTPUT_RANGE = "[" + AE_MIN_OUTPUT + " - " + AE_MAX_OUTPUT + "]";

	public static final String[] KEY_DIRECTION_NAMES = {"AdvPwrMan.dir.down", "AdvPwrMan.dir.up", "AdvPwrMan.dir.north", "AdvPwrMan.dir.south", "AdvPwrMan.dir.west", "AdvPwrMan.dir.east"};

	// Some global variables
	public static boolean isDebugging;

	public static int ic2WrenchID;
	public static int ic2ElectricWrenchID;

	// For returning charging benches and deconstructing them
	public static ItemStack componentCopperCable;
	public static ItemStack componentGoldCable;
	public static ItemStack componentIronCable;
	public static ItemStack componentBatBox;
	public static ItemStack componentMFE;
	public static ItemStack componentMFSU;
	public static ItemStack componentCircuit;

	// For internal reference to verify items can be placed in inventory.
	public static ItemStack ic2overclockerUpg;
	public static ItemStack ic2transformerUpg;
	public static ItemStack ic2storageUpg;

	// Icons for GUI slots
	public static Icon iconSlotChargeable;
	public static Icon iconSlotDrainable;
	public static Icon iconSlotInput;
	public static Icon iconSlotOutput;
	public static Icon iconSlotMachineUpgrade;
	public static Icon iconSlotLinkCard;
	public static Icon[] iconSlotPowerSource;
	public static Icon[] iconSlotPlayerArmor;

	public static void registerTranslations()
	{
		LanguageRegistry lang = LanguageRegistry.instance();

		lang.addStringLocalization(KEY_BLOCK_NAMES[0] + KEY_NAME_SUFFIX, "LV " + CHARGER_NAME);
		lang.addStringLocalization(KEY_BLOCK_NAMES[1] + KEY_NAME_SUFFIX, "MV " + CHARGER_NAME);
		lang.addStringLocalization(KEY_BLOCK_NAMES[2] + KEY_NAME_SUFFIX, "HV " + CHARGER_NAME);

		lang.addStringLocalization(KEY_BLOCK_NAMES[3] + KEY_NAME_SUFFIX, "LV " + EMITTER_NAME);
		lang.addStringLocalization(KEY_BLOCK_NAMES[4] + KEY_NAME_SUFFIX, "MV " + EMITTER_NAME);
		lang.addStringLocalization(KEY_BLOCK_NAMES[5] + KEY_NAME_SUFFIX, "HV " + EMITTER_NAME);

		lang.addStringLocalization(KEY_BLOCK_NAMES[6] + KEY_NAME_SUFFIX, ADJ_TRANSFORMER_NAME);

		lang.addStringLocalization(KEY_BLOCK_NAMES[7] + KEY_NAME_SUFFIX, ADV_EMITTER_NAME);

		lang.addStringLocalization(KEY_BLOCK_NAMES[8] + KEY_NAME_SUFFIX, "LV " + DISCHARGER_NAME);
		lang.addStringLocalization(KEY_BLOCK_NAMES[9] + KEY_NAME_SUFFIX, "MV " + DISCHARGER_NAME);
		lang.addStringLocalization(KEY_BLOCK_NAMES[10] + KEY_NAME_SUFFIX, "HV " + DISCHARGER_NAME);

		lang.addStringLocalization(KEY_BLOCK_NAMES[11] + KEY_NAME_SUFFIX, MONITOR_NAME);

		lang.addStringLocalization(KEY_DIRECTION_NAMES[0], "Down");
		lang.addStringLocalization(KEY_DIRECTION_NAMES[1], "Up");
		lang.addStringLocalization(KEY_DIRECTION_NAMES[2], "North");
		lang.addStringLocalization(KEY_DIRECTION_NAMES[3], "South");
		lang.addStringLocalization(KEY_DIRECTION_NAMES[4], "West");
		lang.addStringLocalization(KEY_DIRECTION_NAMES[5], "East");

		lang.addStringLocalization("item.benchTools.toolkit.name", TOOLKIT_NAME);
		lang.addStringLocalization("item.benchTools.LV-kit.name", "LV " + COMPONENTS_NAME);
		lang.addStringLocalization("item.benchTools.MV-kit.name", "MV " + COMPONENTS_NAME);
		lang.addStringLocalization("item.benchTools.HV-kit.name", "HV " + COMPONENTS_NAME);

		LanguageRegistry.addName(AdvancedPowerManagement.itemStorageLinkCard, LINK_CARD_NAME);
		LanguageRegistry.addName(AdvancedPowerManagement.itemStorageLinkCardCreator, LINK_CREATOR_NAME);

		lang.addStringLocalization(KEY_TITLE, TITLE);

		lang.addStringLocalization(KEY_EU, "EU");
		lang.addStringLocalization(KEY_IN, "In");
		lang.addStringLocalization(KEY_OUT, "Out");

		// GUI strings
		lang.addStringLocalization(KEY_CHARGER_MAX, "Max");
		lang.addStringLocalization(KEY_CHARGER_REQ, "Req");
		lang.addStringLocalization(KEY_CHARGER_PWR, "Pwr");
		lang.addStringLocalization(KEY_CHARGER_ETC, "ETC");
		lang.addStringLocalization(KEY_CHARGER_AVG, "Avg. EU/t In");
		lang.addStringLocalization(KEY_EMITTER_PACKET, "Packet size (Voltage)");
		lang.addStringLocalization(KEY_EMITTER_OUTPUT, "Output / Tick (Max 64 Packets)");
		lang.addStringLocalization(KEY_TRANSFORMER_OUTPUT, "Transfer Rate (Max 64 Packets)");
		lang.addStringLocalization(KEY_MONITOR_INVALID, "No Valid Link");
		lang.addStringLocalization(KEY_MONITOR_UPPER, "Upper Threshold (Off)");
		lang.addStringLocalization(KEY_MONITOR_LOWER, "Lower Threshold (On)");
		lang.addStringLocalization(KEY_DISCHARGER_MODE_LINE1, "Only when");
		lang.addStringLocalization(KEY_DISCHARGER_MODE_LINE2, "required");
		lang.addStringLocalization(KEY_STATS_AVERAGE_EU, "Avg. EU/t");
		lang.addStringLocalization(KEY_STATS_TIME_REMAINING, "Remaining");
		lang.addStringLocalization(KEY_STATS_DISPLAY_DAYS, " DAYS");
		lang.addStringLocalization(KEY_STATS_DISPLAY_UNKNOWN, "UNKNOWN");
		lang.addStringLocalization(KEY_STATS_AVERAGE_INPUT, "Avg. Pkt In");
		lang.addStringLocalization(KEY_EU_BUFFERED, "EU Buffered");
	}
}
