package DSA.Assingment2;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class LastOccurrance{
    //Function Defination
    public static int FindLastOccurrance(int arr[], int target){
        int low=0,high=arr.length;
        int mid=low+(high-low)/2;
        int result=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                low=mid+1;
                result=i;
            }
            else if(arr[i]<target){
                high=mid-1;
                
            }
            else{
                low=mid+1;
                
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of Array you want to Add:");
        int n=sc.nextInt();
        System.out.println("Enter The elements:");
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Element you want Last Occurrance:");
        int target=sc.nextInt();
        
        //Function calling

        int result= FindLastOccurrance(arr, target);
        if(result==-1){
            System.out.println("Element are not Found");
        }
        else{
            System.out.println("The last occurrence of the element is: " +result);
        }
    }


}