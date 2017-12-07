package prj5;
import student.TestCase;
/**
 * Test class for Song object
 * @author Matthew Marquez (mmarquez)
 * @version 2017.11.16
 */
public class SongTest extends TestCase{
    private Song song1;
    private Song song2;
    /**
     * Sets up test cases
     */
    public void setUp() {
        song1 = new Song("Hi", "me", "1990", "gregorian chant");
        song2 = new Song("BOO", "you", "2017", "rock");
    }
    /**
     * Tests getTitle() method
     */
    public void testGetTitle() {
        assertEquals("Hi", song1.getTitle());
    }
    /**
     * Tests getArtist() method
     */
    public void testGetArtist() {
        assertEquals("me", song1.getArtist());
    }
    /**
     * Tests getYear() method
     */
    public void testGetYear() {
        assertEquals("1990", song1.getYear());
    }
    /**
     * Tests getGenre() method
     */
    public void testGetGenre() {
        assertEquals("gregorian chant", song1.getGenre());
    }
    /**
     * Tests setArtist() method
     */
    public void testSetArtist() {
        song1.setArtist("you");
        assertEquals("you", song1.getArtist());
    }
    /**
     * Tests setYear() method
     */
    public void testSetYear() {
        song1.setYear("3000");
        assertEquals("3000", song1.getYear());
    }
    /**
     * Tests setTitle() method
     */
    public void testSetTitle() {
        song1.setTitle("Pacman");
        assertEquals("Pacman", song1.getTitle());
    }
    /**
     * Tests setGenre() method
     */
    public void testSetGenre(){
        song1.setGenre("Trashcan tapping");
        assertEquals("Trashcan tapping", song1.getGenre());
    }
    public void testCompareTitle() {
        assertTrue(song1.compareTitle(song2)>0);
    }
    public void testCompareArtist() {
        assertTrue(song1.compareArtist(song2)<0);
    }
    public void testCompareGenre() {
        assertTrue(song1.compareGenre(song2)<0);
    }
    public void testCompareYear() {
        assertTrue(song1.compareYear(song2)<0);
    }
    

}
