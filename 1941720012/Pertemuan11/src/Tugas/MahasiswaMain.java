package Tugas;

import java.util.Scanner;

/**
 *
 * @author FARLAN
 */
public class MahasiswaMain {

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
        Mahasiswa data = new Mahasiswa();
        int pilih, index;
        String key;
        do {
            menu();
            pilih = farlan.nextInt();
            Mahasiswa dataBaru = new Mahasiswa();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nim: ");
                    dataBaru.nim = farlan.next();
                    farlan.nextLine();
                    System.out.print("Masukkan nama: ");
                    dataBaru.nama = farlan.nextLine();
                    System.out.print("Masukkan alamat: ");
                    dataBaru.alamat = farlan.nextLine();
                    System.out.println("~~~~~~~~~~~~~~~~~~");
                    System.out.println("Pilih operasi selanjutnya");
                    System.out.println("1. Tambah (First)");
                    System.out.println("2. Tambah (Index)");
                    System.out.println("3. Tambah (Last)");
                    System.out.println("------------------");
                    pilih = farlan.nextInt();
                    switch (pilih) {
                        case 1:
                            data.addFirst(dataBaru);
                            break;
                        case 2:
                            System.out.print("Tambahkan pada index ke-: ");
                            index = farlan.nextInt();
                            try {
                                data.add(dataBaru, index);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 3:
                            data.addLast(dataBaru);
                            break;
                    }
                    data.print();
                    break;
                case 2:
                    System.out.println("Masukkan operasi selanjutnya: ");
                    System.out.println("1. Hapus (Index)");
                    System.out.println("2. Hapus (Key)");
                    System.out.println("3. Clear");
                    System.out.println("------------------");
                    pilih = farlan.nextInt();
                    switch (pilih) {
                        case 1:
                            System.out.print("Hapus data di posisi: ");
                            index = farlan.nextInt();
                            try {
                                data.remove(index);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 2:
                            System.out.print("Hapus data: ");
                            key = farlan.next();
                            try {
                                data.removeByValue(key);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 3:
                            data.clear();
                            break;
                    }
                    data.print();
                    break;
                case 3:
                    System.out.println("Masukkan operasi selanjutnya: ");
                    System.out.println("1. Cari (Index)");
                    System.out.println("2. Cari (Key)");
                    System.out.println("------------------");
                    pilih = farlan.nextInt();
                    switch (pilih) {
                        case 1:
                            System.out.print("Cari data di posisi: ");
                            index = farlan.nextInt();
                            try {
                                data.get(index);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 2:
                            System.out.print("Cari data: ");
                            key = farlan.next();
                            try {
                                data.getByValue(key);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
