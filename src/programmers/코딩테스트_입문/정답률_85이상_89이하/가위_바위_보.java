package programmers.코딩테스트_입문.정답률_85이상_89이하;

import java.util.HashMap;
import java.util.Map;

public class 가위_바위_보 {
    public String solution(String rsp) {
        String answer = "";
        Map<String, String> map = new HashMap<>();
        map.put("2", "0");
        map.put("0", "5");
        map.put("5", "2");

        for (String letter : rsp.split("")) {
            answer += map.get(letter);
        }

        return answer;
    }
}
