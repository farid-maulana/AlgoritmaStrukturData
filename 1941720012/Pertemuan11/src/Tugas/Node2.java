package Tugas;

/**
 *
 * @author FARLAN
 */
public class Node2<T> {
    Nasabah data = new Nasabah();
    Node2 next;

    public Node2(Nasabah data, Node2 next) {
        this.data = data;
        this.next = next;
    }
}
