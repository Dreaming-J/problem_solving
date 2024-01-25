package programmers.코딩테스트_입문.정답률_85이상_89이하;

import java.math.BigInteger;

public class 피자_나눠_먹기_2 {
    public int solution(int n) {
        int gcd = BigInteger.valueOf(n)
                .gcd(BigInteger.valueOf(6))
                .intValue();

        return n / gcd;
    }
}
