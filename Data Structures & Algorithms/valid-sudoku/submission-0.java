class Solution {
    public boolean isValidSudoku(char[][] board) {
        //For rows
        for(int i=0; i<9; i++){
            boolean[] seen = new boolean[9];
            for(int j=0; j<9; j++){
                char c = board[i][j];

                if(c != '.'){
                    int num = c - '1';
                    if(seen[num]) return false;

                    seen[num] = true;
                }
            }
        }

        //For columns
        for(int j=0; j<9; j++){
            boolean[] seen = new boolean[9];
            for(int i=0; i<9; i++){
                char c = board[i][j];

                if(c != '.'){
                    int num = c - '1';
                    if(seen[num]) return false;

                    seen[num] = true;
                }
            }
        }

        //For box
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                boolean[] seen = new boolean[9];

                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        char c = board[boxRow + i][boxCol + j];

                        if(c != '.'){
                            int num = c - '1';
                            if(seen[num]) return false;

                            seen[num] = true;
                        }

                    }
                }
            }
        }
        return true;
    }
}
