package Praktikum;
import java.util.Scanner;

/**
 *
 * @author farid
 */
public class MainPangkat {

    public static void main(String[] args) {
        Scanner farlan = new Scanner(System.in);

        System.out.println("================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = farlan.nextInt();

        Pangkat png[] = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + ": ");
            png[i].nilai = farlan.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + ": ");
            png[i].pangkat = farlan.nextInt();
        }

        System.out.println("Menu");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Pilih metode (1/2) : ");
        int menu = farlan.nextInt();
        
        if (menu == 1) {
            System.out.println("================================================");
            System.out.println("Hasil Pangkat dengan Brute Force");
            for (int i = 0; i < elemen; i++) {
                System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }
        } else if (menu == 2) {
            System.out.println("================================================");
            System.out.println("Hasil Pangkat dengan Divide and Conquer");
            for (int i = 0; i < elemen; i++) {
                System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            }
        } else {
            System.out.println("Pilihan yang Anda masukkan salah.");
        }
    }
}
