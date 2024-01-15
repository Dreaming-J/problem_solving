package programmers.코딩테스트_입문;

public class 분수의_덧셈 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        numer1 *= denom2;
        numer2 *= denom1;
        denom1 *= denom2;
        int[] answer = {numer1 + numer2, denom1};

        for (int i = denom1; i > 0; i--) {
            if (answer[0] % i == 0 && answer[1] % i == 0) {
                answer[0] = (int) answer[0] / i;
                answer[1] = (int) answer[1] / i;
            }
        }

        return answer;
    }
}
