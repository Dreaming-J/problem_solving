package programmers.코딩테스트_입문.정답률_85이상_89이하;

import java.util.ArrayList;
import java.util.List;

public class 문자열_정렬하기_1 {
    public boolean isInteger(String letter) {
        try {
            Integer.parseInt(letter);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int[] solution(String my_string) {
        List<Integer> answer = new ArrayList<>();

        for (String letter : my_string.split("")) {
            if (isInteger(letter)) answer.add(Integer.parseInt(letter));
        }

        return answer.stream()
                .sorted()
                .mapToInt(i -> i)
                .toArray();
    }
}
