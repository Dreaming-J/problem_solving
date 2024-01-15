package programmers.코딩테스트_입문.정답률_90대;

import java.util.Arrays;

public class 배열의_평균값 {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers)
                .average()
                .getAsDouble();
    }
}
