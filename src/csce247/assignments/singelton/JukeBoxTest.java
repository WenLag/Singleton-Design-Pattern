package csce247.assignments.singelton;
/**
 * JukeBoxTest.java- J-Unit test cases for JukeBox.java
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;


class JukeBoxTest {
	
	
	@BeforeClass
	public static void oneTimeSetup() {
		
	}
	
	@AfterClass
	public static void oneTimeTearDown() {
		
	}
	
	@Before
	public static void setup() {
		//runs before each test
	}
	
	@After
	public static void tearDown() {
		
	}
	
	@Test
	public void testJukeboxNotEmpty() {
		JukeBox jb = JukeBox.getInstance();
		jb.requestSong("The ABCs");
		boolean fact = jb.hasMoreSongs();
		assertEquals(true,fact);
	}
	
	@Test
	public void testJukeBoxEmpty() {
		JukeBox jb = JukeBox.getInstance();
		boolean fact = jb.hasMoreSongs();
		assertEquals(false,fact);
		
	}
	
	@Test
	public void testIfNotNull() {
		JukeBox jb = JukeBox.getInstance();
		assertNotNull(jb);
	}
	
	@Test
	public void testsize() {
		JukeBox jb = JukeBox.getInstance();
		jb.requestSong("Head Sholders Knees and Toes");
		jb.requestSong("Twinkle Twinkle Little Star");
		jb.requestSong("If you're happy and you know it");
		int fact = jb.getSize()+1;
		assertEquals(4,fact);
	}
	@Test
	public void testSizeAfterRemoving() {
		JukeBox jb = JukeBox.getInstance();
		jb.requestSong("Head Sholders Knees and Toes");
		jb.playNextSong();
		int facts = jb.getSize();
		System.out.println(facts);
		
		assertEquals(0,facts);
	}
	
	@Test
	public void PlayingWithNothingInList() {
		JukeBox jb = JukeBox.getInstance();
		if (jb.getSize()<=0) {
			assertTrue(jb.hasMoreSongs());
		}
	}
	
	public void WhenNoSize() {
		JukeBox jb = JukeBox.getInstance();
		boolean fact = true;
		if(jb.getSize()==0) {
			fact = jb.hasMoreSongs();
		}
		assertEquals(false,fact);
	}
	
	

}
