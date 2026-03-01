package Heap;

import java.util.*;

public class Heap {
    private List<Integer> heap;

    public Heap(){
        heap = new ArrayList<>();
    }
    public ArrayList<Integer> getHeap(){
        return new ArrayList<>(heap);
    }
    private int leftChild(int index){
        return  2* index+1;
    }
    private int rightChild(int index){
        return 2*index+2;
    }
    private int parent(int index){
        return (index-1)/2;
    }
    private void swap(int index1,int index2){
        int temp = heap.get(index1);
        heap.set(index1,heap.get(index2));
        heap.set(index2,temp);
    }
    public void insert(int value){
        heap.add(value);
        int current = heap.size()-1;
        while(current > 0&& heap.get(current) > heap.get(parent(current))){
            swap(current,parent(current));
            current = parent(current);
        }
    }
    public Integer remove(){
        if(heap.isEmpty()) return null;
        if(heap.size() == 1) {
            return heap.remove(0);
        }
        int maxValue = heap.get(0);
        heap.set(0,heap.remove(heap.size()-1));
        sinkDown(0);
        return maxValue;
    }

    private void sinkDown(int index) {
        int maxIndex = index;
        int leftindex = leftChild(index);
        int rightindex = rightChild(index);
        while(true) {
            if (leftindex < heap.size() && heap.get(leftindex) > heap.get(rightindex)) {
                maxIndex = leftindex;
            }
            if (rightindex < heap.size() && heap.get(rightindex) > heap.get(leftindex)) {
                maxIndex = rightindex;
            }
            if (maxIndex != index) {
                swap(maxIndex, index);
                index = maxIndex;
            } else {
                return;
            }
        }
    }
}
