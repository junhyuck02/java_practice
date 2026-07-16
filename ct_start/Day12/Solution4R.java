package Step1.Day12;

import java.util.LinkedHashSet;
import java.util.Set;

public class Solution4R {
    public int[] solution(int n) {
        int[] answer = {};
        Set<Integer> set = new LinkedHashSet<>();
        int divisor = 2;

        while (n > 1) {
            if (n % divisor == 0) {
                set.add(divisor);
                n = n / divisor;
            } else {
                divisor++;
            }
        }
        answer = new int[set.size()];
        int index = 0;
        for (int num : set) {
            answer[index++] = num;
        }

        return answer;
    }
}
