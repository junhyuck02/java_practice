package SelfStudy.Day11;

import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer  = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution3 sol = new Solution3();
        int len = 0;

        while (true) {
            System.out.print("배열의 길이를 입력하세요: ");
            len = scanner.nextInt();
            if (len >= 2 && len <= 100) {
                break;
            } else {
                System.out.println("배열의 길이는 2에서 100 사이여야 합니다");
            }
        }

        int[] numbers = new int[len];

        System.out.println(len + "개의 숫자를 입력하세요:");
        for (int i = 0; i < len; i++) {
            while (true) {
                int val = scanner.nextInt();
                if (val >= 0 && val <= 10000) {
                    numbers[i] = val;
                    break;
                } else {
                    System.out.println("숫자는 0에서 10,000 사이여야 합니다");
                }
            }
        }

        int result = sol.solution(numbers);
        System.out.println("두 수의 곱의 최댓값: " + result);

        scanner.close();
    }
}
