package Trees;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(8);
        tree.insert(5);
        tree.insert(11);
        System.out.println(tree.contains(10));
    }
}
