package programmers.코딩테스트_입문.정답률_90대;

public class 세균_증식 {
    public int solution(int n, int t) {
        while (t > 0) {
            n *= 2;
            t--;
        }

        return n;
    }
}
