package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class 팩토리얼 {
    public int solution(int n) {
        int fact = 1;
        int i = 1;
        while(fact <= n) {
            i++;
            fact *= i;
        }

        return i - 1;
    }
}
