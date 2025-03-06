
import java.util.*;
public class nqueens {
    public static List<List<String>> ans = new ArrayList<>();
    public static boolean isSafe(char[][] board,int row ,int col){
        //vertical check
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q') {
                return false;
            }
        }
        //left diagonal check
        for(int i= row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q') {
                return false;
            }
        }
        //right diagonal check
        for(int i=row-1, j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q') {
                return false;
            }
        }
        return true;
    }

    public static void nqueens(char[][] board, int row) {
        if (row == board.length) {
            addAns(board);
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nqueens(board, row + 1);
                //bactrack here
                //So now the function call has reached here it has printed the possible solutions,so before placing queen on the next column
                //we have to delete the queen which was placed earlier.
                board[row][j] = '.';
            }

        }
    }

    public static void addAns(char[][] board){
        List<String> temp = new ArrayList<>();
        for (char[] row : board) {
            temp.add(new String(row));
        }
        ans.add(temp);
    }

    //Execution starts here
    public List<List<String>> solveNQueens(int n) {
        ans.clear();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        nqueens(board, 0);
        return ans;
    }

    public static void main(String[] args) {

    }


}
