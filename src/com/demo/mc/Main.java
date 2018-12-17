package com.demo.mc;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		// TODO Auto-generated method stub
		Bukkit.getPluginCommand("givemeChallenge").setExecutor(this);
		super.onEnable();
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		// TODO Auto-generated method stub
		if(sender instanceof Player) {
			Player player = (Player) sender;
			player.getWorld().spawnEntity(player.getLocation(), EntityType.ENDER_DRAGON);
			player.sendMessage("你的挑战开始了");
		}
		return super.onCommand(sender, command, label, args);
	}

}
