package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class 특정_문자_제거하기 {
    public String solution(String my_string, String letter) {
        return my_string.replaceAll(letter, "");
    }
}
