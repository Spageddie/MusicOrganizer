package prj5;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.text.ParseException;

public class ResponseReader {

    private LinkedList<String> hasHeardList;
    private LinkedList<String> doesLikeList;
    public static int NUMBER_OF_SONGS = 46;


    public ResponseReader(String responsesFileName, String songListFileName) 
        throws FileNotFoundException, ParseException{
        
        LinkedList<Song> songList = new LinkedList<Song>();
        LinkedList<Response> responseList = new LinkedList<Response>();

        if (responsesFileName == null) {
            throw new IllegalArgumentException();
        }
        responseList = readResponses(responsesFileName);
        songList = readSongs(songListFileName);
    }



    public LinkedList<Response> readResponses(String fileName) 
        throws FileNotFoundException{
        LinkedList<Response> responses = new LinkedList<Response>();

        Scanner scan = new Scanner(new File(fileName));
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String [] strings  = line.split("\\s*,\\s*");
            String id = strings[0];
            String date = strings[1];
            String major = strings[2];
            String region = strings[3];
            String hobby = strings[4];
            for (int i = 5; i <= (NUMBER_OF_SONGS/2); i = i + 2) {
                scanTwoLines(strings[i], strings[i+1]);
            }
            responses.add(new Response(id, date, major, region, hobby, hasHeardList, doesLikeList));


        }
        scan.close();
        return responses;
    }


    private void scanTwoLines(String firstline, String secondline) {
        hasHeardList = new LinkedList<String>();
        doesLikeList = new LinkedList<String>();
        hasHeardList.add(firstline);
        doesLikeList.add(secondline);
    }
    
    
    
    
    public LinkedList<Song> readSongs(String fileName) 
    throws FileNotFoundException {
        
        LinkedList<Song> songs = new LinkedList<Song>();
        
        Scanner scan = new Scanner(new File(fileName));
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

}
