package prj5;

/**
 * This class is a representation of a single song object.
 * It holds important variables needed for calculations
 * and output purposes
 * 
 * @author Chanaka Perera(chanaka1)
 * @author Eddie Bolton(eddie5)
 * @version 4.8.2018
 */
public class Song {

    private String artist;
    private String title;
    private String year;
    private String genre;

    /**
     * Creates an integer array to hold values that corresponds
     * to different hobbies as given below
     * the pair is for heard and then not heard
     * [0, 1]-Reading [2, 3]-Art [4, 5]-Sports [6, 7]-Music
     */
    private int[] heardHobby = { 0, 0, 0, 0, 0, 0, 0, 0 };

    /**
     * Create an integer array with 4 slots that corresponds to the given majors
     * as given below
     * the pair is for heard and then not heard
     * [0, 1]-Math or CMDA [2, 3]-Computer Science [4, 5]-Other Engineering [6,
     * 7]-Other
     */
    private int[] heardMajor = { 0, 0, 0, 0, 0, 0, 0, 0 };

    /**
     * Create an integer array with 4 slots that corresponds to the given majors
     * as given below
     * the pair is for heard and then not heard
     * [0, 1]-Math or CMDA [2, 3]-Computer Science [4, 5]-Other Engineering [6,
     * 7]-Other
     */
    private int[] heardRegion = { 0, 0, 0, 0, 0, 0, 0, 0 };

    /**
     * Creates an integer array to hold values that corresponds
     * to different hobbies as given below
     * the pair is for heard and then not heard
     * [0, 1]-Reading [2, 3]-Art [4, 5]-Sports [6, 7]-Music
     */
    private int[] likedHobby = { 0, 0, 0, 0, 0, 0, 0, 0 };

    /**
     * Create an integer array with 4 slots that corresponds to the given majors
     * as given below
     * the pair is for heard and then not heard
     * [0, 1]-Math or CMDA [2, 3]-Computer Science [4, 5]-Other Engineering [6,
     * 7]-Other
     */
    private int[] likedMajor = { 0, 0, 0, 0, 0, 0, 0, 0 };

    /**
     * Create an integer array with 4 slots that corresponds to the given majors
     * as given below
     * the pair is for heard and then not heard
     * [0, 1]-North-East [2, 3]-South East [4, 5]-U.S(Other than NE and SE) [6,
     * 7]-Outside of U.S.
     */
    private int[] likedRegion = { 0, 0, 0, 0, 0, 0, 0, 0 };


    /**
     * Constructor for Song object
     * 
     * @param title
     *            title of song
     * @param artist
     *            artist of song
     * @param year
     *            year song was made
     * @param genre
     *            genre of song
     */
    public Song(String title, String artist, String year, String genre) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
    }


    /**
     * Retrieving the artist name
     * 
     * @return artist
     */
    public String getArtist() {
        return artist;
    }


    /**
     * Gets the title of song
     * 
     * @return title
     */
    public String getTitle() {
        return title;
    }


    /**
     * Gets year of song
     * 
     * @return year
     */
    public String getYear() {
        return year;
    }


    /**
     * Gets the song's genre
     * 
     * @return genre
     */
    public String getGenre() {
        return genre;
    }


    /**
     * increments the number in the integer array corresponding
     * to the correct position
     * 
     * @param x
     *            the slot in the array to update value
     */
    public void updateHeardHobby(int x) {
        int temp = heardHobby[x];
        temp = temp + 1;
        heardHobby[x] = temp;
    }


    /**
     * increments the major int array by one corresponding
     * to the correct position
     * 
     * @param x
     *            the slot in the array to update the value
     */
    public void updateHeardMajor(int x) {
        int temp = heardMajor[x];
        temp = temp + 1;
        heardMajor[x] = temp;
    }


    /**
     * update the heardRegion int array
     * 
     * @param x
     *            the slot in the heardRegion array to increment
     */
    public void updateHeardRegion(int x) {
        int temp = heardRegion[x];
        temp = temp + 1;
        heardRegion[x] = temp;
    }


    /**
     * update the likedHobby int array in the class
     * 
     * @param x
     *            index of the int array which needs to be incremented
     */
    public void updateLikedHobby(int x) {
        int temp = likedHobby[x];
        temp = temp + 1;
        likedHobby[x] = temp;
    }


    /**
     * update the likedMajot integer array in the class
     * 
     * @param x
     *            index of the int array which needs to be incremented
     */
    public void updateLikedMajor(int x) {
        int temp = likedMajor[x];
        temp = temp + 1;
        likedMajor[x] = temp;
    }


    /**
     * updates the LikedRegion integer array in the class
     * 
     * @param x
     *            index of the int array which needs to be incremented
     */
    public void updateLikedRegion(int x) {
        int temp = likedRegion[x];
        temp = temp + 1;
        likedRegion[x] = temp;
    }


    /**
     * @return
     *         The corresponding number in the integer array of the class
     * 
     * @param x
     *            index of the array relating to hobby
     */
    public int getHeardHobby(int x) {
        return heardHobby[x];
    }


    /**
     * @return
     *         The corresponding number in the integer array of the class
     * 
     * @param x
     *            index of the array relating to major
     */
    public int getHeardMajor(int x) {
        return heardMajor[x];
    }


    /**
     * @return
     *         The corresponding number in the integer array of the class
     * 
     * @param x
     *            index of the array relating to region
     */
    public int getHeardRegion(int x) {
        return heardRegion[x];
    }


    /**
     * @return
     *         The corresponding number in the integer array of the class
     * 
     * @param x
     *            index of the array relating to region
     */
    public int getLikedHobby(int x) {
        return likedHobby[x];
    }


    /**
     * @return
     *         The corresponding number in the integer array of the class
     * 
     * @param x
     *            index of the array relating to region
     */
    public int getLikedMajor(int x) {
        return likedMajor[x];
    }


    /**
     * @return
     *         The corresponding number in the integer array of the class
     * 
     * @param x
     *            index of the array relating to region
     */
    public int getLikedRegion(int x) {
        return likedRegion[x];
    }


    /**
     * Calculates the percentage of people by
     * their hobby who heard this song
     * 
     * @return
     *         The percentage value
     * @param index1
     *            the index of the hobby to get
     */
    public int getHeardHobbyPercent(int index1) {
        int total = index1 + 1;
        int heardHb = (int)(((float)getHeardHobby(index1)
            / (float)getHeardHobby(total)) * 100);
        return heardHb;
    }


    /**
     * Calculates the percentage of people by
     * their major who heard this song
     * 
     * @return
     *         The percentage value
     * @param index1
     *            the index of the major array
     */
    public int getHeardMajorPercent(int index1) {
        int total = index1 + 1;
        int heardMaj = (int)(((float)getHeardMajor(index1)
            / (float)getHeardMajor(total)) * 100);
        return heardMaj;
    }


    /**
     * Calculates the percentage of people by
     * their region who heard this song
     * 
     * @return
     *         The percentage value
     * @param index1
     *            the index of the region array
     */
    public int getHeardRegionPercent(int index1) {
        int total = index1 + 1;
        int heardReg = (int)(((float)getHeardRegion(index1)
            / (float)getHeardRegion(total)) * 100);
        return heardReg;
    }


    /**
     * Calculates the percentage of people by
     * their major who liked this song
     * 
     * @return
     *         The percentage value
     * @param index1
     *            the index of the liked major array
     */
    public int getLikedMajorPercent(int index1) {
        int total = index1 + 1;
        int likedMaj = (int)(((float)getLikedMajor(index1)
            / (float)getLikedMajor(total)) * 100);
        return likedMaj;
    }


    /**
     * Calculates the percentage of people by
     * their hobby who liked this song
     * 
     * @return
     *         The percentage value
     * @param index1
     *            the index of the liked hobby array
     */
    public int getLikedHobbyPercent(int index1) {
        int total = index1 + 1;
        int likedHob = (int)(((float)getLikedHobby(index1)
            / (float)getLikedHobby(total)) * 100);
        return likedHob;
    }


    /**
     * Calculates the percentage of people by
     * their major who liked this song
     * 
     * @return
     *         The percentage value
     * @param index1
     *            the index of the liked major array
     */
    public int getLikedRegionPercent(int index1) {
        int total = index1 + 1;
        int likedReg = (int)(((float)getLikedRegion(index1)
            / (float)getLikedRegion(total)) * 100);
        return likedReg;
    }


    /**
     * @return
     *         Concatenates the fields of this object together
     *         to return a String output in desired format
     */
    public String toString() {
        String out = "Song Title: " + getTitle() + "\n" + "Song Artist: "
            + getArtist() + "\n" + "Song Genre: " + getGenre() + "\n"
            + "Song Year: " + getYear();
        return out;
    }


    /**
     * @return
     *         true if the fields are the same or false otherwise
     *         Default equals method for this object which checks
     *         whether 2 objects are the same by checking the fields
     *         in both classes
     * @param obj
     *            The object to which this object is compared to
     */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        // Returns false if obj is null
        if (obj == null) {
            return false;
        }
        // If the object comparison is of the same class
        if (obj.getClass() == this.getClass()) {
            // Checks whether the fields of the two songs are equal
            return (obj.toString().equals(this.toString()));
        }
        // If the object is of a different type
        else {
            return false;
        }
    }

}
