package Step1.Day18;

public class Solution2R {
    public int solution(int n) {
        for (int i = 1; i <= 1000; i++) {
            if ((n / i) == i && n % i == 0) {
                return 1;
            } else {
                continue;
            }
        }
        return 2;
    }
    // sqrt쓰면 간단
}
