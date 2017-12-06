package prj5;

import java.io.FileNotFoundException;
import student.TestCase;
public class ResponseReaderTest extends TestCase {
    private ResponseReader reader;
    public void setUp() throws FileNotFoundException {
        reader = new ResponseReader("MusicSurveyData.csv", "SongList.csv");
    }
    public void testReadResponses() {
        System.out.println(reader.getResponseList().toString());
    }
    public void testReadSongs() {
        System.out.println(reader.getSongList().toString());
        assertEquals(reader.getSongList().get(0).getTitle(), "All These Things I've Done");
    }
}
