package Praktikum;

/**
 *
 * @author FARLAN
 */
class Node<T> {
    T data;
    Node next;
    
    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }
}
