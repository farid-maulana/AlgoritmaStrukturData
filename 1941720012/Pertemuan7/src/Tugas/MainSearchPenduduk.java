package Tugas;

import java.util.Scanner;

/**
 *
 * @author FARLAN
 */
public class MainSearchPenduduk {

    public static void main(String[] args) {
        Scanner farlan = new Scanner(System.in);
        Scanner farid = new Scanner(System.in);

        System.out.print("Jumlah data : ");
        int jumlah = farlan.nextInt();

        SearchPenduduk search = new SearchPenduduk();
        SearchPenduduk data[] = new SearchPenduduk[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Penduduk ke-" + (i + 1));
            data[i] = new SearchPenduduk();
            System.out.print("NIK : ");
            data[i].nik = farlan.next();
            System.out.print("Nama : ");
            data[i].nama = farid.nextLine();
            System.out.print("Alamat : ");
            data[i].alamat = farid.nextLine();
            System.out.print("Jenis Kelamin : ");
            data[i].jenis_kelamin = farid.nextLine();
            System.out.println();
        }
        
        System.out.println("================================================");
        System.out.print("Masukkan NIK yang dicari : ");
        String cari = farlan.next();
        int posisi = search.searchData(data, cari);
        
        if(posisi != -1){
            System.out.println("NIK : " + data[posisi].nik);
            System.out.println("Nama : " + data[posisi].nama);
            System.out.println("Alamat : " + data[posisi].alamat);
            System.out.println("Jenis Kelamin : " + data[posisi].jenis_kelamin);
        } else {
            System.out.println("NIK " + cari + " tidak ditemukan.");
        }
    }
}
