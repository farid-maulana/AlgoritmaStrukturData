package Praktikum;

/**
 *
 * @author FARLAN
 */
import static Praktikum.minMax.max_min;
import java.util.Scanner;

public class MainMinMax {                                               // -

    public static void main(String[] args) {                            // -
        minMax[] ppArray = new minMax[5];                               // O(1)
        ppArray[0] = new minMax();                                      // O(1)

        Scanner sc = new Scanner(System.in);                            // O(1)

        for (int i = 0; i < 5; i++) {                                   // O(n)
            ppArray[i] = new minMax();                                  // O(1)
            System.out.println("Nilai array indeks ke-" + i);           // O(1)
            System.out.print("Masukkan nilai: ");                       // O(1)
            ppArray[i].nilaiArray = sc.nextInt();                       // O(1)
        }                                                               // -

        System.out.println("---------------------------------------");  // O(1)
        System.out.println("Nilai yang Anda masukkan : ");              // O(1)
        for (int i = 0; i < 5; i++) {                                   // O(n)
            System.out.println("Indeks ke-" + i + " : "
                    + ppArray[i].nilaiArray);                           // O(1)
        }                                                               // -

        int arr[] = new int[5];                                         // O(1)
        for (int i = 0; i < 5; i++) {                                   // O(n)
            arr[i] = ppArray[i].nilaiArray;                             // O(1)
        }                                                               // -

        minMax hsl = new minMax();                                      // O(1)
        hsl.MinMax(arr, 5);                                             // O(1)

        System.out.println("---------------------------------------");  // O(1)
        System.out.println("Brute Force");                              // O(1)
        System.out.println("Nilai Minimal : " + hsl.getMin());          // O(1)
        System.out.println("Nilai Maksimal : " + hsl.getMax());         // O(1)

        max_min(arr, 0, 4, hsl);                                        // O(1)

        System.out.println("---------------------------------------");  // O(1)
        System.out.println("Divide Conquer");                           // O(1)
        System.out.print("Nilai Minimal: " + hsl.min
                + "\nNilai Maksimal: " + hsl.max);                      // O(1)
        System.out.print("\n");                                         // O(1)
    }                                                                   // -
}                                                                       // -
