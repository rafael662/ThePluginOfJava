package me.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.comandos.ClearChat;
import me.comandos.Gamemode;
import me.comandos.Tag;
import me.comandos.Tp;
import me.comandos.Tpall;
import me.eventos.AntiDrop;
import me.eventos.AntiExplosão;
import me.eventos.Entrar;
import util.TagChat;

public class Main extends JavaPlugin {
	
	public static String tag = "§a§lKit§6§lPvP";
	
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
		
		pm.registerEvents(new Entrar(), this);
		pm.registerEvents(new AntiDrop(), this);
		pm.registerEvents(new AntiExplosão(), this);
		pm.registerEvents(new TagChat(), this);
	}
	
	void RegistrarComandos() {
		
		getCommand("gm").setExecutor(new Gamemode());
		getCommand("cc").setExecutor(new ClearChat());
		getCommand("tag").setExecutor(new Tag());
		getCommand("tp").setExecutor(new Tp());
		getCommand("tpall").setExecutor(new Tpall());
	}

}
