package programmers.ct_start.Day2;

class Solution1 {
    public int solution(int num1, int num2) {
        double result = (double) num1 / (double) num2;
        int answer = (int) (result * 1000);
        return answer;
    }
}
