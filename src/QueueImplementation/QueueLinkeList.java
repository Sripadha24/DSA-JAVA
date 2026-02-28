package QueueImplementation;

public class QueueLinkeList {
    private Node first;
    private Node last;
    private int length =0;
    class Node{
        int value ;
        Node next;
        public Node(int value){
            this.value = value;
        }

    }
    public QueueLinkeList(int value){
        Node newNode = new Node(value);
         first = newNode;
         last = newNode;
         length++;
    }
    public void enqueue(int value){
        Node newNode = new Node(value);
        if(first == null){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
    }
    public int dequeue(){
        Node temp = first;
        if(first == null){
            return -1;
        }
        first = first.next;
        temp.next = null;
        return temp.value;
    }
    public void printlist(){
        Node temp = first;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

}
