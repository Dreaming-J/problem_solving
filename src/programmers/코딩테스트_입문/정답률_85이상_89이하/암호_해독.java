package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class 암호_해독 {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();

        for (int i = code - 1; i < cipher.length(); i += code) {
            answer.append(cipher.charAt(i));
        }

        return answer.toString();
    }
}
