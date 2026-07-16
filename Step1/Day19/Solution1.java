package Step1.Day19;

public class Solution1 {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String str = String.valueOf(array[i]);
            if (str.contains("7")) {
                answer++;
            }
        }
        return answer;
    }
}
