import java.util.Scanner;

public class GraphMain16 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah gedung: ");
        int v = scanner.nextInt();
        Graph16 graph = new Graph16(v);

        boolean running = true;
        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Exit");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan gedung asal: ");
                    int asal = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuan = scanner.nextInt();
                    if (asal != tujuan) {
                        System.out.print("Masukkan jarak: ");
                    int jarak = scanner.nextInt();
                    graph.addEdge(asal, tujuan, jarak);
                    } else {
                        System.out.println("Gedung tersebut sama");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan gedung asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = scanner.nextInt();
                    if (asal != tujuan) {
                        graph.removeEdge(asal, tujuan);
                    } else {
                        System.out.println("Gedung tersebut sama");
                    }
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
                    if (asal == tujuan) {
                        System.out.println("Gedung tersebut sama");
                    } else {
                        if (graph.hasEdge(asal, tujuan)) {
                            System.out.println("Gedung " + (char) ('A' + asal) + " terhubung dengan gedung " + (char) ('A' + tujuan));
                        } else {
                            System.out.println("Gedung " + (char) ('A' + asal) + " tidak terhubung dengan gedung " + (char) ('A' + tujuan));
                        }
                    }
                    break;
                case 6:
                    System.out.print("Masukkan gedung asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = scanner.nextInt();
                    if (asal != tujuan) {
                        System.out.print("Masukkan jarak baru: ");
                        int newJarak = scanner.nextInt();
                        graph.updateJarak(asal, tujuan, newJarak);
                    } else {
                        System.out.println("Gedung tersebut sama");
                    }
                    break;
                case 7:
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
