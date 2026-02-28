package Trees;

public class BinarySearchTree {
    class Node{
        private int value;
        private Node left;
        private Node right;
        public Node(int value){
            this.value = value;
        }
    }
    private Node root;

    public boolean insert(int value){
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while(temp != null){
            if(temp.value == newNode.value) return false;
            if(newNode.value < temp.value){
                if(temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                else{
                    temp = temp.left;
                }


            }else{
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                else {
                    temp = temp.right;
                }

            }

        }
        return true;

    }
    public boolean contains(int value){
        Node temp = root;
        if(root == null) {
            return false;
        }
        while(temp != null){
            if(value < temp.value ){
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;

            }else{
                return true;
            }
        }
        return false;
    }


}
