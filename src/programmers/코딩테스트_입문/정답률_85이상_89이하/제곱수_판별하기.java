package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class 제곱수_판별하기 {
    public int solution(int n) {
        int i = 1;

        while (i * i <= n) {
            if (i * i == n) return 1;
            i++;
        }

        return 2;
    }
}
