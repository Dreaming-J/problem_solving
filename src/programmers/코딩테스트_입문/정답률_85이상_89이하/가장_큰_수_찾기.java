package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class 가장_큰_수_찾기 {
    public int[] solution(int[] array) {
        int[] answer = {array[0], 0};

        for (int i = 1; i < array.length; i++) {
            if (array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }
}
