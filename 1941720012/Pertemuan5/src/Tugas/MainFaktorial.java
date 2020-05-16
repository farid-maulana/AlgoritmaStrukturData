package Tugas;

import java.util.Scanner;

/**
 *
 * @author farid
 */
public class MainFaktorial {                                            // -

    public static void main(String[] args) {                            // -
        Scanner farlan = new Scanner(System.in);                        // O(1)

        System.out.println("=======================================");  // O(1)
        System.out.print("Masukkan jumlah elemen yang "
                + "ingin dihitung : ");                                 // O(1)
        int elemen = farlan.nextInt();                                  // O(1)

        Faktorial fk[] = new Faktorial[elemen];                         // O(1)
        for (int i = 0; i < elemen; i++) {                              // O(n)
            fk[i] = new Faktorial();                                    // O(1)
            System.out.print("Masukkan nilai data ke-" 
                    + (i + 1) + " : ");                                 // O(1)
            fk[i].nilai = farlan.nextInt();                             // O(1)
        }                                                               // -

        System.out.println("=======================================");  // O(1)
        System.out.println("Hasil Faktorial dengan Brute Force");       // O(1)
        for (int i = 0; i < elemen; i++) {                              // O(n)
            System.out.println("Faktorial dari nilai "
                    + fk[i].nilai + " adalah : " 
                    + fk[i].faktorialBF(fk[i].nilai));                  // O(1)
        }                                                               // -
        
        System.out.println("=======================================");  // O(1)
        System.out.println("Hasil Faktorial dengan "
                + "Divide and Conquer");                                // O(1)
        for (int i = 0; i < elemen; i++) {                              // O(n)
            System.out.println("Faktorial dari nilai "
                    + fk[i].nilai + " adalah : " 
                    + fk[i].faktorialDC(fk[i].nilai));                  // O(1)
        }                                                               // -
    }                                                                   // -
}                                                                       // -
