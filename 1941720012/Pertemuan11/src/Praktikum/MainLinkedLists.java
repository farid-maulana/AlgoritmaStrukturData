package Praktikum;

import java.util.Scanner;

/**
 *
 * @author FARLAN
 */
public class MainLinkedLists {

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari");
        System.out.println("4. Keluar");
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Scanner farlan = new Scanner(System.in);
        Scanner farid = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        LinkedList data = new LinkedList();

        int pilih;
        String item;
        int indeks;
        do {
            menu();
            pilih = farid.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan operasi yang diinginkan: ");
                    System.out.println("1. Tambah (First)");
                    System.out.println("2. Tambah (Index)");
                    System.out.println("3. Tambah (Last)");
                    System.out.println("~~~~~~~~~~~~~~~~~~");
                    pilih = farid.nextInt();
                    switch (pilih) {
                        case 1:
                            System.out.print("Masukkan data: ");
                            item = farlan.nextLine();
                            data.addFirst(item);
                            data.print();
                            break;
                        case 2:
                            System.out.print("Masukkan data: ");
                            item = farlan.nextLine();
                            System.out.print("Masukkan indeks posisi: ");
                            indeks = farlan.nextInt();
                            try {
                                data.add(item, indeks);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            data.print();
                            break;
                        case 3:
                            System.out.print("Masukkan data: ");
                            item = sc.nextLine();
                            data.addLast(item);
                            data.print();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Masukkan operasi yang diinginkan: ");
                    System.out.println("1. Hapus (Index)");
                    System.out.println("2. Hapus (Key)");
                    System.out.println("3. Clear");
                    System.out.println("~~~~~~~~~~~~~~~~~~");
                    pilih = farlan.nextInt();
                    switch (pilih) {
                        case 1:
                            System.out.print("Hapus data di posisi: ");
                            indeks = farid.nextInt();
                            try {
                                data.remove(indeks);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            data.print();
                            break;
                        case 2:
                            System.out.print("Hapus data: ");
                            item = sc.nextLine();
                            try {
                                data.removeByValue(item);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            data.print();
                            break;
                        case 3:
                            data.clear();
                            data.print();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Masukkan operasi yang diinginkan: ");
                    System.out.println("1. Cari (Index)");
                    System.out.println("2. Cari (Key)");
                    System.out.println("~~~~~~~~~~~~~~~~~~");
                    pilih = farlan.nextInt();
                    switch (pilih) {
                        case 1:
                            System.out.print("Cari data di posisi: ");
                            indeks = farid.nextInt();
                            try {
                                System.out.println(data.get(indeks));
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 2:
                            System.out.print("Cari data: ");
                            item = sc.nextLine();
                            try {
                                System.out.println("Data " + data.getByValue(item) + " ditemukan");
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
