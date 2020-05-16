package Praktikum;

/**
 *
 * @author FARLAN
 */
import java.util.Scanner;

public class MainMahasiswa {

    public static void main(String[] args) {
        Scanner farlan = new Scanner(System.in);
        Scanner farid = new Scanner(System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jumMhs = 5;
        
        for(int i = 0; i<jumMhs;i++){
            System.out.print("Nama = ");
            String nama = farid.nextLine();
            System.out.print("Thn masuk = ");
            int thn = farlan.nextInt();
            System.out.print("Umur = ");
            int umur = farlan.nextInt();
            System.out.print("IPK = ");
            double ipk = farlan.nextDouble();
            
            Mahasiswa m = new Mahasiswa(nama, thn, umur, ipk);
            data.tambah(m);
        }
        
        System.out.println("Data mahasiswa, sebelum sorting = ");
        data.tampil();
        
        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk = ");
        data.bubbleSort();
        data.tampil();
        
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk = ");
        data.selectionSort();
        data.tampil();
        
        System.out.println("Data setelah di insertion sort asc = ");
        data.insertionSort(true);
        data.tampil();
        
        System.out.println("Data setelah di insertion sort desc = ");
        data.insertionSort(false);
        data.tampil();
    }
}
