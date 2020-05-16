package Tugas;

/**
 *
 * @author FARLAN
 */

import java.util.Scanner;

public class MainTugas4 {
    public static void main(String[] args) {
        Scanner farlan = new Scanner(System.in);
        Scanner farid = new Scanner(System.in);
        
        int jmlKandidat, jmlSuara;
//        int menang, mng, hasilSuara[];
//        String namaKandidat[], suara[];
        
        System.out.print("Masukkan jumlah kandidat : ");
        jmlKandidat = farlan.nextInt();
        System.out.println();
        
        System.out.print("Masukkan jumlah suara : ");
        jmlSuara = farlan.nextInt();
        System.out.println();
        
        Tugas4 tgs4 = new Tugas4(jmlKandidat, jmlSuara);
        
//        namaKandidat = new String[jmlKandidat];
//        hasilSuara = new int[jmlKandidat];
        for(int i = 0; i < tgs4.jmlKandidat; i++){
            System.out.print("Masukkan nama kandidat ke-"+(i+1)+" : ");
            tgs4.namaKandidat[i] = farid.nextLine();
        }
        System.out.println("------------------------------------------------");
        
//        suara = new String[jmlSuara];
        for(int i = 0; i < tgs4.jmlSuara; i++){
            System.out.print("Masukkan suara ke-"+(i+1)+" : ");
            tgs4.suara[i] = farid.nextLine();
        }
        
        System.out.println("================================================");
        System.out.println("Hasil Akhir Pemilihan : " + tgs4.hitungSuara(tgs4.suara, 0, tgs4.jmlSuara-1, tgs4.namaKandidat[0]));
        
    }
}
