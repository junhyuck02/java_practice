package programmers.ct_start.Day3;

public class Solution3R {
    public int solution(int[] array) {
        int answer = 0, max = 0;
        int countArr[] = new int[1000];
        for (int i = 0; i < array.length; i++) {
            countArr[array[i]]++; // array에 있는 값이 countArr의 인덱스
        }
        for (int i = 0; i < countArr.length; i++) {
            if (max < countArr[i]) {
                max = countArr[i];
                answer = i;
            } else if (max == countArr[i]) {
                answer = -1;
            }
        }
        return answer;

    }
}
