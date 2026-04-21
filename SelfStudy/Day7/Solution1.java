package SelfStudy.Day7;

import java.util.Scanner;

public class Solution1 {
    public String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution1 sol = new Solution1();

        String my_string = "";
        String letter = "";

        while (true) {
            System.out.print("문자열을 입력하세요: ");
            my_string = scanner.nextLine();

            if (my_string.length() >= 1 && my_string.length() <= 100) {
                break;
            } else {
                System.out.println("입력 범위를 벗어났습니다. 다시 입력하세요.");
                continue;
            }
        }

        while (true) {
            System.out.print("제거할 문자 하나를 입력하세요: ");
            letter = scanner.nextLine();

            if (letter.length() == 1) {
                break; // 통과!
            } else {
                System.out.println("다시 입력하세요.");
                continue;
            }
        }

        String result = sol.solution(my_string, letter);
        System.out.println("결과: " + result);

        scanner.close();
    }
}