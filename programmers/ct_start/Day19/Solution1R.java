package programmers.ct_start.Day19;

public class Solution1R {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String str = String.valueOf(array[i]);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == '7') {
                    answer++;
                }
            }
        }
        return answer;
    }
}
