package Tugas;

import java.util.Scanner;

/**
 *
 * @author FARLAN
 */
public class MainSeqSearch {

    public static void main(String[] args) {
        Scanner farlan = new Scanner(System.in);

        int data[][] = {
            {45, 78, 7, 200, 80},
            {90, 1, 17, 100, 50},
            {21, 2, 40, 18, 65}
        };
        
        int baris = data.length;
        int kolom = data[0].length;
        
        SeqSearch sequential = new SeqSearch(data, baris, kolom);
        
        System.out.println("Data : ");
        sequential.tampilData();
        
        System.out.print("Masukkan data yang dicari : ");
        int cari = farlan.nextInt();
        
        sequential.sequentialSearch(cari);
    }
}
