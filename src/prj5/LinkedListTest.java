package prj5;

import student.TestCase;

/**
 * Test class for LinkedList
 * 
 * @author Matthew Marquez (mmarquez)
 * @version 2015.11.15
 *
 */
public class LinkedListTest extends TestCase {
    private LinkedList<String> listBinA;
    private LinkedList<String> listCinA;
    private LinkedList<String> listD;
    private LinkedList<Song> songList;
    private LinkedList<Song> songList2;


    /**
     * Sets up test cases
     */
    public void setUp() {

        listBinA = new LinkedList<String>();
        listCinA = new LinkedList<String>();
        listD = new LinkedList<String>();
        songList = new LinkedList<Song>();
        songList2 = new LinkedList<Song>();

        listBinA.add("Hello");
        listBinA.add("Fun");
        listBinA.add("Bye");

        listCinA.add("Games");
        listCinA.add("TV");
        listCinA.add("Comics");

        Song song1 = new Song("apples", "Metallica", "1800", "rock");
        Song song2 = new Song("banana", "Logic", "2030", "rap");
        Song song3 = new Song("Zebra Tiger", "Metallica", "5", "heavy");

        songList.add(song1);
        songList.add(song2);
        songList.add(song3);
        

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
        listCinA.clear();

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
        LinkedList<String> listA = new LinkedList<String>();
        listBinA.add(2, "fan");
        assertTrue(listBinA.contains("fan"));
        Exception exception = null;
        try {
            listBinA.add(1, null);
            listBinA.add(-1, "wow");
        }
        catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        listA.add(0, "first");
        assertTrue(listA.contains("first"));

    }


    /**
     * tests the add() method
     */
    public void testAdd() {
        Exception exception = null;
        try {
            listBinA.add(null);
        }
        catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        LinkedList<String> listA = new LinkedList<String>();
        listA.add("wow");
        assertTrue(listA.contains("wow"));
        listBinA.add("somuch");
        assertTrue(listBinA.contains("somuch"));
    }


    /**
     * Tests the remove method
     */
    public void testRemove() {
        LinkedList<String> listA = new LinkedList<String>();
        listA.add("wow");
        listA.remove("wow");
        assertFalse(listA.contains("wow"));
        assertTrue(listBinA.remove("Bye"));
        assertFalse(listBinA.remove("NotHere"));
    }


    /**
     * Tests the remove(index) method
     */
    public void testRemoveIndex() {
        LinkedList<String> listA = new LinkedList<String>();
        Exception exception = null;
        try {
            listBinA.remove(-1);
            listA.remove(0);
            listBinA.remove(5);
        }
        catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        listA.add("One");
        assertTrue(listA.remove(0));
        assertTrue(listBinA.remove(2));
    }


    /**
     * Tests the get method
     */
    public void testGet() {
        LinkedList<String> listA = new LinkedList<String>();
        Exception exception = null;
        try {
            listA.get(3);
        }
        catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertEquals("Bye", listBinA.get(2));
    }


    /**
     * Tests the contains() method
     */
    public void testContains() {
        assertTrue(listBinA.contains("Bye"));
        assertFalse(listBinA.contains("Ciao"));
    }


    /**
     * Tests the toString() method
     */
    public void testToString() {
        String test = "{Hello, Fun, Bye}";
        assertTrue(test.equals(listBinA.toString()));
    }


    /**
     * Tests the equals() method
     */
    public void testEquals() {
        assertTrue(listBinA.equals(listBinA));
        assertFalse(listBinA.equals(null));
        assertFalse(listBinA.equals("Hi"));
        LinkedList<String> listA = new LinkedList<String>();
        listA.add("Hello");
        listA.add("Fun");
        listA.add("Bye");
        assertTrue(listA.equals(listBinA));
        listA.add("NotEqual");
        assertFalse(listA.equals(listBinA));
    }


    /**
     * Tests the swap() method
     */
    public void testSwap() {
        listBinA.swap(0, 1);
        LinkedList<String> test = new LinkedList<String>();
        test.add("Fun");
        test.add("Hello");
        test.add("Bye");
        assertTrue(listBinA.equals(test));
    }


    /**
     * Tests the sortByTitle() method
     */
    public void testSortByTitle() {
        this.songList = songList.sortByTitle(songList);
        Song song1 = new Song("apples", "Metallica", "1800", "rock");
        Song song2 = new Song("banana", "Logic", "2030", "rap");
        Song song3 = new Song("Zebra Tiger", "Metallica", "5", "heavy");
        songList2.add(song1);
        songList2.add(song2);
        songList2.add(song3);
        assertFalse(songList.equals(songList2));
        
    }
    /**
     * Tests the sortByArtist() method
     */
    public void testSortByArtist() {
        songList = songList.sortByArtist(songList);
        Song song1 = new Song("apples", "Metallica", "1800", "rock");
        Song song2 = new Song("banana", "Logic", "2030", "rap");
        Song song3 = new Song("Zebra Tiger", "Metallica", "5", "heavy");
        songList2.add(song2);
        songList2.add(song1);
        songList2.add(song3);
        assertFalse(songList.equals(songList2));
    }
    /**
     * Tests the sortByGenre() method
     */
    public void testSortByGenre() {
        songList = songList.sortByGenre(songList);
        Song song1 = new Song("apples", "Metallica", "1800", "rock");
        Song song2 = new Song("banana", "Logic", "2030", "rap");
        Song song3 = new Song("Zebra Tiger", "Metallica", "5", "heavy");
        songList2.add(song3);
        songList2.add(song2);
        songList2.add(song1);
        assertFalse(songList.equals(songList2));
    }
    /**
     * Tests the sortByYear() method
     */
    public void testSortByYear() {
        songList = songList.sortByYear(songList);
        Song song1 = new Song("apples", "Metallica", "1800", "rock");
        Song song2 = new Song("banana", "Logic", "2030", "rap");
        Song song3 = new Song("Zebra Tiger", "Metallica", "5", "heavy");
        songList2.add(song3);
        songList2.add(song1);
        songList2.add(song2);
        assertFalse(songList.equals(songList2));
    }
}
