package Tugas;

/**
 *
 * @author FARLAN
 */
import java.util.Scanner;

public class MainNilaiAlgoritma {

    public static void main(String[] args) {
        Scanner farlan = new Scanner(System.in);
        Scanner farid = new Scanner(System.in);
        double total[];

        System.out.print("Masukkan banyak mahasiswa : ");
        int elemen = farlan.nextInt();
        System.out.println();

        NilaiAlgoritma nilai[] = new NilaiAlgoritma[elemen];
        total = new double[elemen];
        NilaiAlgoritma algo = new NilaiAlgoritma();
        for (int i = 0; i < elemen; i++) {
            nilai[i] = new NilaiAlgoritma();
            System.out.println("Mahasiswa ke-" + (i + 1) + "");
            System.out.print("Masukkan nama : ");
            nilai[i].namaMhs = farid.nextLine();
            System.out.print("Masukkan nilai tugas : ");
            nilai[i].nilaiTugas = farlan.nextInt();
            System.out.print("Masukkan nilai kuis : ");
            nilai[i].nilaiKuis = farlan.nextInt();
            System.out.print("Masukkan nilai UTS : ");
            nilai[i].nilaiUTS = farlan.nextInt();
            System.out.print("Masukkan nilai UAS : ");
            nilai[i].nilaiUAS = farlan.nextInt();
            System.out.println();
        }

        for (int i = 0; i < elemen; i++) {
            System.out.println("===========================================");
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.println("Nama \t\t : " + nilai[i].namaMhs);
            System.out.println("Nilai Tugas \t : " + nilai[i].nilaiTugas);
            System.out.println("Nilai Kuis \t : " + nilai[i].nilaiKuis);
            System.out.println("Nilai UTS \t : " + nilai[i].nilaiUTS);
            System.out.println("Nilai UAS \t : " + nilai[i].nilaiUAS);
            System.out.println("------------------------------------------");
            total[i] = nilai[i].hitungTotalNilai();
            System.out.println("Nilai Akhir \t : " + total[i]);
//            total = nilai[i].hitungRataRata(nilai[i].hitungTotalNilai(), elemen);
        }
        
        System.out.println("===========================================");
        System.out.println("Rata-rata keseluruhan : " + algo.hitungRataRata(total, elemen));
    }
}
