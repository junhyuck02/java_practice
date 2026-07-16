package programmers.ct_start.Day4;

public class Solution2R { // 최소공배수를 구하고 6으로 나누기
    public int solution(int n) {
        int a = n;
        int b = 6;

        while (b != 0) { // 최대공약수 a
            int r = a % b;
            a = b;
            b = r;
        }
        return (n * 6 / a) / 6; // n / a 와 같음
        /*
         * while (true) {
         * if (6 * answer % n == 0) {
         * return answer;
         * }
         * answer++;
         * }
         */
    }

}
