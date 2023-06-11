package DSA;

import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;


public class MatrixRotation {
    public static void RotationMatrix(int[][]arr){
        int m=arr.length;
        int n=arr[0].length;
        //Transpose the 2D Matrix
        for(int i=0; i<m; i++){
            for(int j=i;j<n; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //step2:Swap the left and right side element
        for(int i=0; i<m; i++){
            int li=0;
            int ri=n-1;
            while(li<ri){
                int temp=arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]=temp;
                li++;
                ri--;
            }
        }
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of Rows:");
        int m=sc.nextInt();
        System.out.println("Enter the no of columns:");
        int n=sc.nextInt();
        int[][]arr=new int[m][n];
        System.out.println("Enter the Matrix Element:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
            
                arr[i][j]=sc.nextInt();
               
            }
        }
        RotationMatrix(arr);
        for (var a : arr) 
            {
                System.out.println( Arrays.toString(a)+"]");

            }
        }
    }

