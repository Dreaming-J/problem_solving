import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem1330 {

    public static void main(String[] args) {
        String answer = "";
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Stream.of(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        if (input.get(0) > input.get(1)) {
            answer = ">";
        }
        if (input.get(0) < input.get(1)) {
            answer = "<";
        }
        if (Objects.equals(input.get(0), input.get(1))) {
            answer = "==";
        }

        System.out.println(answer);
    }
}