package baekjoon;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem2480 {

    public static void main(String[] args) {
        int answer = 0;

        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Stream.of(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int no : input) {
            int cnt = (int) input.stream()
                    .filter(x -> x == no)
                    .count();

            if (cnt == 3) {
                answer = 10000 + no * 1000;
                break;
            }

            if (cnt == 2) {
                answer = 1000 + no * 100;
                break;
            }
        }

        if (answer == 0) {
            int max_no = input.stream()
                    .max(Comparator.comparing(x -> x))
                    .get();

            answer = max_no * 100;
        }

        System.out.println(answer);
    }
}
