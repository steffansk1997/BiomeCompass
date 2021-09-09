package com.skblue.biomeCompass.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.skblue.biomeCompass.BiomeCompass;
import com.skblue.biomeCompass.GUI.BiomeInventory;

public class CompassCommand extends AbstractCommand {
	public static BiomeInventory inventory;
	
	public CompassCommand(BiomeCompass plugin) {
		super(plugin, Senders.PLAYER);
		if(inventory == null) {
			inventory = new BiomeInventory();
			plugin.getServer().getPluginManager().registerEvents(inventory, plugin);
		}
	}
	
	@Override
	public boolean handleCommand(CommandSender sender, Command cmd, String Commandlabel, String[] args) {
		final Player player = (Player) sender;
		if(player != null && inventory != null) {
			inventory.openInventory(player);
			return true;
		}
		return false;
	}

}
