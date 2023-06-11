//Approach Modified Binary tree
//Time complexity: o(Log n)
//Space complexity: O(1)
package DSA;

import java.util.Scanner;

import javax.xml.transform.Result;
//Function  
public class SquareRoot {
    public static int SquareRootFind(int arr[],int num){
        //Initaliy we take the resul -1

        int low=0,high=arr.length,result=-1;
        //take the whihle loop foe the conditon of low<= high 
        while(low<=high) {
            //fing the mid
            int mid=low+(high-low)/2;
            //find square root
            long val=mid*mid;
            //if val== mid we directly print the index 
            if(val==num){
                return mid;
            }
            else if(val<num){
                //we store the flore value if the perfect square not present
                result=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return result;
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
        System.out.print("Enter The Element you want Square root: ");
        int num=sc.nextInt();
        //Function call
        int result=SquareRootFind(arr, num);
              System.out.print("The index of the Squrae root element is :" +result);
              System.out.println();
    }
}
