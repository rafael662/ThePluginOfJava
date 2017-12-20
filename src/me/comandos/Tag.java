package me.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Tag implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] Args) {
		if(!(sender instanceof Player)) {
			return true;
		}
		Player p = (Player)sender;
		if(cmd.getName().equalsIgnoreCase("tag")) {
			if(Args.length == 0) {
				p.sendMessage("�a�lUtilize �7�l/Tag Membro,Vip,Coder,Dono,Mod,Trial");
				return true;
			}
		}
		if(Args[0].equalsIgnoreCase("membro")) {
			if(p.hasPermission("tag.membro")) {
				p.setDisplayName("�7�lMEMBRO �7�l" + p.getName());
				p.setPlayerListName("�7�lMEMBRO �7�l" + p.getName());
				return true;
			}
		}
		if(Args[0].equalsIgnoreCase("vip")) {
			if(p.hasPermission("tag.vip")) {
				p.setDisplayName("�a�lVIP �a�l" + p.getName());
				p.setPlayerListName("�a�lVIP �a�l" + p.getName());
				return true;
			}
		}
		if(Args[0].equalsIgnoreCase("coder")) {
			if(p.hasPermission("tag.coder")) {
				p.setDisplayName("�c�lCODER �c�l" + p.getName());
				p.setPlayerListName("�c�lCODER �c�l" + p.getName());
				return true;
			}
		}
		if(Args[0].equalsIgnoreCase("dono")) {
			if(p.hasPermission("tag.dono")) {
				p.setDisplayName("�4�lDONO �4�l" + p.getName());
				p.setPlayerListName("�4�lDONO �4�l" + p.getName());
				return true;
			}
		}
		if(Args[0].equalsIgnoreCase("mod")) {
			if(p.hasPermission("tag.mod")) {
				p.setDisplayName("�5�lMOD �7�l" + p.getName());
				p.setPlayerListName("�5�lMOD �7�l" + p.getName());
				return true;
			}
		}
		if(Args[0].equalsIgnoreCase("trial")) {
			if(p.hasPermission("tag.trial")) {
				p.setDisplayName("�d�lTRIAL �d�l" + p.getName());
				p.setPlayerListName("�d�lTRIAL �d�l" + p.getName());
				return true;
			}
		}
		return false;
	}
	

}
