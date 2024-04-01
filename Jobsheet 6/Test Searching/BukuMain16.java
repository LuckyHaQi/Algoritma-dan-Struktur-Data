import java.util.Scanner;
public class BukuMain16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        PencarianBuku16 data = new PencarianBuku16();
        int jumBuku = 5;
        System.out.println("=------------------------------------------------------=");
        System.out.println("Masukkan data buku secara urut dari kode buku terkecil: ");
        for (int i = 0; i < jumBuku; i++){
            System.out.println("+-------------------------+");
            System.out.print("Kode buku\t: ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul buku\t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun terbit\t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang\t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock\t\t: ");
            int stock = s.nextInt();

            Buku16 m = new Buku16(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("=------------------------------------------------------=");
        System.out.println("Data keseluruhan buku: ");
        data.tampil();
        System.out.println("___________________________________________________________");
        System.out.println("___________________________________________________________");
        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan Judul Buku yang dicari: ");
        System.out.print("Judul Buku: ");
        String cari = s1.nextLine();
        data.sorting();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
        System.out.println("=========================================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
        s.close();
        s1.close();
    }
}