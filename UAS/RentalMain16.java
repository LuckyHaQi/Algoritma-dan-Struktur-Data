import java.util.Scanner;

public class RentalMain16 {
    public static void main(String[] args) {
        Rental16 rental16 = new Rental16();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n+-----------< Menu >-----------+");
            System.out.println("1. Daftar kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan transaksi urut nama peminjam");
            System.out.println("5. Keluar");
            System.out.println("+--------------------------------+");
            System.out.print("Pilih 1-5: ");
            int pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    rental16.tampilkanDaftarKendaraan16();
                    break;
                case 2:
                    rental16.peminjaman16();
                    break;
                case 3:
                    rental16.tampilkanSemuaTransaksi16();
                    break;
                case 4:
                    rental16.urutkanTransaksi16();
                    break;
                case 5:
                    System.out.println("Terima Kasih");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
