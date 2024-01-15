package programmers.코딩테스트_입문.정답률_60대;

import java.util.List;

public class OX퀴즈 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        List<String> quizs = List.of(quiz);
        for (int i = 0; i < quiz.length; i++) {
            String[] num = quizs.get(i).split(" ");
            int X = Integer.parseInt(num[0]);
            int Y = Integer.parseInt(num[2]);
            int Z = Integer.parseInt(num[4]);

            if (num[1].equals("+") && X + Y == Z) answer[i] = "O";
            else if (num[1].equals("-") && X - Y == Z) answer[i] = "O";
            else answer[i] = "X";
        }

        return answer;
    }
}
