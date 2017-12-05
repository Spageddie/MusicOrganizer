package prj5;
/**
 * Song object to represent a song and information about it
 * (title, artist, year, and genre)
 * @author Matthew Marquez
 * @version 2017.11.16
 *
 */
public class Song {
    private String title;
    private String artist;
    private String year;
    private String genre;
    /**
     * Constructor for Song object
     * @param title
     *      title of song
     * @param artist
     *      artist of song
     * @param year
     *      year song was made
     * @param genre
     *      genre of song
     */
    public Song(String title, String artist, String year, String genre) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
    }
    public Song(String title, String artist, String year, String genre, 
        Double percentCs, Double percentMath, Double percentEng, Double percentOther,
        Double percentSE, Double percentNE, Double percentUS, Double percentOut,
        Double percentMusic, Double percentSports, Double percentReading, Double percentArt) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
    }
    /**
     * Getter method for title
     * @return title of song
     */
    public String getTitle() {
        return title;
    }
    /**
     * Getter method for artist
     * @return artist of song
     */
    public String getArtist() {
        return artist;
    }
    /**
     * Getter method for year
     * @return year song was made
     */
    public String getYear() {
        return year;
    }
    /**
     * Getter method for genre
     * @return genre of song
     */
    public String getGenre() {
        return genre;
    }
    /**
     * Setter method for artist
     * @param artist
     *      new artist to set to
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }
    /**
     * Setter method for year
     * @param year
     *      new year to set to
     */
    public void setYear(String year) {
        this.year = year;
    }
    /**
     * Setter method for title
     * @param title
     *      new title to set to
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * Setter method for genre
     * @param genre
     *      new genre to set to
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(title+" ");
        builder.append(artist+" ");
        builder.append(year +" ");
        builder.append(genre+" ");
        return builder.toString();
    }
}
