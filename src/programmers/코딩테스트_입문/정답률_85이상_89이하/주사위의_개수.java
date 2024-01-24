package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class 주사위의_개수 {
    public int solution(int[] box, int n) {
        int answer = 1;

        for (int l : box) {
            answer *= l / n;
        }

        return answer;
    }
}
