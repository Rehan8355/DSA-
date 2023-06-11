package DSA.Map;

import java.util.*;

public class FirestNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();

        HashMap<Character,Integer>map=new HashMap();
        for(int i=0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
            map.put(str.charAt(i), 1);
        }
    }
    int result=-1;
    for(int i=0; i<str.length(); i++){
        if(map.get(str.charAt(i))==1){
            result=1;
            System.out.println("The first non repeating element :"+str.charAt(i));
            break;
        }
        if(result==-1){
            System.out.println("Element are not found");
            break;
        }

    }
}
}