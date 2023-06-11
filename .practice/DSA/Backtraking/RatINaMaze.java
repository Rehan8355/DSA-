package DSA.Backtraking;

public class RatINaMaze {
    public static int countPath(int [][]Maze,int n){
         // Base case - Check if the source or destination is blocked
        if (Maze[0][0] == -1 || Maze[n - 1][n - 1] == -1) {
            return 0;
         }
        //initialise the topmost column
        for(int i=0;i<n; i++){
            if(Maze[i][0]==0){
                Maze[i][0]=1;
            }
            else{//if there is blockage then break 
                break;
            }
        }
            //initialise the topmost row
            for( int i=1; i<n; i++){
                if(Maze[0][i]==0){
                    Maze[0][i]=1;
                }//if blockage then break
                else{
                    break;
                }
            }
            //if maze[i][j]==-1 ignore otherwise compute value of count recursivly
        
        for(int i=1; i<n; i++){
            for(int j=1; j<n; j++){
                //check for blockage
                if(Maze[i][j]==-1){
                    continue;
                }
                //if we can reach Maze [i][j] for maze[i-1][j] then increment the count
                if(Maze[i-1][j]>0){
                    Maze[i][j]=Maze[i][j]+Maze[i-1][j];
                }
                //if we can reach Maze [i][j] for maze[i][j-1] then increment the count
                if(Maze[i][j-1]>0){
                    Maze[i][j]=Maze[i][j]+Maze[i][j-1];
                }

            }
        }
        return Maze[n-1][n-1];
    }
    public static void main(String[] args) {

        int [][] Maze ={{0,0,0,0},
                      {0,-1,0,0},
                      {-1,0,0,0},
                      {0,0,0,0}};
                       
                      // System.out.println(Arrays.deepToString(Maze));
                       System.out.println("Count: "+countPath(Maze, Maze.length));
    }
}
