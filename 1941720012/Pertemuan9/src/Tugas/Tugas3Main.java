/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author FARLAN
 */
public class Tugas3Main {

    public static void main(String[] args) {
        Scanner aula = new Scanner(System.in);
        String P, Q, R = "";
        System.out.println("Masukkan ekspresi matematika : ");
        Q = aula.nextLine();
        Q = Q.trim();
        String reverse = "";
        for (int i = Q.length() - 1; i >= 0; i--) {
            if (Q.charAt(i) == '(') {
                reverse = reverse + ")";
            } else if (Q.charAt(i) == ')') {
                reverse = reverse + "(";
            } else {
                reverse = reverse + Q.charAt(i);
            }

        }
        System.out.println("reverse : " + reverse);
        reverse = reverse + ")";

        int total = reverse.length();
        Tugas3 post = new Tugas3(total);

        P = post.konversi(reverse);
        System.out.println("konversi : " + P);

        for (int i = P.length() - 1; i >= 0; i--) {
            R = R + P.charAt(i);
        }

        System.out.println("Prefix : " + R);
    }
}
