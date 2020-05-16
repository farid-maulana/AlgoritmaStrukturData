package Tugas;

/**
 *
 * @author FARLAN
 */
public class minMax {                                                   // -

    public int nilaiArray, min, max;                                    // -

    minMax() {}                                                         // -

    public minMax(int min, int max) {                                   // -
        this.min = min;                                                 // O(1)
        this.max = max;                                                 // O(1)
    }                                                                   // -

    public void MinMax(int arr[], int n) {                              // -
        min = arr[0];                                                   // O(1)
        max = arr[0];                                                   // O(1)

        for (int i = 0; i < n; i++) {                                   // O(n)
            if (arr[i] < min) {                                         // -
                min = arr[i];                                           // O(n)
            } else if (arr[i] > max) {                                  // -
                max = arr[i];                                           // O(n)
            }                                                           // -
        }                                                               // -
    }                                                                   // -

    public int getMax() {                                               // -
        return max;                                                     // O(1)
    }                                                                   // -

    public int getMin() {                                               // -
        return min;                                                     // O(1)
    }                                                                   // -

    public static void max_min
        (int[] arr, int indeks_awal, int indeks_akhir, minMax hasil) {  // -
        int indeks_tengah;                                              // -
        minMax hasil1 = new minMax();                                   // O(1)
        minMax hasil2 = new minMax();                                   // O(1)

        if (indeks_awal == indeks_akhir) {                              // -
            hasil.min = hasil.max = arr[indeks_awal];                   // O(1)
        } else if (indeks_akhir - indeks_awal == 1) {                   // -
            if (arr[indeks_awal] > arr[indeks_akhir]) {                 // -
                hasil.min = arr[indeks_akhir];                          // O(1)
                hasil.max = arr[indeks_awal];                           // O(1)
            } else {                                                    // -
                hasil.min = arr[indeks_awal];                           // O(1)
                hasil.max = arr[indeks_akhir];                          // O(1)
            }                                                           // -
        } else {                                                        // -
            indeks_tengah = (indeks_awal + indeks_akhir) / 2;           // O(1)
            max_min(arr, indeks_awal, indeks_tengah, hasil1);           // O(n)
            max_min(arr, indeks_tengah + 1, indeks_akhir, hasil2);      // O(n)

            hasil.min = (hasil1.min < hasil2.min)
                    ? hasil1.min : hasil2.min;                          // O(1)
            hasil.max = (hasil1.max > hasil2.max)
                    ? hasil1.max : hasil2.max;                          // O(1)
        }                                                               // -
    }                                                                   // -
}                                                                       // -
