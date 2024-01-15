package programmers.코딩테스트_입문;

public class 겹치는_선분의_길이 {
    public int solution(int[][] lines) {
        int answer = 0;

        int[] dots = new int[200];

        for (int[] line : lines) {
            for (int i = line[0]; i < line[1]; i++) {
                dots[100 + i]++;
            }
        }

        for (int dot : dots) {
            if (dot > 1) {
                answer++;
            }
        }

        return answer;
    }
}
