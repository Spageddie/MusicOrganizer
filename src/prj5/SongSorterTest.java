package prj5;

import java.io.FileNotFoundException;
import student.TestCase;

/**
 * Test class for SongSorter class
 * 
 * @author Matthew Marquez (mmarquez)
 * @version 2017.12.06
 *
 */
public class SongSorterTest extends TestCase {
    private SongSorter sorter;

    /**
     * Sets up the test cases
     */
    public void setUp() throws FileNotFoundException {
        DataHandler handler = new DataHandler("MusicSurveyData.csv",
            "SongList.csv");
        handler.updateSongs();
        sorter = new SongSorter(handler);
    }
<<<<<<< HEAD
    
    public void testSortByTitle() {
        System.out.println(sorter.getSortedTitle().toString());
    }
    /*
    public void testSortByArtist() {
        System.out.println(sorter.getSortedArtist().toString());
    }
    public void testSortByGenre() {
        System.out.println(sorter.getSortedGenre().toString());
    }
    public void testSortByYear() {
        System.out.println(sorter.getSortedYear().toString());
    }
    */
=======

>>>>>>> b6415af3eda6834ba8c8ee62e14292a4971f4412
}
