package Praktikum;

/**
 *
 * @author FARLAN
 */
public class Node<T> {

    Node<T> prev;
    T data;
    Node<T> next;

    public Node(Node prev, T data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
