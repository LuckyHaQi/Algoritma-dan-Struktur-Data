public class BinaryTree16 {
    Node16 root;

    public BinaryTree16() {
        root = null;
    }

    Node16 addRecursive(Node16 current, int data) {
        if (current == null) {
            return new Node16(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }

        return current;
    }

    public void add(int data) {
        root = addRecursive(root, data);
    }

    public int findMinValue() {
        return findMinValue(root);
    }

    int findMinValue(Node16 node) {
        if (node.left == null) {
            return node.data;
        }
        return findMinValue(node.left);
    }

    public int findMaxValue() {
        return findMaxValue(root);
    }

    int findMaxValue(Node16 node) {
        if (node.right == null) {
            return node.data;
        }
        return findMaxValue(node.right);
    }

    public void printLeafNodes() {
        printLeafNodes(root);
    }

    void printLeafNodes(Node16 node) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }
        printLeafNodes(node.left);
        printLeafNodes(node.right);
    }

    public int countLeafNodes() {
        return countLeafNodes(root);
    }

    int countLeafNodes(Node16 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }

    public void traversePreOrder() {
        traversePreOrder(root);
        System.out.println();
    }

    void traversePreOrder(Node16 node) {
        if (node != null) {
            System.out.print(node.data + " ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder() {
        traversePostOrder(root);
        System.out.println();
    }

    void traversePostOrder(Node16 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }
}
