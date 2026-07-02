package SelfStudy.Day14;

import java.util.Scanner;

public class Solution3 {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] arr = cipher.split("");
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % code == 0) {
                answer += arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("암호화된 문자열을 입력하세요: ");
            String cipher = scanner.nextLine();
            if (cipher.equals("exit")) 
                break;
            
            if (cipher.length() < 1 || cipher.length() > 1000) {
                System.out.println("오류: 문자열 길이는 1~1000 사이여야 합니다.");
                continue;
            }

            // 소문자 또는 공백으로만 이루어져야함
            if (!cipher.matches("^[a-z ]+$")) {
                System.out.println("소문자와 공백만 입력 가능합니다.");
                continue;
            }

            System.out.print("해독할 배수(code)를 입력하세요: ");
            int code = scanner.nextInt();
            scanner.nextLine(); 

            if (code < 1 || code > cipher.length()) {
                System.out.println("code는 1부터 " + cipher.length() + " 사이여야 합니다.");
                continue;
            }

            Solution3 sol = new Solution3();
            System.out.println("해독된 암호: " + sol.solution(cipher, code));
        }
        scanner.close();
    }
}