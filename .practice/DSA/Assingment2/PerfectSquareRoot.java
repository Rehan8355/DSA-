package DSA.Assingment2;

import java.util.Scanner;

public class PerfectSquareRoot {
    //function defination
    public static boolean FindPerfectSquareRoot(int arr[], int num){
        int low=0, high=num/2;
        int m=num/2;
        int mid=low+(high-low)/2;
        boolean result=false;
        while(low<=high){
            if(mid*mid==m){
                 result=true;
            }
            else if(mid*mid<m){
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
        System.out.print("Enter the size of the Array you want:");
        int n=sc.nextInt();
        System.out.print("Enter the elements:");
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want perfect Square: ");
        int num=sc.nextInt();
        //function calling
        boolean find= FindPerfectSquareRoot(arr, num);
        System.out.println(find);
        
    }
}
