package programmers.코딩테스트_입문.정답률_85이상_89이하;

public class 배열_두_배_만들기 {
    public int[] solution(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }

        return numbers;
    }
}
