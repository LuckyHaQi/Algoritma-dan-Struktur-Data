import java.util.Scanner;

public class GraphMain16 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah gedung: ");
        int v = scanner.nextInt();
        GraphMatriks16 graph = new GraphMatriks16(v);

        boolean running = true;
        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Remove ");
            System.out.println("3. Degree");
            System.out.println("4. Print");
            System.out.println("5. Cek");
            System.out.println("6. Exit");
            System.out.print("Pilih menu: ");
            int pilih = scanner.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan gedung asal: ");
                    int asal = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuan = scanner.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = scanner.nextInt();
                    graph.makeEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.print("Masukkan gedung asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = scanner.nextInt();
                    graph.removeEdge(asal, tujuan);
                    break;
                case 3:
                    System.out.print("Masukkan gedung untuk menghitung degree: ");
                    asal = scanner.nextInt();
                    graph.degree(asal);
                    break;
                case 4:
                    graph.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan gedung asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = scanner.nextInt();
                    if (graph.matriks[asal] == graph.matriks[tujuan]) {
                        System.out.println("Gedung tersebut sama");
                    } else {
                        if (graph.matriks[asal][tujuan] != 0) {
                            System.out.println("Gedung " + (char) ('A' + asal) + " terhubung dengan gedung " + (char) ('A' + tujuan));
                        } else {
                            System.out.println("Gedung " + (char) ('A' + asal) + " tidak terhubung dengan gedung " + (char) ('A' + tujuan));
                        }
                    }
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
            }
        }

        scanner.close();
    }
}