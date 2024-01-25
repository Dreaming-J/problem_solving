package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class A로_B_만들기 {
    public int solution(String before, String after) {
        for (int i = 0; i < before.length(); i++) {
            String temp = String.valueOf(before.charAt(i));
            if (after.contains(temp)) after = after.replaceFirst(temp, "");
        }

        if (after.isEmpty()) return 1;
        return 0;
    }
}
