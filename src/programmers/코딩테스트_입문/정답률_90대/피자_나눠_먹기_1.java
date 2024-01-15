package programmers.코딩테스트_입문.정답률_90대;

public class 피자_나눠_먹기_1 {
    public int solution(int n) {
        int answer = 1;

        while (answer * 7 < n) {
            answer++;
        }

        return answer;
    }
}
