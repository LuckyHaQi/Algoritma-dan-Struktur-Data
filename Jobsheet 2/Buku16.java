public class Buku16 {
    String judul, pengarang;
    int halaman, stok, harga;
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
    void stokKosong (int jml){
        if(stok == 0)
            System.out.println("Stok kosong");
    }
}