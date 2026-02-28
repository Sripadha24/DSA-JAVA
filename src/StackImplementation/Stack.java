package StackImplementation;

import java.util.List;

public class Stack<E>{
    E[] arr;
    int tops =-1;
    int size =10;
    public Stack(){
        arr = (E[]) new Object[size];
    }
    public void push(E e){
        if(tops<=size)
          arr[++tops] = e;
        else
          System.out.println("Stack is full");
    }
    public E pop(){
        return arr[tops--];
    }
    public E peek(){
        return arr[tops];
    }
}
