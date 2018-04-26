package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Iterator;

/**
 * Input class that reads files
 * 
 * @author Chanaka Perera(chanaka1)
 * @author Eddie Bolton(eddie5)
 * @version 2018.4.9
 *
 */
public class Input {

    private SongListHandler songs;


    /**
     * Input's constructor
     * 
     * @param songFile
     *            The file containing the data for the music
     * @param responseFile
     *            The file containing the list of responses
     * @throws FileNotFoundException
     */
    public Input(String responseFile, String songFile)
        throws FileNotFoundException {
        // Initiates a new linked list of songs
        songs = new SongListHandler();
        // Uses a helper method to read the list of
        // songs and responses then sorts the data accordingly
        readSongList(songFile);
        readMusicSurveyData(responseFile);
        // After extracting the data from both files as needed
        // creates a new window with the songs variable as the input
        new GUI_Window(songs);

    }


    /**
     * main method that reads files
     * 
     * @param args
     *            of the files read
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // If the user specifies 2 custom files sets the input files
        // to the user specified ones
        if (args.length == 2) {
            new Input(args[0], args[1]);
        }
        // If these values are not specified this method uses the default
        // ones
        else {
            new Input("MusicSurveyData2018S.csv", "SongList2018S.csv");
        }
    }


    /**
     * Reads data on the song list
     * 
     * @param fileName
     *            of song read
     * @throws FileNotFoundException
     */
    public void readSongList(String fileName) throws FileNotFoundException {
        // Initializes a new Scanner object
        Scanner scanner = null;
        boolean halter = true;
        try {
            scanner = new Scanner(new File(fileName));
        }
        // Throws an exception if the file is not found
        catch (FileNotFoundException e) {
            e.printStackTrace();
            halter = false;
        }

        // If the file is found and is valid
        if (halter && fileName != null) {
            // Gets the needed values from the input file
            String[] params;
            scanner.nextLine();
            // Iterates through all the lines in the input file
            while (scanner.hasNextLine()) {
                params = scanner.nextLine().trim().split(",");
                // If the 4 values are valid then adds the song
                // with the needed values to the linked List
                if (params.length == 4) {
                    songs.add(new Song(params[0], params[1], params[2],
                        params[3]));
                }
            }
            scanner.close();
        }

    }


    /**
     * Reads the data on the survey
     * 
     * @param fileName
     *            of file read
     * @throws FileNotFoundException
     */
    public void readMusicSurveyData(String fileName)
        throws FileNotFoundException {
        Scanner scanner = null;
        boolean halter = true;
        // Throws an exception if the input file is not
        // valid
        try {
            scanner = new Scanner(new File(fileName));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            halter = false;
        }

        // If the input file is valid
        if (halter && fileName != null) {
            scanner.nextLine();
            // Iterates through all the lines in the file
            while (scanner.hasNextLine()) {
                // Gets one line and extracts the needed information
                String[] params = scanner.nextLine().split(",");
                String major = params[2];
                String region = params[3];
                String hobby = params[4];
                // If one of the variables in one line is left blank then
                // the response is considered invalid and goes to the next
                // line
                while (major.length() == 0 || region.length() == 0 || hobby
                    .length() == 0) {
                    params = scanner.nextLine().split(",");
                    major = params[2];
                    region = params[3];
                    hobby = params[4];
                }
                int majorIndex = 0;
                int regionIndex = 0;
                int hobbyIndex = 0;

                // Based on the values of the response sets the indexes
                // for updating the integer arrays of the song object
                // accordingly
                if (major.contains("Math or CMDA")) {
                    majorIndex = 0;
                }
                else if (major.contains("Computer Science")) {
                    majorIndex = 2;
                }
                else if (major.contains("Other Engineering")) {
                    majorIndex = 4;
                }
                else if (major.contains("Other")) {
                    majorIndex = 6;
                }

                if (region.equals("Northeast")) {
                    regionIndex = 0;
                }
                else if (region.equals("Southeast")) {
                    regionIndex = 2;
                }
                else if (region.contains("other than Southeast or Northwest")) {
                    regionIndex = 4;
                }
                else if (region.contains("Outside of United States")) {
                    regionIndex = 6;
                }

                if (hobby.contains("reading")) {
                    hobbyIndex = 0;
                }
                else if (hobby.contains("art")) {
                    hobbyIndex = 2;
                }
                else if (hobby.contains("sports")) {
                    hobbyIndex = 4;
                }
                else if (hobby.contains("music")) {
                    hobbyIndex = 6;
                }

                // This iterates through all the songs in the linked list of
                // songs
                // that is generated from reading the input file
                Iterator<Song> iter = songs.iterator();
                while (iter.hasNext()) {
                    for (int i = 5; i < params.length - 1; i = i + 2) {
                        Song song = iter.next();
                        // If the response is yes it updates the integer array
                        // for the
                        // song object accordingly
                        if (params[i].equals("Yes")) {

                            song.updateHeardHobby(hobbyIndex + 1);
                            song.updateHeardHobby(hobbyIndex);
                            song.updateHeardMajor(majorIndex);
                            song.updateHeardMajor(majorIndex + 1);
                            song.updateHeardRegion(regionIndex);
                            song.updateHeardRegion(regionIndex + 1);

                        }

                        // If the response is no then it updates the integer
                        // array containing
                        // the total for that index
                        else if (params[i].equals("No")) {
                            song.updateHeardHobby(hobbyIndex + 1);
                            song.updateHeardMajor(majorIndex + 1);
                            song.updateHeardRegion(regionIndex + 1);
                        }

                        // This follows the same logic but updates the integer
                        // array related
                        // to the number of likes
                        if (params[i + 1].equals("Yes")) {
                            song.updateLikedHobby(hobbyIndex + 1);
                            song.updateLikedHobby(hobbyIndex);
                            song.updateLikedMajor(majorIndex);
                            song.updateLikedMajor(majorIndex + 1);
                            song.updateLikedRegion(regionIndex);
                            song.updateLikedRegion(regionIndex + 1);

                        }

                        // This does the same thing but updates differently when
                        // the repsonse is
                        // a "no"
                        else if (params[i + 1].equals("No")) {
                            song.updateLikedHobby(hobbyIndex + 1);
                            song.updateLikedMajor(majorIndex + 1);
                            song.updateLikedRegion(regionIndex + 1);
                        }

                    }

                }

            }

        }
    }
}
