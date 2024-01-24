package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class 순서쌍의_개수 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer++;
        }

        return answer;
    }
}
