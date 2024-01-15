package programmers.코딩테스트_고득점_Kit.완전탐색;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] num_2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num_3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = {0, 0, 0};
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] % 5 == (i + 1) % 5) count[0]++;
            if (answers[i] == num_2[i % num_2.length]) count[1]++;
            if (answers[i] == num_3[i % num_3.length]) count[2]++;
        }

        int max = 0;
        for (int i = 0; i < 3; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }
        for (int i = 0; i < 3; i++) {
            if (count[i] == max) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        모의고사 instance = new 모의고사();
        int[] answers = {1, 3, 2, 4, 2};
        System.out.println(Arrays.toString(instance.solution(answers)));

    }
}