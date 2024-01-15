package programmers.코딩테스트_입문.정답률_90대;

public class 아이스_아메리카노 {
    public int[] solution(int money) {
        int[] answer = {money / 5_500, money % 5_500};
        return answer;
    }
}
