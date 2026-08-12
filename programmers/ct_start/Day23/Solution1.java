package programmers.ct_start.Day23;

public class Solution1 {
    public int[] solution(int[] numlist, int n) {
        int[] answer = {};
        int[] check = new int[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            check[i] = Math.abs(numlist[i] - n);
        }
        return answer;
    }
}
