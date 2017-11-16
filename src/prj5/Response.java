package prj5;

public class Response {
    
    private String id;
    private String date;
    private String major;
    private String hobby;
    private String region;
    private LinkedList<String> hasHeardSong;
    private LinkedList<String> likesSong;
    
    public Response (String identification, String dateName, String majorName,
        String hobbyName, String regionName, LinkedList<String> HeardSongListForOneResponse, LinkedList<String> likesSongListForOneResponse) {
        
        id = identification;
        date = dateName;
        major = majorName;
        hobby = hobbyName;
        region = regionName;
        hasHeardSong = HeardSongListForOneResponse;
        likesSong = likesSongListForOneResponse;
        
        
    }
    
    public String getId() {
        return id;
    }
    
    public String getDate() {
        return date;
    }

    public String getMajor() {
        return major;
    }
    
    public String getHobby() {
        return hobby;
    }
    
    public String getRegion() {
        return region;
    }
    
    public LinkedList<String> getHeardSongList() {
        return hasHeardSong;
    }
    
    public LinkedList<String> getLikesSongList() {
        return likesSong;
    }
}
