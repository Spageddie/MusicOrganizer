package prj5;
import java.io.FileNotFoundException;
import student.TestCase;
public class SongSorterTest extends TestCase{
    private SongSorter sorter;
    public SongSorterTest() {
        // TODO Auto-generated constructor stub
    }
    public void setUp() throws FileNotFoundException {
        DataHandler handler = new DataHandler("MusicSurveyData.csv", "SongList.csv");
        handler.updateSongs();
        sorter = new SongSorter(handler);
    }
    
}
