package Tugas;

/**
 *
 * @author FARLAN
 */
public class Nasabah {

    Node2 head;
    String noRekening, nama;
    int size;

    public Nasabah() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Nasabah data) {
        head = new Node2(data, head);
        size++;
    }

    public void addLast(Nasabah data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            Node2 tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node2(data, null);
            size++;
        }
    }

    public void getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        } else {
            System.out.println("NIM : " + head.data.noRekening);
            System.out.println("Nama : " + head.data.nama);
        }
    }

    public void getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        Node2 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        System.out.println("NIM : " + tmp.data.noRekening);
        System.out.println("Nama : " + tmp.data.nama);
    }

    public void get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        Node2 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        System.out.println("NIM : " + tmp.data.noRekening);
        System.out.println("Nama : " + tmp.data.nama);
    }

    public void getByValue(String item) throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        Node2 tmp = head;
        boolean found = false;
        int i = 0;
        while (tmp != null) {
            if (item.equals(tmp.data.noRekening)) {
                found = true;
                break;
            }
            i++;
            tmp = tmp.next;
        }
        if (found) {
            System.out.println("NIM : " + tmp.data.noRekening);
            System.out.println("Nama : " + tmp.data.nama);
            System.out.println("Berada di urutan ke-" + i);
            System.out.println("___________________");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    public void removeFirst() throws Exception {
        head = head.next;
        size--;
    }

    public void print() {
        if (!isEmpty()) {
            Node2 tmp = head;
            while (tmp != null) {
                System.out.println("NIM : " + tmp.data.noRekening);
                System.out.println("Nama : " + tmp.data.nama);
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedLists kosong");
        }
    }
}
