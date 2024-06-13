public class BarangRental16 {
    int Kode16;
    String noTNKB16;
    String namaKendaraan16;
    String jenisKendaraan16;

    public BarangRental16(int Kode16, String noTNKB16, String namaKendaraan16, String jenisKendaraan16) {
        this.Kode16 = Kode16;
        this.noTNKB16 = noTNKB16;
        this.namaKendaraan16 = namaKendaraan16;
        this.jenisKendaraan16 = jenisKendaraan16;
    }

    public String Info() {
        return Kode16 + "\t" + noTNKB16 + "\t" + namaKendaraan16 + "\t" + jenisKendaraan16;
    }
}
