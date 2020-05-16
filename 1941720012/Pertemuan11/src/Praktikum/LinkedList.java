package Praktikum;

/**
 *
 * @author FARLAN
 */
public class LinkedList {

    Node head;
    int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Object item) {
        head = new Node(item, head);
        size++;
    }

    public void add(Object item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0) {
            addFirst(item);
        } else {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(item, next);
            size++;
        }
    }

    public void addLast(Object item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(item, null);
            size++;
        }
    }

    public void addByValue
        (Object item, Object after) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node tmp = head;
            boolean found = false;
            while (tmp != null) {
                if (after.equals(tmp.data)) {
                    found = true;
                    break;
                }
                tmp = tmp.next;
            }
            if (found) {
                Node next = (tmp == null) ? null : tmp.next;
                tmp.next = new Node(item, next);
                size++;
            } else {
                throw new Exception
                    ("Nilai acuan tidak ditemukan");
            }
        }
    }
    public Object getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        return head.data;
    }

    public Object getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Object get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Object getByValue(Object item) throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        Node tmp = head;
        boolean found = false;
        while (tmp != null) {
            if (item.equals(tmp.data)) {
                found = true;
                break;
            }
            tmp = tmp.next;
        }
        if (found) {
            return tmp.data;
        } else {
            throw new Exception("Data tidak ditemukan");
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

    public void removeByValue(Object item) throws Exception {
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
            if (item.equals(temp.data)) {
                head = temp.next;
                return;
            }

            // mencari data yang ingin dihapus dan 
            while (!temp.equals(null) && !item.equals(temp.data)) {
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

    public void removeFirst() throws Exception {
        head = head.next;
        size--;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedLists kosong");
        }
    }
}
