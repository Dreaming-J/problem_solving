package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class 자릿수_더하기 {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n = n / 10;
        }

        return answer;
    }
}
