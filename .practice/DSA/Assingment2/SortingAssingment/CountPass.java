package DSA.Assingment2.SortingAssingment;

public class CountPass {
   

    //function defination
    public static int DescendingSort(int arr[]){
        int count=0;
        for(int i=0; i<arr.length; i++){
            boolean swaped=false;
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]<arr[j+1]){
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                    swaped=true;
                    count++;
                }
                
                
            }
            if(!swaped){
                break;
            }
        }
        
        return count;
        
    
    }

    public static void main(String[] args) {
        int arr[]={3,5,1,6,0};
        //function calling
        int result= DescendingSort(arr);
        System.out.println(result);
        //  System.out.print("Sorted Array:");
        //  System.out.println(Arrays.toString(arr));
       
         
    }
}


