package mx.x10.reverseeffectapps.datastructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Class CustomStack <- E -
 *
 * This class just plays around with a LinkedList implementation of a LIFO Stack.
 *
 * @author Robert
 * Created 4/25/2017.
 */
public class CustomStack<E> {
    private LinkedList<E> backendList;

    /**
     * Constructor CustomStack() -
     *
     * This is a default constructor that initializes a new CustomStack object and linkedList.
     */
    public CustomStack() {
        backendList = new LinkedList<>();
    }

    /**
     * Method push(E) -
     *
     * This method adds a new object to the stack.
     *
     * @param e An arbitrary element to add to the stack.
     */
    public void push(E e) {
        backendList.addFirst(e);
    }

    /**
     * Method pop() -
     *
     * This method removes the item on the top of the stack and returns it.
     *
     * @return An element that was on top of the stack.
     */
    public E pop() {
        return backendList.removeFirst();
    }

    /**
     * Method peek() -
     *
     * This method returns the item on the top of the stack.
     *
     * @return An element that is currently on the top of the stack.
     */
    public E peek() {
        return backendList.getFirst();
    }

    /**
     * Method getDataSource() -
     *
     * This method gets the backend List of the current Stack.
     *
     * @return A LinkedList copy representing the current state of the Stack.
     */
    public List<E> getDataSource() {
        return new LinkedList<E>(backendList);
    }

    /**
     * Override Method toString() -
     *
     * This method gives a String representation of the current state of the stack.
     *
     * @return A String representation of the state of the stack.
     */
    public String toString() {
        String temp = "==================Stack==================\n";
        Iterator<E> iterator = backendList.iterator();

        while (iterator.hasNext()) {
            temp += "[" + iterator.next() + "]\n";
        }

        temp += "=========================================";

        return temp;
    }
}
