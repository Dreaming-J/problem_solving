package programmers;

public class 정수_삼각형 {
    public int solution(int[][] triangle) {
        int answer = 0;
        int rows = triangle.length;
        int columns = triangle[triangle.length - 1].length;
        int[][] dp_triangle = new int[rows][columns];

        dp_triangle[0][0] = triangle[0][0];
        for (int row = 0; row < rows - 1; row++) {
            int cell_cnt = row + 1;
            for (int column = 0; column < cell_cnt; column++) {
                if (dp_triangle[row + 1][column] < dp_triangle[row][column] + triangle[row + 1][column]) {
                    dp_triangle[row + 1][column] = dp_triangle[row][column] + triangle[row + 1][column];
                }
                if (dp_triangle[row + 1][column + 1] < dp_triangle[row][column] + triangle[row + 1][column + 1]) {
                    dp_triangle[row + 1][column + 1] = dp_triangle[row][column] + triangle[row + 1][column + 1];
                }
            }
        }

        for (int i = 0; i < columns; i++) {
            if (answer < dp_triangle[rows - 1][i]) {
                answer = dp_triangle[rows - 1][i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        정수_삼각형 instance = new 정수_삼각형();
        int[][] data = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        System.out.println(instance.solution(data));

    }
}