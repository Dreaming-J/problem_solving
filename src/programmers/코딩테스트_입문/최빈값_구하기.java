package programmers.코딩테스트_입문;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class 최빈값_구하기 {
    public int solution(int[] array) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : array) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int max = freq.values()
                .stream()
                .max(Comparator.naturalOrder())
                .get();

        int count = (int) freq.values()
                .stream()
                .filter(value -> value == max)
                .count();

        if (count > 1) return -1;
        int answer = 0;
        for (int key : freq.keySet()) {
            if (freq.get(key) == max) answer = key;
        }
        return answer;
    }
}
