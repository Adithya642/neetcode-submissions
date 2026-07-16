// Approach is check every row and column and 3*3 grid to not contain duplicates
// Tc- O(9*9)+ O(9) + O() -O(9)
// 3*3 Grid- 
class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Rows and column check
        for(int i=0;i<board.length;i++){
            HashSet<Integer> hs=new HashSet<>();
            for(int j=0;j<board.length;j++){
                if(board[i][j]!='.'){
                int val=board[i][j];
               if(hs.contains(val)) return false;
                hs.add(val);
            }
            }
        }
        // Columns - code should iterate over columns considering each row for one iteration of column
        for(int j=0;j<board.length;j++){
            HashSet<Integer> hs=new HashSet<>();
            int colIndex=0;
            while(colIndex<board.length){
                if(board[colIndex][j]!='.'){
                    int val=board[colIndex][j];
                    if(hs.contains(val)) return false;
                        hs.add(val);
                }
                colIndex++;
            }
            }

        //grid check 
       for(int rowStart=0;rowStart<9;rowStart+=3){
            for (int colStart = 0; colStart < 9; colStart += 3) {
                HashSet<Integer> hs=new HashSet<>();
                for(int row=rowStart;row<rowStart+3;row++){
                    for(int col=colStart;col<colStart+3;col++){
                        char ele=board[row][col];
                        if(board[row][col]!='.'){
                        int val=board[row][col];
                        if(hs.contains(val)) return false;
                        hs.add(val);
                    }
                    }
                }
       }
    }
    return true;
    }
}
