package prj5;

import java.io.FileNotFoundException;

/**
 * Class to run project
 * @author Eddie Dean
 * @author Matthew Marquez (mmarquez)
 * @version 2017.11.16
 *
 */
public class Input {
    /**
     * Empty constructor for input
     */
    public Input() {
        // Intentionally left empty
    }
    /**
     * Main method for class
     * @param args
     *      arguments
     * @throws FileNotFoundException
     */
    public static void main(String[] args)
        throws FileNotFoundException {
        
        ResponseReader reader = new ResponseReader("MusicSurveyData.csv", "SongList.csv");
        //MergeData merger = new MergeData(reader.getResponseList(), reader.getSongList());
        //System.out.println(merger.getHobbyGlyphs());
    }
}
