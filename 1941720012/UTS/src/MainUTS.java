
import java.util.Scanner;

/**
 *
 * @author FARLAN
 */
public class MainUTS {

    public static void main(String[] args) {
        Scanner farlan = new Scanner(System.in);
        System.out.println("*** UTS - Praktikum ASD ***");
        System.out.println("~~~ Program Pencarian Data ~~~");
        System.out.println();
        System.out.print("Nama : ");
        String nama = farlan.nextLine();
        System.out.print("NIM  : ");
        String nim = farlan.next();
        System.out.println();
        char[] data = nama.replaceAll(" ", "").toCharArray();
        UTS uts = new UTS(data, data.length);
        uts.printArray(data);
        System.out.println();
        System.out.println("Pilihan Metode Pencarian:");
        System.out.println("1. Sequential Search");
        System.out.println("2. Binary Search");
        System.out.println();
        System.out.println();
        System.out.print("Pilih Metode Nomor : ");
        int metode = farlan.nextInt();
        System.out.print("Data yang dicari   : ");
        char cari = farlan.next().charAt(0);
        System.out.println();
        switch (metode) {
            case 1:
                System.out.println("Hasil Pencarian dengan Sequential Search:");
                uts.sequentialSearch(cari);
                break;
            case 2:
                System.out.println("Hasil Pengurutan dengan Merge Sort:");
                uts.sort(data, 0, data.length - 1);
                uts.printArray(data);
                System.out.println("Hasil Pencarian dengan Binary Search:");
                int tmp = uts.binarySearch(data, cari, 0, data.length - 1, true);
                int tmp1 = uts.binarySearch(data, cari, 0, data.length - 1, false);
                int result1 = tmp1 - tmp + 1;
                uts.bin(data, cari);
                System.out.println("");
                break;
            default:
                System.out.println("Metode yang dipilih salah!");
                break;
        }

    }
}
