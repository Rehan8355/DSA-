import java.util.*;
class factorial{
    public static void main(String[] args) {
        long n,fact=1;
        try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
    }
    catch(Exception e){
        System.out.println("Error");
    }
        System.out.println("Fact: " +fact);
    }
}