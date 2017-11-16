package prj5;

public class Song {
    private String title;
    private String artist;
    private String year;
    private String genre;
    public Song(String title, String artist, String year, String genre) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
    }
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public String getYear() {
        return year;
    }
    public String getGenre() {
        return genre;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
