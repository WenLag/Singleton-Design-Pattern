package csce247.assignments.singelton;

public class MusicDriver {
/**
 * MusicDriver.java - Main class to implements the Singleton Design Pattern
 * @param args
 */
	public static void main(String[] args) {
		JukeBox jukeBox = JukeBox.getInstance();
		
		System.out.println();
		
		jukeBox.requestSong("The ABCs");
		jukeBox.requestSong("Head Sholders Knees and Toes");
		jukeBox.requestSong("Twinkle Twinkle Little Star");
		jukeBox.requestSong("If you're happy and you know it");
		
		System.out.println();
		
		/**
		 * while loop - play next song on the list while there are still songs on the list
		 */
		while(jukeBox.hasMoreSongs()) {
			jukeBox.playNextSong();
		}
	}
}
