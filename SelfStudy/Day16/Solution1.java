package SelfStudy.Day16;

public class Solution1 {
    public int solution(String message) {
        int answer = 0;
        String[] arr = message.split("");
        for (int i = 0; i < arr.length; i++) {
            answer++;
        }
        return answer * 2;
        // 초간단: eturn message.length()*2;
    }
}
