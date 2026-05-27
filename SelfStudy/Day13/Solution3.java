package SelfStudy.Day13;

import java.util.Scanner;

public class Solution3 {
    public String solution(String my_string) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            String current = String.valueOf(my_string.charAt(i));
            
            if (!answer.contains(current)) {
                answer += current;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution3 sol = new Solution3();
        String input = "";

        while (true) {
            System.out.print("문자열을 입력하세요:");
            input = scanner.nextLine();

            int len = input.length();

            if (len < 1 || len > 110) {
                System.out.println("다시 입력하세요.");
                continue;
            }

            if (!input.matches("^[a-zA-Z ]*$")) {
                System.out.println("영문 대소문자와 공백 외의 문자는 입력할 수 없습니다.");
                continue;
            }

            break;
        }

        String result = sol.solution(input);
        System.out.println("입력한 문자열: \"" + input + "\"");
        System.out.println("중복 제거 결과: \"" + result + "\"");

        scanner.close();
    }
}