package programmers.ct_start.Day17;

import java.util.ArrayList;
import java.util.List;

public class Solution2R {
    public int[] solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer.add(numlist[i]);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
        // return Arrays.stream(numList).filter(value -> value % n == 0).toArray();

    }
}
