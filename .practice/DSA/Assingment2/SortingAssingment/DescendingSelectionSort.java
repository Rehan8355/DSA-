package DSA.Assingment2.SortingAssingment;

import java.util.Arrays;

public class DescendingSelectionSort {
    public static void FindDescendingSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            //min index is taing taking lagest element
            int min_idx=i;
            for(int j=i+1; j<arr.length; j++ ){
                if(arr[j]>arr[min_idx])
                min_idx=j;
            }
         
         if(min_idx!=i){
            int swap=arr[min_idx];
            arr[min_idx]=arr[i];
            arr[i]=swap;
         }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,7,3,5,4};
        //Function calling
        FindDescendingSort(arr);
        System.out.print("Descending Order Sort:");
        //we use toString for better understanding
        System.out.println(Arrays.toString(arr));
    }
}
