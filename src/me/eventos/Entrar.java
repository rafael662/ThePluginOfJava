package me.eventos;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Entrar implements Listener {
	
	@EventHandler
	public void aoEntrar(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		e.setJoinMessage("§b§l+ §7§l" + p.getName());
		p.getInventory().clear();
		p.setHealth(20.0);
		p.setFoodLevel(20);
	}

}
