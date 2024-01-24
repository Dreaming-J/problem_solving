package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class 인덱스_바꾸기 {
    public String solution(String my_string, int num1, int num2) {
        String[] answer = my_string.split("");

        String temp = answer[num1];
        answer[num1] = answer[num2];
        answer[num2] = temp;

        return String.join("", answer);
    }
}
