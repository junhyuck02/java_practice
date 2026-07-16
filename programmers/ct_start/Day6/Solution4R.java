package programmers.ct_start.Day6;

public class Solution4R {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] arr = my_string.split("");
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            answer += s.repeat(n);
        }
        return answer;
    }
}
