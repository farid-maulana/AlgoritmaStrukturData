package Tugas;

/**
 *
 * @author FARLAN
 */
public class Fibonacci {                                                // -

    public void fiboBF(int n) {                                         // -
        int a, b, hasil;                                                // -
        a = 2;                                                          // O(1)
        b = 3;                                                          // O(1)
        hasil = 0;                                                      // O(1)
        for (int i = 2; i < 5; i++) {                                   // O(n)
            hasil = a + b;                                              // O(1)
            System.out.println(a + " " + b + " " + hasil);              // O(1)
            a = b;                                                      // O(1)
            b = hasil;                                                  // O(1)
        }                                                               // -
    }                                                                   // -

    public int fiboDC(int n) {                                          // -
        if (n == 0) {                                                   // -
            return 0;                                                   // O(1)
        }                                                               // -
        if (n == 1) {                                                   // -
            return 1;                                                   // O(1)
        }                                                               // -
        return fiboDC(n - 1) + fiboDC(n - 2);                           // O(n)
    }                                                                   // -
}                                                                       // -

class MainFibo {

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();

        fib.fiboBF(10);
        fib.fiboDC(10);
    }
}
