package prj5;
/**
 * Class that represents Glyph obects
 * @author Matthe Marquez (mmarquez)
 * @author Eddie Dean
 *
 */
public class Glyph {
    private String representation;
    private Song song;
    private double heard;
    private double like;

    /**
     * Constructor for Glyph Obect
     * @param specificRepresentation
     *      the specific hobby, major, or region
     * @param songName
     *      name of song
     * @param heardPercentage
     *      percentage heard of representation
     * @param likedPercentage
     *      percentage liked of representation
     */
    public Glyph(
        String specificRepresentation,
        Song songName,
        double heardPercentage,
        double likedPercentage) {
        representation = specificRepresentation;
        song = songName;
        heard = heardPercentage;
        like = likedPercentage;
    }

    /**
     * Getter for heard
     * @return percentage heard
     */
    public double getHeard() {
        return heard;
    }

    /**
     * Getter for like
     * @return percentage like
     */
    public double getLike() {
        return like;
    }

    /**
     * Getter for song
     * @return song in glyph
     */
    public Song getSong() {
        return song;
    }

    /**
     * Getter for representation
     * @return representation of glyph
     */
    public String getRepresentation() {
        return representation;
    }

    /**
     * To string method for Glyph
     * @return string representation
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(representation + " ");
        builder.append(song.toString() + " ");
        builder.append(heard + " ");
        builder.append(like + " ");
        return builder.toString();
    }

}
