package prj5;
import java.io.FileNotFoundException;
import student.TestCase;

public class DataHandlerTest extends TestCase{
    private DataHandler calculator;
    public DataHandlerTest() {
        // TODO Auto-generated constructor stub
    }
    public void setUp() throws FileNotFoundException {
        calculator = new DataHandler("MusicSurveyData.csv", "SongList.csv");
    }
    public void testUpdateSongs() {
        calculator.updateSongs();
        System.out.println(calculator.getSongList().toString());
    }

}
