/**
 *
 * @author FARLAN
 */
import java.util.Scanner;

public class MainNomor1 {                                               // -
    public static void main(String[] args) {                            // -
        Scanner farlan = new Scanner(System.in);                        // O(1)
        Nomor1 main1 = new Nomor1();                                    // O(1)
        Nomor2 main2 = new Nomor2();                                    // O(1)
        
        System.out.print("Masukkan nama Anda : ");                      // O(1)
        main1.nama = farlan.nextLine();                                 // O(1)
        
        main1.countChar(main1.nama);                                    // O(1)
        main2.compareCharBF(main1.nama);                                // O(1)
        main2.compareCharDC(main1.nama, 0, main1.nama.length()-1);      // O(1)
        
        System.out.println("======================================");   // O(1)
        System.out.println("Brute Force");                              // O(1)
        System.out.println("Abjad terkecil : " + main2.small);          // O(1)
        System.out.println("Abjad terbesar : " + main2.big);            // O(1)
        System.out.println("======================================");   // O(1)
        System.out.println("Divide and Conquer");                       // O(1)
        System.out.println("Abjad terkecil : " + main2.getSmall());     // O(1)
        System.out.println("Abjad terbesar : " + main2.getBig());       // O(1)
    }                                                                   // -
}                                                                       // -
