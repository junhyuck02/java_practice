package Step1.Day12;

import java.util.Scanner;

public class Solution3R {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split("");
        String nums = "";

        for (String s : arr) {
            if (Character.isDigit(s.charAt(0))) {
                nums += s;
            }
        }
        String[] arr2 = nums.split("");
        for (int i = 0; i < arr2.length; i++) {
            answer += Integer.parseInt(arr2[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution3R sol = new Solution3R();
        String input = "";

        while (true) {
            System.out.print("문자열을 입력하세요:");
            input = scanner.nextLine();

            int len = input.length();

            // ^[a-zA-Z0-9]*$ -> 시작부터 끝까지 영어 대소문자랑 숫자만 허용
            if (len >= 1 && len <= 1000 && input.matches("^[a-zA-Z0-9]*$")) {
                break;
            } else {
                System.out.println("다시 입력해주세요!");
                if (len < 1 || len > 1000) {
                    System.out.println("(사유: 길이 제한 위반)");
                } else {
                    System.out.println("(사유: 허용되지 않은 문자 포함)");
                }
            }
        }

        int result = sol.solution(input);
        System.out.println("문자열 안의 숫자 합계: " + result);

        scanner.close();
    }
}
