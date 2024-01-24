package programmers.코딩테스트_입문.정답률_85이상_89이하;

import java.util.stream.Collectors;

public class 외계행성의_나이 {
    public String solution(int age) {
        String answer = String.valueOf(age);
        return answer.chars()
                .mapToObj(letter -> String.valueOf((char) (letter + 49)))
                .collect(Collectors.joining(""));
    }
}
