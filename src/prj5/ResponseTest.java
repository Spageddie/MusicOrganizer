package prj5;
import student.TestCase;
public class ResponseTest extends TestCase{
    private Response response;
    public void setUp() {
        LinkedList list = new LinkedList();
        list.add("Yes");
        list.add("No");
        list.add("No");
        LinkedList list2 = new LinkedList();
        list2.add("No");
        list2.add("Yes");
        list2.add("Yes");
        response = new Response("1", "10/27/2017", "Math", "Art", 
            "NorthWest", list, list2);
    }
    public void testGetId() {
        assertEquals("1", response.getId());
    }
    public void testGetDate() {
        assertEquals("10/27/2017", response.getDate());
    }
    public void testGetMajor() {
        assertEquals("Math", response.getMajor());
    }
    public void testGetHobby() {
        assertEquals("Art", response.getHobby());
    }
    public void testGetRegion() {
        assertEquals("NorthWest", response.getRegion());
    }
    public void testGetHeardSongList() {
        LinkedList list = new LinkedList();
        list.add("Yes");
        list.add("No");
        list.add("No");
        assertTrue(list.equals(response.getHeardSongList()));
    }
    public void testGetLikesSongList() {
        LinkedList list2 = new LinkedList();
        list2.add("No");
        list2.add("Yes");
        list2.add("Yes");
        assertTrue(list2.equals(response.getLikesSongList()));
    }
    public void testToString() {
        String test = "1 10/27/2017 Math Art NorthWest {Yes, No, No} {No, Yes, Yes}";
        assertEquals(test, response.toString());
    }

}
