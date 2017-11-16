package prj5;

public class GlyphOrganizer {
    private LinkedList<LinkedList> hobbyTwoDimensional;
    private LinkedList<LinkedList> majorTwoDimensional;
    private LinkedList<LinkedList> regionTwoDimensional;
    public GlyphOrganizer() {
        hobbyTwoDimensional = null;
        majorTwoDimensional = null;
        regionTwoDimensional = null;
    }
    public GlyphOrganizer(LinkedList h, LinkedList m, LinkedList r) {
        hobbyTwoDimensional = this.organizeHobby(h);
        majorTwoDimensional = this.organizeMajor(m);
        regionTwoDimensional = this.organizeRegion(r);
    }
    public LinkedList<LinkedList> organizeHobby(LinkedList h) {
        //sort LinkedList h by song using h = this.sortBySong(h);
        //Once h is sorted make a linked list for each song 
        //then add the linked list to the hobbyTwoDimensional using add() method
        //LinkedList<LinkedList> should be sorted by song with 
        //all hobbies as the inner linked lists
        return hobbyTwoDimensional;
        
    }
    public LinkedList<LinkedList> organizeMajor(LinkedList m) {
        return majorTwoDimensional;
    }
    public LinkedList<LinkedList> organizeRegion(LinkedList r) {
        return regionTwoDimensional;
    }
    public void sortBySong(LinkedList list) {
        Node currentNode = list.head;
        Object [] result = list.toArray();
        for(int i=0; i<result.length; i++) {
            Object min = result[i];
            for (int j=0; j<result.length; j++) {
                if((((Glyph)min).getSong().getTitle()).compareTo(((Glyph)result[j]).getSong().getTitle())>1) {
                    min = result[j];
                }
                Glyph temp = (Glyph)min;
                result[j] = result[i];
                result[i] = temp;
            }
        }
        for(int i=0; i<result.length; i++) {
            currentNode.setData(result[i]);
            currentNode = currentNode.next();
        }
    }
    public LinkedList<LinkedList> getHobby(){
        return hobbyTwoDimensional;
    }
    public LinkedList<LinkedList> getMajor(){
        return majorTwoDimensional;
    }
    public LinkedList<LinkedList> getRegion(){
        return regionTwoDimensional;
    }

}
