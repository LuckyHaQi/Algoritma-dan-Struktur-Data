import java.util.Scanner;
public class DataMahasiswaMain16 {
    public static void main(String[] args) {
        DataMahasiswa16[] mhs = new DataMahasiswa16[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new DataMahasiswa16();
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama\t: ");
            mhs[i].nama = sc.next();
            sc.nextLine();
            System.out.print("Masukkan NIM\t: ");
            mhs[i].nim = sc.nextInt();
            System.out.print("Jenis kelamin\t: ");
            mhs[i].kelamin = sc.next().charAt(0);
            System.out.print("Masukkan IPK\t: ");
            mhs[i].ipk = sc.nextFloat();
        }
        System.out.println("_____________________________");
        for (int i = 0; i < mhs.length; i++) {
            mhs[i].tampilInformasi();
        }
    }
}