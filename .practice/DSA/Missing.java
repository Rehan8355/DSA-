package DSA;

public class Missing {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7,8};
        int n=arr.length;
        //find the sum of natural no math formula n(n-1)/2 but we add 1 because one no is missing inr the array
        int sum_of_natural_no=(n+1)*(n+2)/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int missing_ele=0;
        missing_ele=sum_of_natural_no-sum;
        System.out.println("Missing No:"+missing_ele);
    }
}
