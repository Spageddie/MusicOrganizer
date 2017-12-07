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
     * Basic constructor for SongSorter
     */
    public SongSorter(DataHandler datahandler) {
        handler = datahandler;
    }


    /**
     * Sorts list of songs by title
     * 
     * @param songList
     * @return songList sorted by title
     */
    public LinkedList<Song> sortByTitle(LinkedList<Song> songList) {
        for (int i = 0; i < songList.size(); i++) {
            int min = i;
            for (int j = i + 1; j < songList.size(); j++) {
                if (songList.get(j).compareTitle(songList.get(min)) < 0) {
                    min = j;
                }
            }
            songList.swap(min, i);
        }
        return songList;
    }


    /**
     * Sorts list of songs by artist
     * 
     * @param songList
     * @return songList sorted by artist
     */
    public LinkedList<Song> sortByArtist(LinkedList<Song> songList) {
        for (int i = 0; i < songList.size(); i++) {
            int min = i;
            for (int j = i + 1; j < songList.size(); j++) {
                if (songList.get(j).compareArtist(songList.get(min)) < 0) {
                    min = j;
                }
            }
            songList.swap(min, i);
        }
        return songList;
    }


    /**
     * Sorts list of songs by genre
     * 
     * @param songList
     * @return songList sorted by genre
     */
    public LinkedList<Song> sortByGenre(LinkedList<Song> songList) {
        for (int i = 0; i < songList.size(); i++) {
            int min = i;
            for (int j = i + 1; j < songList.size(); j++) {
                if (songList.get(j).compareGenre(songList.get(min)) < 0) {
                    min = j;
                }
            }
            songList.swap(min, i);
        }
        return songList;
    }


    /**
     * Sorts list of songs my year
     * 
     * @param songList
     * @return songList sorted by year
     */
    public LinkedList<Song> sortByYear(LinkedList<Song> songList) {
        for (int i = 0; i < songList.size(); i++) {
            int min = i;
            for (int j = i + 1; j < songList.size(); j++) {
                if (songList.get(j).compareYear(songList.get(min)) < 0) {
                    min = j;
                }
            }
            songList.swap(min, i);
        }
        return songList;
    }


    /**
     * Getter method for dataHandler
     * @return handler
     */
    public DataHandler getDataHandler() {
        return handler;
    }

}
