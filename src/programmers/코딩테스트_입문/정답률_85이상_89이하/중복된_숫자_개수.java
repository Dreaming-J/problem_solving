package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class 중복된_숫자_개수 {
    public int solution(int[] array, int n) {
        int answer = 0;

        for (int num : array) {
            if (num == n) answer++;
        }
        return answer;
    }
}
