package com.morimori.mgserverutility.config;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class MGConfig {
	public static Configuration config;
	public static String ServerIp;
	public static int OOD_ID;

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

		config.getCategory("general_client").setComment("Client Setting Config");

		ServerIp = config
				.get("general_client", "IP", "scp.mgsv.xyz", "SCP Server IP")
				.getString();

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
