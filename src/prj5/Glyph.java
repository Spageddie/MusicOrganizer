package prj5;

public class Glyph {
    private String representation;
    private Song song;
    private double heard;
    private double like;
    public Glyph(String r, Song s, double h, double l) {
        representation = r;
        song = s;
        heard = h;
        like = l;
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
    

}
