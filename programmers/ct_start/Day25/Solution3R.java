package programmers.ct_start.Day25;

public class Solution3R {
    public int[] solution(int num, int total) {
        int x = (total - num * (num - 1) / 2) / num;
        // 연속된 num개의 수: x, x+1, x+2, ..., x+(num-1)
        // 합 = (x+0) + (x+1) + (x+2) + ... + (x+(num-1))
        // 다 더하면: x가 num개, 그리고 숫자들의 합
        // 합 = num*x + (0+1+2+...+(num-1)) = num*x + num*(num-1)/2
        // total = num*x + num*(num-1)/2
        int[] answer = new int[num];
        for (int i = 0; i < num; i++) {
            answer[i] = x + i;
        }
        return answer;
    }
}
