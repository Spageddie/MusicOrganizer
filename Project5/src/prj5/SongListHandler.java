package prj5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This class is a sub class of the linked list class
 * This class mainly provides the functionality to sort
 * through needed objects
 * 
 * @author Chanaka Perera(chanaka1)
 * @author Eddie Bolton(eddie5)
 * @version 2018.4.18
 *
 */
public class SongListHandler extends LinkedList<Song>
    implements Iterable<Song> {

    /**
     * @return
     *         This method simply returns an iterator object for
     *         this linked list of songs
     */
    public Iterator<Song> iterator() {
        return new SongListHandlerIterator<Song>();
    }


    /**
     * This is a private class for the iterator object implemented in
     * this Linked list subclass
     */
    @SuppressWarnings("hiding")
    private class SongListHandlerIterator<Song> implements Iterator<Song> {

        private int index;


        /**
         * Constructor for iterator object
         */
        public SongListHandlerIterator() {
            index = 0;
        }


        /**
         * @return
         *         true if there are more entries in this list or false
         *         otherwise
         */
        @Override
        public boolean hasNext() {
            return index < size();
        }


        /**
         * @return
         *         the next Song object in this linked list
         * @throws NoSuchElementException
         *             once it reaches the end of the list
         */
        @Override
        public Song next() {
            // If there are more entries in this list
            if (this.hasNext()) {
                @SuppressWarnings("unchecked")
                Song song = (Song)getAt(index++);
                return song;
            }
            else {
                throw new NoSuchElementException("No more elements in List");
            }

        }

    }


    /**
     * This method takes in a parameter and sorts the songs
     * in the list accordingly. This method uses a bubble
     * sort method
     * 
     * @param sortParam
     *            The parameter to sort the songs in the LinkedList
     */
    public void sortSongs(String sortParam) {
        // If the sort type is set to title
        // Sort by title ignores case
        if (sortParam.equals("title")) {
            // Iterates through the entire list
            for (int i = 0; i < this.size() - 1; i++) {
                for (int j = 0; j < this.size() - 1; j++) {
                    // Gets the song at the initial location and compares
                    // it to the next song in list
                    Song song = getAt(j);
                    // Swaps the two songs and arranges it accordingly if it
                    // meets the conditions
                    if (song.getTitle().toLowerCase().compareTo(getAt(j + 1)
                        .getTitle().toLowerCase()) > 0) {
                        swap(j, j + 1);
                    }
                }

            }
        }

        // If the sort type is set to genre
        // This sorting method takes case into consideration
        else if (sortParam.equals("genre")) {
            // Iterates through the entire list
            for (int i = 0; i < this.size() - 1; i++) {
                for (int j = 0; j < this.size() - 1; j++) {
                    // Retrieves the song at location and compares it
                    // to the next song in the list
                    Song song = getAt(j);
                    // Swaps the two songs if it meets the conditions
                    if (song.getGenre().compareTo(getAt(j + 1)
                        .getGenre()) > 0) {
                        swap(j, j + 1);
                    }
                }
            }
        }
        // If the sort type is set to artist
        // This sorting method ignores Case
        else if (sortParam.equals("artist")) {
            // iterates through the entire linked list of songs
            for (int i = 0; i < this.size() - 1; i++) {
                for (int j = 0; j < this.size() - 1; j++) {
                    Song song = getAt(j);
                    // Compares the artist of the song object and the next song
                    // object in the linked list
                    if (song.getArtist().toLowerCase().compareTo(getAt(j + 1)
                        .getArtist().toLowerCase()) > 0) {
                        // Swaps the two song if it meets the conditions
                        swap(j, j + 1);
                    }
                }
            }
        }

        // If the sort type is set to year
        else {
            // iterates through the entire linked list of songs
            for (int i = 0; i < this.size() - 1; i++) {
                for (int j = 0; j < this.size() - 1; j++) {
                    Song song = getAt(j);
                    // Gets the integer values of the release year for the song
                    // object and the next entry in the list
                    int int1 = Integer.valueOf(song.getYear());
                    int int2 = Integer.valueOf(getAt(j + 1).getYear());
                    // If the value of the release year is greater swaps the two
                    // song objects
                    if (int1 > int2) {
                        swap(j, j + 1);
                    }
                }
            }
        }

    }

}
