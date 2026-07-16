package programmers.ct_start.Day14;

public class Solution1R {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int minDiff = Math.abs(array[0] - n); // 첫번째 인덱스로 설정

        for (int i = 1; i < array.length; i++) {
            int diff = Math.abs(array[i] - n);

            // 거리는 더 가깝고 같으면 더 작은 수로
            if (diff < minDiff || (diff == minDiff && array[i] < answer)) {
                minDiff = diff;
                answer = array[i];
            }
        }
        return answer;
    }
}
