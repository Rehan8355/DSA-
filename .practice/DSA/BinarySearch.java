//Binary search Algo
//its divide the problem into sub problrms
//Time complexity: O(log n)
// Space Complexity: O(1)
package DSA;

import java.util.Scanner;

public class BinarySearch {
    public static int BinarySearchElement(int arr[],int target){
        //Function 
        int low=0, high=arr.length;
        int mid=low+(high -low)/2;
        for(int i=0; i<arr.length; i++){
            //cheack the conditon if mid  is equal to search element
            if(arr[i]==target){
                return i;
            }
            //cheak the condition if the target is greatest 
            else if(arr[i]<target){
                low=mid+1;
            }
            //target is less
            else{
                high=mid-1;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the Array:");
        int n=sc.nextInt();
        System.out.print("Enter the Elements of the Array:");
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter The Element you want to Search: ");
        int target=sc.nextInt();
        //Function call
        int result=BinarySearchElement(arr, target);
        if(result==-1){
            System.out.println("The search element are not present int array");
        }
        else{
            System.out.print("The index of the search element is :" +result);
        }
        System.out.println();

    }
}
