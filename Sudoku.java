public class Sudoku {

    public static boolean solve(int[][] board,int row, int col){
        if(col >= board.length) {
            row++;
            col = 0;
        } if (row >= board.length) {
            return true;
        }


        if(board[row][col] != 0) {
            return  solve(board,row,col+1);
        }


        for (int num = 1; num <= board.length; num++) {
            if(canPlace(board,row,col,num)){

            }
        }


        return false;
    }

    private static boolean canPlace(int[][] board, int row, int col, int num) {
        return  isRowSafe(board,row,col,num) &&
                isColSafe(board,row,col,num) &&
                isSquareSafe(board,row,col,num);

    }

    private static boolean isRowSafe(int[][] board, int row, int col, int num) {
        return true;
    }
    private static boolean isColSafe(int[][] board, int row, int col, int num) {
        return true;
    }
    private static boolean isSquareSafe(int[][] board, int row, int col, int num) {
        return true;
    }
}
