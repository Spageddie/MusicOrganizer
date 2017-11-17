package prj5;

import java.io.FileNotFoundException;


public class Input {
    
    public Input() {
        // Intentionally left empty
    }

    public static void main(String[] args)
        throws FileNotFoundException {
        
        ResponseReader reader = new ResponseReader("MusicSurveyData.csv", "SongList.csv");
        MergeData merger = new MergeData(reader.getResponseList(), reader.getSongList());
        System.out.println(merger.getHobbyGlyphs());
    }
}
