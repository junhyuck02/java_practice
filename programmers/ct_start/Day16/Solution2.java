package programmers.ct_start.Day16;

public class Solution2 {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
}