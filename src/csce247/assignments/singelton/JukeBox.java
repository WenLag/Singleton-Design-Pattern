package csce247.assignments.singelton;

import java.util.LinkedList;
import java.util.Queue;

public class JukeBox {
	private Queue<String> songQueue = new LinkedList();
	private JukeBox() {
		
	}
	private static JukeBox jukebox;
	
	public static JukeBox getInstance() {
		if (jukebox==null) {
			jukebox= new JukeBox();
			System.out.println("Initialzing the JukeBox!!! Let's get dancing");
		}
		return jukebox;
	}
	
	public void playNextSong() {
		System.out.println("Let's Jam to" + jukebox.songQueue.element());
		songQueue.remove(songQueue.element());
	}
	public void requestSong(String song) {
		songQueue.add(song);
		System.out.println(song + " is now number " );
	}
	public boolean hasMoreSongs() {
		return songQueue.isEmpty();
	}
	
}
