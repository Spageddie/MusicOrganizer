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
    private int pageCount = 0;
    private TextShape legend;
    private TextShape ts1;
    private TextShape ts2;
    private TextShape ts3;
    private TextShape ts4;
    private Shape[] poles;

    private TextShape sTitle;
    private TextShape sArtist;
    private Shape r1;
    private Shape r2;
    private Shape r3;
    private Shape r4;


    /**
     * Put (GlyphOrganizer organizer) in
     */
    public DataWindow() {
        // dataSorter = organizer;

        window = new Window("Project5");
        window.setSize(900, 600);

        this.previous = new Button("< Previous");
        this.window.addButton(previous, WindowSide.NORTH);
        this.previous.onClick(this, "clickedPrevious");
        this.artistSort = new Button("Sort by Artist Name");
        this.window.addButton(artistSort, WindowSide.NORTH);
        this.artistSort.onClick(this, "clickedArtist");
        this.titleSort = new Button("Sort by Song Title");
        this.window.addButton(titleSort, WindowSide.NORTH);
        this.titleSort.onClick(this, "clickedTitle");
        this.yearSort = new Button("Sort by Release Year");
        this.window.addButton(yearSort, WindowSide.NORTH);
        this.yearSort.onClick(this, "clickedYear");
        this.genreSort = new Button("Sort by Genre");
        this.window.addButton(genreSort, WindowSide.NORTH);
        this.genreSort.onClick(this, "clickedGenre");
        this.next = new Button("Next >");
        this.window.addButton(next, WindowSide.NORTH);
        this.next.onClick(this, "clickedNext");

        this.hobbyRep = new Button("Represent Hobby");
        this.window.addButton(hobbyRep, WindowSide.SOUTH);
        this.hobbyRep.onClick(this, "clickedHobby");
        this.majorRep = new Button("Represent Major");
        this.window.addButton(majorRep, WindowSide.SOUTH);
        this.majorRep.onClick(this, "clickedMajor");
        this.regionRep = new Button("Represent Region");
        this.window.addButton(regionRep, WindowSide.SOUTH);
        this.regionRep.onClick(this, "clickedRegion");
        this.quit = new Button("Quit");
        this.window.addButton(quit, WindowSide.SOUTH);
        this.quit.onClick(this, "clickedQuit");
    }


    /**
     * 
     */
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

        legendSongTitle = new TextShape(777, 375, "Song Title");
        legendSongTitle.setBackgroundColor(white);
        window.addShape(legendSongTitle);
        legendBar = new Shape(813, 401, 5, 35, border);
        window.addShape(legendBar);
        heardLikes = new TextShape(767, 410, "Heard    Likes");
        heardLikes.setBackgroundColor(white);
        window.addShape(heardLikes);
        legendBoxOut = new Shape(750, 255, 120, 195, border);
        legendBoxIn = new Shape(753, 258, 114, 189, white);
        this.window.addShape(legendBoxIn);
        this.window.addShape(legendBoxOut);

// for (int i = 0; i < 3; i++) {
// for (int j = 0; j < 3; j++) {
// Shape pole = new Shape(125 + 250*i, 80 + 50*j, 5, 60, border);
//
// }
// }
        
        Shape pole1 = new Shape(125, 80, 5, 60, border);
        window.addShape(pole1);
        Shape pole2 = new Shape(125 + 250, 80, 5, 60, border);
        window.addShape(pole2);
        Shape pole3 = new Shape(125 + 2 * 250, 80, 5, 60, border);
        window.addShape(pole3);
        Shape pole4 = new Shape(125, 80 + 150, 5, 60, border);
        window.addShape(pole4);
        Shape pole5 = new Shape(125 + 250, 80 + 150, 5, 60, border);
        window.addShape(pole5);
        Shape pole6 = new Shape(125 + 2 * 250, 80 + 150, 5, 60, border);
        window.addShape(pole6);
        Shape pole7 = new Shape(125, 80 + 2 * 150, 5, 60, border);
        window.addShape(pole7);
        Shape pole8 = new Shape(125 + 250, 80 + 2 * 150, 5, 60, border);
        window.addShape(pole8);
        Shape pole9 = new Shape(125 + 2 * 250, 80 + 2 * 150, 5, 60, border);
        window.addShape(pole9);

        if (pageCount > 3) {
            next.disable();
        }
        if (pageCount == 1) {
            previous.disable();
        }
        else {
            next.enable();
            previous.enable();
        }
        
        this.sTitle = new TextShape(75, 35, "Call Me Maybe");
        sTitle.setBackgroundColor(white);
        this.window.addShape(sTitle);
        this.sArtist = new TextShape(60, 55, "by Carly Rae Jepsen");
        sArtist.setBackgroundColor(white);
        this.window.addShape(sArtist);
        r1 = new Shape(50, 80, 145, 15, graphColors[0]);
        this.window.addShape(r1);
        r2 = new Shape(45, 95, 95, 15, graphColors[1]);
        this.window.addShape(r2);
        r3 = new Shape(55, 110, 120, 15, graphColors[2]);
        this.window.addShape(r3);
        r4 = new Shape(38, 125, 110, 15, graphColors[3]);
        this.window.addShape(r4);
        
    }


    private void drawPoles() {

    }


    /**
     * Shows the previous 9 glyphs
     * 
     * @param b
     */
    public void clickedPrevious(Button b) {
        pageCount--;
    }


    /**
     * Shows the next 9 glyphs
     * 
     * @param b
     */
    public void clickedNext(Button b) {
        pageCount++;
    }


    /**
     * Updates the gylphs so that the songs are sorted by artist
     * 
     * @param b
     */
    public void clickedArtist(Button b) {

    }


    /**
     * Updates the gylphs so that the songs are sorted by Title
     * 
     * @param b
     */
    public void clickedTitle(Button b) {

    }


    /**
     * Updates the gylphs so that the songs are sorted by year
     * 
     * @param b
     */
    public void clickedYear(Button b) {

    }


    /**
     * Updates the gylphs so that the songs are sorted by genre
     * 
     * @param b
     */
    public void clickedGenre(Button b) {
        update();
    }


    /**
     * Updates the window so that hobbies are represented
     * 
     * @param b
     */
    public void clickedHobby(Button b) {
        window.removeAllShapes();
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
        legend = new TextShape(760, 260, "Hobby Legend");
        legend.setBackgroundColor(white);
        window.addShape(legend);
        ts1 = new TextShape(760, 280, "Read", graphColors[0]);
        ts1.setBackgroundColor(white);
        window.addShape(ts1);
        ts2 = new TextShape(760, 300, "Art", graphColors[1]);
        ts2.setBackgroundColor(white);
        window.addShape(ts2);
        ts3 = new TextShape(760, 320, "Sports", graphColors[2]);
        ts3.setBackgroundColor(white);
        window.addShape(ts3);
        ts4 = new TextShape(760, 340, "Music", graphColors[3]);
        ts4.setBackgroundColor(white);
        window.addShape(ts4);
        update();
    }


    /**
     * Updates the window so that the majors are represented
     * 
     * @param b
     */
    public void clickedMajor(Button b) {
        window.removeAllShapes();
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
        legend = new TextShape(760, 260, "Major Legend");
        legend.setBackgroundColor(white);
        window.addShape(legend);
        ts1 = new TextShape(760, 280, "Compsci", graphColors[0]);
        ts1.setBackgroundColor(white);
        window.addShape(ts1);
        ts2 = new TextShape(760, 300, "Other Eng", graphColors[1]);
        ts2.setBackgroundColor(white);
        window.addShape(ts2);
        ts3 = new TextShape(760, 320, "Math/CMDA", graphColors[2]);
        ts3.setBackgroundColor(white);
        window.addShape(ts3);
        ts4 = new TextShape(760, 340, "Other", graphColors[3]);
        ts4.setBackgroundColor(white);
        window.addShape(ts4);
        update();
    }


    /**
     * Updates the window so that the regions are represented
     * 
     * @param b
     */
    public void clickedRegion(Button b) {
        window.removeAllShapes();
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
        legend = new TextShape(760, 260, "Region Legend");
        legend.setBackgroundColor(white);
        window.addShape(legend);
        ts1 = new TextShape(760, 285, "NE US", graphColors[0]);
        ts1.setBackgroundColor(white);
        window.addShape(ts1);
        ts2 = new TextShape(760, 305, "SE US", graphColors[1]);
        ts2.setBackgroundColor(white);
        window.addShape(ts2);
        ts3 = new TextShape(760, 325, "Rest of US", graphColors[2]);
        ts3.setBackgroundColor(white);
        window.addShape(ts3);
        ts4 = new TextShape(760, 345, "Outside US", graphColors[3]);
        ts4.setBackgroundColor(white);
        window.addShape(ts4);
        update();
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
