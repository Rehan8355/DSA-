package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    //function defination
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[]={32,10,30,20,11};

        //Function call
        insertionSort(arr);
        System.out.print("Sorted Array: ");
        System.out.print(Arrays.toString(arr));
        System.out.println();
    }
}
