package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr =new int[]{6,3,5,2,8,0,1,9,4};
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(arr));
         bubbleSort(arr);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(arr));
    }
    private static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-1;j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
