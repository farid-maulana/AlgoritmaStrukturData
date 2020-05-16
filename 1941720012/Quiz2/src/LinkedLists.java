
/**
 *
 * @author FARLAN
 */
public class LinkedLists {

    Node head;
    int no, keluhan, waktu, size;
    String nama;

    public LinkedLists() {
        head = null;
        size = 0;
        no = 1;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(LinkedLists data) {
        if (isEmpty()) {
            head = new Node(data, head);
            size++;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(data, null);
            size++;
        }
    }

    public int cekWaktu(int kel) {
        switch (kel) {
            case 1:
                waktu = 7;
                break;
            case 2:
                waktu = 5;
                break;
            case 3:
                waktu = 8;
                break;
            case 4:
                waktu = 4;
                break;
            case 5:
                waktu = 3;
                break;
            case 6:
                waktu = 11;
                break;
            case 7:
                waktu = 13;
                break;
            case 8:
                waktu = 6;
                break;
            case 9:
                waktu = 5;
                break;
        }
        return waktu;
    }

    public String cekKeluhan(int kel) {
        String hasil = null;
        switch (kel) {
            case 1:
                hasil = "Demam";
                break;
            case 2:
                hasil = "Flu";
                break;
            case 3:
                hasil = "Sakit kepala";
                break;
            case 4:
                hasil = "Asma";
                break;
            case 5:
                hasil = "Diare";
                break;
            case 6:
                hasil = "Sakit Gigi";
                break;
            case 7:
                hasil = "Sakit Mata";
                break;
            case 8:
                hasil = "Keseleo";
                break;
            case 9:
                hasil = "Susah tidur";
                break;
        }
        return hasil;
    }

    public void dequeue() {
        head = head.next;
        size--;
    }

    public void cekAntrian() {
        int totalwaktu = 0;
        Node tmp = head;
        while (tmp != null) {
            totalwaktu = totalwaktu + tmp.data.waktu;
            tmp = tmp.next;
        }
        System.out.println("Total Antrian = " + size);
        System.out.println("Total waktu tunggu = " + totalwaktu);
    }

    public void cekAntrianByNo(int no) throws Exception {
        Node tmp = head;
        if (isEmpty() || no > size) {
            throw new Exception("Nilai antrian di luar batas");
        }
        int totalwaktu = 0;
        boolean found = false;
        int i = 0;
        while (tmp != null) {
            if (no == tmp.data.no) {
                found = true;
                break;
            }
            i++;
            tmp = tmp.next;
        }
        if (found) {
            for (int j = 0; j < i; j++) {
                totalwaktu = totalwaktu + tmp.data.waktu;
                tmp = tmp.next;
            }
            System.out.println("Jumlah antrian : " + i);
            System.out.println("Jumlah waktu tunggu  : " + totalwaktu + " menit");
        }
    }

    public void cekPasienByNo(int no) throws Exception {
        if (isEmpty() || no > size) {
            throw new Exception("Nilai antrian di luar batas");
        }
        Node tmp = head;
        boolean found = false;
        int i = 0;
        while (tmp != null) {
            if (no == tmp.data.no) {
                found = true;
                break;
            }
            i++;
            tmp = tmp.next;
        }
        if (found) {
            System.out.println("No. Antrian : " + tmp.data.no);
            System.out.println("Nama : " + tmp.data.nama);
            String namaKeluhan = cekKeluhan(tmp.data.keluhan);
            System.out.println("Keluhan : " + namaKeluhan);
            System.out.println("Waktu : " + tmp.data.waktu + " menit");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        } else {
            System.out.println("Nomor sudah tidak berada dalam antrian");
        }
    }

    public void rataWaktu() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian masih kosong");
        }
        Node tmp = head;
        int totalwaktu = 0;
        while (tmp != null) {
            totalwaktu = totalwaktu + tmp.data.waktu;
            tmp = tmp.next;
        }
        double rata2 = (totalwaktu / size);
        System.out.println("Rata-rata waktu penanganan : " + rata2 + " menit");
    }

    public void statistikKeluhan() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian masih kosong");
        }
        Node tmp = head;
        int count[] = new int[9];
        while (tmp != null) {
            if (tmp.data.keluhan == 1) {
                count[0] += 1;
            } else if (tmp.data.keluhan == 2) {
                count[1] += 1;
            } else if (tmp.data.keluhan == 3) {
                count[2] += 1;
            } else if (tmp.data.keluhan == 4) {
                count[3] += 1;
            } else if (tmp.data.keluhan == 5) {
                count[4] += 1;
            } else if (tmp.data.keluhan == 6) {
                count[5] += 1;
            } else if (tmp.data.keluhan == 7) {
                count[6] += 1;
            } else if (tmp.data.keluhan == 8) {
                count[7] += 1;
            } else {
                count[8] += 1;
            }
            tmp = tmp.next;
        }
        System.out.println("Statistik Keluhan");
        for (int i = 0; i < count.length; i++) {
            System.out.println(cekKeluhan(i + 1) + " : " + count[i] + " pasien");
        }
        System.out.println();
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("No. Antrian : " + tmp.data.no);
                System.out.println("Nama : " + tmp.data.nama);
                String namaKeluhan = cekKeluhan(tmp.data.keluhan);
                System.out.println("Keluhan : " + namaKeluhan);
                System.out.println("Waktu : " + tmp.data.waktu + " menit");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedLists kosong");
        }
    }
}
