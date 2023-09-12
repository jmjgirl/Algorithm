class Solution {
    public int solution(int[][] board) {
        int [][] boomBoard = new int[board.length][board.length];
        
        // 지뢰있는 곳 찾기
        for (int i=0; i<boomBoard.length; i++) {
            for (int j=0; j<boomBoard.length; j++) {
                if(board[i][j] == 1) checkBoom(i,j,boomBoard);
            }
        }
        
        // 0인곳 개수 세기
        int count = 0;
        for (int k=0; k<boomBoard.length; k++) {
            for(int m=0; m<boomBoard.length; m++) {
                if(boomBoard[k][m] == 0) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    // 지뢰 1로 바꾸기
    static void checkBoom(int i, int j, int[][] boomBoard) {
        int BoomX;
        int BoomY;
        
        int [] moveX = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
        int [] moveY = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
        
        for (int x=0; x<9; x++) {
            BoomX = i + moveX[x];
            BoomY = j + moveY[x];
            
            if (BoomX >= 0 && BoomX < boomBoard.length && BoomY >= 0 && BoomY < boomBoard.length) 
                boomBoard[BoomX][BoomY] = 1;
        }
        
    }
}