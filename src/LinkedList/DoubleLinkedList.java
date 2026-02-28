package LinkedList;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    int length;
    class Node{
        int value;
        Node next;
        Node prev;
        public Node(int value){
            this.value = value;
        }

    }
    public DoubleLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length=1;
    }
    public void printlist(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void append(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            length++;
        }

    }
    public int removeLast(){
        Node temp = tail;
        if(head == null){
            return -1;
        }else if(tail.prev == null){
            head = null;
            tail = null;
        }
        else{
            tail = temp.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;

        return temp.value;
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
        newNode.next  = head;
        head.prev = newNode;
        head = newNode;
        }
        length++;

    }
    public int removeFirst(){
        Node temp = head;
        if(head == null){
            return  -1;
        }else if(tail.prev == null){
            head = null;
            tail = null;
        }else{
            head = temp.next;
            head.prev = null;
            temp.next = null;

        }
        length--;
        return temp.value;
    }
    public int get(int index){
        Node temp = head;
        if(index < 0 || index > length) return -1;
        for(int i =0;i<index;i++){
            temp = temp.next;
        }
        return temp.value;
    }
    public boolean set(int index,int value){
        Node temp = head;
        if(index < 0 || index > length) return false;
        for(int i =0;i<index;i++){
            temp = temp.next;
        }
        temp.value =value;
        return true;
    }
    public boolean insert(int index,int value){
        Node newNode = new Node(value);
        if(index < 0 || index > length) return false;
        if(index == 0){
            prepend(value);

            return true;

        }
        if(index == length){
            append(value);

            return true;
        }
        Node before = head;
        for(int i =0;i<index-1;i++){
            before =before.next;
        }
        Node after = before.next;
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
    }







}
