package BruteForceDivideConquer;
import java.util.Scanner;
public class FaktorialMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke- " + (i+1) + " : ");
            fk[i].nilai = sc.nextInt();
        }
        System.out.println("==============================================");
        System.out.println("Hasil faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++){
            long startTime = System.nanoTime();
            int hasilBF = fk[i].faktorialBF(fk[i].nilai);
            long endTime = System.nanoTime();
            long timeBF = endTime - startTime;
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + hasilBF);
            System.out.println("Waktu eksekusi Brute Force: " + timeBF + " nanoseconds");
        }
        System.out.println("==============================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++){
            long startTime = System.nanoTime();
            int hasilDC = fk[i].faktorialDC(fk[i].nilai);
            long endTime = System.nanoTime();
            long timeDC = endTime - startTime;
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + hasilDC);
            System.out.println("Waktu eksekusi Divide and Conquer: " + timeDC + " nanoseconds");
        }
    System.out.println("==============================================");   
    }
}
