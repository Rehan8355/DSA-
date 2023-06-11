package DSA.Assingment2;

import java.util.Scanner;

public class FibonacciSeries {
   
    //Function Defination
    public static int FindFibonacci(int n){
    int result=0;
    if(n<=1){
        return n;
    } 
    else{
     result=FindFibonacci(n-1)+FindFibonacci(n-2);
    }
    return result;       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Fibonacci Number:");
        int n =sc.nextInt();
        //Function Calling
        int Result= FindFibonacci(n);
        System.out.print("The Fibonacci is:"+Result);
        System.out.println();
    }
}
