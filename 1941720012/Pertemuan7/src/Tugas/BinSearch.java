/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author FARLAN
 */
public class BinSearch {

    int[] sort(int arr[]) {
        int temp, pjg = arr.length;
        for (int i = 1; i < pjg; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

    void tampil(int arr[]) {
        int pjg = arr.length;
        for (int i = 0; i < pjg; i++) {
            System.out.println("" + arr[i]);
        }
    }

    int findMaximum(int arr[], int low, int high) {
        if (low == high) {
            return arr[low];
        }
        if ((high == low + 1) && arr[low] >= arr[high]) {
            return arr[low];
        }
        if ((high == low + 1) && arr[low] < arr[high]) {
            return arr[high];
        }

        int mid = (low + high) / 2;
        if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
            return arr[mid];
        }
        if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1]) {
            return findMaximum(arr, low, mid - 1);
        } else {
            return findMaximum(arr, mid + 1, high);
        }
    }

    int binarySearch(int[] A, int x, boolean searchFirst) {
        int left = 0;
        int right = A.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (x == A[mid]) {
                result = mid;
                if (searchFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (x < A[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    void bin(int[] numbers, int target) {
        if (numbers == null) {
            return;
        }

        int low = 0, high = numbers.length - 1;
        int startIndex = -1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (numbers[mid] > target) {
                high = mid - 1;
            } else if (numbers[mid] == target) {
                startIndex = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        int endIndex = -1;
        low = 0;
        high = numbers.length - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (numbers[mid] > target) {
                high = mid - 1;
            } else if (numbers[mid] == target) {
                endIndex = mid;
                low = mid + 1;
            } else {
                low = mid + 1;
            }
        }

        if (startIndex != -1 && endIndex != -1) {
            System.out.print("Terdapat di index: ");
            for (int i = 0; i + startIndex <= endIndex; i++) {
                if (i > 0) {
                    System.out.print(',');
                }
                System.out.print(i + startIndex);
            }
        }
    }
}
