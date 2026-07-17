package programmers.ct_start.Day20;

import java.util.Arrays;

public class Solution3R {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int size = numbers.length;
        return Math.max(numbers[0] * numbers[1], numbers[size - 2] * numbers[size - 1]);
    }
}
