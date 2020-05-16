package Praktikum;

import java.util.Scanner;
/**
 *
 * @author FARLAN
 */
public class PostfixMain {
    public static void main(String[] args) {
        Scanner farlan = new Scanner(System.in);
        
        String P,Q;
        System.out.println("Masukkan ekspresi matematika : ");
        Q = farlan.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        
        int total = Q.length();
        
        Postfix post = new Postfix(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
    }
}
