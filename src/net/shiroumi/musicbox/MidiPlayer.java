/**
 * Copyright (C) 2012 shiroumi
 */
package net.shiroumi.musicbox;

import org.bukkit.entity.Player;

/**
 * @author shiroumi
 */
public interface MidiPlayer {

	public void tuneIn(Player player);
	
	public void tuneOut(Player player);
	
	public void stopPlaying();
	
	public boolean isNowPlaying();
	
	public void playNextSong();
	
	public void playSong(String midiName);
	
}
