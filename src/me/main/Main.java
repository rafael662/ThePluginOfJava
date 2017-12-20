package me.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static String tag = "§a§lClose§6§lPvP";
	public static String tag2 = "§c§lClose2";
	
	public static Main instance;
	public static Main getinstance() {
		return instance;
	}
	
	public void onEnable() {
		RegistrarEventos();
		RegistrarComandos();
		Bukkit.getServer().getConsoleSender().sendMessage("§a§lPlugin Iniciado com Sucesso By: Rafael662 & NycollasDev");
	}
	
	public void onDisable() {
		Bukkit.getServer().getConsoleSender().sendMessage("§a§lPlugin Desativado com Sucesso By: Rafael662 & NycollasDev");
	}
	
	void RegistrarEventos() {
		PluginManager pm = Bukkit.getPluginManager();
	}
	
	void RegistrarComandos() {
		
	}

}
