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
}
