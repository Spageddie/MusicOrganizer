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
    private LinkedList<Song> songList;
    private DataHandler handler;


    /**
     * Basic constructor for GlyphOrganizer
     */
    public SongSorter(DataHandler datahandler) {
        sortedTitle = new LinkedList<Song>();
        sortedArtist = new LinkedList<Song>();
        sortedGenre = new LinkedList<Song>();
        sortedYear = new LinkedList<Song>();
        handler = datahandler;
        songList = handler.getSongList();
        this.sortByTitle();
        this.sortByArtist();
        this.sortByGenre();
        this.sortByYear();
        
    }
    public void sortByTitle() {
        sortedTitle = songList;
        //System.out.println(sortedTitle.toString());
        for (int i=0; i<sortedTitle.size(); i++) {
            int min = i;
            for (int j= i+1; j<sortedTitle.size(); j++) {
                if (sortedTitle.get(j).compareTitle(sortedTitle.get(min))<0) {
                    min = j;
                }
            }
            sortedTitle.swap(min, i);
        }
    }
    public void sortByArtist() {
        
        for (int i=0; i<songList.size(); i++) {
            int min = i;
            for (int j= i+1; j<songList.size(); j++) {
                if (songList.get(j).compareArtist(songList.get(min))<0) {
                    min = j;
                }
            }
            songList.swap(min, i);
        }
        sortedArtist = songList;
       
    }
    public void sortByGenre() {
        for (int i=0; i<songList.size(); i++) {
            int min = i;
            for (int j= i+1; j<songList.size(); j++) {
                if (songList.get(j).compareGenre(songList.get(min))<0) {
                    min = j;
                }
            }
            songList.swap(min, i);
        }
        sortedGenre = songList;
    }
    public void sortByYear() {
        for (int i=0; i<songList.size(); i++) {
            int min = i;
            for (int j= i+1; j<songList.size(); j++) {
                if (songList.get(j).compareYear(songList.get(min))<0) {
                    min = j;
                }
            }
            songList.swap(min, i);
        }
        sortedYear = songList;
    }
    public LinkedList<Song> getSortedTitle(){
        return sortedTitle;
    }
    public LinkedList<Song> getSortedArtist(){
        return sortedArtist;
    }
    public LinkedList<Song> getSortedGenre(){
        return sortedGenre;
    }
    public LinkedList<Song> getSortedYear(){
        return sortedYear;
    }
    public DataHandler getDataHandler() {
        return handler;
    }
    

}
