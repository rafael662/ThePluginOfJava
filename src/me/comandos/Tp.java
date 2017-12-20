package me.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.main.Main;

public class Tp implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] Args) {
		   if(!(sender instanceof Player)) {
		       return true;
		      } else {
		       Player p = (Player)sender;
		       if(Label.equalsIgnoreCase("tp")) {
		        if(Args.length == 0) {
		         p.sendMessage("§7§lUtilize /tp <nick>");
		         return true;
		        }
		        for(Player online : Bukkit.getServer().getOnlinePlayers()) {
		         if(!p.hasPermission("kitpvp.tp")) {
		          p.sendMessage(Main.tag);
		          return true;
		         }
		        if(Args[0].equalsIgnoreCase(online.getName())) {
		         if(online.getName() == null) {
		          return true;
		         }
		         p.teleport(online.getLocation());
		         p.sendMessage(Main.tag +"§6Voce Teleportou Para: §7" + online.getName());
		         return true;
		        }
		        
		        
		        }
		       }
		      }
		  return false;
}
}
