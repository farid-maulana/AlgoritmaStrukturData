package Tugas;

/**
 *
 * @author FARLAN
 */
public class Tugas4 {

    public Tugas4(int jmlKandidat, int jmlSuara) {
        this.jmlKandidat = jmlKandidat;
        this.jmlSuara = jmlSuara;
        this.hasilSuara = new int[jmlKandidat];
        this.namaKandidat = new String[jmlKandidat];
        this.suara = new String[jmlSuara];
    }

    int jmlKandidat, jmlSuara, menang, mng, hasilSuara[];
    String namaKandidat[], suara[];

    public String hitungSuara(String suara[], int low, int high, String key) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if(key.equalsIgnoreCase(suara[mid])){
//                hasilSuara;
            }
        }

//        for(int i = 0; i < jmlSuara; i++){
//            for(int j = 0; j < jmlKandidat; j++){
//                if(suara[i].equalsIgnoreCase(namaKandidat[j])){
//                    hasilSuara[j]++;
//                }
//            }
//        }
//        
//        menang = 0;
//        mng = 0;
//        for(int i = 0; i < jmlKandidat; i++){
//            if(hasilSuara[i] > menang){
//                menang = hasilSuara[i];
//                mng = i;
//            }
//        }
        return namaKandidat[mng];
    }
}
