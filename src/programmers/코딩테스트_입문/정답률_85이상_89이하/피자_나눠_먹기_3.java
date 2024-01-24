package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class 피자_나눠_먹기_3 {
    public int solution(int slice, int n) {
        int answer = 0;

        while (slice * answer < n) {
            answer++;
        }

        return answer;
    }
}
