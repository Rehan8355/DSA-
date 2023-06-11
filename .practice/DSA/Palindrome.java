package DSA;


public class Palindrome {
    public static void main(String[] args) {
        //Take a array 
        int arr[]={1,1,3,2,3,1,1};
        int n= arr.length;
        int flag=0;//its a variable 
        //Put the for loop for iterate n/2
        //Time complexitiy O(n) only one for loop
        //space complexity is constant o(1) 
        for(int i=0;i<n/2;i++){ 
            //check the condition arr[i] is not equal to arr[last element]
            if(arr[i]!=arr[n-i-1]){
                flag=1;
                System.out.println("Not a Palindromic Array");
                break;
            }
            
            }
            if(flag==0){
                System.out.println("It is an Palindromic Array");
                
        }
    }
    
}

