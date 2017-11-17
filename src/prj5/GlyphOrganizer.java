package prj5;

/**
 * Class to organize glyphs
 * 
 * @author Matthew Marquez (mmarquez)
 * @author Eddie Dean
 * @version 2017.11.16
 */
public class GlyphOrganizer {
    private LinkedList<LinkedList> hobbyTwoDimensional;
    private LinkedList<LinkedList> majorTwoDimensional;
    private LinkedList<LinkedList> regionTwoDimensional;


    /**
     * Basic constructor for GlyphOrganizer
     */
    public GlyphOrganizer() {
        hobbyTwoDimensional = null;
        majorTwoDimensional = null;
        regionTwoDimensional = null;
    }


    /**
     * Constructor for Glyph organizer
     * 
     * @param h
     *            List of hobby glyphs
     * @param m
     *            list of major glyphs
     * @param r
     *            list of region glyphs
     */
    public GlyphOrganizer(LinkedList h, LinkedList m, LinkedList r) {
        hobbyTwoDimensional = this.organizeHobby(h);
        majorTwoDimensional = this.organizeMajor(m);
        regionTwoDimensional = this.organizeRegion(r);
    }


    /**
     * organizes hobby list
     * 
     * @param h
     *            linkedlist of hobbylist
     * @return LinkedList<LinkedList> of hobbies
     */
    public LinkedList<LinkedList> organizeHobby(LinkedList h) {
        // sort LinkedList h by song using h = this.sortBySong(h);
        // Once h is sorted make a linked list for each song
        // then add the linked list to the hobbyTwoDimensional using add()
        // method
        // LinkedList<LinkedList> should be sorted by song with
        // all hobbies as the inner linked lists
        return hobbyTwoDimensional;

    }


    /**
     * organizes major list
     * 
     * @param m
     *            linkedlist of majorlist
     * @return LinkedList<LinkedList> of majors
     */
    public LinkedList<LinkedList> organizeMajor(LinkedList m) {
        return majorTwoDimensional;
    }


    /**
     * organizes region list
     * 
     * @param r
     *            linkedlist of region list
     * @return LinkedList<LinkedList> of regions
     */
    public LinkedList<LinkedList> organizeRegion(LinkedList r) {
        return regionTwoDimensional;
    }

    /*
    /**
     * Sorts the GlyphOrganizer by song
     * 
     * @param list
     *            list of all glyphs
     *//*
    public void sortBySong(LinkedList list) {
        Node<Glyph> currentNode = list.head;
        Object[] result = list.toArray();
        for (int i = 0; i < result.length; i++) {
            Object min = result[i];
            for (int j = 0; j < result.length; j++) {
                if ((((Glyph)min).getSong().getTitle()).compareTo(
                    ((Glyph)result[j]).getSong().getTitle()) > 1) {
                    min = result[j];
                }
                Glyph temp = (Glyph)min;
                result[j] = result[i];
                result[i] = temp;
            }
        }
        for (int i = 0; i < result.length; i++) {
            currentNode.setData(result[i]);
            currentNode = currentNode.next();
        }
    }
    */

    /**
     * Getter for hobbyList
     * 
     * @return hobbyList
     */
    public LinkedList<LinkedList> getHobby() {
        return hobbyTwoDimensional;
    }


    /**
     * Getter for majorList
     * 
     * @return majorList
     */
    public LinkedList<LinkedList> getMajor() {
        return majorTwoDimensional;
    }


    /**
     * Getter for regionList
     * 
     * @return regionlist
     */
    public LinkedList<LinkedList> getRegion() {
        return regionTwoDimensional;
    }

}
