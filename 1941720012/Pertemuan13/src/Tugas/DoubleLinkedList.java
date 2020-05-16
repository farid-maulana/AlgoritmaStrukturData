package Tugas;

/**
 *
 * @author FARLAN
 */
public class DoubleLinkedList {

    int size;
    NodeMhs head;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa data) {
        if (isEmpty()) {
            head = new NodeMhs(null, data, null);
        } else {
            NodeMhs newNode = new NodeMhs(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            NodeMhs current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeMhs newNode = new NodeMhs(current, data, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Mahasiswa data, int index) throws Exception {
        if (isEmpty()) {
            addFirst(data);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            NodeMhs current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                NodeMhs newNode = new NodeMhs(null, data, current);
                current.prev = newNode;
                head = newNode;
            } else {
                NodeMhs newNode = new NodeMhs(current.prev, data, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMhs tmp = head;
            while (tmp != null) {
                System.out.println("Nama \t: " + tmp.data.nama);
                System.out.println("Nilai \t: " + tmp.data.nilai);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        NodeMhs current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            NodeMhs current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public void get(String nama) throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        NodeMhs tmp = head;
        boolean found = false;
        int i = 0;
        while (tmp != null) {
            if (nama.equals(tmp.data.nama)) {
                found = true;
                break;
            }
            i++;
            tmp = tmp.next;
        }
        if (found) {
            System.out.println("Data : " + nama + " ditemukan pada indeks ke: " 
                    + i + " dengan nilai " + tmp.data.nilai);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    public void sort() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        NodeMhs tmp;
        int swap;
        do {
            swap = 0;
            tmp = head;

            while (tmp.next != null) {
                if (tmp.data.nilai < tmp.next.data.nilai) {
                    Mahasiswa temp = tmp.data;
                    tmp.data = tmp.next.data;
                    tmp.next.data = temp;
                    swap = 1;
                }
                tmp = tmp.next;
            }
            tmp = null;
        } while (swap != 0);
    }
}
