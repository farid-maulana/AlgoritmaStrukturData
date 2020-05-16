package Tugas;

import java.util.Scanner;

/**
 *
 * @author FARLAN
 */
public class MainTiket {

    public static void main(String[] args) {
        Scanner farlan = new Scanner(System.in);
        String maskapai[] = {"Garuda", "Lion Air", "Sriwijaya Air", "Citilink", "Batik Air"};
        float harga[] = {1797200, 882600, 906800, 1102600, 984200};
        int tersedia[] = {6, 31, 12, 17, 3};
        int terjual[] = {64, 184, 136, 163, 177};
        int pilihan = 0;

        Tiket ticket = new Tiket();
        Tiket data[] = new Tiket[5];
        for (int i = 0; i < maskapai.length; i++) {
            data[i] = new Tiket(maskapai[i], harga[i], tersedia[i], terjual[i]);
        }

        System.out.println("Daftar Maskapai dan Harganya");
        System.out.println("+----------------+---------------+--------------+---------------+");
        System.out.println("|Nama maskapai \t |Harga \t |Tersedia\t|Terjual\t|");
        System.out.println("+================+===============+==============+===============+");
        for (int i = 0; i < data.length; i++) {
            data[i].tampil();
            System.out.println("+----------------+---------------+--------------+---------------+");
        }

        do {
            System.out.println("Sorting berdasarkan : ");
            System.out.println("1. Harga Rendah->Tinggi (Bubble)");
            System.out.println("2. Harga Rendah->Tinggi (Selection)");
            System.out.println("0. Exit");
            System.out.println("-------------------------------------------------");
            System.out.print("Masukkan pilihan Anda (0-2) : ");
            pilihan = farlan.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Sorting Harga Rendah ke Tinggi (Bubble)");
                    System.out.println("+----------------+---------------+--------------+---------------+");
                    System.out.println("|Nama maskapai \t |Harga \t |Tersedia\t|Terjual\t|");
                    System.out.println("+================+===============+==============+===============+");
                    ticket.bubbleSort(data);
                    for (int i = 0; i < data.length; i++) {
                        data[i].tampil();
                        System.out.println("+----------------+---------------+--------------+---------------+");
                    }
                    break;
                case 2:
                    System.out.println("Sorting Harga Rendah ke Tinggi (Selection)");
                    System.out.println("+----------------+---------------+--------------+---------------+");
                    System.out.println("|Nama maskapai \t |Harga \t |Tersedia\t|Terjual\t|");
                    System.out.println("+================+===============+==============+===============+");
                    ticket.selectionSort(data);
                    for (int i = 0; i < data.length; i++) {
                        data[i].tampil();
                        System.out.println("+----------------+---------------+--------------+---------------+");
                    }
                    break;
                default:
                    System.out.println("Pilihan Anda salah!");
                    break;
            }
        } while (pilihan != 0);
    }
}
