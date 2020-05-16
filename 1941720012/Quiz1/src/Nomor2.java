
/**
 *
 * @author FARLAN
 */
public class Nomor2 {                                           // -

    char big, small, big1, small1;                              // -

    public void compareCharBF(String nama) {                    // -
        big = nama.charAt(0);                                   // O(1)
        small = nama.charAt(0);                                 // O(1)

        for (int i = 0; i < nama.length(); i++) {               // O(n)
            if (nama.charAt(i) != ' ') {                        // 
                if (nama.charAt(i) < small) {                   //
                    small = nama.charAt(i);                     // O(1)
                } else if (nama.charAt(i) > big) {              //
                    big = nama.charAt(i);                       // O(1)
                }                                               // -
            }                                                   // -
        }                                                       // -
    }                                                           // -

    public void compareCharDC
        (String nama, int indeks_awal, int indeks_akhir) {      // -
        int tengah;                                             // -
        char big2, small2;                                      // -

        if (indeks_awal == indeks_akhir) {                      //
            big1 = nama.charAt(indeks_awal);                    // O(1)
            small1 = nama.charAt(indeks_akhir);                 // O(1)
        } else {                                                //
            tengah = (indeks_awal + indeks_akhir) / 2;          // O(1)
            compareCharDC(nama, indeks_awal, tengah);           //
            big2 = big1;                                        // O(1)
            small2 = small1;                                    // O(1)
            compareCharDC(nama, tengah + 1, indeks_akhir);      //
            if (big2 != ' ' && small2 != ' ') {                 //
                if (big1 < big2) {                              //
                    big1 = big2;                                // O(1)
                } else if (small1 > small2) {                   //
                    small1 = small2;                            // O(1)
                }                                               // -
            }                                                   // -
        }                                                       // -
    }                                                           // -

    public char getBig() {                                      // -
        return big1;                                            // O(1)
    }                                                           // -

    public char getSmall() {                                    // -
        return small1;                                          // O(1)
    }                                                           // -
}                                                               // -
