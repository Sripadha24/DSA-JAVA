package LinkedList;

public class LinkedList<E> {
    private Node head;
    private Node tail;
    private int length;
    class Node{
        E value;
        Node next;
        Node(E value){
            this.value = value;
        }

    }

    public LinkedList(E value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length =1;
    }

    public void printlist(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
    }
    public void getLength(){
        System.out.println("length "+length);
    }
    public void getHead(){
        System.out.println("head "+head.value);
    }
    public void getTail(){
        System.out.println("tail "+tail.value);
    }

    public void append(E value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    public Object removeLast(){
        Node temp = head;
        Node pre = head;
        while(temp.next!=null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        return temp.value;

    }
    public void prepend(E value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }

        length++;
    }
    public Object removeFirst(){
        Node temp = head;
        if(head == null){

            return (int)-1;
        }else{
            head =head.next;
            temp.next = null;
            length--;

        }
        if(head == null) tail = null;
        return temp.value;
    }
    public Object get(int index){
        Node temp = head;
        if(index < 0 || index >= length) return -1;
       for(int i =0;i<index;i++){
           temp = temp.next;
       }
        return temp.value;
    }
    public boolean set(int index,E value){
        Node temp = head;
        if(index <0 || index >=length) return false;
        for(int i =0;i<index;i++){
            temp = temp.next;
        }
        temp.value = value;
        return true;
    }
    public boolean insert(int index,E value){
        Node newNode = new Node(value);
        if(index < 0 || index > length) return false;
        if(index == 0){
            prepend(value);
            length++;
            return true;

        }
        if(index == length){
            append(value);
            length++;
            return true;
        }
        Node temp = head;
        for(int i =0;i<index;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }
    public Object remove(int index){
        Node temp = head;
        Node pre = head;
        if(index < 0 || index >= length) return -1;
        if(index == 0){
            length --;
            return removeFirst();
        }
        if(index == length){
            length--;
            return removeLast();
        }
        for(int i =0;i<index;i++){
            pre = temp;
            temp = temp.next;
        }
        pre.next = temp.next;
        temp.next = null;
        return temp.value;

    }
    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node before = null;
        Node after = null;
        while(temp !=null){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }









}
