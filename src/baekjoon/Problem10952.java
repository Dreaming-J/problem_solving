package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem10952 {

    public static void main(String[] args) throws IOException {
        List<Integer> num;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            num = Stream.of(br.readLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            if (num.get(0) != 0 && num.get(1) != 0) {
                System.out.println(num.get(0) + num.get(1));
            }
        } while (num.get(0) != 0 && num.get(1) != 0);
    }
}
