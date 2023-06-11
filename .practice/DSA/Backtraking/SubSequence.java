package DSA.Backtraking;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {
    //function defination
    public static void PrintSequence(int arr[], int index, ArrayList<Integer>tempArr){
        //base case
        if(index==arr.length){
            //print the subsequence -> don't print empty entry
            if(tempArr.size()>0){
                System.out.print(tempArr +" ");
               
            }
        return;
        }
                //recursiv call
                //include
                PrintSequence(arr, index+1, tempArr);
                //add the value in temparr
                tempArr.add(arr[index]);
                //Don't include
                PrintSequence(arr, index+1, tempArr);
                //remove last value
                tempArr.remove(tempArr.size()-1);
            
            }
        
    
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println("For the Array "+Arrays.toString(arr));
       PrintSequence(arr, 0, new ArrayList<>());
       System.out.println();
    }
}