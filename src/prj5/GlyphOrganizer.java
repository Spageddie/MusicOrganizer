package prj5;

public class GlyphOrganizer {
    private LinkedList<LinkedList> hobbyTwoDimensional;
    private LinkedList<LinkedList> majorTwoDimensional;
    private LinkedList<LinkedList> regionTwoDimensional;
    private LinkedList hobbyList;
    private LinkedList majorList;
    private LinkedList regionList;
    public GlyphOrganizer(LinkedList h, LinkedList m, LinkedList r) {
        hobbyList = h;
        majorList = m;
        regionList = r;
    }
    public void organizeHobby() {
        
    }
    public void organizeMajor() {
        
    }
    public void organizeRegion() {
        
    }
    public void sortBySong(LinkedList list) {
        Node currentNode = list.head;
        Glyph [] result = (Glyph[])list.toArray();
        for(int i=0; i<result.length; i++) {
            Glyph min = result[i];
            for (int j=0; j<result.length; j++) {
                if((min.getSong().getTitle()).compareTo(result[j].getSong().getTitle())>1) {
                    min = result[j];
                }
                Glyph temp = min;
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
