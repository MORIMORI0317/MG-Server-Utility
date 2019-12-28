package com.morimori.mgserverutility.config;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class MGConfig {
	public static Configuration config;
	public static String ServerIp;
	public static String TrayIconURL;
	public static String TrayIconName;
	public static boolean isEffectTray;
	public static boolean isMultibuttun;
	public static int OOD_ID;
	public static int IKISUGI_CURES_ID;

	public static void loadc(FMLPreInitializationEvent event) {
		config = new Configuration(event.getSuggestedConfigurationFile());
		load();
		sync();

		MinecraftForge.EVENT_BUS.register(new MGConfig());

	}

	public static void sync() {
		config.getCategory("general").setComment("The Ikisugi Config");

		OOD_ID = config
				.get("general", "ID", 19419, "Out of Dimension ID")
				.getInt(19419);

		IKISUGI_CURES_ID = config
				.get("general", "ID_IKISUGI", 37, "Ikisugi Cures ID")
				.getInt(37);

		config.getCategory("general_client").setComment("Client Setting Config");

		ServerIp = config
				.get("general_client", "IP", "scp.mgsec.xyz", "SCP Server IP")
				.getString();

		isMultibuttun = config
				.get("general_client", "Effectiveness", false,
						"Whether to display the multi-play button on the title screen.")
				.getBoolean();

		TrayIconURL = config
				.get("general_client", "TrayURL", "https://www.dropbox.com/s/bpq9hkz354gp6we/tray_icon.jpg?dl=1",
						"Toray URL")
				.getString();

		TrayIconName = config
				.get("general_client", "TrayIcon", "tray_icon.png", "Toray Icon")
				.getString();

		isEffectTray = config
				.get("general_client", "TrayEffectiveness", false,
						"Tray Effectiveness")
				.getBoolean();

		if (config.hasChanged())
			save();
	}

	public static void save() {
		config.save();
	}

	public static void load() {
		config.load();
	}

}
