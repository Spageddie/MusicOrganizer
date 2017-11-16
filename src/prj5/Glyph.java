package prj5;

public class Glyph {
    private String representation;
    private Song song;
    private double heard;
    private double like;
    public Glyph(String specificRepresentation, Song songName, double heardPercentage, double likedPercentage) {
        representation = specificRepresentation;
        song = songName;
        heard = heardPercentage;
        like = likedPercentage;
    }
    public double getHeard() {
        return heard;
    }
    public double getLike() {
        return like;
    }
    public Song getSong() {
        return song;
    }
    public String getRepresentation() {
        return representation;
    }
    public String toString() {
        StringBuilder builder = new StringBuilder();
        return "";
    }
    

    

}
