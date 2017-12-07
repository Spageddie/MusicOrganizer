package prj5;
import java.io.FileNotFoundException;
import student.TestCase;
/**
 * Test class for DataHandler
 * @author Matthew Marquez
 * @version 2017.12.06
 *
 */
public class DataHandlerTest extends TestCase{
    private DataHandler calculator;
    /**
     * Sets up test case
     */
    public void setUp() throws FileNotFoundException {
        calculator = new DataHandler("MusicSurveyData.csv", "SongList.csv");
    }
    /**
     * Tests updateSongs() method
     */
    public void testUpdateSongs() {
        calculator.updateSongs();
        System.out.println(calculator.getSongList().toString());
    }

}
