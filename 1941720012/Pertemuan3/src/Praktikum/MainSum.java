package Praktikum;
import java.util.Scanner;

/**
 *
 * @author farid
 */
public class MainSum {
    public static void main(String[] args) {
        Scanner farlan = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("Program Menghitung Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan : ");
        int perusahaan = farlan.nextInt();
        System.out.print("Masukkan jumlah bulan : ");
        int elm = farlan.nextInt();

        for (int j = 0; j < perusahaan; j++) {
            System.out.println("==========================================================");
            System.out.println("Perusahaan ke-" + (j + 1));
            Sum sm = new Sum(elm);
            System.out.println("==========================================================");
            for (int i = 0; i < sm.elemen; i++) {
                System.out.print("Masukkan untung bulan ke-" + (i + 1) + " = ");
                sm.keuntungan[i] = farlan.nextDouble();
            }
            System.out.println("==========================================================");
            System.out.println("Algoritma Bruce Force");
            System.out.printf("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = %.2f\n", 
                    sm.totalBF(sm.keuntungan));
            System.out.println("==========================================================");
            System.out.println("Algoritma Devide Conquer");
            System.out.printf("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = %.2f\n", 
                    sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
        }
        System.out.println();
    }
}
