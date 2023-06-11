package DSA.Assingment3;

import java.util.Scanner;

public class SumOfDigits {
    //Function defination
    public static int DigitSum(int n){
        int result=0;
        if(n==1||n==0){
            return n;
        }
        else{
            result=DigitSum(n-1)+n;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=sc.nextInt();
        //Function calling
        int Result=DigitSum(n);
        System.out.print("Sum of Digits :"+Result);
        System.out.println();
    }
}
