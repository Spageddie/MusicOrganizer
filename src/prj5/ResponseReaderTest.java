package prj5;

import java.io.FileNotFoundException;
import student.TestCase;

/**
 * Test class for response reader
 * 
 * @author Matthew Marquez (mmarquez)
 * @version 2017.12.06
 *
 */
public class ResponseReaderTest extends TestCase {
    private ResponseReader reader;


    /**
     * Sets up the test case
     */
    public void setUp() throws FileNotFoundException {
        reader = new ResponseReader("MusicSurveyData.csv", "SongList.csv");
    }


    /**
     * Tests the readResponses() method
     */
    public void testReadResponses() {
        assertEquals(reader.getResponseList().get(0).getId(), "1");
    }


    /**
     * Tests the readSongs() method
     */
    public void testReadSongs() {
        assertEquals(reader.getSongList().get(0).getTitle(),
            "All These Things I've Done");
    }
}
