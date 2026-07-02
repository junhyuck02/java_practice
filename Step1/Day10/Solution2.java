package Step1.Day10;

import java.util.Arrays;
import java.util.Scanner;

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

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        Scanner scanner = new Scanner(System.in);
        int length = 0, n = 0;
        int[] num_list = {};

        while (true) {
            System.out.print("배열의 길이를 입력하세요: ");
            length = scanner.nextInt();
            if (length < 0 || length > 150) {
                System.out.println("다시 입력하세요");
                continue;
            } else {
                num_list = new int[length];
            }

            System.out.print("n을 입력하세요: ");
            n = scanner.nextInt();
            if (n >= 2 && n < length && length % n == 0) {
                break;
            } else {
                System.out.println("다시 입력하세요");
            }
        }

        System.out.println("배열의 요소를 입력하세요:");
        for (int i = 0; i < length; i++) {
            num_list[i] = scanner.nextInt();
        }

        int[][] result = sol.solution(num_list, n);

        System.out.println(Arrays.deepToString(result));

        scanner.close();

    }

}
