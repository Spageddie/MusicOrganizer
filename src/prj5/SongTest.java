package prj5;
import student.TestCase;
/**
 * Test class for Song object
 * @author Matthew Marquez (mmarquez)
 * @version 2017.11.16
 */
public class SongTest extends TestCase{
    private Song song1;
    /**
     * Sets up test cases
     */
    public void setUp() {
        song1 = new Song("Hi", "me", "1990", "gregorian chant");
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
    

}
