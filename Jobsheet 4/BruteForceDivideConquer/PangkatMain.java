package BruteForceDivideConquer;
import java.util.Scanner;
public class PangkatMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
            int elemen = sc.nextInt();
            Pangkat[] png = new Pangkat[elemen];
            for (int i = 0; i < elemen; i++) {
                System.out.print("Masukkan nilai yang hendak dipangkatkan: ");
                int nilai = sc.nextInt();
                System.out.print("Masukkan nilai pemangkat: ");
                int pangkat = sc.nextInt();
                png[i] = new Pangkat(nilai, pangkat);
            }
        boolean kondisi = true;
        do {
            System.out.println("=================================");
            System.out.println("Pilih Hitungan");
            System.out.println("1. Menggunakan Brute Force ");
            System.out.println("2. Menggunakan Divide Conquer");
            System.out.println("3. Keluar ");
            System.out.print("Silahkan Pilih(1/2/3): ");
            int Pilihan = sc.nextInt();
            switch (Pilihan) {
                case 1:
                    System.out.println("HASIL PANGKAT - BRUTE FORCE");
                    for (int i = 0; i < elemen; i++) {
                        System.out.println("Hasil dari "
                        + png[i].nilai+" pangkat "
                        + png[i].pangkat+" adalah "
                        + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                    }
                    break;
                case 2:
                    System.out.println("HAIL PANGKAT - DIVIDE AND CONQUER");
                    for (int i = 0; i < elemen; i++) {
                        System.out.println("Hasil dari "
                        + png[i].nilai+" pangkat "
                        + png[i].pangkat+" adalah "
                        + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                    }
                    break;
                case 3:
                    System.out.println("See You!");
                    kondisi = false;
                    break;
                default:
                    break;
            }
        } while (kondisi == true);
     }
}