package Step1.Day15;

import java.util.Arrays;
import java.util.Scanner;

public class Solution4 {
    public int[] solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        int[] answer = new int[count];

        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[index++] = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution4 sol = new Solution4();
        while (true) {
            System.out.print("숫자를 입력하세오: ");
            int num = scanner.nextInt();
            scanner.nextLine();
            if (num < 1 || num > 10000) {
                System.out.println("다시 입력하세요.");
                continue;
            }
            int[] result = sol.solution(num);
            System.out.println(Arrays.toString(result));
            scanner.close();
            break;
        }
    }
}
