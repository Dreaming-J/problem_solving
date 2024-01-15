package programmers.코딩테스트_입문.정답률_90대;

public class 짝수_홀수_개수 {
    public int[] solution(int[] num_list) {
        int[] answer = {0, 0};

        for (int num : num_list) {
            if (num % 2 == 0) answer[0]++;
            else answer[1]++;
        }

        return answer;
    }
}
