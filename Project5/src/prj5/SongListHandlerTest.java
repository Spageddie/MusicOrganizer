package prj5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This class tests all the methods in the song list
 * handler class
 * 
 * @author Chanaka Perera(chanaka1)
 * @version 4.22.2018
 *
 */
public class SongListHandlerTest extends student.TestCase {

    private SongListHandler handle;
    private Song song1;
    private Song song2;
    private Song song3;
    private Song song4;


    /**
     * This sets up all the test methods for
     * the SongListHandler class
     */
    public void setUp() {
        handle = new SongListHandler();
        song1 = new Song("ater", "bter", "2000", "dter");
        song2 = new Song("bte", "ater", "2001", "cterrr");
        song3 = new Song("CDER", "dter", "199", "red");
        song4 = new Song("dterer", "asds", "132132", "blues");
        handle.add(song1);
        handle.add(song2);
        handle.add(song3);
        handle.add(song4);
    }


    /**
     * Tests the sort by title method in the
     * song list handler class
     */
    public void testSortTitle() {
        handle.sortSongs("title");
        assertEquals(handle.getAt(0), song1);
        assertEquals(handle.getAt(1), song2);
        assertEquals(handle.getAt(2), song3);
        assertEquals(handle.getAt(3), song4);
        handle.add(new Song("abc", "dfd", "23", "dfd"));
        assertEquals(handle.getAt(4).getTitle(), "abc");
        handle.sortSongs("title");
        assertEquals(handle.getAt(1), song1);
        assertEquals(handle.getAt(0).getTitle(), "abc");
    }


    /**
     * Tests whether the sort by genre method in the
     * song list handler class works as expected
     */
    public void testSortGenre() {
        handle.sortSongs("genre");
        assertEquals(handle.getAt(0), song4);
        assertEquals(handle.getAt(1), song2);
        assertEquals(handle.getAt(2), song1);
        assertEquals(handle.getAt(3), song3);
    }


    /**
     * Tests whether the sort by year method in the
     * song list handler class works as expected
     */
    public void testSortYear() {
        handle.sortSongs("year");
        assertEquals(handle.getAt(0), song3);
        assertEquals(handle.getAt(1), song1);
        assertEquals(handle.getAt(2), song2);
        assertEquals(handle.getAt(3), song4);
    }


    /**
     * Tests whether the sort by artist method in
     * the songListHandler class works as expected
     */
    public void testSortArtist() {
        handle.sortSongs("artist");
        assertEquals(handle.getAt(0), song4);
        assertEquals(handle.getAt(1), song2);
        assertEquals(handle.getAt(2), song1);
        assertEquals(handle.getAt(3), song3);
    }


    /**
     * Tests the iterator object of the songList Handler
     * class
     */
    public void testIterator() {
        Iterator<Song> iter = handle.iterator();
        assertTrue(iter.hasNext());
        assertEquals(iter.next(), song1);
        iter.next();
        iter.next();
        iter.next();
        assertFalse(iter.hasNext());
        Exception exception = null;
        try {
            iter.next();
        }
        catch (Exception e) {
            exception = e;
        }
        assertTrue(exception instanceof NoSuchElementException);
    }

}
