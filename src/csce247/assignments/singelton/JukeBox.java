package csce247.assignments.singelton;

import java.util.LinkedList;
import java.util.Queue;
/**
 * JukeBox.java - class that defines the Singleton design pattern
 * @author Nguyen
 *
 */
public class JukeBox {
	private Queue<String> songQueue = new LinkedList<String>();
	/**
	 * privated constructer to make sure only one Jukebox can be instantiated
	 */
	private JukeBox() {
		
	}
	
	private static JukeBox jukebox;
	
	/**
	 * if jukebox is null, jukebox would be instantiated as new JukeBox() and the only one instantiated.
	 * @return
	 */
	public static JukeBox getInstance() {
		if (jukebox==null) {
			jukebox= new JukeBox();
			System.out.println("Initialzing the JukeBox!!! Let's get dancing");
		}
		return jukebox;
	}
	/**
	 * play song and remove from the list
	 */
	public void playNextSong() {
		System.out.println("Let's Jam to " + jukebox.songQueue.element());
		if(songQueue.size()==0)
			System.out.println("No more songs on the list");
		else 
			songQueue.remove(songQueue.element());
		
	}
	/**
	 * get requested song and add on list
	 * @param song
	 */
	public void requestSong(String song) {
		int index = songQueue.size()+1;
		songQueue.add(song);
		System.out.println(song + " is now number " +  index + " on the list");
	}
	/**
	 * check if the list has any more songs. if no, return false, if yes return true.
	 * @return
	 */
	public boolean hasMoreSongs() {
		if (songQueue.isEmpty()){
			return false;
		}
		return true;
	}
	
	public int getSize() {
		return songQueue.size();
	}
}
