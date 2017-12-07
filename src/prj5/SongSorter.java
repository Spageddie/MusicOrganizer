package prj5;

/**
 * Class to organize song lists
 * 
 * @author Matthew Marquez (mmarquez)
 * @version 2017.11.16
 */
public class SongSorter {
    private DataHandler handler;


    /**
     * Basic constructor for GlyphOrganizer
     */
    public SongSorter(DataHandler datahandler) {
        
        handler = datahandler;
        
    }
    public LinkedList<Song> sortByTitle(LinkedList<Song> songList) {
        for (int i=0; i<songList.size(); i++) {
            int min = i;
            for (int j= i+1; j<songList.size(); j++) {
                if (songList.get(j).compareTitle(songList.get(min))<0) {
                    min = j;
                }
            }
            songList.swap(min, i);
        }
        return songList;
    }
    public LinkedList<Song> sortByArtist(LinkedList<Song> songList) {
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
    }
    public LinkedList<Song> sortByGenre(LinkedList<Song> songList){
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
    }
    public LinkedList<Song> sortByYear(LinkedList<Song> songList) {
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
    }
    public DataHandler getDataHandler() {
        return handler;
    }
    

}
