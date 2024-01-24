package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class 최댓값_만들기_1 {
    public int solution(int[] numbers) {
        int[] max = {0, 0};

        for (int num : numbers) {
            if (num > max[0]) {
                if (max[0] > max[1]) max[1] = max[0];
                max[0] = num;
                continue;
            }

            if (num >= max[1]) {
                max[1] = num;
            }
        }

        return max[0] * max[1];
    }
}
