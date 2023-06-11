package DSA.Assingment2.SortingAssingment;

import java.util.Arrays;

public class DescendingInsertionSort {
    //function Defination
    public static void FindDescendingSort(int arr[]){
        for(int i=1;i<arr.length; i++){
            int j=i;
            while(j>0 && arr[j]>arr[j-1]){
                int swap=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=swap;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,7,3,5,4};
        //sunction calling
        FindDescendingSort(arr);
        System.out.print("Descending Order Sort:");
        //we use toString for better understanding
        System.out.println(Arrays.toString(arr));
    }
}
