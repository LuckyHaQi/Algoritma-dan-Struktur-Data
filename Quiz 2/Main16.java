import java.util.Scanner;
public class Main16{
    public static void menu(){
        System.out.println("=-------< Menu >-------=");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian");
        System.out.println("4. Laporan Layanan");
        System.out.println("5. Keluar program");
    }

    public static void main(String[] args){
        Layanan16[] mlm = new Layanan16[3];
        mlm[0] = new Layanan16(1, "Cuci Mobil", 50000);
        mlm[1] = new Layanan16(2, "Nambal Ban", 75000);
        mlm[2] = new Layanan16(3, "Perbaiki Mobil", 200000);
        Scanner scanner = new Scanner(System.in);
        LL16 antrian = new LL16();
        int pilih;
        
        do{
            menu();
            System.out.print("Pilih menu: ");
            pilih = scanner.nextInt();
            System.out.println("=----------------------=");
            switch (pilih){
                case 1:
                    System.out.print("Nama\t: ");
                    String nama16 = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("No. HP\t: ");
                    String noHP = scanner.next();
                    pelangan16 plg = new pelangan16(nama16, noHP);
                    System.out.println("Pilih layanan\t: ");
                    for (int i = 0; i < mlm.length; i++){
                        System.out.println((i + 1) + ". " + mlm[i].nama16);
                    }
                    int pilihLyn = scanner.nextInt();
                    scanner.nextLine();

                    antrian.tambah16(plg, mlm[pilihLyn - 1]);
                    break;
                case 2:
                    antrian.antrian16();
                    break;
                case 3:
                    antrian.hapus16();
                    break;
                case 4:
                    antrian.laporanLayanan16();
                    break;
                case 5:
                    System.out.println("Terima Kasih");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        } while (true);
    }
}