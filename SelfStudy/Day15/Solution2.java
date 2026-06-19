package SelfStudy.Day15;

import java.util.Scanner;

public class Solution2 {
    public String solution(String my_string, int num1, int num2) {
        String answer = "", temp = "";
        String[] arr = my_string.split("");
        temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
        answer = String.join("", arr);
        return answer;
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        Scanner scanner = new Scanner(System.in);
        String result = "";

        while (true) {
            System.out.print("문자열을 입력하세요: ");
            String str = scanner.nextLine();

            if (str.length() < 2 || str.length() > 99 || !str.matches("[a-z ]+")) {
                System.out.println("다시 입력하세요.");
                continue;
            }
            System.out.print("숫자 두개를 입력하세요.");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            scanner.nextLine();
            if (num1 == num2 || num1 < 0 || num2 < 0 || num1 >= str.length() || num2 >= str.length()) {
                System.out.println("다시 입력하세요.");
                continue;
            }
            result = sol.solution(str, num1, num2);
            System.out.println("결과: " + result);
            scanner.close();
            break;
        }

    }
}
