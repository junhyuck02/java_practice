package Step1.Day8;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution sol = new Solution();

        int length = 0;
        while (true) {
            System.out.print("배열의 길이를 입력하세요: ");
            length = scanner.nextInt();
            if (length >= 2 && length <= 30) {
                break;
            } else {
                System.out.println("다시 입력하세요.");
            }
        }

        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            while (true) {
                System.out.print(i + "번째 원소 입력: ");
                int val = scanner.nextInt();
                if (val >= 0 && val <= 1000) {
                    numbers[i] = val;
                    break;
                } else {
                    System.out.println("다시 입력하세요.");
                }
            }
        }

        int num1 = 0, num2 = 0;
        while (true) {
            System.out.print("인덱스 1 입력 : ");
            num1 = scanner.nextInt();
            System.out.print("인덱스 2 입력 : ");
            num2 = scanner.nextInt();
            if (num1 >= 0 && num1 < num2 && num2 < length) {
                break;
            } else {
                System.out.println("다시 입력하세요.");
            }
        }

        int[] result = sol.solution(numbers, num1, num2);
        System.out.println("입력 배열: " + Arrays.toString(numbers));
        System.out.println("결과 배열: " + Arrays.toString(result));

        scanner.close();
    }
}