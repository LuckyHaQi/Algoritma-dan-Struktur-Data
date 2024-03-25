package BruteForceDivideConquer;
public class Sum {
    int elemen;
    int perusahaan;
    double keuntungan[], total;

    Sum(int elemen, int perusahaan){
        this.elemen = elemen;
        this.perusahaan = perusahaan;
        this.keuntungan = new double[elemen];   
        this.total = 0;
    }

    double totalBF(){
        for (int i = 0; i < elemen; i++) {
            total = total + keuntungan[i];
        }
        return total;
    }
    double totalDC( int l, int r){
        if (l==r) {
            return keuntungan[l];
        } else if (l < r) {
            int mid = (l+r) /2;
            double lsum = totalDC( l, mid);
            double rsum = totalDC( mid+1,r);
            return Math.round((lsum + rsum) * 100.0) / 100.0;
        }
        return 0 ;
    }
}