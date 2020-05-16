package Tugas;

import java.util.Scanner;

/**
 *
 * @author FARLAN
 */
public class MainBinSearch {

    public static void main(String[] args) {
        BinSearch binary = new BinSearch();
        int data[] = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
        binary.sort(data);
        binary.tampil(data);
        int n = data.length;
        int result = binary.findMaximum(data, 0, n - 1);
        int tmp = binary.binarySearch(data, result, true);
        int tmp1 = binary.binarySearch(data, result, false);
        int result1 = tmp1 - tmp + 1;

        System.out.println("Nilai maks : " + result);
        System.out.println("Nilai maks sebanyak : " + result1);

        binary.bin(data, result);
        System.out.println("");
    }
}
