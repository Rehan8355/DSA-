package DSA.Backtraking;

public class SudkoProblem {
    public static void print(int grid[][],int n){

        for(int i=0; i<=n; i++ ){
            for(int j=0; j<=n; j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int [][]grid,int row, int column,int n,int num){
        //row crash - row has unique values
        for(int i=0; i<n; i++){
            //check if it is safe to assing the number or not
            if(grid[row][i]==num){
                return false;
            }
        }
        //column clash - column has uneque
        for(int j=0; j<n; j++){
            //check it is safe or not
            if(grid[j][column]==num){
                return false;
            }
        }
        //subgrid //base case-subgrid has unique value
        int sqrt=(int)Math.sqrt(n);
        int BoxRow=row-row%sqrt;
        int BoxColumn=column-column%sqrt;
        for(int i=BoxRow; i<BoxRow+sqrt; i++){
            for(int j=BoxColumn; j<BoxColumn+sqrt; j++){
                if(grid[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean Sudkosolver(int [][]grid,int n){
        int row=-1,column=-1;
        boolean isEmpty=true;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==0){
                    row=i;
                    column=j;
                    //we still have same value left in 
                    isEmpty=false;
                    break;
                }
                if(! isEmpty){
                    break;
                }

            }
            //no empty space shoul;d be left 
            if(isEmpty){
                return true;
            }
            else{
                grid[row][column]=0;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int [][]grid={
        {3,0,6, 5,0,8, 4,0,0},
        {5,2,0, 0,0,0, 0,0,0},
        {0,8,7, 0,0,0, 0,3,1},

        {0,0,3, 0,1,0, 0,8,0},
        {9,0,0, 8,6,3, 0,0,5},
        {0,5,0, 0,9,0, 6,0,0},

        {1,3,0, 0,0,0, 2,5,0},
        {0,0,0, 0,0,0, 0,7,4},
        {0,0,5, 2,0,6, 3,0,0}};
        if(Sudkosolver(grid,grid.length)){
            print(grid,grid.length);
        }
        else{
            System.out.println("Not Posible");
        }
    }
}
