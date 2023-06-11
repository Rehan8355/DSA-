//Linear search
//Time complexity: O(n)
//Space complexity: O(1)
package DSA;

import java.util.Scanner;

public class LinearSearch {
    public static int SearchElement(int arr[], int target){
        //Simple iterate and cheak the condition
        for(int i=0; i<arr.length; i++){
            if(arr[i]== target){
                return i;
            }
        }
        return -1;
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array:");
        int n=sc.nextInt();
        System.out.print("Enter The Elements:");
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element you want to Search:");
        int target=sc.nextInt();
        int result= SearchElement(arr, target);
        if(result== -1){
            System.out.println("The search element Not found");
        }
        else{
            System.out.println("The index of search element is :"+result);
        }

    }
}

