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

}
