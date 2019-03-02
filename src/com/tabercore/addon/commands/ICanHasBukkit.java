package com.tabercore.addon.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.samtaber.base.Base;

public class ICanHasBukkit implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		
		if(label.equalsIgnoreCase("icanhasbukkit")) {
			
			player.sendMessage(Base.globalPrefix + "This server is running TaberSpigot version");
			player.sendMessage(Base.globalPrefix + "git-TaberSpigot-21hua47-r1ebf12 (MC: 1.8.8) (Implementing API");
			player.sendMessage(Base.globalPrefix + "version 1.8.8-R1.3.2-SNAPSHOT");
			player.sendMessage(Base.globalPrefix + "Checking version, please wait...");
			player.sendMessage(Base.globalPrefix + "This server is up to date!");
			
		}
		
		return false;
	}

}
