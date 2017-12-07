package prj5;

import java.io.FileNotFoundException;

/**
 * Does the calculations for the data
 * 
 * @author Matthew Marquez (mmarquez)
 * @version 2017.12.06
 *
 */
public class DataHandler {
    private ResponseReader reader;
    private LinkedList<Song> songList;
    private LinkedList<Response> responseList;

    /**
     * Constructor for DataHandler
     */
    public DataHandler(String responsesFileName, String songListFileName)
        throws FileNotFoundException {
        reader = new ResponseReader(responsesFileName, songListFileName);
        songList = reader.getSongList();
        responseList = reader.getResponseList();
    }

    /**
     * Method that uses helper method to add all percentages to a song
     */
    public void updateSongs() {
        for (int i = 0; i < songList.size(); i++) {
            findPercentageOfSong(i);
        }
    }

    /**
     * Getter method for songList
     * @return songList
     */
    public LinkedList<Song> getSongList() {
        return songList;
    }

    /**
     * Getter method for responseList
     * @return responseList
     */
    public LinkedList<Response> getResponseList() {
        return responseList;
    }


    /**
     * Finds percentages of all majors, regions, and hobbies for one song at
     * specified index
     * @param the index of the song you are finding percentage of
     */
    public void findPercentageOfSong(int songNumber) {
        double totalCS = 0;
        double totalMath = 0;
        double totalEng = 0;
        double totalOther = 0;
        double totalSE = 0;
        double totalNE = 0;
        double totalUS = 0;
        double totalOut = 0;
        double totalMusic = 0;
        double totalSports = 0;
        double totalArt = 0;
        double totalReading = 0;
        int heardCountCS = 0;
        int heardCountMath = 0;
        int heardCountEng = 0;
        int heardCountOther = 0;
        int heardCountSE = 0;
        int heardCountNE = 0;
        int heardCountUS = 0;
        int heardCountOut = 0;
        int heardCountMusic = 0;
        int heardCountSports = 0;
        int heardCountArt = 0;
        int heardCountReading = 0;
        int likeCountCS = 0;
        int likeCountMath = 0;
        int likeCountEng = 0;
        int likeCountOther = 0;
        int likeCountSE = 0;
        int likeCountNE = 0;
        int likeCountUS = 0;
        int likeCountOut = 0;
        int likeCountMusic = 0;
        int likeCountSports = 0;
        int likeCountArt = 0;
        int likeCountReading = 0;
        //For every response
        for (int i = 0; i < responseList.size(); i++) {
            String major = responseList.get(i).getMajor();
            String region = responseList.get(i).getRegion();
            String hobby = responseList.get(i).getHobby();
            // Adding to total count for specification
            // majors
            if (major.equals("Computer Science")) {
                totalCS++;
            }
            else if (major.equals("Math or CMDA")) {
                totalMath++;
            }
            else if (major.equals("Other Engineering")) {
                totalEng++;
            }
            else if (major.equals("Other")) {
                totalOther++;
            }
            // regions
            if (region.equals("Southeast")) {
                totalSE++;
            }
            else if (region.equals("Northeast")) {
                totalNE++;
            }
            else if (region.equals(
                "United States (other than Southeast or Northwest)")) {
                totalUS++;
            }
            else if (region.equals("Outside of United States")) {
                totalOut++;
            }
            // hobbies
            if (hobby.equals("music")) {
                totalMusic++;
            }
            else if (hobby.equals("sports")) {
                totalSports++;
            }
            else if (hobby.equals("reading")) {
                totalReading++;
            }
            else if (hobby.equals("art")) {
                totalArt++;
            }
            // If they responded that they heard the song
            if (responseList.get(i).getHeardSongList().get(songNumber).equals(
                "Yes")) {
                // increment corresponding heard count

                // majors
                if (major.equals("Computer Science")) {
                    heardCountCS++;
                }
                else if (major.equals("Math or CMDA")) {
                    heardCountMath++;
                }
                else if (major.equals("Other Engineering")) {
                    heardCountEng++;
                }
                else if(major.equals("Other")) {
                    heardCountOther++;
                }
                // regions
                if (region.equals("Southeast")) {
                    heardCountSE++;
                }
                else if (region.equals("Northeast")) {
                    heardCountNE++;
                }
                else if (region.equals(
                    "United States (other than Southeast or Northwest)")) {
                    heardCountUS++;
                }
                else if (region.equals("Outside of United States")) {
                    heardCountOut++;
                }
                // hobbies
                if (hobby.equals("music")) {
                    heardCountMusic++;
                }
                else if (hobby.equals("sports")) {
                    heardCountSports++;
                }
                else if (hobby.equals("reading")) {
                    heardCountReading++;
                }
                else if (hobby.equals("art")) {
                    heardCountArt++;
                }

                // If they responded to yes they liked the song
                if (responseList.get(i).getLikesSongList().get(songNumber)
                    .equals("Yes")) {
                    // increment corresponding like count

                    // majors
                    if (major.equals("Computer Science")) {
                        likeCountCS++;
                    }
                    else if (major.equals("Math or CMDA")) {
                        likeCountMath++;
                    }
                    else if (major.equals("Other Engineering")) {
                        likeCountEng++;
                    }
                    else if (major.equals("Other")) {
                        likeCountOther++;
                    }
                    // regions
                    if (region.equals("Southeast")) {
                        likeCountSE++;
                    }
                    else if (region.equals("Northeast")) {
                        likeCountNE++;
                    }
                    else if (region.equals(
                        "United States (other than Southeast or Northwest)")) {
                        likeCountUS++;
                    }
                    else if (region.equals("Outside of United States")) {
                        likeCountOut++;
                    }
                    // hobbies
                    if (hobby.equals("music")) {
                        likeCountMusic++;
                    }
                    else if (hobby.equals("sports")) {
                        likeCountSports++;
                    }
                    else if (hobby.equals("reading")) {
                        likeCountReading++;
                    }
                    else if (hobby.equals("art")) {
                        likeCountArt++;
                    }
                }
            }
        }
        // finding major percentages
        double percentageHeardCS = heardCountCS / totalCS;
        double percentageLikeCS = likeCountCS / totalCS;
        double percentageHeardMath = heardCountMath / totalMath;
        double percentageLikeMath = likeCountMath / totalMath;
        double percentageHeardEng = heardCountEng / totalEng;
        double percentageLikeEng = likeCountEng / totalEng;
        double percentageHeardOther = heardCountOther / totalOther;
        double percentageLikeOther = likeCountOther / totalOther;

        // finding region percentages
        double percentageHeardSE = heardCountSE / totalSE;
        double percentageLikeSE = likeCountSE / totalSE;
        double percentageHeardNE = heardCountNE / totalNE;
        double percentageLikeNE = likeCountNE / totalNE;
        double percentageHeardUS = heardCountUS / totalUS;
        double percentageLikeUS = likeCountUS / totalUS;
        double percentageHeardOut = heardCountOut / totalOut;
        double percentageLikeOut = likeCountOut / totalOut;

        // finding hobby percentages
        double percentageHeardMusic = heardCountMusic / totalMusic;
        double percentageLikeMusic = likeCountMusic / totalMusic;
        double percentageHeardSports = heardCountSports / totalSports;
        double percentageLikeSports = likeCountSports / totalSports;
        double percentageHeardArt = heardCountArt / totalArt;
        double percentageLikeArt = likeCountArt / totalArt;
        double percentageHeardReading = heardCountReading / totalReading;
        double percentageLikeReading = likeCountReading / totalReading;

        // Setting the percentages in song

        // major
        songList.get(songNumber).setHeardPercentCS(percentageHeardCS);
        songList.get(songNumber).setHeardPercentMath(percentageHeardMath);
        songList.get(songNumber).setHeardPercentEng(percentageHeardEng);
        songList.get(songNumber).setHeardPercentOther(percentageHeardOther);
        songList.get(songNumber).setLikePercentCS(percentageLikeCS);
        songList.get(songNumber).setLikePercentMath(percentageLikeMath);
        songList.get(songNumber).setLikePercentEng(percentageLikeEng);
        songList.get(songNumber).setLikePercentOther(percentageLikeOther);

        // region
        songList.get(songNumber).setHeardPercentSE(percentageHeardSE);
        songList.get(songNumber).setHeardPercentNE(percentageHeardNE);
        songList.get(songNumber).setHeardPercentUS(percentageHeardUS);
        songList.get(songNumber).setHeardPercentOut(percentageHeardOut);
        songList.get(songNumber).setLikePercentSE(percentageLikeSE);
        songList.get(songNumber).setLikePercentNE(percentageLikeNE);
        songList.get(songNumber).setLikePercentUS(percentageLikeUS);
        songList.get(songNumber).setLikePercentOut(percentageLikeOut);

        // hobby
        songList.get(songNumber).setHeardPercentMusic(percentageHeardMusic);
        songList.get(songNumber).setHeardPercentSports(percentageHeardSports);
        songList.get(songNumber).setHeardPercentArt(percentageHeardArt);
        songList.get(songNumber).setHeardPercentReading(percentageHeardReading);
        songList.get(songNumber).setLikePercentMusic(percentageLikeMusic);
        songList.get(songNumber).setLikePercentSports(percentageLikeSports);
        songList.get(songNumber).setLikePercentArt(percentageLikeArt);
        songList.get(songNumber).setLikePercentReading(percentageLikeReading);
    }

}
