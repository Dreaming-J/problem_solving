package programmers.코딩테스트_입문.정답률_85이상_89이하;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 중앙값_구하기 {
    public int solution(int[] array) {
        return Arrays.stream(array)
                .sorted()
                .boxed()
                .collect(Collectors.toList())
                .get(array.length / 2);
    }
}
