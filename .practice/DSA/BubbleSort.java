package DSA;

import java.util.Arrays;

public class BubbleSort {
private static boolean swapped;
public static void bubbleSort(int arr[]){
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr.length-i-1; j++){
            boolean swapped =false;
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

                swapped=true;
            }
        }
     if(!swapped){
            break;
     }
 }
}
    public static void main(String[] args) {
        int[]arr={20,10,23,2,40,80};
        //function call
        bubbleSort(arr);
           System.out.print("Sorted array: ");
           System.out.print(Arrays.toString(arr));
           System.out.println();
    }

}
