package com.skblue.biomeCompass;

import org.bukkit.plugin.java.JavaPlugin;

import com.skblue.biomeCompass.Commands.CompassCommand;

public class BiomeCompass extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("Biome Compass enabled");
		registerCommands();
	}
	
	@Override
	public void onDisable() {
		getLogger().info("Biome Compass disabled");
	}
	
	public void registerCommands() {
		getCommand("bcompass").setExecutor(new CompassCommand(this));
	}
}
