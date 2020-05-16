package Tugas;

/**
 *
 * @author FARLAN
 */
public class SeqSearch {

    public int data[][];
    public int jmlBaris, jmlKolom;

    public SeqSearch(int[][] Data, int jmlBaris, int jmlKolom) {
        this.jmlBaris = jmlBaris;
        this.jmlKolom = jmlKolom;
        data = new int[jmlBaris][jmlKolom];
        for (int i = 0; i < jmlBaris; i++) {
            for (int j = 0; j < jmlKolom; j++) {
                data[i][j] = Data[i][j];
            }
        }
    }

    public void tampilData() {
        for (int i = 0; i < jmlBaris; i++) {
            for (int j = 0; j < jmlKolom; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void sequentialSearch(int cari) {
        boolean found = false;
        for (int i = 0; i < jmlBaris; i++) {
            for (int j = 0; j < jmlKolom; j++) {
                if (data[i][j] == cari) {
                    System.out.println("data " + cari + " ditemukan pada baris ke-" + (i + 1) + " dan kolom ke-" + (j + 1));
                    found = true;
                    break;
                }
            }
        }
        if(!found)
            System.out.println("data "+cari+" tidak ditemukan");
    }

}
