package prj5;

/**
 * Class to organize glyphs
 * 
 * @author Matthew Marquez (mmarquez)
 * @author Eddie Dean
 * @version 2017.11.16
 */
public class SongSorter {
    private final LinkedList<Song> sortedTitle;
    private final LinkedList<Song> sortedArtist;
    private final LinkedList<Song> sortedGenre;
    private final LinkedList<Song> sortedYear;
    private LinkedList<Song> songList;
    private DataHandler handler;


    /**
     * Basic constructor for GlyphOrganizer
     */
    public SongSorter(DataHandler datahandler) {
        handler = datahandler;
        songList = handler.getSongList();
        final LinkedList<Song> sortedTitle = this.sortByTitle(songList);
        //System.out.println(sortedTitle.toString());
        this.sortedTitle = sortedTitle;
        //System.out.println(sortedTitle.toString());
        final LinkedList<Song> sortedArtist = this.sortByArtist(songList);
        this.sortedArtist = sortedArtist;
        //System.out.println(sortedArtist.toString());
        final LinkedList<Song> sortedGenre = this.sortByGenre(songList);
        this.sortedGenre = sortedGenre;
        //System.out.println(sortedGenre.toString());
        final LinkedList<Song> sortedYear = this.sortByYear(songList);
        this.sortedYear = sortedYear;
        //System.out.println(sortedYear.toString());
        //System.out.println(sortedTitle.toString());
        
    }
    public final LinkedList<Song> sortByTitle(LinkedList<Song> songList) {
        for (int i=0; i<songList.size(); i++) {
            int min = i;
            for (int j= i+1; j<songList.size(); j++) {
                if (songList.get(j).compareTitle(songList.get(min))<0) {
                    min = j;
                }
            }
            songList.swap(min, i);
        }
        //System.out.println("Title: ");
        //System.out.println(sortedTitle.toString());
        return songList;
    }
    public final LinkedList<Song> sortByArtist(LinkedList<Song> songList) {
        for (int i=0; i<songList.size(); i++) {
            int min = i;
            for (int j= i+1; j<songList.size(); j++) {
                if (songList.get(j).compareArtist(songList.get(min))<0) {
                    min = j;
                }
            }
            songList.swap(min, i);
        }
        return songList;
        //System.out.println("Artist: ");
        //System.out.println(sortedArtist.toString());
       
    }
    public final LinkedList<Song> sortByGenre(LinkedList<Song> songList){
        for (int i=0; i<songList.size(); i++) {
            int min = i;
            for (int j= i+1; j<songList.size(); j++) {
                if (songList.get(j).compareGenre(songList.get(min))<0) {
                    min = j;
                }
            }
            songList.swap(min, i);
        }
        return songList;
        //System.out.println("Genre: ");
        //System.out.println(sortedGenre.toString());
    }
    public final LinkedList<Song> sortByYear(LinkedList<Song> songList) {
        for (int i=0; i<songList.size(); i++) {
            int min = i;
            for (int j= i+1; j<songList.size(); j++) {
                if (songList.get(j).compareYear(songList.get(min))<0) {
                    min = j;
                }
            }
            songList.swap(min, i);
        }
        return songList;
        //System.out.println("Year: ");
        //System.out.println(sortedYear.toString());
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
