package programmers.코딩테스트_입문;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class 평행 {

    public int solution(int[][] dots) {
        int[][] index = {{0, 1, 2, 3}, {0, 2, 1, 3}, {0, 3, 1, 2}};

        for (int[] i : index) {
            double slope1 = (double) (dots[i[0]][1] - dots[i[1]][1]) / (dots[i[0]][0] - dots[i[1]][0]);
            double slope2 = (double) (dots[i[2]][1] - dots[i[3]][1]) / (dots[i[2]][0] - dots[i[3]][0]);

            if (slope1 == slope2) return 1;
        }

        return 0;
    }
}
