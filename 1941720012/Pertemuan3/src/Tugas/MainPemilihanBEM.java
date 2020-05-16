package Tugas;

/**
 *
 * @author FARLAN
 */
import java.util.Scanner;

public class MainPemilihanBEM {

    public static void main(String[] args) {
        Scanner farlan = new Scanner(System.in);
        Scanner farid = new Scanner(System.in);

//        System.out.print("Masukkan jumlah kandidat : ");
//        int kandidat = farlan.nextInt();
//        System.out.println();
//
//        PemilihanBEM namaKandidat[] = new PemilihanBEM[kandidat];
//        for (int i = 0; i < kandidat; i++) {
//            namaKandidat[i] = new PemilihanBEM();
//            System.out.print("Masukkan nama kandidat ke-" + (i + 1) + " : ");
//            namaKandidat[i].namaKandidat = farid.nextLine();
//        }

        System.out.println("=================================================");
        System.out.print("Masukkan jumlah suara : ");
        int jumlahSuara = farlan.nextInt();
        System.out.println();
        
        PemilihanBEM pilih = new PemilihanBEM(jumlahSuara);

        for (int i = 0; i < jumlahSuara; i++) {
            System.out.print("Masukkan suara ke-" + (i + 1) + " : ");
            pilih.suara[i] = farid.nextLine();
        }
        pilih.hitungSuara(pilih.suara, 0, pilih.jumlahSuara - 1);
        System.out.println("Hasil Perhitungan Suara : " + pilih.getMenang());
        
    }
}
