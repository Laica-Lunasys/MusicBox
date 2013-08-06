/**
 * Copyright (C) 2012 shiroumi
 */
package net.shiroumi.musicbox;

import javax.sound.midi.Track;

/**
 * @author shiroumi
 */
public class MidiTrack {

	private final OldMidiPlayer player;
	private final Track track;
	
	private int event = 0;
	
	public MidiTrack(OldMidiPlayer player, Track track) {
		this.player = player;
		this.track = track;
	}
	
	public void nextTick(float currentTick) {
				
		for (; (event < (track.size() - 1)) && (track.get(event).getTick() <= currentTick); event++) {
			player.onMidiMessage(track.get(event).getMessage());
		}
		
	}
	
}
