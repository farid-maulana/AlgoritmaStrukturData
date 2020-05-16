package Tugas;

/**
 *
 * @author FARLAN
 */
public class Node<T> {

    Mahasiswa data = new Mahasiswa();
    Node next;

    public Node(Mahasiswa data, Node next) {
        this.data = data;
        this.next = next;
    }
}
