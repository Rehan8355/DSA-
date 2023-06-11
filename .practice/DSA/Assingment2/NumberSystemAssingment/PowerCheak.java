package DSA.Assingment2.NumberSystemAssingment;
import java.util.Scanner;


public class PowerCheak {
    public static boolean FindPower(int n){
    boolean result= false; 
        if(n%2==0){
            result=true;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number you want to cheack pwer of Two or Not:");
        int n=sc.nextInt();
        boolean Result= FindPower(n);
        System.out.println(Result);
        
    }
}
