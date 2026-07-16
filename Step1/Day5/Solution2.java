package Step1.Day5;

public class Solution2 {
    public int[] solution(int money) {
        int[] answer = {};
        int count = money / 5500;
        int change = money % 5500;
        answer = new int[2];
        answer[0] = count;
        answer[1] = change;
        return answer;
    }
}
