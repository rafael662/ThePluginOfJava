package me.eventos;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Entrar implements Listener {
	
	@EventHandler
	public void aoEntrar(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		e.setJoinMessage("§b§l+ §7§l" + p.getName());
		p.getInventory().clear();
		p.setHealth(20.0);
		p.chat("/tag membro");
		
		ItemStack kits = new ItemStack(Material.CHEST);
		ItemMeta kitsm = kits.getItemMeta();
		kitsm.setDisplayName("§c§lKits");
		kits.setItemMeta(kitsm);
		
		ItemStack warps = new ItemStack(Material.COMPASS);
		ItemMeta warpsm = warps.getItemMeta();
		warpsm.setDisplayName("§6§lWarps");
		warps.setItemMeta(warpsm);
		
		ItemStack loja = new ItemStack(Material.DIAMOND);
		ItemMeta lojam = loja.getItemMeta();
		lojam.setDisplayName("§b§lLoja");
		loja.setItemMeta(lojam);
		
		ItemStack xpdiario = new ItemStack(Material.EXP_BOTTLE);
		ItemMeta xpdiariom = xpdiario.getItemMeta();
		xpdiariom.setDisplayName("§a§lXpDiario");
		xpdiario.setItemMeta(xpdiariom);
		
		ItemStack comprarkit = new ItemStack(Material.ANVIL);
		ItemMeta comprarkitm = comprarkit.getItemMeta();
		comprarkitm.setDisplayName("§a§lComprarKit");
		comprarkit.setItemMeta(comprarkitm);
		
		ItemStack vidro1 = new ItemStack(Material.STAINED_GLASS_PANE);
		ItemMeta vidro1m = vidro1.getItemMeta();
		vidro1m.setDisplayName("§a§lVIDRO");
		vidro1.setItemMeta(vidro1m);
		
		ItemStack vidro2 = new ItemStack(Material.STAINED_GLASS_PANE);
		ItemMeta vidro2m = vidro2.getItemMeta();
		vidro2m.setDisplayName("§a§lVIDRO");
		vidro2.setItemMeta(vidro2m);
		
		ItemStack vidro3 = new ItemStack(Material.STAINED_GLASS_PANE);
		ItemMeta vidro3m = vidro3.getItemMeta();
		vidro3m.setDisplayName("§a§lVIDRO");
		vidro3.setItemMeta(vidro3m);
		
		ItemStack vidro4 = new ItemStack(Material.STAINED_GLASS_PANE);
		ItemMeta vidro4m = vidro4.getItemMeta();
		vidro4m.setDisplayName("§a§lVIDRO");
		vidro4.setItemMeta(vidro4m);
		
		
		p.getInventory().setItem(4, kits);
		p.getInventory().setItem(0, warps);
		p.getInventory().setItem(8, loja);
		p.getInventory().setItem(3, xpdiario);
		p.getInventory().setItem(5, comprarkit);
		p.getInventory().setItem(1, vidro1);
		p.getInventory().setItem(2, vidro2);
		p.getInventory().setItem(6, vidro3);
		p.getInventory().setItem(7, vidro4);
	}

}
