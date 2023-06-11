package DSA;

public class Reversal {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,9,10};
        int n=arr.length;
        //take the for loop
        for(int i=0;i<n/2;i++){
            //swap the value
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.print("Reversal Array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
    }
}
