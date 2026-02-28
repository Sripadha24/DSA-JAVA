package StackImplementation;

public class Main {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());


        StackLinkedList list = new StackLinkedList(10);
        list.printlist();
        list.push(20);
        list.push(30);
        list.push(40);
        list.printlist();
        list.pop();
        list.printlist();
    }
}
