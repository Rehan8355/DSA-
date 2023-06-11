package DSA.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //size of the array
        System.out.print("Enter the size of the Array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        //target element
        System.out.print("Enter the target Element:");
        int target=sc.nextInt();
        //creating a hashmap
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i],i);
        }
        //array for result
        int []result=new int[2];
        result[0]=-1;
        result[1]=-1;
        for(int i=0; i<n; i++){
            if(arr[i]==target && map.containsKey(0)){
                result[0]=i;
                result[1]=map.get(0);
                break;
            }
            else if(map.containsKey(target-arr[i])){
            
            if(map.get(target-arr[i])>i){
                result[0]=i;
                result[1]=map.get(target-arr[i]);
                break;

            }
           
        }
    }
    System.out.println("Two Sum index value are:"+"["+result[0]+","+result[1]+"]");    
    }
    
}
