package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr =new int[]{6,3,5,2,8,0,1,9,4};
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(arr));
    }
    private static void selectionSort(int[] arr) {
        int minIndex =-1;
        for(int i=0;i<arr.length-1;i++){
            minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIndex] > arr[j])
                    minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
