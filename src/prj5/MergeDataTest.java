package prj5;

import student.TestCase;
import java.io.FileNotFoundException;

/**
 * Test class for MergeData class
 * 
 * @author Matthew Marquez (mmarquez)
 * @author Eddie Dean
 * @version 2017.11.16
 *
 */
public class MergeDataTest extends TestCase {
    private MergeData data;
    private ResponseReader responses;


    // sets up cases to test
    public void setUp() throws FileNotFoundException {
        responses = new ResponseReader("MusicSurveyData.csv", "SongList.csv");
        
    }

}
