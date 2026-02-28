package SearchingAlgorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(arr, 10));
    }

    private static int binarySearch(int[] arr, int key) {
        int left =0;
        int right = arr.length-1;
        int steps =0;
        while(left<=right){
            steps++;
            int mid = left+(right-left)/2;
            if(arr[mid]==key){
                System.out.println("steps :"+steps);
                return mid;
            }else if(arr[mid]<key){
                left = mid+1;
            }else{
                right = mid-1;
            }

        }
        System.out.println(steps);
        return -1;
    }
}
