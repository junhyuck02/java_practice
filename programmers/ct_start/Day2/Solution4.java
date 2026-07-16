package programmers.ct_start.Day2;

public class Solution4 {

    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }

}
