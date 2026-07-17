package programmers.ct_start.Day20;

public class Solution4 {
    public String solution(String polynomial) {
        String answer = "";
        int result = 0;
        String[] arr = polynomial.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("x")) {

            } else {
                result += Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
}
