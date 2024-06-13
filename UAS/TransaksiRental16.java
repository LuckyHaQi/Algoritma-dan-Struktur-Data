public class TransaksiRental16 {
    int kodeTransaksi16;
    String namaPeminjam16;
    int lamaPeminjam16;
    double totalBiaya16;
    BarangRental16 br16;

    public TransaksiRental16(int kodeTransaksi16, String namaPeminjam16, int lamaPeminjam16, BarangRental16 br16) {
        this.kodeTransaksi16 = kodeTransaksi16;
        this.namaPeminjam16 = namaPeminjam16;
        this.lamaPeminjam16 = lamaPeminjam16;
        this.br16 = br16;
        this.totalBiaya16 = diskonTotalBiaya();
    }

    double diskonTotalBiaya() {
        double biayaPerJam;
        if (br16.jenisKendaraan16.equalsIgnoreCase("motor")) {
            biayaPerJam = 25000;
        } else {
            biayaPerJam = 40000;
        }

        double totalBiaya = biayaPerJam * lamaPeminjam16;
        if (lamaPeminjam16 > 48 && lamaPeminjam16 <= 78) {
            totalBiaya = totalBiaya * 90 / 100;
        } else if (lamaPeminjam16 > 78) {
            totalBiaya= totalBiaya * 80 / 100;
        }
        return totalBiaya;
    }

    public String Info() {
        return kodeTransaksi16 + "\t" + namaPeminjam16 + "\t" + lamaPeminjam16 + "\t" + String.format("%.2f", totalBiaya16) + "\t" + br16.noTNKB16 + "\t" + br16.namaKendaraan16;
    }
}
