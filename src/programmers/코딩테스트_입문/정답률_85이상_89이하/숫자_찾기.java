package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class 숫자_찾기 {
    public int solution(int num, int k) {
        String temp = String.valueOf(num);

        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == Character.forDigit(k, 10)) {
                return i + 1;
            }
        }
        return -1;
    }
}
