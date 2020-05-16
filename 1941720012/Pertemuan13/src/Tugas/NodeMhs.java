package Tugas;

/**
 *
 * @author FARLAN
 */
public class NodeMhs {

    Mahasiswa data = new Mahasiswa();
    NodeMhs prev, next;

    public NodeMhs(NodeMhs prev, Mahasiswa data, NodeMhs next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
