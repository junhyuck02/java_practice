package programmers.ct_start.Day23;

public class Solution3R {
    public int solution(String[] babbling) {
        int answer = 0;

        for (String word : babbling) {
            String replaced = word
                    .replace("aya", " ")
                    .replace("ye", " ")
                    .replace("woo", " ")
                    .replace("ma", " ")
                    .trim();

            if (replaced.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
