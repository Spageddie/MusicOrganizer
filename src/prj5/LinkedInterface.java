package prj5;

/**
 * Interface for the ADT LinkedList
 * 
 * @author Matthew Marquez (mmarquez)
 * @version 2017.11.15
 * @param <T>
 *            generic type for LinkedList
 */
public interface LinkedInterface<T> {
    /**
     * Removes all items from list
     */
    public void clear();
    /**
     * Checks if list is empty
     * @return Returns true if list is empty
     */
    public boolean isEmpty();
    /**
     * Adds an item to the list
     * @param anEntry
     *      the generic you are adding to list
     */
    public void add(T anEntry);
    /**
     * Removes the specified item from the lsit
     * @param anEntry
     *      the generic you are removing from list
     * @return the generic you removed
     */
    public T remove(T anEntry);
}
