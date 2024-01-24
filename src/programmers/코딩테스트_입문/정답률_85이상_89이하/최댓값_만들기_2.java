package programmers.코딩테스트_입문.정답률_85이상_89이하;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 최댓값_만들기_2 {
    public int solution(int[] numbers) {
        List<Integer> list = Arrays.stream(numbers)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        int answer1 = list.get(0) * list.get(1);
        int answer2 = list.get(list.size() - 1) * list.get(list.size() - 2);

        return Math.max(answer1, answer2);
    }
}
