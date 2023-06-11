package DSA;

import java.util.Scanner;

public class PowerOfElement {
    //function defination
    public static int FindPower(int a, int b){
        int mid=0, result=0,finalResult=0;
        //base case
        if(b==1){
            return a;
        }
        else{
            mid=b/2;
            result=FindPower(a, mid);
            finalResult=result*result;
        }
        if(b%2==0){
            return finalResult;
        }
        else{
            return a*finalResult;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        //Function calling
        int Result=FindPower(a,b);
        System.out.print("Power of Element a:"+Result);
        System.out.println();        
        
    }
}
