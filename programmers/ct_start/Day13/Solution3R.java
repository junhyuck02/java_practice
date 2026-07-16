package programmers.ct_start.Day13;

public class Solution3R {
    public String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            String current = String.valueOf(my_string.charAt(i));

            if (!answer.contains(current)) {
                answer += current;
            }
        }
        return answer;
    }
}