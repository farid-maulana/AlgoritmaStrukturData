
/**
 *
 * @author FARLAN
 */
public class DoubleLinkedList {

    int size;
    Node head;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insert_CD(CD_Farlan data) {
        if (isEmpty()) {
            head = new Node(null, data, null);
        } else {
            Node current = head;
            boolean found = false;
            while (current.next != null) {
                if (data.kode.equals(current.data.kode)) {
                    found = true;
                    break;
                }
                current = current.next;
            }
            if (found) {
                current.data.stok = current.data.stok + data.stok;
            } else {
                Node newNode = new Node(current, data, null);
                current.next = newNode;
                size++;
            }
        }
    }

    public void out_CD(int index, int jumlah) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Index Out of Bounds");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }

            current.data.stok = current.data.stok - jumlah;
        }
    }

    public void broken_CD(int index, int jumlah) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Index Out of Bounds");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }

            current.data.jumlah_rusak = current.data.jumlah_rusak + jumlah;
        }
    }

    public void print() {
        sort();
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Index\t Kode \t Judul \t\t Genre \t\t "
                    + "Distributor \t\t Stok \t\t Rusak");
            int i = 0;
            while (tmp != null) {
                System.out.println(i + "\t " + tmp.data.kode + " \t "
                        + tmp.data.judul + " \t " + tmp.data.genre + " \t\t "
                        + tmp.data.distributor + " \t\t "
                        + tmp.data.stok + " \t\t " + tmp.data.jumlah_rusak + "");
                i++;
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void sort() {
        if (isEmpty()) {
            System.out.println("Linkedlist masih kosong");
        }
        Node tmp;
        int swap;
        do {
            swap = 0;
            tmp = head;
            while (tmp.next != null) {
                if (tmp.data.judul.compareTo(tmp.next.data.judul) > 0) {
                    CD_Farlan temp = tmp.data;
                    tmp.data = tmp.next.data;
                    tmp.next.data = temp;
                    swap = 1;
                }
                tmp = tmp.next;
            }
            tmp = null;
        } while (swap != 0);
    }

    public void searchKode(String kode) throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        Node tmp = head;
        boolean found = false;
        int i = 0;
        while (tmp != null) {
            if (kode.equals(tmp.data.kode)) {
                found = true;
                break;
            }
            i++;
            tmp = tmp.next;
        }
        if (found) {
            System.out.println("Data : " + kode + " ditemukan");
            System.out.println("Index\t Kode \t Judul \t\t Genre \t\t "
                    + "Distributor \t\t Stok \t\t Rusak");
            System.out.println(i + "\t " + tmp.data.kode + " \t "
                    + tmp.data.judul + " \t " + tmp.data.genre + " \t\t "
                    + tmp.data.distributor + " \t\t "
                    + tmp.data.stok + " \t\t " + tmp.data.jumlah_rusak + "");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    public void searchJudul(String kode) throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        Node tmp = head;
        boolean found = false;
        int i = 0;
        while (tmp != null) {
            if (kode.equals(tmp.data.judul)) {
                found = true;
                break;
            }
            i++;
            tmp = tmp.next;
        }
        if (found) {
            System.out.println("Data : " + kode + " ditemukan");
            System.out.println("Index\t Kode \t Judul \t\t Genre \t\t "
                    + "Distributor \t\t Stok \t\t Rusak");
            System.out.println(i + "\t " + tmp.data.kode + " \t "
                    + tmp.data.judul + " \t " + tmp.data.genre + " \t\t "
                    + tmp.data.distributor + " \t\t "
                    + tmp.data.stok + " \t\t " + tmp.data.jumlah_rusak + "");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
