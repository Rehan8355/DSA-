package DSA.Assingment2.SortingAssingment;

import java.util.Arrays;

public class DescendingBubbleSort {
    //function defination
    public static void DescendingSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            boolean swaped=false;
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]<arr[j+1]){
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                    swaped=true;
                }
            }
            if(!swaped){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={2,4,5,1,3};
        //function calling
         DescendingSort(arr);
         System.out.print("Sorted Array:");
         System.out.println(Arrays.toString(arr));
    }
}
