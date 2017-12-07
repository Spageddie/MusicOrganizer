package prj5;

/**
 * Response object that represents the student's responses
 * 
 * @author Eddie Dean
 * @author Matthew Marquez (mmarquez)
 * @version 2017.11.16
 *
 */
public class Response {

    private String id;
    private String date;
    private String major;
    private String hobby;
    private String region;
    private LinkedList<String> hasHeardSong;
    private LinkedList<String> likesSong;


    /**
     * Constructor for Response without the linkedLists parameters
     * 
     * @param identification
     * @param dateName
     * @param majorName
     * @param hobbyName
     * @param regionName
     */
    public Response(
        String identification,
        String dateName,
        String majorName,
        String hobbyName,
        String regionName) {
        this.id = identification;
        this.date = dateName;
        this.major = majorName;
        this.hobby = hobbyName;
        this.region = regionName;
        hasHeardSong = new LinkedList();
        likesSong = new LinkedList();
    }


    /**
     * Constructor for Response
     * 
     * @param identification
     *            student identification
     * @param dateName
     *            date student filled out responses
     * @param majorName
     *            student's major
     * @param hobbyName
     *            student's hobby
     * @param regionName
     *            student's region
     * @param HeardSongListForOneResponse
     *            linkedList for student's heard answers
     * @param likesSongListForOneResponse
     *            linkedList for student's liked answers
     */
    public Response(
        String identification,
        String dateName,
        String majorName,
        String hobbyName,
        String regionName,
        LinkedList<String> HeardSongListForOneResponse,
        LinkedList<String> likesSongListForOneResponse) {

        id = identification;
        date = dateName;
        major = majorName;
        hobby = hobbyName;
        region = regionName;
        hasHeardSong = HeardSongListForOneResponse;
        likesSong = likesSongListForOneResponse;

    }


    /**
     * Getter for id
     * 
     * @return student identification
     */
    public String getId() {
        return id;
    }


    /**
     * Getter for date
     * 
     * @return date completed
     */
    public String getDate() {
        return date;
    }


    /**
     * Getter for major
     * 
     * @return major of student
     */
    public String getMajor() {
        return major;
    }


    /**
     * Getter for hobby
     * 
     * @return hobby of student
     */
    public String getHobby() {
        return hobby;
    }


    /**
     * Getter for region
     * 
     * @return region of student
     */
    public String getRegion() {
        return region;
    }


    /**
     * Getter for hasHeardSong
     * 
     * @return linkedList of student heard responses
     */
    public LinkedList<String> getHeardSongList() {
        return hasHeardSong;
    }


    /**
     * Getter for likesSong
     * 
     * @return linkedList of student like responses
     */
    public LinkedList<String> getLikesSongList() {
        return likesSong;
    }


    /**
     * Returns representation of Response as string
     * 
     * @return string representation
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(id + " ");
        builder.append(date + " ");
        builder.append(major + " ");
        builder.append(hobby + " ");
        builder.append(region + " ");
        builder.append(hasHeardSong.toString() + " ");
        builder.append(likesSong.toString());
        return builder.toString();
    }
}
