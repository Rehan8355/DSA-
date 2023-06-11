package DSA.Assingment3;
import java.util.Scanner;

public class ArrayMax {
    //function defination
    public static int FindMax(int arr[], int index){
        int Max=0;
        if(index==1){
            return arr[index];
    }
     Max=FindMax(arr, index-1);
    if (arr[index - 1] > Max) {
        Max = arr[index - 1];
    }
    return Max;
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
        int MaxNo=FindMax(arr, n);
        System.out.print("Max No:"+MaxNo);
        System.out.println();


    }
}
