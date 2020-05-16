package Praktikum;

import java.util.Scanner;
/**
 *
 * @author FARLAN
 */
public class SearchingMain {

    public static void main(String[] args) {
        Scanner farlan = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah data : ");
        int jumlah = farlan.nextInt();
        
        int data[] = new int[jumlah];
        
        for(int i = 0; i < jumlah; i++){
            System.out.print("Masukkan data ke-"+(i+1)+" : ");
            data[i] = farlan.nextInt();
        }

        Searching pencarian = new Searching(data, jumlah);

        System.out.println("isi Array :");
        pencarian.TampilData();

        System.out.print("Masukkan data yang ingin dicari : ");
        int cari = farlan.nextInt();
        
        System.out.println("menggunakan sequential Search");
        int posisi = pencarian.FindSeqSearch(cari);
        pencarian.Tampilposisi(cari, posisi);
        
        System.out.println("=======================");
        System.out.println("sorting menggunkanan merge sort");
//        pencarian.sort(data, 0, data.length - 1);;
        pencarian.TampilData();
        
        System.out.println("=======================");
        System.out.println("menggunakan binary Search");
        posisi = pencarian.FindBinarySearch(cari, 0, data.length - 1);
        pencarian.Tampilposisi(cari, posisi);
    }
}
