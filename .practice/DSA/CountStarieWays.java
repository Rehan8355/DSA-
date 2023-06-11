package DSA;

import java.util.Scanner;

import javax.swing.text.html.StyleSheet;
//Time compexity O(n^n)
//Space Complexity O(n)
public class CountStarieWays {
    //function defination
    public static int CountNum(int n){
        int result=0;
        //base case condition
        if(n==1||n==0){
            return n;
        }
        //Recursive call
        else{
            result= CountNum(n-1)+CountNum(n-2);
        }
      return  result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of Stairs:");
        int n=sc.nextInt();
        //function calling
        int Result= CountNum(n+1);
        System.out.println("No of Ways:"+Result);
    }
}
