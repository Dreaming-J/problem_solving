package programmers.코딩테스트_고득점_Kit.해시;

import java.util.Arrays;
import java.util.Objects;

public class 완주하지_못한_선수 {
    public String solution(String[] participant, String[] completion) {
//        다른 사람 풀이
//        String answer = "";
//        HashMap<String, Integer> hm = new HashMap<>();
//
//        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
//        for (String player : completion) hm.put(player, hm.get(player) - 1);
//
//        for (String key : hm.keySet()) {
//            if (hm.get(key) == 1) answer = key;
//        }
//
//        return answer;

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;
        for (i = 0; i < completion.length; i++) {
            if (!Objects.equals(participant[i], completion[i])) return participant[i];
        }
        return participant[i];
    }

    public static void main(String[] args) {
        완주하지_못한_선수 instance = new 완주하지_못한_선수();
        String[][] participant = {{"leo", "kiki", "eden"}, {"marina", "josipa", "nikola", "vinko", "filipa"}, {"mislav", "stanko", "mislav", "ana"}};
        String[][] completion = {{"eden", "kiki"}, {"josipa", "filipa", "marina", "nikola"}, {"stanko", "ana", "mislav"}};
        System.out.println(instance.solution(participant[0], completion[0]));
        System.out.println(instance.solution(participant[1], completion[1]));
        System.out.println(instance.solution(participant[2], completion[2]));
    }
}
