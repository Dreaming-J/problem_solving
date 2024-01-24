package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class 개미_군단 {
    public int solution(int hp) {
        int answer = 0;
        int[] attack = {5, 3, 1};

        int i = 0;
        while (i < 3) {
            if (hp >= attack[i]) {
                hp -= attack[i];
                answer++;
            }
            else i++;
        }

        if (hp > 0) answer++;

        return answer;
    }
}
