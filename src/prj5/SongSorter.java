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
    public SongSorter() {

    }


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


    public LinkedList<Song> getSortedTitle() {
        return sortedTitle;
    }


    public LinkedList<Song> getSortedArtist() {
        return sortedArtist;
    }


    public LinkedList<Song> getSortedGenre() {
        return sortedGenre;
    }


    public LinkedList<Song> getSortedYear() {
        return sortedYear;
    }


    public DataHandler getDataHandler() {
        return handler;
    }

}
