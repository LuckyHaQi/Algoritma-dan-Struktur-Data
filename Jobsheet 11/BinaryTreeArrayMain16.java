import java.util.Scanner;
public class BinaryTreeArrayMain16 {
    public static void main(String[] args) {
        BinaryTreeArray16 bta = new BinaryTreeArray16();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan data kedalam tree (atau ketik 'exit' jika selesai): ");
        while (sc.hasNextInt()) {
            int data = sc.nextInt();
            bta.add(data);
            System.out.print("Masukkan data kedalam tree (atau ketik 'exit' jika selesai): ");
        }
        System.out.print("PreOrder traversal of the tree  : ");
        bta.traversePreOrder();
        System.out.print("PostOrder traversal of the tree : ");
        bta.traversePostOrder();
        sc.close();
    }
}