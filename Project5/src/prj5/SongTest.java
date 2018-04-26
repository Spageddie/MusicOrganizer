package prj5;

/**
 * Tests the methods in the song class
 * 
 * @author Chanaka Perera(chanaka1)
 * @author Eddie Bolton(eddie5)
 * @version 4.9.2018
 *
 */
public class SongTest extends student.TestCase {

    private Song test;


    /**
     * Sets up the test methods
     */
    public void setUp() {
        test = new Song("test1", "test2", "test3", "test4");
    }


    /**
     * Tests all the getter methods in the song class
     */
    public void testGetter() {
        // Checks whether the getter methods return expected values
        assertEquals(test.getTitle(), "test1");
        assertEquals(test.getArtist(), "test2");
        assertEquals(test.getYear(), "test3");
        assertEquals(test.getGenre(), "test4");
    }


    /**
     * Tests the update methods for the arrays
     */
    public void testUpdates() {
        // Checks whether the setter and getter methods
        // for the integer arrays works as expected
        assertEquals(test.getHeardHobby(0), 0);
        test.updateHeardHobby(0);
        assertEquals(test.getHeardHobby(0), 1);
        test.updateHeardHobby(0);
        assertEquals(test.getHeardHobby(0), 2);
        test.updateHeardRegion(3);
        assertEquals(test.getHeardRegion(3), 1);
        test.updateHeardMajor(4);
        assertEquals(test.getHeardMajor(4), 1);
        test.updateLikedHobby(5);
        assertEquals(test.getLikedHobby(5), 1);
        test.updateLikedMajor(6);
        assertEquals(test.getLikedMajor(6), 1);
        test.updateLikedRegion(7);
        assertEquals(test.getLikedRegion(7), 1);
    }


    /**
     * Checks whether the toString() method of the
     * song class returns the expected output
     */
    public void testToString() {
        String expect = "Song Title: test1\r\n" + "Song Artist: test2\r\n"
            + "Song Genre: test4\r\n" + "Song Year: test3";
        assertEquals(test.toString(), expect);
    }
    
    /**
     * Tests whether the equals method in the song
     * class works as expected
     */
    @SuppressWarnings("unlikely-arg-type")
    public void testEquals() {
        //Test when the parameter is 'this'
        assertTrue(test.equals(test));
        //Test when the parameter is null
        Object obj = null;
        assertFalse(test.equals(obj));
        //Test with an object of a different class
        String not = "defd";
        assertFalse(test.equals(not));
        //Test with objects of the same class
        Song test2 = new Song("test1", "test2", "test3", "test4");
        Song test3 = new Song("test67", "test67", "test3", "test4");
        assertFalse(test.equals(test3));
        assertTrue(test.equals(test2));
    }
    
    /**
     * Test whether the getter methods for
     * the percentages returns the correct value
     */
    public void testPercentageGetters() {
        test.updateHeardHobby(0);
        test.updateHeardHobby(1);
        assertEquals(test.getHeardHobbyPercent(0), 100);
        test.updateHeardHobby(1);
        assertEquals(test.getHeardHobbyPercent(0), 50);
        test.updateHeardHobby(1);
        assertEquals(test.getHeardHobbyPercent(0), 33);
        test.updateHeardMajor(2);
        test.updateHeardMajor(3);
        assertEquals(test.getHeardMajorPercent(2), 100);
        test.updateHeardMajor(3);
        assertEquals(test.getHeardMajorPercent(2), 50);
        assertEquals(test.getHeardRegionPercent(4), 0);
        test.updateHeardRegion(4);
        test.updateHeardRegion(5);
        assertEquals(test.getHeardRegionPercent(4), 100);
        test.updateLikedHobby(6);
        test.updateLikedHobby(7);
        assertEquals(test.getLikedHobbyPercent(6), 100);
        test.updateLikedMajor(4);
        test.updateLikedMajor(5);
        assertEquals(test.getLikedMajorPercent(4), 100);
        test.updateLikedMajor(5);
        assertEquals(test.getLikedMajorPercent(4), 50);
        assertEquals(test.getLikedRegionPercent(0), 0);
        test.updateLikedRegion(0);
        test.updateLikedRegion(1);
        assertEquals(test.getLikedRegionPercent(0), 100);
    }
}
