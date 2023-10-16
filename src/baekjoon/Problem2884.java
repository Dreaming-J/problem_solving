package baekjoon;

import java.util.Scanner;

public class Problem2884 {

    public static void main(String[] args) {
        int answer_H = 0;
        int answer_M = 0;

        Scanner scanner = new Scanner(System.in);
        int input_H = scanner.nextInt();
        int input_M = scanner.nextInt();

        if (input_H == 0) input_H = 24;
        int totalMinute = input_H * 60 + input_M - 45;

        answer_H = totalMinute / 60;
        answer_M = totalMinute % 60;
        if (answer_H >= 24) answer_H -= 24;

        System.out.println(answer_H + " " + answer_M);
    }
}
