package Step1.Day9;

import java.util.Scanner;

public class Solution3 {
    public String solution(String rsp) {
        String[] arr = rsp.split("");
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("2")) {
                arr[i] = "0";
            } else if (arr[i].equals("0")) {
                arr[i] = "5";
            } else if (arr[i].equals("5")) {
                arr[i] = "2";
            }
        }
        answer = String.join("", arr);
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution3 sol = new Solution3();

        String rsp = "";
        while (true) {
            System.out.print("rsp 입력: ");
            rsp = scanner.nextLine();

            if (rsp.length() == 0 || rsp.length() > 100) {
                System.out.println("다시 입력하세요");
                continue;
            }

            boolean isValid = true;
            for (char c : rsp.toCharArray()) {
                if (c != '0' && c != '2' && c != '5') {
                    isValid = false;
                    break;
                }
            }

            if (!isValid) {
                System.out.println("다시 입력하세요");
                continue;
            }

            break;
        }
        System.out.println("결과: " + sol.solution(rsp));
        scanner.close();
    }
}
