package prj5;

/**
 * Abstract class that represents a linked list
 * 
 * @author Chanaka Perera(chanaka1)
 * @author Eddie Bolton(eddie5)
 * @version 4.8.2018
 * @param <T>
 *            Generic parameter for this class
 */
public class LinkedList<T> {

    private Node<T> head;
    private int size;


    /**
     * The constructor for the class which initializes the private
     * variables in this class
     */
    public LinkedList() {
        head = null;
        size = 0;
    }


    /**
     * @return
     *         The current size of the linked list
     */
    public int size() {
        return size;
    }


    /**
     * Clears the list
     */
    public void clear() {
        head = null;
        size = 0;
    }


    /**
     * adds a node at desired location
     * 
     * @param index
     *            the index to be added
     * @param entry
     *            the data to be added
     */
    public void add(int index, T entry) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Index exceeds size");
        }
        // Sets the current node to head
        Node<T> current = head;
        // If the linked list is empty creates a new
        // head node and saves the entry
        if (isEmpty()) {
            head = new Node<T>(entry);
        }
        // If the entry has to be placed somewhere in the
        // middle of the list
        else {
            int currentIndex = 0;
            while (current != null) {
                if (index == currentIndex + 1) {
                    Node<T> nextNext = current.next;
                    Node<T> newNode = new Node<T>(entry);
                    current.setNext(newNode);
                    newNode.setNext(nextNext);
                }
                current = current.next();
                currentIndex++;
            }
        }
        // Increments the size of the list
        size++;
    }


    /**
     * adds data to end of the list
     * 
     * @param entry
     *            the data to be added
     */
    public void add(T entry) {
        Node<T> current = head;
        // If the list is empty creates a new head node
        // and saves the entry to that node
        if (isEmpty()) {
            head = new Node<T>(entry);
        }
        // IF the list is not empty goes to the end of the list
        // and sets the next node of the final node to this entry
        else {
            for (int i = 0; i < size - 1; i++) {
                current = current.next;

            }
            current.setNext(new Node<T>(entry));
        }
        // Increments the size by one
        size++;
    }


    /**
     * Swaps the position of two nodes for the purpose
     * This method is utilized later in the project
     * for sorting purposes
     * 
     * @param position1
     *            The index of the first object to swap
     * @param position2
     *            The index of the second object in the list to swap
     */
    public void swap(int position1, int position2) {
        // Throws an exception if index exceeds size
        if (position1 > size || position2 > size) {
            throw new IndexOutOfBoundsException("Index exceeds size");
        }
        // Loop through to find the needed nodes in the
        // linked list
        Node<T> firstNode = head;
        Node<T> secondNode = head;
        for (int i = 0; i < position1; i++) {
            firstNode = firstNode.next;
        }
        for (int j = 0; j < position2; j++) {
            secondNode = secondNode.next;
        }
        // Once both nodes are found saves the data in each node
        // in two temporary fields and swaps the data
        T tempData = firstNode.getData();
        T temp2Data = secondNode.getData();
        firstNode.setData(temp2Data);
        secondNode.setData(tempData);
    }


    /**
     * checks if the list is empty
     * 
     * @return True if empty
     */
    public boolean isEmpty() {
        return (size == 0);
    }


    /**
     * Gets the node at certain index
     * 
     * @param index
     *            the index to be returned
     * @return data the data of that index
     */
    public T getAt(int index) {
        Node<T> current = head;
        int currentIndex = 0;
        T data = null;
        // Loops while there are nodes in the linked List
        while (current != null) {
            // If the index is found saves the variable
            if (index == currentIndex) {
                data = current.data;
            }
            currentIndex++;
            current = current.next;
        }
        // Throws an exception if the data is not found
        if (data == null) {
            throw new IndexOutOfBoundsException("Index exceeds the size.");
        }
        return data;
    }


    /**
     * @return
     *         a string representing the list
     */
    @Override
    public String toString() {
        // Concatenates the nodes of the linked list together
        String result = "[";
        Node<T> current = head;
        // Loop runs while there are nodes in the linked list
        while (current != null) {
            result += "" + current.data;
            current = current.next;
            // Adds a comma unless its the last entry on the linked
            // list for formatting purposes
            if (current != null) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }


    /**
     * Implementation of a Node
     * 
     * @author Chanaka Perera
     * @version 4.8.2018
     *
     * @param <T>
     *            Generic data type
     */
    private static class Node<T> {
        private T data;
        private Node<T> next;


        /**
         * Adds data to a node upon construction
         * 
         * @param data
         *            The data to be added
         */
        public Node(T data) {
            this.data = data;
        }


        /**
         * Sets the next node
         * 
         * @param next
         *            The next node to be set
         */
        public void setNext(Node<T> next) {
            this.next = next;
        }


        /**
         * Gets the next node from current reference
         * 
         * @return next The next node
         */
        public Node<T> next() {
            return next;
        }


        /**
         * Getter for node's data
         * 
         * @return data The node's data
         */
        public T getData() {
            return data;
        }


        /**
         * Setter for node's data
         */
        public void setData(T entry) {
            this.data = entry;
        }
    }
}
