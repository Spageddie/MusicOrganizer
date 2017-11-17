package prj5;
import student.TestCase;
/**
 * Test class for glyphOrganizer
 * @author Matthew Marquez (mmarquez)
 * @author Eddie Dean
 *
 */
public class GlyphOrganizerTest extends TestCase{
    private LinkedList<Glyph> list1;
    private GlyphOrganizer organizer;
    /**
     * Sets up the test cases
     */
    public void setUp() {
        organizer = new GlyphOrganizer();
        list1 = new LinkedList<Glyph>();
        Song song1 = new Song("attack", "me", "1998", "metal");
        Song song2 = new Song("eat", "hungry", "2017", "pop");
        Song song3 = new Song("jelly", "peanut", "1600", "folk");
        Song song4 = new Song("monster", "kids", "1990", "rap");
        Glyph glyph1 = new Glyph("hobby", song1,.1,.2);
        Glyph glyph2 = new Glyph("hobby", song2, .2, .5);
        Glyph glyph3 = new Glyph("hobby", song3, 1, 1);
        Glyph glyph4 = new Glyph("hobby", song4, .5, .5);
        list1.add(glyph1);
        list1.add(glyph2);
        list1.add(glyph3);
        list1.add(glyph4);
    }
    

}
