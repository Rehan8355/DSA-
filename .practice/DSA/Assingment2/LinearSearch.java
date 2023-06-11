package DSA.Assingment2;

import java.util.Scanner;

public class LinearSearch{
    //Function Defination
    public static int linearSearch(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
          }
        return -1;
    }
    public static void main(String[] args) {
        //take the input from the user 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of element you  wnant to add:");
        int n=sc.nextInt();
        //elemts of the array to be stored  in the Array
        System.out.println("Enter the elements of the Array:");
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
             arr[i]=sc.nextInt();
        }
        //Element you want to search
        System.out.println("Enter the element you want to search in an Array: ");
        int target= sc.nextInt();
        
        //Function calling
        int result= linearSearch(arr, target);
        if(result==-1){
            System.out.println("Element Are not Found in Array");
        }
        else{
            System.out.println("Searched element: "+ result);
        }




    }
}
