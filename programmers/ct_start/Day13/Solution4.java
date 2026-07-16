package programmers.ct_start.Day13;

import java.util.Arrays;

public class Solution4 {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        if (sides[0] + sides[1] > sides[2]) {
            return 1;
        } else {
            return 2;
        }
    }
}
