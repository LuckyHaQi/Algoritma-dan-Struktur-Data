import java.util.Scanner;
public class BangunRuangMain16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Pilihan bangun ruang:\n1. Kerucut\n2. Limas\n3. Bola");
            System.out.print("Pilih bangun (1/2/3): ");
            int pilihan = sc.nextInt();
            System.out.println("______________________");
            System.out.println("");
            switch (pilihan) {
                case 1:
                        System.out.print("Jari-jari: ");
                        double jariJariKerucut = sc.nextDouble();
                        System.out.print("Sisi miring: ");
                        double sisiMiringKerucut = sc.nextDouble();
                        Kerucut16 kerucut = new Kerucut16(jariJariKerucut, sisiMiringKerucut);
                        System.out.printf("Luas Permukaan: %.2f\n", kerucut.hitungLuasPermukaanKerucut());
                        System.out.printf("Volume: %.2f\n", kerucut.hitungVolumeKerucut());
                    break;
                case 2:
                        System.out.print("Panjang sisi alas: ");
                        double panjangSisiAlasLimas = sc.nextDouble();
                        System.out.print("Tinggi limas: ");
                        double tinggiLimas = sc.nextDouble();
                        LimasPersegi16 limas = new LimasPersegi16(panjangSisiAlasLimas, tinggiLimas);
                        System.out.printf("Luas Permukaan: %.2f\n", limas.hitungLuasPermukaan());
                        System.out.printf("Volume: %.2f\n", limas.hitungVolume());
                    break;
                case 3:
                        System.out.print("Jari-jari: ");
                        double jariJariBola = sc.nextDouble();
                        Bola16 bola = new Bola16(jariJariBola);
                        System.out.printf("Luas Permukaan: %.2f\n", bola.hitungLuasPermukaanBola());
                        System.out.printf("Volume: %.2f\n", bola.hitungVolumeBola());
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
        }
    }
}
