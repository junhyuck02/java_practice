package Step1.Day9;

public class Solution4R {

    public long solution(int balls, int share) {
        share = Math.min(balls - share, share);

        if (share == 0) {
            return 1;
        }

        long result = solution(balls - 1, share - 1);

        result = result * balls;
        result = result / share;

        return result;
    }
}
