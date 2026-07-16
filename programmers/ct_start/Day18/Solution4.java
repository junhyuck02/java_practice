package programmers.ct_start.Day18;

import java.util.Arrays;

public class Solution4 {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.split("");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].toLowerCase();
        }
        Arrays.sort(arr);
        answer = String.join("", arr);
        return answer;
    }
}
