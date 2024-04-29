import java.util.Scanner;

public class AlatPestaMain16 {
    public static void main(String[] args) {
        Scanner sc16 = new Scanner(System.in);
        PersewaanAlat16 data = new PersewaanAlat16();

        data.list16[0] = new AlatPesta16("Kompor", "Kompor Mini", 20000);
        data.list16[1] = new AlatPesta16("Kursi", "Kursi Lipat", 10000);
        data.list16[2] = new AlatPesta16("Meja", "Meja Bulat", 30000);

        boolean exit = false;

        while (!exit) {
            System.out.println("\nSilahkan memilih opsi!");
            System.out.println("1. Tampilkan List Alat");
            System.out.println("2. Urutkan list alat dari harga yang termurah");
            System.out.println("3. Urutkan list alat dari harga yang termahal");
            System.out.println("4. Cari alat pesta berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int opsi = sc16.nextInt();

            switch (opsi) {
                case 1:
                    data.tampilDataAlat16();
                    break;
                case 2:
                    System.out.println("Urutkan data secara Ascending: ");
                    data.urutkanHargaAscending16();
                    break;
                case 3:
                    System.out.println("Urutkan data secara Descending: ");
                    data.urutkanHargaDescending16();
                    break;
                case 4:
                    System.out.print("Masukkan nama alat yang ingin dicari: ");
                    sc16.nextLine();
                    String namaCari = sc16.nextLine();
                    data.cariAlatPesta16(namaCari);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
                    break;
            }
        }
    }
}