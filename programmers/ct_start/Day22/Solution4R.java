package programmers.ct_start.Day22;

public class Solution4R {
    public int solution(int a, int b) {
        int answer = 0;
        int gcd = gcd(a, b);
        a /= gcd;
        b /= gcd;

        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }

        if (b == 1) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
