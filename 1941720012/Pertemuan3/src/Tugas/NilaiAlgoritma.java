package Tugas;

/**
 *
 * @author FARLAN
 */
public class NilaiAlgoritma {
    String namaMhs;
    int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
    
    double hitungTotalNilai(){
        return (nilaiTugas * 0.3) + (nilaiKuis * 0.2) + (nilaiUTS * 0.2) + (nilaiUAS * 0.3);
    }
    
    double hitungRataRata(double nilai[], int n){
        double hasil = 0;
        for(int i = 0; i < n; i++){
            hasil += nilai[i];
        }
        return (hasil / n);
    }
    
//    double hitungRataDC(double nilai[], int n){
//        
//    }
}
