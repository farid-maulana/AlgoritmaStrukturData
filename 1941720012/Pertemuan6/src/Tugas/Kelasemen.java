package Tugas;

/**
 *
 * @author FARLAN
 */
public class Kelasemen {

    String club;
    int main, selisihGol, point;

    Kelasemen() {
    }

    public Kelasemen(String club, int main, int selisihGol, int point) {
        this.club = club;
        this.main = main;
        this.selisihGol = selisihGol;
        this.point = point;
    }

    void tampil() {
        String namaClub;
        if (club.length() > 14) {
            namaClub = club.substring(0, 14);
        } else {
            namaClub = club;
        }
        System.out.println("|" + namaClub + "\t | " + main + " \t| " + selisihGol + " \t| " + point + " \t|");
    }

    void insertionSort(Kelasemen[] arr, boolean asc) {
        int i, j;
        int length = arr.length;
        Kelasemen tempClub, tempMain, tempSelisih, tempPoint;
        for (i = 1; i < length; i++) {
            tempClub = arr[i];
            tempMain = arr[i];
            tempSelisih = arr[i];
            tempPoint = arr[i];
            j = i;
            if (asc) {
                while ((j > 0) && (arr[j - 1].point) > tempPoint.point) {
                    arr[j] = arr[j - 1];
                    j--;
                }
            } else {
                while ((j > 0) && (arr[j - 1].point) < tempPoint.point) {
                    arr[j] = arr[j - 1];
                    j--;
                }
            }
            arr[j] = tempClub;
            arr[j] = tempMain;
            arr[j] = tempSelisih;
            arr[j] = tempPoint;
        }
    }
}
