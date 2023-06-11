package DSA;
import java.util.Scanner;
import java.io.*;

public class MatrixSum {
    //function 
    public static int PrifixSum(int arr[][],int r1,int r2,int c1,int c2){
        int sum=0;
         for(int i=r1; i<=r2; i++){
           for(int j=c1; j<=c2; j++){
           {
                sum+=arr[i][j];
            }
        }
    }
      return sum;
        
    }
    
    
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of Rows:");
        int m=sc.nextInt();
        System.out.println("Enter the no of Columns:");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter the Matrix elements:");
        for(int i=0;i<m;i++){
            for(int j=0; j<n; j++){
               
               // Arrays.toString(arr);
                arr[i][j]=sc.nextInt();

            }
        }
        int r1,r2,c1,c2;
        //Values you want to add and run the loop
        System.out.println("Enter the Value of (Row start) r1 :");
         r1=sc.nextInt();
         System.out.println("Enter the value of(Row end) r2:");
         r2=sc.nextInt();
         System.out.println("Enter the value of(column start) c1:");
         c1=sc.nextInt();
         System.out.println("Enter the value of (column end)c2:");
         c2=sc.nextInt();
        
         //function call
         
         int result=PrifixSum(arr, r1, r2, c1, c2);
         System.out.println("SUM:"+result);
       // RotationMatrix1(arr, r1, r2, c1, c2);
    }
}
