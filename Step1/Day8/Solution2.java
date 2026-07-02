package Step1.Day8;

import java.util.Scanner;

public class Solution2 {
    public String solution(int age) {
        String result = "";
        for (char check : String.valueOf(age).toCharArray()) {
            result += (char) ('a' + (check - '0'));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution2 sol = new Solution2();

        int age = 0;
        while (true) {
            System.out.print("나이 입력: ");
            age = scanner.nextInt();
            if (age >= 1 && age <= 1000) {
                break;
            }
            System.out.println("다시 입력하세요.");
        }

        System.out.println(sol.solution(age));

        scanner.close();
    }
}