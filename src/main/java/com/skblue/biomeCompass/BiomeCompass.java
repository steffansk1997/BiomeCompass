package com.skblue.biomeCompass;

import org.bukkit.plugin.java.JavaPlugin;

import com.skblue.biomeCompass.Commands.CompassCommand;

public class BiomeCompass extends JavaPlugin {
	
	public static BiomeCompass instance;
	
	@Override
	public void onEnable() {
		instance = this;
		getLogger().info("Biome Compass enabled");
		registerCommands();
	}
	
	@Override
	public void onDisable() {
		instance = null;
		getLogger().info("Biome Compass disabled");
	}
	
	public void registerCommands() {
		getCommand("bcompass").setExecutor(new CompassCommand(this));
	}
}
