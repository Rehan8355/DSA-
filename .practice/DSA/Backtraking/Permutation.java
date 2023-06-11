package DSA.Backtraking;

public class Permutation {
    public static String swap(String str,int i, int j){
        char[]charArray=str.toCharArray();
        char temp=charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
        return String.valueOf(charArray);
    }
    public static void permut(String str,int l,int r){
        if(l==r){
            System.out.println(str);
        }
        else{
            for(int i=l; i<=r; i++){
                str=swap(str, l, i);
                permut(str,l+1,r);
                //back trakcking
                str=swap(str, l, i);
            }
        }
    }
    public static void main(String[] args) {
        String str="ABC";
        int n=str.length();
        System.out.println("For the string " + str + " Permutations are :");
        permut(str,0,n-1);
        
    }
}
