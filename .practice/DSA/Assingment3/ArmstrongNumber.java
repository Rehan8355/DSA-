package DSA.Assingment3;

import java.util.Scanner;

public class ArmstrongNumber {
    private static int calculateArmstrongSum(int n,int NumberOfDigits){
        if(n==0){
            return 0;

        }
        int LastDigit=n%10;
           return(int)Math.pow(LastDigit, NumberOfDigits)+calculateArmstrongSum(n/10, NumberOfDigits);
       
    }
    private static int getNumberOfDigits(int n) {
        if(n==0){
            return 0;
        }
        return 1+ getNumberOfDigits(n/10);
    }
    //function defination
    public static boolean isArmstrong(int n){
     int sum = calculateArmstrongSum(n, getNumberOfDigits(n));
     return n==sum;   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();

       
        //Function calling
        if(isArmstrong(n)){
            System.out.println(n+" is an Armstrong number.");
        }
        else {
            System.out.println(n+" is not an Armstrong number.");
        }
    }
}
