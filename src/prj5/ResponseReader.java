package prj5;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * Class that reads the file data
 * 
 * @author Eddie Dean
 * @author Matthew Marquez (mmarquez)
 * @version 2017.11.16
 *
 */
public class ResponseReader {

    private LinkedList<String> hasHeardList;
    private LinkedList<String> doesLikeList;
    public static int NUMBER_OF_SONGS = 58;
    private LinkedList<Song> songList;
    private LinkedList<Response> responseList;


    /**
     * Construtor method for ResponseReader
     * 
     * @param responsesFileName
     *            file name for student responses
     * @param songListFileName
     *            file name for songs
     * @throws FileNotFoundException
     *             in case file not found
     */
    public ResponseReader(String responsesFileName, String songListFileName)
        throws FileNotFoundException {

        songList = new LinkedList<Song>();
        responseList = new LinkedList<Response>();

        if (responsesFileName == null) {
            throw new IllegalArgumentException();
        }
        if (songListFileName == null) {
            throw new IllegalArgumentException();
        }
        responseList = readResponses(responsesFileName);
        songList = readSongs(songListFileName);

    }


    /**
     * Method to read responses of students
     * 
     * @param fileName
     *            the student responses file
     * @return linked list containing all responses
     * @throws FileNotFoundException
     */
    public LinkedList<Response> readResponses(String fileName)
        throws FileNotFoundException {
        LinkedList<Response> responses = new LinkedList<Response>();
        if (fileName == null) {
            throw new FileNotFoundException();
        }

        Scanner scan = new Scanner(new File(fileName));
        scan.nextLine();
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] strings = line.split("\\s*,\\s*");
            while (strings.length<=30) {
                line = scan.nextLine();
                strings = line.split("\\s*,\\s*");
            }
            String id = strings[0];
            String date = strings[1];
            String major = strings[2];
            String region = strings[3];
            String hobby = strings[4];
            Response response = new Response(id, date, major, hobby, region);
            responses.add(response);
            for(int i=5; i<strings.length-1; i=i+2) {
                scanTwoLines(strings[i], strings[i+1], response);
            }

        }

        scan.close();
        for (int i=0; i<responses.size(); i++) {
            if (responses.get(i).getHeardSongList().size()<59) {
                responses.remove(i);
            }
            if (responses.get(i).getLikesSongList().size()<59) {
                responses.remove(i);
            }
        }
        return responses;

    }


    /**
     * helper method that scans two columns (both columns correspond to same song)
     * and adds the strings to the corresponding list in response
     * 
     * @param firstColumn
     *            first column of responses
     * @param secondColumn
     *            second column of responses
     */
    private void scanTwoLines(String firstColumn, String secondColumn, Response response) {
        response.getHeardSongList().add(firstColumn);
        response.getLikesSongList().add(secondColumn);

    }


    /**
     * Reads the song file and puts into list
     * 
     * @param fileName
     *            song file name
     * @return linkedlist of songs
     * @throws FileNotFoundException
     */
    public LinkedList<Song> readSongs(String fileName)
        throws FileNotFoundException {

        LinkedList<Song> songs = new LinkedList<Song>();
        if (fileName == null) {
            throw new FileNotFoundException();
        }

        Scanner scan = new Scanner(new File(fileName));
        scan.nextLine();
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] strings = line.split("\\s*,\\s*");
            String songName = strings[0];
            String artist = strings[1];
            String year = strings[2];
            String genre = strings[3];
            songs.add(new Song(songName, artist, year, genre));
        }
        scan.close();
        return songs;
    }


    /**
     * Getter method for songList
     * 
     * @return songList
     *         List containing all songs
     */
    public LinkedList<Song> getSongList() {
        return songList;

    }


    /**
     * Getter method for responseList
     * 
     * @return responseList
     *         list containing all responses
     */
    public LinkedList<Response> getResponseList() {
        return responseList;
    }

}
