package prj5;

/**
 * Class to organize glyphs
 * 
 * @author Matthew Marquez (mmarquez)
 * @author Eddie Dean
 * @version 2017.11.16
 */
public class SongSorter {
    private LinkedList<Song> sortedTitle;
    private LinkedList<Song> sortedArtist;
    private LinkedList<Song> sortedGenre;
    private LinkedList<Song> sortedYear;


    /**
     * Basic constructor for GlyphOrganizer
     */
    public SongSorter() {
        sortedTitle = new LinkedList<Song>();
        sortedArtist = new LinkedList<Song>();
        sortedGenre = new LinkedList<Song>();
        sortedYear = new LinkedList<Song>();
    }
    

}
