package programmers.ct_start.Day15;

import java.util.Scanner;

public class Solution1R {
    public long solution(String numbers) {
        String number = numbers.replaceAll("zero", "0").replaceAll("one", "1")
                .replaceAll("two", "2").replaceAll("three", "3")
                .replaceAll("four", "4").replaceAll("five", "5")
                .replaceAll("six", "6").replaceAll("seven", "7")
                .replaceAll("eight", "8").replaceAll("nine", "9");

        return Long.parseLong(number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution1R sol = new Solution1R();

        while (true) {
            System.out.print("문자열 입력 (종료: exit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit"))
                break;

            if (input.length() < 1 || input.length() > 50) {
                System.out.println("길이는 1이상 50이하이어야 합니다.");
                continue;
            }
            if (!input.matches("(zero|one|two|three|four|five|six|seven|eight|nine)+")) {
                System.out.println("오류: 소문자 영단어(zero~nine)만 포함해야 합니다.");
                continue;
            }
            if (input.startsWith("zero")) {
                System.out.println("zero는 맨 앞에 올 수 없습니다.");
                continue;
            }

            long result = sol.solution(input);
            System.out.println("결과: " + result);
        }
        scanner.close();
    }
}