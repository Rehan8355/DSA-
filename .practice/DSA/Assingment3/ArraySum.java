package DSA.Assingment3;
import java.util.*;

public class ArraySum {
    //function Defination
    public static int SumArray(int arr[],int index){
       // int FinalSum=0;
        if(index==0){
            return 0;
        }
        return arr[index-1]+SumArray(arr, index-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array:");
        int n=sc.nextInt();
        System.out.println("Enter the array elements:");
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        //function calling
        int result=SumArray(arr, n);
        System.out.print("Array sum:"+result);
        System.out.println();
        
    }
}
