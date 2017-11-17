package prj5;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 * Class that reads the file data
 * @author Eddie Dean
 * @author Matthew Marquez (mmarquez)
 * @version 2017.11.16
 *
 */
public class ResponseReader {

    private LinkedList<String> hasHeardList;
    private LinkedList<String> doesLikeList;
    public static int NUMBER_OF_SONGS = 46;
    private LinkedList<Song> songList;
    private LinkedList<Response> responseList;

    /**
     * Construtor method for ResponseReader
     * @param responsesFileName
     *      file name for student responses
     * @param songListFileName
     *      file name for songs
     * @throws FileNotFoundException
     *      in case file not found
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
     * @param fileName
     *      the student responses file
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

            if (strings.length > 50) {

                String id = strings[0];
                String date = strings[1];
                String major = strings[2];
                String region = strings[3];
                String hobby = strings[4];

                for (int i = 5; i <= 2 * NUMBER_OF_SONGS + 5; i = i + 2) {
                    scanTwoLines(strings[i], strings[i + 1]);
                }
                responses.add(new Response(id, date, major, region, hobby,
                    hasHeardList, doesLikeList));

            }
        }

        scan.close();
        System.out.println(responses.toString());
        return responses;

    }

    /**
     * helper method that scans two lines 
     * @param firstline
     *      first line of responses
     * @param secondline
     *      second line of responses
     */
    private void scanTwoLines(String firstline, String secondline) {
        hasHeardList = new LinkedList<String>();
        doesLikeList = new LinkedList<String>();
        hasHeardList.add(firstline);
        doesLikeList.add(secondline);

    }

    /**
     * Reads the song file and puts into list
     * @param fileName
     *      song file name
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
        // System.out.println(songs.toString());
        // System.out.println(songs.size());
        return songs;
    }

    /**
     * Getter method for songList
     * @return songList
     *      List containing all songs
     */
    public LinkedList<Song> getSongList() {
        return songList;

    }

    /**
     * Getter method for responseList
     * @return responseList
     *      list containing all responses
     */
    public LinkedList<Response> getResponseList() {
        return responseList;
    }

}
