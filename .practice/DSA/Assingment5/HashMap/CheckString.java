package DSA.Assingment5.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the RansomNote:");
        String ransomNote=sc.nextLine();
        System.out.print("Enter the magzine:");
        String magzine=sc.nextLine();
        HashMap<Character,Integer>map1=new HashMap<>();
        for(int i=0; i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            if(map1.containsKey(c)){
                map1.put(c, map1.get(c)+1);
            }
            else{
                map1.put(c, 1);
            }
        }
        HashMap<Character,Integer>map2=new HashMap();
        for(int i=0; i<magzine.length(); i++){
            char c=magzine.charAt(i);
            if(map2.containsKey(c)){
                map2.put(c,map2.get(c)+1);
            }
            else{
                map2.put(c, 1);
            }
        }
        boolean ans=true;
        for(Map.Entry<Character,Integer>e:map1.entrySet()){
            if(!map2.containsKey((e.getKey()))||e.getValue()>map2.get(e.getKey())){
                ans=false;
                break;
            }
        }
        System.out.println(ans);
        
    }
}
