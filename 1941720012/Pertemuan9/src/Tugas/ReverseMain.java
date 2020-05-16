package Tugas;

import java.util.Scanner;

/**
 *
 * @author FARLAN
 */
public class ReverseMain {

    public static void main(String[] args) {
        Scanner farlan = new Scanner(System.in);

        Reverse data = new Reverse();
        System.out.print("Masukkan kalimat : ");
        String kalimat = farlan.nextLine();

        int spasi = data.countSpasi(kalimat);
        Reverse dt = new Reverse(spasi+1);
        dt.split(kalimat, spasi + 1);
        System.out.print("Kalimat dibalik : ");
        dt.pop(spasi + 1);
        System.out.println();
    }
}
