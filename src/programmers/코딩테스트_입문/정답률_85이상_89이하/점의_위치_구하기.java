package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class 점의_위치_구하기 {
    public int solution(int[] dot) {
        if (dot[0] > 0) {
            if (dot[1] > 0) return 1;
            else return 4;
        }
        if (dot[1] > 0) return 2;
        return 3;
    }
}
