package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class ㅁ2차원으로_만들기 {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

        for (int i = 0; i < num_list.length / n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[i * n + j];
            }
        }

        return answer;
    }
}
