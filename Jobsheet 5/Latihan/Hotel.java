public class Hotel{
    String nama;
    String kota;
    int harga;
    byte bintang;

    Hotel(String n, String k, int h, byte b){
    nama = n;
    kota = k;
    harga = h;
    bintang = b;
    }

    void tampilAll(){
        System.out.println("nama \t= " + nama);
        System.out.println("kota \t= " + kota);
        System.out.println("harga \t= " + harga);
        System.out.println("bintang = " + bintang);
    }
}