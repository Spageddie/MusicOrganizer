package prj5;

import java.awt.Color;
import CS2114.*;

/**
 * 
 * @author Calvin Muramoto
 * @version 2017.12.5
 *
 */
public class DataWindow {
    private LinkedList infoList;
    private LinkedList songList;
    private DataHandler dataHandle;
    private int songNum;
    private Window window;
    private Button previous;
    private Button next;
    private Button artistSort;
    private Button titleSort;
    private Button yearSort;
    private Button genreSort;
    private Button hobbyRep;
    private Button majorRep;
    private Button regionRep;
    private Button quit;
    private Color[] graphColors;
    private Shape legendBar;
    private Shape legendBoxIn;
    private Shape legendBoxOut;
    private TextShape legend;
    private TextShape legendText;
    private TextShape start;
    private TextShape legendSongTitle;
    private TextShape heardLikes;
    private TextShape title;
    private TextShape artist;
    private Shape bar;
    private Shape heard1;
    private Shape heard2;
    private Shape heard3;
    private Shape heard4;
    private Shape liked1;
    private Shape liked2;
    private Shape liked3;
    private Shape liked4;
// private float percentHeard1;
// private float percentHeard2;
// private float percentHeard3;
// private float percentHeard4;
// private float percentLiked1;
// private float percentLiked2;
// private float percentLiked3;
// private float percentLiked4;


    /**
     * 
     */
    public DataWindow(DataHandler da) {
        dataHandle = da;
        songList = dataHandle.getSongList();

        window = new Window("Project5");
        window.setSize(900, 600);

        start = new TextShape(360, 225, "Select how to represent songs",
            Color.RED);
        start.setBackgroundColor(Color.WHITE);
        window.addShape(start);

        previous = new Button("< Previous");
        window.addButton(previous, WindowSide.NORTH);
        previous.onClick(this, "clickedPrevious");
        artistSort = new Button("Sort by Artist Name");
        window.addButton(artistSort, WindowSide.NORTH);
        artistSort.onClick(this, "clickedArtist");
        titleSort = new Button("Sort by Song Title");
        window.addButton(titleSort, WindowSide.NORTH);
        titleSort.onClick(this, "clickedTitle");
        yearSort = new Button("Sort by Release Year");
        window.addButton(yearSort, WindowSide.NORTH);
        yearSort.onClick(this, "clickedYear");
        genreSort = new Button("Sort by Genre");
        window.addButton(genreSort, WindowSide.NORTH);
        genreSort.onClick(this, "clickedGenre");
        next = new Button("Next >");
        window.addButton(next, WindowSide.NORTH);
        next.onClick(this, "clickedNext");

        hobbyRep = new Button("Represent Hobby");
        window.addButton(hobbyRep, WindowSide.SOUTH);
        hobbyRep.onClick(this, "clickedHobby");
        majorRep = new Button("Represent Major");
        window.addButton(majorRep, WindowSide.SOUTH);
        majorRep.onClick(this, "clickedMajor");
        regionRep = new Button("Represent Region");
        window.addButton(regionRep, WindowSide.SOUTH);
        regionRep.onClick(this, "clickedRegion");
        quit = new Button("Quit");
        window.addButton(quit, WindowSide.SOUTH);
        quit.onClick(this, "clickedQuit");
        
        songList = dataHandle.getSongList();

        previous.disable();
    }


    private void displayLegend(
        String s1,
        String s2,
        String s3,
        String s4,
        String s5) {
        Color c1 = new Color(255, 51, 255);
        Color c2 = new Color(51, 51, 255);
        Color c3 = new Color(255, 153, 51);
        Color c4 = new Color(51, 255, 51);
        Color white = new Color(255, 255, 255);
        Color border = new Color(10, 10, 10);
        legendText = new TextShape(760, 280, s1, c1);
        legendText.setBackgroundColor(Color.WHITE);
        window.addShape(legendText);
        legendText = new TextShape(760, 300, s2, c2);
        legendText.setBackgroundColor(Color.WHITE);
        window.addShape(legendText);
        legendText = new TextShape(760, 320, s3, c3);
        legendText.setBackgroundColor(Color.WHITE);
        window.addShape(legendText);
        legendText = new TextShape(760, 340, s4, c4);
        legendText.setBackgroundColor(Color.WHITE);
        window.addShape(legendText);
        legendSongTitle = new TextShape(777, 375, "Song Title", Color.BLACK);
        legendSongTitle.setBackgroundColor(Color.WHITE);
        window.addShape(legendSongTitle);
        legend = new TextShape(760, 260, s5);
        legend.setBackgroundColor(Color.WHITE);
        window.addShape(legend);
        legendBar = new Shape(813, 401, 5, 35, border);
        window.addShape(legendBar);
        heardLikes = new TextShape(767, 410, "Heard    Likes");
        heardLikes.setBackgroundColor(white);
        window.addShape(heardLikes);
        legendBoxOut = new Shape(750, 255, 120, 195, border);
        legendBoxIn = new Shape(753, 258, 114, 189, white);
        this.window.addShape(legendBoxIn);
        this.window.addShape(legendBoxOut);
    }


    /**
     * Gets the window display
     * 
     * @return myWindow
     */
    public Window getWindow() {
        return window;
    }


    /**
     * Displays the hobby legend
     */
    private void displayLHobby() {
        displayLegend("Read", "Art", "Sports", "Music", "Hobby Legend");
    }


    /**
     * Displays the region legend
     */
    private void displayLRegion() {
        displayLegend("SE", "NE", "US Other", "Not US", "Region Legend");
    }


    /**
     * Displays the major legend
     */
    private void displayLMajor() {
        displayLegend("Comp Sci", "Other Eng", "Math/CMDA", "Other",
            "Major Legend");
    }


    /**
     * 
     */
    private void drawGlyph() {
        int n = 0;
        int height = 80;
        int width = 125;
        int barSpacingHeight = 150;
        int barSpacingWidth = 250;
        double percentHeard1 = 0;
        double percentHeard2 = 0;
        double percentHeard3 = 0;
        double percentHeard4 = 0;
        double percentLiked1 = 0;
        double percentLiked2 = 0;
        double percentLiked3 = 0;
        double percentLiked4 = 0;
        //String sLegend = legend.getText();

        Color white = new Color(255, 255, 255);
        Color border = new Color(10, 10, 10);

        while (n < (songNum + 9) && n < songList.size()) {
            if (n == (songNum + 3) || n == (songNum + 6)) {
                height += barSpacingHeight;
                width = 125;
            }
            Song temps1 = (Song)songList.get(n);
            // if (sLegend.equals("Hobby Legend")) {
            percentHeard1 = temps1.getHeardPercentReading();
            percentHeard2 = temps1.getHeardPercentArt();
            percentHeard3 = temps1.getHeardPercentSports();
            percentHeard4 = temps1.getHeardPercentMusic();
            percentLiked1 = temps1.getLikePercentReading();
            percentLiked2 = temps1.getLikePercentArt();
            percentLiked3 = temps1.getLikePercentSports();
            percentLiked4 = temps1.getLikePercentMusic();
            // }
            // if (sLegend.equals("Region Legend")) {
            percentHeard1 = temps1.getHeardPercentSE();
            percentHeard2 = temps1.getHeardPercentNE();
            percentHeard3 = temps1.getHeardPercentUS();
            percentHeard4 = temps1.getHeardPercentOut();
            percentLiked1 = temps1.getLikePercentSE();
            percentLiked2 = temps1.getLikePercentNE();
            percentLiked3 = temps1.getLikePercentUS();
            percentLiked4 = temps1.getLikePercentOut();
            // }
            // if (sLegend.equals("Major Legend")) {
            percentHeard1 = temps1.getHeardPercentCS();
            percentHeard2 = temps1.getHeardPercentEng();
            percentHeard3 = temps1.getHeardPercentMath();
            percentHeard4 = temps1.getHeardPercentOther();
            percentLiked1 = temps1.getLikePercentCS();
            percentLiked2 = temps1.getLikePercentEng();
            percentLiked3 = temps1.getLikePercentMath();
            percentLiked4 = temps1.getLikePercentOther();
            // }

            bar = new Shape(width, height, 5, 60, border);
            window.addShape(bar);

            heard1 = new Shape(barSpacingWidth + width + 5, 50 + height,
                (int)(125 * percentHeard1), 15, new Color(255, 51, 255));
            heard2 = new Shape(barSpacingWidth + width + 5, 50 + height,
                (int)(125 * percentHeard1), 15, new Color(51, 51, 255));
            heard3 = new Shape(barSpacingWidth + width + 5, 50 + height,
                (int)(125 * percentHeard1), 15, new Color(255, 153, 51));
            heard4 = new Shape(barSpacingWidth + width + 5, 50 + height,
                (int)(125 * percentHeard1), 15, new Color(51, 255, 51));
            liked1 = new Shape(barSpacingWidth + width + 5, 50 + height,
                (int)(125 * percentHeard1), 15, new Color(255, 51, 255));
            liked2 = new Shape(barSpacingWidth + width + 5, 50 + height,
                (int)(125 * percentHeard1), 15, new Color(51, 51, 255));
            liked3 = new Shape(barSpacingWidth + width + 5, 50 + height,
                (int)(125 * percentHeard1), 15, new Color(255, 153, 51));
            liked4 = new Shape(barSpacingWidth + width + 5, 50 + height,
                (int)(125 * percentHeard1), 15, new Color(51, 255, 51));

            String tempTitle = temps1.getTitle();
            title = new TextShape(50 + width, 10 + height, tempTitle);
            title.setBackgroundColor(Color.WHITE);
            String tempArtist = temps1.getArtist();
            artist = new TextShape(50 + width, 100 + height, tempArtist);
            artist.setBackgroundColor(Color.WHITE);

            width += barSpacingWidth;
            n++;
        }
    }


    /**
     * Shows the previous 9 glyphs
     * 
     * @param b
     */
    public void clickedPrevious(Button b) {
        next.enable();
        window.removeAllShapes();
        String sLegend = legend.getText();
        songNum -= 9;
        if (songNum < 5) {
            previous.disable();
        }
        if (sLegend.equals("Hobby Legend")) {
            displayLHobby();
            drawGlyph();
        }
        if (sLegend.equals("Region Legend")) {
            displayLRegion();
            drawGlyph();
        }
        if (sLegend.equals("Major Legend")) {
            displayLMajor();
            drawGlyph();
        }
    }


    /**
     * Shows the next 9 glyphs
     * 
     * @param b
     */
    public void clickedNext(Button b) {
        previous.enable();
        window.removeAllShapes();
        String sLegend = legend.getText();
        if (songNum > songList.size() - 12) {
            next.disable();
        }
        songNum += 9;
        if (sLegend.equals("Hobby Legend")) {
            displayLHobby();
            drawGlyph();
        }
        if (sLegend.equals("Region Legend")) {
            displayLRegion();
            drawGlyph();
        }
        if (sLegend.equals("Major Legend")) {
            displayLMajor();
            drawGlyph();
        }
    }


    /**
     * Updates the gylphs so that the songs are sorted by artist
     * 
     * @param b
     */
    public void clickedArtist(Button b) {
        String sLegend = legend.getText();
        songList = songList.sortByArtist(songList);
        songNum = 0;
        previous.disable();
        next.enable();
        window.removeAllShapes();
        if (sLegend.equals("Hobby Legend")) {
            // list = data.getHobbyList();
            drawGlyph();
            displayLHobby();
        }
        if (sLegend.equals("Region Legend")) {
            // list = data.getHobbyList();
            drawGlyph();
            displayLRegion();
        }
        if (sLegend.equals("Major Legend")) {
            // list = data.getHobbyList();
            drawGlyph();
            displayLMajor();
        }
    }


    /**
     * Updates the gylphs so that the songs are sorted by Title
     * 
     * @param b
     */
    public void clickedTitle(Button b) {
        String sLegend = legend.getText();
        songList = songList.sortByTitle(songList);
        songNum = 0;
        previous.disable();
        next.enable();
        window.removeAllShapes();
        if (sLegend.equals("Hobby Legend")) {
            // list = data.getHobbyList();
            drawGlyph();
            displayLHobby();
        }
        if (sLegend.equals("Region Legend")) {
            // list = data.getHobbyList();
            drawGlyph();
            displayLRegion();
        }
        if (sLegend.equals("Major Legend")) {
            // list = data.getHobbyList();
            drawGlyph();
            displayLMajor();
        }
    }


    /**
     * Updates the gylphs so that the songs are sorted by year
     * 
     * @param b
     */
    public void clickedYear(Button b) {
        String sLegend = legend.getText();
        songList = songList.sortByYear(songList);
        songNum = 0;
        previous.disable();
        next.enable();
        window.removeAllShapes();
        if (sLegend.equals("Hobby Legend")) {
            // list = data.getHobbyList();
            drawGlyph();
            displayLHobby();
        }
        if (sLegend.equals("Region Legend")) {
            // list = data.getHobbyList();
            drawGlyph();
            displayLRegion();
        }
        if (sLegend.equals("Major Legend")) {
            // list = data.getHobbyList();
            drawGlyph();
            displayLMajor();
        }
    }


    /**
     * Updates the gylphs so that the songs are sorted by genre
     * 
     * @param b
     */
    public void clickedGenre(Button b) {
        String sLegend = legend.getText();
        songList = songList.sortByGenre(songList);
        songNum = 0;
        previous.disable();
        next.enable();
        window.removeAllShapes();
        if (sLegend.equals("Hobby Legend")) {
            // list = data.getHobbyList();
            drawGlyph();
            displayLHobby();
        }
        if (sLegend.equals("Region Legend")) {
            // list = data.getHobbyList();
            drawGlyph();
            displayLRegion();
        }
        if (sLegend.equals("Major Legend")) {
            // list = data.getHobbyList();
            drawGlyph();
            displayLMajor();
        }
    }


    /**
     * Updates the window so that hobbies are represented
     * 
     * @param b
     */
    public void clickedHobby(Button b) {
        window.removeAllShapes();

        // songList = songList.sortBy(songList);
        drawGlyph();
        displayLHobby();
    }


    /**
     * Updates the window so that the majors are represented
     * 
     * @param b
     */
    public void clickedMajor(Button b) {
        window.removeAllShapes();
        // songList = songList.sortBy(songList);
        drawGlyph();
        displayLMajor();
    }


    /**
     * Updates the window so that the regions are represented
     * 
     * @param b
     */
    public void clickedRegion(Button b) {
        window.removeAllShapes();
        // songList = songList.sortBy(songList);
        drawGlyph();
        displayLRegion();
    }


    /**
     * Exits the window if this button is pressed
     * 
     * @param b
     */
    public void clickedQuit(Button b) {
        System.exit(0);
    }
}
