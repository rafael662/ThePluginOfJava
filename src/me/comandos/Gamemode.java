package me.comandos;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] Args) {
		if(!(sender instanceof Player)) {
			return true;
		}
		Player p = (Player)sender;
		if(cmd.getName().equalsIgnoreCase("gm")) {
			if(!(p.hasPermission("kitpvp.gm"))) {
				p.sendMessage("§a§lVoce Não tem Permissão!");
				return true;
			}
		}
		if(Args[0].equalsIgnoreCase("1")) {
			if(p.hasPermission("kitpvp.gm")) {
				p.setGameMode(GameMode.CREATIVE);
				p.sendMessage("§a§lGamemode §7§lAlterado");
				return true;
			}
		}
		if(Args[0].equalsIgnoreCase("0")) {
			if(p.hasPermission("kitpvp.gm")) {
				p.setGameMode(GameMode.SURVIVAL);
				p.sendMessage("§a§lGamemode §7§lAlterado");
				return true;
			}
		}
		return false;
	}

}
