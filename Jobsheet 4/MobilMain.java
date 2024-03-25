import java.util.Scanner;
public class MobilMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a. Informasi");
        System.out.println("b. Keluar");
        System.out.print("Pilih opsi diatas: ");
        String pilihan = sc.next();

        switch (pilihan) {
            case "a":
                daftarMobil(sc);
                break;
            case "b":
                System.out.println("See You!");
                System.exit(0);
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }
    }

    static void daftarMobil(Scanner sc) {
        Mobil[] mobil = {
            new Mobil("BMW", "M2 Coupe", 2016, 6816, 728),
            new Mobil("Ford", "Fiesta ST", 2014, 3921, 575),
            new Mobil("Nissan", "370Z", 2009, 4360, 657),
            new Mobil("Subaru", "BRZ", 2014, 4058, 609),
            new Mobil("Subaru", "Impreza WRX STI", 2013, 6255, 703),
            new Mobil("Toyota", "AE86 Trueno", 1986, 3700, 553),
            new Mobil("Toyota", "86/GT86", 2014, 4180, 609),
            new Mobil("Volkswagen", "Golf GTI", 2014, 4180, 631),
        };

        Mobil topAccelTertinggi = mobil[0];
        Mobil topAccelTerendah = mobil[0];
        double totalTopPower = 0;

        for (Mobil m : mobil) {
            if (m.topAccel > topAccelTertinggi.topAccel) {
                topAccelTertinggi = m;
            }
            if (m.topAccel < topAccelTerendah.topAccel) {
                topAccelTerendah = m;
            }
            totalTopPower += m.topPower;
        }

        System.out.print("Mobil yang memiliki top acceleration tertinggi: ");
        System.out.println(topAccelTertinggi.merk + " " + topAccelTertinggi.tipe + " (" + topAccelTertinggi.tahun + ")");
        System.out.print("Mobil yang memiliki top acceleration terendah : ");
        System.out.println(topAccelTerendah.merk + " " + topAccelTerendah.tipe + " (" + topAccelTerendah.tahun + ")");
        System.out.print("Rata-rata Top Power dari seluruh mobil        : ");
        System.out.println(totalTopPower / mobil.length);
    }
}