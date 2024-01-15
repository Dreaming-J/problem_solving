package programmers.코딩테스트_입문.정답률_90대;

public class 짝수의_합 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1;i <= n; i++) {
            if (i % 2 == 0) answer += i;
        }
        return answer;
    }
}
