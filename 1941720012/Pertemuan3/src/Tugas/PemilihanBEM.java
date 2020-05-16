package Tugas;

/**
 *
 * @author FARLAN
 */
public class PemilihanBEM {

    String namaKandidat, suara[], menang;
    int jumlahSuara;

    PemilihanBEM(int jmlSuara) {
        this.jumlahSuara = jmlSuara;
        this.suara = new String[jmlSuara];
    }

    void hitungSuara(String suara[], int left, int right) {
        String menang1;
        int a = 0;
        int b = 0;
        int c = 0;
        if (left == right) {
            menang = suara[right];
        } else {
            int middle = (left + right) / 2;          // divide
            hitungSuara(suara, left, middle - 1);     // conquer
            menang1 = menang;
            hitungSuara(suara, middle + 1, right);    // conquer
            if(menang.equalsIgnoreCase("a")){
                a++;
            }else if(menang.equalsIgnoreCase("b")){
                b++;
            } else {
                c++;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        if(a > b && a > c){
            menang = "Farlan";
        } else if(b > a && b > c){
            menang = "Farid";
        } else {
            menang = "Nothing";
        }
    }
    
    String getMenang(){
        return menang;
    }
}
