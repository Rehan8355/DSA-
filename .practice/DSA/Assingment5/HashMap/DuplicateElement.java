package DSA.Assingment5.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int n=sc.nextInt();
        System.out.print("Enter the elements of the Array:");
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Duplicate Element present:");
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int result=-1;
        for(int i=0; i<n; i++){
            if(map.get(arr[i])>1){
                System.out.println("YES");
                result=1;
                break;
            }
        }
            if(result==-1){
                System.out.println("NO");
                
            }
        }
    }

