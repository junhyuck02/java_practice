package programmers.ct_start.Day3;

import java.util.Arrays;

public class Solution2 {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        answer = array[array.length / 2];
        return answer;
    }
}