package Praktikum;

import java.util.Scanner;

/**
 *
 * @author FARLAN
 */
public class StackMain {

    public static void main(String[] args) {
        Scanner farlan = new Scanner(System.in);
        boolean again = true;

        System.out.print("Jumlah stack : ");
        int size = farlan.nextInt();

        Stack tumpukan = new Stack(size);
        do {
            System.out.println("1. Lihat stack");
            System.out.println("2. Masukkan stack");
            System.out.println("3. Lihat top of stack");
            System.out.println("4. Keluarkan top of stack");
            System.out.println("5. Exit");
            System.out.println("================================================");
            System.out.println("Masukkan pilihan menu(1/2/3/4/5): ");
            int menu = farlan.nextInt();

            switch (menu) {
                case 1:
                    tumpukan.print();
                    break;
                case 2:
                    boolean penuh = true;
                    for (int i = 0; i < size; i++) {
                        if (!tumpukan.IsFull()) {
                            penuh = false;
                            System.out.print("Masukkan data ke-" + (i + 1) + " : ");
                            int data = farlan.nextInt();
                            tumpukan.push(data);
                        }
                    }
                    if (penuh) {
                        System.out.println("Stack penuh");
                    }
                    break;
                case 3:
                    tumpukan.peek();
                    break;
                case 4:
                    tumpukan.pop();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Pilihan salah!");
            }
            System.out.println("--------------------------------------------");
        } while (again == true);
    }

}
