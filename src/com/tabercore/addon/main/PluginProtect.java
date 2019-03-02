package com.tabercore.addon.main;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import com.tabercore.addon.commands.ICanHasBukkit;



public class PluginProtect extends JavaPlugin{

	public static PluginProtect instance;
	
	public void onEnable() {
		instance = this;
		this.getCommand("icanhasbukkit").setExecutor((CommandExecutor)new ICanHasBukkit());
		
	}
	
	public void onDisable() {
		instance = null;
		
		
	}
	
}
