package Tugas;

import java.util.Scanner;

/**
 *
 * @author FARLAN
 */
public class NasabahMain {

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
        Nasabah data = new Nasabah();
        int pilih, index;
        String key;
        do {
            menu();
            pilih = farlan.nextInt();
            Nasabah dataBaru = new Nasabah();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nomor rekening: ");
                    dataBaru.noRekening = farlan.next();
                    farlan.nextLine();
                    System.out.print("Masukkan nama: ");
                    dataBaru.nama = farlan.nextLine();
                    data.addLast(dataBaru);
                    data.print();
                    break;
                case 2:
                    try {
                    data.removeFirst();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                data.print();
                break;
                case 3:
                    System.out.println("Masukkan operasi selanjutnya: ");
                    System.out.println("1. Cari (Index)");
                    System.out.println("2. Cari (Key)");
                    System.out.println("3. Cari (Terdepan)");
                    System.out.println("4. Cari (Terbelakang)");
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
                        case 3:
                            try {
                                data.getFirst();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 4:
                            try {
                                data.getLast();
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
