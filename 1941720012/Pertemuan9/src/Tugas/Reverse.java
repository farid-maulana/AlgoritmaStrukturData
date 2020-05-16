package Tugas;

/**
 *
 * @author FARLAN
 */
public class Reverse {

    int size, top;
    String kata[], data[];

    public Reverse() {
    }

    public Reverse(int size) {
        this.size = size;
        top = -1;
        data = new String[size];
    }

    public int countSpasi(String kalimat) {
        int karakter = kalimat.length();
        int spasi = 0;
        for (int i = 0; i < karakter; i++) {
            if (kalimat.charAt(i) == ' ') {
                spasi++;
            }
        }
        return spasi;
    }

    public void split(String kalimat, int count) {
        kata = kalimat.split("\\s+", count);
        for (int i = 0; i < count; i++) {
            push(kata[i]);
        }
    }

    private void push(String dt) {
        top++;
        data[top] = dt;
    }

    public void pop(int count) {
        for (int i = 0; i < count; i++) {
            String x = data[top];
            top--;
            System.out.print(x + " ");
        }
    }
}
