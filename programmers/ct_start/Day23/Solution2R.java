package programmers.ct_start.Day23;

public class Solution2R {
    public int[] solution(int[][] score) {
        int n = score.length;

        double[] avg = new double[n];

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
            }
            avg[i] = sum / (double) score[i].length;
        }

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int rank = 1;
            // 1등은 나보다 큰사람이 0명이니까 시작을 1로
            for (int j = 0; j < n; j++) {
                if (avg[j] > avg[i])
                    rank++;
            }
            answer[i] = rank;
        }
        return answer;
    }

}
