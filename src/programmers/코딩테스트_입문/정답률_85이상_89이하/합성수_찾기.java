package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class 합성수_찾기 {
    public int solution(int n) {
        int answer = 0;

        for (int j = 1; j <= n; j++) {
            int cnt = 0;
            for (int i = 1; i * i <= j; i++) {
                if (j % i == 0) {
                    cnt++;
                    if (i * i < j) cnt++;
                }

                if (cnt >= 3) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
