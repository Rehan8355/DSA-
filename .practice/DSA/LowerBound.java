//implementation of lower bound (print the lower index of the element )
//Time complexity O(log n)
//Space complexity O(1)
package DSA;

import java.util.Scanner;
//functon defination
public class LowerBound {
    public static int FindFirstOccurence(int arr[],int target){
        int low=0,high=arr.length-1;
        int result=-1;
        //iterate low != high
        while(low<=high){

            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                high=mid-1; //traverse left side of the array
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;//traverse right side
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n=sc.nextInt();
        System.out.print("Enter the elements: ");
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the Element you want lower index:");
        int target=sc.nextInt();
        //Function calling
        int result=FindFirstOccurence(arr, target);
        if(result==-1){
            System.out.println("Elements are not found");
        }      
        else{
            System.out.println("The Lower Index of the Element: " +result);
        }
        System.out.println();   

    }
}
