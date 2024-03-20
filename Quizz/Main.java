import java.util.Scanner;
  public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int pilih;
      Baju baju;
  
      System.out.println("Selamat Datang di Penyewaan Baju Adat");
      System.out.println("1. Jawa");
      System.out.println("2. Bali");
      System.out.println("3. Sumatera");
      System.out.print("Pilih jenis Baju:");
      pilih = sc.nextInt();
        switch (pilih) {
        case 1:
          baju = new Baju("Jawa", 80000, 2);
          break;
        case 2:
          baju = new Baju("Bali", 100000, 4);
          break;
        case 3:
          baju = new Baju("Sumatera", 120000, 1);
          break;
        default:
          System.out.println("Pilihan tidak valid!");
          return;  
        }
      System.out.println("\nAnda menyewa:");
      System.out.println("Baju Daerah: " + baju.bajuDaerah());
      System.out.println("Harga Sewa: Rp" + baju.hargaSewa());
      System.out.println("Durasi Sewa: " + baju.durasiSewa() + " hari");
      System.out.println("Total Biaya Sewa: Rp" + baju.hitungTotalSewa());
    }
  }