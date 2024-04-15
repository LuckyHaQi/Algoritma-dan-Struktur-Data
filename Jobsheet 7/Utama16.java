import java.util.Scanner;
public class Utama16 {
    public static void main(String[] args) {
        Gudang16 gudang = new Gudang16(7);
        Scanner scanner = new Scanner(System.in);
        while (true) {/
            System.out.println("\nMenu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Tampilkan barang teratas");
            System.out.println("5. Atur kapasitas Gudang");
            System.out.println("6. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                     System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang16 barangBaru = new Barang16(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                    case 3:
                    gudang.tampilkanBarang();
                case 4:
                    gudang.lihatBarangTeratas();
                case 5:
                    System.out.println("Masukkan kapasitas barang yang diinginkan: ");
                    int kapasitas = scanner.nextInt();
                        gudang = new Gudang16(kapasitas);
                    break;
                    case 6:
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi");
                break;
            }
        }
    }
}