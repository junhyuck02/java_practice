package programmers.ct_start.Day23;

import java.util.Arrays;

public class Solution1 {
    public int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist).boxed().sorted((a, b) -> {
            int distA = Math.abs(a - n);
            int distB = Math.abs(b - n);
            if (distA != distB) {
                return distA - distB;
            }
            return b - a;
        }).mapToInt(Integer::intValue).toArray();
    }
    // 이해 못함
}
