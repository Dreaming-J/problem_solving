package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class 의상 {
    public int solution(String[][] clothes) {
//        다른 사람 풀이
//        return Arrays.stream(clothes)
//                .collect(groupingBy(cloth -> cloth[1], mapping(cloth -> cloth[0], counting())))
//                .values()
//                .stream()
//                .reduce(1L, (x, y) -> x * (y + 1))
//                .intValue() - 1;

//        개량
//        return Arrays.stream(clothes)
//                .collect(groupingBy(cloth -> cloth[1], counting()))
//                .values()
//                .stream()
//                .reduce(1L, (x, y) -> x * (y + 1))
//                .intValue() - 1;


        int answer = 1;
        HashMap<String, Integer> hm = new HashMap<>();

        for (String[] cloth : clothes) hm.put(cloth[1], hm.getOrDefault(cloth[1], 1) + 1);
        for (int num : hm.values()) answer *= num;

        return answer - 1;
    }

    public static void main(String[] args) {
        의상 instance = new 의상();
        String[][][] datas = {{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}, {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}};
        Arrays.stream(datas)
                        .forEach(data ->
                                System.out.println(instance.solution(data)));
    }
}
