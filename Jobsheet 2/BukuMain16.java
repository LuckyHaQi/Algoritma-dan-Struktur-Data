public class BukuMain16{
    String judul, pengarang;
    int halaman, harga;
    static int stok;
    public static void main(String[] args) {
    Buku16 bk1 = new Buku16();
    bk1.judul = "Todays Ends Tommorow Comes";
    bk1.pengarang = "Denanda Pratiwi";
    bk1.halaman = 198;
    bk1.stok = 13;
    bk1.harga = 71000;
    if (bk1.stok > 0) {
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        bk1.stokKosong(0);
    }
    else
    System.out.println("Invalid.");
    }
}