
/**
 *
 * @author FARLAN
 */
public class UTS {

    char data[];
    int length;

    public UTS(char[] dt, int length) {
        this.length = length;
        this.data = new char[length];
        for (int i = 0; i < length; i++) {
            data[i] = dt[i];
        }
    }

    public void sequentialSearch(char cari) {
        int total = count(cari);
        int i = 0;
        int posisi[] = new int[total];
        for (int j = 0; j < length; j++) {
            if (data[j] == cari) {
                posisi[i] = j;
                i++;
            }
        }
        printPosisi(posisi, cari);
    }

    public int binarySearch(char[] dt, char cari, int left, int right, boolean searchFirst) {
        int result = -1;

        if (left <= right) {
            int mid = (left + right) / 2;
            if (cari == dt[mid]) {
                result = mid;
                if (searchFirst) {
                    return binarySearch(dt, cari, left, mid - 1, searchFirst);
                } else {
                    left = mid + 1;
                    return binarySearch(dt, cari, mid + 1, right, searchFirst);
                }
            } else if (cari < dt[mid]) {
                return binarySearch(dt, cari, left, mid - 1, searchFirst);
            } else {
                return binarySearch(dt, cari, mid + 1, right, searchFirst);
            }
        }
        return result;
    }

    public void bin(char[] dt, char cari) {
        int low = 0, high = dt.length - 1;
        int startIndex = -1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (dt[mid] > cari) {
                high = mid - 1;
            } else if (dt[mid] == cari) {
                startIndex = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        int endIndex = -1;
        low = 0;
        high = dt.length - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (dt[mid] > cari) {
                high = mid - 1;
            } else if (dt[mid] == cari) {
                endIndex = mid;
                low = mid + 1;
            } else {
                low = mid + 1;
            }
        }

        if (startIndex != -1 && endIndex != -1) {
            System.out.print(">> Huruf '" + cari + "' ditemukan pada indeks ke ");
            for (int i = 0; i + startIndex <= endIndex; i++) {
                if (i > 0) {
                    System.out.print(',');
                }
                System.out.print(i + startIndex);
                
            }
        } else {
            System.out.print(">> Huruf '" + cari + "' tidak ditemukan.");
        }
    }

    private int count(char cari) {
        int total = 0;
        for (int j = 0; j < length; j++) {
            if (data[j] == cari) {
                total++;
            }
        }
        return total;
    }

    private void merge(char data[], int left, int middle, int right) {
        char[] temp = new char[data.length];
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        while (a <= middle && b <= right) {
            if (temp[a] <= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = middle - a;
        for (int i = 0; i <= s; i++) {
            data[c + i] = temp[a + i];
        }
    }

    public void sort(char data[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }

    public void printArray(char[] dt) {
        System.out.print("Data : {");
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                System.out.print("'" + dt[i] + "',");
            } else if (i == length - 1) {
                System.out.print(" '" + dt[i] + "'");
            } else {
                System.out.print(" '" + dt[i] + "',");
            }

        }
        System.out.println("}");
    }

    public void printPosisi(int[] posisi, char cari) {
        int total = posisi.length;
        if (total != 0) {
            System.out.print(">> Huruf '" + cari + "' ditemukan pada indeks ke ");
            for (int i = 0; i < total; i++) {
                if (i == total - 1) {
                    System.out.println(posisi[i] + ".");
                } else {
                    System.out.print(posisi[i] + ", ");
                }
            }
        } else {
            System.out.println(">> Huruf '" + cari + "' tidak ditemukan.");
        }
    }
}
