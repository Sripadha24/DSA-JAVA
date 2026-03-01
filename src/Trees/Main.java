package Trees;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(8);
        tree.insert(5);
        tree.insert(11);
        tree.rInsert(9);
        tree.deleteNode(8);
        System.out.println(tree.rContains(10));

    }
}
