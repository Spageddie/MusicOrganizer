package prj5;

import student.TestCase;
/**
 * Tests the response object
 * @author Matthew Marquez (mmarquez)
 * @version 2017.12.06
 */
public class ResponseTest extends TestCase {
    private Response response;

    /**
     * Sets up the test cases
     */
    public void setUp() {
        LinkedList list = new LinkedList();
        list.add("Yes");
        list.add("No");
        list.add("No");
        LinkedList list2 = new LinkedList();
        list2.add("No");
        list2.add("Yes");
        list2.add("Yes");
        response = new Response("1", "10/27/2017", "Math", "Art", "NorthWest",
            list, list2);
    }

    /**
     * Tests the getId() method
     */
    public void testGetId() {
        assertEquals("1", response.getId());
    }

    /**
     * Tests the getDate() method
     */
    public void testGetDate() {
        assertEquals("10/27/2017", response.getDate());
    }

    /**
     * Tests the getMajor() method
     */
    public void testGetMajor() {
        assertEquals("Math", response.getMajor());
    }

    /**
     * Tests the getHobby() method
     */
    public void testGetHobby() {
        assertEquals("Art", response.getHobby());
    }

    /**
     * Tests the getRegion() method
     */
    public void testGetRegion() {
        assertEquals("NorthWest", response.getRegion());
    }

    /**
     * Tests the getHeardSongList() method
     */
    public void testGetHeardSongList() {
        LinkedList list = new LinkedList();
        list.add("Yes");
        list.add("No");
        list.add("No");
        assertTrue(list.equals(response.getHeardSongList()));
    }

    /**
     * Tests the getLkesSongList() method
     */
    public void testGetLikesSongList() {
        LinkedList list2 = new LinkedList();
        list2.add("No");
        list2.add("Yes");
        list2.add("Yes");
        assertTrue(list2.equals(response.getLikesSongList()));
    }

    /**
     * Tests the toString method
     */
    public void testToString() {
        String test =
            "1 10/27/2017 Math Art NorthWest {Yes, No, No} {No, Yes, Yes}";
        assertEquals(test, response.toString());
    }

}
