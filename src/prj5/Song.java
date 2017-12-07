package prj5;

/**
 * Song object to represent a song and information about it
 * (title, artist, year, and genre)
 * 
 * @author Matthew Marquez
 * @version 2017.11.16
 *
 */
public class Song {
    private String title;
    private String artist;
    private String year;
    private String genre;
    private double heardPercentCS;
    private double heardPercentMath;
    private double heardPercentEng;
    private double heardPercentOther;
    private double heardPercentSE;
    private double heardPercentNE;
    private double heardPercentUS;
    private double heardPercentOut;
    private double heardPercentMusic;
    private double heardPercentSports;
    private double heardPercentReading;
    private double heardPercentArt;
    private double likePercentCS;
    private double likePercentMath;
    private double likePercentEng;
    private double likePercentOther;
    private double likePercentSE;
    private double likePercentNE;
    private double likePercentUS;
    private double likePercentOut;
    private double likePercentMusic;
    private double likePercentSports;
    private double likePercentReading;
    private double likePercentArt;


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
        heardPercentCS = 0.;
        heardPercentMath = 0.;
        heardPercentEng = 0.;
        heardPercentOther = 0.;
        heardPercentSE = 0.;
        heardPercentNE = 0.;
        heardPercentUS = 0.;
        heardPercentOut = 0.;
        heardPercentMusic = 0.;
        heardPercentSports = 0.;
        heardPercentReading = 0.;
        heardPercentArt = 0.;
    }


    /**
     * change heard and like percentages for 1 array for each specification (ie
     * heard and like of same
     * specificiation in one array) so you can cut down parameters by two
     * 
     * @param title
     *      title of song
     * @param artist
     *      artist of song
     * @param year
     *      year song was made
     * @param genre
     *      genre of song
     * @param heardPercentCS
     *      percent of people who heard song in cs major
     * @param heardPercentMath
     *      percent of people who heard song in math major
     * @param heardPercentEng
     *      percent of people who heard song in other engineering major
     * @param heardPercentOther
     *      percent of people who heard song in other major
     * @param heardPercentSE
     *      percent of people who heard song in southeast region
     * @param heardPercentNE
     *      percent of people who heard song in northeast region
     * @param heardPercentUS
     *      percent of people who heard song in US other than SE and NE region
     * @param heardPercentOut
     *      percent of people who heard song outside of US
     * @param heardPercentMusic
     *      percent of people who heard song with music hobby
     * @param heardPercentSports
     *      percent of people who heard song with sports hobby
     * @param heardPercentReading
     *      percent of people who heard song with reading hobby
     * @param heardPercentArt
     *      percent of people who heard song with art hobby
     * @param likePercentCS
     *      percent of people who like song in cs major
     * @param likePercentMath
     *      percent of people who like song in math major
     * @param likePercentEng
     *      percent of people who like song in other engineering major
     * @param likePercentOther
     *      percent of people who like song in other major
     * @param likePercentSE
     *      percent of people who like song in southeast region
     * @param likePercentNE
     *      percent of people who like song in northeast region
     * @param likePercentUS
     *      percent of people who like song in US other than SE and NE region
     * @param likePercentOut
     *      percent of people who like song outside of US
     * @param likePercentMusic
     *      percent of people who like song in music hobby
     * @param likePercentSports
     *      percent of people who like song in sports hobby 
     * @param likePercentReading
     *      percent of people who like song in reading hobby
     * @param likePercentArt
     *      percent of people who like song in art hobby
     */
    public Song(
        String title,
        String artist,
        String year,
        String genre,
        double heardPercentCS,
        double heardPercentMath,
        double heardPercentEng,
        double heardPercentOther,
        double heardPercentSE,
        double heardPercentNE,
        double heardPercentUS,
        double heardPercentOut,
        double heardPercentMusic,
        double heardPercentSports,
        double heardPercentReading,
        double heardPercentArt,
        double likePercentCS,
        double likePercentMath,
        double likePercentEng,
        double likePercentOther,
        double likePercentSE,
        double likePercentNE,
        double likePercentUS,
        double likePercentOut,
        double likePercentMusic,
        double likePercentSports,
        double likePercentReading,
        double likePercentArt) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
        this.heardPercentCS = heardPercentCS;
        this.heardPercentMath = heardPercentMath;
        this.heardPercentEng = heardPercentEng;
        this.heardPercentOther = heardPercentOther;
        this.heardPercentSE = heardPercentSE;
        this.heardPercentNE = heardPercentNE;
        this.heardPercentUS = heardPercentUS;
        this.heardPercentOut = heardPercentOut;
        this.heardPercentMusic = heardPercentMusic;
        this.heardPercentSports = heardPercentSports;
        this.heardPercentReading = heardPercentReading;
        this.heardPercentArt = heardPercentArt;
        this.likePercentCS = likePercentCS;
        this.likePercentMath = likePercentMath;
        this.likePercentEng = likePercentEng;
        this.likePercentOther = likePercentOther;
        this.likePercentSE = likePercentSE;
        this.likePercentNE = likePercentNE;
        this.likePercentUS = likePercentUS;
        this.likePercentOut = likePercentOut;
        this.likePercentMusic = likePercentMusic;
        this.likePercentSports = likePercentSports;
        this.likePercentReading = likePercentReading;
        this.likePercentArt = likePercentArt;
    }


    /**
     * Getter method for title
     * 
     * @return title of song
     */
    public String getTitle() {
        return title;
    }


    /**
     * Getter method for artist
     * 
     * @return artist of song
     */
    public String getArtist() {
        return artist;
    }


    /**
     * Getter method for year
     * 
     * @return year song was made
     */
    public String getYear() {
        return year;
    }


    /**
     * Getter method for genre
     * 
     * @return genre of song
     */
    public String getGenre() {
        return genre;
    }


    /**
     * Getter method for heardPercentCS
     * 
     * @return percent heard for cs major
     */
    public double getHeardPercentCS() {
        return heardPercentCS;
    }


    /**
     * Getter method for heardPercentMath
     * 
     * @return percent heard for math major
     */
    public double getHeardPercentMath() {
        return heardPercentMath;
    }


    /**
     * Getter method for heardPercentEng
     * 
     * @return percent heard for other engineering major
     */
    public double getHeardPercentEng() {
        return heardPercentEng;
    }


    /**
     * Getter method for heardPercentOther
     * 
     * @return percent heard for other major
     */
    public double getHeardPercentOther() {
        return heardPercentOther;
    }


    /**
     * Getter method for heardPercentSE
     * 
     * @return percent heard for southeast region
     */
    public double getHeardPercentSE() {
        return heardPercentSE;
    }


    /**
     * Getter method for heardPercentNE
     * 
     * @return percent heard for northeast region
     */
    public double getHeardPercentNE() {
        return heardPercentNE;
    }


    /**
     * Getter method for heardPercentUs
     * 
     * @return percent heard for other region in US
     */
    public double getHeardPercentUS() {
        return heardPercentUS;
    }


    /**
     * Getter method for heardPercentOut
     * 
     * @return percent heard for regions out of US
     */
    public double getHeardPercentOut() {
        return heardPercentOut;
    }


    /**
     * Getter method for heardPercentMusic
     * 
     * @return percent heard for music hobby
     */
    public double getHeardPercentMusic() {
        return heardPercentMusic;
    }


    /**
     * Getter method for heardPercentSports
     * 
     * @return percent heard for sports hobby
     */
    public double getHeardPercentSports() {
        return heardPercentSports;
    }


    /**
     * Getter method for heardPercentArt
     * 
     * @return percent heard for art hobby
     */
    public double getHeardPercentArt() {
        return heardPercentArt;
    }


    /**
     * Getter method for heardPercentReading
     * 
     * @return percent heard for reading hobby
     */
    public double getHeardPercentReading() {
        return heardPercentReading;
    }


    /**
     * Getter method for likePercentCS
     * 
     * @return percent like for cs major
     */
    public double getLikePercentCS() {
        return likePercentCS;
    }


    /**
     * Getter method for likePercentMath
     * 
     * @return percent like for math major
     */
    public double getLikePercentMath() {
        return likePercentMath;
    }


    /**
     * Getter method for likePercentEng
     * 
     * @return percent like for other engineering major
     */
    public double getLikePercentEng() {
        return likePercentEng;
    }


    /**
     * Getter method for likePercentOther
     * 
     * @return percent like for other major
     */
    public double getLikePercentOther() {
        return likePercentOther;
    }


    /**
     * Getter method for likePercentSE
     * 
     * @return percent like for southeast region
     */
    public double getLikePercentSE() {
        return likePercentSE;
    }


    /**
     * Getter method for likePercentNE
     * 
     * @return percent like for northeast region
     */
    public double getLikePercentNE() {
        return likePercentNE;
    }


    /**
     * Getter method for likePercentUs
     * 
     * @return percent like for other region in US
     */
    public double getLikePercentUS() {
        return likePercentUS;
    }


    /**
     * Getter method for likePercentOut
     * 
     * @return percent like for regions out of US
     */
    public double getLikePercentOut() {
        return likePercentOut;
    }


    /**
     * Getter method for likePercentMusic
     * 
     * @return percent like for music hobby
     */
    public double getLikePercentMusic() {
        return likePercentMusic;
    }


    /**
     * Getter method for likePercentSports
     * 
     * @return percent like for sports hobby
     */
    public double getLikePercentSports() {
        return likePercentSports;
    }


    /**
     * Getter method for likePercentArt
     * 
     * @return percent like for art hobby
     */
    public double getLikePercentArt() {
        return likePercentArt;
    }


    /**
     * Getter method for likePercentReading
     * 
     * @return percent like for reading hobby
     */
    public double getLikePercentReading() {
        return likePercentReading;
    }


    /**
     * setter method for heardPercentCS
     * 
     * @param heardPercentCS
     *            heard for cs major
     */
    public void setHeardPercentCS(double heardPercentCS) {
        this.heardPercentCS = heardPercentCS;
    }


    /**
     * Setter method for heardPercentMath
     * 
     * @param heardPercentMath
     *            heard for math major
     */
    public void setHeardPercentMath(double heardPercentMath) {
        this.heardPercentMath = heardPercentMath;
    }


    /**
     * Setter method for heardPercentEng
     * 
     * @param heardPercentEng
     *            heard for other engineering major
     */
    public void setHeardPercentEng(double heardPercentEng) {
        this.heardPercentEng = heardPercentEng;
    }


    /**
     * Setter method for heardPercentOther
     * 
     * @param heardPercentOther
     *            heard for other major
     */
    public void setHeardPercentOther(double heardPercentOther) {
        this.heardPercentOther = heardPercentOther;
    }


    /**
     * Setter method for heardPercentSE
     * 
     * @param heardPercentSE
     *            heard for southeast region
     */
    public void setHeardPercentSE(double heardPercentSE) {
        this.heardPercentSE = heardPercentSE;
    }


    /**
     * Setter method for heardPercentNE
     * 
     * @param heardPercentNE
     *            heard for northeast region
     */
    public void setHeardPercentNE(double heardPercentNE) {
        this.heardPercentNE = heardPercentNE;
    }


    /**
     * Setter method for heardPercentUs
     * 
     * @param heardPercentUS
     *            heard for other region in US
     */
    public void setHeardPercentUS(double heardPercentUS) {
        this.heardPercentUS = heardPercentUS;
    }


    /**
     * Setter method for heardPercentOut
     * 
     * @param heardPercentOut
     *            heard for regions out of US
     */
    public void setHeardPercentOut(double heardPercentOut) {
        this.heardPercentOut = heardPercentOut;
    }


    /**
     * Setter method for heardPercentMusic
     * 
     * @param heardPercentMusic
     *            heard for music hobby
     */
    public void setHeardPercentMusic(double heardPercentMusic) {
        this.heardPercentMusic = heardPercentMusic;
    }


    /**
     * Setter method for heardPercentSports
     * 
     * @param heardPercentSports
     *            heard for sports hobby
     */
    public void setHeardPercentSports(double heardPercentSports) {
        this.heardPercentSports = heardPercentSports;
    }


    /**
     * Setter method for heardPercentArt
     * 
     * @param heardPercentArt
     *            heard for art hobby
     */
    public void setHeardPercentArt(double heardPercentArt) {
        this.heardPercentArt = heardPercentArt;
    }


    /**
     * Setter method for heardPercentReading
     * 
     * @param heardPercentReading
     *            heard for reading hobby
     */
    public void setHeardPercentReading(double heardPercentReading) {
        this.heardPercentReading = heardPercentReading;
    }


    /**
     * Setter method for likePercentCS
     * 
     * @param likePercentCS
     *            like for cs major
     */
    public void setLikePercentCS(double likePercentCS) {
        this.likePercentCS = likePercentCS;
    }


    /**
     * Setter method for likePercentMath
     * 
     * @param likePercentMath
     *            like for math major
     */
    public void setLikePercentMath(double likePercentMath) {
        this.likePercentMath = likePercentMath;
    }


    /**
     * Setter method for likePercentEng
     * 
     * @param likePercentEng
     *            like for other engineering major
     */
    public void setLikePercentEng(double likePercentEng) {
        this.likePercentEng = likePercentEng;
    }


    /**
     * Setter method for likePercentOther
     * 
     * @param likePercentOther
     *            like for other major
     */
    public void setLikePercentOther(double likePercentOther) {
        this.likePercentOther = likePercentOther;
    }


    /**
     * Setter method for likePercentSE
     * 
     * @param likePercentSE
     *            like for southeast region
     */
    public void setLikePercentSE(double likePercentSE) {
        this.likePercentSE = likePercentSE;
    }


    /**
     * Setter method for likePercentNE
     * 
     * @param likePercentNE
     *            like for northeast region
     */
    public void setLikePercentNE(double likePercentNE) {
        this.likePercentNE = likePercentNE;
    }


    /**
     * Setter method for likePercentUs
     * 
     * @param likePercentUS
     *            like for other region in US
     */
    public void setLikePercentUS(double likePercentUS) {
        this.likePercentUS = likePercentUS;
    }


    /**
     * Setter method for likePercentOut
     * 
     * @param likePercentOut
     *            like for regions out of US
     */
    public void setLikePercentOut(double likePercentOut) {
        this.likePercentOut = likePercentOut;
    }


    /**
     * Setter method for likePercentMusic
     * 
     * @param likePercentMusic
     *            like for music hobby
     */
    public void setLikePercentMusic(double likePercentMusic) {
        this.likePercentMusic = likePercentMusic;
    }


    /**
     * Setter method for likePercentSports
     * 
     * @param likePercentSports
     *            like for sports hobby
     */
    public void setLikePercentSports(double likePercentSports) {
        this.likePercentSports = likePercentSports;
    }


    /**
     * Setter method for likePercentArt
     * 
     * @param likePercentArt
     *            like for art hobby
     */
    public void setLikePercentArt(double likePercentArt) {
        this.likePercentArt = likePercentArt;
    }


    /**
     * Setter method for heardPercentReading
     * 
     * @param likePercentReading
     *            heard for reading hobby
     */
    public void setLikePercentReading(double likePercentReading) {
        this.likePercentReading = likePercentReading;
    }


    /**
     * Setter method for artist
     * 
     * @param artist
     *            new artist to set to
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }


    /**
     * Setter method for year
     * 
     * @param year
     *            new year to set to
     */
    public void setYear(String year) {
        this.year = year;
    }


    /**
     * Setter method for title
     * 
     * @param title
     *            new title to set to
     */
    public void setTitle(String title) {
        this.title = title;
    }


    /**
     * Setter method for genre
     * 
     * @param genre
     *            new genre to set to
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }


    /**
     * Compare method for title
     * 
     * @param other
     *            Song comparing to
     * @return positive number if greater
     *         zero if equal
     *         negative if less than
     */
    public int compareTitle(Song other) {
        return this.title.compareTo(other.getTitle());
    }


    /**
     * Compare method for artist
     * 
     * @param other
     *            Song comparing to
     * @return positive number if greater
     *         zero if equal
     *         negative if less than
     */
    public int compareArtist(Song other) {
        return this.artist.compareTo(other.getArtist());
    }


    /**
     * Compare method for genre
     * 
     * @param other
     *            Song comparing to
     * @return positive number if greater
     *         zero if equal
     *         negative if less than
     */
    public int compareGenre(Song other) {
        return this.genre.compareTo(other.getGenre());
    }


    /**
     * Compare method for year
     * 
     * @param other
     *            Song comparing to
     * @return positive number if greater
     *         zero if equal
     *         negative if less than
     */
    public int compareYear(Song other) {
        return this.year.compareTo(other.getYear());
    }


    /**
     * Represents Song as a string
     * 
     * @return string representation
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(title + " ");
        builder.append(artist + " ");
        builder.append(year + " ");
        builder.append(genre + " ");
        // majors
        builder.append("CS Heard " + heardPercentCS);
        builder.append(" CS Like " + likePercentCS);
        builder.append(" Math Heard " + heardPercentMath);
        builder.append(" Math Like " + likePercentMath);
        builder.append(" Eng Heard " + heardPercentEng);
        builder.append(" Eng Like " + likePercentEng);
        builder.append(" Other Heard " + heardPercentOther);
        builder.append(" Other Like " + likePercentOther);
        // regions
        builder.append(" SE Heard " + heardPercentSE);
        builder.append(" SE Like " + likePercentSE);
        builder.append(" NE Heard " + heardPercentNE);
        builder.append(" NE Like " + likePercentNE);
        builder.append(" US Heard " + heardPercentUS);
        builder.append(" US Like " + likePercentUS);
        builder.append(" Out Heard " + heardPercentOut);
        builder.append(" Out Like " + likePercentOut);
        // hobbies
        builder.append(" Music Heard " + heardPercentMusic);
        builder.append(" Music Like " + likePercentMusic);
        builder.append(" Sports Heard " + heardPercentSports);
        builder.append(" Sports Like " + likePercentSports);
        builder.append(" Art Heard " + heardPercentArt);
        builder.append(" Art Like " + likePercentArt);
        builder.append(" Reading Heard " + heardPercentReading);
        builder.append(" Reading Like " + likePercentReading + "\n");
        return builder.toString();
    }
}
