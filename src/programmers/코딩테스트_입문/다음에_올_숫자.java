package programmers.코딩테스트_입문;

public class 다음에_올_숫자 {
    public int solution(int[] common) {
        int diff = common[1] - common[0];
        boolean isDiff = true;

        for (int i = 2; i < common.length; i++) {
            if (common[i] - common[i - 1] != diff) {
                isDiff = false;
                break;
            }
        }
        if (!isDiff) {
            for (int i =1; i < common.length; i++) {
                if (common[i] != 0 && common[i - 1] != 0) {
                    diff = (int) common[i] / common[i - 1];
                    break;
                }
            }
        }

        if (isDiff) return common[common.length - 1] + diff;
        return common[common.length - 1] * diff;
    }
}
