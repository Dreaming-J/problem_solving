package programmers.코딩테스트_입문.정답률_85이상_89이하;

import java.util.List;

public class 모음_제거 {
    public String solution(String my_string) {
        List<String> vowels = List.of("a", "e", "i", "o", "u");

        for (String vowel : vowels) {
            my_string = my_string.replaceAll(vowel, "");
        }

        return my_string;
    }
}
