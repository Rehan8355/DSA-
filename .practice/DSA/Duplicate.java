package DSA;

public class Duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,3,5};
        int n=arr.length;

        int Count;
        for(int i=0; i<n; i++){
            for(int j=i+1;j<n;j++){
                
                if(arr[i]==arr[j]){
                    
                    System.out.println("Duplicate are found : "+arr[j]);
              
                }
            
            }
        
        }
        
      
    }
}
