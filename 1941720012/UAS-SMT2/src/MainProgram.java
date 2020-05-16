
import java.util.Scanner;

/**
 *
 * @author FARLAN
 */
public class MainProgram {

    public static void header() {
        System.out.println("***** UAS - Praktikum ASD *****");
        System.out.println("~~~ Program Persewaan CD ~~~");
        System.out.println();
        System.out.println("Nama : Mochamad Farid Maulana");
        System.out.println("NIM  : 1941720012");
        System.out.println();
    }

    public static void menu() {
        System.out.println("Pilih menu");
        System.out.println("1. CD Masuk");
        System.out.println("2. CD Keluar");
        System.out.println("3. CD Rusak");
        System.out.println("4. Tampilkan Semua Data");
        System.out.println("5. Cari CD");
        System.out.println("6. Exit");
        System.out.println("---------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner farlan = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();
        header();
        int pilih, index, jumlah;
        String kode;
        do {
            CD_Farlan data = new CD_Farlan();
            menu();
            System.out.print(">> ");
            pilih = farlan.nextInt();
            System.out.println("---------------------------------------------\n");
            switch (pilih) {
                case 1:
                    System.out.print("Kode : ");
                    data.kode = farlan.next();
                    System.out.print("Judul : ");
                    farlan.nextLine();
                    data.judul = farlan.nextLine();
                    System.out.print("Genre : ");
                    data.genre = farlan.nextLine();
                    System.out.print("Distributor : ");
                    data.distributor = farlan.nextLine();
                    System.out.print("Jumlah stok : ");
                    data.stok = farlan.nextInt();
                    System.out.print("Jumlah rusak : ");
                    data.jumlah_rusak = farlan.nextInt();

                    dll.insert_CD(data);
                    break;
                case 2:
                    System.out.print("Masukkan index CD keluar: ");
                    index = farlan.nextInt();
                    System.out.print("Masukkan jumlah CD keluar: ");
                    jumlah = farlan.nextInt();

                    try {
                        dll.out_CD(index, jumlah);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Masukkan index CD rusak: ");
                    index = farlan.nextInt();
                    System.out.print("Masukkan jumlah CD rusak: ");
                    jumlah = farlan.nextInt();

                    try {
                        dll.broken_CD(index, jumlah);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    dll.print();
                    break;
                case 5:
                    System.out.println("Pilih submenu");
                    System.out.println("1. Berdasarkan kode");
                    System.out.println("2. Berdasarkan judul");
                    System.out.println("---------------------------------------------");
                    pilih = farlan.nextInt();
                    switch (pilih) {
                        case 1:
                            System.out.print("Masukkan kode CD yang ingin dicari: ");
                            kode = farlan.next();

                            try {
                                dll.searchKode(kode);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 2:
                            System.out.print("Masukkan judul CD yang ingin dicari: ");
                            kode = farlan.next();

                            try {
                                dll.searchJudul(kode);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                    }

                    break;
                case 6:
                    System.exit(0);
            }
            System.out.println();
        } while (pilih >= 1 && pilih <= 6);
    }
}
