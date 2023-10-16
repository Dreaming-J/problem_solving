package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Problem25192 {

    public static void main(String[] args) throws IOException {
        int answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        HashSet<String> enter = new HashSet<>();
        String input;

        for (int i = 0; i < num; i++) {
            input = br.readLine();

            if (input.equals("ENTER")) {
                enter = new HashSet<>();
                continue;
            }
            if (!enter.contains(input)) {
                enter.add(input);
                answer++;
            }
        }

        System.out.println(answer);
    }
}
