package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class 숨어있는_숫자의_덧셈_1 {
    public boolean isInteger(String letter) {
        try {
            Integer.parseInt(letter);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int solution(String my_string) {
        int answer = 0;

        for (String letter : my_string.split("")) {
            if (isInteger(letter)) answer += Integer.parseInt(letter);
        }

        return answer;
    }
}
