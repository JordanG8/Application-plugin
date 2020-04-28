package me.JordanG8.HelloWorld;


import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Hi staff, I Know how to make plugins, although this one is very simple it is just a proof of concept, i would very much like to be a part of your team!");
	}
	
	@Override
	public void onDisable() {
		
	}
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("ping!")) {
			sender.sendMessage("Pong!");
			}
		return false;
	}

	
}