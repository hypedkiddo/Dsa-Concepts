public class SudokuSolver {
    public static boolean isSafe(char[][] board, int row, int col, char digit) {
        // Row check
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == digit) return false;
        }

        // Column check
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == digit) return false;
        }

        // 3x3 Grid check
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == digit) return false;
            }
        }
        return true;
    }

    public static boolean solve(char[][] board, int row, int col) {
        // Base case: If we reach row 9, solution is found
        if (row == 9) return true;

        // Calculate next position
        int nextRow = row, nextCol = col + 1;
        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // If cell is already filled, move to next cell
        if (board[row][col] != '.') {
            return solve(board, nextRow, nextCol);
        }

        // Try placing digits from '1' to '9'
        for (char digit = '1'; digit <= '9'; digit++) {
            if (isSafe(board, row, col, digit)) {
                board[row][col] = digit;
                if (solve(board, nextRow, nextCol)) return true;  // Stop if solution found
                board[row][col] = '.'; // Backtrack
            }
        }
        return false;  // No valid number found, trigger backtracking
    }

    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        if (solve(board, 0, 0)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists!");
        }
    }
}
