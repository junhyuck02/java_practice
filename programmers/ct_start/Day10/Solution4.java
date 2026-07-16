package programmers.ct_start.Day10;

public class Solution4 {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if (direction.equals("right")) {
            for (int i = 0; i < numbers.length; i++) {
                if (i == numbers.length - 1) {
                    answer[0] = numbers[i];
                    break;
                }
                answer[i + 1] = numbers[i];
            }
        } else if (direction.equals("left")) {
            answer[numbers.length - 1] = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                answer[i - 1] = numbers[i];
            }
        }
        return answer;
    }

}
