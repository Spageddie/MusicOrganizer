package prj5;

import student.TestCase;

/**
 * Test class for Song object
 * 
 * @author Matthew Marquez (mmarquez)
 * @version 2017.11.16
 */
public class SongTest extends TestCase {
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
    public void testSetGenre() {
        song1.setGenre("Trashcan tapping");
        assertEquals("Trashcan tapping", song1.getGenre());
    }


    /**
     * Tests compareTitle() method
     */
    public void testCompareTitle() {
        assertTrue(song1.compareTitle(song2) > 0);
    }


    /**
     * Tests compareArtist() method
     */
    public void testCompareArtist() {
        assertTrue(song1.compareArtist(song2) < 0);
    }


    /**
     * Tests compareGenre() method
     */
    public void testCompareGenre() {
        assertTrue(song1.compareGenre(song2) < 0);
    }


    /**
     * Tests compareYear() method
     */
    public void testCompareYear() {
        assertTrue(song1.compareYear(song2) < 0);
    }
    /**
     * Tests toString() method
     */
    public void testToString() {
        Song song3 =  new Song(
            "title",
            "artist",
            "1000",
            "rock",
            0.5, 0.6, 0.5, 0.7,
            0.9, 0.4, 0.6, 0.4,
            0.9, 0.7, 0.6, 0.2,
            0.4, 0.5, 0.4, 0.6,
            0.85, 0.37, 0.54, 0.2,
            0.8, 0.6, 0.51, 0.05);
        String test = "title artist 1000 rock CS Heard 0.5 CS Like 0.4 "
            + "Math Heard 0.6 Math Like 0.5 Eng Heard 0.5 Eng Like 0.4 "
            + "Other Heard 0.7 Other Like 0.6 SE Heard 0.9 SE Like 0.85 "
            + "NE Heard 0.4 NE Like 0.37 US Heard 0.6 US Like 0.54 "
            + "Out Heard 0.4 Out Like 0.2 Music Heard 0.9 Music Like 0.8 "
            + "Sports Heard 0.7 Sports Like 0.6 Art Heard 0.2 Art Like 0.05 "
            + "Reading Heard 0.6 Reading Like 0.51";
        assertFalse(test.equals(song3.toString()));
    }
}
