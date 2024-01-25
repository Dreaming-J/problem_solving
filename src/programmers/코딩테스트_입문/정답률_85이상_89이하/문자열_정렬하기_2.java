package programmers.코딩테스트_입문.정답률_85이상_89이하;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 문자열_정렬하기_2 {
    public String solution(String my_string) {
        return Stream.of(my_string.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.joining(""));
    }
}
