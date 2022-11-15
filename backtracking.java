import java.util.concurrent.RecursiveAction;

public class backtracking {
      // // changing array using recursion
      // public static void changeArr(int arr[],int i,int val){
      // // base case
      // if(i==arr.length){
      // printArr(arr);
      // return;
      // }
      // // recursion
      // arr[i] = val;
      // changeArr(arr, i+1, val+1);
      // arr[i] = arr[i]-2;
      // }
      // // find and print all subsets of a given string
      // public static void findsubset(String str,String ans , int i){
      // // base case
      // if(i == str.length()){
      // System.out.println(ans);
      // return;
      // }
      // // choice : yes
      // findsubset(str, ans+str.charAt(i), i+1);
      // // choice : no
      // findsubset(str, ans, i+1);
      // }
      // // find permutations of string
      // public static void findpermutation(String str,String ans){
      // // base case
      // if(str.length() == 0){
      // System.out.println(ans);
      // return;
      // }
      // // recursion
      // for(int i=0;i<str.length();i++){
      // char curr = str.charAt(i);
      // //abcde = ab + de removed c
      // String newstr = str.substring(0, i) + str.substring(i+1);
      // findpermutation(newstr, ans+curr);

      // }
      // }

      // // N QUEENS : place queens in such a way that they can't attack each other in
      // chess board using recursion

      // public static void nqueens(char board[][],int row){
      // // base case
      // if(row == board.length){
      // printboard(board);
      // return;
      // }
      // // column loop
      // for(int j=0;j<board.length;j++){
      // if(isSafe(board, row, j)){
      // board[row][j] = 'Q';
      // nqueens(board, row+1);

      // } board[row][j] = 'X';
      // }

      // }
      // public static boolean isSafe(char board[][],int row,int col){
      // // vertical up
      // for(int i=row-1;i>=0;i--){
      // if(board[i][col] == 'Q'){
      // return false;
      // }
      // }
      // // diagonally left up
      // for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
      // {
      // if(board[i][j] == 'Q'){
      // return false;
      // }
      // }
      // // diagonally right up
      // for(int i = row-1,j = col+1;i>=0 && j<board.length;i--,j++){
      // if(board[i][j] == 'Q'){
      // return false;
      // }
      // }
      // return true;
      // }
      // public static void printboard(char board[][]){
      // System.out.println("-----------chess board------------");
      // for(int i=0;i<board.length;i++){
      // for(int j=0;j<board.length;j++){
      // System.out.print(board[i][j] + " ");
      // }System.out.println();
      // }
      // }
      // public static void main(String args[]){
      // int n=4;
      // char board[][] = new char[n][n];
      // //initialize
      // for(int i=0;i<n;i++){
      // for(int j=0;j<n;j++){
      // board[i][j] = 'X';
      // }
      // }
      // nqueens(board, 0);
      // }
      // GRIDWAYS : no. of ways to traverse a grid
      // public static int gridways(int i,int j, int n,int m){
      // // base case
      // if(i == n-1 && j == m-1){ // condition for last cell
      // return 1;
      // }else if(i == n || j == m){ // boundary cross condition
      // return 0;
      // }
      // int w1 = gridways(i+1, j, n, m);
      // int w2 = gridways(i, j+1, n, m);
      // return w1 + w2;
      // }
      // public static void main(String args[]){
      // int n=3,m=3;
      // System.out.println(gridways(0,0,n,m));
      // }

      // sudoku solver

      public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
            // column
            for (int i = 0; i <= 8; i++) {
                  if (sudoku[i][col] == digit) {
                        return false;
                  }
            }
            // row
            for (int j = 0; j <= 8; j++)
            {
                  if (sudoku[row][j] == digit)
                  {
                        return false;
                  }
            }
            // grid
            int sr = (row / 3) * 3;
            int sc = (col / 3) * 3;
            for (int i = sr; i < sr + 3; i++)
            {
                  for (int j = sc; j <= sc + 3; j++)
                  {
                        if (sudoku[i][j] == digit)
                        {
                              return false;
                        }
                  }
            }
            return true;
      }

public static boolean sudokusolver(int sudoku[][], int row,int col){
// base case
if(row == 9 && col = 0){
      return true;
}else if(row == 9){
      return false;
}
// recursion
int nextRow = row;
int nextcol = col+1;
if(col+1 == 9){
      nextRow == row+1;
      nextcol = 0;
}
if(sudoku[row][col] != 0){
      return sudokusolver(sudoku, nextRow, nextcol);
}
for(int digit=1;digit<=9;digit++){
      if(isSafe(sudoku,row,col,digit)){
            sudoku[row][col] = digit;
            if(sudokusolver(sudoku, nextRow, nextcol)){// solution exist
                  return true;
            }
       sudoku[row][col] = 0;
      }
}
return false;
}

      public static void printsudoku(int sudoku[][]) {
            for (int i = 0; i < 9; i++) {
                  for (int j = 0; j < 9; j++) {
                        System.out.print(sudoku[i][j] + " ");
                  }
                  System.out.println();
            }
      }

public static void main(String args[]){
      int sudoku[][] = { {0,0,8,0,0,0,0,0,0},
      {4,9,0,1,5,7,0,0,2},
      {0,0,3,0,0,4,1,9,0},
      {1,8,5,0,6,0,0,2,0},
      {0,0,0,0,2,0,0,6,0},
      {9,6,0,4,0,5,3,0,0},
      {0,3,0,0,7,2,0,0,4},
      {0,4,9,0,3,0,0,5,7},
      {0,2,7,0,0,9,0,1,3};  }

     

}
}
