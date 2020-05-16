package Tugas;

import java.util.Scanner;

/**
 *
 * @author FARLAN
 */
public class MainKelasemen {

    public static void main(String[] args) {
        Scanner farlan = new Scanner(System.in);
        Scanner farid = new Scanner(System.in);
        int pilihan = 0;

        System.out.print("Masukkan jumlab club : ");
        int jumlah = farlan.nextInt();

        String namaClub[] = new String[jumlah];
        int main[] = new int[jumlah];
        int selisihGol[] = new int[jumlah];
        int point[] = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nama club : ");
            namaClub[i] = farid.nextLine();
            System.out.print("Jumlah main : ");
            main[i] = farlan.nextInt();
            System.out.print("Selisih gol : ");
            selisihGol[i] = farlan.nextInt();
            System.out.print("Jumlah point : ");
            point[i] = farlan.nextInt();
            System.out.println("---------------------------------------------");
        }

        Kelasemen kelasemen = new Kelasemen();
        Kelasemen data[] = new Kelasemen[jumlah];
        for (int i = 0; i < jumlah; i++) {
            data[i] = new Kelasemen(namaClub[i], main[i], selisihGol[i], point[i]);
        }
        System.out.println("Data Premiere League Unsorted");
        System.out.println("+----------------+------+-------+-------+");
        System.out.println("|Nama Club \t | P \t| GD \t| PTS \t|");
        System.out.println("+================+======+=======+=======+");
        for (int i = 0; i < data.length; i++) {
            data[i].tampil();
            System.out.println("+----------------+------+-------+-------+");
        }
        do {
            System.out.println("Sorting berdasarkan : ");
            System.out.println("1. Descending");
            System.out.println("2. Ascending");
            System.out.println("0. Exit");
            System.out.println("---------------------------------------------");
            System.out.print("Masukkan pilihan Anda (0-2) : ");
            pilihan = farlan.nextInt();

            switch (pilihan) {
                default:
                    System.out.println("Pilihan Anda salah!");
                    break;
                case 1:
                    System.out.println("Premiere League");
                    System.out.println("+----------------+------+-------+-------+");
                    System.out.println("|Nama Club \t | P \t| GD \t| PTS \t|");
                    System.out.println("+================+======+=======+=======+");
                    kelasemen.insertionSort(data, false);
                    for (int i = 0; i < data.length; i++) {
                        data[i].tampil();
                        System.out.println("+----------------+------+-------+-------+");
                    }
                    break;
                case 2:
                    System.out.println("Premiere League");
                    System.out.println("+----------------+------+-------+-------+");
                    System.out.println("|Nama Club \t | P \t| GD \t| PTS \t|");
                    System.out.println("+================+======+=======+=======+");
                    kelasemen.insertionSort(data, true);
                    for (int i = 0; i < data.length; i++) {
                        data[i].tampil();
                        System.out.println("+----------------+------+-------+-------+");
                    }
                    break;
            }
        } while (pilihan != 0);
    }
}
