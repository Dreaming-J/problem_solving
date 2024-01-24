package programmers.코딩테스트_입문.정답률_85이상_89이하;

import java.util.*;
import java.util.stream.*;

public class 배열의_유사도 {
    public int solution(String[] s1, String[] s2) {
        return (int) Stream.of(s1)
                .filter(word -> Arrays.asList(s2).contains(word))
                .count();
    }
}
