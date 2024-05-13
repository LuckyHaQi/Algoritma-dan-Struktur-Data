import java.util.Scanner;
public class VaksinMain {
    public static void main(String[] args){
        Vaksin vaksin = new Vaksin();
        Scanner scanner = new Scanner(System.in);
        int pilih;
        while (true){
            System.out.println("+---------------------------+");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+---------------------------+");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+---------------------------+");
            System.out.print("Pilih menu: ");
            pilih = scanner.nextInt();
            switch (pilih){
                case 1:
                    System.out.println("+---------------------------+");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("+---------------------------+");
                    System.out.print("Nomor Antrian: ");
                    int data = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nama Penerima: ");
                    String nama = scanner.nextLine();
                    vaksin.tambah(data, nama);
                    break;
                case 2:
                    vaksin.hapus();
                    break;
                case 3:
                    System.out.println("+---------------------------+");
                    System.out.println("   Daftar Pengantri Vaksin   ");
                    System.out.println("+---------------------------+");
                    vaksin.tampildaftar();
                    break;
                case 4:
                    System.out.println("+---------------------------+");
                    System.out.println("         TERIMA KASIH        ");
                    System.out.println("+---------------------------+");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi");
                    break;
            }
        }
    }
}
