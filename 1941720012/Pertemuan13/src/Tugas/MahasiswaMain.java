package Tugas;

import java.util.Scanner;

/**
 *
 * @author FARLAN
 */
public class MahasiswaMain {

    public static void menu() {
        System.out.println("DOUBLE LINK LIST DENGAN MENU");
        System.out.println("==============================");
        System.out.println("Memilih menu");
        System.out.println("1. Tambah awal");
        System.out.println("2. Tambah akhir");
        System.out.println("3. Tambah Data Indeks Tertentu");
        System.out.println("4. Hapus Awal");
        System.out.println("5. Hapus Akhir");
        System.out.println("6. Hapus Indeks Tertentu");
        System.out.println("7. Cetak Data");
        System.out.println("8. Cari");
        System.out.println("9. Sorting Data");
        System.out.println("10. Keluar");
        System.out.println("==============================");
    }

    public static void main(String[] args) {
        Scanner farlan = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();
        int pilih, index;
        do {
            Mahasiswa data = new Mahasiswa();
            menu();
            System.out.print(">> ");
            pilih = farlan.nextInt();
            System.out.println("==============================\n");
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    farlan.nextLine();
                    data.nama = farlan.nextLine();
                    System.out.print("Masukkan nilai: ");
                    data.nilai = farlan.nextInt();
                    dll.addFirst(data);
                    break;
                case 2:
                    System.out.print("Masukkan nama: ");
                    farlan.nextLine();
                    data.nama = farlan.nextLine();
                    System.out.print("Masukkan nilai: ");
                    data.nilai = farlan.nextInt();
                    dll.addLast(data);
                    break;
                case 3:
                    System.out.print("Masukkan nama: ");
                    farlan.nextLine();
                    data.nama = farlan.nextLine();
                    System.out.print("Masukkan nilai: ");
                    data.nilai = farlan.nextInt();
                    System.out.print("Masukkan posisi indeks data: ");
                    index = farlan.nextInt();
                    try {
                        dll.add(data, index);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        dll.removeFirst();
                    } catch (Exception e) {
                        System.out.print(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        dll.removeLast();
                    } catch (Exception e) {
                        System.out.print(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.print("Masukkan Posisi indeks data : ");
                    index = farlan.nextInt();
                    try {
                        dll.remove(index);
                    } catch (Exception e) {
                        System.out.print(e.getMessage());
                    }
                    break;
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.print("Masukkan nama yang ingin dicari : ");
                    farlan.nextLine();
                    String nama = farlan.nextLine();
                    try {
                        dll.get(nama);
                    } catch (Exception e) {
                        System.out.print(e.getMessage());
                    }
                    break;
                case 9:
                    try {
                        dll.sort();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 10:
                    System.exit(0);
            }
            System.out.println();
        } while (pilih >= 1 && pilih <= 10);
    }
}
