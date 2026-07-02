package Step1.Day8;

import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {
    public int[] solution(int[] emergency) {
        int[] result = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            int rank = 1;
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[j] > emergency[i]) {
                    rank++;
                }
            }
            result[i] = rank;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution3 sol = new Solution3();
        int length = 0;

        while (true) {
            System.out.print("배열 길이 입력: ");
            length = scanner.nextInt();
            if (length >= 1 && length <= 10)
                break;
            System.out.println("다시 입력하세요.");
        }

        int[] emergency = new int[length];
        for (int i = 0; i < length; i++) {
            while (true) {
                System.out.print(i + "번째 응급도 입력: ");
                int val = scanner.nextInt();

                if (val < 1 || val > 100) {
                    System.out.println("다시 입력하세요.");
                    continue;
                }

                boolean isDuplicate = false;
                for (int j = 0; j < i; j++) {
                    if (emergency[j] == val) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (isDuplicate) {
                    System.out.println("다시 입력하세요.");
                    continue;
                }

                emergency[i] = val;
                break;
            }
        }

        int[] result = sol.solution(emergency);
        System.out.println("\n입력 배열: " + Arrays.toString(emergency));
        System.out.println("진료 순서: " + Arrays.toString(result));

        scanner.close();
    }
}
