package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class 문자열안에_문자열 {
    public int solution(String str1, String str2) {
        if (str1.contains(str2)) return 1;
        return 2;
    }
}
