package Praktikum;

/**
 *
 * @author FARLAN
 */
public class Queue {

    int max;
    int size;
    int front;
    int rear;
    int[] Q;

    public Queue(int max) {
        this.max = max;
        Create();
    }

    public void Create() {
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + Q[front]);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terbelakang: " + Q[rear]);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekPosition(int data) {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            boolean found = false;
            if (data == Q[rear]) {
                System.out.println("Data " + data + " berada di posisi " + rear);
                found = true;
            } else {
                while (i != rear) {
                    if (data == Q[i]) {
                        System.out.println("Data " + data + " berada di posisi " + i);
                        found = true;
                    }
                    i = (i + 1) % max;
                }
            }
            if (!found) {
                System.out.println("Data tidak ditemukan.");
            }

        }
    }

    public void peekAt(int data) {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            if (data >= max) {
                System.out.println("Melebihi jumlah antrian.");
            } else {
                boolean found = false;
                if (data == rear) {
                    System.out.println("Data yang berada di posisi " + data + " adalah " + Q[rear]);
                    found = true;
                } else {
                    int i = front;
                    while (i != rear) {
                        if (data == i) {
                            System.out.println("Data yang berada di posisi " + data + " adalah " + Q[i]);
                            found = true;
                        }
                        i++;
                    }
                }
                if (!found) {
                    System.out.println("Tidak ada data di posisi " + data);
                }
            }
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Jumlah antrian = " + size);
        }
    }

    public void Enqueue(int data) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }

    public int Dequeue() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            data = Q[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }
}
