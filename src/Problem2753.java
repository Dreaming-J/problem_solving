import java.util.Scanner;

public class Problem2753 {

    public static void main(String[] args) {
        int answer = 0;

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.next());

        if (input % 4 == 0 && (input % 100 != 0 || input % 400 == 0)) {
            answer = 1;
        }

        System.out.println(answer);
    }
}
