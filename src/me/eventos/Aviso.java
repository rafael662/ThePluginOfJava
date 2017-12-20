package me.eventos;

import org.bukkit.craftbukkit.v1_8_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_8_R1.ChatSerializer;
import net.minecraft.server.v1_8_R1.EnumTitleAction;
import net.minecraft.server.v1_8_R1.IChatBaseComponent;
import net.minecraft.server.v1_8_R1.PacketPlayOutTitle;
import net.minecraft.server.v1_8_R1.PlayerConnection;

public class Aviso {
	
	public static void sendTitle(Player player, String titulo, String mensagem, int fadeIn, int stay, int fadeOut)
	  {
	    CraftPlayer craftplayer = (CraftPlayer)player;
	    PlayerConnection connection = craftplayer.getHandle().playerConnection;
	    IChatBaseComponent titleJSON = ChatSerializer.a("{'text': '" + titulo + 
	      "'}");
	    IChatBaseComponent subtitleJSON = ChatSerializer.a("{'text': '" + 
	      mensagem + "'}");
	    PacketPlayOutTitle titlePacket = new PacketPlayOutTitle(
	      EnumTitleAction.TITLE, titleJSON, fadeIn, stay, fadeOut);
	    PacketPlayOutTitle subtitlePacket = new PacketPlayOutTitle(
	      EnumTitleAction.SUBTITLE, subtitleJSON);
	    connection.sendPacket(titlePacket);
	    connection.sendPacket(subtitlePacket);
	  }
	}
