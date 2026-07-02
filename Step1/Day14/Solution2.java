package Step1.Day14;

import java.util.Scanner;

public class Solution2 {
    public int solution(int order) {
        String num = String.valueOf(order);
        // String str = order+""; 이렇게 해서도 바꿀수 있음
        int count = 0;
        String[] arr = num.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("3") || arr[i].equals("6") || arr[i].equals("9")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("숫자를 입력하세요: ");
            int order = scanner.nextInt();

            if (order >= 1 && order <= 1000000) {
                Solution2 sol = new Solution2();
                int result = sol.solution(order);
                System.out.println("결과: " + result);
                break;
            } else {
                System.out.println("다시 입력하세요.");
            }
        }

        scanner.close();
    }
}
