package LinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList list = new LinkedList(4);
//
//        list.append(24);
//        list.append(42);
//        list.append(12);
//        list.append(10);
//       list.printlist();
////        list.getTail();
////        System.out.println(list.removeLast());
////        list.prepend(34);
////        list.prepend(100);
////
////        list.removeFirst();
////        System.out.println(list.set(4,56));
//       // System.out.println(list.insert(4,34));
//        System.out.println(list.remove(2));
//        list.printlist();
//        System.out.println();
//       // list.getTail();
//        //System.out.println(list.get(0));
//        list.reverse();
//        list.printlist();

        DoubleLinkedList list = new DoubleLinkedList(23);
        //list.printlist();
        list.append(43);
        list.append(55);
        list.printlist();
        list.removeLast();
        list.printlist();
        list.prepend(45);
        list.prepend(65);
        list.printlist();
        list.insert(2,1);
        list.printlist();


    }
}
