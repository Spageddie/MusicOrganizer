package prj5;

/**
 * This class tests the method in the
 * linked list class
 * 
 * @author Chanaka Perera(chanaka1)
 * @version 4.22.2018
 *
 */
public class LinkedListTest extends student.TestCase {

    private LinkedList<String> list;


    /**
     * Sets up the test method for
     * the linked list class and its'
     * method
     */
    public void setUp() {
        list = new LinkedList<String>();
    }


    /**
     * This method tests the clear method
     * in the linked List class
     */
    public void testClear() {
        // Start with an empty list
        assertTrue(list.isEmpty());
        list.add("one");
        // Check whether list is empty after
        // adding
        assertFalse(list.isEmpty());
        // Check whether the list is empty
        // after clearing
        list.clear();
        assertTrue(list.isEmpty());
    }


    /**
     * This method tests the add method in the
     * linked list class
     */
    public void testAdd() {
        // Tests whether the add method works on
        // an empty list
        list.add(0, "one");
        assertEquals(list.getAt(0), "one");
        assertEquals(list.size(), 1);
        // Checks whether the add method throws an exception
        // if index is out of bounds
        Exception exception = null;
        try {
            list.add(5, "two");
        }
        catch (Exception e) {
            exception = e;
        }
        assertTrue(exception instanceof IndexOutOfBoundsException);
        // Checks whether add method works on other
        // indexes
        list.add(1, "two");
        assertEquals(list.getAt(1), "two");
        list.add(2, "three");
        assertEquals(list.getAt(2), "three");
        // Check whether the add method works for the middle
        // of the linked list and other entries are shifted
        list.add(1, "four");
        assertEquals(list.getAt(1), "four");
        assertEquals(list.getAt(2), "two");
        assertEquals(list.getAt(3), "three");
        assertEquals(list.size(), 4);
        // Check whether the default add method adds an entry to
        // the end of the list
        list.add("five");
        assertEquals(list.getAt(4), "five");
        assertEquals(list.size(), 5);
    }


    /**
     * Tests whether the swap method in the linked
     * list class works as expected
     */
    public void testSwap() {
        list.add("zero");
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        // Checks whether the swap method throws an exception
        // when the indexes are invalid
        Exception exception = null;
        try {
            list.swap(0, 23);
        }
        catch (Exception e) {
            exception = e;
        }
        assertTrue(exception instanceof IndexOutOfBoundsException);

        try {
            list.swap(23, 0);
        }
        catch (Exception e) {
            exception = e;
        }
        assertTrue(exception instanceof IndexOutOfBoundsException);

        try {
            list.swap(23, 23);
        }
        catch (Exception e) {
            exception = e;
        }
        assertTrue(exception instanceof IndexOutOfBoundsException);

        // Tests the method for valid indexes
        assertEquals(list.getAt(3), "three");
        assertEquals(list.getAt(4), "four");
        list.swap(3, 4);
        assertEquals(list.getAt(3), "four");
        assertEquals(list.getAt(4), "three");
    }


    /**
     * Tests whether the getAt() method in the linked
     * list last throws an exception for an invalid
     * index
     */
    public void testGetAt() {
        Exception exception = null;
        try {
            list.getAt(0);
        }
        catch (Exception e) {
            exception = e;
        }
        assertTrue(exception instanceof IndexOutOfBoundsException);
    }


    /**
     * Tests whether the toString() method in the linked
     * list class works as expected
     */
    public void testToString() {
        list.add("zero");
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        String expected = "[zero, one, two, three, four]";
        assertEquals(list.toString(), expected);
    }

}
