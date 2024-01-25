package programmers.코딩테스트_입문.정답률_85이상_89이하;

import java.util.List;
import java.util.stream.Stream;

public class ㅁ369게임 {
    public int solution(int order) {
        List<String> num = List.of("3", "6", "9");

        return (int) Stream.of(String.valueOf(order).split(""))
                .filter(num::contains)
                .count();
    }
}
