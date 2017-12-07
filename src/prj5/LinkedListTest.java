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
    
    /**
     * Sets up test cases
     */
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
    /**
     * Tests size() method
     */
    public void testSize() {
        assertEquals(0, listD.size());
        assertEquals(3, listBinA.size());
    }
    /**
     * Tests clear() method
     */
    public void testClear() {
        assertFalse(listCinA.isEmpty());
        listCinA.clear();
        assertTrue(listCinA.isEmpty());
    }
    /**
     * Tests isEmpty() method
     */
    public void testIsEmpty() {
        assertFalse(listCinA.isEmpty());
        listCinA.clear();
        assertTrue(listCinA.isEmpty());
    }
    /**
     * Tests the add(index) method
     */
    public void testAddIndex() {
        
    }
    /**
     * tests the add() method
     */
    public void testAdd() {
        
    }
    /**
     * Tests the remove method
     */
    public void testRemove() {
        
    }
    /**
     * Tests the remove(index) method
     */
    public void testRemoveIndex() {
        
    }
    /**
     * Tests the get method
     */
    public void testGet() {
        
    }
    /**
     * Tests the contains() method
     */
    public void testContains() {
        
    }
    /**
     * Tests the toString() method
     */
    public void testToString() {
        System.out.println(listCinA.toString());
        System.out.println(listA.toString());
    }
    /**
     * Tests the toArray() method
     */
    public void testToArray() {
        
    }
    /**
     * Tests the equals() method
     */
    public void testEquals() {
        
    }
    /**
     * Tests the swap() method
     */
    public void testSwap() {
        listBinA.swap(0, 1);
        System.out.println(listBinA.toString());
    }
}
