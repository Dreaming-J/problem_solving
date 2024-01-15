package programmers.코딩테스트_입문.정답률_90대;

public class 각도기 {
    public int solution(int angle) {
        if (angle == 180) return 4;
        else if (angle > 90) return 3;
        else if (angle == 90) return 2;
        return 1;
    }
}
