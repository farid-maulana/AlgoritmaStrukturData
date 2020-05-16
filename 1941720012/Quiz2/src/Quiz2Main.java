
import java.util.Scanner;

/**
 *
 * @author FARLAN
 */
public class Quiz2Main {

    public static void header() {
        System.out.println("************ QUIZ 2 - Praktikum ASD ************");
        System.out.println("~~~ Program Antrian Pasien Klinik Dr. Watson ~~~");
        System.out.println();
        System.out.println("Nama : Mochamad Farid Maulana");
        System.out.println("NIM  : 1941720012");
        System.out.println();
    }

    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Cek Antrian");
        System.out.println("4. Cek Antrian By Nomor");
        System.out.println("5. Cek Pasien By Nomor");
        System.out.println("6. Rata-rata Waktu Penanganan");
        System.out.println("7. Statistik Keluhan");
        System.out.println("8. Keluar");
        System.out.println("------------------------------");
    }

    public static void keluhan() {
        System.out.println("+----+------------------+-------------------------+");
        System.out.println("| No | Keluhan \t\t| Waktu Penanganan(menit) |");
        System.out.println("+----+------------------+-------------------------+");
        System.out.println("|  1 | Demam \t\t| 7 \t\t\t  |");
        System.out.println("|  2 | Flu \t\t| 5 \t\t\t  |");
        System.out.println("|  3 | Sakit Kepala \t| 8 \t\t\t  |");
        System.out.println("|  4 | Asma \t\t| 4 \t\t\t  |");
        System.out.println("|  5 | Diare \t\t| 3 \t\t\t  |");
        System.out.println("|  6 | Sakit Gigi \t| 11 \t\t\t  |");
        System.out.println("|  7 | Sakit Mata \t| 13 \t\t\t  |");
        System.out.println("|  8 | Keseleo \t\t| 6 \t\t\t  |");
        System.out.println("|  9 | Susah tidur \t| 5 \t\t\t  |");
        System.out.println("+----+------------------+-------------------------+");
    }

    public static void main(String[] args) {
        Scanner farlan = new Scanner(System.in);
        LinkedLists data = new LinkedLists();
        header();
        int pilih, no;
        do {
            menu();
            pilih = farlan.nextInt();
            farlan.nextLine();
            LinkedLists dataBaru = new LinkedLists();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama : ");
                    dataBaru.nama = farlan.nextLine();
                    keluhan();
                    System.out.print("Masukkan nomor keluhan : ");
                    dataBaru.keluhan = farlan.nextInt();
                    dataBaru.waktu = dataBaru.cekWaktu(dataBaru.keluhan);
                    dataBaru.no = data.no++;
                    System.out.println();
                    data.enqueue(dataBaru);
                    data.print();
                    break;
                case 2:
                    data.dequeue();
                    data.print();
                    break;
                case 3:
                    data.cekAntrian();
                    break;
                case 4:
                    System.out.print("Masukkan nomor antrian : ");
                    no = farlan.nextInt();
                    try {
                        data.cekAntrianByNo(no);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("Masukkan nomor antrian : ");
                    no = farlan.nextInt();
                    try {
                        data.cekPasienByNo(no);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        data.rataWaktu();
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    try {
                        data.statistikKeluhan();
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 8:
                    System.exit(0);
            }
        } while (pilih >= 1 && pilih <= 8);
    }
}
