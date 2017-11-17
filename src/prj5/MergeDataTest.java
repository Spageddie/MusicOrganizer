package prj5;
import student.TestCase;
import java.io.FileNotFoundException;

public class MergeDataTest extends TestCase{
    private MergeData data;
    private ResponseReader responses;
    public void setUp() throws FileNotFoundException {
        responses = new ResponseReader("MusicSurveyData.csv","SongList.csv");
        data = new MergeData(responses.getResponseList(), responses.getSongList());
    }
    public void testMergeData() {
        
    }
    public void testToString() {
        //System.out.println(data.toString());
    }

}
