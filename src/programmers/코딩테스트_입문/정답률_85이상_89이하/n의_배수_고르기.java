package programmers.코딩테스트_입문.정답률_85이상_89이하;

import java.util.ArrayList;
import java.util.List;

public class n의_배수_고르기 {
    public int[] solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();

        for (int num : numlist) {
            if (num % n == 0) answer.add(num);
        }

        return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
