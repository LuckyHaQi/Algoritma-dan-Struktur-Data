import java.util.Scanner;
public class BinaryTreeMain16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree16 tree = new BinaryTree16();
        System.out.print("Masukkan data kedalam tree (atau ketik 'exit' jika selesai): ");
        while (sc.hasNextInt()) {
            int data = sc.nextInt();
            tree.add(data);
            System.out.print("Masukkan data kedalam tree (atau ketik 'exit' jika selesai): ");
        }
        System.out.println("Nilai minimal didalam tree        : " + tree.findMinValue());
        System.out.println("Nilai maksimal didalam tree       : " + tree.findMaxValue());
        System.out.print("Daun nodes didalam tree           : ");
        tree.printLeafNodes();
        System.out.println();
        System.out.println("Banyaknya daun didalam tree       : " + tree.countLeafNodes());
        System.out.print("PreOrder traversal of the tree    : ");
        tree.traversePreOrder();
        System.out.print("PostOrder traversal of the tree   : ");
        tree.traversePostOrder();
        sc.close();
    }
}