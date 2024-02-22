public class Buku16 {
    String judul, pengarang;
    int halaman, stok, harga, hargaDiskon, hargaTotal;
    public Buku16(){

    }   

    public Buku16(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
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
    void stokKosong (int jml){
        if(stok == 0)
            System.out.println("Stok kosong");        
    }
    int hitungHargaTotal(int jml){
        hargaTotal = harga * jml;
        System.out.println("Harga total: " + hargaTotal);

        return hargaTotal;
    }
    void hitungDiskon(){
        if (hargaTotal > 150000) {
            hargaDiskon = 12;
        } else if (hargaTotal > 75000 && hargaTotal < 150000) {
            hargaDiskon = 5;
        } else {
            hargaDiskon = 0;
        }
    }
    void hitungHargaBayar(){
        int total = hargaTotal - (hargaTotal * hargaDiskon / 100);
        System.out.println("Harga Bayar: " + total);
    }
}