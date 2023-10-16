package programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 폰켓몬 {
    public int solution(int[] nums) {
        /* 더 깔끔한 코드
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
        */


        int answer = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet())
                .size();
        int max = nums.length / 2;

        return Integer.min(answer, max);
    }

    public static void main(String[] args) {
        폰켓몬 instance = new 폰켓몬();
        int[][] data = {{3,1,2,3}, {3,3,3,2,2,4}, {3,3,3,2,2,2}};
        System.out.println(instance.solution(data[0]));
        System.out.println(instance.solution(data[1]));
        System.out.println(instance.solution(data[2]));

    }
}
