package me.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.main.Main;

public class Tpall implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] Args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage("§c§lVoce Não é um Player");
			return true;
		}
		Player p = (Player)sender;
		if(cmd.getName().equalsIgnoreCase("tpall")) {
			if(p.hasPermission("kitpvp.tpall")) {
				 for (Player s : Bukkit.getOnlinePlayers()) {
						s.teleport(p);
						p.sendMessage(Main.tag + " §7§lVoce foi teleportado para " + p.getDisplayName());
						return true;
				}
			} else {
				return true;
			}
		}
		return false;
	}
	
	

}
