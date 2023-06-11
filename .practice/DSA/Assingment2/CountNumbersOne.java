package DSA.Assingment2;

import java.util.Scanner;

import javax.naming.directory.SchemaViolationException;
import javax.print.attribute.standard.OutputDeviceAssigned;

public class CountNumbersOne {
    //Function Defination
    public static int CountNumbers(int arr[]){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array:");
        int n=sc.nextInt();
        System.out.println("Enter the Elements:");
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        //function Calling
        int result= CountNumbers(arr);
        System.out.println("The Numbers Are occured:"+result);

    }
}
