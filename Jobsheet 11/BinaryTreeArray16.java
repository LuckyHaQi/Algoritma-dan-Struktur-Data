public class BinaryTreeArray16 {
    int[] data;
    int idxLast;

    public BinaryTreeArray16() {
        data = new int[10];
        idxLast = -1;
    }

    public void add(int data) {
        idxLast++;
        this.data[idxLast] = data;
    }

    public void traversePreOrder() {
        traversePreOrder(0);
        System.out.println();
    }

    private void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    public void traversePostOrder() {
        traversePostOrder(0);
        System.out.println();
    }

    private void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}