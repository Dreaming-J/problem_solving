package programmers.코딩테스트_고득점_Kit.해시;

import java.util.Arrays;

public class 전화번호_목록 {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        전화번호_목록 instance = new 전화번호_목록();
        String[][] datas = {{"119", "97674223", "1195524421"}, {"123","456","789"}, {"12","123","1235","567","88"}};
        Arrays.stream(datas)
                        .forEach(data ->
                                System.out.println(instance.solution(data)));
    }
}
