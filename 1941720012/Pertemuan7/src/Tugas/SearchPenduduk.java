package Tugas;

/**
 *
 * @author FARLAN
 */
public class SearchPenduduk {

    String nik, nama, alamat, jenis_kelamin;

    public int searchData(SearchPenduduk data[], String cari) {
        int found = -1;
        int jmlData = data.length;
        for (int i = 0; i < jmlData; i++) {
            if (data[i].nik.equals(cari)) {
                found = i;
                break;
            }
        }
        return found;
    }
}
