package prj5;

import java.awt.Color;
import CS2114.Button;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.Window;
import CS2114.WindowSide;

/**
 * This class is responsible for the front end of the
 * project 5. It uses the backend to read the needed files
 * to get the data and then present it in the needed visual
 * format
 * 
 * @author Chanaka Perera(chanaka1)
 * @version 4.25.2018
 *
 */
public class GUI_Window {

    private Window window;
    private SongListHandler handler;
    private int tracker;
    private String legendParam;
    private String sortParam;

    private Button previous;
    private Button artist;
    private Button title;
    private Button year;
    private Button genre;
    private Button next;
    private Button hobby;
    private Button major;
    private Button region;
    private Button quit;

    private TextShape legendType;
    private TextShape legend1;
    private TextShape legend2;
    private TextShape legend3;
    private TextShape legend4;


    /**
     * The default constructor for the class that
     * initializes the needed fields for setting
     * up the GUI
     * 
     * @param handle
     *            The linkedList of Songs that need to be handled
     */
    public GUI_Window(SongListHandler handle) {
        // Initializes the needed variables
        handler = handle;
        window = new Window();
        tracker = 0;

        // Format the window that is displayed
        window.setTitle("Project 5 (chanaka1, eddie5)");
        window.setSize(1200, 1000);

        // Assign the previous button function for the
        // window and add them to the window in the
        // proper locations
        previous = new Button("< Prev");
        window.addButton(previous, WindowSide.NORTH);
        previous.onClick(this, "updateWindow");

        artist = new Button("Sort by Artist Name");
        window.addButton(artist, WindowSide.NORTH);
        artist.onClick(this, "updateWindow");

        title = new Button("Sort by Title");
        window.addButton(title, WindowSide.NORTH);
        title.onClick(this, "updateWindow");

        year = new Button("Sort by Year");
        window.addButton(year, WindowSide.NORTH);
        year.onClick(this, "updateWindow");

        genre = new Button("Sort by Genre");
        window.addButton(genre, WindowSide.NORTH);
        genre.onClick(this, "updateWindow");

        next = new Button("Next >");
        window.addButton(next, WindowSide.NORTH);
        next.onClick(this, "updateWindow");

        hobby = new Button("Represent Hobby");
        window.addButton(hobby, WindowSide.SOUTH);
        hobby.onClick(this, "updateWindow");

        major = new Button("Represent Major");
        window.addButton(major, WindowSide.SOUTH);
        major.onClick(this, "updateWindow");

        region = new Button("Represent Region");
        window.addButton(region, WindowSide.SOUTH);
        region.onClick(this, "updateWindow");

        quit = new Button("Quit");
        window.addButton(quit, WindowSide.SOUTH);
        quit.onClick(this, "exit");

        // Disables the previous button on start up
        previous.disable();

    }


    /**
     * Exits the window if the user clicks the
     * quit button
     * 
     * @param button
     *            The button to which this method is mapped
     *            to
     */
    public void exit(Button button) {
        System.exit(0);
    }


    /**
     * This is the default method that most of the buttons
     * are mapped to it removes all shapes from the current
     * window and rebuilds it in the needed format once
     * a button is clicked
     * 
     * @param updateParam
     */
    public void updateWindow(Button updateParam) {
        window.removeAllShapes();

        // If the user clicks a sort type it sorts the linked
        // list accordingly and sets the SortParam variable to
        // the needed value for later use
        if (updateParam == artist) {
            handler.sortSongs("artist");
            sortParam = "artist";
        }

        if (updateParam == genre) {
            handler.sortSongs("genre");
            sortParam = "genre";
        }

        if (updateParam == title) {
            handler.sortSongs("title");
            sortParam = "title";
        }

        if (updateParam == year) {
            handler.sortSongs("year");
            sortParam = "year";
        }

        // If the user clicks the represent type at the bottom of
        // the linked list it sets the value of the legendParam variable
        // to the needed value for later use
        if (updateParam == hobby) {
            legendParam = "hobby";
        }

        if (updateParam == major) {
            legendParam = "major";
        }

        if (updateParam == region) {
            legendParam = "region";
        }

        // If the user clicks the next button
        if (updateParam == next) {
            // If the tracker variable is less than the total
            // number of songs currently in the linked list it
            // enables the previous button
            if (tracker <= handler.size() - 9) {
                tracker = tracker + 9;
                previous.enable();
            }
            // If the tracker variable is greater than the no of
            // songs in the linked list and that value is greater
            // than the size - 9 it disables the next button
            if (tracker >= handler.size() - 9) {
                next.disable();
            }

        }

        // If the user clicks the previous button
        if (updateParam == previous) {
            // If the tracker variable is greater or equal
            // to 9 it enables the next button and reduces the
            // variable by 9
            if (tracker >= 9) {
                tracker = tracker - 9;
                next.enable();
            }
            // If the tracker variable is less than 9 and its not
            // possible to go to the previous 9 glyphs it disables the
            // button
            if (tracker < 9) {
                previous.disable();
            }

        }
        // Uses the helper method to generate the legend on the right side
        // of the window
        createLegend(legendParam);

        int rowM = 100;
        int i = 0;

        // Iterates through 1 to 9 so as to generate 9 song glyphs to display
        // on the GUI
        while (i < 9) {
            // Iterates through 1 to 3 so it generates the glyphs
            for (int j = 0; j < 3; j++) {
                // If there is a song at the specified location in the linked
                // list
                if (tracker + i < handler.size()) {
                    Song song = handler.getAt(tracker + i);
                    i++;
                    createSongGlyph(song, 40 + 300 * j, rowM);
                }
                // Exits out of the loop if it runs out of songs to convert into
                // glyphs
                else {
                    j = 6;
                    i = 10;
                }
            }
            // Goes to the next row to create glyphs after creating 3 glyphs
            rowM = rowM + 300;
        }

    }


    /**
     * This method creates the legend which is displayed on the GUI
     * 
     * @param type
     *            The type of legend that needs to be displayed on the GUI
     *            ex: hobby, major, region
     */
    public void createLegend(String type) {
        // The variable legendType is the title of the legend
        legendType = new TextShape(window.getGraphPanelWidth() - 250, window
            .getGraphPanelHeight() - 380, "");
        legendType.setBackgroundColor(Color.WHITE);
        // The variable legend1 is the first type on the legend
        legend1 = new TextShape(window.getGraphPanelWidth() - 250, window
            .getGraphPanelHeight() - 360, "", Color.MAGENTA);
        legend1.setBackgroundColor(Color.WHITE);
        // The variable legend2 is the second type on the legend
        legend2 = new TextShape(window.getGraphPanelWidth() - 250, window
            .getGraphPanelHeight() - 340, "", Color.BLUE);
        legend2.setBackgroundColor(Color.WHITE);
        // The variable legend3 is the third type on the legend
        legend3 = new TextShape(window.getGraphPanelWidth() - 250, window
            .getGraphPanelHeight() - 320, "", Color.ORANGE);
        legend3.setBackgroundColor(Color.WHITE);
        // The variable legend4 is the fourth type on the legend
        legend4 = new TextShape(window.getGraphPanelWidth() - 250, window
            .getGraphPanelHeight() - 300, "", Color.GREEN);
        legend4.setBackgroundColor(Color.WHITE);

        // If the legend type is set to hobby sets the texts for the variables
        // as
        // needed
        if (type.equals("hobby")) {
            legendType.setText("Hobby Legend");
            legend1.setText("Read");
            legend2.setText("Art");
            legend3.setText("Sports");
            legend4.setText("Music");
        }

        // If the legend type is set to major sets the texts for the variables
        // as needed
        if (type.equals("major")) {
            legendType.setText("Major Legend");
            legend1.setText("Math or CMDA");
            legend2.setText("Com-Sci");
            legend3.setText("Other Engineering");
            legend4.setText("Others");
        }

        // IF the legend type is set to region sets the texts for the variables
        // as needed
        if (type.equals("region")) {
            legendType.setText("Region Legend");
            legend1.setText("North East");
            legend2.setText("South East");
            legend3.setText("United States(Other than NE and SE)");
            legend4.setText("Outside U.S");
        }

        // Adds the shapes to the window
        window.addShape(legendType);
        window.addShape(legend1);
        window.addShape(legend2);
        window.addShape(legend3);
        window.addShape(legend4);

        // Creates the other parts of the legend by creating a shape to
        // display the key

        // This creates the Song textShape displayed in the legend
        TextShape song = new TextShape(window.getGraphPanelWidth() - 180, window
            .getGraphPanelHeight() - 280, "Song Title", Color.BLACK);
        song.setBackgroundColor(Color.WHITE);
        window.addShape(song);

        // This creates the heard textShape displayed in the legend
        TextShape heard = new TextShape(window.getGraphPanelWidth() - 100,
            window.getGraphPanelHeight() - 240, "Heard", Color.BLACK);
        heard.setBackgroundColor(Color.WHITE);
        window.addShape(heard);

        // This creates the likes textShape displayed in the legend
        TextShape likes = new TextShape(window.getGraphPanelWidth() - 230,
            window.getGraphPanelHeight() - 240, "Liked", Color.BLACK);
        likes.setBackgroundColor(Color.WHITE);
        window.addShape(likes);

        // This creates the small bar that is displayed in the legend
        Shape bar = new Shape(window.getGraphPanelWidth() - 150, window
            .getGraphPanelHeight() - 240, 5, 40);
        bar.setBackgroundColor(Color.BLACK);
        bar.setForegroundColor(Color.BLACK);
        window.addShape(bar);

        // This creates the outline for the legend
        Shape legendOutline = new Shape(window.getGraphPanelWidth() - 260,
            window.getGraphPanelHeight() - 400, 259, 259);
        legendOutline.setBackgroundColor(Color.WHITE);
        legendOutline.setForegroundColor(Color.BLACK);
        window.addShape(legendOutline);

    }


    /**
     * This is a helper method that generates a glyph on the
     * window with the needed formatting
     * 
     * @param song
     *            The song for which the glyph is created to
     * @param xPos
     *            The position for which the glyph is added to
     * @param yPos
     *            The position for which the glyph is placed
     */
    private void createSongGlyph(Song song, int xPos, int yPos) {

        // Gets the title which is always displayed in all glyphs
        String display1 = song.getTitle();
        String display2 = "";

        // If the sort type is artist or title the second textShape
        // in the glyph will be based on the artist
        if (sortParam == "artist" || sortParam == "title") {
            display2 = "by " + song.getArtist();
        }

        // If the sort type is genre the second textShape in the
        // glyph will be the song's genre
        else if (sortParam == "genre") {
            display2 = "Genre: " + song.getGenre();
        }

        // Otherwise the sort type will have to be year and
        // the textShape will be based on the year of release
        else {
            display2 = "Year: " + song.getYear();
        }

        // Adds the textShapes to the window with the needed formatting
        TextShape disp1 = new TextShape(xPos, yPos, display1, Color.BLACK);
        TextShape disp2 = new TextShape(xPos, yPos + 40, display2, Color.BLACK);
        disp1.setBackgroundColor(Color.WHITE);
        disp2.setBackgroundColor(Color.WHITE);
        window.addShape(disp1);
        window.addShape(disp2);

        // Adds a vertical bar at the middle position of the glyph where
        // the like percentages and heard percentages will be displayed
        Shape bar = new Shape(xPos + 40, yPos + 80, 5, 80);
        bar.setBackgroundColor(Color.BLACK);
        bar.setForegroundColor(Color.BLACK);
        window.addShape(bar);

        // If the legend represents hobby
        if (legendParam.equals("hobby")) {
            // Gets the width of the shape to add for the glpyh based on
            // percentages
            // of hobby for the song
            int width = (int)((float)(song.getHeardHobbyPercent(0)) * 40 / 100);
            int xP = 40 - width;
            // Shape1 represents legend type 1
            Shape shape1 = new Shape(xPos + xP, yPos + 80, width, 20);
            width = (int)((float)(song.getHeardHobbyPercent(2)) * 40 / 100);
            xP = 40 - width;
            // Shape2 represents legend type 2
            Shape shape2 = new Shape(xPos + xP, yPos + 100, width, 20);
            width = (int)((float)(song.getHeardHobbyPercent(4)) * 40 / 100);
            xP = 40 - width;
            // Shape3 represents legend type 3
            Shape shape3 = new Shape(xPos + xP, yPos + 120, width, 20);
            width = (int)((float)(song.getHeardHobbyPercent(6)) * 40 / 100);
            xP = 40 - width;
            Shape shape4 = new Shape(xPos + xP, yPos + 140, width, 20);
            // Sets the color of the shapes based on the legend and adds them
            // to the window
            shape1.setBackgroundColor(Color.MAGENTA);
            shape2.setBackgroundColor(Color.BLUE);
            shape3.setBackgroundColor(Color.YELLOW);
            shape4.setBackgroundColor(Color.GREEN);
            window.addShape(shape1);
            window.addShape(shape2);
            window.addShape(shape3);
            window.addShape(shape4);
            // Creates shapes for the glyph based on liked percentages and
            // adds them to the glyph for display
            width = (int)((float)(song.getLikedHobbyPercent(0)) * 40 / 100);
            Shape shape5 = new Shape(xPos + 45, yPos + 80, width, 20);
            width = (int)((float)(song.getLikedHobbyPercent(2)) * 40 / 100);
            Shape shape6 = new Shape(xPos + 45, yPos + 100, width, 20);
            width = (int)((float)(song.getLikedHobbyPercent(4)) * 40 / 100);
            Shape shape7 = new Shape(xPos + 45, yPos + 120, width, 20);
            width = (int)((float)(song.getLikedHobbyPercent(6)) * 40 / 100);
            Shape shape8 = new Shape(xPos + 45, yPos + 140, width, 20);
            shape5.setBackgroundColor(Color.MAGENTA);
            shape6.setBackgroundColor(Color.BLUE);
            shape7.setBackgroundColor(Color.YELLOW);
            shape8.setBackgroundColor(Color.GREEN);
            window.addShape(shape5);
            window.addShape(shape6);
            window.addShape(shape7);
            window.addShape(shape8);
        }
        
        //This conditional statement follow the same logic as the one
        //for hobby but takes the values for region instead
        else if (legendParam.equals("region")) {
            int width = (int)((float)(song.getHeardRegionPercent(0)) * 40
                / 100);
            int xP = 40 - width;
            Shape shape1 = new Shape(xPos + xP, yPos + 80, width, 20);
            width = (int)((float)(song.getHeardRegionPercent(2)) * 40 / 100);
            xP = 40 - width;
            Shape shape2 = new Shape(xPos + xP, yPos + 100, width, 20);
            width = (int)((float)(song.getHeardRegionPercent(4)) * 40 / 100);
            xP = 40 - width;
            Shape shape3 = new Shape(xPos + xP, yPos + 120, width, 20);
            width = (int)((float)(song.getHeardRegionPercent(6)) * 40 / 100);
            xP = 40 - width;
            Shape shape4 = new Shape(xPos + xP, yPos + 140, width, 20);
            shape1.setBackgroundColor(Color.MAGENTA);
            shape2.setBackgroundColor(Color.BLUE);
            shape3.setBackgroundColor(Color.YELLOW);
            shape4.setBackgroundColor(Color.GREEN);
            window.addShape(shape1);
            window.addShape(shape2);
            window.addShape(shape3);
            window.addShape(shape4);
            width = (int)((float)(song.getLikedRegionPercent(0)) * 40 / 100);
            Shape shape5 = new Shape(xPos + 45, yPos + 80, width, 20);
            width = (int)((float)(song.getLikedRegionPercent(2)) * 40 / 100);
            Shape shape6 = new Shape(xPos + 45, yPos + 100, width, 20);
            width = (int)((float)(song.getLikedRegionPercent(4)) * 40 / 100);
            Shape shape7 = new Shape(xPos + 45, yPos + 120, width, 20);
            width = (int)((float)(song.getLikedRegionPercent(6)) * 40 / 100);
            Shape shape8 = new Shape(xPos + 45, yPos + 140, width, 20);
            shape5.setBackgroundColor(Color.MAGENTA);
            shape6.setBackgroundColor(Color.BLUE);
            shape7.setBackgroundColor(Color.YELLOW);
            shape8.setBackgroundColor(Color.GREEN);
            window.addShape(shape5);
            window.addShape(shape6);
            window.addShape(shape7);
            window.addShape(shape8);
        }
        //This conditional statement follows the same logic as for hobby
        //but gets the values for creating the shapes based on the major
        else {
            int width = (int)((float)(song.getHeardMajorPercent(0)) * 40 / 100);
            int xP = 40 - width;
            Shape shape1 = new Shape(xPos + xP, yPos + 80, width, 20);
            width = (int)((float)(song.getHeardMajorPercent(2)) * 40 / 100);
            xP = 40 - width;
            Shape shape2 = new Shape(xPos + xP, yPos + 100, width, 20);
            width = (int)((float)(song.getHeardMajorPercent(4)) * 40 / 100);
            xP = 40 - width;
            Shape shape3 = new Shape(xPos + xP, yPos + 120, width, 20);
            width = (int)((float)(song.getHeardMajorPercent(6)) * 40 / 100);
            xP = 40 - width;
            Shape shape4 = new Shape(xPos + xP, yPos + 140, width, 20);
            shape1.setBackgroundColor(Color.MAGENTA);
            shape2.setBackgroundColor(Color.BLUE);
            shape3.setBackgroundColor(Color.YELLOW);
            shape4.setBackgroundColor(Color.GREEN);
            window.addShape(shape1);
            window.addShape(shape2);
            window.addShape(shape3);
            window.addShape(shape4);
            width = (int)((float)(song.getLikedMajorPercent(0)) * 40 / 100);
            Shape shape5 = new Shape(xPos + 45, yPos + 80, width, 20);
            width = (int)((float)(song.getLikedMajorPercent(2)) * 40 / 100);
            Shape shape6 = new Shape(xPos + 45, yPos + 100, width, 20);
            width = (int)((float)(song.getLikedMajorPercent(4)) * 40 / 100);
            Shape shape7 = new Shape(xPos + 45, yPos + 120, width, 20);
            width = (int)((float)(song.getLikedMajorPercent(6)) * 40 / 100);
            Shape shape8 = new Shape(xPos + 45, yPos + 140, width, 20);
            shape5.setBackgroundColor(Color.MAGENTA);
            shape6.setBackgroundColor(Color.BLUE);
            shape7.setBackgroundColor(Color.YELLOW);
            shape8.setBackgroundColor(Color.GREEN);
            window.addShape(shape5);
            window.addShape(shape6);
            window.addShape(shape7);
            window.addShape(shape8);
        }

    }

}
