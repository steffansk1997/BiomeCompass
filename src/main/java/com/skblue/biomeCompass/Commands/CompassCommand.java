package com.skblue.biomeCompass.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import com.skblue.biomeCompass.BiomeCompass;

public class CompassCommand extends AbstractCommand {

	public CompassCommand(BiomeCompass plugin) {
		super(plugin, Senders.PLAYER);
	}
	
	@Override
	public boolean handleCommand(CommandSender sender, Command cmd, String Commandlabel, String[] args) {
		return false;
	}

}
