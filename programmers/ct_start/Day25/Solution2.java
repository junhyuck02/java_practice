package programmers.ct_start.Day25;

public class Solution2 {
    public int solution(int M, int N) {
        int answer = 0;
        int c = M - 1;
        int k = M * (N - 1);
        answer = c + k;
        return answer;
    }
}
