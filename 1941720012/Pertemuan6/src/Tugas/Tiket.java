package Tugas;

/**
 *
 * @author FARLAN
 */
public class Tiket {

    String maskapai;
    float harga;
    int tiketTersedia, tiketTerjual;

    public Tiket() {
    }

    public Tiket(String maskapai, float harga, int tiketTersedia, int tiketTerjual) {
        this.maskapai = maskapai;
        this.harga = harga;
        this.tiketTersedia = tiketTersedia;
        this.tiketTerjual = tiketTerjual;
    }

    void tampil() {
        System.out.println("|" + maskapai + " \t |Rp " + harga + " \t |" + tiketTersedia + "\t\t|" + tiketTerjual + "\t\t|");
    }

    void bubbleSort(Tiket[] arr) {
        int length = arr.length;
        String tempMaskapai;
        float tempHarga;
        int tempTersedia, tempTerjual;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 1; j < length - i; j++) {
                if (arr[j].harga < arr[j - 1].harga) {
                    tempMaskapai = arr[j].maskapai;
                    tempHarga = arr[j].harga;
                    tempTersedia = arr[j].tiketTersedia;
                    tempTerjual = arr[j].tiketTerjual;
                    arr[j].maskapai = arr[j - 1].maskapai;
                    arr[j].harga = arr[j - 1].harga;
                    arr[j].tiketTersedia = arr[j - 1].tiketTersedia;
                    arr[j].tiketTerjual = arr[j - 1].tiketTerjual;
                    arr[j - 1].maskapai = tempMaskapai;
                    arr[j - 1].harga = tempHarga;
                    arr[j - 1].tiketTersedia = tempTersedia;
                    arr[j - 1].tiketTerjual = tempTerjual;
                }
            }
        }
    }

    void selectionSort(Tiket[] arr) {
        int length = arr.length;
        Tiket tempHarga, tempMaskapai, tempTersedia, tempTerjual;
        for (int i = 0; i < length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j].harga < arr[idxMin].harga) {
                    idxMin = j;
                }
            }
            tempMaskapai = arr[idxMin];
            tempHarga = arr[idxMin];
            tempTersedia = arr[idxMin];
            tempTerjual = arr[idxMin];
            arr[idxMin] = arr[i];
            arr[i] = tempMaskapai;
            arr[i] = tempHarga;
            arr[i] = tempTersedia;
            arr[i] = tempTerjual;
        }
    }
}
