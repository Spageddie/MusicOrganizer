package prj5;
/**
 * Represents a node in a singly linked list. This node
 * has data and points to the next node in the list
 * @author Matthew Marquez (mmarquez)
 * @version 2017.11.15
 * 
 *
 * @param <T> generic type for Node
 */
public class Node<T> {
    private T data;
    private Node<T> next;

    /**
     * Creates a new node with given data
     * @param data
     *      the data to put in node
     */
    public Node(T data) {
        this.data = data;
    }
    
    /**
     * Sets the next node
     * @param node
     *      the next node
     */
    public void setNext(Node<T> node) {
        this.next = node;
    }

    /**
     * Gets the next node
     * @return the next node
     */
    public Node<T> next() {
        return this.next;
    }

    /**
     * Gets the data from a node
     * @return data in the node
     */
    public T getData() {
        return this.data;
    }
    public void setData(T anEntry) {
        data = anEntry;
    }

}
