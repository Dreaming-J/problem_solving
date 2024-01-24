package programmers.코딩테스트_입문.정답률_85이상_89이하;

import java.util.stream.Collectors;

public class 대문자와_소문자 {
    public String solution(String my_string) {
        return my_string.chars()
                .mapToObj(letter -> {
                    char word;
                    if (letter < 97) word = (char) (letter + 32);
                    else word = (char) (letter - 32);
                    return String.valueOf(word);
                })
                .collect(Collectors.joining(""));
    }
}
