package Step1.Day3;

public class Solution4 {
    public int[] solution(int n) {
        int[] answer = {};
        int num = 1;
        if (n % 2 == 0) {
            answer = new int[n / 2];
        } else {
            answer = new int[n / 2 + 1];
        }
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num;
            num += 2;
        }
        return answer;
    }
}
