package ArraySegitiga;
import java.lang.Math;
public class Segitiga16{
    public int alas;
    public int tinggi;

    public Segitiga16(int a, int t) {
        alas = a;
        tinggi = t;
    }
    double hitungLuas() {
        return (alas * tinggi) / 2;
    }
    double hitungKeliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }
}