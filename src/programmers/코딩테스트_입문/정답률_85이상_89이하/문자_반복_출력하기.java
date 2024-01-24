package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class 문자_반복_출력하기 {
    public String solution(String my_string, int n) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}
