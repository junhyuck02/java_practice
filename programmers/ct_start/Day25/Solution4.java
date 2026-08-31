package programmers.ct_start.Day25;

public class Solution4 {
    public int solution(int[] common) {
        int answer = 0;
        if (common[2] - common[1] == common[1] - common[0]) {
            answer = common[common.length - 1] + (common[2] - common[1]);
        } else if (common[2] / common[1] == common[1] / common[0]) {
            answer = common[common.length - 1] * (common[2] / common[1]);
        }
        return answer;
    }
}
