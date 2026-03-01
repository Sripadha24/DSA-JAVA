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
    public boolean rContains(int value){
        return rContains(root,value);
    }
    private boolean rContains(Node curr,int value){
        if(curr == null) return false;
        if(curr.value == value) return true;
        if(value < curr.value)
            return rContains(curr.left,value);
        else
            return rContains(curr.right,value);
    }
    public void rInsert(int value){
       root =  rInsert(root,value);
    }
    private Node rInsert(Node curr,int value){
        if(curr == null) return new Node(value);
        if(value < curr.value) curr.left = rInsert(curr.left,value);
        if(value > curr.value) curr.right = rInsert(curr.right,value);
        return  curr;
    }
    public void deleteNode(int value){
        root = deleteNode(root,value);
    }
    public Node deleteNode(Node curr,int value){
        if(curr == null) return null;
        if(value < curr.value) curr.left = deleteNode(curr.left,value);
        else if(value > curr.value) curr.right = deleteNode(curr.right,value);
        else{
            if(curr.left == null && curr.right == null) {
                return null;
            } else if (curr.left == null) {
                curr = curr.right;

            } else if (curr.right == null) {
                curr = curr.left;
            }else{
                int subtree = minValue(curr.right);
                curr.value = subtree;
                curr.right = deleteNode(curr.right, subtree);
            }
        }
        return curr;
    }
    public int minValue(Node curr){
        Node temp = curr;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp.value;

    }



}
