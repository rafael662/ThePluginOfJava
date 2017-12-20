package me.eventos;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class AntiDrop implements Listener {
	
	@EventHandler
	public void aoDropar(PlayerDropItemEvent e) {
		Player p = e.getPlayer();
		if(!(p.hasPermission("kitpvp.drop"))) {
			p.sendMessage("§a§lVoce Não pode Dropar Itens!");
			e.setCancelled(true);		
		} else {
			e.setCancelled(false);
		}
	}

}
