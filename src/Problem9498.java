import java.util.Scanner;

public class Problem9498 {

    public static void main(String[] args) {
        String answer = "";
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.next());

        if (input >= 90) {
            answer = "A";
        }
        else if (input >= 80) {
            answer = "B";
        }
        else if (input >= 70) {
            answer = "C";
        }
        else if (input >= 60) {
            answer = "D";
        }
        else {
            answer = "F";
        }

        System.out.println(answer);
    }
}