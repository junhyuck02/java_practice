package programmers.ct_start.Day21;

public class Solution3 {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        answer = (max + min - 1) - (max - min + 1) + 1;

        return answer;
    }
}
