package DSA;

import java.math.BigInteger;
import java.util.Scanner;

public class BigPower {
    //function defination
    public static BigInteger FindPower(BigInteger a, int b){
        BigInteger  result,finalResult;
        //base case
        if(b==1){
            return a;
        }
        else{
            
            result=FindPower(a, b/2);
            finalResult=result.multiply(result);
        }
        if(b%2==0){
            return finalResult;
        }
        else{
            return a.multiply(finalResult);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of a and b:");
        BigInteger a=sc.nextBigInteger();
        int b=sc.nextInt();
        //Function calling
        BigInteger Result=FindPower(a,b);
        System.out.print("Power of Element a:"+Result);
        System.out.println();        
        
    }
}
