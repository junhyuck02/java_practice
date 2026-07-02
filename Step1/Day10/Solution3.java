package Step1.Day10;

import java.util.Scanner;

public class Solution3 {
    public int solution(int[] numbers, int k) {
        int index = 0;

        for (int i = 0; i < k - 1; i++) {
            index = (index + 2) % numbers.length;
        }
        return numbers[index];
    }

    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        Scanner scanner = new Scanner(System.in);
        int length = 0, k = 0, result = 0;
        int[] numbers = {};

        while (true) {
            System.out.print("numbers의 길이를 입력하세요: ");
            length = scanner.nextInt();
            if (length <= 2 || length >= 100) {
                System.out.println("다시 입력하세요");
                continue;
            } else {
                numbers = new int[length];
                for (int i = 0; i < length; i++) {
                    numbers[i] = i + 1;
                }
                System.out.print("k를 입력하세요: ");
                k = scanner.nextInt();
                if (k > 0 && k < 1000) {
                    result = sol.solution(numbers, k);
                    System.out.println("결과: " + result);
                    break;
                } else {
                    System.out.println("다시 입력하세요");
                }
            }
        }
        scanner.close();
    }

}
