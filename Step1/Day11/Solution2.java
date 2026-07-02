package Step1.Day11;

import java.util.Scanner;

public class Solution2 {
    public int solution(int n) {
        int kcount = 0;

        for (int num = 1; num <= n; num++) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                kcount++;
            }
        }
        return kcount;
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int n = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("n을 입력하세요: ");
            n = scanner.nextInt();
            if (n >= 1 && n <= 100) {
                int result = sol.solution(n);
                System.out.println(result);
                break;
            } else {
                System.out.println("다시 입력하세요,");
            }
        }
        scanner.close();
    }

}
