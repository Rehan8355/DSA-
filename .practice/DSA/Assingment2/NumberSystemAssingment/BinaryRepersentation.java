package DSA.Assingment2.NumberSystemAssingment;

import java.util.Scanner;

public class BinaryRepersentation {
    public static String convertToBinary(int Decimal){
        if(Decimal==0){
            return "0";
        }
        String binary=" ";
        while(Decimal>0){
            int reminder=Decimal%2;
            binary= reminder+ binary;
            Decimal=Decimal/2;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Decimal Number:");
        int Decimal=sc.nextInt();
        String binary = convertToBinary(Decimal);
        System.out.print("Binary Repersentation:"+binary);
    }
}
