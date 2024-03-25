package BruteForceDivideConquer;
import java.util.Scanner;
public class SumMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan Banyak Perusahaan: ");
        int pt = sc.nextInt();
        Sum[][] sm = new Sum[pt][1];
        for (int i = 0; i < sm.length; i++) {
            System.out.println("Perusahaan ke-"+(i+1));
            System.out.print("Masukkan Bulan yang dinginkan: ");
            int bln = sc.nextInt();
            sm[i][0] = new Sum(bln ,i);
            for (int j = 0; j < sm[i][0].elemen; j++) {
                System.out.print("Masukkan untung bulan ke- "+(j+1)+" = ");
                sm[i][0].keuntungan[j] = sc.nextDouble();
            }
           }
           for (int i = 0; i < pt; i++) {
            System.out.println("Total keuntungan perusahaan "+(i+1)+" selama "+ sm[i][0].elemen+" bulan");
            System.out.println("Algoritma Brute Force ");
            System.out.println("Total keuntungan perusahaan selama "+ sm[i][0].elemen+" bulan adalah = "+ sm[i][0].totalBF());
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama "+ sm[i][0].elemen+" bulan adalah = "+ sm[i][0].totalDC(0, sm[i][0].elemen-1));
        }
    } 
}