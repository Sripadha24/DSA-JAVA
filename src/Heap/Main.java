package Heap;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(10);
        heap.insert(23);
        heap.insert(9);
        heap.insert(56);
        heap.insert(90);
        heap.insert(25);
        System.out.println(heap.getHeap());
        heap.remove();
        System.out.println(heap.getHeap());


    }
}
