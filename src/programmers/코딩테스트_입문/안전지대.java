package programmers.코딩테스트_입문;

public class 안전지대 {
    public void classify(int[][] board, int x, int y) {
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (x + i < 0 || x + i >= board[0].length) continue;
                if (y + j < 0 || y + j >= board.length) continue;
                if (board[x + i][y + j] == 1) continue;
                board[x + i][y + j] = -1;
            }
        }
    }

    public int solution(int[][] board) {
        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    classify(board, i, j);
                }
            }
        }

        for (int[] row : board) {
            for (int dot : row) {
                if (dot == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
