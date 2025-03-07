import java.util.ArrayList;

import java.util.ArrayList;
public class Rat_in_a_Maze {

   static boolean visited[][]=new boolean[4][4];
   public static ArrayList<String> ans=new ArrayList<>();
    public static int  getWay(int[][] mat,int i,int j,int n,String path){
        //boundary conditions
        if(i < 0 || j < 0 || i >= n || j >= n) {
            return 0;
        }
        //redundancy check
        if(visited[i][j]){
            return 0;
        }
        //base case
        if(i==n-1 && j==n-1){
            ans.add(path);
            return 1;
        }
        //path is blocked
        if(mat[i][j]==0){
            return 0;//No further path exists
        }
        visited[i][j]=true;//Process the current cell
        //Go up
        int w1=getWay(mat,i-1,j,n,path+"U");
        //Go down
        int w2=getWay(mat,i+1,j,n,path+"D");
        //go left
        int w3=getWay(mat,i,j-1,n,path+"L");
        //Go right
        int w4=getWay(mat,i,j+1,n,path+"R");
        visited[i][j] = false; // Unmark for other paths

        return w1+w2+w3+w4;
    }

   public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

       System.out.println(getWay(maze,0,0,4,"")); //--> this should give 2 as the answer
       System.out.println(ans);

    }
}
