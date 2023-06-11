package DSA;

import java.util.Arrays;

public class SelectionSort {
    private static int min_idx;
    public static void selectionSort(int[]arr){
        for(int i=0; i<arr.length; i++){
            int min_idx=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            if(min_idx!=i){
                //swap between the arr[mid_idx] and arr[]
                int temp=arr[min_idx];
                arr[min_idx]=arr[i];
                arr[min_idx]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={89,32,33,12,11,10};

        selectionSort(arr);
        System.out.print("Sorted Array: ");
        System.out.print(Arrays.toString(arr));
        System.out.println();
    }
}
