public class QueueMhsMain {
    public static void main(String[] args) {
        Queue antrian = new Queue();
        System.out.println("Enqueue :");
        antrian.enqueue(new Mhs(111, "Anton", null));
        System.out.println("Antrian saat ini:");
        antrian.print();
        antrian.enqueue(new Mhs(112, "Prita", null));
        System.out.println("Antrian saat ini:");
        antrian.print();
        antrian.enqueue(new Mhs(113, "Yusuf", null));
        System.out.println("Antrian saat ini:");
        antrian.print();
        antrian.enqueue(new Mhs(114, "Doni", null));
        System.out.println("Antrian saat ini:");
        antrian.print();
        antrian.enqueue(new Mhs(115, "Sari", null));
        System.out.println("Antrian saat ini:");
        antrian.print();
        System.out.println("\nDequeue :");
        antrian.dequeue();
        System.out.println("Antrian saat ini:");
        antrian.print();
        antrian.dequeue();
        System.out.println("Antrian saat ini:");
        antrian.print();
        antrian.dequeue();
        System.out.println("Antrian saat ini:");
        antrian.print();
        antrian.dequeue();
        System.out.println("Antrian saat ini:");
        antrian.print();
        antrian.dequeue();
        System.out.println("Antrian saat ini:");
        antrian.print();
    }
}