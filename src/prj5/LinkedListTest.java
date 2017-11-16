package prj5;
/**
 * Test class for LinkedList 

 * @author Matthew Marquez (mmarquez)
 * @version 2015.11.15
 *
 */
import student.TestCase;
public class LinkedListTest extends TestCase{
    private LinkedList<LinkedList> listA;
    private LinkedList<String> listBinA;
    private LinkedList<String> listCinA;
    private LinkedList<String> listD;
    
    public void setUp() {
        listA = new LinkedList<LinkedList>();
        listBinA = new LinkedList<String>();
        listCinA = new LinkedList<String>();
        listD = new LinkedList<String>();
        
        listBinA.add("Hello");
        listBinA.add("Fun");
        listBinA.add("Bye");
        
        listCinA.add("Games");
        listCinA.add("TV");
        listCinA.add("Comics");
        
        listA.add(listBinA);
        listA.add(listCinA);
    }
    public void testSize() {
        assertEquals(0, listD.size());
        assertEquals(3, listBinA.size());
    }
    public void testClear() {
        assertFalse(listCinA.isEmpty());
        listCinA.clear();
        assertTrue(listCinA.isEmpty());
    }
    public void testIsEmpty() {
        
    }
    public void testAddIndex() {
        
    }
    public void testAdd() {
        
    }
    public void testRemove() {
        
    }
    public void testRemoveIndex() {
        
    }
    public void testGet() {
        
    }
    public void testContains() {
        
    }
    public void testToString() {
        System.out.println(listCinA.toString());
        System.out.println(listA.toString());
    }
    public void testToArray() {
        
    }
    public void testEquals() {
        
    }
}
