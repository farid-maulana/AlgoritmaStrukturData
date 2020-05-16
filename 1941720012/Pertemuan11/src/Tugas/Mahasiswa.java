package Tugas;

/**
 *
 * @author FARLAN
 */
public class Mahasiswa {

    Node head;
    String nim, nama, alamat;
    int size;

    public Mahasiswa() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa data) {
        head = new Node(data, head);
        size++;
    }

    public void add(Mahasiswa data, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0) {
            addFirst(data);
        } else {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(data, next);
            size++;
        }
    }

    public void addLast(Mahasiswa data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(data, null);
            size++;
        }
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (head == null) {
            removeFirst();
        } else {
            Node prev = head;
            Node cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }

    public void removeFirst() throws Exception {
        head = head.next;
        size--;
    }

    public void removeByValue(String key) throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists masih kosong");
        }
        if (head == null) {
            removeFirst();
        } else {
            Node temp = head;
            Node prev = null;

            // jika data yang ingin dihapus 
            // berada di node terdepan
            if (key.equals(temp.data.nim)) {
                head = temp.next;
                return;
            }

            // mencari data yang ingin dihapus 
            while (!temp.equals(null) && !key.equals(temp.data.nim)) {
                prev = temp;
                temp = temp.next;
            }

            // jika data tidak ditemukan
            if (temp == null) {
                throw new Exception("Data tidak ditemukan");
            }
            prev.next = temp.next;
            size--;
        }
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        System.out.println("NIM : " + tmp.data.nim);
        System.out.println("Nama : " + tmp.data.nama);
        System.out.println("Alamat : " + tmp.data.alamat);
        System.out.println("___________________");
    }

    public void getByValue(String item) throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        Node tmp = head;
        boolean found = false;
        int i = 0;
        while (tmp != null) {
            if (item.equals(tmp.data.nim)) {
                found = true;
                break;
            }
            i++;
            tmp = tmp.next;
        }
        if (found) {
            System.out.println("NIM : " + tmp.data.nim);
            System.out.println("Nama : " + tmp.data.nama);
            System.out.println("Alamat : " + tmp.data.alamat);
            System.out.println("Berada di urutan ke-" + i);
            System.out.println("___________________");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("NIM : " + tmp.data.nim);
                System.out.println("Nama : " + tmp.data.nama);
                System.out.println("Alamat : " + tmp.data.alamat);
                System.out.println("___________________");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedLists kosong");
        }
    }
}
