package DSA.Backtraking;

import java.util.Scanner;

public class TillingProblem {
    //function defination
    public static int getWays(int n){
        if(n<=3){
            return n;
        }
        else{
            //1,2,3,5(2+3),8(3+5)......(n-1)+(n-2)
            return getWays(n-1) + getWays(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        //function calling
        System.out.println("The number of ways "+getWays(n));
    }
}
