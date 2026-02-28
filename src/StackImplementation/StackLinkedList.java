package StackImplementation;

public class StackLinkedList {
    private Node top;
    private int height;
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }

    }
    public StackLinkedList(int value){
        Node newNode = new Node(value);
        top = newNode;
        height =1;
    }
    public void push(int value){
        Node newNode = new Node(value);
        if(top == null) top = newNode;
        newNode.next = top;
        top = newNode;
        height++;
    }
    public void printlist(){
        Node temp = top;
        while(temp !=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public int pop(){
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp.value;
    }



}
