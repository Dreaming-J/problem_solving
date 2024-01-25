package programmers.코딩테스트_입문.정답률_85이상_89이하;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 배열_회전시키기 {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> answer = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toList());

        if (direction.equals("right")) {
            answer.add(0, answer.remove(answer.size() - 1));
        }
        if (direction.equals("left")) {
            answer.add(answer.size() - 1, answer.remove(0));

        }

        return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
