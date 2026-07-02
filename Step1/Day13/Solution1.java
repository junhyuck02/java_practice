package SelfStudy.Day13;

import java.util.Scanner;

public class Solution1 {
    public int solution(String s) {
        int answer = 0;
        String [] arr = s.split(" ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("Z")){
                answer = answer - Integer.parseInt(arr[i-1]);
            } else {
                answer = answer + Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution1 sol = new Solution1();
        String input = "";

        while (true) {
            System.out.println("문자열 s를 입력하세요 (숫자, 'Z', 공백으로 구성):");
            input = scanner.nextLine();

            int len = input.length();

            if (len < 1 || len > 200) {
                System.out.println("길이는 1에서 200 사이여야 합니다. 다시 입력해주세요.");
                continue;
            }

            // 시작과 끝 공백 검증 및 Z 시작 검증
            if (input.startsWith(" ") || input.endsWith(" ")) {
                System.out.println("문자열의 시작과 끝에는 공백이 올 수 없습니다.");
                continue;
            }
            if (input.startsWith("Z")) {
                System.out.println("문자열은 'Z'로 시작할 수 없습니다.");
                continue;
            }

            // 허용된 문자로만 구성되어 있는지 검증 (숫자, 마이너스 기호, Z, 공백)
            // ^[0-9Z -]*$ : 숫자, 대문자 Z, 마이너스(-), 공백( )만 허용
            if (!input.matches("^[0-9Z -]*$")) {
                System.out.println("숫자, 'Z', 공백 외의 문자가 포함되어 있습니다.");
                continue;
            }

            // 연속된 공백이나 연속된 Z가 있는지 검증
            if (input.contains("  ")) {
                System.out.println("연속된 공백은 허용되지 않습니다.");
                continue;
            }
            if (input.contains("Z Z")) { // 공백으로 구분되므로 "Z Z"가 연속된 Z임
                System.out.println("Z가 연속해서 나오는 경우는 없습니다.");
                continue;
            }

            break;
        }

        int result = sol.solution(input);
        System.out.println("입력한 문자열: \"" + input + "\"");
        System.out.println("최종 계산 결과: " + result);

        scanner.close();
    }
}
