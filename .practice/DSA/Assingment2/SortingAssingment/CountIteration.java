package DSA.Assingment2.SortingAssingment;

public class CountIteration {
   


    public static int FindDescendingSort(int arr[]){
        int count=0;
        for(int i=0; i<arr.length; i++){
            //min index is taing taking lagest element
            int min_idx=i;
           
            for(int j=i+1; j<arr.length; j++ ){
                
                if(arr[j]>arr[min_idx])
                min_idx=j;
                count++;    
            }
         
         if(min_idx!=i){
            
            int swap=arr[min_idx];
            arr[min_idx]=arr[i];
            arr[i]=swap;
          //  count++;
         }

        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,6,0};
        //Function calling
        int result=FindDescendingSort(arr);
        System.out.println(result);
      
    }
}


