package programmers.코딩테스트_입문.정답률_85이상_89이하;

import java.util.Arrays;

public class 삼각형의_완성조건_1 {
    class Solution {
        public int solution(int[] sides) {
            int max = Arrays.stream(sides)
                    .max()
                    .getAsInt();

            int sum = Arrays.stream(sides)
                    .sum() - max;

            if (max < sum)
                return 1;
            return 2;
        }
    }
}
