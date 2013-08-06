/**
 * Copyright (C) 2012 shiroumi
 */
package net.shiroumi.musicbox;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * @author shiroumi
 */
public class PlayerListener implements Listener {
	private final MusicBox plugin;
	
	public PlayerListener(final MusicBox plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		
		if (plugin.getMidiPlayer() != null)
			plugin.getMidiPlayer().tuneOut(event.getPlayer());
		
	}
	
}
