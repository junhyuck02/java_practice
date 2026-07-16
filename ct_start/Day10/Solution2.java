package Step1.Day10;

public class Solution2 {
    public int[][] solution(int[] num_list, int n) {
        int temp = num_list.length / n;
        int[][] answer = new int[temp][n];
        int k = 0;
        for (int i = 0; i < temp; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[k];
                k++;
            }
        }
        return answer;
    }

}
