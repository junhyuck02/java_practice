package programmers.ct_start.Day7;

public class Solution3 {
    public int solution(int n, int k) {
        int total = 0;
        total = n * 12000 + k * 2000;
        if (n >= 10) {
            return total - ((n / 10) * 2000);
        } else {
            return total;
        }
    }
}
