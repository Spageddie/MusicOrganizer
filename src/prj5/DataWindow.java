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
    private GlyphOrganizer dataSorter;
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
    private TextShape legendSongTitle;
    private TextShape heardLikes;
    private Shape legendBar;
    private Shape legendBoxIn;
    private Shape legendBoxOut;


    /**
     * 
     */
    public DataWindow() {
        window = new Window("Project5");
        window.setSize(800, 600);

        this.previous = new Button("< Previous");
        this.window.addButton(previous, WindowSide.NORTH);
        this.previous.onClick(this);
        this.artistSort = new Button("Sort by Artist Name");
        this.window.addButton(artistSort, WindowSide.NORTH);
        this.artistSort.onClick(this);
        this.titleSort = new Button("Sort by Song Title");
        this.window.addButton(titleSort, WindowSide.NORTH);
        this.titleSort.onClick(this);
        this.yearSort = new Button("Sort by Release Year");
        this.window.addButton(yearSort, WindowSide.NORTH);
        this.yearSort.onClick(this);
        this.genreSort = new Button("Sort by Genre");
        this.window.addButton(genreSort, WindowSide.NORTH);
        this.genreSort.onClick(this);
        this.next = new Button("Next >");
        this.window.addButton(next, WindowSide.NORTH);
        this.next.onClick(this);

        this.hobbyRep = new Button("Represent Hobby");
        this.window.addButton(hobbyRep, WindowSide.SOUTH);
        this.hobbyRep.onClick(this);
        this.majorRep = new Button("Represent Major");
        this.window.addButton(majorRep, WindowSide.SOUTH);
        this.hobbyRep.onClick(this);
        this.regionRep = new Button("Represent Region");
        this.window.addButton(regionRep, WindowSide.SOUTH);
        this.regionRep.onClick(this);
        this.quit = new Button("Quit");
        this.window.addButton(quit, WindowSide.SOUTH);
        this.quit.onClick(this);
    }


    public void update() {
        graphColors = new Color[6];
        Color c1 = new Color(255, 51, 255);
        Color c2 = new Color(51, 51, 255);
        Color c3 = new Color(255, 153, 51);
        Color c4 = new Color(51, 255, 51);
        Color white = new Color(255, 255, 255);
        Color border = new Color(10, 10, 10);
        graphColors[0] = c1;
        graphColors[1] = c2;
        graphColors[2] = c3;
        graphColors[3] = c4;
        graphColors[4] = white;
        graphColors[5] = border;

        legendSongTitle = new TextShape(677, 375, "Song Title");
        legendSongTitle.setBackgroundColor(white);
        window.addShape(legendSongTitle);
        legendBar = new Shape(713, 401, 5, 35, border);
        window.addShape(legendBar);
        heardLikes = new TextShape(667, 410, "Heard    Likes");
        heardLikes.setBackgroundColor(white);
        window.addShape(heardLikes);
        legendBoxOut = new Shape(650, 255, 120, 195, border);
        legendBoxIn = new Shape(653, 258, 114, 189, white);
        this.window.addShape(legendBoxIn);
        this.window.addShape(legendBoxOut);
    }


    public void clickedPrev(Button b) {

    }


    public void clickedNext(Button b) {

    }


    public void clickedArtist(Button b) {

    }


    public void clickedSong(Button b) {

    }


    public void clickedYear(Button b) {

    }


    public void clickedGenre(Button b) {
        update();
    }


    public void clickedHobby(Button b) {

    }


    public void clickedMajor(Button b) {

    }


    public void clickedRegion(Button b) {

    }


    public void clickedQuit(Button b) {
        System.exit(0);
    }
}
