package Tugas;

import java.util.Scanner;
/**
 *
 * @author FARLAN
 */
public class NasabahMain {
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek Rear");
        System.out.println("6. Peek Position");
        System.out.println("7. Peek Nasabah");
        System.out.println("-----------------");
    }
    
    public static void main(String[] args) {
        Scanner farlan = new Scanner(System.in);
        Scanner farid = new Scanner(System.in);
        System.out.print("Masukkan jumlah maksimal antrian: ");
        int max = farlan.nextInt();
        
        Queue Q = new Queue(max);
        int pilih;
        do {
            menu();
            pilih = farlan.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan no rekening:");
                    String noRek = farlan.next();
                    Q.enqueue(noRek);
                    System.out.println();
                    break;
                case 2:
                    int dataKeluar = Q.dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        System.out.println();
                        break;
                    }
                case 3:
                    Q.print();
                    System.out.println();
                    break;
                case 4:
                    Q.peek();
                    System.out.println();
                    break;
                case 5:
                    Q.peekRear();
                    System.out.println();
                    break;
                case 6:
                    System.out.print("Masukkan no. rekening yang dicari : ");
                    String data = farid.nextLine();
                    Q.peekPosition(data);
                    System.out.println();
                    break;
                case 7:
                    System.out.print("Masukkan no antrian : ");
                    int noAntrian = farlan.nextInt();
                    Q.printNasabah(noAntrian);
                    System.out.println();
                    break;
            }
        } while (pilih >= 1 && pilih <= 7);
    }
}
