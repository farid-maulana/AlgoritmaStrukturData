package Tugas;

import java.util.Scanner;

/**
 *
 * @author FARLAN
 */
public class PrefixMain {

    public static void main(String[] args) {
        Scanner farlan = new Scanner(System.in);
        System.out.print("Inputkan Notasi Infix: ");
        String infix = farlan.nextLine();
        infix = infix.trim();

        int total = infix.length();
        Prefix pre = new Prefix(total+1);
        String reverse = pre.reverseInfix(infix);
        reverse = reverse + ")";
        System.out.println("infix : "+infix);
        System.out.println("reverse infix : "+reverse);
        String postfix = pre.konversi(reverse);
        System.out.println("Prefix : " + pre.reversePostfix(postfix));
    }
}
