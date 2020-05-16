package Tugas;
/**
 *
 * @author farid
 */
public class Faktorial {                            // -
    int nilai;                                      // -

    int faktorialBF(int n) {                        // -
        int fakto = 1;                              // O(1)
        int i = 1;                                  // O(1)
        while(i <= n){                              // O(n)
            fakto = fakto * i;                      // O(1)
            i++;                                    // O(1)
        }                                           // -
        return fakto;                               // O(1)
    }                                               // -

    int faktorialDC(int n) {                        // -
        if (n == 1) {                               // -
            return 1;                               // O(1)
        } else {                                    // -
            int fakto = n * faktorialDC(n - 1);     // O(n)
            return fakto;                           // O(1)
        }                                           // -
    }                                               // -
}                                                   // -
