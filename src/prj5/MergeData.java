package prj5;

public class MergeData {
    private LinkedList<Glyph> hobbyList;
    private LinkedList<Glyph> majorList;
    private LinkedList<Glyph> regionList;
    private LinkedList<String> hobbies = new LinkedList<String>();
    private LinkedList<String> majors = new LinkedList<String>();
    private LinkedList<String> regions = new LinkedList<String>();


    public MergeData(LinkedList<Song> s, LinkedList<Response> r) {
        makeLists();
        LinkedList<Double> readHeardPercent = new LinkedList<Double>();
        LinkedList<Double> readLikePercent = new LinkedList<Double>();
        LinkedList<Double> musicHeardPercent = new LinkedList<Double>();
        LinkedList<Double> musicLikePercent = new LinkedList<Double>();
        LinkedList<Double> sportsHeardPercent = new LinkedList<Double>();
        LinkedList<Double> sportsLikePercent = new LinkedList<Double>();
        LinkedList<Double> artHeardPercent = new LinkedList<Double>();
        LinkedList<Double> artLikePercent = new LinkedList<Double>();
        LinkedList<Double> csHeardPercent = new LinkedList<Double>();
        LinkedList<Double> csLikePercent = new LinkedList<Double>();
        LinkedList<Double> mathHeardPercent = new LinkedList<Double>();
        LinkedList<Double> mathLikePercent = new LinkedList<Double>();
        LinkedList<Double> engHeardPercent = new LinkedList<Double>();
        LinkedList<Double> engLikePercent = new LinkedList<Double>();
        LinkedList<Double> otherHeardPercent = new LinkedList<Double>();
        LinkedList<Double> otherLikePercent = new LinkedList<Double>();
        LinkedList<Double> northHeardPercent = new LinkedList<Double>();
        LinkedList<Double> northLikePercent = new LinkedList<Double>();
        LinkedList<Double> southHeardPercent = new LinkedList<Double>();
        LinkedList<Double> southLikePercent = new LinkedList<Double>();
        LinkedList<Double> usHeardPercent = new LinkedList<Double>();
        LinkedList<Double> usLikePercent = new LinkedList<Double>();
        LinkedList<Double> outHeardPercent = new LinkedList<Double>();
        LinkedList<Double> outLikePercent = new LinkedList<Double>();
        for (int j = 0; j < s.size(); j++) {
            double readHeardCount = 0;
            double readLikeCount = 0;
            double musicHeardCount = 0;
            double musicLikeCount = 0;
            double sportsHeardCount = 0;
            double sportsLikeCount = 0;
            double artHeardCount = 0;
            double artLikeCount = 0;
            double csHeardCount = 0;
            double csLikeCount = 0;
            double mathHeardCount = 0;
            double mathLikeCount = 0;
            double engHeardCount = 0;
            double engLikeCount = 0;
            double otherHeardCount = 0;
            double otherLikeCount = 0;
            double northHeardCount = 0;
            double northLikeCount = 0;
            double southHeardCount = 0;
            double southLikeCount = 0;
            double usHeardCount = 0;
            double usLikeCount = 0;
            double outHeardCount = 0;
            double outLikeCount = 0;
            
            for (int i = 0; i < r.size(); i++) {
                // for hobbies.size()
                for (int k = 0; k < hobbies.size(); k++) {
                    if (r.get(i).getHobby().equals("reading")) {
                        if(r.get(i).getHeardSongList().get(i).equals("Yes")) {
                            readHeardCount++;
                            
                        }
                        if(r.get(i).getLikesSongList().get(i).equals("Yes")) {
                            readLikeCount++;
                        }
                        
        
                    }
                    if (r.get(i).getHobby().equals("reading")) {
                        if(r.get(i).getHeardSongList().get(i).equals("Yes")) {
                            readHeardCount++;
                            
                        }
                        if(r.get(i).getLikesSongList().get(i).equals("Yes")) {
                            readLikeCount++;
                        }
                        
        
                    }
                    if (r.get(i).getHobby().equals("reading")) {
                        if(r.get(i).getHeardSongList().get(i).equals("Yes")) {
                            readHeardCount++;
                            
                        }
                        if(r.get(i).getLikesSongList().get(i).equals("Yes")) {
                            readLikeCount++;
                        }
                        
        
                    }
                    if (r.get(i).getHobby().equals("reading")) {
                        if(r.get(i).getHeardSongList().get(i).equals("Yes")) {
                            readHeardCount++;
                            
                        }
                        if(r.get(i).getLikesSongList().get(i).equals("Yes")) {
                            readLikeCount++;
                        }
                        
        
                    }
                }
                for (int k=0; k< majors.size(); k++) {
                    
                }
                for (int k=0; k<regions.size(); k++) {
                    
                }
                // Need to specify major, hobby, region for each response
                // If response in hasHeardList is Yes
                if (r.get(i).getHeardSongList().get(i).equals("Yes")) {
                    heardCount++;
                }
                // If response in doesLikeList is Yes
                if (r.get(i).getLikesSongList().get(i).equals("Yes")) {
                    likeCount++;
                }

            }
            Double heardPercentage = heardCount / r.size();
            heardPercent.add(heardPercentage);
            Double likePercentage = likeCount / heardCount;
            likePercent.add(likePercentage);
        }
        for (int i = 0; i < s.size(); i++) {
            for (int j = 0; j < r.size(); j++) {
                Glyph hobby = new Glyph(r.get(j).getHobby(), s.get(i),
                    heardPercent.get(i), likePercent.get(i));
                Glyph major = new Glyph(r.get(j).getMajor(), s.get(i),
                    heardPercent.get(i), likePercent.get(i));
                Glyph region = new Glyph(r.get(j).getRegion(), s.get(i),
                    heardPercent.get(i), likePercent.get(i));
                hobbyList.add(hobby);
                majorList.add(major);
                regionList.add(region);
            }
        }

    }


    private void makeLists() {
        hobbies.add("art");
        hobbies.add("reading");
        hobbies.add("music");
        hobbies.add("sports");
        majors.add("Computer Science");
        majors.add("Math or CMDA");
        majors.add("Other Engineering");
        majors.add("Other");
        regions.add("Southeast");
        regions.add("Northeast");
        regions.add("United States (other than Southeast or Northwest)");
        regions.add("Outside of United States");
    }


    public LinkedList<Glyph> getHobbyGlyphs() {
        return hobbyList;
    }


    public LinkedList<Glyph> getMajorGlyphs() {
        return majorList;
    }


    public LinkedList<Glyph> getRegionGlyphs() {
        return regionList;
    }

}
