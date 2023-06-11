package DSA.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap();
        //orderd are not presesrved
        map.put(2, "Rehan");
        map.put(1,"Naman");
        map.put(4,"Rahul");
        map.put(3,"Ayan");
        System.out.println("HashMap Data:"+map);
        //functions in HaashMap
        String result=map.get(3);
        System.out.println("Using get Function");
        System.out.println(result);//the give the string value
        System.out.println("Functionality of Containkey function");
        System.out.println(map.containsKey(2));//the give the boolean value
        System.out.println("Functionality of remove function");
        map.remove(1);
        System.out.println(map);
        //iterating using for loop
        for(java.util.Map.Entry<Integer, String> e:map.entrySet()){
            
            System.out.println("Key: "+e.getKey()+" Value: "+e.getValue());

        }

            System.out.println("LinkedHashMap: The order are preserved");
            LinkedHashMap<Integer,String> map1=new LinkedHashMap();
            //orderd are  presesrved
            map1.put(2, "Rehan");
            map1.put(1,"Naman");
            map1.put(4,"Rahul");
            map1.put(3,"Ayan");
            System.out.println("LinkedHashMap Data:"+map1);
        
            //sorted data in term of key
            TreeMap<Integer,String> map2=new TreeMap();
            //orderd are not presesrved
            map2.put(2, "Rehan");
            map2.put(1,"Naman");
            map2.put(4,"Rahul");
            map2.put(3,"Ayan");
            System.out.println("TreeMap Data:"+map2);
    }
}
