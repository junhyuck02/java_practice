package programmers.ct_start.Day17;

public class Solution3R {
    public int solution(int n) {
        int answer = 0;
        String s = String.valueOf(n);
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }
        // while (n > 0) {
        // answer += n % 10;
        // n /= 10;
        // }
        return answer;
    }
}
