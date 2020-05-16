
/**
 *
 * @author FARLAN
 */
public class Nomor1 {                                                   // -

    String nama;                                                        // -

    static void countChar(String nama) {                                // -
        char[] huruf = new char[nama.length()];                         // O(1)
        int[] jmlHuruf = new int[nama.length()];                        // O(1)

        huruf[0] = nama.charAt(0);                                      // O(1)
        jmlHuruf[0] = 1;                                                // O(1)
        int jmlBeda = 1;                                                // O(1)

        for (int i = 1; i < nama.length(); i++) {                       // O(n)
            boolean sama = false;                                       // O(1)
            if (nama.charAt(i) != ' ') {                                // -
                for (int j = 0; j < jmlBeda; j++) {                     // O(n)
                    if (nama.charAt(i) == huruf[j]) {                   // -
                        sama = true;                                    // O(1)
                        jmlHuruf[j] += 1;                               // O(1)
                    }                                                   // -
                }                                                       // -
                if (!sama) {                                            // -
                    huruf[jmlBeda] = nama.charAt(i);                    // O(1)
                    jmlHuruf[jmlBeda] = 1;                              // O(1)
                    jmlBeda++;                                          // O(1)
                }                                                       // -
            }                                                           // -
        }                                                               // -
        System.out.println("======================================");   // O(1)
        for (int i = 0; i < jmlBeda; i++) {                             // O(n)
            System.out.println("Huruf " + huruf[i] + " : "              
                    + jmlHuruf[i]);                                     // O(1)
        }                                                               // -
    }                                                                   // -
}                                                                       // -
