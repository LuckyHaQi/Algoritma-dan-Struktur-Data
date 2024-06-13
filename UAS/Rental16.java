import java.util.Scanner;
public class Rental16 {
    BarangRental16[] daftarKendaraan;
    TransaksiRental16[] daftarTransaksi;
    int transaksiCounter;
    int totalTransaksi;

    public Rental16() {
        daftarKendaraan = new BarangRental16[4];
        daftarTransaksi = new TransaksiRental16[100];
        transaksiCounter = 1;
        totalTransaksi = 0;

        daftarKendaraan[0] = new BarangRental16(1, "B1234CD", "Honda Beat", "motor");
        daftarKendaraan[1] = new BarangRental16(2, "B5678EF", "Yamaha Nmax", "motor");
        daftarKendaraan[2] = new BarangRental16(3, "B9876GH", "Toyota Avanza", "mobil");
        daftarKendaraan[3] = new BarangRental16(4, "B5432IJ", "Honda Jazz", "mobil");
    }

    public void tampilkanDaftarKendaraan16() {
        System.out.println("+-----------< Daftar Kendaraan >-----------+");
        System.out.println("Kode\t" + "No TNKB\t" + "Nama Kendaraan\t" + "Jenis");
        for (int i = 0; i < daftarKendaraan.length; i++) {
            System.out.println(daftarKendaraan[i].Info());
        }
        System.out.println("+------------------------------------------+");
    }

    public boolean cekKendaraanTersedia16(int kodeBarang) {
        for (int i = 0; i < totalTransaksi; i++) {
            if (daftarTransaksi[i] != null && daftarTransaksi[i].br16.Kode16 == kodeBarang) {
                return false;
            }
        }
        return true;
    }

    public void peminjaman16() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kode Kendaraan: ");
        int kodeBarang = sc.nextInt();
        sc.nextLine();
        if (!cekKendaraanTersedia16(kodeBarang)) {
            System.out.println("Kendaraan sudah dipinjam.");
            return;
        }
        BarangRental16 barang = null;
        for (int i = 0; i < daftarKendaraan.length; i++) {
            if (daftarKendaraan[i].Kode16 == kodeBarang) {
                barang = daftarKendaraan[i];
                break;
            }
        }
        if (barang == null) {
            System.out.println("Kendaraan tidak ditemukan.");
            return;
        }

        System.out.print("Masukkan Nama Peminjam: ");
        String namaPeminjam = sc.nextLine();
        System.out.print("Masukkan Lama Peminjam (dalam jam): ");
        int lamaPeminjam = sc.nextInt();
        sc.nextLine();

        TransaksiRental16 transaksi = new TransaksiRental16(transaksiCounter++, namaPeminjam, lamaPeminjam, barang);
        daftarTransaksi[totalTransaksi++] = transaksi;
        System.out.println("Transaksi berhasil ditambahkan.");
    }

    public void tampilkanSemuaTransaksi16() {
        System.out.println("+----------< Semua Transaksi >-----------+");
        System.out.println("Kode\t" + "Nama Peminjam\t" + "Lama (jam)\t" + "Total Biaya\t" + "No TNKB\t" + "Nama Kendaraan");
        double totalPendapatan = 0;
        for (int i = 0; i < totalTransaksi; i++) {
            if (daftarTransaksi[i] != null) {
                System.out.println(daftarTransaksi[i].Info());
                totalPendapatan += daftarTransaksi[i].totalBiaya16;
            }
        }
        System.out.println("+-----------------------------------------+");
        System.out.println("Total Pendapatan: " + totalPendapatan);
    }

    public void urutkanTransaksi16() {
        for (int i = 0; i < totalTransaksi - 1; i++) {
            for (int j = i + 1; j < totalTransaksi; j++) {
                if (daftarTransaksi[i].namaPeminjam16.compareTo(daftarTransaksi[j].namaPeminjam16) < 0) {
                    TransaksiRental16 temp = daftarTransaksi[i];
                    daftarTransaksi[i] = daftarTransaksi[j];
                    daftarTransaksi[j] = temp;
                }
            }
        }
        System.out.println("Transaksi berhasil diurutkan berdasarkan nama peminjam secara descending.");
    }
}
