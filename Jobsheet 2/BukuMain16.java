public class BukuMain16{
    String judul, pengarang;
    int halaman, stok, harga;
    public static void main(String[] args) {
    Buku16 bk1 = new Buku16();
    bk1.judul = "Todays Ends Tommorow Comes";
    bk1.pengarang = "Denanda Pratiwi";
    bk1.halaman = 198;
    bk1.stok = 13;
    bk1.harga = 71000;

    bk1.tampilInformasi();
    bk1.terjual(5);
    bk1.gantiHarga(60000);
    bk1.tampilInformasi();
    }
    void tampilInformasi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }
    void terjual(int jml){
        stok -= jml;
    }
    void restock (int jml) {
        stok += jml;
    }
    void gantiHarga (int hrg){
        harga = hrg;
    }
}