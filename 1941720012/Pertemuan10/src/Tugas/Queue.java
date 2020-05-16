package Tugas;

import java.util.Scanner;

/**
 *
 * @author FARLAN
 */
public class Queue {

    static Scanner sc = new Scanner(System.in);
    int max;
    int front;
    int rear;
    int size;
    Nasabah[] q;

    public Queue(int max) {
        this.max = max;
        create();
    }

    public void create() {
        size = 0;
        front = rear = -1;
        q = new Nasabah[max];
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

    public void enqueue(String data) {
//        String dt = Integer.toString(data);
        if (isFull()) {
            System.out.println("Antrian sudah penuh.");
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
            System.out.print("Masukkan nama nasabah: ");
            String nama = sc.nextLine();
            q[rear] = new Nasabah(data, nama);
            size++;
        }
    }

    public int dequeue() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");
        } else {
            data = Integer.parseInt(q[front].noRekening);
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

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");
        } else {
            System.out.println("Daftar antrian :");
            int i = front;
            while (i != rear) {
                System.out.println("No. antrian : " + i);
                q[i].print();
                System.out.println();
                i = (i + 1) % max;
            }
            System.out.println("No. antrian : " + i);
            q[i].print();
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Nasabah terdepan:");
            q[front].print();
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Nasabah terbelakang: ");
            q[rear].print();
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void peekPosition(String nas) {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");
        } else {
            int i = front;
            boolean found = false;
            if (nas.equals(q[rear].noRekening)) {
                System.out.println("Data nasabah");
                q[rear].print();
                System.out.println("Nomor Antrian: " + rear);
                found = true;
            } else {
                while (i != rear) {
                    if (nas.equals(q[i].noRekening)) {
                        System.out.println("Data nasabah");
                        q[i].print();
                        System.out.println("Nomor Antrian: " + i);
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

    public void printNasabah(int posisi) {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            if (posisi >= max) {
                System.out.println("Melebihi jumlah antrian.");
            } else {
                boolean found = false;
                if (posisi == rear) {
                    System.out.println("Data nasabah di posisi " + posisi + ": ");
                    q[rear].print();
                    found = true;
                } else {
                    int i = front;
                    while (i != rear) {
                        if (posisi == i) {
                            System.out.println("Data nasabah di posisi " + posisi + ": ");
                            q[i].print();
                            found = true;
                        }
                        i++;
                    }
                }
                if (!found) {
                    System.out.println("Tidak ada data di posisi " + posisi);
                }
            }
        }
    }
}
