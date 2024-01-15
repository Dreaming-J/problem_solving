package programmers.코딩테스트_입문.정답률_90대;

public class 옷가게_할인_받기 {
    public int solution(int price) {
        if (price >= 500_000) price *= 0.8;
        else if (price >= 300_000) price *= 0.9;
        else if (price >= 100_000) price *= 0.95;
        return price;
    }
}
