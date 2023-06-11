package DSA.Assingment5.HashMap;

import java.util.Scanner;
import java.util.TreeMap;

public class SortedBasedOnKey {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the key value pairs:");
        int n=sc.nextInt();
        TreeMap<Integer,String> map=new TreeMap<>();
        System.out.println("Enter the data:");
        for(int i=0; i<n; i++){
            int key =sc.nextInt();
            String value=sc.nextLine();
            map.put(key, value);
        }
        System.out.println("The Key-value paired are sorted:"+map);
    }
}
