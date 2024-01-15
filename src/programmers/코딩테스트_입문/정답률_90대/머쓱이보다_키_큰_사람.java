package programmers.코딩테스트_입문.정답률_90대;

public class 머쓱이보다_키_큰_사람 {
    public int solution(int[] array, int height) {
        int answer = 0;

        for (int h : array) {
            if (height < h) answer++;
        }

        return answer;
    }
}
