package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class 배열_원소의_길이 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0 ; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}
