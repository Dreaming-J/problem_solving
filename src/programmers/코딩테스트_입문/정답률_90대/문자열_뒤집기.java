package programmers.코딩테스트_입문.정답률_90대;

public class 문자열_뒤집기 {
    public String solution(String my_string) {
        String answer = "";

        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }

        return answer;
    }
}
