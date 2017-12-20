package me.eventos;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class AntiExplosão implements Listener {
	
	@EventHandler
	public void aoExplodir(EntityExplodeEvent e) {
		Player p = (Player) e.getEntity();
		if(!(p.hasPermission("kitpvp.explodir"))) {
			e.setCancelled(true);		
		} else {
			e.setCancelled(false);
		}
	}

}
