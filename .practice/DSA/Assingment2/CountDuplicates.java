package DSA.Assingment2;

import java.util.Scanner;

import javax.swing.text.html.StyleSheet;

public class CountDuplicates {
    public static int CountDuplicatesOccurrence(int arr[], int target){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                count++;
            }    
        }
        return count;
        }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of Array you want to Add:");
        int n=sc.nextInt();
        System.out.println("Enter The elements:");
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Element you want Last Occurrance:");
        int target=sc.nextInt();
        
        //Function calling
        int result=CountDuplicatesOccurrence(arr, target);
        if(result==0){
            System.out.println("Element Are not Found In the Array");
        }
        else{
            System.out.println("Target " +target+ " Occurrs "+result+" times");
        }
    }
}
