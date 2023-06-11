//Time complexity: O(n)
//Space Complexity: O(n)
package DSA;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class FactByRecursion {
    //Function defination 
    public static int factorial(int n){
        int result=0;
        if(n==0||n==1){
            return 1;
        }
        else {

         result =n*factorial(n-1);
    }
    return result;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();

        //Function calling
        int Result= factorial(n);
        System.out.print("Factorial of the given Number: "+Result);
        System.out.println();
    }
}
