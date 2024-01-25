package programmers.코딩테스트_입문.정답률_85이상_89이하;

import java.util.List;

public class 중복된_문자_제거 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        for (String letter : List.of(my_string.split(""))) {
            if (!answer.toString().contains(letter)) {
                answer.append(letter);
            }
        }

        return answer.toString();
    }
}
