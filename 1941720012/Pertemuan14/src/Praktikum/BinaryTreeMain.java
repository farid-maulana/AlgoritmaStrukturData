package Praktikum;

import java.util.Scanner;

/**
 *
 * @author FARLAN
 */
public class BinaryTreeMain {

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Find");
        System.out.println("4. Traverse inOrder");
        System.out.println("5. Traverse preOrder");
        System.out.println("6. Traverse postOrder");
        System.out.println("7. Keluar");
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        Scanner farlan = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();

        //Modifikasi
        int pilih, data;
        do {
            menu();
            pilih = farlan.nextInt();
            System.out.println("-----------------------------------");
            System.out.println();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data: ");
                    data = farlan.nextInt();
                    bt.add(data);
                break;
                case 2:
                    System.out.print("Masukkan data yang ingin dihapus: ");
                    data = farlan.nextInt();
                    bt.delete(data);
                break;
                case 3:
                    System.out.print("Masukkan data yang ingin dicari: ");
                    data = farlan.nextInt();
                    System.out.println("Find " + bt.find(data));
                break;
                case 4:
                    bt.traverseInOrder(bt.root);
                    System.out.println();
                break;
                case 5:
                    bt.traversePreOrder(bt.root);
                    System.out.println();
                break;
                case 6:
                    bt.traversePostOrder(bt.root);
                    System.out.println();
                break;
                case 7:
                    System.exit(0);
                break;
            }
        } while (pilih >= 1 && pilih <= 7);

        //Natural
//        bt.add(6);
//        bt.add(4);
//        bt.add(8);
//        bt.add(3);
//        bt.add(5);
//        bt.add(7);
//        bt.add(9);
//        bt.insert(bt.root, 1);
//        bt.add(10);
//        bt.insert(bt.root, 15);
//
//        bt.traversePreOrder(bt.root);
//        System.out.println("");
//        bt.traverseInOrder(bt.root);
//        System.out.println("");
//        bt.traversePostOrder(bt.root);
//        System.out.println("");
//        System.out.println("Find " + bt.find(5));
//        System.out.println("Min " + bt.minValue());
//        System.out.println("Max " + bt.maxValue());
//        bt.delete(8);
//        bt.traversePreOrder(bt.root);
//        System.out.println("");
//        bt.printLeafNodes(bt.root);
//        System.out.println("");
//        System.out.println("Jumlah Leaf " + bt.getLeafCount(bt.root));
    }
}
