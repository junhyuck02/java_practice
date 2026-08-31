package programmers.ct_start.Day24;

public class Solution4 {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        while (i <= j) {
            str += String.valueOf(i);
            i++;
        }
        String[] arr = str.split("");
        for (int m = 0; m < arr.length; m++) {
            if (String.valueOf(k).equals(arr[m])) {
                answer++;
            }
        }
        return answer;
    }
}
