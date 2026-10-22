class Solution {
    public int numRookCaptures(char[][] board) {
        int r=0,c=0;
        for(int i=0;i<8;i++){// finding the position where is the rook
            for(int j=0;j<8;j++){
                if(board[i][j]=='R'){
                    r=i;
                    c=j;
                }
            }
        }
        int cnt=0;
        // moving down and checking if theres a pawn or a bishop first
        for(int i=r+1;i<8;i++){
            if(board[i][c]=='p'){
                cnt++;
                break;
            }
            if(board[i][c]=='B')break;
        }
        // Right
        for(int i=c+1;i<8;i++){
            if(board[r][i]=='p'){
                cnt++;
                break;
            }
            if(board[r][i]=='B')break;
        }
        // Left
        for(int i=c-1;i>=0;i--){
            if(board[r][i]=='p'){
                cnt++;
                break;
            }
            if(board[r][i]=='B')break;
        }
        // Up
        for(int i=r-1;i>=0;i--){
            if(board[i][c]=='p'){
                cnt++;
                break;
            }
            if(board[i][c]=='B')break;
        }
        return cnt;
    }
}