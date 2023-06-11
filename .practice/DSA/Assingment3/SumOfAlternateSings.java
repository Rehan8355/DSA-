package DSA.Assingment3;

import java.util.Scanner;

public class SumOfAlternateSings {
    public static int SumAlternateSings(int n){
        int sum=0;
        if(n==0||n==1){
            return n;
        }
       
            sum=SumAlternateSings(n-1);
            if(n%2==0){
                sum -=n;
            }
            else{
                sum +=n;
            }
    
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number you want the sum: ");
        int n=sc.nextInt();
        //function calling
        int Result=SumAlternateSings(n);
        System.out.println("Sum of Alternate Signs:"+Result);
    }
}
