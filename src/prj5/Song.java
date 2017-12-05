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
    private Double percentCS;
    private Double percentMath;
    private Double percentEng;
    private Double percentOther;
    private Double percentSE;
    private Double percentNE;
    private Double percentUS;
    private Double percentOut;
    private Double percentMusic;
    private Double percentSports;
    private Double percentReading;
    private Double percentArt;
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
        percentCS = 0.;
        percentMath = 0.;
        percentEng = 0.;
        percentOther = 0.;
        percentSE = 0.;
        percentNE = 0.;
        percentUS = 0.;
        percentOut = 0.;
        percentMusic = 0.;
        percentSports = 0.;
        percentReading = 0.;
        percentArt = 0.;
    }
    public Song(String title, String artist, String year, String genre, 
        Double percentCS, Double percentMath, Double percentEng, Double percentOther,
        Double percentSE, Double percentNE, Double percentUS, Double percentOut,
        Double percentMusic, Double percentSports, Double percentReading, Double percentArt) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
        this.percentCS = percentCS;
        this.percentMath = percentMath;
        this.percentEng = percentEng;
        this.percentOther = percentOther;
        this.percentSE = percentSE;
        this.percentNE = percentNE;
        this.percentUS = percentUS;
        this.percentOut = percentOut;
        this.percentMusic = percentMusic;
        this.percentSports = percentSports;
        this.percentReading = percentReading;
        this.percentArt = percentArt;
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
