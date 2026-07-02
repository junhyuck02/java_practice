package SelfStudy.Day14;

import java.util.Scanner;

public class Solution4 {
    public String solution(String my_string) {
        char[] chars = my_string.toCharArray();
        for(int i = 0; i < chars.length; i++){
            char c = chars[i];
            if (Character.isUpperCase(c)) { // isUpperCase !! 확인하는 부분
                chars[i] = Character.toLowerCase(c); // 대문자면 소문자로
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c); // 소문자면 대문자로
            }
        }
        return new String(chars); // char배열을 다시 문자열 객체로 변환해서 반환

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution4 sol = new Solution4();

        while (true) {
            System.out.print("문자열 입력: ");
            String input = scanner.nextLine();

            if (input.equals("exit")) 
                break;

            if (input.length() < 1 || input.length() > 1000) {
                System.out.println("다시 입력하세요.");
                continue;
            }

            // 영어 대문자와 소문자로만 이루어져 있는지 확인
            if (!input.matches("^[a-zA-Z]+$")) {
                System.out.println("영어 대문자와 소문자만 입력 가능합니다.");
                continue;
            }

            String result = sol.solution(input);
            System.out.println("변환된 문자열: " + result);
        }
        
        scanner.close();
    }
}
