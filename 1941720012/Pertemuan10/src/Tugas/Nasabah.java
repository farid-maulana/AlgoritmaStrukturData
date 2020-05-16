package Tugas;

import java.util.Scanner;

/**
 *
 * @author FARLAN
 */
public class Nasabah {

    String noRekening;
    String nama;

    public Nasabah(String noRek, String nm) {
        this.noRekening = noRek;
        this.nama = nm;
    }

    public Nasabah() {
    }

    public void print() {
        System.out.println();
        System.out.println("No. Rekening: " + noRekening);
        System.out.println("Nama: " + nama);
        System.out.println("~~~~~~~~~~~~~~~~~~");
    }
}
